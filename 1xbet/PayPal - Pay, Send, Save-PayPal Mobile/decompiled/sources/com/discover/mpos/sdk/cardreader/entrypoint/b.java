package com.discover.mpos.sdk.cardreader.entrypoint;

@kotlin.Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 4, 1})
/* loaded from: classes8.dex */
public final /* synthetic */ class b {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f3007a;

    static {
        int[] iArr = new int[com.discover.mpos.sdk.transaction.outcome.OutcomeType.values().length];
        f3007a = iArr;
        iArr[com.discover.mpos.sdk.transaction.outcome.OutcomeType.TRY_AGAIN.ordinal()] = 1;
        iArr[com.discover.mpos.sdk.transaction.outcome.OutcomeType.SELECT_NEXT.ordinal()] = 2;
        iArr[com.discover.mpos.sdk.transaction.outcome.OutcomeType.END_APPLICATION.ordinal()] = 3;
    }
}
