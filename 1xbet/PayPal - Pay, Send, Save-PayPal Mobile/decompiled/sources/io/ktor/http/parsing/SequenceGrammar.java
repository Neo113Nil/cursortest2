package io.ktor.http.parsing;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006R \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\u00038\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n"}, d2 = {"Lio/ktor/http/parsing/SequenceGrammar;", "Lio/ktor/http/parsing/Grammar;", "Lio/ktor/http/parsing/ComplexGrammar;", "", "sourceGrammars", "<init>", "(Ljava/util/List;)V", "grammars", "Ljava/util/List;", "getGrammars", "()Ljava/util/List;"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class SequenceGrammar extends io.ktor.http.parsing.Grammar implements io.ktor.http.parsing.ComplexGrammar {
    private final java.util.List<io.ktor.http.parsing.Grammar> grammars;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SequenceGrammar(java.util.List<? extends io.ktor.http.parsing.Grammar> list) {
        super(null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : list) {
            if (obj instanceof io.ktor.http.parsing.SequenceGrammar) {
                kotlin.collections.CollectionsKt.addAll(arrayList, ((io.ktor.http.parsing.ComplexGrammar) obj).getGrammars());
            } else {
                arrayList.add(obj);
            }
        }
        this.grammars = arrayList;
    }

    @Override // io.ktor.http.parsing.ComplexGrammar
    public final java.util.List<io.ktor.http.parsing.Grammar> getGrammars() {
        return this.grammars;
    }
}
