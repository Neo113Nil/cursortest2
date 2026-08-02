package org.slf4j;

/* loaded from: classes18.dex */
public final class LoggerFactory {
    public static final java.lang.String PROVIDER_PROPERTY_KEY = "slf4j.provider";
    static volatile int getHighResolutionOutputSizeshNQ4ISI;
    static volatile org.slf4j.spi.SLF4JServiceProvider getHighSpeedVideoSizes;
    static final org.slf4j.helpers.SubstituteServiceProvider getHighSpeedVideoFpsRangesFor = new org.slf4j.helpers.SubstituteServiceProvider();
    static final org.slf4j.helpers.NOP_FallbackServiceProvider getHighSpeedVideoFpsRanges = new org.slf4j.helpers.NOP_FallbackServiceProvider();
    static boolean Camera2StreamConfigurationMap = org.slf4j.helpers.Util.safeGetBooleanSystemProperty("slf4j.detectLoggerNameMismatch");
    private static final java.lang.String[] getOutputMinFrameDuration = {"2.0"};

    private LoggerFactory() {
    }

    static void getHighSpeedVideoFpsRangesFor() {
        getHighResolutionOutputSizeshNQ4ISI = 0;
    }

    private static org.slf4j.spi.SLF4JServiceProvider getHighSpeedVideoFpsRangesFor(java.lang.ClassLoader classLoader) {
        java.lang.String property = java.lang.System.getProperty(PROVIDER_PROPERTY_KEY);
        if (property != null && !property.isEmpty()) {
            try {
                org.slf4j.helpers.Reporter.info(java.lang.String.format("Attempting to load provider \"%s\" specified via \"%s\" system property", property, PROVIDER_PROPERTY_KEY));
                return (org.slf4j.spi.SLF4JServiceProvider) classLoader.loadClass(property).getConstructor(new java.lang.Class[0]).newInstance(new java.lang.Object[0]);
            } catch (java.lang.ClassCastException e) {
                org.slf4j.helpers.Reporter.error(java.lang.String.format("Specified SLF4JServiceProvider (%s) does not implement SLF4JServiceProvider interface", property), e);
                return null;
            } catch (java.lang.ClassNotFoundException e2) {
                e = e2;
                org.slf4j.helpers.Reporter.error(java.lang.String.format("Failed to instantiate the specified SLF4JServiceProvider (%s)", property), e);
                return null;
            } catch (java.lang.IllegalAccessException e3) {
                e = e3;
                org.slf4j.helpers.Reporter.error(java.lang.String.format("Failed to instantiate the specified SLF4JServiceProvider (%s)", property), e);
                return null;
            } catch (java.lang.InstantiationException e4) {
                e = e4;
                org.slf4j.helpers.Reporter.error(java.lang.String.format("Failed to instantiate the specified SLF4JServiceProvider (%s)", property), e);
                return null;
            } catch (java.lang.NoSuchMethodException e5) {
                e = e5;
                org.slf4j.helpers.Reporter.error(java.lang.String.format("Failed to instantiate the specified SLF4JServiceProvider (%s)", property), e);
                return null;
            } catch (java.lang.reflect.InvocationTargetException e6) {
                e = e6;
                org.slf4j.helpers.Reporter.error(java.lang.String.format("Failed to instantiate the specified SLF4JServiceProvider (%s)", property), e);
                return null;
            }
        }
        return null;
    }

    private static java.util.Set<java.net.URL> getHighResolutionOutputSizeshNQ4ISI() {
        java.util.Enumeration<java.net.URL> resources;
        java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
        try {
            java.lang.ClassLoader classLoader = org.slf4j.LoggerFactory.class.getClassLoader();
            if (classLoader == null) {
                resources = java.lang.ClassLoader.getSystemResources("org/slf4j/impl/StaticLoggerBinder.class");
            } else {
                resources = classLoader.getResources("org/slf4j/impl/StaticLoggerBinder.class");
            }
            while (resources.hasMoreElements()) {
                linkedHashSet.add(resources.nextElement());
            }
            return linkedHashSet;
        } catch (java.io.IOException e) {
            org.slf4j.helpers.Reporter.error("Error getting resources from path", e);
            return linkedHashSet;
        }
    }

