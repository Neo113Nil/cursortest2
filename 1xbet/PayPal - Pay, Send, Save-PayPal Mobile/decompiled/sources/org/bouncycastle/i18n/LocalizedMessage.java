package org.bouncycastle.i18n;

/* loaded from: classes17.dex */
public class LocalizedMessage {
    public static final java.lang.String DEFAULT_ENCODING = "ISO-8859-1";
    protected org.bouncycastle.i18n.LocalizedMessage.FilteredArguments arguments;
    protected java.lang.String encoding;
    protected org.bouncycastle.i18n.LocalizedMessage.FilteredArguments extraArgs;
    protected org.bouncycastle.i18n.filter.Filter filter;
    protected final java.lang.String id;
    protected java.lang.ClassLoader loader;
    protected final java.lang.String resource;

    public java.lang.String toString() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("Resource: \"");
        stringBuffer.append(this.resource);
        stringBuffer.append("\" Id: \"").append(this.id).append("\" Arguments: ");
        stringBuffer.append(this.arguments.getArguments().length).append(" normal");
        org.bouncycastle.i18n.LocalizedMessage.FilteredArguments filteredArguments = this.extraArgs;
        if (filteredArguments != null && filteredArguments.getArguments().length > 0) {
            stringBuffer.append(", ").append(this.extraArgs.getArguments().length).append(" extra");
        }
        stringBuffer.append(" Encoding: ").append(this.encoding);
        stringBuffer.append(" ClassLoader: ").append(this.loader);
        return stringBuffer.toString();
    }

    public void setFilter(org.bouncycastle.i18n.filter.Filter filter) {
        this.arguments.setFilter(filter);
        org.bouncycastle.i18n.LocalizedMessage.FilteredArguments filteredArguments = this.extraArgs;
        if (filteredArguments != null) {
            filteredArguments.setFilter(filter);
        }
        this.filter = filter;
    }

    public void setExtraArguments(java.lang.Object[] objArr) {
        if (objArr == null) {
            this.extraArgs = null;
            return;
        }
        org.bouncycastle.i18n.LocalizedMessage.FilteredArguments filteredArguments = new org.bouncycastle.i18n.LocalizedMessage.FilteredArguments(objArr);
        this.extraArgs = filteredArguments;
        filteredArguments.setFilter(this.filter);
    }

    public void setExtraArgument(java.lang.Object obj) {
        setExtraArguments(new java.lang.Object[]{obj});
    }

    public void setClassLoader(java.lang.ClassLoader classLoader) {
        this.loader = classLoader;
    }

    public java.lang.String getResource() {
        return this.resource;
    }

    public java.lang.String getId() {
        return this.id;
    }

    public org.bouncycastle.i18n.filter.Filter getFilter() {
        return this.filter;
    }

    public java.lang.Object[] getExtraArgs() {
        org.bouncycastle.i18n.LocalizedMessage.FilteredArguments filteredArguments = this.extraArgs;
        if (filteredArguments == null) {
            return null;
        }
        return filteredArguments.getArguments();
    }

    protected class FilteredArguments {
        protected static final int FILTER = 1;
        protected static final int FILTER_URL = 2;
        protected static final int NO_FILTER = 0;
        protected int[] argFilterType;
        protected java.lang.Object[] arguments;
        protected org.bouncycastle.i18n.filter.Filter filter;
        protected java.lang.Object[] filteredArgs;
        protected boolean[] isLocaleSpecific;
        protected java.lang.Object[] unpackedArgs;

        public void setFilter(org.bouncycastle.i18n.filter.Filter filter) {
            if (filter != this.filter) {
                for (int i = 0; i < this.unpackedArgs.length; i++) {
                    this.filteredArgs[i] = null;
                }
            }
            this.filter = filter;
        }

        public boolean isEmpty() {
            return this.unpackedArgs.length == 0;
        }

        public java.lang.Object[] getFilteredArgs(java.util.Locale locale) {
            java.lang.Object[] objArr = new java.lang.Object[this.unpackedArgs.length];
            int i = 0;
            while (true) {
                java.lang.Object[] objArr2 = this.unpackedArgs;
                if (i >= objArr2.length) {
                    return objArr;
                }
                java.lang.Object obj = this.filteredArgs[i];
                if (obj == null) {
                    java.lang.Object obj2 = objArr2[i];
                    if (this.isLocaleSpecific[i]) {
                        obj = Camera2StreamConfigurationMap(this.argFilterType[i], ((org.bouncycastle.i18n.LocaleString) obj2).getLocaleString(locale));
                    } else {
                        obj = Camera2StreamConfigurationMap(this.argFilterType[i], obj2);
                        this.filteredArgs[i] = obj;
                    }
                }
                objArr[i] = obj;
                i++;
            }
        }

        public org.bouncycastle.i18n.filter.Filter getFilter() {
            return this.filter;
        }

        public java.lang.Object[] getArguments() {
            return this.arguments;
        }

        private java.lang.Object Camera2StreamConfigurationMap(int i, java.lang.Object obj) {
            org.bouncycastle.i18n.filter.Filter filter = this.filter;
            if (filter != null) {
                if (obj == null) {
                    obj = "null";
                }
                if (i != 0) {
                    if (i == 1) {
                        return filter.doFilter(obj.toString());
                    }
                    if (i != 2) {
                        return null;
                    }
                    return filter.doFilterUrl(obj.toString());
                }
            }
            return obj;
        }

        FilteredArguments(java.lang.Object[] objArr) {
            this.filter = null;
            this.arguments = objArr;
            this.unpackedArgs = new java.lang.Object[objArr.length];
            this.filteredArgs = new java.lang.Object[objArr.length];
            this.isLocaleSpecific = new boolean[objArr.length];
            this.argFilterType = new int[objArr.length];
            for (int i = 0; i < objArr.length; i++) {
                java.lang.Object obj = objArr[i];
                if (obj instanceof org.bouncycastle.i18n.filter.TrustedInput) {
                    this.unpackedArgs[i] = ((org.bouncycastle.i18n.filter.TrustedInput) obj).getInput();
                    this.argFilterType[i] = 0;
                } else if (obj instanceof org.bouncycastle.i18n.filter.UntrustedInput) {
                    this.unpackedArgs[i] = ((org.bouncycastle.i18n.filter.UntrustedInput) obj).getInput();
                    if (objArr[i] instanceof org.bouncycastle.i18n.filter.UntrustedUrlInput) {
                        this.argFilterType[i] = 2;
                    } else {
                        this.argFilterType[i] = 1;
                    }
                } else {
                    this.unpackedArgs[i] = obj;
                    this.argFilterType[i] = 1;
                }
                this.isLocaleSpecific[i] = this.unpackedArgs[i] instanceof org.bouncycastle.i18n.LocaleString;
            }
        }

        FilteredArguments(org.bouncycastle.i18n.LocalizedMessage localizedMessage) {
            this(new java.lang.Object[0]);
        }
    }

    public java.lang.String getEntry(java.lang.String str, java.util.Locale locale, java.util.TimeZone timeZone) throws org.bouncycastle.i18n.MissingEntryException {
        java.lang.String str2 = this.id;
        if (str != null) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(str2);
            sb.append(".");
            sb.append(str);
            str2 = sb.toString();
        }
        java.lang.String str3 = str2;
        try {
            java.lang.ClassLoader classLoader = this.loader;
            java.lang.String string = (classLoader == null ? java.util.ResourceBundle.getBundle(this.resource, locale) : java.util.ResourceBundle.getBundle(this.resource, locale, classLoader)).getString(str3);
            if (!this.encoding.equals("ISO-8859-1")) {
                string = new java.lang.String(string.getBytes("ISO-8859-1"), this.encoding);
            }
            if (!this.arguments.isEmpty()) {
                string = formatWithTimeZone(string, this.arguments.getFilteredArgs(locale), locale, timeZone);
            }
            return addExtraArgs(string, locale);
        } catch (java.io.UnsupportedEncodingException e) {
            throw new java.lang.RuntimeException(e);
        } catch (java.util.MissingResourceException unused) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Can't find entry ");
            sb2.append(str3);
            sb2.append(" in resource file ");
            sb2.append(this.resource);
            sb2.append(".");
            java.lang.String obj = sb2.toString();
            java.lang.String str4 = this.resource;
            java.lang.ClassLoader classLoader2 = this.loader;
            if (classLoader2 == null) {
                classLoader2 = getClassLoader();
            }
            throw new org.bouncycastle.i18n.MissingEntryException(obj, str4, str3, locale, classLoader2);
        }
    }

    public java.lang.ClassLoader getClassLoader() {
        return this.loader;
    }

    public java.lang.Object[] getArguments() {
        return this.arguments.getArguments();
    }

    protected java.lang.String formatWithTimeZone(java.lang.String str, java.lang.Object[] objArr, java.util.Locale locale, java.util.TimeZone timeZone) {
        java.text.MessageFormat messageFormat = new java.text.MessageFormat(" ");
        messageFormat.setLocale(locale);
        messageFormat.applyPattern(str);
        if (!timeZone.equals(java.util.TimeZone.getDefault())) {
            java.text.Format[] formats = messageFormat.getFormats();
            for (int i = 0; i < formats.length; i++) {
                java.text.Format format = formats[i];
                if (format instanceof java.text.DateFormat) {
                    java.text.DateFormat dateFormat = (java.text.DateFormat) format;
                    dateFormat.setTimeZone(timeZone);
                    messageFormat.setFormat(i, dateFormat);
                }
            }
        }
        return messageFormat.format(objArr);
    }

    protected java.lang.String addExtraArgs(java.lang.String str, java.util.Locale locale) {
        if (this.extraArgs == null) {
            return str;
        }
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer(str);
        java.lang.Object[] filteredArgs = this.extraArgs.getFilteredArgs(locale);
        for (java.lang.Object obj : filteredArgs) {
            stringBuffer.append(obj);
        }
        return stringBuffer.toString();
    }

    public LocalizedMessage(java.lang.String str, java.lang.String str2, java.lang.Object[] objArr) throws java.lang.NullPointerException {
        this.encoding = "ISO-8859-1";
        this.extraArgs = null;
        this.filter = null;
        this.loader = null;
        if (str == null) {
            throw null;
        }
        if (str2 == null) {
            throw null;
        }
        if (objArr == null) {
            throw null;
        }
        this.id = str2;
        this.resource = str;
        this.arguments = new org.bouncycastle.i18n.LocalizedMessage.FilteredArguments(objArr);
    }

    public LocalizedMessage(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.Object[] objArr) throws java.lang.NullPointerException, java.io.UnsupportedEncodingException {
        this.encoding = "ISO-8859-1";
        this.extraArgs = null;
        this.filter = null;
        this.loader = null;
        if (str == null) {
            throw null;
        }
        if (str2 == null) {
            throw null;
        }
        if (objArr == null) {
            throw null;
        }
        this.id = str2;
        this.resource = str;
        this.arguments = new org.bouncycastle.i18n.LocalizedMessage.FilteredArguments(objArr);
        if (java.nio.charset.Charset.isSupported(str3)) {
            this.encoding = str3;
            return;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("The encoding \"");
        sb.append(str3);
        sb.append("\" is not supported.");
        throw new java.io.UnsupportedEncodingException(sb.toString());
    }

    public LocalizedMessage(java.lang.String str, java.lang.String str2, java.lang.String str3) throws java.lang.NullPointerException, java.io.UnsupportedEncodingException {
        this.encoding = "ISO-8859-1";
        this.extraArgs = null;
        this.filter = null;
        this.loader = null;
        if (str == null) {
            throw null;
        }
        if (str2 == null) {
            throw null;
        }
        this.id = str2;
        this.resource = str;
        this.arguments = new org.bouncycastle.i18n.LocalizedMessage.FilteredArguments(this);
        if (java.nio.charset.Charset.isSupported(str3)) {
            this.encoding = str3;
            return;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("The encoding \"");
        sb.append(str3);
        sb.append("\" is not supported.");
        throw new java.io.UnsupportedEncodingException(sb.toString());
    }

    public LocalizedMessage(java.lang.String str, java.lang.String str2) throws java.lang.NullPointerException {
        this.encoding = "ISO-8859-1";
        this.extraArgs = null;
        this.filter = null;
        this.loader = null;
        if (str == null) {
            throw null;
        }
        if (str2 == null) {
            throw null;
        }
        this.id = str2;
        this.resource = str;
        this.arguments = new org.bouncycastle.i18n.LocalizedMessage.FilteredArguments(this);
    }
}
