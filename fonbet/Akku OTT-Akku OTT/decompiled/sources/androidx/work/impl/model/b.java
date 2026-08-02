package androidx.work.impl.model;

import io.flutter.plugins.webviewflutter.ResultCompat;
import java.util.HashMap;
import java.util.Map;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.AbstractMap;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final /* synthetic */ class b implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ b(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Unit lambda$__fetchRelationshipWorkTagAsjavaLangString$0;
        Unit asCompatCallback$lambda$0;
        CharSequence string$lambda$0;
        switch (this.a) {
            case 0:
                lambda$__fetchRelationshipWorkTagAsjavaLangString$0 = ((WorkSpecDao_Impl) this.b).lambda$__fetchRelationshipWorkTagAsjavaLangString$0((HashMap) obj);
                return lambda$__fetchRelationshipWorkTagAsjavaLangString$0;
            case 1:
                asCompatCallback$lambda$0 = ResultCompat.Companion.asCompatCallback$lambda$0((Function1) this.b, (Result) obj);
                return asCompatCallback$lambda$0;
            default:
                string$lambda$0 = AbstractMap.toString$lambda$0((AbstractMap) this.b, (Map.Entry) obj);
                return string$lambda$0;
        }
    }
}
