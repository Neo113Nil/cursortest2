package defpackage;

import android.os.Bundle;
import androidx.navigation.NavDeepLink;
import kotlin.jvm.functions.Function1;
import kotlin.text.Regex;

/* compiled from: r8-map-id-24254e9e31496375de47ca9ce3233ebe3b0427ab0cb10649855f926fd35e5650 */
/* loaded from: classes.dex */
public final /* synthetic */ class e4 implements Function1 {
    public final /* synthetic */ Bundle b41X89IqSbKt;
    public final /* synthetic */ int oyjLVtGms9eZwJ0;

    public /* synthetic */ e4(int i, Bundle bundle) {
        this.oyjLVtGms9eZwJ0 = i;
        this.b41X89IqSbKt = bundle;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object uypNJrpDByoB(Object obj) {
        boolean containsKey;
        int i = this.oyjLVtGms9eZwJ0;
        Bundle bundle = this.b41X89IqSbKt;
        String str = (String) obj;
        switch (i) {
            case 0:
                Regex regex = NavDeepLink.yRx9jbDCTnXb3;
                str.getClass();
                containsKey = bundle.containsKey(str);
                break;
            default:
                str.getClass();
                containsKey = bundle.containsKey(str);
                break;
        }
        return Boolean.valueOf(!containsKey);
    }
}
