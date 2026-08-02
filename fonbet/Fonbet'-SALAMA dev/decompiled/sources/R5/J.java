package R5;

import a.AbstractC0603a;
import f6.C1116i;
import java.util.List;
import kotlin.jvm.functions.Function1;
import v0.AbstractC1663a;

/* loaded from: classes2.dex */
public final /* synthetic */ class J implements A5.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6082a;

    /* renamed from: b, reason: collision with root package name */
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
                    function1.invoke(new S(AbstractC1663a.e("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onJsPrompt'.", "")));
                    break;
                } else {
                    List list = (List) obj;
                    if (list.size() <= 1) {
                        function1.invoke(new S((String) list.get(0)));
                        break;
                    } else {
                        Object obj2 = list.get(0);
                        t6.h.c(obj2, "null cannot be cast to non-null type kotlin.String");
                        Object obj3 = list.get(1);
                        t6.h.c(obj3, "null cannot be cast to non-null type kotlin.String");
                        function1.invoke(new S(AbstractC0603a.h(new C0405a((String) obj2, (String) obj3, (String) list.get(2)))));
                        break;
                    }
                }
            case 1:
                boolean z7 = obj instanceof List;
                Function1 function12 = (Function1) this.f6083b.f6096b;
                if (!z7) {
                    function12.invoke(new S(AbstractC1663a.e("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onJsAlert'.", "")));
                    break;
                } else {
                    List list2 = (List) obj;
                    if (list2.size() <= 1) {
                        function12.invoke(new S(C1116i.f13008a));
                        break;
                    } else {
                        Object obj4 = list2.get(0);
                        t6.h.c(obj4, "null cannot be cast to non-null type kotlin.String");
                        Object obj5 = list2.get(1);
                        t6.h.c(obj5, "null cannot be cast to non-null type kotlin.String");
                        function12.invoke(new S(AbstractC0603a.h(new C0405a((String) obj4, (String) obj5, (String) list2.get(2)))));
                        break;
                    }
                }
            case 2:
                boolean z8 = obj instanceof List;
                Function1 function13 = (Function1) this.f6083b.f6096b;
                if (!z8) {
                    function13.invoke(new S(AbstractC1663a.e("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onShowFileChooser'.", "")));
                    break;
                } else {
                    List list3 = (List) obj;
                    if (list3.size() <= 1) {
                        if (list3.get(0) != null) {
                            Object obj6 = list3.get(0);
                            t6.h.c(obj6, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            function13.invoke(new S((List) obj6));
                            break;
                        } else {
                            function13.invoke(new S(AbstractC1663a.e("null-error", "Flutter api returned null value for non-null return value.", "")));
                            break;
                        }
                    } else {
                        Object obj7 = list3.get(0);
                        t6.h.c(obj7, "null cannot be cast to non-null type kotlin.String");
                        Object obj8 = list3.get(1);
                        t6.h.c(obj8, "null cannot be cast to non-null type kotlin.String");
                        function13.invoke(new S(AbstractC0603a.h(new C0405a((String) obj7, (String) obj8, (String) list3.get(2)))));
                        break;
                    }
                }
            default:
                boolean z9 = obj instanceof List;
                Function1 function14 = (Function1) this.f6083b.f6096b;
                if (!z9) {
                    function14.invoke(new S(AbstractC1663a.e("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onJsConfirm'.", "")));
                    break;
                } else {
                    List list4 = (List) obj;
                    if (list4.size() <= 1) {
                        if (list4.get(0) != null) {
                            Object obj9 = list4.get(0);
                            t6.h.c(obj9, "null cannot be cast to non-null type kotlin.Boolean");
                            function14.invoke(new S((Boolean) obj9));
                            break;
                        } else {
                            function14.invoke(new S(AbstractC1663a.e("null-error", "Flutter api returned null value for non-null return value.", "")));
                            break;
                        }
                    } else {
                        Object obj10 = list4.get(0);
                        t6.h.c(obj10, "null cannot be cast to non-null type kotlin.String");
                        Object obj11 = list4.get(1);
                        t6.h.c(obj11, "null cannot be cast to non-null type kotlin.String");
                        function14.invoke(new S(AbstractC0603a.h(new C0405a((String) obj10, (String) obj11, (String) list4.get(2)))));
                        break;
                    }
                }
        }
    }
}
