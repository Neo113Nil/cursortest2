package com.google.android.gms.common.server.response;

/* compiled from: com.google.android.gms:play-services-base@@18.4.0 */
/* loaded from: classes3.dex */
final class zac implements com.google.android.gms.common.server.response.zai {
    zac() {
    }

    @Override // com.google.android.gms.common.server.response.zai
    public final /* synthetic */ java.lang.Object zaa(com.google.android.gms.common.server.response.FastParser fastParser, java.io.BufferedReader bufferedReader) throws com.google.android.gms.common.server.response.FastParser.ParseException, java.io.IOException {
        float zak;
        zak = fastParser.zak(bufferedReader);
        return java.lang.Float.valueOf(zak);
    }
}
