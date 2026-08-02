package com.google.firebase;

import android.content.Context;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.firebase.messaging.FcmBroadcastProcessor;
import com.google.firebase.platforminfo.LibraryVersionComponent;
import io.flutter.plugins.webviewflutter.AndroidWebKitError;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.functions.Function1;

/* loaded from: classes4.dex */
public final /* synthetic */ class c implements LibraryVersionComponent.VersionExtractor, Continuation {
    public static void a(String str, String str2, String str3, Function1 function1) {
        function1.invoke(Result.m1715boximpl(Result.m1716constructorimpl(ResultKt.createFailure(new AndroidWebKitError(str, str2, str3)))));
    }

    @Override // com.google.firebase.platforminfo.LibraryVersionComponent.VersionExtractor
    public String extract(Object obj) {
        String lambda$getComponents$3;
        lambda$getComponents$3 = FirebaseCommonRegistrar.lambda$getComponents$3((Context) obj);
        return lambda$getComponents$3;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        Integer lambda$startMessagingService$1;
        lambda$startMessagingService$1 = FcmBroadcastProcessor.lambda$startMessagingService$1(task);
        return lambda$startMessagingService$1;
    }
}
