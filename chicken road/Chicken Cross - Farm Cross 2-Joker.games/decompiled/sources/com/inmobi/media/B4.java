package com.inmobi.media;

import android.content.ContentValues;
import com.inmobi.media.core.config.models.Config;
import java.util.ArrayList;
import java.util.List;
import kotlin.ResultKt;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class B4 {

    /* renamed from: a, reason: collision with root package name */
    public final S9 f6468a;

    public B4(S9 databaseHelper) {
        Intrinsics.checkNotNullParameter(databaseHelper, "databaseHelper");
        this.f6468a = databaseHelper;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00b8 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        A4 a4;
        int i;
        Config config;
        long longValue;
        if (continuationImpl instanceof A4) {
            a4 = (A4) continuationImpl;
            int i2 = a4.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                a4.c = i2 - Integer.MIN_VALUE;
                Object obj = a4.f6447a;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = a4.c;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    S9 s9 = this.f6468a;
                    a4.c = 1;
                    s9.getClass();
                    obj = s9.a(new O9(s9, "SELECT * FROM config_db", null), a4);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                ((List) obj).toString();
                ArrayList arrayList = new ArrayList();
                for (ContentValues contentValues : (Iterable) obj) {
                    Intrinsics.checkNotNullParameter(contentValues, "<this>");
                    String asString = contentValues.getAsString("config_value");
                    Long asLong = contentValues.getAsLong("update_ts");
                    try {
                        JSONObject jsonObject = new JSONObject(asString);
                        String configType = contentValues.getAsString("config_type");
                        Intrinsics.checkNotNullExpressionValue(configType, "getAsString(...)");
                        Intrinsics.checkNotNull(asLong);
                        longValue = asLong.longValue();
                        Intrinsics.checkNotNullParameter(configType, "configType");
                        Class type = U4.a(configType);
                        Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
                        Intrinsics.checkNotNullParameter(type, "type");
                        config = (Config) type.cast(AbstractC3875lb.a(jsonObject, type, null, null));
                    } catch (Exception unused) {
                    }
                    if (config != null) {
                        config.setLastUpdateTimeStamp(longValue);
                        String.valueOf(config);
                        if (config == null) {
                            arrayList.add(config);
                        }
                    }
                    config = null;
                    String.valueOf(config);
                    if (config == null) {
                    }
                }
                return arrayList;
            }
        }
        a4 = new A4(this, continuationImpl);
        Object obj2 = a4.f6447a;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = a4.c;
        if (i != 0) {
        }
        ((List) obj2).toString();
        ArrayList arrayList2 = new ArrayList();
        while (r8.hasNext()) {
        }
        return arrayList2;
    }
}
