package net.zetetic.database;

/* loaded from: classes5.dex */
public class NoopTarget implements net.zetetic.database.LogTarget {
    @Override // net.zetetic.database.LogTarget
    public boolean isLoggable(java.lang.String str, int i) {
        return false;
    }

    @Override // net.zetetic.database.LogTarget
    public void log(int i, java.lang.String str, java.lang.String str2, java.lang.Throwable th) {
    }
}
