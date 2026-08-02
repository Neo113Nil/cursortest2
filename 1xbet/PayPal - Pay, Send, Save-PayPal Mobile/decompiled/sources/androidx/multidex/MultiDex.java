package androidx.multidex;

/* loaded from: classes7.dex */
public final class MultiDex {
    private static final java.util.Set<java.io.File> getHighResolutionOutputSizeshNQ4ISI = new java.util.HashSet();
    private static final boolean getHighSpeedVideoSizes = getHighResolutionOutputSizeshNQ4ISI(java.lang.System.getProperty("java.vm.version"));

    private MultiDex() {
    }

    public static void install(android.content.Context context) {
        if (getHighSpeedVideoSizes) {
            return;
        }
        try {
            android.content.pm.ApplicationInfo Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(context);
            if (Camera2StreamConfigurationMap == null) {
                return;
            }
            getHighSpeedVideoFpsRangesFor(context, new java.io.File(Camera2StreamConfigurationMap.sourceDir), new java.io.File(Camera2StreamConfigurationMap.dataDir), "secondary-dexes", "", true);
        } catch (java.lang.Exception e) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("MultiDex installation failed (");
            sb.append(e.getMessage());
            sb.append(").");
            throw new java.lang.RuntimeException(sb.toString());
        }
    }

    public static void installInstrumentation(android.content.Context context, android.content.Context context2) {
        android.content.pm.ApplicationInfo Camera2StreamConfigurationMap;
        if (getHighSpeedVideoSizes) {
            return;
        }
        try {
            android.content.pm.ApplicationInfo Camera2StreamConfigurationMap2 = Camera2StreamConfigurationMap(context);
            if (Camera2StreamConfigurationMap2 == null || (Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(context2)) == null) {
                return;
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(context.getPackageName());
            sb.append(".");
            java.lang.String obj = sb.toString();
            java.io.File file = new java.io.File(Camera2StreamConfigurationMap.dataDir);
            java.io.File file2 = new java.io.File(Camera2StreamConfigurationMap2.sourceDir);
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
            sb2.append(obj);
            sb2.append("secondary-dexes");
            getHighSpeedVideoFpsRangesFor(context2, file2, file, sb2.toString(), obj, false);
            getHighSpeedVideoFpsRangesFor(context2, new java.io.File(Camera2StreamConfigurationMap.sourceDir), file, "secondary-dexes", "", false);
        } catch (java.lang.Exception e) {
            java.lang.StringBuilder sb3 = new java.lang.StringBuilder("MultiDex installation failed (");
            sb3.append(e.getMessage());
            sb3.append(").");
            throw new java.lang.RuntimeException(sb3.toString());
        }
    }

    private static void getHighSpeedVideoFpsRangesFor(android.content.Context context, java.io.File file, java.io.File file2, java.lang.String str, java.lang.String str2, boolean z) throws java.io.IOException, java.lang.IllegalArgumentException, java.lang.IllegalAccessException, java.lang.NoSuchFieldException, java.lang.reflect.InvocationTargetException, java.lang.NoSuchMethodException, java.lang.SecurityException, java.lang.ClassNotFoundException, java.lang.InstantiationException {
        java.util.Set<java.io.File> set = getHighResolutionOutputSizeshNQ4ISI;
        synchronized (set) {
            if (set.contains(file)) {
                return;
            }
            set.add(file);
            java.lang.System.getProperty("java.vm.version");
            java.lang.ClassLoader highSpeedVideoSizes = getHighSpeedVideoSizes(context);
            if (highSpeedVideoSizes == null) {
                return;
            }
            try {
                java.io.File file3 = new java.io.File(context.getFilesDir(), "secondary-dexes");
                if (file3.isDirectory()) {
                    file3.getPath();
                    java.io.File[] listFiles = file3.listFiles();
                    if (listFiles == null) {
                        file3.getPath();
                    } else {
                        for (java.io.File file4 : listFiles) {
                            file4.getPath();
                            file4.length();
                            if (!file4.delete()) {
                                file4.getPath();
                            } else {
                                file4.getPath();
                            }
                        }
                        if (!file3.delete()) {
                            file3.getPath();
                        } else {
                            file3.getPath();
                        }
                    }
                }
            } catch (java.lang.Throwable unused) {
            }
            java.io.File highSpeedVideoSizes2 = getHighSpeedVideoSizes(context, file2, str);
            androidx.multidex.MultiDexExtractor multiDexExtractor = new androidx.multidex.MultiDexExtractor(file, highSpeedVideoSizes2);
            try {
                java.util.List<? extends java.io.File> highSpeedVideoFpsRangesFor = multiDexExtractor.getHighSpeedVideoFpsRangesFor(context, str2, false);
                try {
                    if (!highSpeedVideoFpsRangesFor.isEmpty()) {
                        androidx.multidex.MultiDex.V19.getHighSpeedVideoSizes(highSpeedVideoSizes, highSpeedVideoFpsRangesFor, highSpeedVideoSizes2);
                    }
                } catch (java.io.IOException e) {
                    if (!z) {
                        throw e;
                    }
                    java.util.List<? extends java.io.File> highSpeedVideoFpsRangesFor2 = multiDexExtractor.getHighSpeedVideoFpsRangesFor(context, str2, true);
                    if (!highSpeedVideoFpsRangesFor2.isEmpty()) {
                        androidx.multidex.MultiDex.V19.getHighSpeedVideoSizes(highSpeedVideoSizes, highSpeedVideoFpsRangesFor2, highSpeedVideoSizes2);
                    }
                }
                try {
                    e = null;
                } catch (java.io.IOException e2) {
                    e = e2;
                }
                if (e != null) {
                    throw e;
                }
            } finally {
                try {
                    multiDexExtractor.close();
                } catch (java.io.IOException unused2) {
                }
            }
        }
    }

    private static java.lang.ClassLoader getHighSpeedVideoSizes(android.content.Context context) {
        java.lang.ClassLoader classLoader;
        try {
            classLoader = context.getClassLoader();
        } catch (java.lang.RuntimeException unused) {
        }
        if (classLoader instanceof dalvik.system.BaseDexClassLoader) {
            return classLoader;
        }
        return null;
    }

    private static android.content.pm.ApplicationInfo Camera2StreamConfigurationMap(android.content.Context context) {
        try {
            return context.getApplicationInfo();
        } catch (java.lang.RuntimeException unused) {
            return null;
        }
    }

    private static boolean getHighResolutionOutputSizeshNQ4ISI(java.lang.String str) {
        if (str == null) {
            return false;
        }
        java.util.StringTokenizer stringTokenizer = new java.util.StringTokenizer(str, ".");
        java.lang.String nextToken = stringTokenizer.hasMoreTokens() ? stringTokenizer.nextToken() : null;
        java.lang.String nextToken2 = stringTokenizer.hasMoreTokens() ? stringTokenizer.nextToken() : null;
        if (nextToken == null || nextToken2 == null) {
            return false;
        }
        try {
            int parseInt = java.lang.Integer.parseInt(nextToken);
            return parseInt > 2 || (parseInt == 2 && java.lang.Integer.parseInt(nextToken2) > 0);
        } catch (java.lang.NumberFormatException unused) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static java.lang.reflect.Field getHighSpeedVideoFpsRanges(java.lang.Object obj, java.lang.String str) throws java.lang.NoSuchFieldException {
        for (java.lang.Class<?> cls = obj.getClass(); cls != null; cls = cls.getSuperclass()) {
            try {
                java.lang.reflect.Field declaredField = cls.getDeclaredField(str);
                if (!declaredField.isAccessible()) {
                    declaredField.setAccessible(true);
                }
                return declaredField;
            } catch (java.lang.NoSuchFieldException unused) {
            }
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Field ");
        sb.append(str);
        sb.append(" not found in ");
        sb.append(obj.getClass());
        throw new java.lang.NoSuchFieldException(sb.toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static java.lang.reflect.Method getHighResolutionOutputSizeshNQ4ISI(java.lang.Object obj, java.lang.String str, java.lang.Class<?>... clsArr) throws java.lang.NoSuchMethodException {
        for (java.lang.Class<?> cls = obj.getClass(); cls != null; cls = cls.getSuperclass()) {
            try {
                java.lang.reflect.Method declaredMethod = cls.getDeclaredMethod(str, clsArr);
                if (!declaredMethod.isAccessible()) {
                    declaredMethod.setAccessible(true);
                }
                return declaredMethod;
            } catch (java.lang.NoSuchMethodException unused) {
            }
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Method ");
        sb.append(str);
        sb.append(" with parameters ");
        sb.append(java.util.Arrays.asList(clsArr));
        sb.append(" not found in ");
        sb.append(obj.getClass());
        throw new java.lang.NoSuchMethodException(sb.toString());
    }

    private static java.io.File getHighSpeedVideoSizes(android.content.Context context, java.io.File file, java.lang.String str) throws java.io.IOException {
        java.io.File file2 = new java.io.File(file, "code_cache");
        try {
            getHighSpeedVideoSizes(file2);
        } catch (java.io.IOException unused) {
            file2 = new java.io.File(context.getFilesDir(), "code_cache");
            getHighSpeedVideoSizes(file2);
        }
        java.io.File file3 = new java.io.File(file2, str);
        getHighSpeedVideoSizes(file3);
        return file3;
    }

    private static void getHighSpeedVideoSizes(java.io.File file) throws java.io.IOException {
        file.mkdir();
        if (file.isDirectory()) {
            return;
        }
        java.io.File parentFile = file.getParentFile();
        if (parentFile == null) {
            file.getPath();
        } else {
            file.getPath();
            parentFile.isDirectory();
            parentFile.isFile();
            parentFile.exists();
            parentFile.canRead();
            parentFile.canWrite();
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Failed to create directory ");
        sb.append(file.getPath());
        throw new java.io.IOException(sb.toString());
    }

    static final class V19 {
        private V19() {
        }

        static void getHighSpeedVideoSizes(java.lang.ClassLoader classLoader, java.util.List<? extends java.io.File> list, java.io.File file) throws java.lang.IllegalArgumentException, java.lang.IllegalAccessException, java.lang.NoSuchFieldException, java.lang.reflect.InvocationTargetException, java.lang.NoSuchMethodException, java.io.IOException {
            java.io.IOException[] iOExceptionArr;
            java.lang.Object obj = androidx.multidex.MultiDex.getHighSpeedVideoFpsRanges(classLoader, "pathList").get(classLoader);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            androidx.multidex.MultiDex.getHighSpeedVideoSizes(obj, "dexElements", Camera2StreamConfigurationMap(obj, new java.util.ArrayList(list), file, arrayList));
            if (arrayList.size() > 0) {
                java.util.Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                }
                java.lang.reflect.Field highSpeedVideoFpsRanges = androidx.multidex.MultiDex.getHighSpeedVideoFpsRanges(obj, "dexElementsSuppressedExceptions");
                java.io.IOException[] iOExceptionArr2 = (java.io.IOException[]) highSpeedVideoFpsRanges.get(obj);
                if (iOExceptionArr2 == null) {
                    iOExceptionArr = (java.io.IOException[]) arrayList.toArray(new java.io.IOException[arrayList.size()]);
                } else {
                    java.io.IOException[] iOExceptionArr3 = new java.io.IOException[arrayList.size() + iOExceptionArr2.length];
                    arrayList.toArray(iOExceptionArr3);
                    java.lang.System.arraycopy(iOExceptionArr2, 0, iOExceptionArr3, arrayList.size(), iOExceptionArr2.length);
                    iOExceptionArr = iOExceptionArr3;
                }
                highSpeedVideoFpsRanges.set(obj, iOExceptionArr);
                java.io.IOException iOException = new java.io.IOException("I/O exception during makeDexElement");
                iOException.initCause((java.lang.Throwable) arrayList.get(0));
                throw iOException;
            }
        }

        private static java.lang.Object[] Camera2StreamConfigurationMap(java.lang.Object obj, java.util.ArrayList<java.io.File> arrayList, java.io.File file, java.util.ArrayList<java.io.IOException> arrayList2) throws java.lang.IllegalAccessException, java.lang.reflect.InvocationTargetException, java.lang.NoSuchMethodException {
            return (java.lang.Object[]) androidx.multidex.MultiDex.getHighResolutionOutputSizeshNQ4ISI(obj, "makeDexElements", java.util.ArrayList.class, java.io.File.class, java.util.ArrayList.class).invoke(obj, arrayList, file, arrayList2);
        }
    }

    static final class V14 {
        private static final int getHighResolutionOutputSizeshNQ4ISI = 4;
        private final androidx.multidex.MultiDex.V14.ElementConstructor Camera2StreamConfigurationMap;

        interface ElementConstructor {
        }

        static class ICSElementConstructor implements androidx.multidex.MultiDex.V14.ElementConstructor {
            private final java.lang.reflect.Constructor<?> getHighSpeedVideoFpsRanges;

            ICSElementConstructor(java.lang.Class<?> cls) throws java.lang.SecurityException, java.lang.NoSuchMethodException {
                java.lang.reflect.Constructor<?> constructor = cls.getConstructor(java.io.File.class, java.util.zip.ZipFile.class, dalvik.system.DexFile.class);
                this.getHighSpeedVideoFpsRanges = constructor;
                constructor.setAccessible(true);
            }
        }

        static class JBMR11ElementConstructor implements androidx.multidex.MultiDex.V14.ElementConstructor {
            private final java.lang.reflect.Constructor<?> getHighSpeedVideoSizes;

            JBMR11ElementConstructor(java.lang.Class<?> cls) throws java.lang.SecurityException, java.lang.NoSuchMethodException {
                java.lang.reflect.Constructor<?> constructor = cls.getConstructor(java.io.File.class, java.io.File.class, dalvik.system.DexFile.class);
                this.getHighSpeedVideoSizes = constructor;
                constructor.setAccessible(true);
            }
        }

        static class JBMR2ElementConstructor implements androidx.multidex.MultiDex.V14.ElementConstructor {
            private final java.lang.reflect.Constructor<?> Camera2StreamConfigurationMap;

            JBMR2ElementConstructor(java.lang.Class<?> cls) throws java.lang.SecurityException, java.lang.NoSuchMethodException {
                java.lang.reflect.Constructor<?> constructor = cls.getConstructor(java.io.File.class, java.lang.Boolean.TYPE, java.io.File.class, dalvik.system.DexFile.class);
                this.Camera2StreamConfigurationMap = constructor;
                constructor.setAccessible(true);
            }
        }

        private V14() throws java.lang.ClassNotFoundException, java.lang.SecurityException, java.lang.NoSuchMethodException {
            androidx.multidex.MultiDex.V14.ElementConstructor jBMR2ElementConstructor;
            java.lang.Class<?> cls = java.lang.Class.forName("dalvik.system.DexPathList$Element");
            try {
                try {
                    jBMR2ElementConstructor = new androidx.multidex.MultiDex.V14.ICSElementConstructor(cls);
                } catch (java.lang.NoSuchMethodException unused) {
                    jBMR2ElementConstructor = new androidx.multidex.MultiDex.V14.JBMR11ElementConstructor(cls);
                }
            } catch (java.lang.NoSuchMethodException unused2) {
                jBMR2ElementConstructor = new androidx.multidex.MultiDex.V14.JBMR2ElementConstructor(cls);
            }
            this.Camera2StreamConfigurationMap = jBMR2ElementConstructor;
        }
    }

    static final class V4 {
        private V4() {
        }
    }

    static /* synthetic */ void getHighSpeedVideoSizes(java.lang.Object obj, java.lang.String str, java.lang.Object[] objArr) throws java.lang.NoSuchFieldException, java.lang.IllegalArgumentException, java.lang.IllegalAccessException {
        java.lang.reflect.Field highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(obj, str);
        java.lang.Object[] objArr2 = (java.lang.Object[]) highSpeedVideoFpsRanges.get(obj);
        java.lang.Object[] objArr3 = (java.lang.Object[]) java.lang.reflect.Array.newInstance(objArr2.getClass().getComponentType(), objArr2.length + objArr.length);
        java.lang.System.arraycopy(objArr2, 0, objArr3, 0, objArr2.length);
        java.lang.System.arraycopy(objArr, 0, objArr3, objArr2.length, objArr.length);
        highSpeedVideoFpsRanges.set(obj, objArr3);
    }
}
