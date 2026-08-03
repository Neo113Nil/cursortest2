package org.slf4j;

/* loaded from: classes6.dex */
public final class LoggerFactory {
    static final java.lang.String CODES_PREFIX = "https://www.slf4j.org/codes.html";
    static final int FAILED_INITIALIZATION = 2;
    static final java.lang.String IGNORED_BINDINGS_URL = "https://www.slf4j.org/codes.html#ignoredBindings";
    static volatile int INITIALIZATION_STATE = 0;
    static final java.lang.String JAVA_VENDOR_PROPERTY = "java.vendor.url";
    static final java.lang.String LOGGER_NAME_MISMATCH_URL = "https://www.slf4j.org/codes.html#loggerNameMismatch";
    static final java.lang.String MULTIPLE_BINDINGS_URL = "https://www.slf4j.org/codes.html#multiple_bindings";
    static final int NOP_FALLBACK_INITIALIZATION = 4;
    static final java.lang.String NO_PROVIDERS_URL = "https://www.slf4j.org/codes.html#noProviders";
    static final int ONGOING_INITIALIZATION = 1;
    static volatile org.slf4j.spi.SLF4JServiceProvider PROVIDER = null;
    public static final java.lang.String PROVIDER_PROPERTY_KEY = "slf4j.provider";
    static final java.lang.String REPLAY_URL = "https://www.slf4j.org/codes.html#replay";
    private static final java.lang.String STATIC_LOGGER_BINDER_PATH = "org/slf4j/impl/StaticLoggerBinder.class";
    static final java.lang.String SUBSTITUTE_LOGGER_URL = "https://www.slf4j.org/codes.html#substituteLogger";
    static final int SUCCESSFUL_INITIALIZATION = 3;
    static final int UNINITIALIZED = 0;
    static final java.lang.String UNSUCCESSFUL_INIT_MSG = "org.slf4j.LoggerFactory in failed state. Original exception was thrown EARLIER. See also https://www.slf4j.org/codes.html#unsuccessfulInit";
    static final java.lang.String UNSUCCESSFUL_INIT_URL = "https://www.slf4j.org/codes.html#unsuccessfulInit";
    static final java.lang.String VERSION_MISMATCH = "https://www.slf4j.org/codes.html#version_mismatch";
    static final org.slf4j.helpers.SubstituteServiceProvider SUBST_PROVIDER = new org.slf4j.helpers.SubstituteServiceProvider();
    static final org.slf4j.helpers.NOP_FallbackServiceProvider NOP_FALLBACK_SERVICE_PROVIDER = new org.slf4j.helpers.NOP_FallbackServiceProvider();
    static final java.lang.String DETECT_LOGGER_NAME_MISMATCH_PROPERTY = "slf4j.detectLoggerNameMismatch";
    static boolean DETECT_LOGGER_NAME_MISMATCH = org.slf4j.helpers.Util.safeGetBooleanSystemProperty(DETECT_LOGGER_NAME_MISMATCH_PROPERTY);
    private static final java.lang.String[] API_COMPATIBILITY_LIST = {com.ironsource.M6.k0};

