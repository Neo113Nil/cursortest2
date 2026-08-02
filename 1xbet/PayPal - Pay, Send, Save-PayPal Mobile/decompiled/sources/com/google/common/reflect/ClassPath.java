package com.google.common.reflect;

/* loaded from: classes9.dex */
public final class ClassPath {
    private static final java.lang.String CLASS_FILE_NAME_EXTENSION = ".class";
    private final com.google.common.collect.ImmutableSet<com.google.common.reflect.ClassPath.ResourceInfo> resources;
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(com.google.common.reflect.ClassPath.class.getName());
    private static final com.google.common.base.Splitter CLASS_PATH_ATTRIBUTE_SEPARATOR = com.google.common.base.Splitter.on(" ").omitEmptyStrings();

    private ClassPath(com.google.common.collect.ImmutableSet<com.google.common.reflect.ClassPath.ResourceInfo> immutableSet) {
        this.resources = immutableSet;
    }

    public static com.google.common.reflect.ClassPath from(java.lang.ClassLoader classLoader) throws java.io.IOException {
        com.google.common.collect.ImmutableSet<com.google.common.reflect.ClassPath.LocationInfo> locationsFrom = locationsFrom(classLoader);
        java.util.HashSet hashSet = new java.util.HashSet();
        com.google.common.collect.UnmodifiableIterator<com.google.common.reflect.ClassPath.LocationInfo> it = locationsFrom.iterator();
        while (it.hasNext()) {
            hashSet.add(it.next().file());
        }
        com.google.common.collect.ImmutableSet.Builder builder = com.google.common.collect.ImmutableSet.builder();
        com.google.common.collect.UnmodifiableIterator<com.google.common.reflect.ClassPath.LocationInfo> it2 = locationsFrom.iterator();
        while (it2.hasNext()) {
            builder.addAll((java.lang.Iterable) it2.next().scanResources(hashSet));
        }
        return new com.google.common.reflect.ClassPath(builder.build());
    }

    public final com.google.common.collect.ImmutableSet<com.google.common.reflect.ClassPath.ResourceInfo> getResources() {
        return this.resources;
    }

    public final com.google.common.collect.ImmutableSet<com.google.common.reflect.ClassPath.ClassInfo> getAllClasses() {
        return com.google.common.collect.FluentIterable.from(this.resources).filter(com.google.common.reflect.ClassPath.ClassInfo.class).toSet();
    }

    public final com.google.common.collect.ImmutableSet<com.google.common.reflect.ClassPath.ClassInfo> getTopLevelClasses() {
        return com.google.common.collect.FluentIterable.from(this.resources).filter(com.google.common.reflect.ClassPath.ClassInfo.class).filter(new com.google.common.base.Predicate() { // from class: com.google.common.reflect.ClassPath$$ExternalSyntheticLambda0
            @Override // com.google.common.base.Predicate
            public final boolean apply(java.lang.Object obj) {
                return ((com.google.common.reflect.ClassPath.ClassInfo) obj).isTopLevel();
            }
        }).toSet();
    }

    public final com.google.common.collect.ImmutableSet<com.google.common.reflect.ClassPath.ClassInfo> getTopLevelClasses(java.lang.String str) {
        com.google.common.base.Preconditions.checkNotNull(str);
        com.google.common.collect.ImmutableSet.Builder builder = com.google.common.collect.ImmutableSet.builder();
        com.google.common.collect.UnmodifiableIterator<com.google.common.reflect.ClassPath.ClassInfo> it = getTopLevelClasses().iterator();
        while (it.hasNext()) {
            com.google.common.reflect.ClassPath.ClassInfo next = it.next();
            if (next.getPackageName().equals(str)) {
                builder.add((com.google.common.collect.ImmutableSet.Builder) next);
            }
        }
        return builder.build();
    }