    private static void getHighSpeedVideoFpsRanges() {
        org.slf4j.helpers.SubstituteServiceProvider substituteServiceProvider = getHighSpeedVideoFpsRangesFor;
        synchronized (substituteServiceProvider) {
            substituteServiceProvider.getSubstituteLoggerFactory().postInitialization();
            for (org.slf4j.helpers.SubstituteLogger substituteLogger : substituteServiceProvider.getSubstituteLoggerFactory().getLoggers()) {
                substituteLogger.setDelegate(getLogger(substituteLogger.getName()));
            }
        }
    }

    public static org.slf4j.Logger getLogger(java.lang.String str) {
        return getILoggerFactory().getLogger(str);
    }

    public static org.slf4j.Logger getLogger(java.lang.Class<?> cls) {
        java.lang.Class<?> callingClass;
        org.slf4j.Logger logger = getLogger(cls.getName());
        if (Camera2StreamConfigurationMap && (callingClass = org.slf4j.helpers.Util.getCallingClass()) != null && (!callingClass.isAssignableFrom(cls))) {
            org.slf4j.helpers.Reporter.warn(java.lang.String.format("Detected logger name mismatch. Given name: \"%s\"; computed name: \"%s\".", logger.getName(), callingClass.getName()));
            org.slf4j.helpers.Reporter.warn("See https://www.slf4j.org/codes.html#loggerNameMismatch for an explanation");
        }
        return logger;
    }

    public static org.slf4j.ILoggerFactory getILoggerFactory() {
        return Camera2StreamConfigurationMap().getLoggerFactory();
    }

