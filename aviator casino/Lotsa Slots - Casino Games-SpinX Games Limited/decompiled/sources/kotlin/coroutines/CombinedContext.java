package kotlin.coroutines;

/* compiled from: CoroutineContextImpl.kt */
@kotlin.Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u00012\u00060\u0002j\u0002`\u0003:\u0001\"B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0001\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ(\u0010\t\u001a\u0004\u0018\u0001H\n\"\b\b\u0000\u0010\n*\u00020\u00062\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\n0\fH\u0096\u0002¢\u0006\u0002\u0010\rJ5\u0010\u000e\u001a\u0002H\u000f\"\u0004\b\u0000\u0010\u000f2\u0006\u0010\u0010\u001a\u0002H\u000f2\u0018\u0010\u0011\u001a\u0014\u0012\u0004\u0012\u0002H\u000f\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u0002H\u000f0\u0012H\u0016¢\u0006\u0002\u0010\u0013J\u0014\u0010\u0014\u001a\u00020\u00012\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\fH\u0016J\b\u0010\u0015\u001a\u00020\u0016H\u0002J\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\u0010\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0000H\u0002J\u0013\u0010\u001b\u001a\u00020\u00182\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0096\u0002J\b\u0010\u001e\u001a\u00020\u0016H\u0016J\b\u0010\u001f\u001a\u00020 H\u0016J\b\u0010!\u001a\u00020\u001dH\u0002R\u000e\u0010\u0004\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006#"}, d2 = {"Lkotlin/coroutines/CombinedContext;", "Lkotlin/coroutines/CoroutineContext;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "left", "element", "Lkotlin/coroutines/CoroutineContext$Element;", "<init>", "(Lkotlin/coroutines/CoroutineContext;Lkotlin/coroutines/CoroutineContext$Element;)V", "get", androidx.exifinterface.media.ExifInterface.LONGITUDE_EAST, com.ironsource.X3.i.W, "Lkotlin/coroutines/CoroutineContext$Key;", "(Lkotlin/coroutines/CoroutineContext$Key;)Lkotlin/coroutines/CoroutineContext$Element;", "fold", "R", "initial", "operation", "Lkotlin/Function2;", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "minusKey", "size", "", "contains", "", "containsAll", "context", "equals", "other", "", "hashCode", "toString", "", "writeReplace", "Serialized", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CombinedContext implements kotlin.coroutines.CoroutineContext, java.io.Serializable {
    private final kotlin.coroutines.CoroutineContext.Element element;
    private final kotlin.coroutines.CoroutineContext left;

    @Override // kotlin.coroutines.CoroutineContext
    public kotlin.coroutines.CoroutineContext plus(kotlin.coroutines.CoroutineContext coroutineContext) {
        return kotlin.coroutines.CoroutineContext.DefaultImpls.plus(this, coroutineContext);
    }

    public CombinedContext(kotlin.coroutines.CoroutineContext left, kotlin.coroutines.CoroutineContext.Element element) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(left, "left");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(element, "element");
        this.left = left;
        this.element = element;
    }

    @Override // kotlin.coroutines.CoroutineContext
    public <E extends kotlin.coroutines.CoroutineContext.Element> E get(kotlin.coroutines.CoroutineContext.Key<E> key) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "key");
        kotlin.coroutines.CombinedContext combinedContext = this;
        while (true) {
            E e = (E) combinedContext.element.get(key);
            if (e != null) {
                return e;
            }
            kotlin.coroutines.CoroutineContext coroutineContext = combinedContext.left;
            if (coroutineContext instanceof kotlin.coroutines.CombinedContext) {
                combinedContext = (kotlin.coroutines.CombinedContext) coroutineContext;
            } else {
                return (E) coroutineContext.get(key);
            }
        }
    }

    @Override // kotlin.coroutines.CoroutineContext
    public <R> R fold(R initial, kotlin.jvm.functions.Function2<? super R, ? super kotlin.coroutines.CoroutineContext.Element, ? extends R> operation) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(operation, "operation");
        return operation.invoke((java.lang.Object) this.left.fold(initial, operation), this.element);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public kotlin.coroutines.CoroutineContext minusKey(kotlin.coroutines.CoroutineContext.Key<?> key) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "key");
        if (this.element.get(key) != null) {
            return this.left;
        }
        kotlin.coroutines.CoroutineContext minusKey = this.left.minusKey(key);
        return minusKey == this.left ? this : minusKey == kotlin.coroutines.EmptyCoroutineContext.INSTANCE ? this.element : new kotlin.coroutines.CombinedContext(minusKey, this.element);
    }

    private final int size() {
        int i = 2;
        kotlin.coroutines.CombinedContext combinedContext = this;
        while (true) {
            kotlin.coroutines.CoroutineContext coroutineContext = combinedContext.left;
            combinedContext = coroutineContext instanceof kotlin.coroutines.CombinedContext ? (kotlin.coroutines.CombinedContext) coroutineContext : null;
            if (combinedContext == null) {
                return i;
            }
            i++;
        }
    }

    private final boolean contains(kotlin.coroutines.CoroutineContext.Element element) {
        return kotlin.jvm.internal.Intrinsics.areEqual(get(element.getKey()), element);
    }

    private final boolean containsAll(kotlin.coroutines.CombinedContext context) {
        while (contains(context.element)) {
            kotlin.coroutines.CoroutineContext coroutineContext = context.left;
            if (coroutineContext instanceof kotlin.coroutines.CombinedContext) {
                context = (kotlin.coroutines.CombinedContext) coroutineContext;
            } else {
                kotlin.jvm.internal.Intrinsics.checkNotNull(coroutineContext, "null cannot be cast to non-null type kotlin.coroutines.CoroutineContext.Element");
                return contains((kotlin.coroutines.CoroutineContext.Element) coroutineContext);
            }
        }
        return false;
    }

    public boolean equals(java.lang.Object other) {
        if (this != other) {
            if (other instanceof kotlin.coroutines.CombinedContext) {
                kotlin.coroutines.CombinedContext combinedContext = (kotlin.coroutines.CombinedContext) other;
                if (combinedContext.size() != size() || !combinedContext.containsAll(this)) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return this.left.hashCode() + this.element.hashCode();
    }

    public java.lang.String toString() {
        return com.ironsource.X3.j.d + ((java.lang.String) fold("", new kotlin.jvm.functions.Function2() { // from class: kotlin.coroutines.CombinedContext$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                java.lang.String string$lambda$2;
                string$lambda$2 = kotlin.coroutines.CombinedContext.toString$lambda$2((java.lang.String) obj, (kotlin.coroutines.CoroutineContext.Element) obj2);
                return string$lambda$2;
            }
        })) + kotlinx.serialization.json.internal.AbstractJsonLexerKt.END_LIST;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.lang.String toString$lambda$2(java.lang.String acc, kotlin.coroutines.CoroutineContext.Element element) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(acc, "acc");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(element, "element");
        if (acc.length() == 0) {
            return element.toString();
        }
        return acc + ", " + element;
    }

    private final java.lang.Object writeReplace() {
        int size = size();
        final kotlin.coroutines.CoroutineContext[] coroutineContextArr = new kotlin.coroutines.CoroutineContext[size];
        final kotlin.jvm.internal.Ref.IntRef intRef = new kotlin.jvm.internal.Ref.IntRef();
        fold(kotlin.Unit.INSTANCE, new kotlin.jvm.functions.Function2() { // from class: kotlin.coroutines.CombinedContext$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                kotlin.Unit writeReplace$lambda$3;
                writeReplace$lambda$3 = kotlin.coroutines.CombinedContext.writeReplace$lambda$3(coroutineContextArr, intRef, (kotlin.Unit) obj, (kotlin.coroutines.CoroutineContext.Element) obj2);
                return writeReplace$lambda$3;
            }
        });
        if (intRef.element != size) {
            throw new java.lang.IllegalStateException("Check failed.");
        }
        return new kotlin.coroutines.CombinedContext.Serialized(coroutineContextArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit writeReplace$lambda$3(kotlin.coroutines.CoroutineContext[] coroutineContextArr, kotlin.jvm.internal.Ref.IntRef intRef, kotlin.Unit unit, kotlin.coroutines.CoroutineContext.Element element) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(unit, "<unused var>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(element, "element");
        int i = intRef.element;
        intRef.element = i + 1;
        coroutineContextArr[i] = element;
        return kotlin.Unit.INSTANCE;
    }

    /* compiled from: CoroutineContextImpl.kt */
    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0002\u0018\u0000 \r2\u00060\u0001j\u0002`\u0002:\u0001\rB\u0015\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\u000b\u001a\u00020\fH\u0002R\u0019\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\t¨\u0006\u000e"}, d2 = {"Lkotlin/coroutines/CombinedContext$Serialized;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "elements", "", "Lkotlin/coroutines/CoroutineContext;", "<init>", "([Lkotlin/coroutines/CoroutineContext;)V", "getElements", "()[Lkotlin/coroutines/CoroutineContext;", "[Lkotlin/coroutines/CoroutineContext;", "readResolve", "", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class Serialized implements java.io.Serializable {
        private static final long serialVersionUID = 0;
        private final kotlin.coroutines.CoroutineContext[] elements;

        public Serialized(kotlin.coroutines.CoroutineContext[] elements) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(elements, "elements");
            this.elements = elements;
        }

        public final kotlin.coroutines.CoroutineContext[] getElements() {
            return this.elements;
        }

        private final java.lang.Object readResolve() {
            kotlin.coroutines.CoroutineContext[] coroutineContextArr = this.elements;
            kotlin.coroutines.CoroutineContext coroutineContext = kotlin.coroutines.EmptyCoroutineContext.INSTANCE;
            for (kotlin.coroutines.CoroutineContext coroutineContext2 : coroutineContextArr) {
                coroutineContext = coroutineContext.plus(coroutineContext2);
            }
            return coroutineContext;
        }
    }
}
