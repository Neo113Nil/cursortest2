package com.google.firebase.crashlytics.internal.metadata;

/* loaded from: classes3.dex */
class MetaDataStore {
    private static final java.lang.String KEY_USER_ID = "userId";
    private static final java.nio.charset.Charset UTF_8 = java.nio.charset.Charset.forName("UTF-8");
    private final com.google.firebase.crashlytics.internal.persistence.FileStore fileStore;

    public MetaDataStore(com.google.firebase.crashlytics.internal.persistence.FileStore fileStore) {
        this.fileStore = fileStore;
    }

    public void writeUserData(java.lang.String str, java.lang.String str2) {
        java.lang.String userIdToJson;
        java.io.BufferedWriter bufferedWriter;
        java.io.File userDataFileForSession = getUserDataFileForSession(str);
        java.io.BufferedWriter bufferedWriter2 = null;
        try {
            try {
                userIdToJson = userIdToJson(str2);
                bufferedWriter = new java.io.BufferedWriter(new java.io.OutputStreamWriter(new java.io.FileOutputStream(userDataFileForSession), UTF_8));
            } catch (java.lang.Exception e) {
                e = e;
            }
        } catch (java.lang.Throwable th) {
            th = th;
        }
        try {
            bufferedWriter.write(userIdToJson);
            bufferedWriter.flush();
            com.google.firebase.crashlytics.internal.common.CommonUtils.closeOrLog(bufferedWriter, "Failed to close user metadata file.");
        } catch (java.lang.Exception e2) {
            e = e2;
            bufferedWriter2 = bufferedWriter;
            com.google.firebase.crashlytics.internal.Logger.getLogger().w("Error serializing user metadata.", e);
            com.google.firebase.crashlytics.internal.common.CommonUtils.closeOrLog(bufferedWriter2, "Failed to close user metadata file.");
        } catch (java.lang.Throwable th2) {
            th = th2;
            bufferedWriter2 = bufferedWriter;
            com.google.firebase.crashlytics.internal.common.CommonUtils.closeOrLog(bufferedWriter2, "Failed to close user metadata file.");
            throw th;
        }
    }

    public java.lang.String readUserId(java.lang.String str) {
        java.io.FileInputStream fileInputStream;
        java.io.File userDataFileForSession = getUserDataFileForSession(str);
        java.io.FileInputStream fileInputStream2 = null;
        if (!userDataFileForSession.exists() || userDataFileForSession.length() == 0) {
            com.google.firebase.crashlytics.internal.Logger.getLogger().d("No userId set for session " + str);
            safeDeleteCorruptFile(userDataFileForSession);
            return null;
        }
        try {
            fileInputStream = new java.io.FileInputStream(userDataFileForSession);
            try {
                try {
                    java.lang.String jsonToUserId = jsonToUserId(com.google.firebase.crashlytics.internal.common.CommonUtils.streamToString(fileInputStream));
                    com.google.firebase.crashlytics.internal.Logger.getLogger().d("Loaded userId " + jsonToUserId + " for session " + str);
                    com.google.firebase.crashlytics.internal.common.CommonUtils.closeOrLog(fileInputStream, "Failed to close user metadata file.");
                    return jsonToUserId;
                } catch (java.lang.Exception e) {
                    e = e;
                    com.google.firebase.crashlytics.internal.Logger.getLogger().w("Error deserializing user metadata.", e);
                    safeDeleteCorruptFile(userDataFileForSession);
                    com.google.firebase.crashlytics.internal.common.CommonUtils.closeOrLog(fileInputStream, "Failed to close user metadata file.");
                    return null;
                }
            } catch (java.lang.Throwable th) {
                th = th;
                fileInputStream2 = fileInputStream;
                com.google.firebase.crashlytics.internal.common.CommonUtils.closeOrLog(fileInputStream2, "Failed to close user metadata file.");
                throw th;
            }
        } catch (java.lang.Exception e2) {
            e = e2;
            fileInputStream = null;
        } catch (java.lang.Throwable th2) {
            th = th2;
            com.google.firebase.crashlytics.internal.common.CommonUtils.closeOrLog(fileInputStream2, "Failed to close user metadata file.");
            throw th;
        }
    }