    static java.util.List<org.slf4j.spi.SLF4JServiceProvider> findServiceProviders() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ClassLoader classLoader = org.slf4j.LoggerFactory.class.getClassLoader();
        org.slf4j.spi.SLF4JServiceProvider loadExplicitlySpecified = loadExplicitlySpecified(classLoader);
        if (loadExplicitlySpecified != null) {
            arrayList.add(loadExplicitlySpecified);
            return arrayList;
        }
        java.util.Iterator<org.slf4j.spi.SLF4JServiceProvider> it = getServiceLoader(classLoader).iterator();
        while (it.hasNext()) {
            safelyInstantiate(arrayList, it);
        }
        return arrayList;
    }

    private static java.util.ServiceLoader<org.slf4j.spi.SLF4JServiceProvider> getServiceLoader(final java.lang.ClassLoader classLoader) {
        if (java.lang.System.getSecurityManager() == null) {
            return java.util.ServiceLoader.load(org.slf4j.spi.SLF4JServiceProvider.class, classLoader);
        }
        return (java.util.ServiceLoader) java.security.AccessController.doPrivileged(new java.security.PrivilegedAction() { // from class: org.slf4j.LoggerFactory$$ExternalSyntheticLambda0
            @Override // java.security.PrivilegedAction
            public final java.lang.Object run() {
                java.util.ServiceLoader load;
                load = java.util.ServiceLoader.load(org.slf4j.spi.SLF4JServiceProvider.class, classLoader);
                return load;
            }
        });
    }

    private static void safelyInstantiate(java.util.List<org.slf4j.spi.SLF4JServiceProvider> list, java.util.Iterator<org.slf4j.spi.SLF4JServiceProvider> it) {
        try {
            list.add(it.next());
        } catch (java.util.ServiceConfigurationError e) {
            org.slf4j.helpers.Util.report("A SLF4J service provider failed to instantiate:\n" + e.getMessage());
        }
    }

    private LoggerFactory() {
    }

    static void reset() {
        INITIALIZATION_STATE = 0;
    }

    private static final void performInitialization() {
        bind();
        if (INITIALIZATION_STATE == 3) {
            versionSanityCheck();
        }
    }

    private static final void bind() {
        try {
            java.util.List<org.slf4j.spi.SLF4JServiceProvider> findServiceProviders = findServiceProviders();
            reportMultipleBindingAmbiguity(findServiceProviders);
            if (findServiceProviders != null && !findServiceProviders.isEmpty()) {
                PROVIDER = findServiceProviders.get(0);
                PROVIDER.initialize();
                INITIALIZATION_STATE = 3;
                reportActualBinding(findServiceProviders);
            } else {
                INITIALIZATION_STATE = 4;
                org.slf4j.helpers.Util.report("No SLF4J providers were found.");
                org.slf4j.helpers.Util.report("Defaulting to no-operation (NOP) logger implementation");
                org.slf4j.helpers.Util.report("See https://www.slf4j.org/codes.html#noProviders for further details.");
                reportIgnoredStaticLoggerBinders(findPossibleStaticLoggerBinderPathSet());
            }
            postBindCleanUp();
        } catch (java.lang.Exception e) {
            failedBinding(e);
            throw new java.lang.IllegalStateException("Unexpected initialization failure", e);
        }
    }

    static org.slf4j.spi.SLF4JServiceProvider loadExplicitlySpecified(java.lang.ClassLoader classLoader) {
        java.lang.String property = java.lang.System.getProperty(PROVIDER_PROPERTY_KEY);
        if (property != null && !property.isEmpty()) {
            try {
                org.slf4j.helpers.Util.report(java.lang.String.format("Attempting to load provider \"%s\" specified via \"%s\" system property", property, PROVIDER_PROPERTY_KEY));
                return (org.slf4j.spi.SLF4JServiceProvider) classLoader.loadClass(property).getConstructor(new java.lang.Class[0]).newInstance(new java.lang.Object[0]);
            } catch (java.lang.ClassCastException e) {
                org.slf4j.helpers.Util.report(java.lang.String.format("Specified SLF4JServiceProvider (%s) does not implement SLF4JServiceProvider interface", property), e);
                return null;
            } catch (java.lang.ClassNotFoundException e2) {
                e = e2;
                org.slf4j.helpers.Util.report(java.lang.String.format("Failed to instantiate the specified SLF4JServiceProvider (%s)", property), e);
                return null;
            } catch (java.lang.IllegalAccessException e3) {
                e = e3;
                org.slf4j.helpers.Util.report(java.lang.String.format("Failed to instantiate the specified SLF4JServiceProvider (%s)", property), e);
                return null;
            } catch (java.lang.InstantiationException e4) {
                e = e4;
                org.slf4j.helpers.Util.report(java.lang.String.format("Failed to instantiate the specified SLF4JServiceProvider (%s)", property), e);
                return null;
            } catch (java.lang.NoSuchMethodException e5) {
                e = e5;
                org.slf4j.helpers.Util.report(java.lang.String.format("Failed to instantiate the specified SLF4JServiceProvider (%s)", property), e);
                return null;
            } catch (java.lang.reflect.InvocationTargetException e6) {
                e = e6;
                org.slf4j.helpers.Util.report(java.lang.String.format("Failed to instantiate the specified SLF4JServiceProvider (%s)", property), e);
                return null;
            }
        }
        return null;
    }

    private static void reportIgnoredStaticLoggerBinders(java.util.Set<java.net.URL> set) {
        if (set.isEmpty()) {
            return;
        }
        org.slf4j.helpers.Util.report("Class path contains SLF4J bindings targeting slf4j-api versions 1.7.x or earlier.");
        java.util.Iterator<java.net.URL> it = set.iterator();
        while (it.hasNext()) {
            org.slf4j.helpers.Util.report("Ignoring binding found at [" + it.next() + com.ironsource.X3.j.e);
        }
        org.slf4j.helpers.Util.report("See https://www.slf4j.org/codes.html#ignoredBindings for an explanation.");
    }

    static java.util.Set<java.net.URL> findPossibleStaticLoggerBinderPathSet() {
        java.util.Enumeration<java.net.URL> resources;
        java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
        try {
            java.lang.ClassLoader classLoader = org.slf4j.LoggerFactory.class.getClassLoader();
            if (classLoader == null) {
                resources = java.lang.ClassLoader.getSystemResources(STATIC_LOGGER_BINDER_PATH);
            } else {
                resources = classLoader.getResources(STATIC_LOGGER_BINDER_PATH);
            }
            while (resources.hasMoreElements()) {
                linkedHashSet.add(resources.nextElement());
            }
        } catch (java.io.IOException e) {
            org.slf4j.helpers.Util.report("Error getting resources from path", e);
        }
        return linkedHashSet;
    }

    private static void postBindCleanUp() {
        fixSubstituteLoggers();
        replayEvents();
        SUBST_PROVIDER.getSubstituteLoggerFactory().clear();
    }

    private static void fixSubstituteLoggers() {
        org.slf4j.helpers.SubstituteServiceProvider substituteServiceProvider = SUBST_PROVIDER;
        synchronized (substituteServiceProvider) {
            substituteServiceProvider.getSubstituteLoggerFactory().postInitialization();
            for (org.slf4j.helpers.SubstituteLogger substituteLogger : substituteServiceProvider.getSubstituteLoggerFactory().getLoggers()) {
                substituteLogger.setDelegate(getLogger(substituteLogger.getName()));
            }
        }
    }

    static void failedBinding(java.lang.Throwable th) {
        INITIALIZATION_STATE = 2;
        org.slf4j.helpers.Util.report("Failed to instantiate SLF4J LoggerFactory", th);
    }

    private static void replayEvents() {
        java.util.concurrent.LinkedBlockingQueue<org.slf4j.event.SubstituteLoggingEvent> eventQueue = SUBST_PROVIDER.getSubstituteLoggerFactory().getEventQueue();
        int size = eventQueue.size();
        java.util.ArrayList<org.slf4j.event.SubstituteLoggingEvent> arrayList = new java.util.ArrayList(128);
        int i = 0;
        while (eventQueue.drainTo(arrayList, 128) != 0) {
            for (org.slf4j.event.SubstituteLoggingEvent substituteLoggingEvent : arrayList) {
                replaySingleEvent(substituteLoggingEvent);
                int i2 = i + 1;
                if (i == 0) {
                    emitReplayOrSubstituionWarning(substituteLoggingEvent, size);
                }
                i = i2;
            }
            arrayList.clear();
        }
    }

    private static void emitReplayOrSubstituionWarning(org.slf4j.event.SubstituteLoggingEvent substituteLoggingEvent, int i) {
        if (substituteLoggingEvent.getLogger().isDelegateEventAware()) {
            emitReplayWarning(i);
        } else {
            if (substituteLoggingEvent.getLogger().isDelegateNOP()) {
                return;
            }
            emitSubstitutionWarning();
        }
    }

    private static void replaySingleEvent(org.slf4j.event.SubstituteLoggingEvent substituteLoggingEvent) {
        if (substituteLoggingEvent == null) {
            return;
        }
        org.slf4j.helpers.SubstituteLogger logger = substituteLoggingEvent.getLogger();
        java.lang.String name = logger.getName();
        if (logger.isDelegateNull()) {
            throw new java.lang.IllegalStateException("Delegate logger cannot be null at this state.");
        }
        if (logger.isDelegateNOP()) {
            return;
        }
        if (logger.isDelegateEventAware()) {
            if (logger.isEnabledForLevel(substituteLoggingEvent.getLevel())) {
                logger.log(substituteLoggingEvent);
                return;
            }
            return;
        }
        org.slf4j.helpers.Util.report(name);
    }

    private static void emitSubstitutionWarning() {
        org.slf4j.helpers.Util.report("The following set of substitute loggers may have been accessed");
        org.slf4j.helpers.Util.report("during the initialization phase. Logging calls during this");
        org.slf4j.helpers.Util.report("phase were not honored. However, subsequent logging calls to these");
        org.slf4j.helpers.Util.report("loggers will work as normally expected.");
        org.slf4j.helpers.Util.report("See also https://www.slf4j.org/codes.html#substituteLogger");
    }

    private static void emitReplayWarning(int i) {
        org.slf4j.helpers.Util.report("A number (" + i + ") of logging calls during the initialization phase have been intercepted and are");
        org.slf4j.helpers.Util.report("now being replayed. These are subject to the filtering rules of the underlying logging system.");
        org.slf4j.helpers.Util.report("See also https://www.slf4j.org/codes.html#replay");
    }

    private static final void versionSanityCheck() {
        try {
            java.lang.String requestedApiVersion = PROVIDER.getRequestedApiVersion();
            boolean z = false;
            for (java.lang.String str : API_COMPATIBILITY_LIST) {
                if (requestedApiVersion.startsWith(str)) {
                    z = true;
                }
            }
            if (z) {
                return;
            }
            org.slf4j.helpers.Util.report("The requested version " + requestedApiVersion + " by your slf4j provider is not compatible with " + java.util.Arrays.asList(API_COMPATIBILITY_LIST).toString());
            org.slf4j.helpers.Util.report("See https://www.slf4j.org/codes.html#version_mismatch for further details.");
        } catch (java.lang.NoSuchFieldError unused) {
        } catch (java.lang.Throwable th) {
            org.slf4j.helpers.Util.report("Unexpected problem occurred during version sanity check", th);
        }
    }

    private static boolean isAmbiguousProviderList(java.util.List<org.slf4j.spi.SLF4JServiceProvider> list) {
        return list.size() > 1;
    }

    private static void reportMultipleBindingAmbiguity(java.util.List<org.slf4j.spi.SLF4JServiceProvider> list) {
        if (isAmbiguousProviderList(list)) {
            org.slf4j.helpers.Util.report("Class path contains multiple SLF4J providers.");
            java.util.Iterator<org.slf4j.spi.SLF4JServiceProvider> it = list.iterator();
            while (it.hasNext()) {
                org.slf4j.helpers.Util.report("Found provider [" + it.next() + com.ironsource.X3.j.e);
            }
            org.slf4j.helpers.Util.report("See https://www.slf4j.org/codes.html#multiple_bindings for an explanation.");
        }
    }

    private static void reportActualBinding(java.util.List<org.slf4j.spi.SLF4JServiceProvider> list) {
        if (list.isEmpty() || !isAmbiguousProviderList(list)) {
            return;
        }
        org.slf4j.helpers.Util.report("Actual provider is of type [" + list.get(0) + com.ironsource.X3.j.e);
    }

    public static org.slf4j.Logger getLogger(java.lang.String str) {
        return getILoggerFactory().getLogger(str);
    }

    public static org.slf4j.Logger getLogger(java.lang.Class<?> cls) {
        java.lang.Class<?> callingClass;
        org.slf4j.Logger logger = getLogger(cls.getName());
        if (DETECT_LOGGER_NAME_MISMATCH && (callingClass = org.slf4j.helpers.Util.getCallingClass()) != null && nonMatchingClasses(cls, callingClass)) {
            org.slf4j.helpers.Util.report(java.lang.String.format("Detected logger name mismatch. Given name: \"%s\"; computed name: \"%s\".", logger.getName(), callingClass.getName()));
            org.slf4j.helpers.Util.report("See https://www.slf4j.org/codes.html#loggerNameMismatch for an explanation");
        }
        return logger;
    }

    private static boolean nonMatchingClasses(java.lang.Class<?> cls, java.lang.Class<?> cls2) {
        return !cls2.isAssignableFrom(cls);
    }

    public static org.slf4j.ILoggerFactory getILoggerFactory() {
        return getProvider().getLoggerFactory();
    }

    static org.slf4j.spi.SLF4JServiceProvider getProvider() {
        if (INITIALIZATION_STATE == 0) {
            synchronized (org.slf4j.LoggerFactory.class) {
                if (INITIALIZATION_STATE == 0) {
                    INITIALIZATION_STATE = 1;
                    performInitialization();
                }
            }
        }
        int i = INITIALIZATION_STATE;
        if (i == 1) {
            return SUBST_PROVIDER;
        }
        if (i == 2) {
            throw new java.lang.IllegalStateException(UNSUCCESSFUL_INIT_MSG);
        }
        if (i == 3) {
            return PROVIDER;
        }
        if (i == 4) {
            return NOP_FALLBACK_SERVICE_PROVIDER;
        }
        throw new java.lang.IllegalStateException("Unreachable code");
    }
}
