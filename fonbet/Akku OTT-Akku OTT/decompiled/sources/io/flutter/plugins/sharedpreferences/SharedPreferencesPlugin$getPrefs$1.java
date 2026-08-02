package io.flutter.plugins.sharedpreferences;

import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import io.flutter.plugins.firebase.crashlytics.Constants;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@DebugMetadata(c = "io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin", f = "SharedPreferencesPlugin.kt", i = {0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1}, l = {256, 258}, m = "getPrefs", n = {"allowList", "allowSet", "filteredMap", "allowList", "allowSet", "filteredMap", UserMetadata.KEYDATA_FILENAME, "$this$forEach$iv", "element$iv", Constants.KEY, "$i$f$forEach", "$i$a$-forEach-SharedPreferencesPlugin$getPrefs$2"}, nl = {257, 259}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3", "L$4", "L$6", "L$7", "I$0", "I$1"}, v = 2)
/* loaded from: classes3.dex */
public final class SharedPreferencesPlugin$getPrefs$1 extends ContinuationImpl {
    int I$0;
    int I$1;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SharedPreferencesPlugin this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SharedPreferencesPlugin$getPrefs$1(SharedPreferencesPlugin sharedPreferencesPlugin, Continuation<? super SharedPreferencesPlugin$getPrefs$1> continuation) {
        super(continuation);
        this.this$0 = sharedPreferencesPlugin;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object prefs;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        prefs = this.this$0.getPrefs(null, this);
        return prefs;
    }
}
