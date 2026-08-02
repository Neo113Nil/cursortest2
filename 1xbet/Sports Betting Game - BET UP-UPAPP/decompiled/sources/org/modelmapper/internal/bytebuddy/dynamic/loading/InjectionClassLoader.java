package org.modelmapper.internal.bytebuddy.dynamic.loading;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import org.modelmapper.internal.bytebuddy.description.type.TypeDescription;

/* loaded from: classes4.dex */
public abstract class InjectionClassLoader extends ClassLoader {
    private final boolean sealed;

    protected abstract Map<String, Class<?>> doDefineClasses(Map<String, byte[]> map) throws ClassNotFoundException;

    protected InjectionClassLoader(ClassLoader classLoader, boolean z) {
        super(classLoader);
        this.sealed = z;
    }

    public boolean isSealed() {
        return this.sealed;
    }

    public Class<?> defineClass(String str, byte[] bArr) throws ClassNotFoundException {
        return defineClasses(Collections.singletonMap(str, bArr)).get(str);
    }

    public Map<String, Class<?>> defineClasses(Map<String, byte[]> map) throws ClassNotFoundException {
        if (this.sealed) {
            throw new IllegalStateException("Cannot inject classes into a sealed class loader");
        }
        return doDefineClasses(map);
    }

    public enum Strategy implements ClassLoadingStrategy<InjectionClassLoader> {
        INSTANCE;

        @Override // org.modelmapper.internal.bytebuddy.dynamic.loading.ClassLoadingStrategy
        public /* bridge */ /* synthetic */ Map load(InjectionClassLoader injectionClassLoader, Map map) {
            return load2(injectionClassLoader, (Map<TypeDescription, byte[]>) map);
        }

        /* renamed from: load, reason: avoid collision after fix types in other method */
        public Map<TypeDescription, Class<?>> load2(InjectionClassLoader injectionClassLoader, Map<TypeDescription, byte[]> map) {
            if (injectionClassLoader == null) {
                throw new IllegalArgumentException("Cannot add types to bootstrap class loader: " + map);
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            HashMap hashMap = new HashMap();
            for (Map.Entry<TypeDescription, byte[]> entry : map.entrySet()) {
                linkedHashMap.put(entry.getKey().getName(), entry.getValue());
                hashMap.put(entry.getKey().getName(), entry.getKey());
            }
            HashMap hashMap2 = new HashMap();
            try {
                for (Map.Entry<String, Class<?>> entry2 : injectionClassLoader.defineClasses(linkedHashMap).entrySet()) {
                    hashMap2.put(hashMap.get(entry2.getKey()), entry2.getValue());
                }
                return hashMap2;
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Cannot load classes: " + map, e);
            }
        }
    }
}
