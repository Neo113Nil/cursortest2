package codec.language.bm;

/* loaded from: classes7.dex */
public final class b extends codec.language.bm.Languages.LanguageSet {
    @Override // codec.language.bm.Languages.LanguageSet
    public final boolean contains(java.lang.String str) {
        return false;
    }

    @Override // codec.language.bm.Languages.LanguageSet
    public final java.lang.String getAny() {
        throw new java.util.NoSuchElementException("Can't fetch any language from the empty language set.");
    }

    @Override // codec.language.bm.Languages.LanguageSet
    public final boolean isEmpty() {
        return true;
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
        return this;
    }

    public final java.lang.String toString() {
        return "NO_LANGUAGES";
    }
}
