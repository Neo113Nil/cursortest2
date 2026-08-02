package org.bouncycastle.i18n;

/* loaded from: classes17.dex */
public class MissingEntryException extends java.lang.RuntimeException {
    private java.lang.String Camera2StreamConfigurationMap;
    protected final java.lang.String key;
    protected final java.lang.ClassLoader loader;
    protected final java.util.Locale locale;
    protected final java.lang.String resource;

    public java.lang.String getResource() {
        return this.resource;
    }

    public java.util.Locale getLocale() {
        return this.locale;
    }

    public java.lang.String getKey() {
        return this.key;
    }

    public java.lang.String getDebugMsg() {
        if (this.Camera2StreamConfigurationMap == null) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Can not find entry ");
            sb.append(this.key);
            sb.append(" in resource file ");
            sb.append(this.resource);
            sb.append(" for the locale ");
            sb.append(this.locale);
            sb.append(".");
            this.Camera2StreamConfigurationMap = sb.toString();
            java.lang.ClassLoader classLoader = this.loader;
            if (classLoader instanceof java.net.URLClassLoader) {
                java.net.URL[] uRLs = ((java.net.URLClassLoader) classLoader).getURLs();
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                sb2.append(this.Camera2StreamConfigurationMap);
                sb2.append(" The following entries in the classpath were searched: ");
                this.Camera2StreamConfigurationMap = sb2.toString();
                for (int i = 0; i != uRLs.length; i++) {
                    java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
                    sb3.append(this.Camera2StreamConfigurationMap);
                    sb3.append(uRLs[i]);
                    sb3.append(" ");
                    this.Camera2StreamConfigurationMap = sb3.toString();
                }
            }
        }
        return this.Camera2StreamConfigurationMap;
    }

    public java.lang.ClassLoader getClassLoader() {
        return this.loader;
    }

    public MissingEntryException(java.lang.String str, java.lang.Throwable th, java.lang.String str2, java.lang.String str3, java.util.Locale locale, java.lang.ClassLoader classLoader) {
        super(str, th);
        this.resource = str2;
        this.key = str3;
        this.locale = locale;
        this.loader = classLoader;
    }

    public MissingEntryException(java.lang.String str, java.lang.String str2, java.lang.String str3, java.util.Locale locale, java.lang.ClassLoader classLoader) {
        super(str);
        this.resource = str2;
        this.key = str3;
        this.locale = locale;
        this.loader = classLoader;
    }
}
