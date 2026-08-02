package androidx.credentials.exceptions.publickeycredential;

import android.os.Bundle;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.work.ListenableWorker;
import com.google.android.exoplayer2.Bundleable;
import com.google.android.exoplayer2.PlaybackException;
import com.google.android.exoplayer2.ThumbRating;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements CallbackToFutureAdapter.Resolver, Bundleable.Creator {
    public final /* synthetic */ int a;

    public /* synthetic */ a(int i) {
        this.a = i;
    }

    public static int a(int i, int i2, int i3, int i4) {
        return ((i * i2) / i3) + i4;
    }

    public static boolean b(String str, String str2, String str3) {
        return Intrinsics.areEqual(str3, str + str2);
    }

    @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
    public Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
        Object lambda$getForegroundInfoAsync$0;
        lambda$getForegroundInfoAsync$0 = ListenableWorker.lambda$getForegroundInfoAsync$0(completer);
        return lambda$getForegroundInfoAsync$0;
    }

    @Override // com.google.android.exoplayer2.Bundleable.Creator
    public Bundleable fromBundle(Bundle bundle) {
        ThumbRating fromBundle;
        switch (this.a) {
            case 3:
                return new PlaybackException(bundle);
            default:
                fromBundle = ThumbRating.fromBundle(bundle);
                return fromBundle;
        }
    }
}
