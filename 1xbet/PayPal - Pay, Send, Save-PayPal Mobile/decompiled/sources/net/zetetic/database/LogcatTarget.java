package net.zetetic.database;

/* loaded from: classes5.dex */
public class LogcatTarget implements net.zetetic.database.LogTarget {
    @Override // net.zetetic.database.LogTarget
    public boolean isLoggable(java.lang.String str, int i) {
        return android.util.Log.isLoggable(str, i);
    }

    @Override // net.zetetic.database.LogTarget
    public void log(int i, java.lang.String str, java.lang.String str2, java.lang.Throwable th) {
        if (i != 7) {
            return;
        }
        android.util.Log.wtf(str, str2, th);
    }
}
