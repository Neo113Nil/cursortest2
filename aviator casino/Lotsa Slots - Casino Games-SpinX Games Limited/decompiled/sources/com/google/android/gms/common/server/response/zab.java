package com.google.android.gms.common.server.response;

/* compiled from: com.google.android.gms:play-services-base@@18.4.0 */
/* loaded from: classes3.dex */
final class zab implements com.google.android.gms.common.server.response.zai {
    zab() {
    }

    @Override // com.google.android.gms.common.server.response.zai
    public final /* synthetic */ java.lang.Object zaa(com.google.android.gms.common.server.response.FastParser fastParser, java.io.BufferedReader bufferedReader) throws com.google.android.gms.common.server.response.FastParser.ParseException, java.io.IOException {
        long zan;
        zan = fastParser.zan(bufferedReader);
        return java.lang.Long.valueOf(zan);
    }
}