    public final com.google.common.collect.ImmutableSet<com.google.common.reflect.ClassPath.ClassInfo> getTopLevelClassesRecursive(java.lang.String str) {
        com.google.common.base.Preconditions.checkNotNull(str);
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(str);
        sb.append(com.paypal.oslo.core.money.MoneyKt.DECIMALSEPARATOR);
        java.lang.String obj = sb.toString();
        com.google.common.collect.ImmutableSet.Builder builder = com.google.common.collect.ImmutableSet.builder();
        com.google.common.collect.UnmodifiableIterator<com.google.common.reflect.ClassPath.ClassInfo> it = getTopLevelClasses().iterator();
        while (it.hasNext()) {
            com.google.common.reflect.ClassPath.ClassInfo next = it.next();
            if (next.getName().startsWith(obj)) {
                builder.add((com.google.common.collect.ImmutableSet.Builder) next);
            }
        }
        return builder.build();
    }

    public static class ResourceInfo {
        private final java.io.File file;
        final java.lang.ClassLoader loader;
        private final java.lang.String resourceName;

        static com.google.common.reflect.ClassPath.ResourceInfo of(java.io.File file, java.lang.String str, java.lang.ClassLoader classLoader) {
            if (str.endsWith(com.google.common.reflect.ClassPath.CLASS_FILE_NAME_EXTENSION)) {
                return new com.google.common.reflect.ClassPath.ClassInfo(file, str, classLoader);
            }
            return new com.google.common.reflect.ClassPath.ResourceInfo(file, str, classLoader);
        }

        ResourceInfo(java.io.File file, java.lang.String str, java.lang.ClassLoader classLoader) {
            this.file = (java.io.File) com.google.common.base.Preconditions.checkNotNull(file);
            this.resourceName = (java.lang.String) com.google.common.base.Preconditions.checkNotNull(str);
            this.loader = (java.lang.ClassLoader) com.google.common.base.Preconditions.checkNotNull(classLoader);
        }

        public final java.net.URL url() {
            java.net.URL resource = this.loader.getResource(this.resourceName);
            if (resource != null) {
                return resource;
            }
            throw new java.util.NoSuchElementException(this.resourceName);
        }

        public final com.google.common.io.ByteSource asByteSource() {
            return com.google.common.io.Resources.asByteSource(url());
        }

        public final com.google.common.io.CharSource asCharSource(java.nio.charset.Charset charset) {
            return com.google.common.io.Resources.asCharSource(url(), charset);
        }

        public final java.lang.String getResourceName() {
            return this.resourceName;
        }

        final java.io.File getFile() {
            return this.file;
        }

        public int hashCode() {
            return this.resourceName.hashCode();
        }

        public boolean equals(java.lang.Object obj) {
            if (!(obj instanceof com.google.common.reflect.ClassPath.ResourceInfo)) {
                return false;
            }
            com.google.common.reflect.ClassPath.ResourceInfo resourceInfo = (com.google.common.reflect.ClassPath.ResourceInfo) obj;
            return this.resourceName.equals(resourceInfo.resourceName) && this.loader == resourceInfo.loader;
        }

        public java.lang.String toString() {
            return this.resourceName;
        }
    }

    public static final class ClassInfo extends com.google.common.reflect.ClassPath.ResourceInfo {
        private final java.lang.String className;

        ClassInfo(java.io.File file, java.lang.String str, java.lang.ClassLoader classLoader) {
            super(file, str, classLoader);
            this.className = com.google.common.reflect.ClassPath.getClassName(str);
        }

        public final java.lang.String getPackageName() {
            return com.google.common.reflect.Reflection.getPackageName(this.className);
        }

        public final java.lang.String getSimpleName() {
            int lastIndexOf = this.className.lastIndexOf(36);
            if (lastIndexOf != -1) {
                return com.google.common.base.CharMatcher.inRange(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, '9').trimLeadingFrom(this.className.substring(lastIndexOf + 1));
            }
            java.lang.String packageName = getPackageName();
            if (packageName.isEmpty()) {
                return this.className;
            }
            return this.className.substring(packageName.length() + 1);
        }

