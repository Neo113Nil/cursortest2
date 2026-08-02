package my.com.softspace.ssfasstapsdk.internal;

/* loaded from: classes17.dex */
public class FasstapSDKLogger implements my.com.softspace.reader.ILogger {
    public static my.com.softspace.ssfasstapsdk.internal.FasstapSDKLogger instance;
    private boolean getHighSpeedVideoSizes;

    public void setLoggerOn(boolean z) {
        this.getHighSpeedVideoSizes = z;
    }

    public FasstapSDKLogger(boolean z) {
        this.getHighSpeedVideoSizes = z;
        instance = this;
    }

    @Override // my.com.softspace.reader.ILogger
    public void i(java.lang.String str, java.lang.String str2) {
        isEnabled();
    }

    @Override // my.com.softspace.reader.ILogger
    public void i(java.lang.String str, java.lang.String str2, java.lang.Throwable th) {
        isEnabled();
    }

    @Override // my.com.softspace.reader.ILogger
    public void e(java.lang.String str, java.lang.String str2) {
        isEnabled();
    }

    @Override // my.com.softspace.reader.ILogger
    public void e(java.lang.String str, java.lang.String str2, java.lang.Throwable th) {
        isEnabled();
    }

    @Override // my.com.softspace.reader.ILogger
    public void d(java.lang.String str, java.lang.String str2) {
        isEnabled();
    }

    @Override // my.com.softspace.reader.ILogger
    public void d(java.lang.String str, java.lang.String str2, java.lang.Throwable th) {
        isEnabled();
    }

    @Override // my.com.softspace.reader.ILogger
    public void v(java.lang.String str, java.lang.String str2) {
        isEnabled();
    }

    @Override // my.com.softspace.reader.ILogger
    public void v(java.lang.String str, java.lang.String str2, java.lang.Throwable th) {
        isEnabled();
    }

    @Override // my.com.softspace.reader.ILogger
    public void w(java.lang.String str, java.lang.String str2) {
        isEnabled();
    }

    @Override // my.com.softspace.reader.ILogger
    public void w(java.lang.String str, java.lang.String str2, java.lang.Throwable th) {
        isEnabled();
    }

    @Override // my.com.softspace.reader.ILogger
    public void w(java.lang.String str, java.lang.Throwable th) {
        isEnabled();
    }

    @Override // my.com.softspace.reader.ILogger
    public boolean isEnabled() {
        return this.getHighSpeedVideoSizes;
    }
}
