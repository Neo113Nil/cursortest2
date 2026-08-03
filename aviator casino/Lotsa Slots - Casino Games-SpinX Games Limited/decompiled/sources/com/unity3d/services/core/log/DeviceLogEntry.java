package com.unity3d.services.core.log;

/* loaded from: classes6.dex */
class DeviceLogEntry {
    private com.unity3d.services.core.log.DeviceLogLevel _logLevel;
    private java.lang.String _originalMessage;
    private java.lang.StackTraceElement _stackTraceElement;

    public DeviceLogEntry(com.unity3d.services.core.log.DeviceLogLevel deviceLogLevel, java.lang.String str, java.lang.StackTraceElement stackTraceElement) {
        this._logLevel = deviceLogLevel;
        this._originalMessage = str;
        this._stackTraceElement = stackTraceElement;
    }

    public com.unity3d.services.core.log.DeviceLogLevel getLogLevel() {
        return this._logLevel;
    }

    public java.lang.String getParsedMessage() {
        java.lang.String str;
        java.lang.String str2;
        int i;
        java.lang.String str3 = this._originalMessage;
        java.lang.StackTraceElement stackTraceElement = this._stackTraceElement;
        if (stackTraceElement == null) {
            str = "UnknownClass";
            str2 = "unknownMethod";
            i = -1;
        } else {
            str = stackTraceElement.getClassName();
            str2 = this._stackTraceElement.getMethodName();
            i = this._stackTraceElement.getLineNumber();
        }
        if (str3 != null && !str3.isEmpty()) {
            str3 = " :: " + str3;
        }
        if (str3 == null) {
            str3 = "";
        }
        return str + "." + str2 + "()" + (" (line:" + i + ")") + str3;
    }
}
