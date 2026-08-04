package R5;

import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class O implements A5.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6091a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function1 f6092b;

    public /* synthetic */ O(int i7, Function1 function1) {
        this.f6091a = i7;
        this.f6092b = function1;
    }

    @Override // A5.c
    public final void f(Object obj) {
        p044f6.e eVarE;
        p044f6.e eVarE2;
        p044f6.e eVarE3;
        p044f6.e eVarE4;
        p044f6.e eVarE5;
        p044f6.e eVarE6;
        p044f6.e eVarE7;
        p044f6.e eVarE8;
        p044f6.e eVarE9;
        p044f6.e eVarE10;
        p044f6.e eVarE11;
        p044f6.e eVarE12;
        p044f6.e eVarE13;
        p044f6.e eVarE14;
        p044f6.e eVarE15;
        switch (this.f6091a) {
            case 0:
                boolean z4 = obj instanceof List;
                Function1 function1 = this.f6092b;
                if (z4) {
                    List list = (List) obj;
                    if (list.size() <= 1) {
                        function1.invoke(new p044f6.f(p044f6.i.f13014a));
                    } else {
                        Object obj2 = list.get(0);
                        t6.h.c(obj2, "null cannot be cast to non-null type kotlin.String");
                        Object obj3 = list.get(1);
                        t6.h.c(obj3, "null cannot be cast to non-null type kotlin.String");
                        eVarE = p003a.a.h(new C0405a((String) obj2, (String) obj3, (String) list.get(2)));
                    }
                } else {
                    eVarE = p150v0.a.e("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebViewClient.urlLoading'.", "");
                }
                p150v0.a.l(eVarE, function1);
                break;
            case 1:
                boolean z7 = obj instanceof List;
                Function1 function2 = this.f6092b;
                if (z7) {
                    List list2 = (List) obj;
                    if (list2.size() <= 1) {
                        function2.invoke(new p044f6.f(p044f6.i.f13014a));
                    } else {
                        Object obj4 = list2.get(0);
                        t6.h.c(obj4, "null cannot be cast to non-null type kotlin.String");
                        Object obj5 = list2.get(1);
                        t6.h.c(obj5, "null cannot be cast to non-null type kotlin.String");
                        eVarE2 = p003a.a.h(new C0405a((String) obj4, (String) obj5, (String) list2.get(2)));
                    }
                } else {
                    eVarE2 = p150v0.a.e("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebViewClient.doUpdateVisitedHistory'.", "");
                }
                p150v0.a.l(eVarE2, function2);
                break;
            case 2:
                boolean z8 = obj instanceof List;
                Function1 function3 = this.f6092b;
                if (z8) {
                    List list3 = (List) obj;
                    if (list3.size() <= 1) {
                        function3.invoke(new p044f6.f(p044f6.i.f13014a));
                    } else {
                        Object obj6 = list3.get(0);
                        t6.h.c(obj6, "null cannot be cast to non-null type kotlin.String");
                        Object obj7 = list3.get(1);
                        t6.h.c(obj7, "null cannot be cast to non-null type kotlin.String");
                        eVarE3 = p003a.a.h(new C0405a((String) obj6, (String) obj7, (String) list3.get(2)));
                    }
                } else {
                    eVarE3 = p150v0.a.e("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebViewClient.onReceivedHttpError'.", "");
                }
                p150v0.a.l(eVarE3, function3);
                break;
            case 3:
                boolean z9 = obj instanceof List;
                Function1 function4 = this.f6092b;
                if (z9) {
                    List list4 = (List) obj;
                    if (list4.size() <= 1) {
                        function4.invoke(new p044f6.f(p044f6.i.f13014a));
                    } else {
                        Object obj8 = list4.get(0);
                        t6.h.c(obj8, "null cannot be cast to non-null type kotlin.String");
                        Object obj9 = list4.get(1);
                        t6.h.c(obj9, "null cannot be cast to non-null type kotlin.String");
                        eVarE4 = p003a.a.h(new C0405a((String) obj8, (String) obj9, (String) list4.get(2)));
                    }
                } else {
                    eVarE4 = p150v0.a.e("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebViewClient.onLoadResource'.", "");
                }
                p150v0.a.l(eVarE4, function4);
                break;
            case 4:
                boolean z10 = obj instanceof List;
                Function1 function5 = this.f6092b;
                if (z10) {
                    List list5 = (List) obj;
                    if (list5.size() <= 1) {
                        function5.invoke(new p044f6.f(p044f6.i.f13014a));
                    } else {
                        Object obj10 = list5.get(0);
                        t6.h.c(obj10, "null cannot be cast to non-null type kotlin.String");
                        Object obj11 = list5.get(1);
                        t6.h.c(obj11, "null cannot be cast to non-null type kotlin.String");
                        eVarE5 = p003a.a.h(new C0405a((String) obj10, (String) obj11, (String) list5.get(2)));
                    }
                } else {
                    eVarE5 = p150v0.a.e("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebViewClient.onReceivedLoginRequest'.", "");
                }
                p150v0.a.l(eVarE5, function5);
                break;
            case 5:
                boolean z11 = obj instanceof List;
                Function1 function6 = this.f6092b;
                if (z11) {
                    List list6 = (List) obj;
                    if (list6.size() <= 1) {
                        function6.invoke(new p044f6.f(p044f6.i.f13014a));
                    } else {
                        Object obj12 = list6.get(0);
                        t6.h.c(obj12, "null cannot be cast to non-null type kotlin.String");
                        Object obj13 = list6.get(1);
                        t6.h.c(obj13, "null cannot be cast to non-null type kotlin.String");
                        eVarE6 = p003a.a.h(new C0405a((String) obj12, (String) obj13, (String) list6.get(2)));
                    }
                } else {
                    eVarE6 = p150v0.a.e("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebViewClient.onPageStarted'.", "");
                }
                p150v0.a.l(eVarE6, function6);
                break;
            case 6:
                boolean z12 = obj instanceof List;
                Function1 function7 = this.f6092b;
                if (z12) {
                    List list7 = (List) obj;
                    if (list7.size() <= 1) {
                        function7.invoke(new p044f6.f(p044f6.i.f13014a));
                    } else {
                        Object obj14 = list7.get(0);
                        t6.h.c(obj14, "null cannot be cast to non-null type kotlin.String");
                        Object obj15 = list7.get(1);
                        t6.h.c(obj15, "null cannot be cast to non-null type kotlin.String");
                        eVarE7 = p003a.a.h(new C0405a((String) obj14, (String) obj15, (String) list7.get(2)));
                    }
                } else {
                    eVarE7 = p150v0.a.e("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebViewClient.onReceivedClientCertRequest'.", "");
                }
                p150v0.a.l(eVarE7, function7);
                break;
            case 7:
                boolean z13 = obj instanceof List;
                Function1 function8 = this.f6092b;
                if (z13) {
                    List list8 = (List) obj;
                    if (list8.size() <= 1) {
                        function8.invoke(new p044f6.f(p044f6.i.f13014a));
                    } else {
                        Object obj16 = list8.get(0);
                        t6.h.c(obj16, "null cannot be cast to non-null type kotlin.String");
                        Object obj17 = list8.get(1);
                        t6.h.c(obj17, "null cannot be cast to non-null type kotlin.String");
                        eVarE8 = p003a.a.h(new C0405a((String) obj16, (String) obj17, (String) list8.get(2)));
                    }
                } else {
                    eVarE8 = p150v0.a.e("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebViewClient.requestLoading'.", "");
                }
                p150v0.a.l(eVarE8, function8);
                break;
            case 8:
                boolean z14 = obj instanceof List;
                Function1 function9 = this.f6092b;
                if (z14) {
                    List list9 = (List) obj;
                    if (list9.size() <= 1) {
                        function9.invoke(new p044f6.f(p044f6.i.f13014a));
                    } else {
                        Object obj18 = list9.get(0);
                        t6.h.c(obj18, "null cannot be cast to non-null type kotlin.String");
                        Object obj19 = list9.get(1);
                        t6.h.c(obj19, "null cannot be cast to non-null type kotlin.String");
                        eVarE9 = p003a.a.h(new C0405a((String) obj18, (String) obj19, (String) list9.get(2)));
                    }
                } else {
                    eVarE9 = p150v0.a.e("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebViewClient.onPageCommitVisible'.", "");
                }
                p150v0.a.l(eVarE9, function9);
                break;
            case 9:
                boolean z15 = obj instanceof List;
                Function1 function10 = this.f6092b;
                if (z15) {
                    List list10 = (List) obj;
                    if (list10.size() <= 1) {
                        function10.invoke(new p044f6.f(p044f6.i.f13014a));
                    } else {
                        Object obj20 = list10.get(0);
                        t6.h.c(obj20, "null cannot be cast to non-null type kotlin.String");
                        Object obj21 = list10.get(1);
                        t6.h.c(obj21, "null cannot be cast to non-null type kotlin.String");
                        eVarE10 = p003a.a.h(new C0405a((String) obj20, (String) obj21, (String) list10.get(2)));
                    }
                } else {
                    eVarE10 = p150v0.a.e("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebViewClient.onPageFinished'.", "");
                }
                p150v0.a.l(eVarE10, function10);
                break;
            case 10:
                boolean z16 = obj instanceof List;
                Function1 function11 = this.f6092b;
                if (z16) {
                    List list11 = (List) obj;
                    if (list11.size() <= 1) {
                        function11.invoke(new p044f6.f(p044f6.i.f13014a));
                    } else {
                        Object obj22 = list11.get(0);
                        t6.h.c(obj22, "null cannot be cast to non-null type kotlin.String");
                        Object obj23 = list11.get(1);
                        t6.h.c(obj23, "null cannot be cast to non-null type kotlin.String");
                        eVarE11 = p003a.a.h(new C0405a((String) obj22, (String) obj23, (String) list11.get(2)));
                    }
                } else {
                    eVarE11 = p150v0.a.e("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebViewClient.onReceivedError'.", "");
                }
                p150v0.a.l(eVarE11, function11);
                break;
            case 11:
                boolean z17 = obj instanceof List;
                Function1 function12 = this.f6092b;
                if (z17) {
                    List list12 = (List) obj;
                    if (list12.size() <= 1) {
                        function12.invoke(new p044f6.f(p044f6.i.f13014a));
                    } else {
                        Object obj24 = list12.get(0);
                        t6.h.c(obj24, "null cannot be cast to non-null type kotlin.String");
                        Object obj25 = list12.get(1);
                        t6.h.c(obj25, "null cannot be cast to non-null type kotlin.String");
                        eVarE12 = p003a.a.h(new C0405a((String) obj24, (String) obj25, (String) list12.get(2)));
                    }
                } else {
                    eVarE12 = p150v0.a.e("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebViewClient.onReceivedHttpAuthRequest'.", "");
                }
                p150v0.a.l(eVarE12, function12);
                break;
            case 12:
                boolean z18 = obj instanceof List;
                Function1 function13 = this.f6092b;
                if (z18) {
                    List list13 = (List) obj;
                    if (list13.size() <= 1) {
                        function13.invoke(new p044f6.f(p044f6.i.f13014a));
                    } else {
                        Object obj26 = list13.get(0);
                        t6.h.c(obj26, "null cannot be cast to non-null type kotlin.String");
                        Object obj27 = list13.get(1);
                        t6.h.c(obj27, "null cannot be cast to non-null type kotlin.String");
                        eVarE13 = p003a.a.h(new C0405a((String) obj26, (String) obj27, (String) list13.get(2)));
                    }
                } else {
                    eVarE13 = p150v0.a.e("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebViewClient.onFormResubmission'.", "");
                }
                p150v0.a.l(eVarE13, function13);
                break;
            case 13:
                boolean z19 = obj instanceof List;
                Function1 function14 = this.f6092b;
                if (z19) {
                    List list14 = (List) obj;
                    if (list14.size() <= 1) {
                        function14.invoke(new p044f6.f(p044f6.i.f13014a));
                    } else {
                        Object obj28 = list14.get(0);
                        t6.h.c(obj28, "null cannot be cast to non-null type kotlin.String");
                        Object obj29 = list14.get(1);
                        t6.h.c(obj29, "null cannot be cast to non-null type kotlin.String");
                        eVarE14 = p003a.a.h(new C0405a((String) obj28, (String) obj29, (String) list14.get(2)));
                    }
                } else {
                    eVarE14 = p150v0.a.e("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebViewClient.onReceivedSslError'.", "");
                }
                p150v0.a.l(eVarE14, function14);
                break;
            default:
                boolean z20 = obj instanceof List;
                Function1 function15 = this.f6092b;
                if (z20) {
                    List list15 = (List) obj;
                    if (list15.size() <= 1) {
                        function15.invoke(new p044f6.f(p044f6.i.f13014a));
                    } else {
                        Object obj30 = list15.get(0);
                        t6.h.c(obj30, "null cannot be cast to non-null type kotlin.String");
                        Object obj31 = list15.get(1);
                        t6.h.c(obj31, "null cannot be cast to non-null type kotlin.String");
                        eVarE15 = p003a.a.h(new C0405a((String) obj30, (String) obj31, (String) list15.get(2)));
                    }
                } else {
                    eVarE15 = p150v0.a.e("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebViewClient.onScaleChanged'.", "");
                }
                p150v0.a.l(eVarE15, function15);
                break;
        }
    }
}
