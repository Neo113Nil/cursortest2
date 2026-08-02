package com.apollographql.apollo.api;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u0000*\n\b\u0000\u0010\u0002 \u0001*\u00020\u00012\u00020\u0001:\u0006\u0007\b\t\n\u000b\fB\t\b\u0004¢\u0006\u0004\b\u0003\u0010\u0004J\u0015\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000H'¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0001\u0006\r\u000e\u000f\u0010\u0011\u0012"}, d2 = {"Lcom/apollographql/apollo/api/BooleanExpression;", "", "T", "<init>", "()V", "simplify", "()Lcom/apollographql/apollo/api/BooleanExpression;", "True", "False", "Not", "Or", "And", "Element", "Lcom/apollographql/apollo/api/BooleanExpression$And;", "Lcom/apollographql/apollo/api/BooleanExpression$Element;", "Lcom/apollographql/apollo/api/BooleanExpression$False;", "Lcom/apollographql/apollo/api/BooleanExpression$Not;", "Lcom/apollographql/apollo/api/BooleanExpression$Or;", "Lcom/apollographql/apollo/api/BooleanExpression$True;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class BooleanExpression<T> {
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "This was only used in internal API and shouldn't have been part of the public API. If you needed this, please open an issue.")
    public abstract com.apollographql.apollo.api.BooleanExpression<T> simplify();

    private BooleanExpression() {
    }

    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0000H\u0017¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/apollographql/apollo/api/BooleanExpression$True;", "Lcom/apollographql/apollo/api/BooleanExpression;", "", "<init>", "()V", "simplify", "()Lcom/apollographql/apollo/api/BooleanExpression$True;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class True extends com.apollographql.apollo.api.BooleanExpression {
        public static final com.apollographql.apollo.api.BooleanExpression.True INSTANCE = new com.apollographql.apollo.api.BooleanExpression.True();

        @Override // com.apollographql.apollo.api.BooleanExpression
        @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "This was only used in internal API and shouldn't have been part of the public API. If you needed this, please open an issue.")
        public final com.apollographql.apollo.api.BooleanExpression.True simplify() {
            return this;
        }

        private True() {
            super(null);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0000H\u0017¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/apollographql/apollo/api/BooleanExpression$False;", "Lcom/apollographql/apollo/api/BooleanExpression;", "", "<init>", "()V", "simplify", "()Lcom/apollographql/apollo/api/BooleanExpression$False;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class False extends com.apollographql.apollo.api.BooleanExpression {
        public static final com.apollographql.apollo.api.BooleanExpression.False INSTANCE = new com.apollographql.apollo.api.BooleanExpression.False();

        @Override // com.apollographql.apollo.api.BooleanExpression
        @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "This was only used in internal API and shouldn't have been part of the public API. If you needed this, please open an issue.")
        public final com.apollographql.apollo.api.BooleanExpression.False simplify() {
            return this;
        }

        private False() {
            super(null);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u0000*\n\b\u0001\u0010\u0002 \u0001*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00010\u0003B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003H\u0017¢\u0006\u0004\b\u0007\u0010\bJ\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ&\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0017\u0010\b"}, d2 = {"Lcom/apollographql/apollo/api/BooleanExpression$Not;", "", "T", "Lcom/apollographql/apollo/api/BooleanExpression;", "operand", "<init>", "(Lcom/apollographql/apollo/api/BooleanExpression;)V", "simplify", "()Lcom/apollographql/apollo/api/BooleanExpression;", "component1", "copy", "(Lcom/apollographql/apollo/api/BooleanExpression;)Lcom/apollographql/apollo/api/BooleanExpression$Not;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/apollographql/apollo/api/BooleanExpression;", "getOperand"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Not<T> extends com.apollographql.apollo.api.BooleanExpression<T> {
        private final com.apollographql.apollo.api.BooleanExpression<T> operand;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public Not(com.apollographql.apollo.api.BooleanExpression<? extends T> booleanExpression) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(booleanExpression, "");
            this.operand = booleanExpression;
        }

        public final com.apollographql.apollo.api.BooleanExpression<T> getOperand() {
            return this.operand;
        }

        @Override // com.apollographql.apollo.api.BooleanExpression
        @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "This was only used in internal API and shouldn't have been part of the public API. If you needed this, please open an issue.")
        public final com.apollographql.apollo.api.BooleanExpression<T> simplify() {
            com.apollographql.apollo.api.BooleanExpression<T> booleanExpression = this.operand;
            return booleanExpression instanceof com.apollographql.apollo.api.BooleanExpression.True ? com.apollographql.apollo.api.BooleanExpression.False.INSTANCE : booleanExpression instanceof com.apollographql.apollo.api.BooleanExpression.False ? com.apollographql.apollo.api.BooleanExpression.True.INSTANCE : this;
        }

        public final java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Not(operand=");
            sb.append(this.operand);
            sb.append(')');
            return sb.toString();
        }

        public final int hashCode() {
            return this.operand.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.apollographql.apollo.api.BooleanExpression.Not) && kotlin.jvm.internal.Intrinsics.areEqual(this.operand, ((com.apollographql.apollo.api.BooleanExpression.Not) other).operand);
        }

        public final com.apollographql.apollo.api.BooleanExpression.Not<T> copy(com.apollographql.apollo.api.BooleanExpression<? extends T> operand) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(operand, "");
            return new com.apollographql.apollo.api.BooleanExpression.Not<>(operand);
        }

        public final com.apollographql.apollo.api.BooleanExpression<T> component1() {
            return this.operand;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.apollographql.apollo.api.BooleanExpression.Not copy$default(com.apollographql.apollo.api.BooleanExpression.Not not, com.apollographql.apollo.api.BooleanExpression booleanExpression, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                booleanExpression = not.operand;
            }
            return not.copy(booleanExpression);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\b\u0018\u0000*\b\b\u0001\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00010\u0003B\u001b\u0012\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00030\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0017\b\u0016\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003¢\u0006\u0004\b\u0006\u0010\bJ\u0015\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003H\u0017¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001c\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00030\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ,\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00030\u0004HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R#\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00030\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u000f"}, d2 = {"Lcom/apollographql/apollo/api/BooleanExpression$Or;", "", "T", "Lcom/apollographql/apollo/api/BooleanExpression;", "", "operands", "<init>", "(Ljava/util/Set;)V", "([Lcom/apollographql/apollo/api/BooleanExpression;)V", "simplify", "()Lcom/apollographql/apollo/api/BooleanExpression;", "", "toString", "()Ljava/lang/String;", "component1", "()Ljava/util/Set;", "copy", "(Ljava/util/Set;)Lcom/apollographql/apollo/api/BooleanExpression$Or;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Ljava/util/Set;", "getOperands"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Or<T> extends com.apollographql.apollo.api.BooleanExpression<T> {
        private final java.util.Set<com.apollographql.apollo.api.BooleanExpression<T>> operands;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public Or(java.util.Set<? extends com.apollographql.apollo.api.BooleanExpression<? extends T>> set) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(set, "");
            this.operands = set;
            if (set.isEmpty()) {
                throw new java.lang.IllegalStateException("Apollo: cannot create a 'Or' condition from an empty list".toString());
            }
        }

        public final java.util.Set<com.apollographql.apollo.api.BooleanExpression<T>> getOperands() {
            return this.operands;
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Or(com.apollographql.apollo.api.BooleanExpression<? extends T>... booleanExpressionArr) {
            this(kotlin.collections.ArraysKt.toSet(booleanExpressionArr));
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(booleanExpressionArr, "");
        }

        @Override // com.apollographql.apollo.api.BooleanExpression
        @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "This was only used in internal API and shouldn't have been part of the public API. If you needed this, please open an issue.")
        public final com.apollographql.apollo.api.BooleanExpression<T> simplify() {
            java.util.Set<com.apollographql.apollo.api.BooleanExpression<T>> set = this.operands;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (T t : set) {
                if (!kotlin.jvm.internal.Intrinsics.areEqual((com.apollographql.apollo.api.BooleanExpression) t, com.apollographql.apollo.api.BooleanExpression.False.INSTANCE)) {
                    arrayList.add(t);
                }
            }
            java.util.ArrayList arrayList2 = arrayList;
            java.util.ArrayList arrayList3 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(arrayList2, 10));
            java.util.Iterator<T> it = arrayList2.iterator();
            while (it.hasNext()) {
                arrayList3.add(((com.apollographql.apollo.api.BooleanExpression) it.next()).simplify());
            }
            java.util.ArrayList arrayList4 = arrayList3;
            return arrayList4.contains(com.apollographql.apollo.api.BooleanExpression.True.INSTANCE) ? com.apollographql.apollo.api.BooleanExpression.True.INSTANCE : arrayList4.isEmpty() ? com.apollographql.apollo.api.BooleanExpression.False.INSTANCE : arrayList4.size() == 1 ? (com.apollographql.apollo.api.BooleanExpression) kotlin.collections.CollectionsKt.first((java.util.List) arrayList4) : new com.apollographql.apollo.api.BooleanExpression.Or(kotlin.collections.CollectionsKt.toSet(arrayList4));
        }

        public final java.lang.String toString() {
            return kotlin.collections.CollectionsKt.joinToString$default(this.operands, com.paypal.oslo.feature.bnplacquisition.logger.BnplAcqLoggerConstants.MessageTemplates.SEPARATOR, null, null, 0, null, null, 62, null);
        }

        public final int hashCode() {
            return this.operands.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.apollographql.apollo.api.BooleanExpression.Or) && kotlin.jvm.internal.Intrinsics.areEqual(this.operands, ((com.apollographql.apollo.api.BooleanExpression.Or) other).operands);
        }

        public final com.apollographql.apollo.api.BooleanExpression.Or<T> copy(java.util.Set<? extends com.apollographql.apollo.api.BooleanExpression<? extends T>> operands) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(operands, "");
            return new com.apollographql.apollo.api.BooleanExpression.Or<>(operands);
        }

        public final java.util.Set<com.apollographql.apollo.api.BooleanExpression<T>> component1() {
            return this.operands;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.apollographql.apollo.api.BooleanExpression.Or copy$default(com.apollographql.apollo.api.BooleanExpression.Or or, java.util.Set set, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                set = or.operands;
            }
            return or.copy(set);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u0000*\b\b\u0001\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00010\u0003B\u001b\u0012\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00030\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0017\b\u0016\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003¢\u0006\u0004\b\u0006\u0010\bJ\u0015\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003H\u0017¢\u0006\u0004\b\t\u0010\nJ\u001c\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00030\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ,\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00030\u0004HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R#\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00030\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\f"}, d2 = {"Lcom/apollographql/apollo/api/BooleanExpression$And;", "", "T", "Lcom/apollographql/apollo/api/BooleanExpression;", "", "operands", "<init>", "(Ljava/util/Set;)V", "([Lcom/apollographql/apollo/api/BooleanExpression;)V", "simplify", "()Lcom/apollographql/apollo/api/BooleanExpression;", "component1", "()Ljava/util/Set;", "copy", "(Ljava/util/Set;)Lcom/apollographql/apollo/api/BooleanExpression$And;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/util/Set;", "getOperands"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class And<T> extends com.apollographql.apollo.api.BooleanExpression<T> {
        private final java.util.Set<com.apollographql.apollo.api.BooleanExpression<T>> operands;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public And(java.util.Set<? extends com.apollographql.apollo.api.BooleanExpression<? extends T>> set) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(set, "");
            this.operands = set;
            if (set.isEmpty()) {
                throw new java.lang.IllegalStateException("Apollo: cannot create a 'And' condition from an empty list".toString());
            }
        }

        public final java.util.Set<com.apollographql.apollo.api.BooleanExpression<T>> getOperands() {
            return this.operands;
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public And(com.apollographql.apollo.api.BooleanExpression<? extends T>... booleanExpressionArr) {
            this(kotlin.collections.ArraysKt.toSet(booleanExpressionArr));
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(booleanExpressionArr, "");
        }

        @Override // com.apollographql.apollo.api.BooleanExpression
        @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "This was only used in internal API and shouldn't have been part of the public API. If you needed this, please open an issue.")
        public final com.apollographql.apollo.api.BooleanExpression<T> simplify() {
            java.util.Set<com.apollographql.apollo.api.BooleanExpression<T>> set = this.operands;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (T t : set) {
                if (!kotlin.jvm.internal.Intrinsics.areEqual((com.apollographql.apollo.api.BooleanExpression) t, com.apollographql.apollo.api.BooleanExpression.True.INSTANCE)) {
                    arrayList.add(t);
                }
            }
            java.util.ArrayList arrayList2 = arrayList;
            java.util.ArrayList arrayList3 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(arrayList2, 10));
            java.util.Iterator<T> it = arrayList2.iterator();
            while (it.hasNext()) {
                arrayList3.add(((com.apollographql.apollo.api.BooleanExpression) it.next()).simplify());
            }
            java.util.ArrayList arrayList4 = arrayList3;
            return arrayList4.contains(com.apollographql.apollo.api.BooleanExpression.False.INSTANCE) ? com.apollographql.apollo.api.BooleanExpression.False.INSTANCE : arrayList4.isEmpty() ? com.apollographql.apollo.api.BooleanExpression.True.INSTANCE : arrayList4.size() == 1 ? (com.apollographql.apollo.api.BooleanExpression) kotlin.collections.CollectionsKt.first((java.util.List) arrayList4) : new com.apollographql.apollo.api.BooleanExpression.And(kotlin.collections.CollectionsKt.toSet(arrayList4));
        }

        public final java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("And(operands=");
            sb.append(this.operands);
            sb.append(')');
            return sb.toString();
        }

        public final int hashCode() {
            return this.operands.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.apollographql.apollo.api.BooleanExpression.And) && kotlin.jvm.internal.Intrinsics.areEqual(this.operands, ((com.apollographql.apollo.api.BooleanExpression.And) other).operands);
        }

        public final com.apollographql.apollo.api.BooleanExpression.And<T> copy(java.util.Set<? extends com.apollographql.apollo.api.BooleanExpression<? extends T>> operands) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(operands, "");
            return new com.apollographql.apollo.api.BooleanExpression.And<>(operands);
        }

        public final java.util.Set<com.apollographql.apollo.api.BooleanExpression<T>> component1() {
            return this.operands;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.apollographql.apollo.api.BooleanExpression.And copy$default(com.apollographql.apollo.api.BooleanExpression.And and, java.util.Set set, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                set = and.operands;
            }
            return and.copy(set);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u0000*\n\b\u0001\u0010\u0002 \u0001*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00010\u0003B\u000f\u0012\u0006\u0010\u0004\u001a\u00028\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00010\u0000H\u0017¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00028\u0001HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ \u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\b\b\u0002\u0010\u0004\u001a\u00028\u0001HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0004\u001a\u00028\u00018\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0018\u0010\n"}, d2 = {"Lcom/apollographql/apollo/api/BooleanExpression$Element;", "", "T", "Lcom/apollographql/apollo/api/BooleanExpression;", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "<init>", "(Ljava/lang/Object;)V", "simplify", "()Lcom/apollographql/apollo/api/BooleanExpression$Element;", "component1", "()Ljava/lang/Object;", "copy", "(Ljava/lang/Object;)Lcom/apollographql/apollo/api/BooleanExpression$Element;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/lang/Object;", "getValue"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Element<T> extends com.apollographql.apollo.api.BooleanExpression<T> {
        private final T value;

        @Override // com.apollographql.apollo.api.BooleanExpression
        @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "This was only used in internal API and shouldn't have been part of the public API. If you needed this, please open an issue.")
        public final com.apollographql.apollo.api.BooleanExpression.Element<T> simplify() {
            return this;
        }

        public final T getValue() {
            return this.value;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Element(T t) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(t, "");
            this.value = t;
        }

        public final java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Element(value=");
            sb.append(this.value);
            sb.append(')');
            return sb.toString();
        }

        public final int hashCode() {
            return this.value.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.apollographql.apollo.api.BooleanExpression.Element) && kotlin.jvm.internal.Intrinsics.areEqual(this.value, ((com.apollographql.apollo.api.BooleanExpression.Element) other).value);
        }

        public final com.apollographql.apollo.api.BooleanExpression.Element<T> copy(T value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            return new com.apollographql.apollo.api.BooleanExpression.Element<>(value);
        }

        public final T component1() {
            return this.value;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.apollographql.apollo.api.BooleanExpression.Element copy$default(com.apollographql.apollo.api.BooleanExpression.Element element, java.lang.Object obj, int i, java.lang.Object obj2) {
            if ((i & 1) != 0) {
                obj = element.value;
            }
            return element.copy(obj);
        }
    }

    public /* synthetic */ BooleanExpression(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
