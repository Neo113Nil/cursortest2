package codec.language.bm;

/* loaded from: classes7.dex */
public final class c extends codec.language.bm.Languages.LanguageSet {
    @Override // codec.language.bm.Languages.LanguageSet
    public final boolean contains(java.lang.String str) {
        return true;
    }

    @Override // codec.language.bm.Languages.LanguageSet
    public final java.lang.String getAny() {
        throw new java.util.NoSuchElementException("Can't fetch any language from the any language set.");
    }

    @Override // codec.language.bm.Languages.LanguageSet
    public final boolean isEmpty() {
        return false;
    }

    @Override // codec.language.bm.Languages.LanguageSet
    public final boolean isSingleton() {
        return false;
    }

    @Override // codec.language.bm.Languages.LanguageSet
    public final codec.language.bm.Languages.LanguageSet merge(codec.language.bm.Languages.LanguageSet languageSet) {
        return languageSet;
    }

    @Override // codec.language.bm.Languages.LanguageSet
    public final codec.language.bm.Languages.LanguageSet restrictTo(codec.language.bm.Languages.LanguageSet languageSet) {
        return languageSet;
    }

    public final java.lang.String toString() {
        return "ANY_LANGUAGE";
    }
}
