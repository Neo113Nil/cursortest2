package com.paypal.oslo.feature.oneonboarding.data.parser;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001d\u0010\u0006\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001aG\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\b\"\u0004\b\u0000\u0010\u0007*\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\b2\u0006\u0010\u0002\u001a\u00020\u00012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00000\tH\u0080\bø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f\u0082\u0002\u0007\n\u0005\b\u009920\u0001"}, d2 = {"Lcom/paypal/oslo/feature/oneonboarding/graphql/fragment/ContextualInfoFragment;", "Lcom/paypal/oslo/feature/oneonboarding/api/domain/ComponentId;", "componentId", "Lcom/paypal/oslo/feature/oneonboarding/domain/ContextualInfo;", "toContextualInfo-JkG0rbE", "(Lcom/paypal/oslo/feature/oneonboarding/graphql/fragment/ContextualInfoFragment;Ljava/lang/String;)Lcom/paypal/oslo/feature/oneonboarding/domain/ContextualInfo;", "toContextualInfo", "T", "", "Lkotlin/Function1;", "getFragment", "toContextualInfoList-DgUl0Oo", "(Ljava/util/List;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Ljava/util/List;", "toContextualInfoList"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ContextualInfoMapperKt {
    /* renamed from: toContextualInfo-JkG0rbE, reason: not valid java name */
    public static final com.paypal.oslo.feature.oneonboarding.domain.ContextualInfo m16675toContextualInfoJkG0rbE(com.paypal.oslo.feature.oneonboarding.graphql.fragment.ContextualInfoFragment contextualInfoFragment, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contextualInfoFragment, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        java.lang.String issue = contextualInfoFragment.getIssue();
        if (issue != null) {
            return new com.paypal.oslo.feature.oneonboarding.domain.ContextualInfo(str, issue, null, 4, null);
        }
        return null;
    }

    /* renamed from: toContextualInfoList-DgUl0Oo, reason: not valid java name */
    public static final <T> java.util.List<com.paypal.oslo.feature.oneonboarding.domain.ContextualInfo> m16676toContextualInfoListDgUl0Oo(java.util.List<? extends T> list, java.lang.String str, kotlin.jvm.functions.Function1<? super T, com.paypal.oslo.feature.oneonboarding.graphql.fragment.ContextualInfoFragment> function1) {
        java.util.ArrayList arrayList;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        if (list != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.util.Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                com.paypal.oslo.feature.oneonboarding.domain.ContextualInfo m16675toContextualInfoJkG0rbE = m16675toContextualInfoJkG0rbE(function1.invoke(it.next()), str);
                if (m16675toContextualInfoJkG0rbE != null) {
                    arrayList2.add(m16675toContextualInfoJkG0rbE);
                }
            }
            arrayList = arrayList2;
        } else {
            arrayList = null;
        }
        return arrayList == null ? kotlin.collections.CollectionsKt.emptyList() : arrayList;
    }
}
