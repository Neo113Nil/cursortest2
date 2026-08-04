package R5;

import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class J implements A5.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6082a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Q f6083b;

    public /* synthetic */ J(Q q7, int i7) {
        this.f6082a = i7;
        this.f6083b = q7;
    }

    @Override // A5.c
    public final void f(Object obj) {
        switch (this.f6082a) {
            case 0:
                boolean z4 = obj instanceof List;
                Function1 function1 = (Function1) this.f6083b.f6096b;
                if (!z4) {
                    function1.invoke(new S(p150v0.a.e("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onJsPrompt'.", "")));
                } else {
                    List list = (List) obj;
                    if (list.size() <= 1) {
                        function1.invoke(new S((String) list.get(0)));
                    } else {
                        Object obj2 = list.get(0);
                        t6.h.c(obj2, "null cannot be cast to non-null type kotlin.String");
                        Object obj3 = list.get(1);
                        t6.h.c(obj3, "null cannot be cast to non-null type kotlin.String");
                        function1.invoke(new S(p003a.a.h(new C0405a((String) obj2, (String) obj3, (String) list.get(2)))));
                    }
                }
                break;
            case 1:
                boolean z7 = obj instanceof List;
                Function1 function2 = (Function1) this.f6083b.f6096b;
                if (!z7) {
                    function2.invoke(new S(p150v0.a.e("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onJsAlert'.", "")));
                } else {
                    List list2 = (List) obj;
                    if (list2.size() <= 1) {
                        function2.invoke(new S(p044f6.i.f13014a));
                    } else {
                        Object obj4 = list2.get(0);
                        t6.h.c(obj4, "null cannot be cast to non-null type kotlin.String");
                        Object obj5 = list2.get(1);
                        t6.h.c(obj5, "null cannot be cast to non-null type kotlin.String");
                        function2.invoke(new S(p003a.a.h(new C0405a((String) obj4, (String) obj5, (String) list2.get(2)))));
                    }
                }
                break;
            case 2:
                boolean z8 = obj instanceof List;
                Function1 function3 = (Function1) this.f6083b.f6096b;
                if (!z8) {
                    function3.invoke(new S(p150v0.a.e("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onShowFileChooser'.", "")));
                } else {
                    List list3 = (List) obj;
                    if (list3.size() > 1) {
                        Object obj6 = list3.get(0);
                        t6.h.c(obj6, "null cannot be cast to non-null type kotlin.String");
                        Object obj7 = list3.get(1);
                        t6.h.c(obj7, "null cannot be cast to non-null type kotlin.String");
                        function3.invoke(new S(p003a.a.h(new C0405a((String) obj6, (String) obj7, (String) list3.get(2)))));
                    } else if (list3.get(0) != null) {
                        Object obj8 = list3.get(0);
                        t6.h.c(obj8, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                        function3.invoke(new S((List) obj8));
                    } else {
                        function3.invoke(new S(p150v0.a.e("null-error", "Flutter api returned null value for non-null return value.", "")));
                    }
                }
                break;
            default:
                boolean z9 = obj instanceof List;
                Function1 function4 = (Function1) this.f6083b.f6096b;
                if (!z9) {
                    function4.invoke(new S(p150v0.a.e("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onJsConfirm'.", "")));
                } else {
                    List list4 = (List) obj;
                    if (list4.size() > 1) {
                        Object obj9 = list4.get(0);
                        t6.h.c(obj9, "null cannot be cast to non-null type kotlin.String");
                        Object obj10 = list4.get(1);
                        t6.h.c(obj10, "null cannot be cast to non-null type kotlin.String");
                        function4.invoke(new S(p003a.a.h(new C0405a((String) obj9, (String) obj10, (String) list4.get(2)))));
                    } else if (list4.get(0) != null) {
                        Object obj11 = list4.get(0);
                        t6.h.c(obj11, "null cannot be cast to non-null type kotlin.Boolean");
                        function4.invoke(new S((Boolean) obj11));
                    } else {
                        function4.invoke(new S(p150v0.a.e("null-error", "Flutter api returned null value for non-null return value.", "")));
                    }
                }
                break;
        }
    }
}