    public void writeKeyData(java.lang.String str, java.util.Map<java.lang.String, java.lang.String> map) {
        writeKeyData(str, map, false);
    }

    public void writeKeyData(java.lang.String str, java.util.Map<java.lang.String, java.lang.String> map, boolean z) {
        java.lang.String keysDataToJson;
        java.io.BufferedWriter bufferedWriter;
        java.io.File internalKeysFileForSession = z ? getInternalKeysFileForSession(str) : getKeysFileForSession(str);
        java.io.BufferedWriter bufferedWriter2 = null;
        try {
            try {
                keysDataToJson = keysDataToJson(map);
                bufferedWriter = new java.io.BufferedWriter(new java.io.OutputStreamWriter(new java.io.FileOutputStream(internalKeysFileForSession), UTF_8));
            } catch (java.lang.Throwable th) {
                th = th;
            }
        } catch (java.lang.Exception e) {
            e = e;
        }
        try {
            bufferedWriter.write(keysDataToJson);
            bufferedWriter.flush();
            com.google.firebase.crashlytics.internal.common.CommonUtils.closeOrLog(bufferedWriter, "Failed to close key/value metadata file.");
        } catch (java.lang.Exception e2) {
            e = e2;
            bufferedWriter2 = bufferedWriter;
            com.google.firebase.crashlytics.internal.Logger.getLogger().w("Error serializing key/value metadata.", e);
            safeDeleteCorruptFile(internalKeysFileForSession);
            com.google.firebase.crashlytics.internal.common.CommonUtils.closeOrLog(bufferedWriter2, "Failed to close key/value metadata file.");
        } catch (java.lang.Throwable th2) {
            th = th2;
            bufferedWriter2 = bufferedWriter;
            com.google.firebase.crashlytics.internal.common.CommonUtils.closeOrLog(bufferedWriter2, "Failed to close key/value metadata file.");
            throw th;
        }
    }

    public java.util.Map<java.lang.String, java.lang.String> readKeyData(java.lang.String str) {
        return readKeyData(str, false);
    }

    java.util.Map<java.lang.String, java.lang.String> readKeyData(java.lang.String str, boolean z) {
        java.io.FileInputStream fileInputStream;
        java.lang.Throwable th;
        java.lang.Exception e;
        java.io.File internalKeysFileForSession = z ? getInternalKeysFileForSession(str) : getKeysFileForSession(str);
        if (!internalKeysFileForSession.exists() || internalKeysFileForSession.length() == 0) {
            safeDeleteCorruptFile(internalKeysFileForSession, "The file has a length of zero for session: " + str);
            return java.util.Collections.emptyMap();
        }
        try {
            fileInputStream = new java.io.FileInputStream(internalKeysFileForSession);
            try {
                try {
                    java.util.Map<java.lang.String, java.lang.String> jsonToKeysData = jsonToKeysData(com.google.firebase.crashlytics.internal.common.CommonUtils.streamToString(fileInputStream));
                    com.google.firebase.crashlytics.internal.common.CommonUtils.closeOrLog(fileInputStream, "Failed to close user metadata file.");
                    return jsonToKeysData;
                } catch (java.lang.Exception e2) {
                    e = e2;
                    com.google.firebase.crashlytics.internal.Logger.getLogger().w("Error deserializing user metadata.", e);
                    safeDeleteCorruptFile(internalKeysFileForSession);
                    com.google.firebase.crashlytics.internal.common.CommonUtils.closeOrLog(fileInputStream, "Failed to close user metadata file.");
                    return java.util.Collections.emptyMap();
                }
            } catch (java.lang.Throwable th2) {
                th = th2;
                com.google.firebase.crashlytics.internal.common.CommonUtils.closeOrLog(fileInputStream, "Failed to close user metadata file.");
                throw th;
            }
        } catch (java.lang.Exception e3) {
            fileInputStream = null;
            e = e3;
        } catch (java.lang.Throwable th3) {
            fileInputStream = null;
            th = th3;
            com.google.firebase.crashlytics.internal.common.CommonUtils.closeOrLog(fileInputStream, "Failed to close user metadata file.");
            throw th;
        }
    }

