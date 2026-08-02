package kotlin.text.jdk8;

@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0086\u0002¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlin/text/MatchGroupCollection;", "", "name", "Lkotlin/text/MatchGroup;", "get", "(Lkotlin/text/MatchGroupCollection;Ljava/lang/String;)Lkotlin/text/MatchGroup;"}, k = 2, mv = {2, 3, 0}, pn = "", xi = 48)
/* loaded from: classes17.dex */
public final class RegexExtensionsJDK8Kt {
    public static final kotlin.text.MatchGroup get(kotlin.text.MatchGroupCollection matchGroupCollection, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(matchGroupCollection, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.text.MatchNamedGroupCollection matchNamedGroupCollection = matchGroupCollection instanceof kotlin.text.MatchNamedGroupCollection ? (kotlin.text.MatchNamedGroupCollection) matchGroupCollection : null;
        if (matchNamedGroupCollection == null) {
            throw new java.lang.UnsupportedOperationException("Retrieving groups by name is not supported on this platform.");
        }
        return matchNamedGroupCollection.get(str);
    }
}
