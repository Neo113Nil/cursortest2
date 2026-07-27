package com.unity3d.ads.core.data.datasource;

import android.content.Context;
import com.ironsource.C4761z5;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.io.CloseableKt;
import kotlin.io.TextStreamsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;

/* compiled from: AndroidUnityBootConfigDataSource.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/unity3d/ads/core/data/datasource/AndroidUnityBootConfigDataSource;", "Lcom/unity3d/ads/core/data/datasource/UnityBootConfigDataSource;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "getValue", "", "key", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class AndroidUnityBootConfigDataSource implements UnityBootConfigDataSource {
    private final Context context;

    public AndroidUnityBootConfigDataSource(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.unity3d.ads.core.data.datasource.UnityBootConfigDataSource
    public String getValue(String key) {
        Object m8079constructorimpl;
        Intrinsics.checkNotNullParameter(key, "key");
        try {
            Result.Companion companion = Result.INSTANCE;
            AndroidUnityBootConfigDataSource androidUnityBootConfigDataSource = this;
            final String str = key + C4761z5.U;
            final Ref.ObjectRef objectRef = new Ref.ObjectRef();
            InputStream open = this.context.getAssets().open("bin/Data/boot.config");
            try {
                InputStream inputStream = open;
                Intrinsics.checkNotNull(inputStream);
                Reader inputStreamReader = new InputStreamReader(inputStream, Charsets.UTF_8);
                TextStreamsKt.forEachLine(inputStreamReader instanceof BufferedReader ? (BufferedReader) inputStreamReader : new BufferedReader(inputStreamReader, 8192), new Function1() { // from class: com.unity3d.ads.core.data.datasource.AndroidUnityBootConfigDataSource$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Unit value$lambda$2$lambda$1$lambda$0;
                        value$lambda$2$lambda$1$lambda$0 = AndroidUnityBootConfigDataSource.getValue$lambda$2$lambda$1$lambda$0(str, objectRef, (String) obj);
                        return value$lambda$2$lambda$1$lambda$0;
                    }
                });
                Unit unit = Unit.INSTANCE;
                CloseableKt.closeFinally(open, null);
                m8079constructorimpl = Result.m8079constructorimpl((String) objectRef.element);
            } finally {
            }
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m8079constructorimpl = Result.m8079constructorimpl(ResultKt.createFailure(th));
        }
        return (String) (Result.m8085isFailureimpl(m8079constructorimpl) ? null : m8079constructorimpl);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r3v3, types: [T, java.lang.Object, java.lang.String] */
    public static final Unit getValue$lambda$2$lambda$1$lambda$0(String str, Ref.ObjectRef objectRef, String line) {
        Intrinsics.checkNotNullParameter(line, "line");
        if (StringsKt.startsWith$default(line, str, false, 2, (Object) null)) {
            ?? substring = line.substring(str.length());
            Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
            objectRef.element = substring;
        }
        return Unit.INSTANCE;
    }
}
