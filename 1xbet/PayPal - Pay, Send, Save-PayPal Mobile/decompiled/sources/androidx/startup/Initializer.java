package androidx.startup;

/* loaded from: classes7.dex */
public interface Initializer<T> {
    T create(android.content.Context context);

    java.util.List<java.lang.Class<? extends androidx.startup.Initializer<?>>> dependencies();
}