    static org.slf4j.spi.SLF4JServiceProvider Camera2StreamConfigurationMap() {
        java.util.ServiceLoader serviceLoader;
        if (getHighResolutionOutputSizeshNQ4ISI == 0) {
            synchronized (org.slf4j.LoggerFactory.class) {
                if (getHighResolutionOutputSizeshNQ4ISI == 0) {
                    getHighResolutionOutputSizeshNQ4ISI = 1;
                    try {
                        java.util.ArrayList<org.slf4j.spi.SLF4JServiceProvider> arrayList = new java.util.ArrayList();
                        final java.lang.ClassLoader classLoader = org.slf4j.LoggerFactory.class.getClassLoader();
                        org.slf4j.spi.SLF4JServiceProvider highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(classLoader);
                        if (highSpeedVideoFpsRangesFor != null) {
                            arrayList.add(highSpeedVideoFpsRangesFor);
                        } else {
                            if (java.lang.System.getSecurityManager() == null) {
                                serviceLoader = java.util.ServiceLoader.load(org.slf4j.spi.SLF4JServiceProvider.class, classLoader);
                            } else {
                                serviceLoader = (java.util.ServiceLoader) java.security.AccessController.doPrivileged(new java.security.PrivilegedAction() { // from class: org.slf4j.LoggerFactory$$ExternalSyntheticLambda0
                                    @Override // java.security.PrivilegedAction
                                    public final java.lang.Object run() {
                                        java.util.ServiceLoader load;
                                        load = java.util.ServiceLoader.load(org.slf4j.spi.SLF4JServiceProvider.class, classLoader);
                                        return load;
                                    }
                                });
                            }
                            java.util.Iterator it = serviceLoader.iterator();
                            while (it.hasNext()) {
                                try {
                                    arrayList.add((org.slf4j.spi.SLF4JServiceProvider) it.next());
                                } catch (java.util.ServiceConfigurationError e) {
                                    java.lang.StringBuilder sb = new java.lang.StringBuilder("A service provider failed to instantiate:\n");
                                    sb.append(e.getMessage());
                                    org.slf4j.helpers.Reporter.error(sb.toString());
                                }
                            }
                        }
                        if (arrayList.size() > 1) {
                            org.slf4j.helpers.Reporter.warn("Class path contains multiple SLF4J providers.");
                            for (org.slf4j.spi.SLF4JServiceProvider sLF4JServiceProvider : arrayList) {
                                java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Found provider [");
                                sb2.append(sLF4JServiceProvider);
                                sb2.append("]");
                                org.slf4j.helpers.Reporter.warn(sb2.toString());
                            }
                            org.slf4j.helpers.Reporter.warn("See https://www.slf4j.org/codes.html#multiple_bindings for an explanation.");
                        }
                        if (!arrayList.isEmpty()) {
                            getHighSpeedVideoSizes = (org.slf4j.spi.SLF4JServiceProvider) arrayList.get(0);
                            org.slf4j.spi.MDCAdapter mDCAdapter = getHighSpeedVideoSizes.getMDCAdapter();
                            if (mDCAdapter != null) {
                                org.slf4j.MDC.getHighResolutionOutputSizeshNQ4ISI(mDCAdapter);
                            }
                            getHighSpeedVideoSizes.initialize();
                            getHighResolutionOutputSizeshNQ4ISI = 3;
                            if (arrayList.isEmpty()) {
                                throw new java.lang.IllegalStateException("No providers were found which is impossible after successful initialization.");
                            }
                            if (arrayList.size() > 1) {
                                java.lang.StringBuilder sb3 = new java.lang.StringBuilder("Actual provider is of type [");
                                sb3.append(arrayList.get(0));
                                sb3.append("]");
                                org.slf4j.helpers.Reporter.info(sb3.toString());
                            } else {
                                org.slf4j.spi.SLF4JServiceProvider sLF4JServiceProvider2 = (org.slf4j.spi.SLF4JServiceProvider) arrayList.get(0);
                                java.lang.StringBuilder sb4 = new java.lang.StringBuilder("Connected with provider of type [");
                                sb4.append(sLF4JServiceProvider2.getClass().getName());
                                sb4.append("]");
                                org.slf4j.helpers.Reporter.debug(sb4.toString());
                            }
                        } else {
                            getHighResolutionOutputSizeshNQ4ISI = 4;
                            org.slf4j.helpers.Reporter.warn("No SLF4J providers were found.");
                            org.slf4j.helpers.Reporter.warn("Defaulting to no-operation (NOP) logger implementation");
                            org.slf4j.helpers.Reporter.warn("See https://www.slf4j.org/codes.html#noProviders for further details.");
                            java.util.Set<java.net.URL> highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI();
                            if (!highResolutionOutputSizeshNQ4ISI.isEmpty()) {
                                org.slf4j.helpers.Reporter.warn("Class path contains SLF4J bindings targeting slf4j-api versions 1.7.x or earlier.");
                                for (java.net.URL url : highResolutionOutputSizeshNQ4ISI) {
                                    java.lang.StringBuilder sb5 = new java.lang.StringBuilder("Ignoring binding found at [");
                                    sb5.append(url);
                                    sb5.append("]");
                                    org.slf4j.helpers.Reporter.warn(sb5.toString());
                                }
                                org.slf4j.helpers.Reporter.warn("See https://www.slf4j.org/codes.html#ignoredBindings for an explanation.");
                            }
                        }
                        getHighSpeedVideoFpsRanges();
                        java.util.concurrent.LinkedBlockingQueue<org.slf4j.event.SubstituteLoggingEvent> eventQueue = getHighSpeedVideoFpsRangesFor.getSubstituteLoggerFactory().getEventQueue();
                        int size = eventQueue.size();
                        java.util.ArrayList<org.slf4j.event.SubstituteLoggingEvent> arrayList2 = new java.util.ArrayList(128);
                        int i = 0;
                        while (eventQueue.drainTo(arrayList2, 128) != 0) {
                            for (org.slf4j.event.SubstituteLoggingEvent substituteLoggingEvent : arrayList2) {
                                if (substituteLoggingEvent != null) {
                                    org.slf4j.helpers.SubstituteLogger logger = substituteLoggingEvent.getLogger();
                                    java.lang.String name2 = logger.getName();
                                    if (logger.isDelegateNull()) {
                                        throw new java.lang.IllegalStateException("Delegate logger cannot be null at this state.");
                                    }
                                    if (!logger.isDelegateNOP()) {
                                        if (logger.isDelegateEventAware()) {
                                            if (logger.isEnabledForLevel(substituteLoggingEvent.getLevel())) {
                                                logger.log(substituteLoggingEvent);
                                            }
                                        } else {
                                            org.slf4j.helpers.Reporter.warn(name2);
                                        }
                                    }
                                }
                                if (i == 0) {
                                    if (!substituteLoggingEvent.getLogger().isDelegateEventAware()) {
                                        if (!substituteLoggingEvent.getLogger().isDelegateNOP()) {
                                            org.slf4j.helpers.Reporter.warn("The following set of substitute loggers may have been accessed");
                                            org.slf4j.helpers.Reporter.warn("during the initialization phase. Logging calls during this");
                                            org.slf4j.helpers.Reporter.warn("phase were not honored. However, subsequent logging calls to these");
                                            org.slf4j.helpers.Reporter.warn("loggers will work as normally expected.");
                                            org.slf4j.helpers.Reporter.warn("See also https://www.slf4j.org/codes.html#substituteLogger");
                                        }
                                    } else {
                                        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("A number (");
                                        sb6.append(size);
                                        sb6.append(") of logging calls during the initialization phase have been intercepted and are");
                                        org.slf4j.helpers.Reporter.warn(sb6.toString());
                                        org.slf4j.helpers.Reporter.warn("now being replayed. These are subject to the filtering rules of the underlying logging system.");
                                        org.slf4j.helpers.Reporter.warn("See also https://www.slf4j.org/codes.html#replay");
                                    }
                                }
                                i++;
                            }
                            arrayList2.clear();
                        }
                        getHighSpeedVideoFpsRangesFor.getSubstituteLoggerFactory().clear();
                        if (getHighResolutionOutputSizeshNQ4ISI == 3) {
                            try {
                                java.lang.String requestedApiVersion = getHighSpeedVideoSizes.getRequestedApiVersion();
                                boolean z = false;
                                for (java.lang.String str : getOutputMinFrameDuration) {
                                    if (requestedApiVersion.startsWith(str)) {
                                        z = true;
                                    }
                                }
                                if (!z) {
                                    java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
                                    sb7.append("The requested version ");
                                    sb7.append(requestedApiVersion);
                                    sb7.append(" by your slf4j provider is not compatible with ");
                                    sb7.append(java.util.Arrays.asList(getOutputMinFrameDuration).toString());
                                    org.slf4j.helpers.Reporter.warn(sb7.toString());
                                    org.slf4j.helpers.Reporter.warn("See https://www.slf4j.org/codes.html#version_mismatch for further details.");
                                }
                            } catch (java.lang.Throwable th) {
                                org.slf4j.helpers.Reporter.error("Unexpected problem occurred during version sanity check", th);
                            }
                        }
                    } catch (java.lang.Exception e2) {
                        getHighResolutionOutputSizeshNQ4ISI = 2;
                        org.slf4j.helpers.Reporter.error("Failed to instantiate SLF4J LoggerFactory", e2);
                        throw new java.lang.IllegalStateException("Unexpected initialization failure", e2);
                    }
                }
            }
        }
        int i2 = getHighResolutionOutputSizeshNQ4ISI;
        if (i2 == 1) {
            return getHighSpeedVideoFpsRangesFor;
        }
        if (i2 == 2) {
            throw new java.lang.IllegalStateException("org.slf4j.LoggerFactory in failed state. Original exception was thrown EARLIER. See also https://www.slf4j.org/codes.html#unsuccessfulInit");
        }
        if (i2 == 3) {
            return getHighSpeedVideoSizes;
        }
        if (i2 == 4) {
            return getHighSpeedVideoFpsRanges;
        }
        throw new java.lang.IllegalStateException("Unreachable code");
    }
}