        public final java.lang.String getName() {
            return this.className;
        }

        public final boolean isTopLevel() {
            return this.className.indexOf(36) == -1;
        }

        public final java.lang.Class<?> load() {
            try {
                return this.loader.loadClass(this.className);
            } catch (java.lang.ClassNotFoundException e) {
                throw new java.lang.IllegalStateException(e);
            }
        }

        @Override // com.google.common.reflect.ClassPath.ResourceInfo
        public final java.lang.String toString() {
            return this.className;
        }
    }

    static com.google.common.collect.ImmutableSet<com.google.common.reflect.ClassPath.LocationInfo> locationsFrom(java.lang.ClassLoader classLoader) {
        com.google.common.collect.ImmutableSet.Builder builder = com.google.common.collect.ImmutableSet.builder();
        com.google.common.collect.UnmodifiableIterator<java.util.Map.Entry<java.io.File, java.lang.ClassLoader>> it = getClassPathEntries(classLoader).entrySet().iterator();
        while (it.hasNext()) {
            java.util.Map.Entry<java.io.File, java.lang.ClassLoader> next = it.next();
            builder.add((com.google.common.collect.ImmutableSet.Builder) new com.google.common.reflect.ClassPath.LocationInfo(next.getKey(), next.getValue()));
        }
        return builder.build();
    }

    static final class LocationInfo {
        private final java.lang.ClassLoader classloader;
        final java.io.File home;

        LocationInfo(java.io.File file, java.lang.ClassLoader classLoader) {
            this.home = (java.io.File) com.google.common.base.Preconditions.checkNotNull(file);
            this.classloader = (java.lang.ClassLoader) com.google.common.base.Preconditions.checkNotNull(classLoader);
        }

        public final java.io.File file() {
            return this.home;
        }

        public final com.google.common.collect.ImmutableSet<com.google.common.reflect.ClassPath.ResourceInfo> scanResources() throws java.io.IOException {
            return scanResources(new java.util.HashSet());
        }

        public final com.google.common.collect.ImmutableSet<com.google.common.reflect.ClassPath.ResourceInfo> scanResources(java.util.Set<java.io.File> set) throws java.io.IOException {
            com.google.common.collect.ImmutableSet.Builder<com.google.common.reflect.ClassPath.ResourceInfo> builder = com.google.common.collect.ImmutableSet.builder();
            set.add(this.home);
            scan(this.home, set, builder);
            return builder.build();
        }

        private void scan(java.io.File file, java.util.Set<java.io.File> set, com.google.common.collect.ImmutableSet.Builder<com.google.common.reflect.ClassPath.ResourceInfo> builder) throws java.io.IOException {
            try {
                if (file.exists()) {
                    if (file.isDirectory()) {
                        scanDirectory(file, builder);
                    } else {
                        scanJar(file, set, builder);
                    }
                }
            } catch (java.lang.SecurityException e) {
                java.util.logging.Logger logger = com.google.common.reflect.ClassPath.logger;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Cannot access ");
                sb.append(file);
                sb.append(": ");
                sb.append(e);
                logger.warning(sb.toString());
            }
        }

        private void scanJar(java.io.File file, java.util.Set<java.io.File> set, com.google.common.collect.ImmutableSet.Builder<com.google.common.reflect.ClassPath.ResourceInfo> builder) throws java.io.IOException {
            try {
                java.util.jar.JarFile jarFile = new java.util.jar.JarFile(file);
                try {
                    com.google.common.collect.UnmodifiableIterator<java.io.File> it = com.google.common.reflect.ClassPath.getClassPathFromManifest(file, jarFile.getManifest()).iterator();
                    while (it.hasNext()) {
                        java.io.File next = it.next();
                        if (set.add(next.getCanonicalFile())) {
                            scan(next, set, builder);
                        }
                    }
                    scanJarFile(jarFile, builder);
                } finally {
                    try {
                        jarFile.close();
                    } catch (java.io.IOException unused) {
                    }
                }
            } catch (java.io.IOException unused2) {
            }
        }

