package kotlinx.coroutines.internal;

/* compiled from: FastServiceLoader.kt */
@kotlin.Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0000¢\u0006\u0002\b\tJ!\u0010\n\u001a\u0004\u0018\u00010\b2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\f2\u0006\u0010\r\u001a\u00020\u0005H\u0082\bJ*\u0010\u000e\u001a\b\u0012\u0004\u0012\u0002H\u000f0\u0007\"\u0004\b\u0000\u0010\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u0002H\u000f0\f2\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J/\u0010\u0013\u001a\b\u0012\u0004\u0012\u0002H\u000f0\u0007\"\u0004\b\u0000\u0010\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u0002H\u000f0\f2\u0006\u0010\u0011\u001a\u00020\u0012H\u0000¢\u0006\u0002\b\u0014J1\u0010\u0015\u001a\u0002H\u000f\"\u0004\b\u0000\u0010\u000f2\u0006\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u00122\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u0002H\u000f0\fH\u0002¢\u0006\u0002\u0010\u0017J\u0016\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00050\u00072\u0006\u0010\u0019\u001a\u00020\u001aH\u0002J,\u0010\u001b\u001a\u0002H\u001c\"\u0004\b\u0000\u0010\u001c*\u00020\u001d2\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u0002H\u001c0\u001fH\u0082\b¢\u0006\u0002\u0010 J\u0016\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00050\u00072\u0006\u0010\"\u001a\u00020#H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006$"}, d2 = {"Lkotlinx/coroutines/internal/FastServiceLoader;", "", "<init>", "()V", "PREFIX", "", "loadMainDispatcherFactory", "", "Lkotlinx/coroutines/internal/MainDispatcherFactory;", "loadMainDispatcherFactory$kotlinx_coroutines_core", "createInstanceOf", "baseClass", "Ljava/lang/Class;", "serviceClass", "load", androidx.exifinterface.media.ExifInterface.LATITUDE_SOUTH, androidx.core.app.NotificationCompat.CATEGORY_SERVICE, "loader", "Ljava/lang/ClassLoader;", "loadProviders", "loadProviders$kotlinx_coroutines_core", "getProviderInstance", "name", "(Ljava/lang/String;Ljava/lang/ClassLoader;Ljava/lang/Class;)Ljava/lang/Object;", "parse", "url", "Ljava/net/URL;", "use", "R", "Ljava/util/jar/JarFile;", "block", "Lkotlin/Function1;", "(Ljava/util/jar/JarFile;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "parseFile", com.unity3d.ads.core.data.datasource.AndroidDynamicDeviceInfoDataSource.DIRECTORY_MODE_READ, "Ljava/io/BufferedReader;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class FastServiceLoader {
    public static final kotlinx.coroutines.internal.FastServiceLoader INSTANCE = new kotlinx.coroutines.internal.FastServiceLoader();
    private static final java.lang.String PREFIX = "META-INF/services/";

    private FastServiceLoader() {
    }

    public final java.util.List<kotlinx.coroutines.internal.MainDispatcherFactory> loadMainDispatcherFactory$kotlinx_coroutines_core() {
        kotlinx.coroutines.internal.MainDispatcherFactory mainDispatcherFactory;
        if (!kotlinx.coroutines.internal.FastServiceLoaderKt.getANDROID_DETECTED()) {
            return load(kotlinx.coroutines.internal.MainDispatcherFactory.class, kotlinx.coroutines.internal.MainDispatcherFactory.class.getClassLoader());
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
                return load(kotlinx.coroutines.internal.MainDispatcherFactory.class, kotlinx.coroutines.internal.MainDispatcherFactory.class.getClassLoader());
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
            return load(kotlinx.coroutines.internal.MainDispatcherFactory.class, kotlinx.coroutines.internal.MainDispatcherFactory.class.getClassLoader());
        }
    }

    private final kotlinx.coroutines.internal.MainDispatcherFactory createInstanceOf(java.lang.Class<kotlinx.coroutines.internal.MainDispatcherFactory> baseClass, java.lang.String serviceClass) {
        try {
            return baseClass.cast(java.lang.Class.forName(serviceClass, true, baseClass.getClassLoader()).getDeclaredConstructor(new java.lang.Class[0]).newInstance(new java.lang.Object[0]));
        } catch (java.lang.ClassNotFoundException unused) {
            return null;
        }
    }

    private final <S> java.util.List<S> load(java.lang.Class<S> service, java.lang.ClassLoader loader) {
        try {
            return loadProviders$kotlinx_coroutines_core(service, loader);
        } catch (java.lang.Throwable unused) {
            return kotlin.collections.CollectionsKt.toList(java.util.ServiceLoader.load(service, loader));
        }
    }

    public final <S> java.util.List<S> loadProviders$kotlinx_coroutines_core(java.lang.Class<S> service, java.lang.ClassLoader loader) {
        java.util.ArrayList list = java.util.Collections.list(loader.getResources(PREFIX + service.getName()));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(list, "list(...)");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            kotlin.collections.CollectionsKt.addAll(arrayList, INSTANCE.parse((java.net.URL) it.next()));
        }
        java.util.Set set = kotlin.collections.CollectionsKt.toSet(arrayList);
        if (!(!set.isEmpty())) {
            throw new java.lang.IllegalArgumentException("No providers were loaded with FastServiceLoader".toString());
        }
        java.util.Set set2 = set;
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(set2, 10));
        java.util.Iterator it2 = set2.iterator();
        while (it2.hasNext()) {
            arrayList2.add(INSTANCE.getProviderInstance((java.lang.String) it2.next(), loader, service));
        }
        return arrayList2;
    }

    private final <S> S getProviderInstance(java.lang.String name, java.lang.ClassLoader loader, java.lang.Class<S> service) {
        java.lang.Class<?> cls = java.lang.Class.forName(name, false, loader);
        if (!service.isAssignableFrom(cls)) {
            throw new java.lang.IllegalArgumentException(("Expected service of class " + service + ", but found " + cls).toString());
        }
        return service.cast(cls.getDeclaredConstructor(new java.lang.Class[0]).newInstance(new java.lang.Object[0]));
    }

    private final java.util.List<java.lang.String> parse(java.net.URL url) {
        java.io.BufferedReader bufferedReader;
        java.lang.String url2 = url.toString();
        if (kotlin.text.StringsKt.startsWith$default(url2, "jar", false, 2, (java.lang.Object) null)) {
            java.lang.String substringBefore$default = kotlin.text.StringsKt.substringBefore$default(kotlin.text.StringsKt.substringAfter$default(url2, "jar:file:", (java.lang.String) null, 2, (java.lang.Object) null), '!', (java.lang.String) null, 2, (java.lang.Object) null);
            java.lang.String substringAfter$default = kotlin.text.StringsKt.substringAfter$default(url2, "!/", (java.lang.String) null, 2, (java.lang.Object) null);
            java.util.jar.JarFile jarFile = new java.util.jar.JarFile(substringBefore$default, false);
            try {
                bufferedReader = new java.io.BufferedReader(new java.io.InputStreamReader(jarFile.getInputStream(new java.util.zip.ZipEntry(substringAfter$default)), "UTF-8"));
                try {
                    java.util.List<java.lang.String> parseFile = INSTANCE.parseFile(bufferedReader);
                    kotlin.io.CloseableKt.closeFinally(bufferedReader, null);
                    jarFile.close();
                    return parseFile;
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
            bufferedReader = new java.io.BufferedReader(new java.io.InputStreamReader(url.openStream()));
            try {
                java.util.List<java.lang.String> parseFile2 = INSTANCE.parseFile(bufferedReader);
                kotlin.io.CloseableKt.closeFinally(bufferedReader, null);
                return parseFile2;
            } catch (java.lang.Throwable th4) {
                try {
                    throw th4;
                } finally {
                }
            }
        }
    }

    private final <R> R use(java.util.jar.JarFile jarFile, kotlin.jvm.functions.Function1<? super java.util.jar.JarFile, ? extends R> function1) {
        try {
            R invoke = function1.invoke(jarFile);
            kotlin.jvm.internal.InlineMarker.finallyStart(1);
            jarFile.close();
            kotlin.jvm.internal.InlineMarker.finallyEnd(1);
            return invoke;
        } catch (java.lang.Throwable th) {
            try {
                throw th;
            } catch (java.lang.Throwable th2) {
                kotlin.jvm.internal.InlineMarker.finallyStart(1);
                try {
                    jarFile.close();
                    kotlin.jvm.internal.InlineMarker.finallyEnd(1);
                    throw th2;
                } catch (java.lang.Throwable th3) {
                    kotlin.ExceptionsKt.addSuppressed(th, th3);
                    throw th;
                }
            }
        }
    }

    private final java.util.List<java.lang.String> parseFile(java.io.BufferedReader r) {
        java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
        while (true) {
            java.lang.String readLine = r.readLine();
            if (readLine != null) {
                java.lang.String obj = kotlin.text.StringsKt.trim((java.lang.CharSequence) kotlin.text.StringsKt.substringBefore$default(readLine, "#", (java.lang.String) null, 2, (java.lang.Object) null)).toString();
                java.lang.String str = obj;
                for (int i = 0; i < str.length(); i++) {
                    char charAt = str.charAt(i);
                    if (charAt != '.' && !java.lang.Character.isJavaIdentifierPart(charAt)) {
                        throw new java.lang.IllegalArgumentException(("Illegal service provider class name: " + obj).toString());
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
