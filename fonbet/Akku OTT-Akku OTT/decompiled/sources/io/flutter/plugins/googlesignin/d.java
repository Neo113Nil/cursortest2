package io.flutter.plugins.googlesignin;

import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugins.googlesignin.GoogleSignInApi;
import java.io.IOException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import okhttp3.internal.cache.DiskLruCache;

/* loaded from: classes3.dex */
public final /* synthetic */ class d implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ d(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Unit up$lambda$3$0$0;
        Unit newJournalWriter$lambda$3;
        switch (this.a) {
            case 0:
                up$lambda$3$0$0 = GoogleSignInApi.Companion.setUp$lambda$3$0$0((BasicMessageChannel.Reply) this.b, (Result) obj);
                return up$lambda$3$0$0;
            default:
                newJournalWriter$lambda$3 = DiskLruCache.newJournalWriter$lambda$3((DiskLruCache) this.b, (IOException) obj);
                return newJournalWriter$lambda$3;
        }
    }
}