        private void scanJarFile(java.util.jar.JarFile jarFile, com.google.common.collect.ImmutableSet.Builder<com.google.common.reflect.ClassPath.ResourceInfo> builder) {
            java.util.Enumeration<? extends java.util.zip.ZipEntry> entries = jarFile.entries();
            while (entries.hasMoreElements()) {
                java.util.jar.JarEntry jarEntry = (java.util.jar.JarEntry) entries.nextElement();
                if (!jarEntry.isDirectory() && !jarEntry.getName().equals("META-INF/MANIFEST.MF")) {
                    builder.add((com.google.common.collect.ImmutableSet.Builder<com.google.common.reflect.ClassPath.ResourceInfo>) com.google.common.reflect.ClassPath.ResourceInfo.of(new java.io.File(jarFile.getName()), jarEntry.getName(), this.classloader));
                }
            }
        }

        private void scanDirectory(java.io.File file, com.google.common.collect.ImmutableSet.Builder<com.google.common.reflect.ClassPath.ResourceInfo> builder) throws java.io.IOException {
            java.util.HashSet hashSet = new java.util.HashSet();
            hashSet.add(file.getCanonicalFile());
            scanDirectory(file, "", hashSet, builder);
        }

        private void scanDirectory(java.io.File file, java.lang.String str, java.util.Set<java.io.File> set, com.google.common.collect.ImmutableSet.Builder<com.google.common.reflect.ClassPath.ResourceInfo> builder) throws java.io.IOException {
            java.io.File[] listFiles = file.listFiles();
            if (listFiles == null) {
                com.google.common.reflect.ClassPath.logger.warning("Cannot read directory ".concat(java.lang.String.valueOf(file)));
                return;
            }
            for (java.io.File file2 : listFiles) {
                java.lang.String name2 = file2.getName();
                if (file2.isDirectory()) {
                    java.io.File canonicalFile = file2.getCanonicalFile();
                    if (set.add(canonicalFile)) {
                        java.lang.StringBuilder sb = new java.lang.StringBuilder();
                        sb.append(str);
                        sb.append(name2);
                        sb.append(androidx.view.exceptions.publickeycredential.DomExceptionUtils.SEPARATOR);
                        scanDirectory(canonicalFile, sb.toString(), set, builder);
                        set.remove(canonicalFile);
                    }
                } else {
                    java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                    sb2.append(str);
                    sb2.append(name2);
                    java.lang.String obj = sb2.toString();
                    if (!obj.equals("META-INF/MANIFEST.MF")) {
                        builder.add((com.google.common.collect.ImmutableSet.Builder<com.google.common.reflect.ClassPath.ResourceInfo>) com.google.common.reflect.ClassPath.ResourceInfo.of(file2, obj, this.classloader));
                    }
                }
            }
        }

        public final boolean equals(java.lang.Object obj) {
            if (!(obj instanceof com.google.common.reflect.ClassPath.LocationInfo)) {
                return false;
            }
            com.google.common.reflect.ClassPath.LocationInfo locationInfo = (com.google.common.reflect.ClassPath.LocationInfo) obj;
            return this.home.equals(locationInfo.home) && this.classloader.equals(locationInfo.classloader);
        }

        public final int hashCode() {
            return this.home.hashCode();
        }

        public final java.lang.String toString() {
            return this.home.toString();
        }
    }

