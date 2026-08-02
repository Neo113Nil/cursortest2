package com.google.android.gms.common.server.response;

/* loaded from: classes8.dex */
final class zac implements com.google.android.gms.common.server.response.zai {
    @Override // com.google.android.gms.common.server.response.zai
    public final /* synthetic */ java.lang.Object zaa(com.google.android.gms.common.server.response.FastParser fastParser, java.io.BufferedReader bufferedReader) throws com.google.android.gms.common.server.response.FastParser.ParseException, java.io.IOException {
        float zak;
        zak = fastParser.zak(bufferedReader);
        return java.lang.Float.valueOf(zak);
    }

    zac() {
    }
}
