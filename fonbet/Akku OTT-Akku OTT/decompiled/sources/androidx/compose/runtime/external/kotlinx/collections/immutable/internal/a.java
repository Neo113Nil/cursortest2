package androidx.compose.runtime.external.kotlinx.collections.immutable.internal;

import android.os.Bundle;
import com.google.android.exoplayer2.Bundleable;
import com.google.android.exoplayer2.HeartRating;
import com.google.android.exoplayer2.extractor.DefaultExtractorsFactory;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements Bundleable.Creator, DefaultExtractorsFactory.ExtensionLoader.ConstructorSupplier {
    public static String a(String str, int i, String str2, int i2) {
        return str + i + str2 + i2;
    }

    public static ArrayList b(Map map, Object obj) {
        ArrayList arrayList = new ArrayList();
        map.put(obj, arrayList);
        return arrayList;
    }

    public static void c(Unit unit, Function1 function1) {
        function1.invoke(Result.m1715boximpl(Result.m1716constructorimpl(unit)));
    }

    @Override // com.google.android.exoplayer2.Bundleable.Creator
    public Bundleable fromBundle(Bundle bundle) {
        HeartRating fromBundle;
        fromBundle = HeartRating.fromBundle(bundle);
        return fromBundle;
    }

    @Override // com.google.android.exoplayer2.extractor.DefaultExtractorsFactory.ExtensionLoader.ConstructorSupplier
    public Constructor getConstructor() {
        Constructor flacExtractorConstructor;
        flacExtractorConstructor = DefaultExtractorsFactory.getFlacExtractorConstructor();
        return flacExtractorConstructor;
    }
}
