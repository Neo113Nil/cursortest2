package androidx.core.app;

/* loaded from: classes.dex */
public final class GrammaticalInflectionManagerCompat {
    public static final int GRAMMATICAL_GENDER_FEMININE = 2;
    public static final int GRAMMATICAL_GENDER_MASCULINE = 3;
    public static final int GRAMMATICAL_GENDER_NEUTRAL = 1;
    public static final int GRAMMATICAL_GENDER_NOT_SPECIFIED = 0;

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface GrammaticalGender {
    }

    private GrammaticalInflectionManagerCompat() {
    }

    public static int getApplicationGrammaticalGender(android.content.Context context) {
        if (android.os.Build.VERSION.SDK_INT >= 34) {
            return androidx.core.app.GrammaticalInflectionManagerCompat.Api34Impl.getApplicationGrammaticalGender(context);
        }
        return 0;
    }

    public static void setRequestedApplicationGrammaticalGender(android.content.Context context, int i) {
        if (android.os.Build.VERSION.SDK_INT >= 34) {
            androidx.core.app.GrammaticalInflectionManagerCompat.Api34Impl.setRequestedApplicationGrammaticalGender(context, i);
        }
    }

    static class Api34Impl {
        private Api34Impl() {
        }

        static int getApplicationGrammaticalGender(android.content.Context context) {
            return getGrammaticalInflectionManager(context).getApplicationGrammaticalGender();
        }

        static void setRequestedApplicationGrammaticalGender(android.content.Context context, int i) {
            getGrammaticalInflectionManager(context).setRequestedApplicationGrammaticalGender(i);
        }

        private static android.app.GrammaticalInflectionManager getGrammaticalInflectionManager(android.content.Context context) {
            return (android.app.GrammaticalInflectionManager) context.getSystemService(android.app.GrammaticalInflectionManager.class);
        }
    }
}