    static com.google.common.collect.ImmutableSet<java.io.File> getClassPathFromManifest(java.io.File file, java.util.jar.Manifest manifest) {
        if (manifest == null) {
            return com.google.common.collect.ImmutableSet.of();
        }
        com.google.common.collect.ImmutableSet.Builder builder = com.google.common.collect.ImmutableSet.builder();
        java.lang.String value = manifest.getMainAttributes().getValue(java.util.jar.Attributes.Name.CLASS_PATH.toString());
        if (value != null) {
            for (java.lang.String str : CLASS_PATH_ATTRIBUTE_SEPARATOR.split(value)) {
                try {
                    java.net.URL classPathEntry = getClassPathEntry(file, str);
                    if (classPathEntry.getProtocol().equals("file")) {
                        builder.add((com.google.common.collect.ImmutableSet.Builder) toFile(classPathEntry));
                    }
                } catch (java.net.MalformedURLException unused) {
                    logger.warning("Invalid Class-Path entry: ".concat(java.lang.String.valueOf(str)));
                }
            }
        }
        return builder.build();
    }

    static com.google.common.collect.ImmutableMap<java.io.File, java.lang.ClassLoader> getClassPathEntries(java.lang.ClassLoader classLoader) {
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        java.lang.ClassLoader parent = classLoader.getParent();
        if (parent != null) {
            linkedHashMap.putAll(getClassPathEntries(parent));
        }
        com.google.common.collect.UnmodifiableIterator<java.net.URL> it = getClassLoaderUrls(classLoader).iterator();
        while (it.hasNext()) {
            java.net.URL next = it.next();
            if (next.getProtocol().equals("file")) {
                java.io.File file = toFile(next);
                if (!linkedHashMap.containsKey(file)) {
                    linkedHashMap.put(file, classLoader);
                }
            }
        }
        return com.google.common.collect.ImmutableMap.copyOf((java.util.Map) linkedHashMap);
    }

    private static com.google.common.collect.ImmutableList<java.net.URL> getClassLoaderUrls(java.lang.ClassLoader classLoader) {
        if (classLoader instanceof java.net.URLClassLoader) {
            return com.google.common.collect.ImmutableList.copyOf(((java.net.URLClassLoader) classLoader).getURLs());
        }
        if (classLoader.equals(java.lang.ClassLoader.getSystemClassLoader())) {
            return parseJavaClassPath();
        }
        return com.google.common.collect.ImmutableList.of();
    }

    static com.google.common.collect.ImmutableList<java.net.URL> parseJavaClassPath() {
        com.google.common.collect.ImmutableList.Builder builder = com.google.common.collect.ImmutableList.builder();
        for (java.lang.String str : com.google.common.base.Splitter.on(com.google.common.base.StandardSystemProperty.PATH_SEPARATOR.value()).split(com.google.common.base.StandardSystemProperty.JAVA_CLASS_PATH.value())) {
            try {
                try {
                    builder.add((com.google.common.collect.ImmutableList.Builder) new java.io.File(str).toURI().toURL());
                } catch (java.lang.SecurityException unused) {
                    builder.add((com.google.common.collect.ImmutableList.Builder) new java.net.URL("file", (java.lang.String) null, new java.io.File(str).getAbsolutePath()));
                }
            } catch (java.net.MalformedURLException e) {
                logger.log(java.util.logging.Level.WARNING, "malformed classpath entry: ".concat(java.lang.String.valueOf(str)), (java.lang.Throwable) e);
            }
        }
        return builder.build();
    }

    static java.net.URL getClassPathEntry(java.io.File file, java.lang.String str) throws java.net.MalformedURLException {
        return new java.net.URL(file.toURI().toURL(), str);
    }

    static java.lang.String getClassName(java.lang.String str) {
        return str.substring(0, str.length() - 6).replace(kotlinx.io.files.FileSystemKt.UnixPathSeparator, com.paypal.oslo.core.money.MoneyKt.DECIMALSEPARATOR);
    }

    static java.io.File toFile(java.net.URL url) {
        com.google.common.base.Preconditions.checkArgument(url.getProtocol().equals("file"));
        try {
            return new java.io.File(url.toURI());
        } catch (java.net.URISyntaxException unused) {
            return new java.io.File(url.getPath());
        }
    }
}
