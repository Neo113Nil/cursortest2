package net.zetetic.database;

/* loaded from: classes5.dex */
public interface LogTarget {
    boolean isLoggable(java.lang.String str, int i);

    void log(int i, java.lang.String str, java.lang.String str2, java.lang.Throwable th);
}