    public java.util.List<com.google.firebase.crashlytics.internal.metadata.RolloutAssignment> readRolloutsState(java.lang.String str) {
        java.io.FileInputStream fileInputStream;
        java.io.File rolloutsStateForSession = getRolloutsStateForSession(str);
        if (!rolloutsStateForSession.exists() || rolloutsStateForSession.length() == 0) {
            safeDeleteCorruptFile(rolloutsStateForSession, "The file has a length of zero for session: " + str);
            return java.util.Collections.emptyList();
        }
        java.io.FileInputStream fileInputStream2 = null;
        try {
            try {
                fileInputStream = new java.io.FileInputStream(rolloutsStateForSession);
            } catch (java.lang.Exception e) {
                e = e;
            }
        } catch (java.lang.Throwable th) {
            th = th;
        }
        try {
            java.util.List<com.google.firebase.crashlytics.internal.metadata.RolloutAssignment> jsonToRolloutsState = jsonToRolloutsState(com.google.firebase.crashlytics.internal.common.CommonUtils.streamToString(fileInputStream));
            com.google.firebase.crashlytics.internal.Logger.getLogger().d("Loaded rollouts state:\n" + jsonToRolloutsState + "\nfor session " + str);
            com.google.firebase.crashlytics.internal.common.CommonUtils.closeOrLog(fileInputStream, "Failed to close rollouts state file.");
            return jsonToRolloutsState;
        } catch (java.lang.Exception e2) {
            e = e2;
            fileInputStream2 = fileInputStream;
            com.google.firebase.crashlytics.internal.Logger.getLogger().w("Error deserializing rollouts state.", e);
            safeDeleteCorruptFile(rolloutsStateForSession);
            com.google.firebase.crashlytics.internal.common.CommonUtils.closeOrLog(fileInputStream2, "Failed to close rollouts state file.");
            return java.util.Collections.emptyList();
        } catch (java.lang.Throwable th2) {
            th = th2;
            fileInputStream2 = fileInputStream;
            com.google.firebase.crashlytics.internal.common.CommonUtils.closeOrLog(fileInputStream2, "Failed to close rollouts state file.");
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    public void writeRolloutState(java.lang.String str, java.util.List<com.google.firebase.crashlytics.internal.metadata.RolloutAssignment> list) {
        java.lang.Throwable th;
        java.io.BufferedWriter bufferedWriter;
        java.lang.Exception e;
        java.io.File rolloutsStateForSession = getRolloutsStateForSession(str);
        ?? isEmpty = list.isEmpty();
        if (isEmpty != 0) {
            safeDeleteCorruptFile(rolloutsStateForSession, "Rollout state is empty for session: " + str);
            return;
        }
        try {
            try {
                java.lang.String rolloutsStateToJson = rolloutsStateToJson(list);
                bufferedWriter = new java.io.BufferedWriter(new java.io.OutputStreamWriter(new java.io.FileOutputStream(rolloutsStateForSession), UTF_8));
                try {
                    bufferedWriter.write(rolloutsStateToJson);
                    bufferedWriter.flush();
                    isEmpty = bufferedWriter;
                } catch (java.lang.Exception e2) {
                    e = e2;
                    com.google.firebase.crashlytics.internal.Logger.getLogger().w("Error serializing rollouts state.", e);
                    safeDeleteCorruptFile(rolloutsStateForSession);
                    isEmpty = bufferedWriter;
                    com.google.firebase.crashlytics.internal.common.CommonUtils.closeOrLog(isEmpty, "Failed to close rollouts state file.");
                }
            } catch (java.lang.Throwable th2) {
                th = th2;
                com.google.firebase.crashlytics.internal.common.CommonUtils.closeOrLog(isEmpty, "Failed to close rollouts state file.");
                throw th;
            }
        } catch (java.lang.Exception e3) {
            bufferedWriter = null;
            e = e3;
        } catch (java.lang.Throwable th3) {
            isEmpty = 0;
            th = th3;
            com.google.firebase.crashlytics.internal.common.CommonUtils.closeOrLog(isEmpty, "Failed to close rollouts state file.");
            throw th;
        }
        com.google.firebase.crashlytics.internal.common.CommonUtils.closeOrLog(isEmpty, "Failed to close rollouts state file.");
    }

    public java.io.File getUserDataFileForSession(java.lang.String str) {
        return this.fileStore.getSessionFile(str, com.google.firebase.crashlytics.internal.metadata.UserMetadata.USERDATA_FILENAME);
    }

    public java.io.File getKeysFileForSession(java.lang.String str) {
        return this.fileStore.getSessionFile(str, com.google.firebase.crashlytics.internal.metadata.UserMetadata.KEYDATA_FILENAME);
    }

    public java.io.File getInternalKeysFileForSession(java.lang.String str) {
        return this.fileStore.getSessionFile(str, com.google.firebase.crashlytics.internal.metadata.UserMetadata.INTERNAL_KEYDATA_FILENAME);
    }

    public java.io.File getRolloutsStateForSession(java.lang.String str) {
        return this.fileStore.getSessionFile(str, com.google.firebase.crashlytics.internal.metadata.UserMetadata.ROLLOUTS_STATE_FILENAME);
    }

    private java.lang.String jsonToUserId(java.lang.String str) throws org.json.JSONException {
        return valueOrNull(new org.json.JSONObject(str), "userId");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.firebase.crashlytics.internal.metadata.MetaDataStore$1] */
    private static java.lang.String userIdToJson(java.lang.String str) throws org.json.JSONException {
        return new org.json.JSONObject(str) { // from class: com.google.firebase.crashlytics.internal.metadata.MetaDataStore.1
            final /* synthetic */ java.lang.String val$userId;

            {
                this.val$userId = str;
                put("userId", str);
            }
        }.toString();
    }

    private static java.util.Map<java.lang.String, java.lang.String> jsonToKeysData(java.lang.String str) throws org.json.JSONException {
        org.json.JSONObject jSONObject = new org.json.JSONObject(str);
        java.util.HashMap hashMap = new java.util.HashMap();
        java.util.Iterator<java.lang.String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            java.lang.String next = keys.next();
            hashMap.put(next, valueOrNull(jSONObject, next));
        }
        return hashMap;
    }

    private static java.lang.String keysDataToJson(java.util.Map<java.lang.String, java.lang.String> map) {
        return new org.json.JSONObject(map).toString();
    }

    private static java.util.List<com.google.firebase.crashlytics.internal.metadata.RolloutAssignment> jsonToRolloutsState(java.lang.String str) throws org.json.JSONException {
        org.json.JSONArray jSONArray = new org.json.JSONObject(str).getJSONArray("rolloutsState");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            java.lang.String string = jSONArray.getString(i);
            try {
                arrayList.add(com.google.firebase.crashlytics.internal.metadata.RolloutAssignment.create(string));
            } catch (java.lang.Exception e) {
                com.google.firebase.crashlytics.internal.Logger.getLogger().w("Failed de-serializing rollouts state. " + string, e);
            }
        }
        return arrayList;
    }

