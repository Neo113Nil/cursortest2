package dagger.hilt.android.internal;

/* loaded from: classes3.dex */
public final class Contexts {
    public static android.app.Application getApplication(android.content.Context context) {
        if (context instanceof android.app.Application) {
            return (android.app.Application) context;
        }
        android.content.Context context2 = context;
        while (context2 instanceof android.content.ContextWrapper) {
            context2 = ((android.content.ContextWrapper) context2).getBaseContext();
            if (context2 instanceof android.app.Application) {
                return (android.app.Application) context2;
            }
        }
        throw new java.lang.IllegalStateException("Could not find an Application in the given context: ".concat(java.lang.String.valueOf(context)));
    }

    private Contexts() {
    }
}
