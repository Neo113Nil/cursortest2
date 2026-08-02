package kotlinx.coroutines.internal;

@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0000¢\u0006\u0004\b\u0006\u0010\u0007J1\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ1\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\b2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\t2\u0006\u0010\u0010\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\u0011\u0010\u000eJ\u001d\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00042\u0006\u0010\n\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u001d\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00042\u0006\u0010\n\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0014\u0010\u0017"}, d2 = {"Lkotlinx/coroutines/internal/FastServiceLoader;", "", "<init>", "()V", "", "Lkotlinx/coroutines/internal/MainDispatcherFactory;", "loadMainDispatcherFactory$kotlinx_coroutines_core", "()Ljava/util/List;", "S", "Ljava/lang/Class;", "p0", "Ljava/lang/ClassLoader;", "p1", "getHighResolutionOutputSizeshNQ4ISI", "(Ljava/lang/Class;Ljava/lang/ClassLoader;)Ljava/util/List;", "service", "loader", "loadProviders$kotlinx_coroutines_core", "Ljava/net/URL;", "", "getHighSpeedVideoFpsRangesFor", "(Ljava/net/URL;)Ljava/util/List;", "Ljava/io/BufferedReader;", "(Ljava/io/BufferedReader;)Ljava/util/List;"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class FastServiceLoader {
    public static final kotlinx.coroutines.internal.FastServiceLoader INSTANCE = new kotlinx.coroutines.internal.FastServiceLoader();

    private FastServiceLoader() {
    }

    public final java.util.List<kotlinx.coroutines.internal.MainDispatcherFactory> loadMainDispatcherFactory$kotlinx_coroutines_core() {
        kotlinx.coroutines.internal.MainDispatcherFactory mainDispatcherFactory;
        if (!kotlinx.coroutines.internal.FastServiceLoaderKt.getANDROID_DETECTED()) {
            return getHighResolutionOutputSizeshNQ4ISI(kotlinx.coroutines.internal.MainDispatcherFactory.class, kotlinx.coroutines.internal.MainDispatcherFactory.class.getClassLoader());
        }
        try {
            java.util.ArrayList arrayList = new java.util.ArrayList(2);
            kotlinx.coroutines.internal.MainDispatcherFactory mainDispatcherFactory2 = null;
            try {
                mainDispatcherFactory = (kotlinx.coroutines.internal.MainDispatcherFactory) kotlinx.coroutines.internal.MainDispatcherFactory.class.cast(java.lang.Class.forName("kotlinx.coroutines.android.AndroidDispatcherFactory", true, kotlinx.coroutines.internal.MainDispatcherFactory.class.getClassLoader()).getDeclaredConstructor(new java.lang.Class[0]).newInstance(new java.lang.Object[0]));
            } catch (java.lang.ClassNotFoundException unused) {
                mainDispatcherFactory = null;
            }
            if (mainDispatcherFactory == null) {
                return getHighResolutionOutputSizeshNQ4ISI(kotlinx.coroutines.internal.MainDispatcherFactory.class, kotlinx.coroutines.internal.MainDispatcherFactory.class.getClassLoader());
            }
            arrayList.add(mainDispatcherFactory);
            try {
                mainDispatcherFactory2 = (kotlinx.coroutines.internal.MainDispatcherFactory) kotlinx.coroutines.internal.MainDispatcherFactory.class.cast(java.lang.Class.forName("kotlinx.coroutines.test.internal.TestMainDispatcherFactory", true, kotlinx.coroutines.internal.MainDispatcherFactory.class.getClassLoader()).getDeclaredConstructor(new java.lang.Class[0]).newInstance(new java.lang.Object[0]));
            } catch (java.lang.ClassNotFoundException unused2) {
            }
            if (mainDispatcherFactory2 != null) {
                arrayList.add(mainDispatcherFactory2);
            }
            return arrayList;
        } catch (java.lang.Throwable unused3) {
            return getHighResolutionOutputSizeshNQ4ISI(kotlinx.coroutines.internal.MainDispatcherFactory.class, kotlinx.coroutines.internal.MainDispatcherFactory.class.getClassLoader());
        }
    }

    private final <S> java.util.List<S> getHighResolutionOutputSizeshNQ4ISI(java.lang.Class<S> p0, java.lang.ClassLoader p1) {
        try {
            return loadProviders$kotlinx_coroutines_core(p0, p1);
        } catch (java.lang.Throwable unused) {
            return kotlin.collections.CollectionsKt.toList(java.util.ServiceLoader.load(p0, p1));
        }
    }

    public final <S> java.util.List<S> loadProviders$kotlinx_coroutines_core(java.lang.Class<S> service, java.lang.ClassLoader loader) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("META-INF/services/");
        sb.append(service.getName());
        java.util.ArrayList list = java.util.Collections.list(loader.getResources(sb.toString()));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(list, "");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            kotlin.collections.CollectionsKt.addAll(arrayList, getHighSpeedVideoFpsRangesFor((java.net.URL) it.next()));
        }
        java.util.Set set = kotlin.collections.CollectionsKt.toSet(arrayList);
        if (set.isEmpty()) {
            throw new java.lang.IllegalArgumentException("No providers were loaded with FastServiceLoader".toString());
        }
        java.util.Set set2 = set;
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(set2, 10));
        java.util.Iterator it2 = set2.iterator();
        while (it2.hasNext()) {
            java.lang.Class<?> cls = java.lang.Class.forName((java.lang.String) it2.next(), false, loader);
            if (service.isAssignableFrom(cls)) {
                arrayList2.add(service.cast(cls.getDeclaredConstructor(new java.lang.Class[0]).newInstance(new java.lang.Object[0])));
            } else {
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Expected service of class ");
                sb2.append(service);
                sb2.append(", but found ");
                sb2.append(cls);
                throw new java.lang.IllegalArgumentException(sb2.toString().toString());
            }
        }
        return arrayList2;
    }

    private static java.util.List<java.lang.String> getHighSpeedVideoFpsRangesFor(java.net.URL p0) {
        java.io.BufferedReader bufferedReader;
        java.lang.String obj = p0.toString();
        if (kotlin.text.StringsKt.startsWith$default(obj, "jar", false, 2, (java.lang.Object) null)) {
            java.lang.String substringBefore$default = kotlin.text.StringsKt.substringBefore$default(kotlin.text.StringsKt.substringAfter$default(obj, "jar:file:", (java.lang.String) null, 2, (java.lang.Object) null), '!', (java.lang.String) null, 2, (java.lang.Object) null);
            java.lang.String substringAfter$default = kotlin.text.StringsKt.substringAfter$default(obj, "!/", (java.lang.String) null, 2, (java.lang.Object) null);
            java.util.jar.JarFile jarFile = new java.util.jar.JarFile(substringBefore$default, false);
            try {
                bufferedReader = new java.io.BufferedReader(new java.io.InputStreamReader(jarFile.getInputStream(new java.util.zip.ZipEntry(substringAfter$default)), "UTF-8"));
                try {
                    java.util.List<java.lang.String> highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(bufferedReader);
                    kotlin.io.CloseableKt.closeFinally(bufferedReader, null);
                    jarFile.close();
                    return highSpeedVideoFpsRangesFor;
                } finally {
                }
            } catch (java.lang.Throwable th) {
                try {
                    throw th;
                } catch (java.lang.Throwable th2) {
                    try {
                        jarFile.close();
                        throw th2;
                    } catch (java.lang.Throwable th3) {
                        kotlin.ExceptionsKt.addSuppressed(th, th3);
                        throw th;
                    }
                }
            }
        } else {
            bufferedReader = new java.io.BufferedReader(new java.io.InputStreamReader(p0.openStream()));
            try {
                java.util.List<java.lang.String> highSpeedVideoFpsRangesFor2 = getHighSpeedVideoFpsRangesFor(bufferedReader);
                kotlin.io.CloseableKt.closeFinally(bufferedReader, null);
                return highSpeedVideoFpsRangesFor2;
            } catch (java.lang.Throwable th4) {
                try {
                    throw th4;
                } finally {
                }
            }
        }
    }

    private static java.util.List<java.lang.String> getHighSpeedVideoFpsRangesFor(java.io.BufferedReader p0) {
        java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
        while (true) {
            java.lang.String readLine = p0.readLine();
            if (readLine != null) {
                java.lang.String obj = kotlin.text.StringsKt.trim(kotlin.text.StringsKt.substringBefore$default(readLine, "#", (java.lang.String) null, 2, (java.lang.Object) null)).toString();
                java.lang.String str = obj;
                for (int i = 0; i < str.length(); i++) {
                    char charAt = str.charAt(i);
                    if (charAt != '.' && !java.lang.Character.isJavaIdentifierPart(charAt)) {
                        throw new java.lang.IllegalArgumentException("Illegal service provider class name: ".concat(java.lang.String.valueOf(obj)).toString());
                    }
                }
                if (str.length() > 0) {
                    linkedHashSet.add(obj);
                }
            } else {
                return kotlin.collections.CollectionsKt.toList(linkedHashSet);
            }
        }
    }
}
