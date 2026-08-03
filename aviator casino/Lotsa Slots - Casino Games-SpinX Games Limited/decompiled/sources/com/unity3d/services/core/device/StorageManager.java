package com.unity3d.services.core.device;

/* loaded from: classes6.dex */
public class StorageManager {
    private static final java.util.Map<com.unity3d.services.core.device.StorageManager.StorageType, java.lang.String> _storageFileMap = java.util.Collections.synchronizedMap(new java.util.HashMap());
    private static final java.util.List<com.unity3d.services.core.device.Storage> _storages = java.util.Collections.synchronizedList(new java.util.ArrayList());

    public enum StorageType {
        PRIVATE,
        PUBLIC,
        MEMORY
    }

    public static boolean init(android.content.Context context) {
        java.io.File filesDir;
        if (context == null || (filesDir = context.getFilesDir()) == null) {
            return false;
        }
        addStorageLocation(com.unity3d.services.core.device.StorageManager.StorageType.PUBLIC, filesDir + com.google.firebase.sessions.settings.RemoteSettings.FORWARD_SLASH_STRING + com.unity3d.services.core.properties.SdkProperties.getLocalStorageFilePrefix() + "public-data.json");
        if (!setupStorage(com.unity3d.services.core.device.StorageManager.StorageType.PUBLIC)) {
            return false;
        }
        addStorageLocation(com.unity3d.services.core.device.StorageManager.StorageType.PRIVATE, filesDir + com.google.firebase.sessions.settings.RemoteSettings.FORWARD_SLASH_STRING + com.unity3d.services.core.properties.SdkProperties.getLocalStorageFilePrefix() + "private-data.json");
        if (setupStorage(com.unity3d.services.core.device.StorageManager.StorageType.PRIVATE)) {
            return setupStorage(com.unity3d.services.core.device.StorageManager.StorageType.MEMORY);
        }
        return false;
    }

    public static void initStorage(com.unity3d.services.core.device.StorageManager.StorageType storageType) {
        if (hasStorage(storageType)) {
            com.unity3d.services.core.device.Storage storage = getStorage(storageType);
            if (storage != null) {
                storage.initStorage();
                return;
            }
            return;
        }
        java.util.Map<com.unity3d.services.core.device.StorageManager.StorageType, java.lang.String> map = _storageFileMap;
        if (map.containsKey(storageType)) {
            com.unity3d.services.core.device.Storage storage2 = new com.unity3d.services.core.device.Storage(map.get(storageType), storageType);
            storage2.initStorage();
            _storages.add(storage2);
        } else if (storageType.equals(com.unity3d.services.core.device.StorageManager.StorageType.MEMORY)) {
            com.unity3d.services.core.device.InMemoryStorage inMemoryStorage = new com.unity3d.services.core.device.InMemoryStorage();
            inMemoryStorage.initStorage();
            _storages.add(inMemoryStorage);
        }
    }

    private static boolean setupStorage(com.unity3d.services.core.device.StorageManager.StorageType storageType) {
        if (hasStorage(storageType)) {
            return true;
        }
        initStorage(storageType);
        com.unity3d.services.core.device.Storage storage = getStorage(storageType);
        if (storage != null && !storage.storageFileExists()) {
            storage.writeStorage();
        }
        return storage != null;
    }

    public static com.unity3d.services.core.device.Storage getStorage(com.unity3d.services.core.device.StorageManager.StorageType storageType) {
        java.util.List<com.unity3d.services.core.device.Storage> list = _storages;
        if (list == null) {
            return null;
        }
        synchronized (list) {
            for (com.unity3d.services.core.device.Storage storage : list) {
                if (storage.getType().equals(storageType)) {
                    return storage;
                }
            }
            return null;
        }
    }

    public static boolean hasStorage(com.unity3d.services.core.device.StorageManager.StorageType storageType) {
        java.util.List<com.unity3d.services.core.device.Storage> list = _storages;
        if (list == null) {
            return false;
        }
        synchronized (list) {
            java.util.Iterator<com.unity3d.services.core.device.Storage> it = list.iterator();
            while (it.hasNext()) {
                if (it.next().getType().equals(storageType)) {
                    return true;
                }
            }
            return false;
        }
    }

    public static synchronized void addStorageLocation(com.unity3d.services.core.device.StorageManager.StorageType storageType, java.lang.String str) {
        synchronized (com.unity3d.services.core.device.StorageManager.class) {
            java.util.Map<com.unity3d.services.core.device.StorageManager.StorageType, java.lang.String> map = _storageFileMap;
            if (!map.containsKey(storageType)) {
                map.put(storageType, str);
            }
        }
    }

    public static synchronized void removeStorage(com.unity3d.services.core.device.StorageManager.StorageType storageType) {
        synchronized (com.unity3d.services.core.device.StorageManager.class) {
            if (getStorage(storageType) != null) {
                _storages.remove(getStorage(storageType));
            }
            java.util.Map<com.unity3d.services.core.device.StorageManager.StorageType, java.lang.String> map = _storageFileMap;
            if (map != null) {
                map.remove(storageType);
            }
        }
    }
}
