package R5;

import a.AbstractC0603a;
import f6.C1112e;
import f6.C1113f;
import f6.C1116i;
import java.util.List;
import kotlin.jvm.functions.Function1;
import v0.AbstractC1663a;

/* loaded from: classes2.dex */
public final /* synthetic */ class O implements A5.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6091a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function1 f6092b;

    public /* synthetic */ O(int i7, Function1 function1) {
        this.f6091a = i7;
        this.f6092b = function1;
    }

    @Override // A5.c
    public final void f(Object obj) {
        C1112e e7;
        C1112e e8;
        C1112e e9;
        C1112e e10;
        C1112e e11;
        C1112e e12;
        C1112e e13;
        C1112e e14;
        C1112e e15;
        C1112e e16;
        C1112e e17;
        C1112e e18;
        C1112e e19;
        C1112e e20;
        C1112e e21;
        switch (this.f6091a) {
            case 0:
                boolean z4 = obj instanceof List;
                Function1 function1 = this.f6092b;
                if (z4) {
                    List list = (List) obj;
                    if (list.size() <= 1) {
                        function1.invoke(new C1113f(C1116i.f13008a));
                        break;
                    } else {
                        Object obj2 = list.get(0);
                        t6.h.c(obj2, "null cannot be cast to non-null type kotlin.String");
                        Object obj3 = list.get(1);
                        t6.h.c(obj3, "null cannot be cast to non-null type kotlin.String");
                        e7 = AbstractC0603a.h(new C0405a((String) obj2, (String) obj3, (String) list.get(2)));
                    }
                } else {
                    e7 = AbstractC1663a.e("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebViewClient.urlLoading'.", "");
                }
                AbstractC1663a.l(e7, function1);
                break;
            case 1:
                boolean z7 = obj instanceof List;
                Function1 function12 = this.f6092b;
                if (z7) {
                    List list2 = (List) obj;
                    if (list2.size() <= 1) {
                        function12.invoke(new C1113f(C1116i.f13008a));
                        break;
                    } else {
                        Object obj4 = list2.get(0);
                        t6.h.c(obj4, "null cannot be cast to non-null type kotlin.String");
                        Object obj5 = list2.get(1);
                        t6.h.c(obj5, "null cannot be cast to non-null type kotlin.String");
                        e8 = AbstractC0603a.h(new C0405a((String) obj4, (String) obj5, (String) list2.get(2)));
                    }
                } else {
                    e8 = AbstractC1663a.e("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebViewClient.doUpdateVisitedHistory'.", "");
                }
                AbstractC1663a.l(e8, function12);
                break;
            case 2:
                boolean z8 = obj instanceof List;
                Function1 function13 = this.f6092b;
                if (z8) {
                    List list3 = (List) obj;
                    if (list3.size() <= 1) {
                        function13.invoke(new C1113f(C1116i.f13008a));
                        break;
                    } else {
                        Object obj6 = list3.get(0);
                        t6.h.c(obj6, "null cannot be cast to non-null type kotlin.String");
                        Object obj7 = list3.get(1);
                        t6.h.c(obj7, "null cannot be cast to non-null type kotlin.String");
                        e9 = AbstractC0603a.h(new C0405a((String) obj6, (String) obj7, (String) list3.get(2)));
                    }
                } else {
                    e9 = AbstractC1663a.e("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebViewClient.onReceivedHttpError'.", "");
                }
                AbstractC1663a.l(e9, function13);
                break;
            case 3:
                boolean z9 = obj instanceof List;
                Function1 function14 = this.f6092b;
                if (z9) {
                    List list4 = (List) obj;
                    if (list4.size() <= 1) {
                        function14.invoke(new C1113f(C1116i.f13008a));
                        break;
                    } else {
                        Object obj8 = list4.get(0);
                        t6.h.c(obj8, "null cannot be cast to non-null type kotlin.String");
                        Object obj9 = list4.get(1);
                        t6.h.c(obj9, "null cannot be cast to non-null type kotlin.String");
                        e10 = AbstractC0603a.h(new C0405a((String) obj8, (String) obj9, (String) list4.get(2)));
                    }
                } else {
                    e10 = AbstractC1663a.e("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebViewClient.onLoadResource'.", "");
                }
                AbstractC1663a.l(e10, function14);
                break;
            case 4:
                boolean z10 = obj instanceof List;
                Function1 function15 = this.f6092b;
                if (z10) {
                    List list5 = (List) obj;
                    if (list5.size() <= 1) {
                        function15.invoke(new C1113f(C1116i.f13008a));
                        break;
                    } else {
                        Object obj10 = list5.get(0);
                        t6.h.c(obj10, "null cannot be cast to non-null type kotlin.String");
                        Object obj11 = list5.get(1);
                        t6.h.c(obj11, "null cannot be cast to non-null type kotlin.String");
                        e11 = AbstractC0603a.h(new C0405a((String) obj10, (String) obj11, (String) list5.get(2)));
                    }
                } else {
                    e11 = AbstractC1663a.e("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebViewClient.onReceivedLoginRequest'.", "");
                }
                AbstractC1663a.l(e11, function15);
                break;
            case 5:
                boolean z11 = obj instanceof List;
                Function1 function16 = this.f6092b;
                if (z11) {
                    List list6 = (List) obj;
                    if (list6.size() <= 1) {
                        function16.invoke(new C1113f(C1116i.f13008a));
                        break;
                    } else {
                        Object obj12 = list6.get(0);
                        t6.h.c(obj12, "null cannot be cast to non-null type kotlin.String");
                        Object obj13 = list6.get(1);
                        t6.h.c(obj13, "null cannot be cast to non-null type kotlin.String");
                        e12 = AbstractC0603a.h(new C0405a((String) obj12, (String) obj13, (String) list6.get(2)));
                    }
                } else {
                    e12 = AbstractC1663a.e("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebViewClient.onPageStarted'.", "");
                }
                AbstractC1663a.l(e12, function16);
                break;
            case 6:
                boolean z12 = obj instanceof List;
                Function1 function17 = this.f6092b;
                if (z12) {
                    List list7 = (List) obj;
                    if (list7.size() <= 1) {
                        function17.invoke(new C1113f(C1116i.f13008a));
                        break;
                    } else {
                        Object obj14 = list7.get(0);
                        t6.h.c(obj14, "null cannot be cast to non-null type kotlin.String");
                        Object obj15 = list7.get(1);
                        t6.h.c(obj15, "null cannot be cast to non-null type kotlin.String");
                        e13 = AbstractC0603a.h(new C0405a((String) obj14, (String) obj15, (String) list7.get(2)));
                    }
                } else {
                    e13 = AbstractC1663a.e("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebViewClient.onReceivedClientCertRequest'.", "");
                }
                AbstractC1663a.l(e13, function17);
                break;
            case 7:
                boolean z13 = obj instanceof List;
                Function1 function18 = this.f6092b;
                if (z13) {
                    List list8 = (List) obj;
                    if (list8.size() <= 1) {
                        function18.invoke(new C1113f(C1116i.f13008a));
                        break;
                    } else {
                        Object obj16 = list8.get(0);
                        t6.h.c(obj16, "null cannot be cast to non-null type kotlin.String");
                        Object obj17 = list8.get(1);
                        t6.h.c(obj17, "null cannot be cast to non-null type kotlin.String");
                        e14 = AbstractC0603a.h(new C0405a((String) obj16, (String) obj17, (String) list8.get(2)));
                    }
                } else {
                    e14 = AbstractC1663a.e("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebViewClient.requestLoading'.", "");
                }
                AbstractC1663a.l(e14, function18);
                break;
            case 8:
                boolean z14 = obj instanceof List;
                Function1 function19 = this.f6092b;
                if (z14) {
                    List list9 = (List) obj;
                    if (list9.size() <= 1) {
                        function19.invoke(new C1113f(C1116i.f13008a));
                        break;
                    } else {
                        Object obj18 = list9.get(0);
                        t6.h.c(obj18, "null cannot be cast to non-null type kotlin.String");
                        Object obj19 = list9.get(1);
                        t6.h.c(obj19, "null cannot be cast to non-null type kotlin.String");
                        e15 = AbstractC0603a.h(new C0405a((String) obj18, (String) obj19, (String) list9.get(2)));
                    }
                } else {
                    e15 = AbstractC1663a.e("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebViewClient.onPageCommitVisible'.", "");
                }
                AbstractC1663a.l(e15, function19);
                break;
            case 9:
                boolean z15 = obj instanceof List;
                Function1 function110 = this.f6092b;
                if (z15) {
                    List list10 = (List) obj;
                    if (list10.size() <= 1) {
                        function110.invoke(new C1113f(C1116i.f13008a));
                        break;
                    } else {
                        Object obj20 = list10.get(0);
                        t6.h.c(obj20, "null cannot be cast to non-null type kotlin.String");
                        Object obj21 = list10.get(1);
                        t6.h.c(obj21, "null cannot be cast to non-null type kotlin.String");
                        e16 = AbstractC0603a.h(new C0405a((String) obj20, (String) obj21, (String) list10.get(2)));
                    }
                } else {
                    e16 = AbstractC1663a.e("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebViewClient.onPageFinished'.", "");
                }
                AbstractC1663a.l(e16, function110);
                break;
            case 10:
                boolean z16 = obj instanceof List;
                Function1 function111 = this.f6092b;
                if (z16) {
                    List list11 = (List) obj;
                    if (list11.size() <= 1) {
                        function111.invoke(new C1113f(C1116i.f13008a));
                        break;
                    } else {
                        Object obj22 = list11.get(0);
                        t6.h.c(obj22, "null cannot be cast to non-null type kotlin.String");
                        Object obj23 = list11.get(1);
                        t6.h.c(obj23, "null cannot be cast to non-null type kotlin.String");
                        e17 = AbstractC0603a.h(new C0405a((String) obj22, (String) obj23, (String) list11.get(2)));
                    }
                } else {
                    e17 = AbstractC1663a.e("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebViewClient.onReceivedError'.", "");
                }
                AbstractC1663a.l(e17, function111);
                break;
            case 11:
                boolean z17 = obj instanceof List;
                Function1 function112 = this.f6092b;
                if (z17) {
                    List list12 = (List) obj;
                    if (list12.size() <= 1) {
                        function112.invoke(new C1113f(C1116i.f13008a));
                        break;
                    } else {
                        Object obj24 = list12.get(0);
                        t6.h.c(obj24, "null cannot be cast to non-null type kotlin.String");
                        Object obj25 = list12.get(1);
                        t6.h.c(obj25, "null cannot be cast to non-null type kotlin.String");
                        e18 = AbstractC0603a.h(new C0405a((String) obj24, (String) obj25, (String) list12.get(2)));
                    }
                } else {
                    e18 = AbstractC1663a.e("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebViewClient.onReceivedHttpAuthRequest'.", "");
                }
                AbstractC1663a.l(e18, function112);
                break;
            case 12:
                boolean z18 = obj instanceof List;
                Function1 function113 = this.f6092b;
                if (z18) {
                    List list13 = (List) obj;
                    if (list13.size() <= 1) {
                        function113.invoke(new C1113f(C1116i.f13008a));
                        break;
                    } else {
                        Object obj26 = list13.get(0);
                        t6.h.c(obj26, "null cannot be cast to non-null type kotlin.String");
                        Object obj27 = list13.get(1);
                        t6.h.c(obj27, "null cannot be cast to non-null type kotlin.String");
                        e19 = AbstractC0603a.h(new C0405a((String) obj26, (String) obj27, (String) list13.get(2)));
                    }
                } else {
                    e19 = AbstractC1663a.e("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebViewClient.onFormResubmission'.", "");
                }
                AbstractC1663a.l(e19, function113);
                break;
            case 13:
                boolean z19 = obj instanceof List;
                Function1 function114 = this.f6092b;
                if (z19) {
                    List list14 = (List) obj;
                    if (list14.size() <= 1) {
                        function114.invoke(new C1113f(C1116i.f13008a));
                        break;
                    } else {
                        Object obj28 = list14.get(0);
                        t6.h.c(obj28, "null cannot be cast to non-null type kotlin.String");
                        Object obj29 = list14.get(1);
                        t6.h.c(obj29, "null cannot be cast to non-null type kotlin.String");
                        e20 = AbstractC0603a.h(new C0405a((String) obj28, (String) obj29, (String) list14.get(2)));
                    }
                } else {
                    e20 = AbstractC1663a.e("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebViewClient.onReceivedSslError'.", "");
                }
                AbstractC1663a.l(e20, function114);
                break;
            default:
                boolean z20 = obj instanceof List;
                Function1 function115 = this.f6092b;
                if (z20) {
                    List list15 = (List) obj;
                    if (list15.size() <= 1) {
                        function115.invoke(new C1113f(C1116i.f13008a));
                        break;
                    } else {
                        Object obj30 = list15.get(0);
                        t6.h.c(obj30, "null cannot be cast to non-null type kotlin.String");
                        Object obj31 = list15.get(1);
                        t6.h.c(obj31, "null cannot be cast to non-null type kotlin.String");
                        e21 = AbstractC0603a.h(new C0405a((String) obj30, (String) obj31, (String) list15.get(2)));
                    }
                } else {
                    e21 = AbstractC1663a.e("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebViewClient.onScaleChanged'.", "");
                }
                AbstractC1663a.l(e21, function115);
                break;
        }
    }
}