    private static java.lang.String rolloutsStateToJson(java.util.List<com.google.firebase.crashlytics.internal.metadata.RolloutAssignment> list) {
        java.util.HashMap hashMap = new java.util.HashMap();
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        for (int i = 0; i < list.size(); i++) {
            try {
                jSONArray.put(new org.json.JSONObject(com.google.firebase.crashlytics.internal.metadata.RolloutAssignment.ROLLOUT_ASSIGNMENT_JSON_ENCODER.encode(list.get(i))));
            } catch (org.json.JSONException e) {
                com.google.firebase.crashlytics.internal.Logger.getLogger().w("Exception parsing rollout assignment!", e);
            }
        }
        hashMap.put("rolloutsState", jSONArray);
        return new org.json.JSONObject(hashMap).toString();
    }

    private static java.lang.String valueOrNull(org.json.JSONObject jSONObject, java.lang.String str) {
        if (jSONObject.isNull(str)) {
            return null;
        }
        return jSONObject.optString(str, null);
    }

    private static void safeDeleteCorruptFile(java.io.File file) {
        if (file.exists() && file.delete()) {
            com.google.firebase.crashlytics.internal.Logger.getLogger().i("Deleted corrupt file: " + file.getAbsolutePath());
        }
    }

    private static void safeDeleteCorruptFile(java.io.File file, java.lang.String str) {
        if (file.exists() && file.delete()) {
            com.google.firebase.crashlytics.internal.Logger.getLogger().i(java.lang.String.format("Deleted corrupt file: %s\nReason: %s", file.getAbsolutePath(), str));
        }
    }
}
