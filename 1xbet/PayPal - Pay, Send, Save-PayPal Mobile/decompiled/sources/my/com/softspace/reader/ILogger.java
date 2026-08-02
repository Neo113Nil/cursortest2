package my.com.softspace.reader;

/* loaded from: classes17.dex */
public interface ILogger {
    default void d(java.lang.String str, java.lang.String str2) {
    }

    default void d(java.lang.String str, java.lang.String str2, java.lang.Throwable th) {
    }

    default void e(java.lang.String str, java.lang.String str2) {
    }

    default void e(java.lang.String str, java.lang.String str2, java.lang.Throwable th) {
    }

    default void i(java.lang.String str, java.lang.String str2) {
    }

    default void i(java.lang.String str, java.lang.String str2, java.lang.Throwable th) {
    }

    default boolean isEnabled() {
        return false;
    }

    default void v(java.lang.String str, java.lang.String str2) {
    }

    default void v(java.lang.String str, java.lang.String str2, java.lang.Throwable th) {
    }

    default void w(java.lang.String str, java.lang.String str2) {
    }

    default void w(java.lang.String str, java.lang.String str2, java.lang.Throwable th) {
    }

    default void w(java.lang.String str, java.lang.Throwable th) {
    }
}
