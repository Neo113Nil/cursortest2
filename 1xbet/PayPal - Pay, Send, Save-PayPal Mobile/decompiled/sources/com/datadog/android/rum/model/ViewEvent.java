package com.datadog.android.rum.model;

@kotlin.Metadata(d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b/\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\bi\b\u0086\b\u0018\u0000 \u008e\u00012\u00020\u0001:v\u008f\u0001\u0090\u0001\u0091\u0001\u0092\u0001\u0093\u0001\u0094\u0001\u008e\u0001\u0095\u0001\u0096\u0001\u0097\u0001\u0098\u0001\u0099\u0001\u009a\u0001\u009b\u0001\u009c\u0001\u009d\u0001\u009e\u0001\u009f\u0001 \u0001¡\u0001¢\u0001£\u0001¤\u0001¥\u0001¦\u0001§\u0001¨\u0001©\u0001ª\u0001«\u0001¬\u0001\u00ad\u0001®\u0001¯\u0001°\u0001±\u0001²\u0001³\u0001´\u0001µ\u0001¶\u0001·\u0001¸\u0001¹\u0001º\u0001»\u0001¼\u0001½\u0001¾\u0001¿\u0001À\u0001Á\u0001Â\u0001Ã\u0001Ä\u0001Å\u0001Æ\u0001Ç\u0001È\u0001B\u0087\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\r\u001a\u00020\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001e\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010 \u0012\u0006\u0010#\u001a\u00020\"\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010$\u0012\n\b\u0002\u0010'\u001a\u0004\u0018\u00010&\u0012\n\b\u0002\u0010(\u001a\u0004\u0018\u00010$\u0012\n\b\u0002\u0010*\u001a\u0004\u0018\u00010)¢\u0006\u0004\b+\u0010,J\u0010\u0010-\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b-\u0010.J\u0010\u0010/\u001a\u00020\u0010HÆ\u0003¢\u0006\u0004\b/\u00100J\u0012\u00101\u001a\u0004\u0018\u00010\u0012HÆ\u0003¢\u0006\u0004\b1\u00102J\u0012\u00103\u001a\u0004\u0018\u00010\u0014HÆ\u0003¢\u0006\u0004\b3\u00104J\u0012\u00105\u001a\u0004\u0018\u00010\u0016HÆ\u0003¢\u0006\u0004\b5\u00106J\u0012\u00107\u001a\u0004\u0018\u00010\u0018HÆ\u0003¢\u0006\u0004\b7\u00108J\u0012\u00109\u001a\u0004\u0018\u00010\u001aHÆ\u0003¢\u0006\u0004\b9\u0010:J\u0012\u0010;\u001a\u0004\u0018\u00010\u001cHÆ\u0003¢\u0006\u0004\b;\u0010<J\u0012\u0010=\u001a\u0004\u0018\u00010\u001eHÆ\u0003¢\u0006\u0004\b=\u0010>J\u0012\u0010?\u001a\u0004\u0018\u00010 HÆ\u0003¢\u0006\u0004\b?\u0010@J\u0010\u0010A\u001a\u00020\"HÆ\u0003¢\u0006\u0004\bA\u0010BJ\u0010\u0010C\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\bC\u0010DJ\u0012\u0010E\u001a\u0004\u0018\u00010$HÆ\u0003¢\u0006\u0004\bE\u0010FJ\u0012\u0010G\u001a\u0004\u0018\u00010&HÆ\u0003¢\u0006\u0004\bG\u0010HJ\u0012\u0010I\u001a\u0004\u0018\u00010$HÆ\u0003¢\u0006\u0004\bI\u0010FJ\u0012\u0010J\u001a\u0004\u0018\u00010)HÆ\u0003¢\u0006\u0004\bJ\u0010KJ\u0012\u0010L\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\bL\u0010MJ\u0012\u0010N\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\bN\u0010MJ\u0012\u0010O\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\bO\u0010MJ\u0012\u0010P\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\bP\u0010MJ\u0012\u0010Q\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\bQ\u0010MJ\u0010\u0010R\u001a\u00020\fHÆ\u0003¢\u0006\u0004\bR\u0010SJ\u0012\u0010T\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\bT\u0010UJ\u009a\u0002\u0010V\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\r\u001a\u00020\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010 2\b\b\u0002\u0010#\u001a\u00020\"2\n\b\u0002\u0010%\u001a\u0004\u0018\u00010$2\n\b\u0002\u0010'\u001a\u0004\u0018\u00010&2\n\b\u0002\u0010(\u001a\u0004\u0018\u00010$2\n\b\u0002\u0010*\u001a\u0004\u0018\u00010)HÆ\u0001¢\u0006\u0004\bV\u0010WJ\u001a\u0010Z\u001a\u00020Y2\b\u0010X\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\bZ\u0010[J\u0010\u0010]\u001a\u00020\\HÖ\u0001¢\u0006\u0004\b]\u0010^J\r\u0010`\u001a\u00020_¢\u0006\u0004\b`\u0010aJ\u0010\u0010b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\bb\u0010MR\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0007¢\u0006\f\n\u0004\b\u0015\u0010c\u001a\u0004\bd\u00104R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010e\u001a\u0004\bf\u0010DR\u001c\u0010\n\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010g\u001a\u0004\bh\u0010MR\u001c\u0010\t\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010g\u001a\u0004\bi\u0010MR\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010j\u001a\u0004\bk\u0010<R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010l\u001a\u0004\bm\u00106R\u001c\u0010'\u001a\u0004\u0018\u00010&8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b'\u0010n\u001a\u0004\bo\u0010HR\u001c\u0010%\u001a\u0004\u0018\u00010$8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010p\u001a\u0004\bq\u0010FR\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010r\u001a\u0004\bs\u0010.R\u001a\u0010#\u001a\u00020\"8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010t\u001a\u0004\bu\u0010BR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010g\u001a\u0004\bv\u0010MR\u001c\u0010!\u001a\u0004\u0018\u00010 8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010w\u001a\u0004\bx\u0010@R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010y\u001a\u0004\bz\u00108R\u001c\u0010(\u001a\u0004\u0018\u00010$8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b(\u0010p\u001a\u0004\b{\u0010FR\u001c\u0010\u001f\u001a\u0004\u0018\u00010\u001e8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010|\u001a\u0004\b}\u0010>R\u001c\u0010*\u001a\u0004\u0018\u00010)8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b*\u0010~\u001a\u0004\b\u007f\u0010KR\u001d\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\r\n\u0004\b\u0007\u0010g\u001a\u0005\b\u0080\u0001\u0010MR\u001c\u0010\r\u001a\u00020\f8\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b\r\u0010\u0081\u0001\u001a\u0005\b\u0082\u0001\u0010SR\u001e\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b\u000f\u0010\u0083\u0001\u001a\u0005\b\u0084\u0001\u0010UR\u001e\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b\u001b\u0010\u0085\u0001\u001a\u0005\b\u0086\u0001\u0010:R\u001d\u0010\u0087\u0001\u001a\u00020\u00068\u0007X\u0087D¢\u0006\u000e\n\u0005\b\u0087\u0001\u0010g\u001a\u0005\b\u0088\u0001\u0010MR\u001e\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b\u0013\u0010\u0089\u0001\u001a\u0005\b\u008a\u0001\u00102R\u001d\u0010\b\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\r\n\u0004\b\b\u0010g\u001a\u0005\b\u008b\u0001\u0010MR\u001c\u0010\u0011\u001a\u00020\u00108\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b\u0011\u0010\u008c\u0001\u001a\u0005\b\u008d\u0001\u00100"}, d2 = {"Lcom/datadog/android/rum/model/ViewEvent;", "", "", "date", "Lcom/datadog/android/rum/model/ViewEvent$Application;", "application", "", "service", "version", "buildVersion", "buildId", "ddtags", "Lcom/datadog/android/rum/model/ViewEvent$ViewEventSession;", "session", "Lcom/datadog/android/rum/model/ViewEvent$ViewEventSource;", "source", "Lcom/datadog/android/rum/model/ViewEvent$ViewEventView;", "view", "Lcom/datadog/android/rum/model/ViewEvent$Usr;", "usr", "Lcom/datadog/android/rum/model/ViewEvent$Account;", "account", "Lcom/datadog/android/rum/model/ViewEvent$Connectivity;", "connectivity", "Lcom/datadog/android/rum/model/ViewEvent$Display;", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DISPLAY_NOTIFICATION, "Lcom/datadog/android/rum/model/ViewEvent$Synthetics;", "synthetics", "Lcom/datadog/android/rum/model/ViewEvent$CiTest;", "ciTest", "Lcom/datadog/android/rum/model/ViewEvent$Os;", "os", "Lcom/datadog/android/rum/model/ViewEvent$Device;", "device", "Lcom/datadog/android/rum/model/ViewEvent$Dd;", "dd", "Lcom/datadog/android/rum/model/ViewEvent$Context;", "context", "Lcom/datadog/android/rum/model/ViewEvent$Container;", "container", "featureFlags", "Lcom/datadog/android/rum/model/ViewEvent$Privacy;", com.paypal.oslo.feature.savings.ui.onboarding.SavingsTermsLinkTags.Privacy, "<init>", "(JLcom/datadog/android/rum/model/ViewEvent$Application;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/datadog/android/rum/model/ViewEvent$ViewEventSession;Lcom/datadog/android/rum/model/ViewEvent$ViewEventSource;Lcom/datadog/android/rum/model/ViewEvent$ViewEventView;Lcom/datadog/android/rum/model/ViewEvent$Usr;Lcom/datadog/android/rum/model/ViewEvent$Account;Lcom/datadog/android/rum/model/ViewEvent$Connectivity;Lcom/datadog/android/rum/model/ViewEvent$Display;Lcom/datadog/android/rum/model/ViewEvent$Synthetics;Lcom/datadog/android/rum/model/ViewEvent$CiTest;Lcom/datadog/android/rum/model/ViewEvent$Os;Lcom/datadog/android/rum/model/ViewEvent$Device;Lcom/datadog/android/rum/model/ViewEvent$Dd;Lcom/datadog/android/rum/model/ViewEvent$Context;Lcom/datadog/android/rum/model/ViewEvent$Container;Lcom/datadog/android/rum/model/ViewEvent$Context;Lcom/datadog/android/rum/model/ViewEvent$Privacy;)V", "component1", "()J", "component10", "()Lcom/datadog/android/rum/model/ViewEvent$ViewEventView;", "component11", "()Lcom/datadog/android/rum/model/ViewEvent$Usr;", "component12", "()Lcom/datadog/android/rum/model/ViewEvent$Account;", "component13", "()Lcom/datadog/android/rum/model/ViewEvent$Connectivity;", "component14", "()Lcom/datadog/android/rum/model/ViewEvent$Display;", "component15", "()Lcom/datadog/android/rum/model/ViewEvent$Synthetics;", "component16", "()Lcom/datadog/android/rum/model/ViewEvent$CiTest;", "component17", "()Lcom/datadog/android/rum/model/ViewEvent$Os;", "component18", "()Lcom/datadog/android/rum/model/ViewEvent$Device;", "component19", "()Lcom/datadog/android/rum/model/ViewEvent$Dd;", "component2", "()Lcom/datadog/android/rum/model/ViewEvent$Application;", "component20", "()Lcom/datadog/android/rum/model/ViewEvent$Context;", "component21", "()Lcom/datadog/android/rum/model/ViewEvent$Container;", "component22", "component23", "()Lcom/datadog/android/rum/model/ViewEvent$Privacy;", "component3", "()Ljava/lang/String;", "component4", "component5", "component6", "component7", "component8", "()Lcom/datadog/android/rum/model/ViewEvent$ViewEventSession;", "component9", "()Lcom/datadog/android/rum/model/ViewEvent$ViewEventSource;", "copy", "(JLcom/datadog/android/rum/model/ViewEvent$Application;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/datadog/android/rum/model/ViewEvent$ViewEventSession;Lcom/datadog/android/rum/model/ViewEvent$ViewEventSource;Lcom/datadog/android/rum/model/ViewEvent$ViewEventView;Lcom/datadog/android/rum/model/ViewEvent$Usr;Lcom/datadog/android/rum/model/ViewEvent$Account;Lcom/datadog/android/rum/model/ViewEvent$Connectivity;Lcom/datadog/android/rum/model/ViewEvent$Display;Lcom/datadog/android/rum/model/ViewEvent$Synthetics;Lcom/datadog/android/rum/model/ViewEvent$CiTest;Lcom/datadog/android/rum/model/ViewEvent$Os;Lcom/datadog/android/rum/model/ViewEvent$Device;Lcom/datadog/android/rum/model/ViewEvent$Dd;Lcom/datadog/android/rum/model/ViewEvent$Context;Lcom/datadog/android/rum/model/ViewEvent$Container;Lcom/datadog/android/rum/model/ViewEvent$Context;Lcom/datadog/android/rum/model/ViewEvent$Privacy;)Lcom/datadog/android/rum/model/ViewEvent;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lcom/google/gson/JsonElement;", "toJson", "()Lcom/google/gson/JsonElement;", "toString", "Lcom/datadog/android/rum/model/ViewEvent$Account;", "getAccount", "Lcom/datadog/android/rum/model/ViewEvent$Application;", "getApplication", "Ljava/lang/String;", "getBuildId", "getBuildVersion", "Lcom/datadog/android/rum/model/ViewEvent$CiTest;", "getCiTest", "Lcom/datadog/android/rum/model/ViewEvent$Connectivity;", "getConnectivity", "Lcom/datadog/android/rum/model/ViewEvent$Container;", "getContainer", "Lcom/datadog/android/rum/model/ViewEvent$Context;", "getContext", "J", "getDate", "Lcom/datadog/android/rum/model/ViewEvent$Dd;", "getDd", "getDdtags", "Lcom/datadog/android/rum/model/ViewEvent$Device;", "getDevice", "Lcom/datadog/android/rum/model/ViewEvent$Display;", "getDisplay", "getFeatureFlags", "Lcom/datadog/android/rum/model/ViewEvent$Os;", "getOs", "Lcom/datadog/android/rum/model/ViewEvent$Privacy;", "getPrivacy", "getService", "Lcom/datadog/android/rum/model/ViewEvent$ViewEventSession;", "getSession", "Lcom/datadog/android/rum/model/ViewEvent$ViewEventSource;", "getSource", "Lcom/datadog/android/rum/model/ViewEvent$Synthetics;", "getSynthetics", "type", "getType", "Lcom/datadog/android/rum/model/ViewEvent$Usr;", "getUsr", "getVersion", "Lcom/datadog/android/rum/model/ViewEvent$ViewEventView;", "getView", "Companion", "Accessibility", "Account", "Action", "Application", "Cellular", "CiTest", com.adobe.marketing.mobile.internal.configuration.ConfigurationExtension.TAG, "Connectivity", "ConnectivityStatus", androidx.compose.material3.internal.TextFieldImplKt.ContainerId, "ContainerView", "Context", "Crash", "CustomTimings", "Dd", "DdCls", "DdSession", "Device", "DeviceType", "Display", "EffectiveType", "Error", "ErrorReason", "Fbc", "Fcp", "Fid", "FlutterBuildTime", "FrozenFrame", "Frustration", "InForegroundPeriod", "Inp", "Interface", "Lcp", "LoadingType", "LongTask", "Os", "PageState", "Performance", "PerformanceCls", "Plan", "PreviousRect", "Privacy", "Profiling", "ProfilingStatus", "ReplayLevel", "ReplayStats", "Resource", "Scroll", "SessionPrecondition", "SlowFrame", "State", "Synthetics", "Usr", "ViewEventSession", "ViewEventSessionType", "ViewEventSource", "ViewEventView", "Viewport"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class ViewEvent {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.datadog.android.rum.model.ViewEvent.Companion INSTANCE = new com.datadog.android.rum.model.ViewEvent.Companion(null);
    private final com.datadog.android.rum.model.ViewEvent.Account account;
    private final com.datadog.android.rum.model.ViewEvent.Application application;
    private final java.lang.String buildId;
    private final java.lang.String buildVersion;
    private final com.datadog.android.rum.model.ViewEvent.CiTest ciTest;
    private final com.datadog.android.rum.model.ViewEvent.Connectivity connectivity;
    private final com.datadog.android.rum.model.ViewEvent.Container container;
    private final com.datadog.android.rum.model.ViewEvent.Context context;
    private final long date;
    private final com.datadog.android.rum.model.ViewEvent.Dd dd;
    private final java.lang.String ddtags;
    private final com.datadog.android.rum.model.ViewEvent.Device device;
    private final com.datadog.android.rum.model.ViewEvent.Display display;
    private final com.datadog.android.rum.model.ViewEvent.Context featureFlags;
    private final com.datadog.android.rum.model.ViewEvent.Os os;
    private final com.datadog.android.rum.model.ViewEvent.Privacy privacy;
    private final java.lang.String service;
    private final com.datadog.android.rum.model.ViewEvent.ViewEventSession session;
    private final com.datadog.android.rum.model.ViewEvent.ViewEventSource source;
    private final com.datadog.android.rum.model.ViewEvent.Synthetics synthetics;
    private final java.lang.String type;
    private final com.datadog.android.rum.model.ViewEvent.Usr usr;
    private final java.lang.String version;
    private final com.datadog.android.rum.model.ViewEvent.ViewEventView view;

    public ViewEvent(long j, com.datadog.android.rum.model.ViewEvent.Application application, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, com.datadog.android.rum.model.ViewEvent.ViewEventSession viewEventSession, com.datadog.android.rum.model.ViewEvent.ViewEventSource viewEventSource, com.datadog.android.rum.model.ViewEvent.ViewEventView viewEventView, com.datadog.android.rum.model.ViewEvent.Usr usr, com.datadog.android.rum.model.ViewEvent.Account account, com.datadog.android.rum.model.ViewEvent.Connectivity connectivity, com.datadog.android.rum.model.ViewEvent.Display display, com.datadog.android.rum.model.ViewEvent.Synthetics synthetics, com.datadog.android.rum.model.ViewEvent.CiTest ciTest, com.datadog.android.rum.model.ViewEvent.Os os, com.datadog.android.rum.model.ViewEvent.Device device, com.datadog.android.rum.model.ViewEvent.Dd dd, com.datadog.android.rum.model.ViewEvent.Context context, com.datadog.android.rum.model.ViewEvent.Container container, com.datadog.android.rum.model.ViewEvent.Context context2, com.datadog.android.rum.model.ViewEvent.Privacy privacy) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(application, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(viewEventSession, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(viewEventView, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dd, "");
        this.date = j;
        this.application = application;
        this.service = str;
        this.version = str2;
        this.buildVersion = str3;
        this.buildId = str4;
        this.ddtags = str5;
        this.session = viewEventSession;
        this.source = viewEventSource;
        this.view = viewEventView;
        this.usr = usr;
        this.account = account;
        this.connectivity = connectivity;
        this.display = display;
        this.synthetics = synthetics;
        this.ciTest = ciTest;
        this.os = os;
        this.device = device;
        this.dd = dd;
        this.context = context;
        this.container = container;
        this.featureFlags = context2;
        this.privacy = privacy;
        this.type = "view";
    }

    public /* synthetic */ ViewEvent(long j, com.datadog.android.rum.model.ViewEvent.Application application, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, com.datadog.android.rum.model.ViewEvent.ViewEventSession viewEventSession, com.datadog.android.rum.model.ViewEvent.ViewEventSource viewEventSource, com.datadog.android.rum.model.ViewEvent.ViewEventView viewEventView, com.datadog.android.rum.model.ViewEvent.Usr usr, com.datadog.android.rum.model.ViewEvent.Account account, com.datadog.android.rum.model.ViewEvent.Connectivity connectivity, com.datadog.android.rum.model.ViewEvent.Display display, com.datadog.android.rum.model.ViewEvent.Synthetics synthetics, com.datadog.android.rum.model.ViewEvent.CiTest ciTest, com.datadog.android.rum.model.ViewEvent.Os os, com.datadog.android.rum.model.ViewEvent.Device device, com.datadog.android.rum.model.ViewEvent.Dd dd, com.datadog.android.rum.model.ViewEvent.Context context, com.datadog.android.rum.model.ViewEvent.Container container, com.datadog.android.rum.model.ViewEvent.Context context2, com.datadog.android.rum.model.ViewEvent.Privacy privacy, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(j, application, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? null : str4, (i & 64) != 0 ? null : str5, viewEventSession, (i & 256) != 0 ? null : viewEventSource, viewEventView, (i & 1024) != 0 ? null : usr, (i & 2048) != 0 ? null : account, (i & 4096) != 0 ? null : connectivity, (i & 8192) != 0 ? null : display, (i & 16384) != 0 ? null : synthetics, (32768 & i) != 0 ? null : ciTest, (65536 & i) != 0 ? null : os, (131072 & i) != 0 ? null : device, dd, (524288 & i) != 0 ? null : context, (1048576 & i) != 0 ? null : container, (2097152 & i) != 0 ? null : context2, (i & 4194304) != 0 ? null : privacy);
    }

    public final long getDate() {
        return this.date;
    }

    public final com.datadog.android.rum.model.ViewEvent.Application getApplication() {
        return this.application;
    }

    public final java.lang.String getService() {
        return this.service;
    }

    public final java.lang.String getVersion() {
        return this.version;
    }

    public final java.lang.String getBuildVersion() {
        return this.buildVersion;
    }

    public final java.lang.String getBuildId() {
        return this.buildId;
    }

    public final java.lang.String getDdtags() {
        return this.ddtags;
    }

    public final com.datadog.android.rum.model.ViewEvent.ViewEventSession getSession() {
        return this.session;
    }

    public final com.datadog.android.rum.model.ViewEvent.ViewEventSource getSource() {
        return this.source;
    }

    public final com.datadog.android.rum.model.ViewEvent.ViewEventView getView() {
        return this.view;
    }

    public final com.datadog.android.rum.model.ViewEvent.Usr getUsr() {
        return this.usr;
    }

    public final com.datadog.android.rum.model.ViewEvent.Account getAccount() {
        return this.account;
    }

    public final com.datadog.android.rum.model.ViewEvent.Connectivity getConnectivity() {
        return this.connectivity;
    }

    public final com.datadog.android.rum.model.ViewEvent.Display getDisplay() {
        return this.display;
    }

    public final com.datadog.android.rum.model.ViewEvent.Synthetics getSynthetics() {
        return this.synthetics;
    }

    public final com.datadog.android.rum.model.ViewEvent.CiTest getCiTest() {
        return this.ciTest;
    }

    public final com.datadog.android.rum.model.ViewEvent.Os getOs() {
        return this.os;
    }

    public final com.datadog.android.rum.model.ViewEvent.Device getDevice() {
        return this.device;
    }

    public final com.datadog.android.rum.model.ViewEvent.Dd getDd() {
        return this.dd;
    }

    public final com.datadog.android.rum.model.ViewEvent.Context getContext() {
        return this.context;
    }

    public final com.datadog.android.rum.model.ViewEvent.Container getContainer() {
        return this.container;
    }

    public final com.datadog.android.rum.model.ViewEvent.Context getFeatureFlags() {
        return this.featureFlags;
    }

    public final com.datadog.android.rum.model.ViewEvent.Privacy getPrivacy() {
        return this.privacy;
    }

    public final java.lang.String getType() {
        return this.type;
    }

    public final com.google.gson.JsonElement toJson() {
        com.google.gson.JsonObject jsonObject = new com.google.gson.JsonObject();
        jsonObject.addProperty("date", java.lang.Long.valueOf(this.date));
        jsonObject.add("application", this.application.toJson());
        java.lang.String str = this.service;
        if (str != null) {
            jsonObject.addProperty("service", str);
        }
        java.lang.String str2 = this.version;
        if (str2 != null) {
            jsonObject.addProperty("version", str2);
        }
        java.lang.String str3 = this.buildVersion;
        if (str3 != null) {
            jsonObject.addProperty("build_version", str3);
        }
        java.lang.String str4 = this.buildId;
        if (str4 != null) {
            jsonObject.addProperty("build_id", str4);
        }
        java.lang.String str5 = this.ddtags;
        if (str5 != null) {
            jsonObject.addProperty("ddtags", str5);
        }
        jsonObject.add("session", this.session.toJson());
        com.datadog.android.rum.model.ViewEvent.ViewEventSource viewEventSource = this.source;
        if (viewEventSource != null) {
            jsonObject.add("source", viewEventSource.toJson());
        }
        jsonObject.add("view", this.view.toJson());
        com.datadog.android.rum.model.ViewEvent.Usr usr = this.usr;
        if (usr != null) {
            jsonObject.add("usr", usr.toJson());
        }
        com.datadog.android.rum.model.ViewEvent.Account account = this.account;
        if (account != null) {
            jsonObject.add("account", account.toJson());
        }
        com.datadog.android.rum.model.ViewEvent.Connectivity connectivity = this.connectivity;
        if (connectivity != null) {
            jsonObject.add("connectivity", connectivity.toJson());
        }
        com.datadog.android.rum.model.ViewEvent.Display display = this.display;
        if (display != null) {
            jsonObject.add(com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DISPLAY_NOTIFICATION, display.toJson());
        }
        com.datadog.android.rum.model.ViewEvent.Synthetics synthetics = this.synthetics;
        if (synthetics != null) {
            jsonObject.add("synthetics", synthetics.toJson());
        }
        com.datadog.android.rum.model.ViewEvent.CiTest ciTest = this.ciTest;
        if (ciTest != null) {
            jsonObject.add("ci_test", ciTest.toJson());
        }
        com.datadog.android.rum.model.ViewEvent.Os os = this.os;
        if (os != null) {
            jsonObject.add("os", os.toJson());
        }
        com.datadog.android.rum.model.ViewEvent.Device device = this.device;
        if (device != null) {
            jsonObject.add("device", device.toJson());
        }
        jsonObject.add("_dd", this.dd.toJson());
        com.datadog.android.rum.model.ViewEvent.Context context = this.context;
        if (context != null) {
            jsonObject.add("context", context.toJson());
        }
        com.datadog.android.rum.model.ViewEvent.Container container = this.container;
        if (container != null) {
            jsonObject.add("container", container.toJson());
        }
        jsonObject.addProperty("type", this.type);
        com.datadog.android.rum.model.ViewEvent.Context context2 = this.featureFlags;
        if (context2 != null) {
            jsonObject.add("feature_flags", context2.toJson());
        }
        com.datadog.android.rum.model.ViewEvent.Privacy privacy = this.privacy;
        if (privacy != null) {
            jsonObject.add(com.paypal.oslo.feature.savings.ui.onboarding.SavingsTermsLinkTags.Privacy, privacy.toJson());
        }
        return jsonObject;
    }

    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/datadog/android/rum/model/ViewEvent$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/rum/model/ViewEvent;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/rum/model/ViewEvent;", "Lcom/google/gson/JsonObject;", "jsonObject", "fromJsonObject", "(Lcom/google/gson/JsonObject;)Lcom/datadog/android/rum/model/ViewEvent;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @kotlin.jvm.JvmStatic
        public final com.datadog.android.rum.model.ViewEvent fromJson(java.lang.String jsonString) throws com.google.gson.JsonParseException {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonString, "");
            try {
                com.google.gson.JsonObject asJsonObject = com.google.gson.JsonParser.parseString(jsonString).getAsJsonObject();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asJsonObject, "");
                return fromJsonObject(asJsonObject);
            } catch (java.lang.IllegalStateException e) {
                throw new com.google.gson.JsonParseException("Unable to parse json into type ViewEvent", e);
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:93:0x0201 A[Catch: NullPointerException -> 0x0216, NumberFormatException -> 0x0218, IllegalStateException -> 0x021c, TryCatch #5 {IllegalStateException -> 0x021c, NullPointerException -> 0x0216, NumberFormatException -> 0x0218, blocks: (B:35:0x00be, B:36:0x00cb, B:38:0x00d3, B:40:0x00d9, B:41:0x00e4, B:43:0x00ec, B:45:0x00f2, B:46:0x00fd, B:48:0x0105, B:50:0x010b, B:51:0x0116, B:53:0x011e, B:55:0x0124, B:56:0x012f, B:58:0x0137, B:60:0x013d, B:61:0x0148, B:63:0x0150, B:65:0x0156, B:66:0x0161, B:68:0x0169, B:70:0x016f, B:71:0x017a, B:73:0x0195, B:75:0x019b, B:76:0x01a6, B:78:0x01ae, B:80:0x01b4, B:81:0x01bf, B:83:0x01d1, B:85:0x01d7, B:86:0x01e2, B:88:0x01ea, B:90:0x01f0, B:91:0x01fb, B:93:0x0201, B:96:0x020a, B:97:0x0215), top: B:34:0x00be }] */
        /* JADX WARN: Removed duplicated region for block: B:96:0x020a A[Catch: NullPointerException -> 0x0216, NumberFormatException -> 0x0218, IllegalStateException -> 0x021c, TryCatch #5 {IllegalStateException -> 0x021c, NullPointerException -> 0x0216, NumberFormatException -> 0x0218, blocks: (B:35:0x00be, B:36:0x00cb, B:38:0x00d3, B:40:0x00d9, B:41:0x00e4, B:43:0x00ec, B:45:0x00f2, B:46:0x00fd, B:48:0x0105, B:50:0x010b, B:51:0x0116, B:53:0x011e, B:55:0x0124, B:56:0x012f, B:58:0x0137, B:60:0x013d, B:61:0x0148, B:63:0x0150, B:65:0x0156, B:66:0x0161, B:68:0x0169, B:70:0x016f, B:71:0x017a, B:73:0x0195, B:75:0x019b, B:76:0x01a6, B:78:0x01ae, B:80:0x01b4, B:81:0x01bf, B:83:0x01d1, B:85:0x01d7, B:86:0x01e2, B:88:0x01ea, B:90:0x01f0, B:91:0x01fb, B:93:0x0201, B:96:0x020a, B:97:0x0215), top: B:34:0x00be }] */
        @kotlin.jvm.JvmStatic
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final com.datadog.android.rum.model.ViewEvent fromJsonObject(com.google.gson.JsonObject jsonObject) throws com.google.gson.JsonParseException {
            java.lang.String str;
            java.lang.String asString;
            com.datadog.android.rum.model.ViewEvent.Usr usr;
            java.lang.String asString2;
            com.google.gson.JsonObject asJsonObject;
            com.google.gson.JsonObject asJsonObject2;
            com.google.gson.JsonObject asJsonObject3;
            com.google.gson.JsonObject asJsonObject4;
            com.google.gson.JsonObject asJsonObject5;
            com.google.gson.JsonObject asJsonObject6;
            com.google.gson.JsonObject asJsonObject7;
            com.google.gson.JsonObject asJsonObject8;
            com.google.gson.JsonObject asJsonObject9;
            com.google.gson.JsonObject asJsonObject10;
            com.google.gson.JsonObject asJsonObject11;
            java.lang.String asString3;
            java.lang.String str2 = "Unable to parse json into type ViewEvent";
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonObject, "");
            try {
                try {
                    long asLong = jsonObject.get("date").getAsLong();
                    com.google.gson.JsonObject asJsonObject12 = jsonObject.get("application").getAsJsonObject();
                    com.datadog.android.rum.model.ViewEvent.Application.Companion companion = com.datadog.android.rum.model.ViewEvent.Application.INSTANCE;
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asJsonObject12, "");
                    com.datadog.android.rum.model.ViewEvent.Application fromJsonObject = companion.fromJsonObject(asJsonObject12);
                    com.google.gson.JsonElement jsonElement = jsonObject.get("service");
                    if (jsonElement != null) {
                        try {
                            asString = jsonElement.getAsString();
                        } catch (java.lang.IllegalStateException e) {
                            e = e;
                            throw new com.google.gson.JsonParseException(str2, e);
                        } catch (java.lang.NumberFormatException e2) {
                            e = e2;
                            throw new com.google.gson.JsonParseException(str2, e);
                        }
                    } else {
                        asString = null;
                    }
                    com.google.gson.JsonElement jsonElement2 = jsonObject.get("version");
                    java.lang.String asString4 = jsonElement2 != null ? jsonElement2.getAsString() : null;
                    com.google.gson.JsonElement jsonElement3 = jsonObject.get("build_version");
                    java.lang.String asString5 = jsonElement3 != null ? jsonElement3.getAsString() : null;
                    com.google.gson.JsonElement jsonElement4 = jsonObject.get("build_id");
                    java.lang.String asString6 = jsonElement4 != null ? jsonElement4.getAsString() : null;
                    com.google.gson.JsonElement jsonElement5 = jsonObject.get("ddtags");
                    java.lang.String asString7 = jsonElement5 != null ? jsonElement5.getAsString() : null;
                    com.google.gson.JsonObject asJsonObject13 = jsonObject.get("session").getAsJsonObject();
                    com.datadog.android.rum.model.ViewEvent.ViewEventSession.Companion companion2 = com.datadog.android.rum.model.ViewEvent.ViewEventSession.INSTANCE;
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asJsonObject13, "");
                    com.datadog.android.rum.model.ViewEvent.ViewEventSession fromJsonObject2 = companion2.fromJsonObject(asJsonObject13);
                    com.google.gson.JsonElement jsonElement6 = jsonObject.get("source");
                    com.datadog.android.rum.model.ViewEvent.ViewEventSource fromJson = (jsonElement6 == null || (asString3 = jsonElement6.getAsString()) == null) ? null : com.datadog.android.rum.model.ViewEvent.ViewEventSource.INSTANCE.fromJson(asString3);
                    com.google.gson.JsonObject asJsonObject14 = jsonObject.get("view").getAsJsonObject();
                    com.datadog.android.rum.model.ViewEvent.ViewEventView.Companion companion3 = com.datadog.android.rum.model.ViewEvent.ViewEventView.INSTANCE;
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asJsonObject14, "");
                    com.datadog.android.rum.model.ViewEvent.ViewEventView fromJsonObject3 = companion3.fromJsonObject(asJsonObject14);
                    com.google.gson.JsonElement jsonElement7 = jsonObject.get("usr");
                    if (jsonElement7 != null) {
                        com.google.gson.JsonObject asJsonObject15 = jsonElement7.getAsJsonObject();
                        if (asJsonObject15 != null) {
                            str = "Unable to parse json into type ViewEvent";
                            try {
                                usr = com.datadog.android.rum.model.ViewEvent.Usr.INSTANCE.fromJsonObject(asJsonObject15);
                                com.google.gson.JsonElement jsonElement8 = jsonObject.get("account");
                                com.datadog.android.rum.model.ViewEvent.Account fromJsonObject4 = (jsonElement8 != null || (asJsonObject11 = jsonElement8.getAsJsonObject()) == null) ? null : com.datadog.android.rum.model.ViewEvent.Account.INSTANCE.fromJsonObject(asJsonObject11);
                                com.google.gson.JsonElement jsonElement9 = jsonObject.get("connectivity");
                                com.datadog.android.rum.model.ViewEvent.Connectivity fromJsonObject5 = (jsonElement9 != null || (asJsonObject10 = jsonElement9.getAsJsonObject()) == null) ? null : com.datadog.android.rum.model.ViewEvent.Connectivity.INSTANCE.fromJsonObject(asJsonObject10);
                                com.google.gson.JsonElement jsonElement10 = jsonObject.get(com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DISPLAY_NOTIFICATION);
                                com.datadog.android.rum.model.ViewEvent.Display fromJsonObject6 = (jsonElement10 != null || (asJsonObject9 = jsonElement10.getAsJsonObject()) == null) ? null : com.datadog.android.rum.model.ViewEvent.Display.INSTANCE.fromJsonObject(asJsonObject9);
                                com.google.gson.JsonElement jsonElement11 = jsonObject.get("synthetics");
                                com.datadog.android.rum.model.ViewEvent.Synthetics fromJsonObject7 = (jsonElement11 != null || (asJsonObject8 = jsonElement11.getAsJsonObject()) == null) ? null : com.datadog.android.rum.model.ViewEvent.Synthetics.INSTANCE.fromJsonObject(asJsonObject8);
                                com.google.gson.JsonElement jsonElement12 = jsonObject.get("ci_test");
                                com.datadog.android.rum.model.ViewEvent.CiTest fromJsonObject8 = (jsonElement12 != null || (asJsonObject7 = jsonElement12.getAsJsonObject()) == null) ? null : com.datadog.android.rum.model.ViewEvent.CiTest.INSTANCE.fromJsonObject(asJsonObject7);
                                com.google.gson.JsonElement jsonElement13 = jsonObject.get("os");
                                com.datadog.android.rum.model.ViewEvent.Os fromJsonObject9 = (jsonElement13 != null || (asJsonObject6 = jsonElement13.getAsJsonObject()) == null) ? null : com.datadog.android.rum.model.ViewEvent.Os.INSTANCE.fromJsonObject(asJsonObject6);
                                com.google.gson.JsonElement jsonElement14 = jsonObject.get("device");
                                com.datadog.android.rum.model.ViewEvent.Device fromJsonObject10 = (jsonElement14 != null || (asJsonObject5 = jsonElement14.getAsJsonObject()) == null) ? null : com.datadog.android.rum.model.ViewEvent.Device.INSTANCE.fromJsonObject(asJsonObject5);
                                com.google.gson.JsonObject asJsonObject16 = jsonObject.get("_dd").getAsJsonObject();
                                com.datadog.android.rum.model.ViewEvent.Dd.Companion companion4 = com.datadog.android.rum.model.ViewEvent.Dd.INSTANCE;
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asJsonObject16, "");
                                com.datadog.android.rum.model.ViewEvent.Dd fromJsonObject11 = companion4.fromJsonObject(asJsonObject16);
                                com.google.gson.JsonElement jsonElement15 = jsonObject.get("context");
                                com.datadog.android.rum.model.ViewEvent.Context fromJsonObject12 = (jsonElement15 != null || (asJsonObject4 = jsonElement15.getAsJsonObject()) == null) ? null : com.datadog.android.rum.model.ViewEvent.Context.INSTANCE.fromJsonObject(asJsonObject4);
                                com.google.gson.JsonElement jsonElement16 = jsonObject.get("container");
                                com.datadog.android.rum.model.ViewEvent.Container fromJsonObject13 = (jsonElement16 != null || (asJsonObject3 = jsonElement16.getAsJsonObject()) == null) ? null : com.datadog.android.rum.model.ViewEvent.Container.INSTANCE.fromJsonObject(asJsonObject3);
                                asString2 = jsonObject.get("type").getAsString();
                                com.google.gson.JsonElement jsonElement17 = jsonObject.get("feature_flags");
                                com.datadog.android.rum.model.ViewEvent.Context fromJsonObject14 = (jsonElement17 != null || (asJsonObject2 = jsonElement17.getAsJsonObject()) == null) ? null : com.datadog.android.rum.model.ViewEvent.Context.INSTANCE.fromJsonObject(asJsonObject2);
                                com.google.gson.JsonElement jsonElement18 = jsonObject.get(com.paypal.oslo.feature.savings.ui.onboarding.SavingsTermsLinkTags.Privacy);
                                com.datadog.android.rum.model.ViewEvent.Privacy fromJsonObject15 = (jsonElement18 != null || (asJsonObject = jsonElement18.getAsJsonObject()) == null) ? null : com.datadog.android.rum.model.ViewEvent.Privacy.INSTANCE.fromJsonObject(asJsonObject);
                                if (kotlin.jvm.internal.Intrinsics.areEqual(asString2, "view")) {
                                    throw new java.lang.IllegalStateException("Check failed.".toString());
                                }
                                return new com.datadog.android.rum.model.ViewEvent(asLong, fromJsonObject, asString, asString4, asString5, asString6, asString7, fromJsonObject2, fromJson, fromJsonObject3, usr, fromJsonObject4, fromJsonObject5, fromJsonObject6, fromJsonObject7, fromJsonObject8, fromJsonObject9, fromJsonObject10, fromJsonObject11, fromJsonObject12, fromJsonObject13, fromJsonObject14, fromJsonObject15);
                            } catch (java.lang.IllegalStateException e3) {
                                e = e3;
                                str2 = str;
                                throw new com.google.gson.JsonParseException(str2, e);
                            } catch (java.lang.NullPointerException e4) {
                                e = e4;
                                throw new com.google.gson.JsonParseException(str, e);
                            } catch (java.lang.NumberFormatException e5) {
                                e = e5;
                                str2 = str;
                                throw new com.google.gson.JsonParseException(str2, e);
                            }
                        }
                    }
                    usr = null;
                    com.google.gson.JsonElement jsonElement82 = jsonObject.get("account");
                    if (jsonElement82 != null) {
                    }
                    com.google.gson.JsonElement jsonElement92 = jsonObject.get("connectivity");
                    if (jsonElement92 != null) {
                    }
                    com.google.gson.JsonElement jsonElement102 = jsonObject.get(com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DISPLAY_NOTIFICATION);
                    if (jsonElement102 != null) {
                    }
                    com.google.gson.JsonElement jsonElement112 = jsonObject.get("synthetics");
                    if (jsonElement112 != null) {
                    }
                    com.google.gson.JsonElement jsonElement122 = jsonObject.get("ci_test");
                    if (jsonElement122 != null) {
                    }
                    com.google.gson.JsonElement jsonElement132 = jsonObject.get("os");
                    if (jsonElement132 != null) {
                    }
                    com.google.gson.JsonElement jsonElement142 = jsonObject.get("device");
                    if (jsonElement142 != null) {
                    }
                    com.google.gson.JsonObject asJsonObject162 = jsonObject.get("_dd").getAsJsonObject();
                    com.datadog.android.rum.model.ViewEvent.Dd.Companion companion42 = com.datadog.android.rum.model.ViewEvent.Dd.INSTANCE;
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asJsonObject162, "");
                    com.datadog.android.rum.model.ViewEvent.Dd fromJsonObject112 = companion42.fromJsonObject(asJsonObject162);
                    com.google.gson.JsonElement jsonElement152 = jsonObject.get("context");
                    if (jsonElement152 != null) {
                    }
                    com.google.gson.JsonElement jsonElement162 = jsonObject.get("container");
                    if (jsonElement162 != null) {
                    }
                    asString2 = jsonObject.get("type").getAsString();
                    com.google.gson.JsonElement jsonElement172 = jsonObject.get("feature_flags");
                    if (jsonElement172 != null) {
                    }
                    com.google.gson.JsonElement jsonElement182 = jsonObject.get(com.paypal.oslo.feature.savings.ui.onboarding.SavingsTermsLinkTags.Privacy);
                    if (jsonElement182 != null) {
                    }
                    if (kotlin.jvm.internal.Intrinsics.areEqual(asString2, "view")) {
                    }
                } catch (java.lang.NullPointerException e6) {
                    e = e6;
                    str = "Unable to parse json into type ViewEvent";
                }
            } catch (java.lang.IllegalStateException e7) {
                e = e7;
            } catch (java.lang.NumberFormatException e8) {
                e = e8;
            }
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\b\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ&\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\bR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0018\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0019\u0010\b"}, d2 = {"Lcom/datadog/android/rum/model/ViewEvent$Application;", "", "", "id", "currentLocale", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/datadog/android/rum/model/ViewEvent$Application;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lcom/google/gson/JsonElement;", "toJson", "()Lcom/google/gson/JsonElement;", "toString", "Ljava/lang/String;", "getCurrentLocale", "getId", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class Application {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.datadog.android.rum.model.ViewEvent.Application.Companion INSTANCE = new com.datadog.android.rum.model.ViewEvent.Application.Companion(null);
        private final java.lang.String currentLocale;
        private final java.lang.String id;

        public Application(java.lang.String str, java.lang.String str2) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.id = str;
            this.currentLocale = str2;
        }

        public /* synthetic */ Application(java.lang.String str, java.lang.String str2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? null : str2);
        }

        public final java.lang.String getId() {
            return this.id;
        }

        public final java.lang.String getCurrentLocale() {
            return this.currentLocale;
        }

        public final com.google.gson.JsonElement toJson() {
            com.google.gson.JsonObject jsonObject = new com.google.gson.JsonObject();
            jsonObject.addProperty("id", this.id);
            java.lang.String str = this.currentLocale;
            if (str != null) {
                jsonObject.addProperty("current_locale", str);
            }
            return jsonObject;
        }

        @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/datadog/android/rum/model/ViewEvent$Application$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/rum/model/ViewEvent$Application;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/rum/model/ViewEvent$Application;", "Lcom/google/gson/JsonObject;", "jsonObject", "fromJsonObject", "(Lcom/google/gson/JsonObject;)Lcom/datadog/android/rum/model/ViewEvent$Application;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @kotlin.jvm.JvmStatic
            public final com.datadog.android.rum.model.ViewEvent.Application fromJson(java.lang.String jsonString) throws com.google.gson.JsonParseException {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonString, "");
                try {
                    com.google.gson.JsonObject asJsonObject = com.google.gson.JsonParser.parseString(jsonString).getAsJsonObject();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asJsonObject, "");
                    return fromJsonObject(asJsonObject);
                } catch (java.lang.IllegalStateException e) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type Application", e);
                }
            }

            @kotlin.jvm.JvmStatic
            public final com.datadog.android.rum.model.ViewEvent.Application fromJsonObject(com.google.gson.JsonObject jsonObject) throws com.google.gson.JsonParseException {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonObject, "");
                try {
                    java.lang.String asString = jsonObject.get("id").getAsString();
                    com.google.gson.JsonElement jsonElement = jsonObject.get("current_locale");
                    java.lang.String asString2 = jsonElement != null ? jsonElement.getAsString() : null;
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asString, "");
                    return new com.datadog.android.rum.model.ViewEvent.Application(asString, asString2);
                } catch (java.lang.IllegalStateException e) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type Application", e);
                } catch (java.lang.NullPointerException e2) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type Application", e2);
                } catch (java.lang.NumberFormatException e3) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type Application", e3);
                }
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public final java.lang.String toString() {
            java.lang.String str = this.id;
            java.lang.String str2 = this.currentLocale;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Application(id=");
            sb.append(str);
            sb.append(", currentLocale=");
            sb.append(str2);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.id.hashCode();
            java.lang.String str = this.currentLocale;
            return (hashCode * 31) + (str == null ? 0 : str.hashCode());
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.datadog.android.rum.model.ViewEvent.Application)) {
                return false;
            }
            com.datadog.android.rum.model.ViewEvent.Application application = (com.datadog.android.rum.model.ViewEvent.Application) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.id, application.id) && kotlin.jvm.internal.Intrinsics.areEqual(this.currentLocale, application.currentLocale);
        }

        public final com.datadog.android.rum.model.ViewEvent.Application copy(java.lang.String id, java.lang.String currentLocale) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
            return new com.datadog.android.rum.model.ViewEvent.Application(id, currentLocale);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getCurrentLocale() {
            return this.currentLocale;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getId() {
            return this.id;
        }

        @kotlin.jvm.JvmStatic
        public static final com.datadog.android.rum.model.ViewEvent.Application fromJsonObject(com.google.gson.JsonObject jsonObject) throws com.google.gson.JsonParseException {
            return INSTANCE.fromJsonObject(jsonObject);
        }

        @kotlin.jvm.JvmStatic
        public static final com.datadog.android.rum.model.ViewEvent.Application fromJson(java.lang.String str) throws com.google.gson.JsonParseException {
            return INSTANCE.fromJson(str);
        }

        public static /* synthetic */ com.datadog.android.rum.model.ViewEvent.Application copy$default(com.datadog.android.rum.model.ViewEvent.Application application, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = application.id;
            }
            if ((i & 2) != 0) {
                str2 = application.currentLocale;
            }
            return application.copy(str, str2);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0086\b\u0018\u0000 '2\u00020\u0001:\u0001'B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0011J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0011JH\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0017\u001a\u00020\u00062\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\r\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001f\u0010\rR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0007¢\u0006\f\n\u0004\b\u0007\u0010 \u001a\u0004\b!\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\rR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010 \u001a\u0004\b\b\u0010\u0011R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010 \u001a\u0004\b$\u0010\u0011R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010%\u001a\u0004\b&\u0010\u000f"}, d2 = {"Lcom/datadog/android/rum/model/ViewEvent$ViewEventSession;", "", "", "id", "Lcom/datadog/android/rum/model/ViewEvent$ViewEventSessionType;", "type", "", "hasReplay", "isActive", "sampledForReplay", "<init>", "(Ljava/lang/String;Lcom/datadog/android/rum/model/ViewEvent$ViewEventSessionType;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/datadog/android/rum/model/ViewEvent$ViewEventSessionType;", "component3", "()Ljava/lang/Boolean;", "component4", "component5", "copy", "(Ljava/lang/String;Lcom/datadog/android/rum/model/ViewEvent$ViewEventSessionType;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)Lcom/datadog/android/rum/model/ViewEvent$ViewEventSession;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lcom/google/gson/JsonElement;", "toJson", "()Lcom/google/gson/JsonElement;", "toString", "Ljava/lang/Boolean;", "getHasReplay", "Ljava/lang/String;", "getId", "getSampledForReplay", "Lcom/datadog/android/rum/model/ViewEvent$ViewEventSessionType;", "getType", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class ViewEventSession {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.datadog.android.rum.model.ViewEvent.ViewEventSession.Companion INSTANCE = new com.datadog.android.rum.model.ViewEvent.ViewEventSession.Companion(null);
        private final java.lang.Boolean hasReplay;
        private final java.lang.String id;
        private final java.lang.Boolean isActive;
        private final java.lang.Boolean sampledForReplay;
        private final com.datadog.android.rum.model.ViewEvent.ViewEventSessionType type;

        public ViewEventSession(java.lang.String str, com.datadog.android.rum.model.ViewEvent.ViewEventSessionType viewEventSessionType, java.lang.Boolean bool, java.lang.Boolean bool2, java.lang.Boolean bool3) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(viewEventSessionType, "");
            this.id = str;
            this.type = viewEventSessionType;
            this.hasReplay = bool;
            this.isActive = bool2;
            this.sampledForReplay = bool3;
        }

        public final java.lang.String getId() {
            return this.id;
        }

        public final com.datadog.android.rum.model.ViewEvent.ViewEventSessionType getType() {
            return this.type;
        }

        public final java.lang.Boolean getHasReplay() {
            return this.hasReplay;
        }

        public /* synthetic */ ViewEventSession(java.lang.String str, com.datadog.android.rum.model.ViewEvent.ViewEventSessionType viewEventSessionType, java.lang.Boolean bool, java.lang.Boolean bool2, java.lang.Boolean bool3, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(str, viewEventSessionType, (i & 4) != 0 ? null : bool, (i & 8) != 0 ? java.lang.Boolean.TRUE : bool2, (i & 16) != 0 ? null : bool3);
        }

        public final java.lang.Boolean isActive() {
            return this.isActive;
        }

        public final java.lang.Boolean getSampledForReplay() {
            return this.sampledForReplay;
        }

        public final com.google.gson.JsonElement toJson() {
            com.google.gson.JsonObject jsonObject = new com.google.gson.JsonObject();
            jsonObject.addProperty("id", this.id);
            jsonObject.add("type", this.type.toJson());
            java.lang.Boolean bool = this.hasReplay;
            if (bool != null) {
                jsonObject.addProperty("has_replay", java.lang.Boolean.valueOf(bool.booleanValue()));
            }
            java.lang.Boolean bool2 = this.isActive;
            if (bool2 != null) {
                jsonObject.addProperty("is_active", java.lang.Boolean.valueOf(bool2.booleanValue()));
            }
            java.lang.Boolean bool3 = this.sampledForReplay;
            if (bool3 != null) {
                jsonObject.addProperty("sampled_for_replay", java.lang.Boolean.valueOf(bool3.booleanValue()));
            }
            return jsonObject;
        }

        @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/datadog/android/rum/model/ViewEvent$ViewEventSession$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/rum/model/ViewEvent$ViewEventSession;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/rum/model/ViewEvent$ViewEventSession;", "Lcom/google/gson/JsonObject;", "jsonObject", "fromJsonObject", "(Lcom/google/gson/JsonObject;)Lcom/datadog/android/rum/model/ViewEvent$ViewEventSession;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @kotlin.jvm.JvmStatic
            public final com.datadog.android.rum.model.ViewEvent.ViewEventSession fromJson(java.lang.String jsonString) throws com.google.gson.JsonParseException {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonString, "");
                try {
                    com.google.gson.JsonObject asJsonObject = com.google.gson.JsonParser.parseString(jsonString).getAsJsonObject();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asJsonObject, "");
                    return fromJsonObject(asJsonObject);
                } catch (java.lang.IllegalStateException e) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type ViewEventSession", e);
                }
            }

            @kotlin.jvm.JvmStatic
            public final com.datadog.android.rum.model.ViewEvent.ViewEventSession fromJsonObject(com.google.gson.JsonObject jsonObject) throws com.google.gson.JsonParseException {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonObject, "");
                try {
                    java.lang.String asString = jsonObject.get("id").getAsString();
                    com.datadog.android.rum.model.ViewEvent.ViewEventSessionType.Companion companion = com.datadog.android.rum.model.ViewEvent.ViewEventSessionType.INSTANCE;
                    java.lang.String asString2 = jsonObject.get("type").getAsString();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asString2, "");
                    com.datadog.android.rum.model.ViewEvent.ViewEventSessionType fromJson = companion.fromJson(asString2);
                    com.google.gson.JsonElement jsonElement = jsonObject.get("has_replay");
                    java.lang.Boolean valueOf = jsonElement != null ? java.lang.Boolean.valueOf(jsonElement.getAsBoolean()) : null;
                    com.google.gson.JsonElement jsonElement2 = jsonObject.get("is_active");
                    java.lang.Boolean valueOf2 = jsonElement2 != null ? java.lang.Boolean.valueOf(jsonElement2.getAsBoolean()) : null;
                    com.google.gson.JsonElement jsonElement3 = jsonObject.get("sampled_for_replay");
                    java.lang.Boolean valueOf3 = jsonElement3 != null ? java.lang.Boolean.valueOf(jsonElement3.getAsBoolean()) : null;
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asString, "");
                    return new com.datadog.android.rum.model.ViewEvent.ViewEventSession(asString, fromJson, valueOf, valueOf2, valueOf3);
                } catch (java.lang.IllegalStateException e) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type ViewEventSession", e);
                } catch (java.lang.NullPointerException e2) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type ViewEventSession", e2);
                } catch (java.lang.NumberFormatException e3) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type ViewEventSession", e3);
                }
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public final java.lang.String toString() {
            java.lang.String str = this.id;
            com.datadog.android.rum.model.ViewEvent.ViewEventSessionType viewEventSessionType = this.type;
            java.lang.Boolean bool = this.hasReplay;
            java.lang.Boolean bool2 = this.isActive;
            java.lang.Boolean bool3 = this.sampledForReplay;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ViewEventSession(id=");
            sb.append(str);
            sb.append(", type=");
            sb.append(viewEventSessionType);
            sb.append(", hasReplay=");
            sb.append(bool);
            sb.append(", isActive=");
            sb.append(bool2);
            sb.append(", sampledForReplay=");
            sb.append(bool3);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.id.hashCode();
            int hashCode2 = this.type.hashCode();
            java.lang.Boolean bool = this.hasReplay;
            int hashCode3 = bool == null ? 0 : bool.hashCode();
            java.lang.Boolean bool2 = this.isActive;
            int hashCode4 = bool2 == null ? 0 : bool2.hashCode();
            java.lang.Boolean bool3 = this.sampledForReplay;
            return (((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + (bool3 != null ? bool3.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.datadog.android.rum.model.ViewEvent.ViewEventSession)) {
                return false;
            }
            com.datadog.android.rum.model.ViewEvent.ViewEventSession viewEventSession = (com.datadog.android.rum.model.ViewEvent.ViewEventSession) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.id, viewEventSession.id) && this.type == viewEventSession.type && kotlin.jvm.internal.Intrinsics.areEqual(this.hasReplay, viewEventSession.hasReplay) && kotlin.jvm.internal.Intrinsics.areEqual(this.isActive, viewEventSession.isActive) && kotlin.jvm.internal.Intrinsics.areEqual(this.sampledForReplay, viewEventSession.sampledForReplay);
        }

        public final com.datadog.android.rum.model.ViewEvent.ViewEventSession copy(java.lang.String id, com.datadog.android.rum.model.ViewEvent.ViewEventSessionType type, java.lang.Boolean hasReplay, java.lang.Boolean isActive, java.lang.Boolean sampledForReplay) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
            return new com.datadog.android.rum.model.ViewEvent.ViewEventSession(id, type, hasReplay, isActive, sampledForReplay);
        }

        /* renamed from: component5, reason: from getter */
        public final java.lang.Boolean getSampledForReplay() {
            return this.sampledForReplay;
        }

        /* renamed from: component4, reason: from getter */
        public final java.lang.Boolean getIsActive() {
            return this.isActive;
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.Boolean getHasReplay() {
            return this.hasReplay;
        }

        /* renamed from: component2, reason: from getter */
        public final com.datadog.android.rum.model.ViewEvent.ViewEventSessionType getType() {
            return this.type;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getId() {
            return this.id;
        }

        @kotlin.jvm.JvmStatic
        public static final com.datadog.android.rum.model.ViewEvent.ViewEventSession fromJsonObject(com.google.gson.JsonObject jsonObject) throws com.google.gson.JsonParseException {
            return INSTANCE.fromJsonObject(jsonObject);
        }

        @kotlin.jvm.JvmStatic
        public static final com.datadog.android.rum.model.ViewEvent.ViewEventSession fromJson(java.lang.String str) throws com.google.gson.JsonParseException {
            return INSTANCE.fromJson(str);
        }

        public static /* synthetic */ com.datadog.android.rum.model.ViewEvent.ViewEventSession copy$default(com.datadog.android.rum.model.ViewEvent.ViewEventSession viewEventSession, java.lang.String str, com.datadog.android.rum.model.ViewEvent.ViewEventSessionType viewEventSessionType, java.lang.Boolean bool, java.lang.Boolean bool2, java.lang.Boolean bool3, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = viewEventSession.id;
            }
            if ((i & 2) != 0) {
                viewEventSessionType = viewEventSession.type;
            }
            com.datadog.android.rum.model.ViewEvent.ViewEventSessionType viewEventSessionType2 = viewEventSessionType;
            if ((i & 4) != 0) {
                bool = viewEventSession.hasReplay;
            }
            java.lang.Boolean bool4 = bool;
            if ((i & 8) != 0) {
                bool2 = viewEventSession.isActive;
            }
            java.lang.Boolean bool5 = bool2;
            if ((i & 16) != 0) {
                bool3 = viewEventSession.sampledForReplay;
            }
            return viewEventSession.copy(str, viewEventSessionType2, bool4, bool5, bool3);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0098\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0004\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\bM\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\bK\b\u0086\b\u0018\u0000 â\u00012\u00020\u0001:\u0002â\u0001Bß\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\r\u001a\u00020\u0007\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010 \u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\"\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\"\u0012\u0006\u0010&\u001a\u00020%\u0012\u0006\u0010(\u001a\u00020'\u0012\n\b\u0002\u0010*\u001a\u0004\u0018\u00010)\u0012\n\b\u0002\u0010,\u001a\u0004\u0018\u00010+\u0012\n\b\u0002\u0010.\u001a\u0004\u0018\u00010-\u0012\u0010\b\u0002\u00101\u001a\n\u0012\u0004\u0012\u000200\u0018\u00010/\u0012\u0006\u00103\u001a\u000202\u0012\n\b\u0002\u00105\u001a\u0004\u0018\u000104\u0012\u0010\b\u0002\u00107\u001a\n\u0012\u0004\u0012\u000206\u0018\u00010/\u0012\n\b\u0002\u00108\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u00109\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010:\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010;\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010<\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010=\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010>\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010?\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010A\u001a\u0004\u0018\u00010@\u0012\n\b\u0002\u0010B\u001a\u0004\u0018\u00010@\u0012\n\b\u0002\u0010C\u001a\u0004\u0018\u00010@\u0012\n\b\u0002\u0010E\u001a\u0004\u0018\u00010D\u0012\n\b\u0002\u0010G\u001a\u0004\u0018\u00010F¢\u0006\u0004\bH\u0010IJ\u0010\u0010J\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\bJ\u0010KJ\u0012\u0010L\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\bL\u0010MJ\u0012\u0010N\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\bN\u0010MJ\u0012\u0010O\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bO\u0010KJ\u0012\u0010P\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\bP\u0010MJ\u0012\u0010Q\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\bQ\u0010MJ\u0012\u0010R\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bR\u0010KJ\u0012\u0010S\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\bS\u0010MJ\u0012\u0010T\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\bT\u0010MJ\u0012\u0010U\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bU\u0010KJ\u0012\u0010V\u001a\u0004\u0018\u00010\u0017HÆ\u0003¢\u0006\u0004\bV\u0010WJ\u0012\u0010X\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bX\u0010KJ\u0012\u0010Y\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\bY\u0010MJ\u0012\u0010Z\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bZ\u0010KJ\u0012\u0010[\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b[\u0010MJ\u0012\u0010\\\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\\\u0010MJ\u0012\u0010]\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b]\u0010MJ\u0012\u0010^\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b^\u0010MJ\u0012\u0010_\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b_\u0010MJ\u0012\u0010`\u001a\u0004\u0018\u00010 HÆ\u0003¢\u0006\u0004\b`\u0010aJ\u0012\u0010b\u001a\u0004\u0018\u00010\"HÆ\u0003¢\u0006\u0004\bb\u0010cJ\u0012\u0010d\u001a\u0004\u0018\u00010\"HÆ\u0003¢\u0006\u0004\bd\u0010cJ\u0010\u0010e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\be\u0010KJ\u0010\u0010f\u001a\u00020%HÆ\u0003¢\u0006\u0004\bf\u0010gJ\u0010\u0010h\u001a\u00020'HÆ\u0003¢\u0006\u0004\bh\u0010iJ\u0012\u0010j\u001a\u0004\u0018\u00010)HÆ\u0003¢\u0006\u0004\bj\u0010kJ\u0012\u0010l\u001a\u0004\u0018\u00010+HÆ\u0003¢\u0006\u0004\bl\u0010mJ\u0012\u0010n\u001a\u0004\u0018\u00010-HÆ\u0003¢\u0006\u0004\bn\u0010oJ\u0018\u0010p\u001a\n\u0012\u0004\u0012\u000200\u0018\u00010/HÆ\u0003¢\u0006\u0004\bp\u0010qJ\u0010\u0010r\u001a\u000202HÆ\u0003¢\u0006\u0004\br\u0010sJ\u0012\u0010t\u001a\u0004\u0018\u000104HÆ\u0003¢\u0006\u0004\bt\u0010uJ\u0018\u0010v\u001a\n\u0012\u0004\u0012\u000206\u0018\u00010/HÆ\u0003¢\u0006\u0004\bv\u0010qJ\u0012\u0010w\u001a\u0004\u0018\u00010\u0017HÆ\u0003¢\u0006\u0004\bw\u0010WJ\u0012\u0010x\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bx\u0010KJ\u0012\u0010y\u001a\u0004\u0018\u00010\u0017HÆ\u0003¢\u0006\u0004\by\u0010WJ\u0012\u0010z\u001a\u0004\u0018\u00010\u0017HÆ\u0003¢\u0006\u0004\bz\u0010WJ\u0012\u0010{\u001a\u0004\u0018\u00010\u0017HÆ\u0003¢\u0006\u0004\b{\u0010WJ\u0012\u0010|\u001a\u0004\u0018\u00010\u0017HÆ\u0003¢\u0006\u0004\b|\u0010WJ\u0012\u0010}\u001a\u0004\u0018\u00010\u0017HÆ\u0003¢\u0006\u0004\b}\u0010WJ\u0012\u0010~\u001a\u0004\u0018\u00010\u0017HÆ\u0003¢\u0006\u0004\b~\u0010WJ\u0012\u0010\u007f\u001a\u0004\u0018\u00010\u0017HÆ\u0003¢\u0006\u0004\b\u007f\u0010WJ\u0015\u0010\u0080\u0001\u001a\u0004\u0018\u00010@HÆ\u0003¢\u0006\u0006\b\u0080\u0001\u0010\u0081\u0001J\u0015\u0010\u0082\u0001\u001a\u0004\u0018\u00010@HÆ\u0003¢\u0006\u0006\b\u0082\u0001\u0010\u0081\u0001J\u0015\u0010\u0083\u0001\u001a\u0004\u0018\u00010@HÆ\u0003¢\u0006\u0006\b\u0083\u0001\u0010\u0081\u0001J\u0014\u0010\u0084\u0001\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0005\b\u0084\u0001\u0010MJ\u0015\u0010\u0085\u0001\u001a\u0004\u0018\u00010DHÆ\u0003¢\u0006\u0006\b\u0085\u0001\u0010\u0086\u0001J\u0015\u0010\u0087\u0001\u001a\u0004\u0018\u00010FHÆ\u0003¢\u0006\u0006\b\u0087\u0001\u0010\u0088\u0001J\u0014\u0010\u0089\u0001\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0005\b\u0089\u0001\u0010MJ\u0014\u0010\u008a\u0001\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0005\b\u008a\u0001\u0010MJ\u0015\u0010\u008b\u0001\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0006\b\u008b\u0001\u0010\u008c\u0001J\u0013\u0010\u008d\u0001\u001a\u00020\u0007HÆ\u0003¢\u0006\u0006\b\u008d\u0001\u0010\u008e\u0001J÷\u0004\u0010\u008f\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\r\u001a\u00020\u00072\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010!\u001a\u0004\u0018\u00010 2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\"2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\"2\b\b\u0002\u0010&\u001a\u00020%2\b\b\u0002\u0010(\u001a\u00020'2\n\b\u0002\u0010*\u001a\u0004\u0018\u00010)2\n\b\u0002\u0010,\u001a\u0004\u0018\u00010+2\n\b\u0002\u0010.\u001a\u0004\u0018\u00010-2\u0010\b\u0002\u00101\u001a\n\u0012\u0004\u0012\u000200\u0018\u00010/2\b\b\u0002\u00103\u001a\u0002022\n\b\u0002\u00105\u001a\u0004\u0018\u0001042\u0010\b\u0002\u00107\u001a\n\u0012\u0004\u0012\u000206\u0018\u00010/2\n\b\u0002\u00108\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u00109\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010:\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010;\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010<\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010=\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010>\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010?\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010A\u001a\u0004\u0018\u00010@2\n\b\u0002\u0010B\u001a\u0004\u0018\u00010@2\n\b\u0002\u0010C\u001a\u0004\u0018\u00010@2\n\b\u0002\u0010E\u001a\u0004\u0018\u00010D2\n\b\u0002\u0010G\u001a\u0004\u0018\u00010FHÆ\u0001¢\u0006\u0006\b\u008f\u0001\u0010\u0090\u0001J\u001e\u0010\u0092\u0001\u001a\u00020\"2\t\u0010\u0091\u0001\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0006\b\u0092\u0001\u0010\u0093\u0001J\u0014\u0010\u0095\u0001\u001a\u00030\u0094\u0001HÖ\u0001¢\u0006\u0006\b\u0095\u0001\u0010\u0096\u0001J\u0011\u0010\u0098\u0001\u001a\u00030\u0097\u0001¢\u0006\u0006\b\u0098\u0001\u0010\u0099\u0001J\u0012\u0010\u009a\u0001\u001a\u00020\u0002HÖ\u0001¢\u0006\u0005\b\u009a\u0001\u0010KR\u001c\u0010G\u001a\u0004\u0018\u00010F8\u0007¢\u0006\u000f\n\u0005\bG\u0010\u009b\u0001\u001a\u0006\b\u009c\u0001\u0010\u0088\u0001R\u001c\u0010&\u001a\u00020%8\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b&\u0010\u009d\u0001\u001a\u0005\b\u009e\u0001\u0010gR\u001e\u0010:\u001a\u0004\u0018\u00010\u00178\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b:\u0010\u009f\u0001\u001a\u0005\b \u0001\u0010WR\u001e\u0010;\u001a\u0004\u0018\u00010\u00178\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b;\u0010\u009f\u0001\u001a\u0005\b¡\u0001\u0010WR\u001e\u0010*\u001a\u0004\u0018\u00010)8\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b*\u0010¢\u0001\u001a\u0005\b£\u0001\u0010kR\u001e\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b\u0018\u0010\u009f\u0001\u001a\u0005\b¤\u0001\u0010WR\u001e\u0010\u001a\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b\u001a\u0010¥\u0001\u001a\u0005\b¦\u0001\u0010KR\u001e\u0010\u0019\u001a\u0004\u0018\u00010\u00078\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b\u0019\u0010§\u0001\u001a\u0005\b¨\u0001\u0010MR\u001e\u0010!\u001a\u0004\u0018\u00010 8\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b!\u0010©\u0001\u001a\u0005\bª\u0001\u0010aR\u001e\u0010\u001b\u001a\u0004\u0018\u00010\u00078\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b\u001b\u0010§\u0001\u001a\u0005\b«\u0001\u0010MR\u001e\u0010\u001c\u001a\u0004\u0018\u00010\u00078\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b\u001c\u0010§\u0001\u001a\u0005\b¬\u0001\u0010MR\u001e\u0010\u001d\u001a\u0004\u0018\u00010\u00078\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b\u001d\u0010§\u0001\u001a\u0005\b\u00ad\u0001\u0010MR\u001c\u0010(\u001a\u00020'8\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b(\u0010®\u0001\u001a\u0005\b¯\u0001\u0010iR\u001e\u0010\u001f\u001a\u0004\u0018\u00010\u00078\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b\u001f\u0010§\u0001\u001a\u0005\b°\u0001\u0010MR\u001e\u0010\u000e\u001a\u0004\u0018\u00010\u00078\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b\u000e\u0010§\u0001\u001a\u0005\b±\u0001\u0010MR\u001e\u0010\u0011\u001a\u0004\u0018\u00010\u00078\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b\u0011\u0010§\u0001\u001a\u0005\b²\u0001\u0010MR\u001e\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b\u0013\u0010¥\u0001\u001a\u0005\b³\u0001\u0010KR\u001e\u0010\u0012\u001a\u0004\u0018\u00010\u00078\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b\u0012\u0010§\u0001\u001a\u0005\b´\u0001\u0010MR\u001f\u0010A\u001a\u0004\u0018\u00010@8\u0007X\u0087\u0004¢\u0006\u000f\n\u0005\bA\u0010µ\u0001\u001a\u0006\b¶\u0001\u0010\u0081\u0001R\u001f\u0010B\u001a\u0004\u0018\u00010@8\u0007X\u0087\u0004¢\u0006\u000f\n\u0005\bB\u0010µ\u0001\u001a\u0006\b·\u0001\u0010\u0081\u0001R\u001e\u0010?\u001a\u0004\u0018\u00010\u00178\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b?\u0010\u009f\u0001\u001a\u0005\b¸\u0001\u0010WR\u001e\u0010.\u001a\u0004\u0018\u00010-8\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b.\u0010¹\u0001\u001a\u0005\bº\u0001\u0010oR\u001e\u00105\u001a\u0004\u0018\u0001048\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b5\u0010»\u0001\u001a\u0005\b¼\u0001\u0010uR\u001c\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b\u0003\u0010¥\u0001\u001a\u0005\b½\u0001\u0010KR$\u00107\u001a\n\u0012\u0004\u0012\u000206\u0018\u00010/8\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b7\u0010¾\u0001\u001a\u0005\b¿\u0001\u0010qR\u001e\u0010\u0014\u001a\u0004\u0018\u00010\u00078\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b\u0014\u0010§\u0001\u001a\u0005\bÀ\u0001\u0010MR\u001e\u0010\u0016\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b\u0016\u0010¥\u0001\u001a\u0005\bÁ\u0001\u0010KR\u001e\u0010\u0015\u001a\u0004\u0018\u00010\u00078\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b\u0015\u0010§\u0001\u001a\u0005\bÂ\u0001\u0010MR\u001e\u0010\n\u001a\u0004\u0018\u00010\u00078\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b\n\u0010§\u0001\u001a\u0005\bÃ\u0001\u0010MR\u001d\u0010#\u001a\u0004\u0018\u00010\"8\u0007X\u0087\u0004¢\u0006\r\n\u0005\b#\u0010Ä\u0001\u001a\u0004\b#\u0010cR\u001d\u0010$\u001a\u0004\u0018\u00010\"8\u0007X\u0087\u0004¢\u0006\r\n\u0005\b$\u0010Ä\u0001\u001a\u0004\b$\u0010cR\u001f\u0010C\u001a\u0004\u0018\u00010@8\u0007X\u0087\u0004¢\u0006\u000f\n\u0005\bC\u0010µ\u0001\u001a\u0006\bÅ\u0001\u0010\u0081\u0001R\u001e\u0010\u000f\u001a\u0004\u0018\u00010\u00078\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b\u000f\u0010§\u0001\u001a\u0005\bÆ\u0001\u0010MR\u001e\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b\u0010\u0010¥\u0001\u001a\u0005\bÇ\u0001\u0010KR\u001e\u0010\u001e\u001a\u0004\u0018\u00010\u00078\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b\u001e\u0010§\u0001\u001a\u0005\bÈ\u0001\u0010MR\u001e\u0010\b\u001a\u0004\u0018\u00010\u00078\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b\b\u0010§\u0001\u001a\u0005\bÉ\u0001\u0010MR\u001f\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0007X\u0087\u0004¢\u0006\u000f\n\u0005\b\f\u0010Ê\u0001\u001a\u0006\bË\u0001\u0010\u008c\u0001R\u001e\u0010,\u001a\u0004\u0018\u00010+8\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b,\u0010Ì\u0001\u001a\u0005\bÍ\u0001\u0010mR\u001e\u00108\u001a\u0004\u0018\u00010\u00178\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b8\u0010\u009f\u0001\u001a\u0005\bÎ\u0001\u0010WR\u001e\u00109\u001a\u0004\u0018\u00010\u00178\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b9\u0010\u009f\u0001\u001a\u0005\bÏ\u0001\u0010WR(\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0016\n\u0005\b\u0006\u0010¥\u0001\u001a\u0005\bÐ\u0001\u0010K\"\u0006\bÑ\u0001\u0010Ò\u0001R\u001e\u0010\t\u001a\u0004\u0018\u00010\u00078\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b\t\u0010§\u0001\u001a\u0005\bÓ\u0001\u0010MR\u001f\u0010E\u001a\u0004\u0018\u00010D8\u0007X\u0087\u0004¢\u0006\u000f\n\u0005\bE\u0010Ô\u0001\u001a\u0006\bÕ\u0001\u0010\u0086\u0001R(\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0016\n\u0005\b\u0004\u0010¥\u0001\u001a\u0005\bÖ\u0001\u0010K\"\u0006\b×\u0001\u0010Ò\u0001R\u001e\u0010<\u001a\u0004\u0018\u00010\u00178\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b<\u0010\u009f\u0001\u001a\u0005\bØ\u0001\u0010WR\u001e\u0010=\u001a\u0004\u0018\u00010\u00178\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b=\u0010\u009f\u0001\u001a\u0005\bÙ\u0001\u0010WR\u001c\u00103\u001a\u0002028\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b3\u0010Ú\u0001\u001a\u0005\bÛ\u0001\u0010sR$\u00101\u001a\n\u0012\u0004\u0012\u000200\u0018\u00010/8\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b1\u0010¾\u0001\u001a\u0005\bÜ\u0001\u0010qR\u001e\u0010>\u001a\u0004\u0018\u00010\u00178\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b>\u0010\u009f\u0001\u001a\u0005\bÝ\u0001\u0010WR\u001d\u0010\r\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\u000f\n\u0005\b\r\u0010Þ\u0001\u001a\u0006\bß\u0001\u0010\u008e\u0001R&\u0010\u0005\u001a\u00020\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0016\n\u0005\b\u0005\u0010¥\u0001\u001a\u0005\bà\u0001\u0010K\"\u0006\bá\u0001\u0010Ò\u0001"}, d2 = {"Lcom/datadog/android/rum/model/ViewEvent$ViewEventView;", "", "", "id", com.adjust.sdk.Constants.REFERRER, "url", "name", "", "loadingTime", "networkSettledTime", "interactionToNextViewTime", "Lcom/datadog/android/rum/model/ViewEvent$LoadingType;", "loadingType", "timeSpent", "firstContentfulPaint", "largestContentfulPaint", "largestContentfulPaintTargetSelector", "firstInputDelay", "firstInputTime", "firstInputTargetSelector", "interactionToNextPaint", "interactionToNextPaintTime", "interactionToNextPaintTargetSelector", "", "cumulativeLayoutShift", "cumulativeLayoutShiftTime", "cumulativeLayoutShiftTargetSelector", "domComplete", "domContentLoaded", "domInteractive", "loadEvent", "firstByte", "Lcom/datadog/android/rum/model/ViewEvent$CustomTimings;", "customTimings", "", "isActive", "isSlowRendered", "Lcom/datadog/android/rum/model/ViewEvent$Action;", "action", "Lcom/datadog/android/rum/model/ViewEvent$Error;", "error", "Lcom/datadog/android/rum/model/ViewEvent$Crash;", "crash", "Lcom/datadog/android/rum/model/ViewEvent$LongTask;", "longTask", "Lcom/datadog/android/rum/model/ViewEvent$FrozenFrame;", "frozenFrame", "", "Lcom/datadog/android/rum/model/ViewEvent$SlowFrame;", "slowFrames", "Lcom/datadog/android/rum/model/ViewEvent$Resource;", "resource", "Lcom/datadog/android/rum/model/ViewEvent$Frustration;", "frustration", "Lcom/datadog/android/rum/model/ViewEvent$InForegroundPeriod;", "inForegroundPeriods", "memoryAverage", "memoryMax", "cpuTicksCount", "cpuTicksPerSecond", "refreshRateAverage", "refreshRateMin", "slowFramesRate", "freezeRate", "Lcom/datadog/android/rum/model/ViewEvent$FlutterBuildTime;", "flutterBuildTime", "flutterRasterTime", "jsRefreshRate", "Lcom/datadog/android/rum/model/ViewEvent$Performance;", "performance", "Lcom/datadog/android/rum/model/ViewEvent$Accessibility;", "accessibility", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Lcom/datadog/android/rum/model/ViewEvent$LoadingType;JLjava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Number;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Lcom/datadog/android/rum/model/ViewEvent$CustomTimings;Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/datadog/android/rum/model/ViewEvent$Action;Lcom/datadog/android/rum/model/ViewEvent$Error;Lcom/datadog/android/rum/model/ViewEvent$Crash;Lcom/datadog/android/rum/model/ViewEvent$LongTask;Lcom/datadog/android/rum/model/ViewEvent$FrozenFrame;Ljava/util/List;Lcom/datadog/android/rum/model/ViewEvent$Resource;Lcom/datadog/android/rum/model/ViewEvent$Frustration;Ljava/util/List;Ljava/lang/Number;Ljava/lang/Number;Ljava/lang/Number;Ljava/lang/Number;Ljava/lang/Number;Ljava/lang/Number;Ljava/lang/Number;Ljava/lang/Number;Lcom/datadog/android/rum/model/ViewEvent$FlutterBuildTime;Lcom/datadog/android/rum/model/ViewEvent$FlutterBuildTime;Lcom/datadog/android/rum/model/ViewEvent$FlutterBuildTime;Lcom/datadog/android/rum/model/ViewEvent$Performance;Lcom/datadog/android/rum/model/ViewEvent$Accessibility;)V", "component1", "()Ljava/lang/String;", "component10", "()Ljava/lang/Long;", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "()Ljava/lang/Number;", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "()Lcom/datadog/android/rum/model/ViewEvent$CustomTimings;", "component28", "()Ljava/lang/Boolean;", "component29", "component3", "component30", "()Lcom/datadog/android/rum/model/ViewEvent$Action;", "component31", "()Lcom/datadog/android/rum/model/ViewEvent$Error;", "component32", "()Lcom/datadog/android/rum/model/ViewEvent$Crash;", "component33", "()Lcom/datadog/android/rum/model/ViewEvent$LongTask;", "component34", "()Lcom/datadog/android/rum/model/ViewEvent$FrozenFrame;", "component35", "()Ljava/util/List;", "component36", "()Lcom/datadog/android/rum/model/ViewEvent$Resource;", "component37", "()Lcom/datadog/android/rum/model/ViewEvent$Frustration;", "component38", "component39", "component4", "component40", "component41", "component42", "component43", "component44", "component45", "component46", "component47", "()Lcom/datadog/android/rum/model/ViewEvent$FlutterBuildTime;", "component48", "component49", "component5", "component50", "()Lcom/datadog/android/rum/model/ViewEvent$Performance;", "component51", "()Lcom/datadog/android/rum/model/ViewEvent$Accessibility;", "component6", "component7", "component8", "()Lcom/datadog/android/rum/model/ViewEvent$LoadingType;", "component9", "()J", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Lcom/datadog/android/rum/model/ViewEvent$LoadingType;JLjava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Number;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Lcom/datadog/android/rum/model/ViewEvent$CustomTimings;Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/datadog/android/rum/model/ViewEvent$Action;Lcom/datadog/android/rum/model/ViewEvent$Error;Lcom/datadog/android/rum/model/ViewEvent$Crash;Lcom/datadog/android/rum/model/ViewEvent$LongTask;Lcom/datadog/android/rum/model/ViewEvent$FrozenFrame;Ljava/util/List;Lcom/datadog/android/rum/model/ViewEvent$Resource;Lcom/datadog/android/rum/model/ViewEvent$Frustration;Ljava/util/List;Ljava/lang/Number;Ljava/lang/Number;Ljava/lang/Number;Ljava/lang/Number;Ljava/lang/Number;Ljava/lang/Number;Ljava/lang/Number;Ljava/lang/Number;Lcom/datadog/android/rum/model/ViewEvent$FlutterBuildTime;Lcom/datadog/android/rum/model/ViewEvent$FlutterBuildTime;Lcom/datadog/android/rum/model/ViewEvent$FlutterBuildTime;Lcom/datadog/android/rum/model/ViewEvent$Performance;Lcom/datadog/android/rum/model/ViewEvent$Accessibility;)Lcom/datadog/android/rum/model/ViewEvent$ViewEventView;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lcom/google/gson/JsonElement;", "toJson", "()Lcom/google/gson/JsonElement;", "toString", "Lcom/datadog/android/rum/model/ViewEvent$Accessibility;", "getAccessibility", "Lcom/datadog/android/rum/model/ViewEvent$Action;", "getAction", "Ljava/lang/Number;", "getCpuTicksCount", "getCpuTicksPerSecond", "Lcom/datadog/android/rum/model/ViewEvent$Crash;", "getCrash", "getCumulativeLayoutShift", "Ljava/lang/String;", "getCumulativeLayoutShiftTargetSelector", "Ljava/lang/Long;", "getCumulativeLayoutShiftTime", "Lcom/datadog/android/rum/model/ViewEvent$CustomTimings;", "getCustomTimings", "getDomComplete", "getDomContentLoaded", "getDomInteractive", "Lcom/datadog/android/rum/model/ViewEvent$Error;", "getError", "getFirstByte", "getFirstContentfulPaint", "getFirstInputDelay", "getFirstInputTargetSelector", "getFirstInputTime", "Lcom/datadog/android/rum/model/ViewEvent$FlutterBuildTime;", "getFlutterBuildTime", "getFlutterRasterTime", "getFreezeRate", "Lcom/datadog/android/rum/model/ViewEvent$FrozenFrame;", "getFrozenFrame", "Lcom/datadog/android/rum/model/ViewEvent$Frustration;", "getFrustration", "getId", "Ljava/util/List;", "getInForegroundPeriods", "getInteractionToNextPaint", "getInteractionToNextPaintTargetSelector", "getInteractionToNextPaintTime", "getInteractionToNextViewTime", "Ljava/lang/Boolean;", "getJsRefreshRate", "getLargestContentfulPaint", "getLargestContentfulPaintTargetSelector", "getLoadEvent", "getLoadingTime", "Lcom/datadog/android/rum/model/ViewEvent$LoadingType;", "getLoadingType", "Lcom/datadog/android/rum/model/ViewEvent$LongTask;", "getLongTask", "getMemoryAverage", "getMemoryMax", "getName", "setName", "(Ljava/lang/String;)V", "getNetworkSettledTime", "Lcom/datadog/android/rum/model/ViewEvent$Performance;", "getPerformance", "getReferrer", "setReferrer", "getRefreshRateAverage", "getRefreshRateMin", "Lcom/datadog/android/rum/model/ViewEvent$Resource;", "getResource", "getSlowFrames", "getSlowFramesRate", "J", "getTimeSpent", "getUrl", "setUrl", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class ViewEventView {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.datadog.android.rum.model.ViewEvent.ViewEventView.Companion INSTANCE = new com.datadog.android.rum.model.ViewEvent.ViewEventView.Companion(null);
        private final com.datadog.android.rum.model.ViewEvent.Accessibility accessibility;
        private final com.datadog.android.rum.model.ViewEvent.Action action;
        private final java.lang.Number cpuTicksCount;
        private final java.lang.Number cpuTicksPerSecond;
        private final com.datadog.android.rum.model.ViewEvent.Crash crash;
        private final java.lang.Number cumulativeLayoutShift;
        private final java.lang.String cumulativeLayoutShiftTargetSelector;
        private final java.lang.Long cumulativeLayoutShiftTime;
        private final com.datadog.android.rum.model.ViewEvent.CustomTimings customTimings;
        private final java.lang.Long domComplete;
        private final java.lang.Long domContentLoaded;
        private final java.lang.Long domInteractive;
        private final com.datadog.android.rum.model.ViewEvent.Error error;
        private final java.lang.Long firstByte;
        private final java.lang.Long firstContentfulPaint;
        private final java.lang.Long firstInputDelay;
        private final java.lang.String firstInputTargetSelector;
        private final java.lang.Long firstInputTime;
        private final com.datadog.android.rum.model.ViewEvent.FlutterBuildTime flutterBuildTime;
        private final com.datadog.android.rum.model.ViewEvent.FlutterBuildTime flutterRasterTime;
        private final java.lang.Number freezeRate;
        private final com.datadog.android.rum.model.ViewEvent.FrozenFrame frozenFrame;
        private final com.datadog.android.rum.model.ViewEvent.Frustration frustration;
        private final java.lang.String id;
        private final java.util.List<com.datadog.android.rum.model.ViewEvent.InForegroundPeriod> inForegroundPeriods;
        private final java.lang.Long interactionToNextPaint;
        private final java.lang.String interactionToNextPaintTargetSelector;
        private final java.lang.Long interactionToNextPaintTime;
        private final java.lang.Long interactionToNextViewTime;
        private final java.lang.Boolean isActive;
        private final java.lang.Boolean isSlowRendered;
        private final com.datadog.android.rum.model.ViewEvent.FlutterBuildTime jsRefreshRate;
        private final java.lang.Long largestContentfulPaint;
        private final java.lang.String largestContentfulPaintTargetSelector;
        private final java.lang.Long loadEvent;
        private final java.lang.Long loadingTime;
        private final com.datadog.android.rum.model.ViewEvent.LoadingType loadingType;
        private final com.datadog.android.rum.model.ViewEvent.LongTask longTask;
        private final java.lang.Number memoryAverage;
        private final java.lang.Number memoryMax;
        private java.lang.String name;
        private final java.lang.Long networkSettledTime;
        private final com.datadog.android.rum.model.ViewEvent.Performance performance;
        private java.lang.String referrer;
        private final java.lang.Number refreshRateAverage;
        private final java.lang.Number refreshRateMin;
        private final com.datadog.android.rum.model.ViewEvent.Resource resource;
        private final java.util.List<com.datadog.android.rum.model.ViewEvent.SlowFrame> slowFrames;
        private final java.lang.Number slowFramesRate;
        private final long timeSpent;
        private java.lang.String url;

        public ViewEventView(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.Long l, java.lang.Long l2, java.lang.Long l3, com.datadog.android.rum.model.ViewEvent.LoadingType loadingType, long j, java.lang.Long l4, java.lang.Long l5, java.lang.String str5, java.lang.Long l6, java.lang.Long l7, java.lang.String str6, java.lang.Long l8, java.lang.Long l9, java.lang.String str7, java.lang.Number number, java.lang.Long l10, java.lang.String str8, java.lang.Long l11, java.lang.Long l12, java.lang.Long l13, java.lang.Long l14, java.lang.Long l15, com.datadog.android.rum.model.ViewEvent.CustomTimings customTimings, java.lang.Boolean bool, java.lang.Boolean bool2, com.datadog.android.rum.model.ViewEvent.Action action, com.datadog.android.rum.model.ViewEvent.Error error, com.datadog.android.rum.model.ViewEvent.Crash crash, com.datadog.android.rum.model.ViewEvent.LongTask longTask, com.datadog.android.rum.model.ViewEvent.FrozenFrame frozenFrame, java.util.List<com.datadog.android.rum.model.ViewEvent.SlowFrame> list, com.datadog.android.rum.model.ViewEvent.Resource resource, com.datadog.android.rum.model.ViewEvent.Frustration frustration, java.util.List<com.datadog.android.rum.model.ViewEvent.InForegroundPeriod> list2, java.lang.Number number2, java.lang.Number number3, java.lang.Number number4, java.lang.Number number5, java.lang.Number number6, java.lang.Number number7, java.lang.Number number8, java.lang.Number number9, com.datadog.android.rum.model.ViewEvent.FlutterBuildTime flutterBuildTime, com.datadog.android.rum.model.ViewEvent.FlutterBuildTime flutterBuildTime2, com.datadog.android.rum.model.ViewEvent.FlutterBuildTime flutterBuildTime3, com.datadog.android.rum.model.ViewEvent.Performance performance, com.datadog.android.rum.model.ViewEvent.Accessibility accessibility) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(action, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(resource, "");
            this.id = str;
            this.referrer = str2;
            this.url = str3;
            this.name = str4;
            this.loadingTime = l;
            this.networkSettledTime = l2;
            this.interactionToNextViewTime = l3;
            this.loadingType = loadingType;
            this.timeSpent = j;
            this.firstContentfulPaint = l4;
            this.largestContentfulPaint = l5;
            this.largestContentfulPaintTargetSelector = str5;
            this.firstInputDelay = l6;
            this.firstInputTime = l7;
            this.firstInputTargetSelector = str6;
            this.interactionToNextPaint = l8;
            this.interactionToNextPaintTime = l9;
            this.interactionToNextPaintTargetSelector = str7;
            this.cumulativeLayoutShift = number;
            this.cumulativeLayoutShiftTime = l10;
            this.cumulativeLayoutShiftTargetSelector = str8;
            this.domComplete = l11;
            this.domContentLoaded = l12;
            this.domInteractive = l13;
            this.loadEvent = l14;
            this.firstByte = l15;
            this.customTimings = customTimings;
            this.isActive = bool;
            this.isSlowRendered = bool2;
            this.action = action;
            this.error = error;
            this.crash = crash;
            this.longTask = longTask;
            this.frozenFrame = frozenFrame;
            this.slowFrames = list;
            this.resource = resource;
            this.frustration = frustration;
            this.inForegroundPeriods = list2;
            this.memoryAverage = number2;
            this.memoryMax = number3;
            this.cpuTicksCount = number4;
            this.cpuTicksPerSecond = number5;
            this.refreshRateAverage = number6;
            this.refreshRateMin = number7;
            this.slowFramesRate = number8;
            this.freezeRate = number9;
            this.flutterBuildTime = flutterBuildTime;
            this.flutterRasterTime = flutterBuildTime2;
            this.jsRefreshRate = flutterBuildTime3;
            this.performance = performance;
            this.accessibility = accessibility;
        }

        public /* synthetic */ ViewEventView(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.Long l, java.lang.Long l2, java.lang.Long l3, com.datadog.android.rum.model.ViewEvent.LoadingType loadingType, long j, java.lang.Long l4, java.lang.Long l5, java.lang.String str5, java.lang.Long l6, java.lang.Long l7, java.lang.String str6, java.lang.Long l8, java.lang.Long l9, java.lang.String str7, java.lang.Number number, java.lang.Long l10, java.lang.String str8, java.lang.Long l11, java.lang.Long l12, java.lang.Long l13, java.lang.Long l14, java.lang.Long l15, com.datadog.android.rum.model.ViewEvent.CustomTimings customTimings, java.lang.Boolean bool, java.lang.Boolean bool2, com.datadog.android.rum.model.ViewEvent.Action action, com.datadog.android.rum.model.ViewEvent.Error error, com.datadog.android.rum.model.ViewEvent.Crash crash, com.datadog.android.rum.model.ViewEvent.LongTask longTask, com.datadog.android.rum.model.ViewEvent.FrozenFrame frozenFrame, java.util.List list, com.datadog.android.rum.model.ViewEvent.Resource resource, com.datadog.android.rum.model.ViewEvent.Frustration frustration, java.util.List list2, java.lang.Number number2, java.lang.Number number3, java.lang.Number number4, java.lang.Number number5, java.lang.Number number6, java.lang.Number number7, java.lang.Number number8, java.lang.Number number9, com.datadog.android.rum.model.ViewEvent.FlutterBuildTime flutterBuildTime, com.datadog.android.rum.model.ViewEvent.FlutterBuildTime flutterBuildTime2, com.datadog.android.rum.model.ViewEvent.FlutterBuildTime flutterBuildTime3, com.datadog.android.rum.model.ViewEvent.Performance performance, com.datadog.android.rum.model.ViewEvent.Accessibility accessibility, int i, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? null : str2, str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : l, (i & 32) != 0 ? null : l2, (i & 64) != 0 ? null : l3, (i & 128) != 0 ? null : loadingType, j, (i & 512) != 0 ? null : l4, (i & 1024) != 0 ? null : l5, (i & 2048) != 0 ? null : str5, (i & 4096) != 0 ? null : l6, (i & 8192) != 0 ? null : l7, (i & 16384) != 0 ? null : str6, (i & 32768) != 0 ? null : l8, (i & 65536) != 0 ? null : l9, (i & 131072) != 0 ? null : str7, (i & 262144) != 0 ? null : number, (524288 & i) != 0 ? null : l10, (1048576 & i) != 0 ? null : str8, (2097152 & i) != 0 ? null : l11, (4194304 & i) != 0 ? null : l12, (8388608 & i) != 0 ? null : l13, (16777216 & i) != 0 ? null : l14, (33554432 & i) != 0 ? null : l15, (67108864 & i) != 0 ? null : customTimings, (134217728 & i) != 0 ? null : bool, (268435456 & i) != 0 ? null : bool2, action, error, (i & Integer.MIN_VALUE) != 0 ? null : crash, (i2 & 1) != 0 ? null : longTask, (i2 & 2) != 0 ? null : frozenFrame, (i2 & 4) != 0 ? null : list, resource, (i2 & 16) != 0 ? null : frustration, (i2 & 32) != 0 ? null : list2, (i2 & 64) != 0 ? null : number2, (i2 & 128) != 0 ? null : number3, (i2 & 256) != 0 ? null : number4, (i2 & 512) != 0 ? null : number5, (i2 & 1024) != 0 ? null : number6, (i2 & 2048) != 0 ? null : number7, (i2 & 4096) != 0 ? null : number8, (i2 & 8192) != 0 ? null : number9, (i2 & 16384) != 0 ? null : flutterBuildTime, (i2 & 32768) != 0 ? null : flutterBuildTime2, (i2 & 65536) != 0 ? null : flutterBuildTime3, (i2 & 131072) != 0 ? null : performance, (i2 & 262144) != 0 ? null : accessibility);
        }

        public final java.lang.String getId() {
            return this.id;
        }

        public final java.lang.String getReferrer() {
            return this.referrer;
        }

        public final void setReferrer(java.lang.String str) {
            this.referrer = str;
        }

        public final java.lang.String getUrl() {
            return this.url;
        }

        public final void setUrl(java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.url = str;
        }

        public final java.lang.String getName() {
            return this.name;
        }

        public final void setName(java.lang.String str) {
            this.name = str;
        }

        public final java.lang.Long getLoadingTime() {
            return this.loadingTime;
        }

        public final java.lang.Long getNetworkSettledTime() {
            return this.networkSettledTime;
        }

        public final java.lang.Long getInteractionToNextViewTime() {
            return this.interactionToNextViewTime;
        }

        public final com.datadog.android.rum.model.ViewEvent.LoadingType getLoadingType() {
            return this.loadingType;
        }

        public final long getTimeSpent() {
            return this.timeSpent;
        }

        public final java.lang.Long getFirstContentfulPaint() {
            return this.firstContentfulPaint;
        }

        public final java.lang.Long getLargestContentfulPaint() {
            return this.largestContentfulPaint;
        }

        public final java.lang.String getLargestContentfulPaintTargetSelector() {
            return this.largestContentfulPaintTargetSelector;
        }

        public final java.lang.Long getFirstInputDelay() {
            return this.firstInputDelay;
        }

        public final java.lang.Long getFirstInputTime() {
            return this.firstInputTime;
        }

        public final java.lang.String getFirstInputTargetSelector() {
            return this.firstInputTargetSelector;
        }

        public final java.lang.Long getInteractionToNextPaint() {
            return this.interactionToNextPaint;
        }

        public final java.lang.Long getInteractionToNextPaintTime() {
            return this.interactionToNextPaintTime;
        }

        public final java.lang.String getInteractionToNextPaintTargetSelector() {
            return this.interactionToNextPaintTargetSelector;
        }

        public final java.lang.Number getCumulativeLayoutShift() {
            return this.cumulativeLayoutShift;
        }

        public final java.lang.Long getCumulativeLayoutShiftTime() {
            return this.cumulativeLayoutShiftTime;
        }

        public final java.lang.String getCumulativeLayoutShiftTargetSelector() {
            return this.cumulativeLayoutShiftTargetSelector;
        }

        public final java.lang.Long getDomComplete() {
            return this.domComplete;
        }

        public final java.lang.Long getDomContentLoaded() {
            return this.domContentLoaded;
        }

        public final java.lang.Long getDomInteractive() {
            return this.domInteractive;
        }

        public final java.lang.Long getLoadEvent() {
            return this.loadEvent;
        }

        public final java.lang.Long getFirstByte() {
            return this.firstByte;
        }

        public final com.datadog.android.rum.model.ViewEvent.CustomTimings getCustomTimings() {
            return this.customTimings;
        }

        public final java.lang.Boolean isActive() {
            return this.isActive;
        }

        public final java.lang.Boolean isSlowRendered() {
            return this.isSlowRendered;
        }

        public final com.datadog.android.rum.model.ViewEvent.Action getAction() {
            return this.action;
        }

        public final com.datadog.android.rum.model.ViewEvent.Error getError() {
            return this.error;
        }

        public final com.datadog.android.rum.model.ViewEvent.Crash getCrash() {
            return this.crash;
        }

        public final com.datadog.android.rum.model.ViewEvent.LongTask getLongTask() {
            return this.longTask;
        }

        public final com.datadog.android.rum.model.ViewEvent.FrozenFrame getFrozenFrame() {
            return this.frozenFrame;
        }

        public final java.util.List<com.datadog.android.rum.model.ViewEvent.SlowFrame> getSlowFrames() {
            return this.slowFrames;
        }

        public final com.datadog.android.rum.model.ViewEvent.Resource getResource() {
            return this.resource;
        }

        public final com.datadog.android.rum.model.ViewEvent.Frustration getFrustration() {
            return this.frustration;
        }

        public final java.util.List<com.datadog.android.rum.model.ViewEvent.InForegroundPeriod> getInForegroundPeriods() {
            return this.inForegroundPeriods;
        }

        public final java.lang.Number getMemoryAverage() {
            return this.memoryAverage;
        }

        public final java.lang.Number getMemoryMax() {
            return this.memoryMax;
        }

        public final java.lang.Number getCpuTicksCount() {
            return this.cpuTicksCount;
        }

        public final java.lang.Number getCpuTicksPerSecond() {
            return this.cpuTicksPerSecond;
        }

        public final java.lang.Number getRefreshRateAverage() {
            return this.refreshRateAverage;
        }

        public final java.lang.Number getRefreshRateMin() {
            return this.refreshRateMin;
        }

        public final java.lang.Number getSlowFramesRate() {
            return this.slowFramesRate;
        }

        public final java.lang.Number getFreezeRate() {
            return this.freezeRate;
        }

        public final com.datadog.android.rum.model.ViewEvent.FlutterBuildTime getFlutterBuildTime() {
            return this.flutterBuildTime;
        }

        public final com.datadog.android.rum.model.ViewEvent.FlutterBuildTime getFlutterRasterTime() {
            return this.flutterRasterTime;
        }

        public final com.datadog.android.rum.model.ViewEvent.FlutterBuildTime getJsRefreshRate() {
            return this.jsRefreshRate;
        }

        public final com.datadog.android.rum.model.ViewEvent.Performance getPerformance() {
            return this.performance;
        }

        public final com.datadog.android.rum.model.ViewEvent.Accessibility getAccessibility() {
            return this.accessibility;
        }

        public final com.google.gson.JsonElement toJson() {
            com.google.gson.JsonObject jsonObject = new com.google.gson.JsonObject();
            jsonObject.addProperty("id", this.id);
            java.lang.String str = this.referrer;
            if (str != null) {
                jsonObject.addProperty(com.adjust.sdk.Constants.REFERRER, str);
            }
            jsonObject.addProperty("url", this.url);
            java.lang.String str2 = this.name;
            if (str2 != null) {
                jsonObject.addProperty("name", str2);
            }
            java.lang.Long l = this.loadingTime;
            if (l != null) {
                jsonObject.addProperty(com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_LOADING_TIME, java.lang.Long.valueOf(l.longValue()));
            }
            java.lang.Long l2 = this.networkSettledTime;
            if (l2 != null) {
                jsonObject.addProperty("network_settled_time", java.lang.Long.valueOf(l2.longValue()));
            }
            java.lang.Long l3 = this.interactionToNextViewTime;
            if (l3 != null) {
                jsonObject.addProperty("interaction_to_next_view_time", java.lang.Long.valueOf(l3.longValue()));
            }
            com.datadog.android.rum.model.ViewEvent.LoadingType loadingType = this.loadingType;
            if (loadingType != null) {
                jsonObject.add("loading_type", loadingType.toJson());
            }
            jsonObject.addProperty("time_spent", java.lang.Long.valueOf(this.timeSpent));
            java.lang.Long l4 = this.firstContentfulPaint;
            if (l4 != null) {
                jsonObject.addProperty("first_contentful_paint", java.lang.Long.valueOf(l4.longValue()));
            }
            java.lang.Long l5 = this.largestContentfulPaint;
            if (l5 != null) {
                jsonObject.addProperty("largest_contentful_paint", java.lang.Long.valueOf(l5.longValue()));
            }
            java.lang.String str3 = this.largestContentfulPaintTargetSelector;
            if (str3 != null) {
                jsonObject.addProperty("largest_contentful_paint_target_selector", str3);
            }
            java.lang.Long l6 = this.firstInputDelay;
            if (l6 != null) {
                jsonObject.addProperty("first_input_delay", java.lang.Long.valueOf(l6.longValue()));
            }
            java.lang.Long l7 = this.firstInputTime;
            if (l7 != null) {
                jsonObject.addProperty("first_input_time", java.lang.Long.valueOf(l7.longValue()));
            }
            java.lang.String str4 = this.firstInputTargetSelector;
            if (str4 != null) {
                jsonObject.addProperty("first_input_target_selector", str4);
            }
            java.lang.Long l8 = this.interactionToNextPaint;
            if (l8 != null) {
                jsonObject.addProperty("interaction_to_next_paint", java.lang.Long.valueOf(l8.longValue()));
            }
            java.lang.Long l9 = this.interactionToNextPaintTime;
            if (l9 != null) {
                jsonObject.addProperty("interaction_to_next_paint_time", java.lang.Long.valueOf(l9.longValue()));
            }
            java.lang.String str5 = this.interactionToNextPaintTargetSelector;
            if (str5 != null) {
                jsonObject.addProperty("interaction_to_next_paint_target_selector", str5);
            }
            java.lang.Number number = this.cumulativeLayoutShift;
            if (number != null) {
                jsonObject.addProperty("cumulative_layout_shift", number);
            }
            java.lang.Long l10 = this.cumulativeLayoutShiftTime;
            if (l10 != null) {
                jsonObject.addProperty("cumulative_layout_shift_time", java.lang.Long.valueOf(l10.longValue()));
            }
            java.lang.String str6 = this.cumulativeLayoutShiftTargetSelector;
            if (str6 != null) {
                jsonObject.addProperty("cumulative_layout_shift_target_selector", str6);
            }
            java.lang.Long l11 = this.domComplete;
            if (l11 != null) {
                jsonObject.addProperty("dom_complete", java.lang.Long.valueOf(l11.longValue()));
            }
            java.lang.Long l12 = this.domContentLoaded;
            if (l12 != null) {
                jsonObject.addProperty("dom_content_loaded", java.lang.Long.valueOf(l12.longValue()));
            }
            java.lang.Long l13 = this.domInteractive;
            if (l13 != null) {
                jsonObject.addProperty("dom_interactive", java.lang.Long.valueOf(l13.longValue()));
            }
            java.lang.Long l14 = this.loadEvent;
            if (l14 != null) {
                jsonObject.addProperty("load_event", java.lang.Long.valueOf(l14.longValue()));
            }
            java.lang.Long l15 = this.firstByte;
            if (l15 != null) {
                jsonObject.addProperty("first_byte", java.lang.Long.valueOf(l15.longValue()));
            }
            com.datadog.android.rum.model.ViewEvent.CustomTimings customTimings = this.customTimings;
            if (customTimings != null) {
                jsonObject.add("custom_timings", customTimings.toJson());
            }
            java.lang.Boolean bool = this.isActive;
            if (bool != null) {
                jsonObject.addProperty("is_active", java.lang.Boolean.valueOf(bool.booleanValue()));
            }
            java.lang.Boolean bool2 = this.isSlowRendered;
            if (bool2 != null) {
                jsonObject.addProperty("is_slow_rendered", java.lang.Boolean.valueOf(bool2.booleanValue()));
            }
            jsonObject.add("action", this.action.toJson());
            jsonObject.add("error", this.error.toJson());
            com.datadog.android.rum.model.ViewEvent.Crash crash = this.crash;
            if (crash != null) {
                jsonObject.add("crash", crash.toJson());
            }
            com.datadog.android.rum.model.ViewEvent.LongTask longTask = this.longTask;
            if (longTask != null) {
                jsonObject.add(com.datadog.android.rum.internal.domain.event.RumEventDeserializer.EVENT_TYPE_LONG_TASK, longTask.toJson());
            }
            com.datadog.android.rum.model.ViewEvent.FrozenFrame frozenFrame = this.frozenFrame;
            if (frozenFrame != null) {
                jsonObject.add("frozen_frame", frozenFrame.toJson());
            }
            java.util.List<com.datadog.android.rum.model.ViewEvent.SlowFrame> list = this.slowFrames;
            if (list != null) {
                com.google.gson.JsonArray jsonArray = new com.google.gson.JsonArray(list.size());
                java.util.Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    jsonArray.add(((com.datadog.android.rum.model.ViewEvent.SlowFrame) it.next()).toJson());
                }
                jsonObject.add(com.datadog.android.rum.internal.metric.slowframes.DefaultUISlownessMetricDispatcher.KEY_SLOW_FRAMES, jsonArray);
            }
            jsonObject.add("resource", this.resource.toJson());
            com.datadog.android.rum.model.ViewEvent.Frustration frustration = this.frustration;
            if (frustration != null) {
                jsonObject.add("frustration", frustration.toJson());
            }
            java.util.List<com.datadog.android.rum.model.ViewEvent.InForegroundPeriod> list2 = this.inForegroundPeriods;
            if (list2 != null) {
                com.google.gson.JsonArray jsonArray2 = new com.google.gson.JsonArray(list2.size());
                java.util.Iterator<T> it2 = list2.iterator();
                while (it2.hasNext()) {
                    jsonArray2.add(((com.datadog.android.rum.model.ViewEvent.InForegroundPeriod) it2.next()).toJson());
                }
                jsonObject.add("in_foreground_periods", jsonArray2);
            }
            java.lang.Number number2 = this.memoryAverage;
            if (number2 != null) {
                jsonObject.addProperty("memory_average", number2);
            }
            java.lang.Number number3 = this.memoryMax;
            if (number3 != null) {
                jsonObject.addProperty("memory_max", number3);
            }
            java.lang.Number number4 = this.cpuTicksCount;
            if (number4 != null) {
                jsonObject.addProperty("cpu_ticks_count", number4);
            }
            java.lang.Number number5 = this.cpuTicksPerSecond;
            if (number5 != null) {
                jsonObject.addProperty("cpu_ticks_per_second", number5);
            }
            java.lang.Number number6 = this.refreshRateAverage;
            if (number6 != null) {
                jsonObject.addProperty("refresh_rate_average", number6);
            }
            java.lang.Number number7 = this.refreshRateMin;
            if (number7 != null) {
                jsonObject.addProperty("refresh_rate_min", number7);
            }
            java.lang.Number number8 = this.slowFramesRate;
            if (number8 != null) {
                jsonObject.addProperty("slow_frames_rate", number8);
            }
            java.lang.Number number9 = this.freezeRate;
            if (number9 != null) {
                jsonObject.addProperty("freeze_rate", number9);
            }
            com.datadog.android.rum.model.ViewEvent.FlutterBuildTime flutterBuildTime = this.flutterBuildTime;
            if (flutterBuildTime != null) {
                jsonObject.add("flutter_build_time", flutterBuildTime.toJson());
            }
            com.datadog.android.rum.model.ViewEvent.FlutterBuildTime flutterBuildTime2 = this.flutterRasterTime;
            if (flutterBuildTime2 != null) {
                jsonObject.add("flutter_raster_time", flutterBuildTime2.toJson());
            }
            com.datadog.android.rum.model.ViewEvent.FlutterBuildTime flutterBuildTime3 = this.jsRefreshRate;
            if (flutterBuildTime3 != null) {
                jsonObject.add("js_refresh_rate", flutterBuildTime3.toJson());
            }
            com.datadog.android.rum.model.ViewEvent.Performance performance = this.performance;
            if (performance != null) {
                jsonObject.add("performance", performance.toJson());
            }
            com.datadog.android.rum.model.ViewEvent.Accessibility accessibility = this.accessibility;
            if (accessibility != null) {
                jsonObject.add("accessibility", accessibility.toJson());
            }
            return jsonObject;
        }

        @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/datadog/android/rum/model/ViewEvent$ViewEventView$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/rum/model/ViewEvent$ViewEventView;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/rum/model/ViewEvent$ViewEventView;", "Lcom/google/gson/JsonObject;", "jsonObject", "fromJsonObject", "(Lcom/google/gson/JsonObject;)Lcom/datadog/android/rum/model/ViewEvent$ViewEventView;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @kotlin.jvm.JvmStatic
            public final com.datadog.android.rum.model.ViewEvent.ViewEventView fromJson(java.lang.String jsonString) throws com.google.gson.JsonParseException {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonString, "");
                try {
                    com.google.gson.JsonObject asJsonObject = com.google.gson.JsonParser.parseString(jsonString).getAsJsonObject();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asJsonObject, "");
                    return fromJsonObject(asJsonObject);
                } catch (java.lang.IllegalStateException e) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type ViewEventView", e);
                }
            }

            /* JADX WARN: Unreachable blocks removed: 2, instructions: 3 */
            @kotlin.jvm.JvmStatic
            public final com.datadog.android.rum.model.ViewEvent.ViewEventView fromJsonObject(com.google.gson.JsonObject jsonObject) throws com.google.gson.JsonParseException {
                java.lang.String str;
                java.lang.String str2;
                java.lang.NumberFormatException numberFormatException;
                java.lang.NullPointerException nullPointerException;
                java.lang.String str3;
                java.lang.IllegalStateException illegalStateException;
                java.lang.String asString;
                com.datadog.android.rum.model.ViewEvent.CustomTimings customTimings;
                java.util.ArrayList arrayList;
                long j;
                java.util.ArrayList arrayList2;
                com.google.gson.JsonObject asJsonObject;
                com.google.gson.JsonObject asJsonObject2;
                com.google.gson.JsonObject asJsonObject3;
                com.google.gson.JsonObject asJsonObject4;
                com.google.gson.JsonObject asJsonObject5;
                com.google.gson.JsonArray asJsonArray;
                com.google.gson.JsonObject asJsonObject6;
                com.google.gson.JsonArray asJsonArray2;
                com.google.gson.JsonObject asJsonObject7;
                com.google.gson.JsonObject asJsonObject8;
                com.google.gson.JsonObject asJsonObject9;
                com.google.gson.JsonObject asJsonObject10;
                java.lang.String asString2;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonObject, "");
                try {
                    java.lang.String asString3 = jsonObject.get("id").getAsString();
                    com.google.gson.JsonElement jsonElement = jsonObject.get(com.adjust.sdk.Constants.REFERRER);
                    if (jsonElement != null) {
                        try {
                            asString = jsonElement.getAsString();
                        } catch (java.lang.IllegalStateException e) {
                            illegalStateException = e;
                            str3 = "Unable to parse json into type ViewEventView";
                            throw new com.google.gson.JsonParseException(str3, illegalStateException);
                        } catch (java.lang.NullPointerException e2) {
                            nullPointerException = e2;
                            str = "Unable to parse json into type ViewEventView";
                            throw new com.google.gson.JsonParseException(str, nullPointerException);
                        } catch (java.lang.NumberFormatException e3) {
                            numberFormatException = e3;
                            str2 = "Unable to parse json into type ViewEventView";
                            throw new com.google.gson.JsonParseException(str2, numberFormatException);
                        }
                    } else {
                        asString = null;
                    }
                    java.lang.String asString4 = jsonObject.get("url").getAsString();
                    com.google.gson.JsonElement jsonElement2 = jsonObject.get("name");
                    java.lang.String asString5 = jsonElement2 != null ? jsonElement2.getAsString() : null;
                    com.google.gson.JsonElement jsonElement3 = jsonObject.get(com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_LOADING_TIME);
                    java.lang.Long valueOf = jsonElement3 != null ? java.lang.Long.valueOf(jsonElement3.getAsLong()) : null;
                    com.google.gson.JsonElement jsonElement4 = jsonObject.get("network_settled_time");
                    java.lang.Long valueOf2 = jsonElement4 != null ? java.lang.Long.valueOf(jsonElement4.getAsLong()) : null;
                    com.google.gson.JsonElement jsonElement5 = jsonObject.get("interaction_to_next_view_time");
                    java.lang.Long valueOf3 = jsonElement5 != null ? java.lang.Long.valueOf(jsonElement5.getAsLong()) : null;
                    com.google.gson.JsonElement jsonElement6 = jsonObject.get("loading_type");
                    com.datadog.android.rum.model.ViewEvent.LoadingType fromJson = (jsonElement6 == null || (asString2 = jsonElement6.getAsString()) == null) ? null : com.datadog.android.rum.model.ViewEvent.LoadingType.INSTANCE.fromJson(asString2);
                    long asLong = jsonObject.get("time_spent").getAsLong();
                    com.google.gson.JsonElement jsonElement7 = jsonObject.get("first_contentful_paint");
                    java.lang.Long valueOf4 = jsonElement7 != null ? java.lang.Long.valueOf(jsonElement7.getAsLong()) : null;
                    com.google.gson.JsonElement jsonElement8 = jsonObject.get("largest_contentful_paint");
                    java.lang.Long valueOf5 = jsonElement8 != null ? java.lang.Long.valueOf(jsonElement8.getAsLong()) : null;
                    com.google.gson.JsonElement jsonElement9 = jsonObject.get("largest_contentful_paint_target_selector");
                    java.lang.String asString6 = jsonElement9 != null ? jsonElement9.getAsString() : null;
                    com.google.gson.JsonElement jsonElement10 = jsonObject.get("first_input_delay");
                    java.lang.Long valueOf6 = jsonElement10 != null ? java.lang.Long.valueOf(jsonElement10.getAsLong()) : null;
                    com.google.gson.JsonElement jsonElement11 = jsonObject.get("first_input_time");
                    java.lang.Long valueOf7 = jsonElement11 != null ? java.lang.Long.valueOf(jsonElement11.getAsLong()) : null;
                    com.google.gson.JsonElement jsonElement12 = jsonObject.get("first_input_target_selector");
                    java.lang.String asString7 = jsonElement12 != null ? jsonElement12.getAsString() : null;
                    com.google.gson.JsonElement jsonElement13 = jsonObject.get("interaction_to_next_paint");
                    java.lang.Long valueOf8 = jsonElement13 != null ? java.lang.Long.valueOf(jsonElement13.getAsLong()) : null;
                    com.google.gson.JsonElement jsonElement14 = jsonObject.get("interaction_to_next_paint_time");
                    java.lang.Long valueOf9 = jsonElement14 != null ? java.lang.Long.valueOf(jsonElement14.getAsLong()) : null;
                    com.google.gson.JsonElement jsonElement15 = jsonObject.get("interaction_to_next_paint_target_selector");
                    java.lang.String asString8 = jsonElement15 != null ? jsonElement15.getAsString() : null;
                    com.google.gson.JsonElement jsonElement16 = jsonObject.get("cumulative_layout_shift");
                    java.lang.Number asNumber = jsonElement16 != null ? jsonElement16.getAsNumber() : null;
                    com.google.gson.JsonElement jsonElement17 = jsonObject.get("cumulative_layout_shift_time");
                    java.lang.Long valueOf10 = jsonElement17 != null ? java.lang.Long.valueOf(jsonElement17.getAsLong()) : null;
                    com.google.gson.JsonElement jsonElement18 = jsonObject.get("cumulative_layout_shift_target_selector");
                    java.lang.String asString9 = jsonElement18 != null ? jsonElement18.getAsString() : null;
                    com.google.gson.JsonElement jsonElement19 = jsonObject.get("dom_complete");
                    java.lang.Long valueOf11 = jsonElement19 != null ? java.lang.Long.valueOf(jsonElement19.getAsLong()) : null;
                    com.google.gson.JsonElement jsonElement20 = jsonObject.get("dom_content_loaded");
                    java.lang.Long valueOf12 = jsonElement20 != null ? java.lang.Long.valueOf(jsonElement20.getAsLong()) : null;
                    com.google.gson.JsonElement jsonElement21 = jsonObject.get("dom_interactive");
                    java.lang.Long valueOf13 = jsonElement21 != null ? java.lang.Long.valueOf(jsonElement21.getAsLong()) : null;
                    com.google.gson.JsonElement jsonElement22 = jsonObject.get("load_event");
                    java.lang.Long valueOf14 = jsonElement22 != null ? java.lang.Long.valueOf(jsonElement22.getAsLong()) : null;
                    com.google.gson.JsonElement jsonElement23 = jsonObject.get("first_byte");
                    java.lang.Long valueOf15 = jsonElement23 != null ? java.lang.Long.valueOf(jsonElement23.getAsLong()) : null;
                    com.google.gson.JsonElement jsonElement24 = jsonObject.get("custom_timings");
                    com.datadog.android.rum.model.ViewEvent.CustomTimings fromJsonObject = (jsonElement24 == null || (asJsonObject10 = jsonElement24.getAsJsonObject()) == null) ? null : com.datadog.android.rum.model.ViewEvent.CustomTimings.INSTANCE.fromJsonObject(asJsonObject10);
                    com.google.gson.JsonElement jsonElement25 = jsonObject.get("is_active");
                    java.lang.Boolean valueOf16 = jsonElement25 != null ? java.lang.Boolean.valueOf(jsonElement25.getAsBoolean()) : null;
                    com.google.gson.JsonElement jsonElement26 = jsonObject.get("is_slow_rendered");
                    java.lang.Boolean valueOf17 = jsonElement26 != null ? java.lang.Boolean.valueOf(jsonElement26.getAsBoolean()) : null;
                    com.google.gson.JsonObject asJsonObject11 = jsonObject.get("action").getAsJsonObject();
                    str = "Unable to parse json into type ViewEventView";
                    try {
                        com.datadog.android.rum.model.ViewEvent.Action.Companion companion = com.datadog.android.rum.model.ViewEvent.Action.INSTANCE;
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asJsonObject11, "");
                        com.datadog.android.rum.model.ViewEvent.Action fromJsonObject2 = companion.fromJsonObject(asJsonObject11);
                        com.google.gson.JsonObject asJsonObject12 = jsonObject.get("error").getAsJsonObject();
                        com.datadog.android.rum.model.ViewEvent.Error.Companion companion2 = com.datadog.android.rum.model.ViewEvent.Error.INSTANCE;
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asJsonObject12, "");
                        com.datadog.android.rum.model.ViewEvent.Error fromJsonObject3 = companion2.fromJsonObject(asJsonObject12);
                        com.google.gson.JsonElement jsonElement27 = jsonObject.get("crash");
                        com.datadog.android.rum.model.ViewEvent.Crash fromJsonObject4 = (jsonElement27 == null || (asJsonObject9 = jsonElement27.getAsJsonObject()) == null) ? null : com.datadog.android.rum.model.ViewEvent.Crash.INSTANCE.fromJsonObject(asJsonObject9);
                        com.google.gson.JsonElement jsonElement28 = jsonObject.get(com.datadog.android.rum.internal.domain.event.RumEventDeserializer.EVENT_TYPE_LONG_TASK);
                        com.datadog.android.rum.model.ViewEvent.LongTask fromJsonObject5 = (jsonElement28 == null || (asJsonObject8 = jsonElement28.getAsJsonObject()) == null) ? null : com.datadog.android.rum.model.ViewEvent.LongTask.INSTANCE.fromJsonObject(asJsonObject8);
                        com.google.gson.JsonElement jsonElement29 = jsonObject.get("frozen_frame");
                        com.datadog.android.rum.model.ViewEvent.FrozenFrame fromJsonObject6 = (jsonElement29 == null || (asJsonObject7 = jsonElement29.getAsJsonObject()) == null) ? null : com.datadog.android.rum.model.ViewEvent.FrozenFrame.INSTANCE.fromJsonObject(asJsonObject7);
                        com.google.gson.JsonElement jsonElement30 = jsonObject.get(com.datadog.android.rum.internal.metric.slowframes.DefaultUISlownessMetricDispatcher.KEY_SLOW_FRAMES);
                        if (jsonElement30 == null || (asJsonArray2 = jsonElement30.getAsJsonArray()) == null) {
                            customTimings = fromJsonObject;
                            arrayList = null;
                        } else {
                            customTimings = fromJsonObject;
                            arrayList = new java.util.ArrayList(asJsonArray2.size());
                            java.util.Iterator<com.google.gson.JsonElement> it = asJsonArray2.iterator();
                            while (it.hasNext()) {
                                com.google.gson.JsonElement next = it.next();
                                java.util.Iterator<com.google.gson.JsonElement> it2 = it;
                                com.datadog.android.rum.model.ViewEvent.SlowFrame.Companion companion3 = com.datadog.android.rum.model.ViewEvent.SlowFrame.INSTANCE;
                                com.google.gson.JsonObject asJsonObject13 = next.getAsJsonObject();
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asJsonObject13, "");
                                arrayList.add(companion3.fromJsonObject(asJsonObject13));
                                it = it2;
                            }
                        }
                        com.google.gson.JsonObject asJsonObject14 = jsonObject.get("resource").getAsJsonObject();
                        com.datadog.android.rum.model.ViewEvent.Resource.Companion companion4 = com.datadog.android.rum.model.ViewEvent.Resource.INSTANCE;
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asJsonObject14, "");
                        com.datadog.android.rum.model.ViewEvent.Resource fromJsonObject7 = companion4.fromJsonObject(asJsonObject14);
                        com.google.gson.JsonElement jsonElement31 = jsonObject.get("frustration");
                        com.datadog.android.rum.model.ViewEvent.Frustration fromJsonObject8 = (jsonElement31 == null || (asJsonObject6 = jsonElement31.getAsJsonObject()) == null) ? null : com.datadog.android.rum.model.ViewEvent.Frustration.INSTANCE.fromJsonObject(asJsonObject6);
                        com.google.gson.JsonElement jsonElement32 = jsonObject.get("in_foreground_periods");
                        if (jsonElement32 == null || (asJsonArray = jsonElement32.getAsJsonArray()) == null) {
                            j = asLong;
                            arrayList2 = null;
                        } else {
                            j = asLong;
                            arrayList2 = new java.util.ArrayList(asJsonArray.size());
                            for (com.google.gson.JsonElement jsonElement33 : asJsonArray) {
                                com.datadog.android.rum.model.ViewEvent.InForegroundPeriod.Companion companion5 = com.datadog.android.rum.model.ViewEvent.InForegroundPeriod.INSTANCE;
                                com.google.gson.JsonObject asJsonObject15 = jsonElement33.getAsJsonObject();
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asJsonObject15, "");
                                arrayList2.add(companion5.fromJsonObject(asJsonObject15));
                            }
                        }
                        com.google.gson.JsonElement jsonElement34 = jsonObject.get("memory_average");
                        java.lang.Number asNumber2 = jsonElement34 != null ? jsonElement34.getAsNumber() : null;
                        com.google.gson.JsonElement jsonElement35 = jsonObject.get("memory_max");
                        java.lang.Number asNumber3 = jsonElement35 != null ? jsonElement35.getAsNumber() : null;
                        com.google.gson.JsonElement jsonElement36 = jsonObject.get("cpu_ticks_count");
                        java.lang.Number asNumber4 = jsonElement36 != null ? jsonElement36.getAsNumber() : null;
                        com.google.gson.JsonElement jsonElement37 = jsonObject.get("cpu_ticks_per_second");
                        java.lang.Number asNumber5 = jsonElement37 != null ? jsonElement37.getAsNumber() : null;
                        com.google.gson.JsonElement jsonElement38 = jsonObject.get("refresh_rate_average");
                        java.lang.Number asNumber6 = jsonElement38 != null ? jsonElement38.getAsNumber() : null;
                        com.google.gson.JsonElement jsonElement39 = jsonObject.get("refresh_rate_min");
                        java.lang.Number asNumber7 = jsonElement39 != null ? jsonElement39.getAsNumber() : null;
                        com.google.gson.JsonElement jsonElement40 = jsonObject.get("slow_frames_rate");
                        java.lang.Number asNumber8 = jsonElement40 != null ? jsonElement40.getAsNumber() : null;
                        com.google.gson.JsonElement jsonElement41 = jsonObject.get("freeze_rate");
                        java.lang.Number asNumber9 = jsonElement41 != null ? jsonElement41.getAsNumber() : null;
                        com.google.gson.JsonElement jsonElement42 = jsonObject.get("flutter_build_time");
                        com.datadog.android.rum.model.ViewEvent.FlutterBuildTime fromJsonObject9 = (jsonElement42 == null || (asJsonObject5 = jsonElement42.getAsJsonObject()) == null) ? null : com.datadog.android.rum.model.ViewEvent.FlutterBuildTime.INSTANCE.fromJsonObject(asJsonObject5);
                        com.google.gson.JsonElement jsonElement43 = jsonObject.get("flutter_raster_time");
                        com.datadog.android.rum.model.ViewEvent.FlutterBuildTime fromJsonObject10 = (jsonElement43 == null || (asJsonObject4 = jsonElement43.getAsJsonObject()) == null) ? null : com.datadog.android.rum.model.ViewEvent.FlutterBuildTime.INSTANCE.fromJsonObject(asJsonObject4);
                        com.google.gson.JsonElement jsonElement44 = jsonObject.get("js_refresh_rate");
                        com.datadog.android.rum.model.ViewEvent.FlutterBuildTime fromJsonObject11 = (jsonElement44 == null || (asJsonObject3 = jsonElement44.getAsJsonObject()) == null) ? null : com.datadog.android.rum.model.ViewEvent.FlutterBuildTime.INSTANCE.fromJsonObject(asJsonObject3);
                        com.google.gson.JsonElement jsonElement45 = jsonObject.get("performance");
                        com.datadog.android.rum.model.ViewEvent.Performance fromJsonObject12 = (jsonElement45 == null || (asJsonObject2 = jsonElement45.getAsJsonObject()) == null) ? null : com.datadog.android.rum.model.ViewEvent.Performance.INSTANCE.fromJsonObject(asJsonObject2);
                        com.google.gson.JsonElement jsonElement46 = jsonObject.get("accessibility");
                        com.datadog.android.rum.model.ViewEvent.Accessibility fromJsonObject13 = (jsonElement46 == null || (asJsonObject = jsonElement46.getAsJsonObject()) == null) ? null : com.datadog.android.rum.model.ViewEvent.Accessibility.INSTANCE.fromJsonObject(asJsonObject);
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asString3, "");
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asString4, "");
                        return new com.datadog.android.rum.model.ViewEvent.ViewEventView(asString3, asString, asString4, asString5, valueOf, valueOf2, valueOf3, fromJson, j, valueOf4, valueOf5, asString6, valueOf6, valueOf7, asString7, valueOf8, valueOf9, asString8, asNumber, valueOf10, asString9, valueOf11, valueOf12, valueOf13, valueOf14, valueOf15, customTimings, valueOf16, valueOf17, fromJsonObject2, fromJsonObject3, fromJsonObject4, fromJsonObject5, fromJsonObject6, arrayList, fromJsonObject7, fromJsonObject8, arrayList2, asNumber2, asNumber3, asNumber4, asNumber5, asNumber6, asNumber7, asNumber8, asNumber9, fromJsonObject9, fromJsonObject10, fromJsonObject11, fromJsonObject12, fromJsonObject13);
                    } catch (java.lang.IllegalStateException e4) {
                        e = e4;
                        illegalStateException = e;
                        str3 = str;
                        throw new com.google.gson.JsonParseException(str3, illegalStateException);
                    } catch (java.lang.NullPointerException e5) {
                        e = e5;
                        nullPointerException = e;
                        throw new com.google.gson.JsonParseException(str, nullPointerException);
                    } catch (java.lang.NumberFormatException e6) {
                        e = e6;
                        numberFormatException = e;
                        str2 = str;
                        throw new com.google.gson.JsonParseException(str2, numberFormatException);
                    }
                } catch (java.lang.IllegalStateException e7) {
                    e = e7;
                    str = "Unable to parse json into type ViewEventView";
                } catch (java.lang.NullPointerException e8) {
                    e = e8;
                    str = "Unable to parse json into type ViewEventView";
                } catch (java.lang.NumberFormatException e9) {
                    e = e9;
                    str = "Unable to parse json into type ViewEventView";
                }
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public final java.lang.String toString() {
            java.lang.String str = this.id;
            java.lang.String str2 = this.referrer;
            java.lang.String str3 = this.url;
            java.lang.String str4 = this.name;
            java.lang.Long l = this.loadingTime;
            java.lang.Long l2 = this.networkSettledTime;
            java.lang.Long l3 = this.interactionToNextViewTime;
            com.datadog.android.rum.model.ViewEvent.LoadingType loadingType = this.loadingType;
            long j = this.timeSpent;
            java.lang.Long l4 = this.firstContentfulPaint;
            java.lang.Long l5 = this.largestContentfulPaint;
            java.lang.String str5 = this.largestContentfulPaintTargetSelector;
            java.lang.Long l6 = this.firstInputDelay;
            java.lang.Long l7 = this.firstInputTime;
            java.lang.String str6 = this.firstInputTargetSelector;
            java.lang.Long l8 = this.interactionToNextPaint;
            java.lang.Long l9 = this.interactionToNextPaintTime;
            java.lang.String str7 = this.interactionToNextPaintTargetSelector;
            java.lang.Number number = this.cumulativeLayoutShift;
            java.lang.Long l10 = this.cumulativeLayoutShiftTime;
            java.lang.String str8 = this.cumulativeLayoutShiftTargetSelector;
            java.lang.Long l11 = this.domComplete;
            java.lang.Long l12 = this.domContentLoaded;
            java.lang.Long l13 = this.domInteractive;
            java.lang.Long l14 = this.loadEvent;
            java.lang.Long l15 = this.firstByte;
            com.datadog.android.rum.model.ViewEvent.CustomTimings customTimings = this.customTimings;
            java.lang.Boolean bool = this.isActive;
            java.lang.Boolean bool2 = this.isSlowRendered;
            com.datadog.android.rum.model.ViewEvent.Action action = this.action;
            com.datadog.android.rum.model.ViewEvent.Error error = this.error;
            com.datadog.android.rum.model.ViewEvent.Crash crash = this.crash;
            com.datadog.android.rum.model.ViewEvent.LongTask longTask = this.longTask;
            com.datadog.android.rum.model.ViewEvent.FrozenFrame frozenFrame = this.frozenFrame;
            java.util.List<com.datadog.android.rum.model.ViewEvent.SlowFrame> list = this.slowFrames;
            com.datadog.android.rum.model.ViewEvent.Resource resource = this.resource;
            com.datadog.android.rum.model.ViewEvent.Frustration frustration = this.frustration;
            java.util.List<com.datadog.android.rum.model.ViewEvent.InForegroundPeriod> list2 = this.inForegroundPeriods;
            java.lang.Number number2 = this.memoryAverage;
            java.lang.Number number3 = this.memoryMax;
            java.lang.Number number4 = this.cpuTicksCount;
            java.lang.Number number5 = this.cpuTicksPerSecond;
            java.lang.Number number6 = this.refreshRateAverage;
            java.lang.Number number7 = this.refreshRateMin;
            java.lang.Number number8 = this.slowFramesRate;
            java.lang.Number number9 = this.freezeRate;
            com.datadog.android.rum.model.ViewEvent.FlutterBuildTime flutterBuildTime = this.flutterBuildTime;
            com.datadog.android.rum.model.ViewEvent.FlutterBuildTime flutterBuildTime2 = this.flutterRasterTime;
            com.datadog.android.rum.model.ViewEvent.FlutterBuildTime flutterBuildTime3 = this.jsRefreshRate;
            com.datadog.android.rum.model.ViewEvent.Performance performance = this.performance;
            com.datadog.android.rum.model.ViewEvent.Accessibility accessibility = this.accessibility;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ViewEventView(id=");
            sb.append(str);
            sb.append(", referrer=");
            sb.append(str2);
            sb.append(", url=");
            sb.append(str3);
            sb.append(", name=");
            sb.append(str4);
            sb.append(", loadingTime=");
            sb.append(l);
            sb.append(", networkSettledTime=");
            sb.append(l2);
            sb.append(", interactionToNextViewTime=");
            sb.append(l3);
            sb.append(", loadingType=");
            sb.append(loadingType);
            sb.append(", timeSpent=");
            sb.append(j);
            sb.append(", firstContentfulPaint=");
            sb.append(l4);
            sb.append(", largestContentfulPaint=");
            sb.append(l5);
            sb.append(", largestContentfulPaintTargetSelector=");
            sb.append(str5);
            sb.append(", firstInputDelay=");
            sb.append(l6);
            sb.append(", firstInputTime=");
            sb.append(l7);
            sb.append(", firstInputTargetSelector=");
            sb.append(str6);
            sb.append(", interactionToNextPaint=");
            sb.append(l8);
            sb.append(", interactionToNextPaintTime=");
            sb.append(l9);
            sb.append(", interactionToNextPaintTargetSelector=");
            sb.append(str7);
            sb.append(", cumulativeLayoutShift=");
            sb.append(number);
            sb.append(", cumulativeLayoutShiftTime=");
            sb.append(l10);
            sb.append(", cumulativeLayoutShiftTargetSelector=");
            sb.append(str8);
            sb.append(", domComplete=");
            sb.append(l11);
            sb.append(", domContentLoaded=");
            sb.append(l12);
            sb.append(", domInteractive=");
            sb.append(l13);
            sb.append(", loadEvent=");
            sb.append(l14);
            sb.append(", firstByte=");
            sb.append(l15);
            sb.append(", customTimings=");
            sb.append(customTimings);
            sb.append(", isActive=");
            sb.append(bool);
            sb.append(", isSlowRendered=");
            sb.append(bool2);
            sb.append(", action=");
            sb.append(action);
            sb.append(", error=");
            sb.append(error);
            sb.append(", crash=");
            sb.append(crash);
            sb.append(", longTask=");
            sb.append(longTask);
            sb.append(", frozenFrame=");
            sb.append(frozenFrame);
            sb.append(", slowFrames=");
            sb.append(list);
            sb.append(", resource=");
            sb.append(resource);
            sb.append(", frustration=");
            sb.append(frustration);
            sb.append(", inForegroundPeriods=");
            sb.append(list2);
            sb.append(", memoryAverage=");
            sb.append(number2);
            sb.append(", memoryMax=");
            sb.append(number3);
            sb.append(", cpuTicksCount=");
            sb.append(number4);
            sb.append(", cpuTicksPerSecond=");
            sb.append(number5);
            sb.append(", refreshRateAverage=");
            sb.append(number6);
            sb.append(", refreshRateMin=");
            sb.append(number7);
            sb.append(", slowFramesRate=");
            sb.append(number8);
            sb.append(", freezeRate=");
            sb.append(number9);
            sb.append(", flutterBuildTime=");
            sb.append(flutterBuildTime);
            sb.append(", flutterRasterTime=");
            sb.append(flutterBuildTime2);
            sb.append(", jsRefreshRate=");
            sb.append(flutterBuildTime3);
            sb.append(", performance=");
            sb.append(performance);
            sb.append(", accessibility=");
            sb.append(accessibility);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.id.hashCode();
            java.lang.String str = this.referrer;
            int hashCode2 = str == null ? 0 : str.hashCode();
            int hashCode3 = this.url.hashCode();
            java.lang.String str2 = this.name;
            int hashCode4 = str2 == null ? 0 : str2.hashCode();
            java.lang.Long l = this.loadingTime;
            int hashCode5 = l == null ? 0 : l.hashCode();
            java.lang.Long l2 = this.networkSettledTime;
            int hashCode6 = l2 == null ? 0 : l2.hashCode();
            java.lang.Long l3 = this.interactionToNextViewTime;
            int hashCode7 = l3 == null ? 0 : l3.hashCode();
            com.datadog.android.rum.model.ViewEvent.LoadingType loadingType = this.loadingType;
            int hashCode8 = loadingType == null ? 0 : loadingType.hashCode();
            int hashCode9 = java.lang.Long.hashCode(this.timeSpent);
            java.lang.Long l4 = this.firstContentfulPaint;
            int hashCode10 = l4 == null ? 0 : l4.hashCode();
            java.lang.Long l5 = this.largestContentfulPaint;
            int hashCode11 = l5 == null ? 0 : l5.hashCode();
            java.lang.String str3 = this.largestContentfulPaintTargetSelector;
            int hashCode12 = str3 == null ? 0 : str3.hashCode();
            java.lang.Long l6 = this.firstInputDelay;
            int hashCode13 = l6 == null ? 0 : l6.hashCode();
            java.lang.Long l7 = this.firstInputTime;
            int hashCode14 = l7 == null ? 0 : l7.hashCode();
            java.lang.String str4 = this.firstInputTargetSelector;
            int hashCode15 = str4 == null ? 0 : str4.hashCode();
            java.lang.Long l8 = this.interactionToNextPaint;
            int hashCode16 = l8 == null ? 0 : l8.hashCode();
            java.lang.Long l9 = this.interactionToNextPaintTime;
            int hashCode17 = l9 == null ? 0 : l9.hashCode();
            java.lang.String str5 = this.interactionToNextPaintTargetSelector;
            int hashCode18 = str5 == null ? 0 : str5.hashCode();
            java.lang.Number number = this.cumulativeLayoutShift;
            int hashCode19 = number == null ? 0 : number.hashCode();
            java.lang.Long l10 = this.cumulativeLayoutShiftTime;
            int hashCode20 = l10 == null ? 0 : l10.hashCode();
            java.lang.String str6 = this.cumulativeLayoutShiftTargetSelector;
            int hashCode21 = str6 == null ? 0 : str6.hashCode();
            java.lang.Long l11 = this.domComplete;
            int hashCode22 = l11 == null ? 0 : l11.hashCode();
            java.lang.Long l12 = this.domContentLoaded;
            int hashCode23 = l12 == null ? 0 : l12.hashCode();
            java.lang.Long l13 = this.domInteractive;
            int hashCode24 = l13 == null ? 0 : l13.hashCode();
            java.lang.Long l14 = this.loadEvent;
            int hashCode25 = l14 == null ? 0 : l14.hashCode();
            java.lang.Long l15 = this.firstByte;
            int hashCode26 = l15 == null ? 0 : l15.hashCode();
            com.datadog.android.rum.model.ViewEvent.CustomTimings customTimings = this.customTimings;
            int hashCode27 = customTimings == null ? 0 : customTimings.hashCode();
            java.lang.Boolean bool = this.isActive;
            int hashCode28 = bool == null ? 0 : bool.hashCode();
            java.lang.Boolean bool2 = this.isSlowRendered;
            int hashCode29 = bool2 == null ? 0 : bool2.hashCode();
            int hashCode30 = this.action.hashCode();
            int hashCode31 = this.error.hashCode();
            com.datadog.android.rum.model.ViewEvent.Crash crash = this.crash;
            int hashCode32 = crash == null ? 0 : crash.hashCode();
            com.datadog.android.rum.model.ViewEvent.LongTask longTask = this.longTask;
            int hashCode33 = longTask == null ? 0 : longTask.hashCode();
            com.datadog.android.rum.model.ViewEvent.FrozenFrame frozenFrame = this.frozenFrame;
            int hashCode34 = frozenFrame == null ? 0 : frozenFrame.hashCode();
            java.util.List<com.datadog.android.rum.model.ViewEvent.SlowFrame> list = this.slowFrames;
            int hashCode35 = list == null ? 0 : list.hashCode();
            int hashCode36 = this.resource.hashCode();
            com.datadog.android.rum.model.ViewEvent.Frustration frustration = this.frustration;
            int hashCode37 = frustration == null ? 0 : frustration.hashCode();
            java.util.List<com.datadog.android.rum.model.ViewEvent.InForegroundPeriod> list2 = this.inForegroundPeriods;
            int hashCode38 = list2 == null ? 0 : list2.hashCode();
            java.lang.Number number2 = this.memoryAverage;
            int hashCode39 = number2 == null ? 0 : number2.hashCode();
            java.lang.Number number3 = this.memoryMax;
            int hashCode40 = number3 == null ? 0 : number3.hashCode();
            java.lang.Number number4 = this.cpuTicksCount;
            int hashCode41 = number4 == null ? 0 : number4.hashCode();
            java.lang.Number number5 = this.cpuTicksPerSecond;
            int hashCode42 = number5 == null ? 0 : number5.hashCode();
            java.lang.Number number6 = this.refreshRateAverage;
            int hashCode43 = number6 == null ? 0 : number6.hashCode();
            java.lang.Number number7 = this.refreshRateMin;
            int hashCode44 = number7 == null ? 0 : number7.hashCode();
            java.lang.Number number8 = this.slowFramesRate;
            int hashCode45 = number8 == null ? 0 : number8.hashCode();
            java.lang.Number number9 = this.freezeRate;
            int hashCode46 = number9 == null ? 0 : number9.hashCode();
            com.datadog.android.rum.model.ViewEvent.FlutterBuildTime flutterBuildTime = this.flutterBuildTime;
            int hashCode47 = flutterBuildTime == null ? 0 : flutterBuildTime.hashCode();
            com.datadog.android.rum.model.ViewEvent.FlutterBuildTime flutterBuildTime2 = this.flutterRasterTime;
            int hashCode48 = flutterBuildTime2 == null ? 0 : flutterBuildTime2.hashCode();
            com.datadog.android.rum.model.ViewEvent.FlutterBuildTime flutterBuildTime3 = this.jsRefreshRate;
            int hashCode49 = flutterBuildTime3 == null ? 0 : flutterBuildTime3.hashCode();
            com.datadog.android.rum.model.ViewEvent.Performance performance = this.performance;
            int hashCode50 = performance == null ? 0 : performance.hashCode();
            com.datadog.android.rum.model.ViewEvent.Accessibility accessibility = this.accessibility;
            return (((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + hashCode10) * 31) + hashCode11) * 31) + hashCode12) * 31) + hashCode13) * 31) + hashCode14) * 31) + hashCode15) * 31) + hashCode16) * 31) + hashCode17) * 31) + hashCode18) * 31) + hashCode19) * 31) + hashCode20) * 31) + hashCode21) * 31) + hashCode22) * 31) + hashCode23) * 31) + hashCode24) * 31) + hashCode25) * 31) + hashCode26) * 31) + hashCode27) * 31) + hashCode28) * 31) + hashCode29) * 31) + hashCode30) * 31) + hashCode31) * 31) + hashCode32) * 31) + hashCode33) * 31) + hashCode34) * 31) + hashCode35) * 31) + hashCode36) * 31) + hashCode37) * 31) + hashCode38) * 31) + hashCode39) * 31) + hashCode40) * 31) + hashCode41) * 31) + hashCode42) * 31) + hashCode43) * 31) + hashCode44) * 31) + hashCode45) * 31) + hashCode46) * 31) + hashCode47) * 31) + hashCode48) * 31) + hashCode49) * 31) + hashCode50) * 31) + (accessibility != null ? accessibility.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.datadog.android.rum.model.ViewEvent.ViewEventView)) {
                return false;
            }
            com.datadog.android.rum.model.ViewEvent.ViewEventView viewEventView = (com.datadog.android.rum.model.ViewEvent.ViewEventView) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.id, viewEventView.id) && kotlin.jvm.internal.Intrinsics.areEqual(this.referrer, viewEventView.referrer) && kotlin.jvm.internal.Intrinsics.areEqual(this.url, viewEventView.url) && kotlin.jvm.internal.Intrinsics.areEqual(this.name, viewEventView.name) && kotlin.jvm.internal.Intrinsics.areEqual(this.loadingTime, viewEventView.loadingTime) && kotlin.jvm.internal.Intrinsics.areEqual(this.networkSettledTime, viewEventView.networkSettledTime) && kotlin.jvm.internal.Intrinsics.areEqual(this.interactionToNextViewTime, viewEventView.interactionToNextViewTime) && this.loadingType == viewEventView.loadingType && this.timeSpent == viewEventView.timeSpent && kotlin.jvm.internal.Intrinsics.areEqual(this.firstContentfulPaint, viewEventView.firstContentfulPaint) && kotlin.jvm.internal.Intrinsics.areEqual(this.largestContentfulPaint, viewEventView.largestContentfulPaint) && kotlin.jvm.internal.Intrinsics.areEqual(this.largestContentfulPaintTargetSelector, viewEventView.largestContentfulPaintTargetSelector) && kotlin.jvm.internal.Intrinsics.areEqual(this.firstInputDelay, viewEventView.firstInputDelay) && kotlin.jvm.internal.Intrinsics.areEqual(this.firstInputTime, viewEventView.firstInputTime) && kotlin.jvm.internal.Intrinsics.areEqual(this.firstInputTargetSelector, viewEventView.firstInputTargetSelector) && kotlin.jvm.internal.Intrinsics.areEqual(this.interactionToNextPaint, viewEventView.interactionToNextPaint) && kotlin.jvm.internal.Intrinsics.areEqual(this.interactionToNextPaintTime, viewEventView.interactionToNextPaintTime) && kotlin.jvm.internal.Intrinsics.areEqual(this.interactionToNextPaintTargetSelector, viewEventView.interactionToNextPaintTargetSelector) && kotlin.jvm.internal.Intrinsics.areEqual(this.cumulativeLayoutShift, viewEventView.cumulativeLayoutShift) && kotlin.jvm.internal.Intrinsics.areEqual(this.cumulativeLayoutShiftTime, viewEventView.cumulativeLayoutShiftTime) && kotlin.jvm.internal.Intrinsics.areEqual(this.cumulativeLayoutShiftTargetSelector, viewEventView.cumulativeLayoutShiftTargetSelector) && kotlin.jvm.internal.Intrinsics.areEqual(this.domComplete, viewEventView.domComplete) && kotlin.jvm.internal.Intrinsics.areEqual(this.domContentLoaded, viewEventView.domContentLoaded) && kotlin.jvm.internal.Intrinsics.areEqual(this.domInteractive, viewEventView.domInteractive) && kotlin.jvm.internal.Intrinsics.areEqual(this.loadEvent, viewEventView.loadEvent) && kotlin.jvm.internal.Intrinsics.areEqual(this.firstByte, viewEventView.firstByte) && kotlin.jvm.internal.Intrinsics.areEqual(this.customTimings, viewEventView.customTimings) && kotlin.jvm.internal.Intrinsics.areEqual(this.isActive, viewEventView.isActive) && kotlin.jvm.internal.Intrinsics.areEqual(this.isSlowRendered, viewEventView.isSlowRendered) && kotlin.jvm.internal.Intrinsics.areEqual(this.action, viewEventView.action) && kotlin.jvm.internal.Intrinsics.areEqual(this.error, viewEventView.error) && kotlin.jvm.internal.Intrinsics.areEqual(this.crash, viewEventView.crash) && kotlin.jvm.internal.Intrinsics.areEqual(this.longTask, viewEventView.longTask) && kotlin.jvm.internal.Intrinsics.areEqual(this.frozenFrame, viewEventView.frozenFrame) && kotlin.jvm.internal.Intrinsics.areEqual(this.slowFrames, viewEventView.slowFrames) && kotlin.jvm.internal.Intrinsics.areEqual(this.resource, viewEventView.resource) && kotlin.jvm.internal.Intrinsics.areEqual(this.frustration, viewEventView.frustration) && kotlin.jvm.internal.Intrinsics.areEqual(this.inForegroundPeriods, viewEventView.inForegroundPeriods) && kotlin.jvm.internal.Intrinsics.areEqual(this.memoryAverage, viewEventView.memoryAverage) && kotlin.jvm.internal.Intrinsics.areEqual(this.memoryMax, viewEventView.memoryMax) && kotlin.jvm.internal.Intrinsics.areEqual(this.cpuTicksCount, viewEventView.cpuTicksCount) && kotlin.jvm.internal.Intrinsics.areEqual(this.cpuTicksPerSecond, viewEventView.cpuTicksPerSecond) && kotlin.jvm.internal.Intrinsics.areEqual(this.refreshRateAverage, viewEventView.refreshRateAverage) && kotlin.jvm.internal.Intrinsics.areEqual(this.refreshRateMin, viewEventView.refreshRateMin) && kotlin.jvm.internal.Intrinsics.areEqual(this.slowFramesRate, viewEventView.slowFramesRate) && kotlin.jvm.internal.Intrinsics.areEqual(this.freezeRate, viewEventView.freezeRate) && kotlin.jvm.internal.Intrinsics.areEqual(this.flutterBuildTime, viewEventView.flutterBuildTime) && kotlin.jvm.internal.Intrinsics.areEqual(this.flutterRasterTime, viewEventView.flutterRasterTime) && kotlin.jvm.internal.Intrinsics.areEqual(this.jsRefreshRate, viewEventView.jsRefreshRate) && kotlin.jvm.internal.Intrinsics.areEqual(this.performance, viewEventView.performance) && kotlin.jvm.internal.Intrinsics.areEqual(this.accessibility, viewEventView.accessibility);
        }

        public final com.datadog.android.rum.model.ViewEvent.ViewEventView copy(java.lang.String id, java.lang.String referrer, java.lang.String url, java.lang.String name2, java.lang.Long loadingTime, java.lang.Long networkSettledTime, java.lang.Long interactionToNextViewTime, com.datadog.android.rum.model.ViewEvent.LoadingType loadingType, long timeSpent, java.lang.Long firstContentfulPaint, java.lang.Long largestContentfulPaint, java.lang.String largestContentfulPaintTargetSelector, java.lang.Long firstInputDelay, java.lang.Long firstInputTime, java.lang.String firstInputTargetSelector, java.lang.Long interactionToNextPaint, java.lang.Long interactionToNextPaintTime, java.lang.String interactionToNextPaintTargetSelector, java.lang.Number cumulativeLayoutShift, java.lang.Long cumulativeLayoutShiftTime, java.lang.String cumulativeLayoutShiftTargetSelector, java.lang.Long domComplete, java.lang.Long domContentLoaded, java.lang.Long domInteractive, java.lang.Long loadEvent, java.lang.Long firstByte, com.datadog.android.rum.model.ViewEvent.CustomTimings customTimings, java.lang.Boolean isActive, java.lang.Boolean isSlowRendered, com.datadog.android.rum.model.ViewEvent.Action action, com.datadog.android.rum.model.ViewEvent.Error error, com.datadog.android.rum.model.ViewEvent.Crash crash, com.datadog.android.rum.model.ViewEvent.LongTask longTask, com.datadog.android.rum.model.ViewEvent.FrozenFrame frozenFrame, java.util.List<com.datadog.android.rum.model.ViewEvent.SlowFrame> slowFrames, com.datadog.android.rum.model.ViewEvent.Resource resource, com.datadog.android.rum.model.ViewEvent.Frustration frustration, java.util.List<com.datadog.android.rum.model.ViewEvent.InForegroundPeriod> inForegroundPeriods, java.lang.Number memoryAverage, java.lang.Number memoryMax, java.lang.Number cpuTicksCount, java.lang.Number cpuTicksPerSecond, java.lang.Number refreshRateAverage, java.lang.Number refreshRateMin, java.lang.Number slowFramesRate, java.lang.Number freezeRate, com.datadog.android.rum.model.ViewEvent.FlutterBuildTime flutterBuildTime, com.datadog.android.rum.model.ViewEvent.FlutterBuildTime flutterRasterTime, com.datadog.android.rum.model.ViewEvent.FlutterBuildTime jsRefreshRate, com.datadog.android.rum.model.ViewEvent.Performance performance, com.datadog.android.rum.model.ViewEvent.Accessibility accessibility) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(action, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(resource, "");
            return new com.datadog.android.rum.model.ViewEvent.ViewEventView(id, referrer, url, name2, loadingTime, networkSettledTime, interactionToNextViewTime, loadingType, timeSpent, firstContentfulPaint, largestContentfulPaint, largestContentfulPaintTargetSelector, firstInputDelay, firstInputTime, firstInputTargetSelector, interactionToNextPaint, interactionToNextPaintTime, interactionToNextPaintTargetSelector, cumulativeLayoutShift, cumulativeLayoutShiftTime, cumulativeLayoutShiftTargetSelector, domComplete, domContentLoaded, domInteractive, loadEvent, firstByte, customTimings, isActive, isSlowRendered, action, error, crash, longTask, frozenFrame, slowFrames, resource, frustration, inForegroundPeriods, memoryAverage, memoryMax, cpuTicksCount, cpuTicksPerSecond, refreshRateAverage, refreshRateMin, slowFramesRate, freezeRate, flutterBuildTime, flutterRasterTime, jsRefreshRate, performance, accessibility);
        }

        /* renamed from: component9, reason: from getter */
        public final long getTimeSpent() {
            return this.timeSpent;
        }

        /* renamed from: component8, reason: from getter */
        public final com.datadog.android.rum.model.ViewEvent.LoadingType getLoadingType() {
            return this.loadingType;
        }

        /* renamed from: component7, reason: from getter */
        public final java.lang.Long getInteractionToNextViewTime() {
            return this.interactionToNextViewTime;
        }

        /* renamed from: component6, reason: from getter */
        public final java.lang.Long getNetworkSettledTime() {
            return this.networkSettledTime;
        }

        /* renamed from: component51, reason: from getter */
        public final com.datadog.android.rum.model.ViewEvent.Accessibility getAccessibility() {
            return this.accessibility;
        }

        /* renamed from: component50, reason: from getter */
        public final com.datadog.android.rum.model.ViewEvent.Performance getPerformance() {
            return this.performance;
        }

        /* renamed from: component5, reason: from getter */
        public final java.lang.Long getLoadingTime() {
            return this.loadingTime;
        }

        /* renamed from: component49, reason: from getter */
        public final com.datadog.android.rum.model.ViewEvent.FlutterBuildTime getJsRefreshRate() {
            return this.jsRefreshRate;
        }

        /* renamed from: component48, reason: from getter */
        public final com.datadog.android.rum.model.ViewEvent.FlutterBuildTime getFlutterRasterTime() {
            return this.flutterRasterTime;
        }

        /* renamed from: component47, reason: from getter */
        public final com.datadog.android.rum.model.ViewEvent.FlutterBuildTime getFlutterBuildTime() {
            return this.flutterBuildTime;
        }

        /* renamed from: component46, reason: from getter */
        public final java.lang.Number getFreezeRate() {
            return this.freezeRate;
        }

        /* renamed from: component45, reason: from getter */
        public final java.lang.Number getSlowFramesRate() {
            return this.slowFramesRate;
        }

        /* renamed from: component44, reason: from getter */
        public final java.lang.Number getRefreshRateMin() {
            return this.refreshRateMin;
        }

        /* renamed from: component43, reason: from getter */
        public final java.lang.Number getRefreshRateAverage() {
            return this.refreshRateAverage;
        }

        /* renamed from: component42, reason: from getter */
        public final java.lang.Number getCpuTicksPerSecond() {
            return this.cpuTicksPerSecond;
        }

        /* renamed from: component41, reason: from getter */
        public final java.lang.Number getCpuTicksCount() {
            return this.cpuTicksCount;
        }

        /* renamed from: component40, reason: from getter */
        public final java.lang.Number getMemoryMax() {
            return this.memoryMax;
        }

        /* renamed from: component4, reason: from getter */
        public final java.lang.String getName() {
            return this.name;
        }

        /* renamed from: component39, reason: from getter */
        public final java.lang.Number getMemoryAverage() {
            return this.memoryAverage;
        }

        public final java.util.List<com.datadog.android.rum.model.ViewEvent.InForegroundPeriod> component38() {
            return this.inForegroundPeriods;
        }

        /* renamed from: component37, reason: from getter */
        public final com.datadog.android.rum.model.ViewEvent.Frustration getFrustration() {
            return this.frustration;
        }

        /* renamed from: component36, reason: from getter */
        public final com.datadog.android.rum.model.ViewEvent.Resource getResource() {
            return this.resource;
        }

        public final java.util.List<com.datadog.android.rum.model.ViewEvent.SlowFrame> component35() {
            return this.slowFrames;
        }

        /* renamed from: component34, reason: from getter */
        public final com.datadog.android.rum.model.ViewEvent.FrozenFrame getFrozenFrame() {
            return this.frozenFrame;
        }

        /* renamed from: component33, reason: from getter */
        public final com.datadog.android.rum.model.ViewEvent.LongTask getLongTask() {
            return this.longTask;
        }

        /* renamed from: component32, reason: from getter */
        public final com.datadog.android.rum.model.ViewEvent.Crash getCrash() {
            return this.crash;
        }

        /* renamed from: component31, reason: from getter */
        public final com.datadog.android.rum.model.ViewEvent.Error getError() {
            return this.error;
        }

        /* renamed from: component30, reason: from getter */
        public final com.datadog.android.rum.model.ViewEvent.Action getAction() {
            return this.action;
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String getUrl() {
            return this.url;
        }

        /* renamed from: component29, reason: from getter */
        public final java.lang.Boolean getIsSlowRendered() {
            return this.isSlowRendered;
        }

        /* renamed from: component28, reason: from getter */
        public final java.lang.Boolean getIsActive() {
            return this.isActive;
        }

        /* renamed from: component27, reason: from getter */
        public final com.datadog.android.rum.model.ViewEvent.CustomTimings getCustomTimings() {
            return this.customTimings;
        }

        /* renamed from: component26, reason: from getter */
        public final java.lang.Long getFirstByte() {
            return this.firstByte;
        }

        /* renamed from: component25, reason: from getter */
        public final java.lang.Long getLoadEvent() {
            return this.loadEvent;
        }

        /* renamed from: component24, reason: from getter */
        public final java.lang.Long getDomInteractive() {
            return this.domInteractive;
        }

        /* renamed from: component23, reason: from getter */
        public final java.lang.Long getDomContentLoaded() {
            return this.domContentLoaded;
        }

        /* renamed from: component22, reason: from getter */
        public final java.lang.Long getDomComplete() {
            return this.domComplete;
        }

        /* renamed from: component21, reason: from getter */
        public final java.lang.String getCumulativeLayoutShiftTargetSelector() {
            return this.cumulativeLayoutShiftTargetSelector;
        }

        /* renamed from: component20, reason: from getter */
        public final java.lang.Long getCumulativeLayoutShiftTime() {
            return this.cumulativeLayoutShiftTime;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getReferrer() {
            return this.referrer;
        }

        /* renamed from: component19, reason: from getter */
        public final java.lang.Number getCumulativeLayoutShift() {
            return this.cumulativeLayoutShift;
        }

        /* renamed from: component18, reason: from getter */
        public final java.lang.String getInteractionToNextPaintTargetSelector() {
            return this.interactionToNextPaintTargetSelector;
        }

        /* renamed from: component17, reason: from getter */
        public final java.lang.Long getInteractionToNextPaintTime() {
            return this.interactionToNextPaintTime;
        }

        /* renamed from: component16, reason: from getter */
        public final java.lang.Long getInteractionToNextPaint() {
            return this.interactionToNextPaint;
        }

        /* renamed from: component15, reason: from getter */
        public final java.lang.String getFirstInputTargetSelector() {
            return this.firstInputTargetSelector;
        }

        /* renamed from: component14, reason: from getter */
        public final java.lang.Long getFirstInputTime() {
            return this.firstInputTime;
        }

        /* renamed from: component13, reason: from getter */
        public final java.lang.Long getFirstInputDelay() {
            return this.firstInputDelay;
        }

        /* renamed from: component12, reason: from getter */
        public final java.lang.String getLargestContentfulPaintTargetSelector() {
            return this.largestContentfulPaintTargetSelector;
        }

        /* renamed from: component11, reason: from getter */
        public final java.lang.Long getLargestContentfulPaint() {
            return this.largestContentfulPaint;
        }

        /* renamed from: component10, reason: from getter */
        public final java.lang.Long getFirstContentfulPaint() {
            return this.firstContentfulPaint;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getId() {
            return this.id;
        }

        @kotlin.jvm.JvmStatic
        public static final com.datadog.android.rum.model.ViewEvent.ViewEventView fromJsonObject(com.google.gson.JsonObject jsonObject) throws com.google.gson.JsonParseException {
            return INSTANCE.fromJsonObject(jsonObject);
        }

        @kotlin.jvm.JvmStatic
        public static final com.datadog.android.rum.model.ViewEvent.ViewEventView fromJson(java.lang.String str) throws com.google.gson.JsonParseException {
            return INSTANCE.fromJson(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0086\b\u0018\u0000 &2\u00020\u0001:\u0001&BO\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\fJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\fJ\u001e\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011JX\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0007HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\r\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001e\u0010\fR%\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00078\u0007¢\u0006\f\n\u0004\b\b\u0010\u001f\u001a\u0004\b \u0010\u0011R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010!\u001a\u0004\b\"\u0010\fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010!\u001a\u0004\b#\u0010\fR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b$\u0010\fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010!\u001a\u0004\b%\u0010\f"}, d2 = {"Lcom/datadog/android/rum/model/ViewEvent$Usr;", "", "", "id", "name", "email", "anonymousId", "", "additionalProperties", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "()Ljava/util/Map;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)Lcom/datadog/android/rum/model/ViewEvent$Usr;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lcom/google/gson/JsonElement;", "toJson", "()Lcom/google/gson/JsonElement;", "toString", "Ljava/util/Map;", "getAdditionalProperties", "Ljava/lang/String;", "getAnonymousId", "getEmail", "getId", "getName", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class Usr {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.datadog.android.rum.model.ViewEvent.Usr.Companion INSTANCE = new com.datadog.android.rum.model.ViewEvent.Usr.Companion(null);
        private static final java.lang.String[] RESERVED_PROPERTIES = {"id", "name", "email", "anonymous_id"};
        private final java.util.Map<java.lang.String, java.lang.Object> additionalProperties;
        private final java.lang.String anonymousId;
        private final java.lang.String email;
        private final java.lang.String id;
        private final java.lang.String name;

        public Usr(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.util.Map<java.lang.String, java.lang.Object> map) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
            this.id = str;
            this.name = str2;
            this.email = str3;
            this.anonymousId = str4;
            this.additionalProperties = map;
        }

        public final java.lang.String getId() {
            return this.id;
        }

        public final java.lang.String getName() {
            return this.name;
        }

        public final java.lang.String getEmail() {
            return this.email;
        }

        public final java.lang.String getAnonymousId() {
            return this.anonymousId;
        }

        public /* synthetic */ Usr(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.util.LinkedHashMap linkedHashMap, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) == 0 ? str4 : null, (i & 16) != 0 ? new java.util.LinkedHashMap() : linkedHashMap);
        }

        public final java.util.Map<java.lang.String, java.lang.Object> getAdditionalProperties() {
            return this.additionalProperties;
        }

        public final com.google.gson.JsonElement toJson() {
            com.google.gson.JsonObject jsonObject = new com.google.gson.JsonObject();
            java.lang.String str = this.id;
            if (str != null) {
                jsonObject.addProperty("id", str);
            }
            java.lang.String str2 = this.name;
            if (str2 != null) {
                jsonObject.addProperty("name", str2);
            }
            java.lang.String str3 = this.email;
            if (str3 != null) {
                jsonObject.addProperty("email", str3);
            }
            java.lang.String str4 = this.anonymousId;
            if (str4 != null) {
                jsonObject.addProperty("anonymous_id", str4);
            }
            for (java.util.Map.Entry<java.lang.String, java.lang.Object> entry : this.additionalProperties.entrySet()) {
                java.lang.String key = entry.getKey();
                java.lang.Object value = entry.getValue();
                if (!kotlin.collections.ArraysKt.contains(RESERVED_PROPERTIES, key)) {
                    jsonObject.add(key, com.datadog.android.core.internal.utils.JsonSerializer.INSTANCE.toJsonElement(value));
                }
            }
            return jsonObject;
        }

        @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\fR \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\r8\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011"}, d2 = {"Lcom/datadog/android/rum/model/ViewEvent$Usr$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/rum/model/ViewEvent$Usr;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/rum/model/ViewEvent$Usr;", "Lcom/google/gson/JsonObject;", "jsonObject", "fromJsonObject", "(Lcom/google/gson/JsonObject;)Lcom/datadog/android/rum/model/ViewEvent$Usr;", "", "RESERVED_PROPERTIES", "[Ljava/lang/String;", "getRESERVED_PROPERTIES$dd_sdk_android_rum_release", "()[Ljava/lang/String;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public final java.lang.String[] getRESERVED_PROPERTIES$dd_sdk_android_rum_release() {
                return com.datadog.android.rum.model.ViewEvent.Usr.RESERVED_PROPERTIES;
            }

            @kotlin.jvm.JvmStatic
            public final com.datadog.android.rum.model.ViewEvent.Usr fromJson(java.lang.String jsonString) throws com.google.gson.JsonParseException {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonString, "");
                try {
                    com.google.gson.JsonObject asJsonObject = com.google.gson.JsonParser.parseString(jsonString).getAsJsonObject();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asJsonObject, "");
                    return fromJsonObject(asJsonObject);
                } catch (java.lang.IllegalStateException e) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type Usr", e);
                }
            }

            @kotlin.jvm.JvmStatic
            public final com.datadog.android.rum.model.ViewEvent.Usr fromJsonObject(com.google.gson.JsonObject jsonObject) throws com.google.gson.JsonParseException {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonObject, "");
                try {
                    com.google.gson.JsonElement jsonElement = jsonObject.get("id");
                    java.lang.String asString = jsonElement != null ? jsonElement.getAsString() : null;
                    com.google.gson.JsonElement jsonElement2 = jsonObject.get("name");
                    java.lang.String asString2 = jsonElement2 != null ? jsonElement2.getAsString() : null;
                    com.google.gson.JsonElement jsonElement3 = jsonObject.get("email");
                    java.lang.String asString3 = jsonElement3 != null ? jsonElement3.getAsString() : null;
                    com.google.gson.JsonElement jsonElement4 = jsonObject.get("anonymous_id");
                    java.lang.String asString4 = jsonElement4 != null ? jsonElement4.getAsString() : null;
                    java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
                    for (java.util.Map.Entry<java.lang.String, com.google.gson.JsonElement> entry : jsonObject.entrySet()) {
                        if (!kotlin.collections.ArraysKt.contains(getRESERVED_PROPERTIES$dd_sdk_android_rum_release(), entry.getKey())) {
                            java.lang.String key = entry.getKey();
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(key, "");
                            linkedHashMap.put(key, entry.getValue());
                        }
                    }
                    return new com.datadog.android.rum.model.ViewEvent.Usr(asString, asString2, asString3, asString4, linkedHashMap);
                } catch (java.lang.IllegalStateException e) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type Usr", e);
                } catch (java.lang.NullPointerException e2) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type Usr", e2);
                } catch (java.lang.NumberFormatException e3) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type Usr", e3);
                }
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public final java.lang.String toString() {
            java.lang.String str = this.id;
            java.lang.String str2 = this.name;
            java.lang.String str3 = this.email;
            java.lang.String str4 = this.anonymousId;
            java.util.Map<java.lang.String, java.lang.Object> map = this.additionalProperties;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Usr(id=");
            sb.append(str);
            sb.append(", name=");
            sb.append(str2);
            sb.append(", email=");
            sb.append(str3);
            sb.append(", anonymousId=");
            sb.append(str4);
            sb.append(", additionalProperties=");
            sb.append(map);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.lang.String str = this.id;
            int hashCode = str == null ? 0 : str.hashCode();
            java.lang.String str2 = this.name;
            int hashCode2 = str2 == null ? 0 : str2.hashCode();
            java.lang.String str3 = this.email;
            int hashCode3 = str3 == null ? 0 : str3.hashCode();
            java.lang.String str4 = this.anonymousId;
            return (((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (str4 != null ? str4.hashCode() : 0)) * 31) + this.additionalProperties.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.datadog.android.rum.model.ViewEvent.Usr)) {
                return false;
            }
            com.datadog.android.rum.model.ViewEvent.Usr usr = (com.datadog.android.rum.model.ViewEvent.Usr) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.id, usr.id) && kotlin.jvm.internal.Intrinsics.areEqual(this.name, usr.name) && kotlin.jvm.internal.Intrinsics.areEqual(this.email, usr.email) && kotlin.jvm.internal.Intrinsics.areEqual(this.anonymousId, usr.anonymousId) && kotlin.jvm.internal.Intrinsics.areEqual(this.additionalProperties, usr.additionalProperties);
        }

        public final com.datadog.android.rum.model.ViewEvent.Usr copy(java.lang.String id, java.lang.String name2, java.lang.String email, java.lang.String anonymousId, java.util.Map<java.lang.String, java.lang.Object> additionalProperties) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(additionalProperties, "");
            return new com.datadog.android.rum.model.ViewEvent.Usr(id, name2, email, anonymousId, additionalProperties);
        }

        public final java.util.Map<java.lang.String, java.lang.Object> component5() {
            return this.additionalProperties;
        }

        /* renamed from: component4, reason: from getter */
        public final java.lang.String getAnonymousId() {
            return this.anonymousId;
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String getEmail() {
            return this.email;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getName() {
            return this.name;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getId() {
            return this.id;
        }

        @kotlin.jvm.JvmStatic
        public static final com.datadog.android.rum.model.ViewEvent.Usr fromJsonObject(com.google.gson.JsonObject jsonObject) throws com.google.gson.JsonParseException {
            return INSTANCE.fromJsonObject(jsonObject);
        }

        @kotlin.jvm.JvmStatic
        public static final com.datadog.android.rum.model.ViewEvent.Usr fromJson(java.lang.String str) throws com.google.gson.JsonParseException {
            return INSTANCE.fromJson(str);
        }

        public static /* synthetic */ com.datadog.android.rum.model.ViewEvent.Usr copy$default(com.datadog.android.rum.model.ViewEvent.Usr usr, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.util.Map map, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = usr.id;
            }
            if ((i & 2) != 0) {
                str2 = usr.name;
            }
            java.lang.String str5 = str2;
            if ((i & 4) != 0) {
                str3 = usr.email;
            }
            java.lang.String str6 = str3;
            if ((i & 8) != 0) {
                str4 = usr.anonymousId;
            }
            java.lang.String str7 = str4;
            if ((i & 16) != 0) {
                map = usr.additionalProperties;
            }
            return usr.copy(str, str5, str6, str7, map);
        }

        public Usr() {
            this(null, null, null, null, null, 31, null);
        }
    }

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\b\u0018\u0000  2\u00020\u0001:\u0001 B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u001e\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0005HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ>\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0005HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\nR%\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00058\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001c\u0010\rR\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\nR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001d\u001a\u0004\b\u001f\u0010\n"}, d2 = {"Lcom/datadog/android/rum/model/ViewEvent$Account;", "", "", "id", "name", "", "additionalProperties", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Ljava/util/Map;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)Lcom/datadog/android/rum/model/ViewEvent$Account;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lcom/google/gson/JsonElement;", "toJson", "()Lcom/google/gson/JsonElement;", "toString", "Ljava/util/Map;", "getAdditionalProperties", "Ljava/lang/String;", "getId", "getName", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class Account {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.datadog.android.rum.model.ViewEvent.Account.Companion INSTANCE = new com.datadog.android.rum.model.ViewEvent.Account.Companion(null);
        private static final java.lang.String[] RESERVED_PROPERTIES = {"id", "name"};
        private final java.util.Map<java.lang.String, java.lang.Object> additionalProperties;
        private final java.lang.String id;
        private final java.lang.String name;

        public Account(java.lang.String str, java.lang.String str2, java.util.Map<java.lang.String, java.lang.Object> map) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
            this.id = str;
            this.name = str2;
            this.additionalProperties = map;
        }

        public final java.lang.String getId() {
            return this.id;
        }

        public final java.lang.String getName() {
            return this.name;
        }

        public /* synthetic */ Account(java.lang.String str, java.lang.String str2, java.util.LinkedHashMap linkedHashMap, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? new java.util.LinkedHashMap() : linkedHashMap);
        }

        public final java.util.Map<java.lang.String, java.lang.Object> getAdditionalProperties() {
            return this.additionalProperties;
        }

        public final com.google.gson.JsonElement toJson() {
            com.google.gson.JsonObject jsonObject = new com.google.gson.JsonObject();
            jsonObject.addProperty("id", this.id);
            java.lang.String str = this.name;
            if (str != null) {
                jsonObject.addProperty("name", str);
            }
            for (java.util.Map.Entry<java.lang.String, java.lang.Object> entry : this.additionalProperties.entrySet()) {
                java.lang.String key = entry.getKey();
                java.lang.Object value = entry.getValue();
                if (!kotlin.collections.ArraysKt.contains(RESERVED_PROPERTIES, key)) {
                    jsonObject.add(key, com.datadog.android.core.internal.utils.JsonSerializer.INSTANCE.toJsonElement(value));
                }
            }
            return jsonObject;
        }

        @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\fR \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\r8\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011"}, d2 = {"Lcom/datadog/android/rum/model/ViewEvent$Account$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/rum/model/ViewEvent$Account;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/rum/model/ViewEvent$Account;", "Lcom/google/gson/JsonObject;", "jsonObject", "fromJsonObject", "(Lcom/google/gson/JsonObject;)Lcom/datadog/android/rum/model/ViewEvent$Account;", "", "RESERVED_PROPERTIES", "[Ljava/lang/String;", "getRESERVED_PROPERTIES$dd_sdk_android_rum_release", "()[Ljava/lang/String;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public final java.lang.String[] getRESERVED_PROPERTIES$dd_sdk_android_rum_release() {
                return com.datadog.android.rum.model.ViewEvent.Account.RESERVED_PROPERTIES;
            }

            @kotlin.jvm.JvmStatic
            public final com.datadog.android.rum.model.ViewEvent.Account fromJson(java.lang.String jsonString) throws com.google.gson.JsonParseException {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonString, "");
                try {
                    com.google.gson.JsonObject asJsonObject = com.google.gson.JsonParser.parseString(jsonString).getAsJsonObject();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asJsonObject, "");
                    return fromJsonObject(asJsonObject);
                } catch (java.lang.IllegalStateException e) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type Account", e);
                }
            }

            @kotlin.jvm.JvmStatic
            public final com.datadog.android.rum.model.ViewEvent.Account fromJsonObject(com.google.gson.JsonObject jsonObject) throws com.google.gson.JsonParseException {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonObject, "");
                try {
                    java.lang.String asString = jsonObject.get("id").getAsString();
                    com.google.gson.JsonElement jsonElement = jsonObject.get("name");
                    java.lang.String asString2 = jsonElement != null ? jsonElement.getAsString() : null;
                    java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
                    for (java.util.Map.Entry<java.lang.String, com.google.gson.JsonElement> entry : jsonObject.entrySet()) {
                        if (!kotlin.collections.ArraysKt.contains(getRESERVED_PROPERTIES$dd_sdk_android_rum_release(), entry.getKey())) {
                            java.lang.String key = entry.getKey();
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(key, "");
                            linkedHashMap.put(key, entry.getValue());
                        }
                    }
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asString, "");
                    return new com.datadog.android.rum.model.ViewEvent.Account(asString, asString2, linkedHashMap);
                } catch (java.lang.IllegalStateException e) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type Account", e);
                } catch (java.lang.NullPointerException e2) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type Account", e2);
                } catch (java.lang.NumberFormatException e3) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type Account", e3);
                }
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public final java.lang.String toString() {
            java.lang.String str = this.id;
            java.lang.String str2 = this.name;
            java.util.Map<java.lang.String, java.lang.Object> map = this.additionalProperties;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Account(id=");
            sb.append(str);
            sb.append(", name=");
            sb.append(str2);
            sb.append(", additionalProperties=");
            sb.append(map);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.id.hashCode();
            java.lang.String str = this.name;
            return (((hashCode * 31) + (str == null ? 0 : str.hashCode())) * 31) + this.additionalProperties.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.datadog.android.rum.model.ViewEvent.Account)) {
                return false;
            }
            com.datadog.android.rum.model.ViewEvent.Account account = (com.datadog.android.rum.model.ViewEvent.Account) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.id, account.id) && kotlin.jvm.internal.Intrinsics.areEqual(this.name, account.name) && kotlin.jvm.internal.Intrinsics.areEqual(this.additionalProperties, account.additionalProperties);
        }

        public final com.datadog.android.rum.model.ViewEvent.Account copy(java.lang.String id, java.lang.String name2, java.util.Map<java.lang.String, java.lang.Object> additionalProperties) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(additionalProperties, "");
            return new com.datadog.android.rum.model.ViewEvent.Account(id, name2, additionalProperties);
        }

        public final java.util.Map<java.lang.String, java.lang.Object> component3() {
            return this.additionalProperties;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getName() {
            return this.name;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getId() {
            return this.id;
        }

        @kotlin.jvm.JvmStatic
        public static final com.datadog.android.rum.model.ViewEvent.Account fromJsonObject(com.google.gson.JsonObject jsonObject) throws com.google.gson.JsonParseException {
            return INSTANCE.fromJsonObject(jsonObject);
        }

        @kotlin.jvm.JvmStatic
        public static final com.datadog.android.rum.model.ViewEvent.Account fromJson(java.lang.String str) throws com.google.gson.JsonParseException {
            return INSTANCE.fromJson(str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.datadog.android.rum.model.ViewEvent.Account copy$default(com.datadog.android.rum.model.ViewEvent.Account account, java.lang.String str, java.lang.String str2, java.util.Map map, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = account.id;
            }
            if ((i & 2) != 0) {
                str2 = account.name;
            }
            if ((i & 4) != 0) {
                map = account.additionalProperties;
            }
            return account.copy(str, str2, map);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\b\u0018\u0000 ,2\u00020\u0001:\u0001,B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014JD\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\r\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010\"\u001a\u00020!HÖ\u0001¢\u0006\u0004\b\"\u0010#R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0007¢\u0006\f\n\u0004\b\n\u0010$\u001a\u0004\b%\u0010\u0014R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010&\u001a\u0004\b'\u0010\u0012R\"\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010(\u001a\u0004\b)\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010*\u001a\u0004\b+\u0010\u000e"}, d2 = {"Lcom/datadog/android/rum/model/ViewEvent$Connectivity;", "", "Lcom/datadog/android/rum/model/ViewEvent$ConnectivityStatus;", "status", "", "Lcom/datadog/android/rum/model/ViewEvent$Interface;", "interfaces", "Lcom/datadog/android/rum/model/ViewEvent$EffectiveType;", "effectiveType", "Lcom/datadog/android/rum/model/ViewEvent$Cellular;", "cellular", "<init>", "(Lcom/datadog/android/rum/model/ViewEvent$ConnectivityStatus;Ljava/util/List;Lcom/datadog/android/rum/model/ViewEvent$EffectiveType;Lcom/datadog/android/rum/model/ViewEvent$Cellular;)V", "component1", "()Lcom/datadog/android/rum/model/ViewEvent$ConnectivityStatus;", "component2", "()Ljava/util/List;", "component3", "()Lcom/datadog/android/rum/model/ViewEvent$EffectiveType;", "component4", "()Lcom/datadog/android/rum/model/ViewEvent$Cellular;", "copy", "(Lcom/datadog/android/rum/model/ViewEvent$ConnectivityStatus;Ljava/util/List;Lcom/datadog/android/rum/model/ViewEvent$EffectiveType;Lcom/datadog/android/rum/model/ViewEvent$Cellular;)Lcom/datadog/android/rum/model/ViewEvent$Connectivity;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lcom/google/gson/JsonElement;", "toJson", "()Lcom/google/gson/JsonElement;", "", "toString", "()Ljava/lang/String;", "Lcom/datadog/android/rum/model/ViewEvent$Cellular;", "getCellular", "Lcom/datadog/android/rum/model/ViewEvent$EffectiveType;", "getEffectiveType", "Ljava/util/List;", "getInterfaces", "Lcom/datadog/android/rum/model/ViewEvent$ConnectivityStatus;", "getStatus", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class Connectivity {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.datadog.android.rum.model.ViewEvent.Connectivity.Companion INSTANCE = new com.datadog.android.rum.model.ViewEvent.Connectivity.Companion(null);
        private final com.datadog.android.rum.model.ViewEvent.Cellular cellular;
        private final com.datadog.android.rum.model.ViewEvent.EffectiveType effectiveType;
        private final java.util.List<com.datadog.android.rum.model.ViewEvent.Interface> interfaces;
        private final com.datadog.android.rum.model.ViewEvent.ConnectivityStatus status;

        /* JADX WARN: Multi-variable type inference failed */
        public Connectivity(com.datadog.android.rum.model.ViewEvent.ConnectivityStatus connectivityStatus, java.util.List<? extends com.datadog.android.rum.model.ViewEvent.Interface> list, com.datadog.android.rum.model.ViewEvent.EffectiveType effectiveType, com.datadog.android.rum.model.ViewEvent.Cellular cellular) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(connectivityStatus, "");
            this.status = connectivityStatus;
            this.interfaces = list;
            this.effectiveType = effectiveType;
            this.cellular = cellular;
        }

        public /* synthetic */ Connectivity(com.datadog.android.rum.model.ViewEvent.ConnectivityStatus connectivityStatus, java.util.List list, com.datadog.android.rum.model.ViewEvent.EffectiveType effectiveType, com.datadog.android.rum.model.ViewEvent.Cellular cellular, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(connectivityStatus, (i & 2) != 0 ? null : list, (i & 4) != 0 ? null : effectiveType, (i & 8) != 0 ? null : cellular);
        }

        public final com.datadog.android.rum.model.ViewEvent.ConnectivityStatus getStatus() {
            return this.status;
        }

        public final java.util.List<com.datadog.android.rum.model.ViewEvent.Interface> getInterfaces() {
            return this.interfaces;
        }

        public final com.datadog.android.rum.model.ViewEvent.EffectiveType getEffectiveType() {
            return this.effectiveType;
        }

        public final com.datadog.android.rum.model.ViewEvent.Cellular getCellular() {
            return this.cellular;
        }

        public final com.google.gson.JsonElement toJson() {
            com.google.gson.JsonObject jsonObject = new com.google.gson.JsonObject();
            jsonObject.add("status", this.status.toJson());
            java.util.List<com.datadog.android.rum.model.ViewEvent.Interface> list = this.interfaces;
            if (list != null) {
                com.google.gson.JsonArray jsonArray = new com.google.gson.JsonArray(list.size());
                java.util.Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    jsonArray.add(((com.datadog.android.rum.model.ViewEvent.Interface) it.next()).toJson());
                }
                jsonObject.add("interfaces", jsonArray);
            }
            com.datadog.android.rum.model.ViewEvent.EffectiveType effectiveType = this.effectiveType;
            if (effectiveType != null) {
                jsonObject.add("effective_type", effectiveType.toJson());
            }
            com.datadog.android.rum.model.ViewEvent.Cellular cellular = this.cellular;
            if (cellular != null) {
                jsonObject.add("cellular", cellular.toJson());
            }
            return jsonObject;
        }

        @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/datadog/android/rum/model/ViewEvent$Connectivity$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/rum/model/ViewEvent$Connectivity;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/rum/model/ViewEvent$Connectivity;", "Lcom/google/gson/JsonObject;", "jsonObject", "fromJsonObject", "(Lcom/google/gson/JsonObject;)Lcom/datadog/android/rum/model/ViewEvent$Connectivity;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @kotlin.jvm.JvmStatic
            public final com.datadog.android.rum.model.ViewEvent.Connectivity fromJson(java.lang.String jsonString) throws com.google.gson.JsonParseException {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonString, "");
                try {
                    com.google.gson.JsonObject asJsonObject = com.google.gson.JsonParser.parseString(jsonString).getAsJsonObject();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asJsonObject, "");
                    return fromJsonObject(asJsonObject);
                } catch (java.lang.IllegalStateException e) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type Connectivity", e);
                }
            }

            @kotlin.jvm.JvmStatic
            public final com.datadog.android.rum.model.ViewEvent.Connectivity fromJsonObject(com.google.gson.JsonObject jsonObject) throws com.google.gson.JsonParseException {
                java.util.ArrayList arrayList;
                com.google.gson.JsonObject asJsonObject;
                java.lang.String asString;
                com.google.gson.JsonArray asJsonArray;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonObject, "");
                try {
                    com.datadog.android.rum.model.ViewEvent.ConnectivityStatus.Companion companion = com.datadog.android.rum.model.ViewEvent.ConnectivityStatus.INSTANCE;
                    java.lang.String asString2 = jsonObject.get("status").getAsString();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asString2, "");
                    com.datadog.android.rum.model.ViewEvent.ConnectivityStatus fromJson = companion.fromJson(asString2);
                    com.google.gson.JsonElement jsonElement = jsonObject.get("interfaces");
                    com.datadog.android.rum.model.ViewEvent.Cellular cellular = null;
                    if (jsonElement == null || (asJsonArray = jsonElement.getAsJsonArray()) == null) {
                        arrayList = null;
                    } else {
                        arrayList = new java.util.ArrayList(asJsonArray.size());
                        for (com.google.gson.JsonElement jsonElement2 : asJsonArray) {
                            com.datadog.android.rum.model.ViewEvent.Interface.Companion companion2 = com.datadog.android.rum.model.ViewEvent.Interface.INSTANCE;
                            java.lang.String asString3 = jsonElement2.getAsString();
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asString3, "");
                            arrayList.add(companion2.fromJson(asString3));
                        }
                    }
                    com.google.gson.JsonElement jsonElement3 = jsonObject.get("effective_type");
                    com.datadog.android.rum.model.ViewEvent.EffectiveType fromJson2 = (jsonElement3 == null || (asString = jsonElement3.getAsString()) == null) ? null : com.datadog.android.rum.model.ViewEvent.EffectiveType.INSTANCE.fromJson(asString);
                    com.google.gson.JsonElement jsonElement4 = jsonObject.get("cellular");
                    if (jsonElement4 != null && (asJsonObject = jsonElement4.getAsJsonObject()) != null) {
                        cellular = com.datadog.android.rum.model.ViewEvent.Cellular.INSTANCE.fromJsonObject(asJsonObject);
                    }
                    return new com.datadog.android.rum.model.ViewEvent.Connectivity(fromJson, arrayList, fromJson2, cellular);
                } catch (java.lang.IllegalStateException e) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type Connectivity", e);
                } catch (java.lang.NullPointerException e2) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type Connectivity", e2);
                } catch (java.lang.NumberFormatException e3) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type Connectivity", e3);
                }
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public final java.lang.String toString() {
            com.datadog.android.rum.model.ViewEvent.ConnectivityStatus connectivityStatus = this.status;
            java.util.List<com.datadog.android.rum.model.ViewEvent.Interface> list = this.interfaces;
            com.datadog.android.rum.model.ViewEvent.EffectiveType effectiveType = this.effectiveType;
            com.datadog.android.rum.model.ViewEvent.Cellular cellular = this.cellular;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Connectivity(status=");
            sb.append(connectivityStatus);
            sb.append(", interfaces=");
            sb.append(list);
            sb.append(", effectiveType=");
            sb.append(effectiveType);
            sb.append(", cellular=");
            sb.append(cellular);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.status.hashCode();
            java.util.List<com.datadog.android.rum.model.ViewEvent.Interface> list = this.interfaces;
            int hashCode2 = list == null ? 0 : list.hashCode();
            com.datadog.android.rum.model.ViewEvent.EffectiveType effectiveType = this.effectiveType;
            int hashCode3 = effectiveType == null ? 0 : effectiveType.hashCode();
            com.datadog.android.rum.model.ViewEvent.Cellular cellular = this.cellular;
            return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (cellular != null ? cellular.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.datadog.android.rum.model.ViewEvent.Connectivity)) {
                return false;
            }
            com.datadog.android.rum.model.ViewEvent.Connectivity connectivity = (com.datadog.android.rum.model.ViewEvent.Connectivity) other;
            return this.status == connectivity.status && kotlin.jvm.internal.Intrinsics.areEqual(this.interfaces, connectivity.interfaces) && this.effectiveType == connectivity.effectiveType && kotlin.jvm.internal.Intrinsics.areEqual(this.cellular, connectivity.cellular);
        }

        public final com.datadog.android.rum.model.ViewEvent.Connectivity copy(com.datadog.android.rum.model.ViewEvent.ConnectivityStatus status, java.util.List<? extends com.datadog.android.rum.model.ViewEvent.Interface> interfaces, com.datadog.android.rum.model.ViewEvent.EffectiveType effectiveType, com.datadog.android.rum.model.ViewEvent.Cellular cellular) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(status, "");
            return new com.datadog.android.rum.model.ViewEvent.Connectivity(status, interfaces, effectiveType, cellular);
        }

        /* renamed from: component4, reason: from getter */
        public final com.datadog.android.rum.model.ViewEvent.Cellular getCellular() {
            return this.cellular;
        }

        /* renamed from: component3, reason: from getter */
        public final com.datadog.android.rum.model.ViewEvent.EffectiveType getEffectiveType() {
            return this.effectiveType;
        }

        public final java.util.List<com.datadog.android.rum.model.ViewEvent.Interface> component2() {
            return this.interfaces;
        }

        /* renamed from: component1, reason: from getter */
        public final com.datadog.android.rum.model.ViewEvent.ConnectivityStatus getStatus() {
            return this.status;
        }

        @kotlin.jvm.JvmStatic
        public static final com.datadog.android.rum.model.ViewEvent.Connectivity fromJsonObject(com.google.gson.JsonObject jsonObject) throws com.google.gson.JsonParseException {
            return INSTANCE.fromJsonObject(jsonObject);
        }

        @kotlin.jvm.JvmStatic
        public static final com.datadog.android.rum.model.ViewEvent.Connectivity fromJson(java.lang.String str) throws com.google.gson.JsonParseException {
            return INSTANCE.fromJson(str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.datadog.android.rum.model.ViewEvent.Connectivity copy$default(com.datadog.android.rum.model.ViewEvent.Connectivity connectivity, com.datadog.android.rum.model.ViewEvent.ConnectivityStatus connectivityStatus, java.util.List list, com.datadog.android.rum.model.ViewEvent.EffectiveType effectiveType, com.datadog.android.rum.model.ViewEvent.Cellular cellular, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                connectivityStatus = connectivity.status;
            }
            if ((i & 2) != 0) {
                list = connectivity.interfaces;
            }
            if ((i & 4) != 0) {
                effectiveType = connectivity.effectiveType;
            }
            if ((i & 8) != 0) {
                cellular = connectivity.cellular;
            }
            return connectivity.copy(connectivityStatus, list, effectiveType, cellular);
        }
    }

    @kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\b\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ(\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\u000bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\t"}, d2 = {"Lcom/datadog/android/rum/model/ViewEvent$Display;", "", "Lcom/datadog/android/rum/model/ViewEvent$Viewport;", "viewport", "Lcom/datadog/android/rum/model/ViewEvent$Scroll;", "scroll", "<init>", "(Lcom/datadog/android/rum/model/ViewEvent$Viewport;Lcom/datadog/android/rum/model/ViewEvent$Scroll;)V", "component1", "()Lcom/datadog/android/rum/model/ViewEvent$Viewport;", "component2", "()Lcom/datadog/android/rum/model/ViewEvent$Scroll;", "copy", "(Lcom/datadog/android/rum/model/ViewEvent$Viewport;Lcom/datadog/android/rum/model/ViewEvent$Scroll;)Lcom/datadog/android/rum/model/ViewEvent$Display;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lcom/google/gson/JsonElement;", "toJson", "()Lcom/google/gson/JsonElement;", "", "toString", "()Ljava/lang/String;", "Lcom/datadog/android/rum/model/ViewEvent$Scroll;", "getScroll", "Lcom/datadog/android/rum/model/ViewEvent$Viewport;", "getViewport", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class Display {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.datadog.android.rum.model.ViewEvent.Display.Companion INSTANCE = new com.datadog.android.rum.model.ViewEvent.Display.Companion(null);
        private final com.datadog.android.rum.model.ViewEvent.Scroll scroll;
        private final com.datadog.android.rum.model.ViewEvent.Viewport viewport;

        public Display(com.datadog.android.rum.model.ViewEvent.Viewport viewport, com.datadog.android.rum.model.ViewEvent.Scroll scroll) {
            this.viewport = viewport;
            this.scroll = scroll;
        }

        public /* synthetic */ Display(com.datadog.android.rum.model.ViewEvent.Viewport viewport, com.datadog.android.rum.model.ViewEvent.Scroll scroll, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : viewport, (i & 2) != 0 ? null : scroll);
        }

        public final com.datadog.android.rum.model.ViewEvent.Viewport getViewport() {
            return this.viewport;
        }

        public final com.datadog.android.rum.model.ViewEvent.Scroll getScroll() {
            return this.scroll;
        }

        public final com.google.gson.JsonElement toJson() {
            com.google.gson.JsonObject jsonObject = new com.google.gson.JsonObject();
            com.datadog.android.rum.model.ViewEvent.Viewport viewport = this.viewport;
            if (viewport != null) {
                jsonObject.add("viewport", viewport.toJson());
            }
            com.datadog.android.rum.model.ViewEvent.Scroll scroll = this.scroll;
            if (scroll != null) {
                jsonObject.add("scroll", scroll.toJson());
            }
            return jsonObject;
        }

        @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/datadog/android/rum/model/ViewEvent$Display$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/rum/model/ViewEvent$Display;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/rum/model/ViewEvent$Display;", "Lcom/google/gson/JsonObject;", "jsonObject", "fromJsonObject", "(Lcom/google/gson/JsonObject;)Lcom/datadog/android/rum/model/ViewEvent$Display;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @kotlin.jvm.JvmStatic
            public final com.datadog.android.rum.model.ViewEvent.Display fromJson(java.lang.String jsonString) throws com.google.gson.JsonParseException {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonString, "");
                try {
                    com.google.gson.JsonObject asJsonObject = com.google.gson.JsonParser.parseString(jsonString).getAsJsonObject();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asJsonObject, "");
                    return fromJsonObject(asJsonObject);
                } catch (java.lang.IllegalStateException e) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type Display", e);
                }
            }

            @kotlin.jvm.JvmStatic
            public final com.datadog.android.rum.model.ViewEvent.Display fromJsonObject(com.google.gson.JsonObject jsonObject) throws com.google.gson.JsonParseException {
                com.google.gson.JsonObject asJsonObject;
                com.google.gson.JsonObject asJsonObject2;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonObject, "");
                try {
                    com.google.gson.JsonElement jsonElement = jsonObject.get("viewport");
                    com.datadog.android.rum.model.ViewEvent.Scroll scroll = null;
                    com.datadog.android.rum.model.ViewEvent.Viewport fromJsonObject = (jsonElement == null || (asJsonObject2 = jsonElement.getAsJsonObject()) == null) ? null : com.datadog.android.rum.model.ViewEvent.Viewport.INSTANCE.fromJsonObject(asJsonObject2);
                    com.google.gson.JsonElement jsonElement2 = jsonObject.get("scroll");
                    if (jsonElement2 != null && (asJsonObject = jsonElement2.getAsJsonObject()) != null) {
                        scroll = com.datadog.android.rum.model.ViewEvent.Scroll.INSTANCE.fromJsonObject(asJsonObject);
                    }
                    return new com.datadog.android.rum.model.ViewEvent.Display(fromJsonObject, scroll);
                } catch (java.lang.IllegalStateException e) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type Display", e);
                } catch (java.lang.NullPointerException e2) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type Display", e2);
                } catch (java.lang.NumberFormatException e3) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type Display", e3);
                }
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public final java.lang.String toString() {
            com.datadog.android.rum.model.ViewEvent.Viewport viewport = this.viewport;
            com.datadog.android.rum.model.ViewEvent.Scroll scroll = this.scroll;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Display(viewport=");
            sb.append(viewport);
            sb.append(", scroll=");
            sb.append(scroll);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            com.datadog.android.rum.model.ViewEvent.Viewport viewport = this.viewport;
            int hashCode = viewport == null ? 0 : viewport.hashCode();
            com.datadog.android.rum.model.ViewEvent.Scroll scroll = this.scroll;
            return (hashCode * 31) + (scroll != null ? scroll.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.datadog.android.rum.model.ViewEvent.Display)) {
                return false;
            }
            com.datadog.android.rum.model.ViewEvent.Display display = (com.datadog.android.rum.model.ViewEvent.Display) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.viewport, display.viewport) && kotlin.jvm.internal.Intrinsics.areEqual(this.scroll, display.scroll);
        }

        public final com.datadog.android.rum.model.ViewEvent.Display copy(com.datadog.android.rum.model.ViewEvent.Viewport viewport, com.datadog.android.rum.model.ViewEvent.Scroll scroll) {
            return new com.datadog.android.rum.model.ViewEvent.Display(viewport, scroll);
        }

        /* renamed from: component2, reason: from getter */
        public final com.datadog.android.rum.model.ViewEvent.Scroll getScroll() {
            return this.scroll;
        }

        /* renamed from: component1, reason: from getter */
        public final com.datadog.android.rum.model.ViewEvent.Viewport getViewport() {
            return this.viewport;
        }

        @kotlin.jvm.JvmStatic
        public static final com.datadog.android.rum.model.ViewEvent.Display fromJsonObject(com.google.gson.JsonObject jsonObject) throws com.google.gson.JsonParseException {
            return INSTANCE.fromJsonObject(jsonObject);
        }

        @kotlin.jvm.JvmStatic
        public static final com.datadog.android.rum.model.ViewEvent.Display fromJson(java.lang.String str) throws com.google.gson.JsonParseException {
            return INSTANCE.fromJson(str);
        }

        public static /* synthetic */ com.datadog.android.rum.model.ViewEvent.Display copy$default(com.datadog.android.rum.model.ViewEvent.Display display, com.datadog.android.rum.model.ViewEvent.Viewport viewport, com.datadog.android.rum.model.ViewEvent.Scroll scroll, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                viewport = display.viewport;
            }
            if ((i & 2) != 0) {
                scroll = display.scroll;
            }
            return display.copy(viewport, scroll);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Display() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\b\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ0\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0011\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\nR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001b\u0010\rR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001c\u001a\u0004\b\u001d\u0010\nR\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001e\u0010\n"}, d2 = {"Lcom/datadog/android/rum/model/ViewEvent$Synthetics;", "", "", "testId", "resultId", "", "injected", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Ljava/lang/Boolean;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)Lcom/datadog/android/rum/model/ViewEvent$Synthetics;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lcom/google/gson/JsonElement;", "toJson", "()Lcom/google/gson/JsonElement;", "toString", "Ljava/lang/Boolean;", "getInjected", "Ljava/lang/String;", "getResultId", "getTestId", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class Synthetics {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.datadog.android.rum.model.ViewEvent.Synthetics.Companion INSTANCE = new com.datadog.android.rum.model.ViewEvent.Synthetics.Companion(null);
        private final java.lang.Boolean injected;
        private final java.lang.String resultId;
        private final java.lang.String testId;

        public Synthetics(java.lang.String str, java.lang.String str2, java.lang.Boolean bool) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            this.testId = str;
            this.resultId = str2;
            this.injected = bool;
        }

        public /* synthetic */ Synthetics(java.lang.String str, java.lang.String str2, java.lang.Boolean bool, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, (i & 4) != 0 ? null : bool);
        }

        public final java.lang.String getTestId() {
            return this.testId;
        }

        public final java.lang.String getResultId() {
            return this.resultId;
        }

        public final java.lang.Boolean getInjected() {
            return this.injected;
        }

        public final com.google.gson.JsonElement toJson() {
            com.google.gson.JsonObject jsonObject = new com.google.gson.JsonObject();
            jsonObject.addProperty("test_id", this.testId);
            jsonObject.addProperty("result_id", this.resultId);
            java.lang.Boolean bool = this.injected;
            if (bool != null) {
                jsonObject.addProperty("injected", java.lang.Boolean.valueOf(bool.booleanValue()));
            }
            return jsonObject;
        }

        @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/datadog/android/rum/model/ViewEvent$Synthetics$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/rum/model/ViewEvent$Synthetics;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/rum/model/ViewEvent$Synthetics;", "Lcom/google/gson/JsonObject;", "jsonObject", "fromJsonObject", "(Lcom/google/gson/JsonObject;)Lcom/datadog/android/rum/model/ViewEvent$Synthetics;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @kotlin.jvm.JvmStatic
            public final com.datadog.android.rum.model.ViewEvent.Synthetics fromJson(java.lang.String jsonString) throws com.google.gson.JsonParseException {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonString, "");
                try {
                    com.google.gson.JsonObject asJsonObject = com.google.gson.JsonParser.parseString(jsonString).getAsJsonObject();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asJsonObject, "");
                    return fromJsonObject(asJsonObject);
                } catch (java.lang.IllegalStateException e) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type Synthetics", e);
                }
            }

            @kotlin.jvm.JvmStatic
            public final com.datadog.android.rum.model.ViewEvent.Synthetics fromJsonObject(com.google.gson.JsonObject jsonObject) throws com.google.gson.JsonParseException {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonObject, "");
                try {
                    java.lang.String asString = jsonObject.get("test_id").getAsString();
                    java.lang.String asString2 = jsonObject.get("result_id").getAsString();
                    com.google.gson.JsonElement jsonElement = jsonObject.get("injected");
                    java.lang.Boolean valueOf = jsonElement != null ? java.lang.Boolean.valueOf(jsonElement.getAsBoolean()) : null;
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asString, "");
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asString2, "");
                    return new com.datadog.android.rum.model.ViewEvent.Synthetics(asString, asString2, valueOf);
                } catch (java.lang.IllegalStateException e) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type Synthetics", e);
                } catch (java.lang.NullPointerException e2) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type Synthetics", e2);
                } catch (java.lang.NumberFormatException e3) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type Synthetics", e3);
                }
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public final java.lang.String toString() {
            java.lang.String str = this.testId;
            java.lang.String str2 = this.resultId;
            java.lang.Boolean bool = this.injected;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Synthetics(testId=");
            sb.append(str);
            sb.append(", resultId=");
            sb.append(str2);
            sb.append(", injected=");
            sb.append(bool);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.testId.hashCode();
            int hashCode2 = this.resultId.hashCode();
            java.lang.Boolean bool = this.injected;
            return (((hashCode * 31) + hashCode2) * 31) + (bool == null ? 0 : bool.hashCode());
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.datadog.android.rum.model.ViewEvent.Synthetics)) {
                return false;
            }
            com.datadog.android.rum.model.ViewEvent.Synthetics synthetics = (com.datadog.android.rum.model.ViewEvent.Synthetics) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.testId, synthetics.testId) && kotlin.jvm.internal.Intrinsics.areEqual(this.resultId, synthetics.resultId) && kotlin.jvm.internal.Intrinsics.areEqual(this.injected, synthetics.injected);
        }

        public final com.datadog.android.rum.model.ViewEvent.Synthetics copy(java.lang.String testId, java.lang.String resultId, java.lang.Boolean injected) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(testId, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(resultId, "");
            return new com.datadog.android.rum.model.ViewEvent.Synthetics(testId, resultId, injected);
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.Boolean getInjected() {
            return this.injected;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getResultId() {
            return this.resultId;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getTestId() {
            return this.testId;
        }

        @kotlin.jvm.JvmStatic
        public static final com.datadog.android.rum.model.ViewEvent.Synthetics fromJsonObject(com.google.gson.JsonObject jsonObject) throws com.google.gson.JsonParseException {
            return INSTANCE.fromJsonObject(jsonObject);
        }

        @kotlin.jvm.JvmStatic
        public static final com.datadog.android.rum.model.ViewEvent.Synthetics fromJson(java.lang.String str) throws com.google.gson.JsonParseException {
            return INSTANCE.fromJson(str);
        }

        public static /* synthetic */ com.datadog.android.rum.model.ViewEvent.Synthetics copy$default(com.datadog.android.rum.model.ViewEvent.Synthetics synthetics, java.lang.String str, java.lang.String str2, java.lang.Boolean bool, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = synthetics.testId;
            }
            if ((i & 2) != 0) {
                str2 = synthetics.resultId;
            }
            if ((i & 4) != 0) {
                bool = synthetics.injected;
            }
            return synthetics.copy(str, str2, bool);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/datadog/android/rum/model/ViewEvent$CiTest;", "", "", "testExecutionId", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/datadog/android/rum/model/ViewEvent$CiTest;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lcom/google/gson/JsonElement;", "toJson", "()Lcom/google/gson/JsonElement;", "toString", "Ljava/lang/String;", "getTestExecutionId", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class CiTest {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.datadog.android.rum.model.ViewEvent.CiTest.Companion INSTANCE = new com.datadog.android.rum.model.ViewEvent.CiTest.Companion(null);
        private final java.lang.String testExecutionId;

        public CiTest(java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.testExecutionId = str;
        }

        public final java.lang.String getTestExecutionId() {
            return this.testExecutionId;
        }

        public final com.google.gson.JsonElement toJson() {
            com.google.gson.JsonObject jsonObject = new com.google.gson.JsonObject();
            jsonObject.addProperty("test_execution_id", this.testExecutionId);
            return jsonObject;
        }

        @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/datadog/android/rum/model/ViewEvent$CiTest$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/rum/model/ViewEvent$CiTest;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/rum/model/ViewEvent$CiTest;", "Lcom/google/gson/JsonObject;", "jsonObject", "fromJsonObject", "(Lcom/google/gson/JsonObject;)Lcom/datadog/android/rum/model/ViewEvent$CiTest;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @kotlin.jvm.JvmStatic
            public final com.datadog.android.rum.model.ViewEvent.CiTest fromJson(java.lang.String jsonString) throws com.google.gson.JsonParseException {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonString, "");
                try {
                    com.google.gson.JsonObject asJsonObject = com.google.gson.JsonParser.parseString(jsonString).getAsJsonObject();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asJsonObject, "");
                    return fromJsonObject(asJsonObject);
                } catch (java.lang.IllegalStateException e) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type CiTest", e);
                }
            }

            @kotlin.jvm.JvmStatic
            public final com.datadog.android.rum.model.ViewEvent.CiTest fromJsonObject(com.google.gson.JsonObject jsonObject) throws com.google.gson.JsonParseException {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonObject, "");
                try {
                    java.lang.String asString = jsonObject.get("test_execution_id").getAsString();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asString, "");
                    return new com.datadog.android.rum.model.ViewEvent.CiTest(asString);
                } catch (java.lang.IllegalStateException e) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type CiTest", e);
                } catch (java.lang.NullPointerException e2) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type CiTest", e2);
                } catch (java.lang.NumberFormatException e3) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type CiTest", e3);
                }
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public final java.lang.String toString() {
            java.lang.String str = this.testExecutionId;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("CiTest(testExecutionId=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.testExecutionId.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.datadog.android.rum.model.ViewEvent.CiTest) && kotlin.jvm.internal.Intrinsics.areEqual(this.testExecutionId, ((com.datadog.android.rum.model.ViewEvent.CiTest) other).testExecutionId);
        }

        public final com.datadog.android.rum.model.ViewEvent.CiTest copy(java.lang.String testExecutionId) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(testExecutionId, "");
            return new com.datadog.android.rum.model.ViewEvent.CiTest(testExecutionId);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getTestExecutionId() {
            return this.testExecutionId;
        }

        @kotlin.jvm.JvmStatic
        public static final com.datadog.android.rum.model.ViewEvent.CiTest fromJsonObject(com.google.gson.JsonObject jsonObject) throws com.google.gson.JsonParseException {
            return INSTANCE.fromJsonObject(jsonObject);
        }

        @kotlin.jvm.JvmStatic
        public static final com.datadog.android.rum.model.ViewEvent.CiTest fromJson(java.lang.String str) throws com.google.gson.JsonParseException {
            return INSTANCE.fromJson(str);
        }

        public static /* synthetic */ com.datadog.android.rum.model.ViewEvent.CiTest copy$default(com.datadog.android.rum.model.ViewEvent.CiTest ciTest, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = ciTest.testExecutionId;
            }
            return ciTest.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\b\u0018\u0000  2\u00020\u0001:\u0001 B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\nJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\nJ:\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\nR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\nR\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001d\u0010\nR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001b\u001a\u0004\b\u001e\u0010\nR\u001a\u0010\u0006\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001f\u0010\n"}, d2 = {"Lcom/datadog/android/rum/model/ViewEvent$Os;", "", "", "name", "version", "build", "versionMajor", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/datadog/android/rum/model/ViewEvent$Os;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lcom/google/gson/JsonElement;", "toJson", "()Lcom/google/gson/JsonElement;", "toString", "Ljava/lang/String;", "getBuild", "getName", "getVersion", "getVersionMajor", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class Os {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.datadog.android.rum.model.ViewEvent.Os.Companion INSTANCE = new com.datadog.android.rum.model.ViewEvent.Os.Companion(null);
        private final java.lang.String build;
        private final java.lang.String name;
        private final java.lang.String version;
        private final java.lang.String versionMajor;

        public Os(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str4, "");
            this.name = str;
            this.version = str2;
            this.build = str3;
            this.versionMajor = str4;
        }

        public /* synthetic */ Os(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, (i & 4) != 0 ? null : str3, str4);
        }

        public final java.lang.String getName() {
            return this.name;
        }

        public final java.lang.String getVersion() {
            return this.version;
        }

        public final java.lang.String getBuild() {
            return this.build;
        }

        public final java.lang.String getVersionMajor() {
            return this.versionMajor;
        }

        public final com.google.gson.JsonElement toJson() {
            com.google.gson.JsonObject jsonObject = new com.google.gson.JsonObject();
            jsonObject.addProperty("name", this.name);
            jsonObject.addProperty("version", this.version);
            java.lang.String str = this.build;
            if (str != null) {
                jsonObject.addProperty("build", str);
            }
            jsonObject.addProperty("version_major", this.versionMajor);
            return jsonObject;
        }

        @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/datadog/android/rum/model/ViewEvent$Os$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/rum/model/ViewEvent$Os;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/rum/model/ViewEvent$Os;", "Lcom/google/gson/JsonObject;", "jsonObject", "fromJsonObject", "(Lcom/google/gson/JsonObject;)Lcom/datadog/android/rum/model/ViewEvent$Os;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @kotlin.jvm.JvmStatic
            public final com.datadog.android.rum.model.ViewEvent.Os fromJson(java.lang.String jsonString) throws com.google.gson.JsonParseException {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonString, "");
                try {
                    com.google.gson.JsonObject asJsonObject = com.google.gson.JsonParser.parseString(jsonString).getAsJsonObject();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asJsonObject, "");
                    return fromJsonObject(asJsonObject);
                } catch (java.lang.IllegalStateException e) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type Os", e);
                }
            }

            @kotlin.jvm.JvmStatic
            public final com.datadog.android.rum.model.ViewEvent.Os fromJsonObject(com.google.gson.JsonObject jsonObject) throws com.google.gson.JsonParseException {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonObject, "");
                try {
                    java.lang.String asString = jsonObject.get("name").getAsString();
                    java.lang.String asString2 = jsonObject.get("version").getAsString();
                    com.google.gson.JsonElement jsonElement = jsonObject.get("build");
                    java.lang.String asString3 = jsonElement != null ? jsonElement.getAsString() : null;
                    java.lang.String asString4 = jsonObject.get("version_major").getAsString();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asString, "");
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asString2, "");
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asString4, "");
                    return new com.datadog.android.rum.model.ViewEvent.Os(asString, asString2, asString3, asString4);
                } catch (java.lang.IllegalStateException e) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type Os", e);
                } catch (java.lang.NullPointerException e2) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type Os", e2);
                } catch (java.lang.NumberFormatException e3) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type Os", e3);
                }
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public final java.lang.String toString() {
            java.lang.String str = this.name;
            java.lang.String str2 = this.version;
            java.lang.String str3 = this.build;
            java.lang.String str4 = this.versionMajor;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Os(name=");
            sb.append(str);
            sb.append(", version=");
            sb.append(str2);
            sb.append(", build=");
            sb.append(str3);
            sb.append(", versionMajor=");
            sb.append(str4);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.name.hashCode();
            int hashCode2 = this.version.hashCode();
            java.lang.String str = this.build;
            return (((((hashCode * 31) + hashCode2) * 31) + (str == null ? 0 : str.hashCode())) * 31) + this.versionMajor.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.datadog.android.rum.model.ViewEvent.Os)) {
                return false;
            }
            com.datadog.android.rum.model.ViewEvent.Os os = (com.datadog.android.rum.model.ViewEvent.Os) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.name, os.name) && kotlin.jvm.internal.Intrinsics.areEqual(this.version, os.version) && kotlin.jvm.internal.Intrinsics.areEqual(this.build, os.build) && kotlin.jvm.internal.Intrinsics.areEqual(this.versionMajor, os.versionMajor);
        }

        public final com.datadog.android.rum.model.ViewEvent.Os copy(java.lang.String name2, java.lang.String version, java.lang.String build, java.lang.String versionMajor) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(version, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(versionMajor, "");
            return new com.datadog.android.rum.model.ViewEvent.Os(name2, version, build, versionMajor);
        }

        /* renamed from: component4, reason: from getter */
        public final java.lang.String getVersionMajor() {
            return this.versionMajor;
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String getBuild() {
            return this.build;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getVersion() {
            return this.version;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getName() {
            return this.name;
        }

        @kotlin.jvm.JvmStatic
        public static final com.datadog.android.rum.model.ViewEvent.Os fromJsonObject(com.google.gson.JsonObject jsonObject) throws com.google.gson.JsonParseException {
            return INSTANCE.fromJsonObject(jsonObject);
        }

        @kotlin.jvm.JvmStatic
        public static final com.datadog.android.rum.model.ViewEvent.Os fromJson(java.lang.String str) throws com.google.gson.JsonParseException {
            return INSTANCE.fromJson(str);
        }

        public static /* synthetic */ com.datadog.android.rum.model.ViewEvent.Os copy$default(com.datadog.android.rum.model.ViewEvent.Os os, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = os.name;
            }
            if ((i & 2) != 0) {
                str2 = os.version;
            }
            if ((i & 4) != 0) {
                str3 = os.build;
            }
            if ((i & 8) != 0) {
                str4 = os.versionMajor;
            }
            return os.copy(str, str2, str3, str4);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u0004\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\b\u0086\b\u0018\u0000 H2\u00020\u0001:\u0001HBµ\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001cJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001cJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001aJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\"\u0010!J\u0012\u0010#\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b#\u0010!J\u0012\u0010$\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b$\u0010!J\u0012\u0010%\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b%\u0010!J\u0018\u0010&\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b&\u0010'J\u0012\u0010(\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b(\u0010!J\u0012\u0010)\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b)\u0010\u001cJ¾\u0001\u0010*\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00042\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u000fHÆ\u0001¢\u0006\u0004\b*\u0010+J\u001a\u0010-\u001a\u00020\u000f2\b\u0010,\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b-\u0010.J\u0010\u00100\u001a\u00020/HÖ\u0001¢\u0006\u0004\b0\u00101J\r\u00103\u001a\u000202¢\u0006\u0004\b3\u00104J\u0010\u00105\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b5\u0010!R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00048\u0007¢\u0006\f\n\u0004\b\b\u00106\u001a\u0004\b7\u0010!R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u00108\u001a\u0004\b9\u0010\u001cR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u00106\u001a\u0004\b:\u0010!R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\r8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u00108\u001a\u0004\b;\u0010\u001cR\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u000f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010<\u001a\u0004\b\u0014\u0010\u001aR\u001c\u0010\t\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u00106\u001a\u0004\b=\u0010!R\"\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010>\u001a\u0004\b?\u0010'R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\r8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u00108\u001a\u0004\b@\u0010\u001cR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u00106\u001a\u0004\bA\u0010!R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u00106\u001a\u0004\bB\u0010!R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010<\u001a\u0004\bC\u0010\u001aR\u001c\u0010\f\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u00106\u001a\u0004\bD\u0010!R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\r8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u00108\u001a\u0004\bE\u0010\u001cR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010F\u001a\u0004\bG\u0010\u0018"}, d2 = {"Lcom/datadog/android/rum/model/ViewEvent$Device;", "", "Lcom/datadog/android/rum/model/ViewEvent$DeviceType;", "type", "", "name", "model", "brand", "architecture", "locale", "", "locales", "timeZone", "", "batteryLevel", "", "powerSavingMode", "brightnessLevel", "logicalCpuCount", "totalRam", "isLowRam", "<init>", "(Lcom/datadog/android/rum/model/ViewEvent$DeviceType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/Number;Ljava/lang/Boolean;Ljava/lang/Number;Ljava/lang/Number;Ljava/lang/Number;Ljava/lang/Boolean;)V", "component1", "()Lcom/datadog/android/rum/model/ViewEvent$DeviceType;", "component10", "()Ljava/lang/Boolean;", "component11", "()Ljava/lang/Number;", "component12", "component13", "component14", "component2", "()Ljava/lang/String;", "component3", "component4", "component5", "component6", "component7", "()Ljava/util/List;", "component8", "component9", "copy", "(Lcom/datadog/android/rum/model/ViewEvent$DeviceType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/Number;Ljava/lang/Boolean;Ljava/lang/Number;Ljava/lang/Number;Ljava/lang/Number;Ljava/lang/Boolean;)Lcom/datadog/android/rum/model/ViewEvent$Device;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lcom/google/gson/JsonElement;", "toJson", "()Lcom/google/gson/JsonElement;", "toString", "Ljava/lang/String;", "getArchitecture", "Ljava/lang/Number;", "getBatteryLevel", "getBrand", "getBrightnessLevel", "Ljava/lang/Boolean;", "getLocale", "Ljava/util/List;", "getLocales", "getLogicalCpuCount", "getModel", "getName", "getPowerSavingMode", "getTimeZone", "getTotalRam", "Lcom/datadog/android/rum/model/ViewEvent$DeviceType;", "getType", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class Device {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.datadog.android.rum.model.ViewEvent.Device.Companion INSTANCE = new com.datadog.android.rum.model.ViewEvent.Device.Companion(null);
        private final java.lang.String architecture;
        private final java.lang.Number batteryLevel;
        private final java.lang.String brand;
        private final java.lang.Number brightnessLevel;
        private final java.lang.Boolean isLowRam;
        private final java.lang.String locale;
        private final java.util.List<java.lang.String> locales;
        private final java.lang.Number logicalCpuCount;
        private final java.lang.String model;
        private final java.lang.String name;
        private final java.lang.Boolean powerSavingMode;
        private final java.lang.String timeZone;
        private final java.lang.Number totalRam;
        private final com.datadog.android.rum.model.ViewEvent.DeviceType type;

        public Device(com.datadog.android.rum.model.ViewEvent.DeviceType deviceType, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.util.List<java.lang.String> list, java.lang.String str6, java.lang.Number number, java.lang.Boolean bool, java.lang.Number number2, java.lang.Number number3, java.lang.Number number4, java.lang.Boolean bool2) {
            this.type = deviceType;
            this.name = str;
            this.model = str2;
            this.brand = str3;
            this.architecture = str4;
            this.locale = str5;
            this.locales = list;
            this.timeZone = str6;
            this.batteryLevel = number;
            this.powerSavingMode = bool;
            this.brightnessLevel = number2;
            this.logicalCpuCount = number3;
            this.totalRam = number4;
            this.isLowRam = bool2;
        }

        public /* synthetic */ Device(com.datadog.android.rum.model.ViewEvent.DeviceType deviceType, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.util.List list, java.lang.String str6, java.lang.Number number, java.lang.Boolean bool, java.lang.Number number2, java.lang.Number number3, java.lang.Number number4, java.lang.Boolean bool2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : deviceType, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : str5, (i & 64) != 0 ? null : list, (i & 128) != 0 ? null : str6, (i & 256) != 0 ? null : number, (i & 512) != 0 ? null : bool, (i & 1024) != 0 ? null : number2, (i & 2048) != 0 ? null : number3, (i & 4096) != 0 ? null : number4, (i & 8192) == 0 ? bool2 : null);
        }

        public final com.datadog.android.rum.model.ViewEvent.DeviceType getType() {
            return this.type;
        }

        public final java.lang.String getName() {
            return this.name;
        }

        public final java.lang.String getModel() {
            return this.model;
        }

        public final java.lang.String getBrand() {
            return this.brand;
        }

        public final java.lang.String getArchitecture() {
            return this.architecture;
        }

        public final java.lang.String getLocale() {
            return this.locale;
        }

        public final java.util.List<java.lang.String> getLocales() {
            return this.locales;
        }

        public final java.lang.String getTimeZone() {
            return this.timeZone;
        }

        public final java.lang.Number getBatteryLevel() {
            return this.batteryLevel;
        }

        public final java.lang.Boolean getPowerSavingMode() {
            return this.powerSavingMode;
        }

        public final java.lang.Number getBrightnessLevel() {
            return this.brightnessLevel;
        }

        public final java.lang.Number getLogicalCpuCount() {
            return this.logicalCpuCount;
        }

        public final java.lang.Number getTotalRam() {
            return this.totalRam;
        }

        public final java.lang.Boolean isLowRam() {
            return this.isLowRam;
        }

        public final com.google.gson.JsonElement toJson() {
            com.google.gson.JsonObject jsonObject = new com.google.gson.JsonObject();
            com.datadog.android.rum.model.ViewEvent.DeviceType deviceType = this.type;
            if (deviceType != null) {
                jsonObject.add("type", deviceType.toJson());
            }
            java.lang.String str = this.name;
            if (str != null) {
                jsonObject.addProperty("name", str);
            }
            java.lang.String str2 = this.model;
            if (str2 != null) {
                jsonObject.addProperty("model", str2);
            }
            java.lang.String str3 = this.brand;
            if (str3 != null) {
                jsonObject.addProperty("brand", str3);
            }
            java.lang.String str4 = this.architecture;
            if (str4 != null) {
                jsonObject.addProperty("architecture", str4);
            }
            java.lang.String str5 = this.locale;
            if (str5 != null) {
                jsonObject.addProperty("locale", str5);
            }
            java.util.List<java.lang.String> list = this.locales;
            if (list != null) {
                com.google.gson.JsonArray jsonArray = new com.google.gson.JsonArray(list.size());
                java.util.Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    jsonArray.add((java.lang.String) it.next());
                }
                jsonObject.add("locales", jsonArray);
            }
            java.lang.String str6 = this.timeZone;
            if (str6 != null) {
                jsonObject.addProperty("time_zone", str6);
            }
            java.lang.Number number = this.batteryLevel;
            if (number != null) {
                jsonObject.addProperty("battery_level", number);
            }
            java.lang.Boolean bool = this.powerSavingMode;
            if (bool != null) {
                jsonObject.addProperty("power_saving_mode", java.lang.Boolean.valueOf(bool.booleanValue()));
            }
            java.lang.Number number2 = this.brightnessLevel;
            if (number2 != null) {
                jsonObject.addProperty("brightness_level", number2);
            }
            java.lang.Number number3 = this.logicalCpuCount;
            if (number3 != null) {
                jsonObject.addProperty("logical_cpu_count", number3);
            }
            java.lang.Number number4 = this.totalRam;
            if (number4 != null) {
                jsonObject.addProperty("total_ram", number4);
            }
            java.lang.Boolean bool2 = this.isLowRam;
            if (bool2 != null) {
                jsonObject.addProperty("is_low_ram", java.lang.Boolean.valueOf(bool2.booleanValue()));
            }
            return jsonObject;
        }

        @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/datadog/android/rum/model/ViewEvent$Device$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/rum/model/ViewEvent$Device;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/rum/model/ViewEvent$Device;", "Lcom/google/gson/JsonObject;", "jsonObject", "fromJsonObject", "(Lcom/google/gson/JsonObject;)Lcom/datadog/android/rum/model/ViewEvent$Device;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @kotlin.jvm.JvmStatic
            public final com.datadog.android.rum.model.ViewEvent.Device fromJson(java.lang.String jsonString) throws com.google.gson.JsonParseException {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonString, "");
                try {
                    com.google.gson.JsonObject asJsonObject = com.google.gson.JsonParser.parseString(jsonString).getAsJsonObject();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asJsonObject, "");
                    return fromJsonObject(asJsonObject);
                } catch (java.lang.IllegalStateException e) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type Device", e);
                }
            }

            @kotlin.jvm.JvmStatic
            public final com.datadog.android.rum.model.ViewEvent.Device fromJsonObject(com.google.gson.JsonObject jsonObject) throws com.google.gson.JsonParseException {
                java.util.ArrayList arrayList;
                com.google.gson.JsonArray asJsonArray;
                java.lang.String asString;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonObject, "");
                try {
                    com.google.gson.JsonElement jsonElement = jsonObject.get("type");
                    com.datadog.android.rum.model.ViewEvent.DeviceType fromJson = (jsonElement == null || (asString = jsonElement.getAsString()) == null) ? null : com.datadog.android.rum.model.ViewEvent.DeviceType.INSTANCE.fromJson(asString);
                    com.google.gson.JsonElement jsonElement2 = jsonObject.get("name");
                    java.lang.String asString2 = jsonElement2 != null ? jsonElement2.getAsString() : null;
                    com.google.gson.JsonElement jsonElement3 = jsonObject.get("model");
                    java.lang.String asString3 = jsonElement3 != null ? jsonElement3.getAsString() : null;
                    com.google.gson.JsonElement jsonElement4 = jsonObject.get("brand");
                    java.lang.String asString4 = jsonElement4 != null ? jsonElement4.getAsString() : null;
                    com.google.gson.JsonElement jsonElement5 = jsonObject.get("architecture");
                    java.lang.String asString5 = jsonElement5 != null ? jsonElement5.getAsString() : null;
                    com.google.gson.JsonElement jsonElement6 = jsonObject.get("locale");
                    java.lang.String asString6 = jsonElement6 != null ? jsonElement6.getAsString() : null;
                    com.google.gson.JsonElement jsonElement7 = jsonObject.get("locales");
                    if (jsonElement7 == null || (asJsonArray = jsonElement7.getAsJsonArray()) == null) {
                        arrayList = null;
                    } else {
                        arrayList = new java.util.ArrayList(asJsonArray.size());
                        java.util.Iterator<com.google.gson.JsonElement> it = asJsonArray.iterator();
                        while (it.hasNext()) {
                            arrayList.add(it.next().getAsString());
                        }
                    }
                    com.google.gson.JsonElement jsonElement8 = jsonObject.get("time_zone");
                    java.lang.String asString7 = jsonElement8 != null ? jsonElement8.getAsString() : null;
                    com.google.gson.JsonElement jsonElement9 = jsonObject.get("battery_level");
                    java.lang.Number asNumber = jsonElement9 != null ? jsonElement9.getAsNumber() : null;
                    com.google.gson.JsonElement jsonElement10 = jsonObject.get("power_saving_mode");
                    java.lang.Boolean valueOf = jsonElement10 != null ? java.lang.Boolean.valueOf(jsonElement10.getAsBoolean()) : null;
                    com.google.gson.JsonElement jsonElement11 = jsonObject.get("brightness_level");
                    java.lang.Number asNumber2 = jsonElement11 != null ? jsonElement11.getAsNumber() : null;
                    com.google.gson.JsonElement jsonElement12 = jsonObject.get("logical_cpu_count");
                    java.lang.Number asNumber3 = jsonElement12 != null ? jsonElement12.getAsNumber() : null;
                    com.google.gson.JsonElement jsonElement13 = jsonObject.get("total_ram");
                    java.lang.Number asNumber4 = jsonElement13 != null ? jsonElement13.getAsNumber() : null;
                    com.google.gson.JsonElement jsonElement14 = jsonObject.get("is_low_ram");
                    return new com.datadog.android.rum.model.ViewEvent.Device(fromJson, asString2, asString3, asString4, asString5, asString6, arrayList, asString7, asNumber, valueOf, asNumber2, asNumber3, asNumber4, jsonElement14 != null ? java.lang.Boolean.valueOf(jsonElement14.getAsBoolean()) : null);
                } catch (java.lang.IllegalStateException e) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type Device", e);
                } catch (java.lang.NullPointerException e2) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type Device", e2);
                } catch (java.lang.NumberFormatException e3) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type Device", e3);
                }
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public final java.lang.String toString() {
            com.datadog.android.rum.model.ViewEvent.DeviceType deviceType = this.type;
            java.lang.String str = this.name;
            java.lang.String str2 = this.model;
            java.lang.String str3 = this.brand;
            java.lang.String str4 = this.architecture;
            java.lang.String str5 = this.locale;
            java.util.List<java.lang.String> list = this.locales;
            java.lang.String str6 = this.timeZone;
            java.lang.Number number = this.batteryLevel;
            java.lang.Boolean bool = this.powerSavingMode;
            java.lang.Number number2 = this.brightnessLevel;
            java.lang.Number number3 = this.logicalCpuCount;
            java.lang.Number number4 = this.totalRam;
            java.lang.Boolean bool2 = this.isLowRam;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Device(type=");
            sb.append(deviceType);
            sb.append(", name=");
            sb.append(str);
            sb.append(", model=");
            sb.append(str2);
            sb.append(", brand=");
            sb.append(str3);
            sb.append(", architecture=");
            sb.append(str4);
            sb.append(", locale=");
            sb.append(str5);
            sb.append(", locales=");
            sb.append(list);
            sb.append(", timeZone=");
            sb.append(str6);
            sb.append(", batteryLevel=");
            sb.append(number);
            sb.append(", powerSavingMode=");
            sb.append(bool);
            sb.append(", brightnessLevel=");
            sb.append(number2);
            sb.append(", logicalCpuCount=");
            sb.append(number3);
            sb.append(", totalRam=");
            sb.append(number4);
            sb.append(", isLowRam=");
            sb.append(bool2);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            com.datadog.android.rum.model.ViewEvent.DeviceType deviceType = this.type;
            int hashCode = deviceType == null ? 0 : deviceType.hashCode();
            java.lang.String str = this.name;
            int hashCode2 = str == null ? 0 : str.hashCode();
            java.lang.String str2 = this.model;
            int hashCode3 = str2 == null ? 0 : str2.hashCode();
            java.lang.String str3 = this.brand;
            int hashCode4 = str3 == null ? 0 : str3.hashCode();
            java.lang.String str4 = this.architecture;
            int hashCode5 = str4 == null ? 0 : str4.hashCode();
            java.lang.String str5 = this.locale;
            int hashCode6 = str5 == null ? 0 : str5.hashCode();
            java.util.List<java.lang.String> list = this.locales;
            int hashCode7 = list == null ? 0 : list.hashCode();
            java.lang.String str6 = this.timeZone;
            int hashCode8 = str6 == null ? 0 : str6.hashCode();
            java.lang.Number number = this.batteryLevel;
            int hashCode9 = number == null ? 0 : number.hashCode();
            java.lang.Boolean bool = this.powerSavingMode;
            int hashCode10 = bool == null ? 0 : bool.hashCode();
            java.lang.Number number2 = this.brightnessLevel;
            int hashCode11 = number2 == null ? 0 : number2.hashCode();
            java.lang.Number number3 = this.logicalCpuCount;
            int hashCode12 = number3 == null ? 0 : number3.hashCode();
            java.lang.Number number4 = this.totalRam;
            int hashCode13 = number4 == null ? 0 : number4.hashCode();
            java.lang.Boolean bool2 = this.isLowRam;
            return (((((((((((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + hashCode10) * 31) + hashCode11) * 31) + hashCode12) * 31) + hashCode13) * 31) + (bool2 != null ? bool2.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.datadog.android.rum.model.ViewEvent.Device)) {
                return false;
            }
            com.datadog.android.rum.model.ViewEvent.Device device = (com.datadog.android.rum.model.ViewEvent.Device) other;
            return this.type == device.type && kotlin.jvm.internal.Intrinsics.areEqual(this.name, device.name) && kotlin.jvm.internal.Intrinsics.areEqual(this.model, device.model) && kotlin.jvm.internal.Intrinsics.areEqual(this.brand, device.brand) && kotlin.jvm.internal.Intrinsics.areEqual(this.architecture, device.architecture) && kotlin.jvm.internal.Intrinsics.areEqual(this.locale, device.locale) && kotlin.jvm.internal.Intrinsics.areEqual(this.locales, device.locales) && kotlin.jvm.internal.Intrinsics.areEqual(this.timeZone, device.timeZone) && kotlin.jvm.internal.Intrinsics.areEqual(this.batteryLevel, device.batteryLevel) && kotlin.jvm.internal.Intrinsics.areEqual(this.powerSavingMode, device.powerSavingMode) && kotlin.jvm.internal.Intrinsics.areEqual(this.brightnessLevel, device.brightnessLevel) && kotlin.jvm.internal.Intrinsics.areEqual(this.logicalCpuCount, device.logicalCpuCount) && kotlin.jvm.internal.Intrinsics.areEqual(this.totalRam, device.totalRam) && kotlin.jvm.internal.Intrinsics.areEqual(this.isLowRam, device.isLowRam);
        }

        public final com.datadog.android.rum.model.ViewEvent.Device copy(com.datadog.android.rum.model.ViewEvent.DeviceType type, java.lang.String name2, java.lang.String model, java.lang.String brand, java.lang.String architecture, java.lang.String locale, java.util.List<java.lang.String> locales, java.lang.String timeZone, java.lang.Number batteryLevel, java.lang.Boolean powerSavingMode, java.lang.Number brightnessLevel, java.lang.Number logicalCpuCount, java.lang.Number totalRam, java.lang.Boolean isLowRam) {
            return new com.datadog.android.rum.model.ViewEvent.Device(type, name2, model, brand, architecture, locale, locales, timeZone, batteryLevel, powerSavingMode, brightnessLevel, logicalCpuCount, totalRam, isLowRam);
        }

        /* renamed from: component9, reason: from getter */
        public final java.lang.Number getBatteryLevel() {
            return this.batteryLevel;
        }

        /* renamed from: component8, reason: from getter */
        public final java.lang.String getTimeZone() {
            return this.timeZone;
        }

        public final java.util.List<java.lang.String> component7() {
            return this.locales;
        }

        /* renamed from: component6, reason: from getter */
        public final java.lang.String getLocale() {
            return this.locale;
        }

        /* renamed from: component5, reason: from getter */
        public final java.lang.String getArchitecture() {
            return this.architecture;
        }

        /* renamed from: component4, reason: from getter */
        public final java.lang.String getBrand() {
            return this.brand;
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String getModel() {
            return this.model;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getName() {
            return this.name;
        }

        /* renamed from: component14, reason: from getter */
        public final java.lang.Boolean getIsLowRam() {
            return this.isLowRam;
        }

        /* renamed from: component13, reason: from getter */
        public final java.lang.Number getTotalRam() {
            return this.totalRam;
        }

        /* renamed from: component12, reason: from getter */
        public final java.lang.Number getLogicalCpuCount() {
            return this.logicalCpuCount;
        }

        /* renamed from: component11, reason: from getter */
        public final java.lang.Number getBrightnessLevel() {
            return this.brightnessLevel;
        }

        /* renamed from: component10, reason: from getter */
        public final java.lang.Boolean getPowerSavingMode() {
            return this.powerSavingMode;
        }

        /* renamed from: component1, reason: from getter */
        public final com.datadog.android.rum.model.ViewEvent.DeviceType getType() {
            return this.type;
        }

        @kotlin.jvm.JvmStatic
        public static final com.datadog.android.rum.model.ViewEvent.Device fromJsonObject(com.google.gson.JsonObject jsonObject) throws com.google.gson.JsonParseException {
            return INSTANCE.fromJsonObject(jsonObject);
        }

        @kotlin.jvm.JvmStatic
        public static final com.datadog.android.rum.model.ViewEvent.Device fromJson(java.lang.String str) throws com.google.gson.JsonParseException {
            return INSTANCE.fromJson(str);
        }

        public Device() {
            this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, my.com.softspace.reader.TransactionCodes.SupportedScheme.ALL, null);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0017\b\u0086\b\u0018\u0000 G2\u00020\u0001:\u0001GBu\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0018\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0012\u0010#\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0004\b#\u0010$J\u0012\u0010%\u001a\u0004\u0018\u00010\u0012HÆ\u0003¢\u0006\u0004\b%\u0010&J\u0080\u0001\u0010'\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\n\u001a\u00020\t2\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÆ\u0001¢\u0006\u0004\b'\u0010(J\u001a\u0010+\u001a\u00020*2\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b+\u0010,J\u0010\u0010.\u001a\u00020-HÖ\u0001¢\u0006\u0004\b.\u0010/J\r\u00101\u001a\u000200¢\u0006\u0004\b1\u00102J\u0010\u00103\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b3\u0010\u001bR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0007¢\u0006\f\n\u0004\b\u0007\u00104\u001a\u0004\b5\u0010\u001bR\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u00106\u001a\u0004\b7\u0010$R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u00108\u001a\u0004\b9\u0010\u0019R\u001a\u0010\n\u001a\u00020\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010:\u001a\u0004\b;\u0010\u001eR\u001a\u0010<\u001a\u00020\t8\u0007X\u0087D¢\u0006\f\n\u0004\b<\u0010:\u001a\u0004\b=\u0010\u001eR\"\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010>\u001a\u0004\b?\u0010 R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010@\u001a\u0004\bA\u0010&R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010B\u001a\u0004\bC\u0010\"R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u00104\u001a\u0004\bD\u0010\u001bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010E\u001a\u0004\bF\u0010\u0017"}, d2 = {"Lcom/datadog/android/rum/model/ViewEvent$Dd;", "", "Lcom/datadog/android/rum/model/ViewEvent$DdSession;", "session", "Lcom/datadog/android/rum/model/ViewEvent$Configuration;", com.miteksystems.misnap.core.serverconnection.MobileVerifyV2Request.CONFIG_KEY, "", "browserSdkVersion", "sdkName", "", com.datadog.android.rum.internal.domain.event.RumEventMeta.DOCUMENT_VERSION_KEY, "", "Lcom/datadog/android/rum/model/ViewEvent$PageState;", "pageStates", "Lcom/datadog/android/rum/model/ViewEvent$ReplayStats;", "replayStats", "Lcom/datadog/android/rum/model/ViewEvent$DdCls;", "cls", "Lcom/datadog/android/rum/model/ViewEvent$Profiling;", "profiling", "<init>", "(Lcom/datadog/android/rum/model/ViewEvent$DdSession;Lcom/datadog/android/rum/model/ViewEvent$Configuration;Ljava/lang/String;Ljava/lang/String;JLjava/util/List;Lcom/datadog/android/rum/model/ViewEvent$ReplayStats;Lcom/datadog/android/rum/model/ViewEvent$DdCls;Lcom/datadog/android/rum/model/ViewEvent$Profiling;)V", "component1", "()Lcom/datadog/android/rum/model/ViewEvent$DdSession;", "component2", "()Lcom/datadog/android/rum/model/ViewEvent$Configuration;", "component3", "()Ljava/lang/String;", "component4", "component5", "()J", "component6", "()Ljava/util/List;", "component7", "()Lcom/datadog/android/rum/model/ViewEvent$ReplayStats;", "component8", "()Lcom/datadog/android/rum/model/ViewEvent$DdCls;", "component9", "()Lcom/datadog/android/rum/model/ViewEvent$Profiling;", "copy", "(Lcom/datadog/android/rum/model/ViewEvent$DdSession;Lcom/datadog/android/rum/model/ViewEvent$Configuration;Ljava/lang/String;Ljava/lang/String;JLjava/util/List;Lcom/datadog/android/rum/model/ViewEvent$ReplayStats;Lcom/datadog/android/rum/model/ViewEvent$DdCls;Lcom/datadog/android/rum/model/ViewEvent$Profiling;)Lcom/datadog/android/rum/model/ViewEvent$Dd;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lcom/google/gson/JsonElement;", "toJson", "()Lcom/google/gson/JsonElement;", "toString", "Ljava/lang/String;", "getBrowserSdkVersion", "Lcom/datadog/android/rum/model/ViewEvent$DdCls;", "getCls", "Lcom/datadog/android/rum/model/ViewEvent$Configuration;", "getConfiguration", "J", "getDocumentVersion", "formatVersion", "getFormatVersion", "Ljava/util/List;", "getPageStates", "Lcom/datadog/android/rum/model/ViewEvent$Profiling;", "getProfiling", "Lcom/datadog/android/rum/model/ViewEvent$ReplayStats;", "getReplayStats", "getSdkName", "Lcom/datadog/android/rum/model/ViewEvent$DdSession;", "getSession", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class Dd {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.datadog.android.rum.model.ViewEvent.Dd.Companion INSTANCE = new com.datadog.android.rum.model.ViewEvent.Dd.Companion(null);
        private final java.lang.String browserSdkVersion;
        private final com.datadog.android.rum.model.ViewEvent.DdCls cls;
        private final com.datadog.android.rum.model.ViewEvent.Configuration configuration;
        private final long documentVersion;
        private final long formatVersion;
        private final java.util.List<com.datadog.android.rum.model.ViewEvent.PageState> pageStates;
        private final com.datadog.android.rum.model.ViewEvent.Profiling profiling;
        private final com.datadog.android.rum.model.ViewEvent.ReplayStats replayStats;
        private final java.lang.String sdkName;
        private final com.datadog.android.rum.model.ViewEvent.DdSession session;

        public Dd(com.datadog.android.rum.model.ViewEvent.DdSession ddSession, com.datadog.android.rum.model.ViewEvent.Configuration configuration, java.lang.String str, java.lang.String str2, long j, java.util.List<com.datadog.android.rum.model.ViewEvent.PageState> list, com.datadog.android.rum.model.ViewEvent.ReplayStats replayStats, com.datadog.android.rum.model.ViewEvent.DdCls ddCls, com.datadog.android.rum.model.ViewEvent.Profiling profiling) {
            this.session = ddSession;
            this.configuration = configuration;
            this.browserSdkVersion = str;
            this.sdkName = str2;
            this.documentVersion = j;
            this.pageStates = list;
            this.replayStats = replayStats;
            this.cls = ddCls;
            this.profiling = profiling;
            this.formatVersion = 2L;
        }

        public /* synthetic */ Dd(com.datadog.android.rum.model.ViewEvent.DdSession ddSession, com.datadog.android.rum.model.ViewEvent.Configuration configuration, java.lang.String str, java.lang.String str2, long j, java.util.List list, com.datadog.android.rum.model.ViewEvent.ReplayStats replayStats, com.datadog.android.rum.model.ViewEvent.DdCls ddCls, com.datadog.android.rum.model.ViewEvent.Profiling profiling, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : ddSession, (i & 2) != 0 ? null : configuration, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : str2, j, (i & 32) != 0 ? null : list, (i & 64) != 0 ? null : replayStats, (i & 128) != 0 ? null : ddCls, (i & 256) != 0 ? null : profiling);
        }

        public final com.datadog.android.rum.model.ViewEvent.DdSession getSession() {
            return this.session;
        }

        public final com.datadog.android.rum.model.ViewEvent.Configuration getConfiguration() {
            return this.configuration;
        }

        public final java.lang.String getBrowserSdkVersion() {
            return this.browserSdkVersion;
        }

        public final java.lang.String getSdkName() {
            return this.sdkName;
        }

        public final long getDocumentVersion() {
            return this.documentVersion;
        }

        public final java.util.List<com.datadog.android.rum.model.ViewEvent.PageState> getPageStates() {
            return this.pageStates;
        }

        public final com.datadog.android.rum.model.ViewEvent.ReplayStats getReplayStats() {
            return this.replayStats;
        }

        public final com.datadog.android.rum.model.ViewEvent.DdCls getCls() {
            return this.cls;
        }

        public final com.datadog.android.rum.model.ViewEvent.Profiling getProfiling() {
            return this.profiling;
        }

        public final long getFormatVersion() {
            return this.formatVersion;
        }

        public final com.google.gson.JsonElement toJson() {
            com.google.gson.JsonObject jsonObject = new com.google.gson.JsonObject();
            jsonObject.addProperty("format_version", java.lang.Long.valueOf(this.formatVersion));
            com.datadog.android.rum.model.ViewEvent.DdSession ddSession = this.session;
            if (ddSession != null) {
                jsonObject.add("session", ddSession.toJson());
            }
            com.datadog.android.rum.model.ViewEvent.Configuration configuration = this.configuration;
            if (configuration != null) {
                jsonObject.add(com.miteksystems.misnap.core.serverconnection.MobileVerifyV2Request.CONFIG_KEY, configuration.toJson());
            }
            java.lang.String str = this.browserSdkVersion;
            if (str != null) {
                jsonObject.addProperty("browser_sdk_version", str);
            }
            java.lang.String str2 = this.sdkName;
            if (str2 != null) {
                jsonObject.addProperty(com.paypal.oslo.feature.verificationcapture.telemetry.VerificationCaptureTelemetry.Attributes.SDK_NAME, str2);
            }
            jsonObject.addProperty("document_version", java.lang.Long.valueOf(this.documentVersion));
            java.util.List<com.datadog.android.rum.model.ViewEvent.PageState> list = this.pageStates;
            if (list != null) {
                com.google.gson.JsonArray jsonArray = new com.google.gson.JsonArray(list.size());
                java.util.Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    jsonArray.add(((com.datadog.android.rum.model.ViewEvent.PageState) it.next()).toJson());
                }
                jsonObject.add("page_states", jsonArray);
            }
            com.datadog.android.rum.model.ViewEvent.ReplayStats replayStats = this.replayStats;
            if (replayStats != null) {
                jsonObject.add("replay_stats", replayStats.toJson());
            }
            com.datadog.android.rum.model.ViewEvent.DdCls ddCls = this.cls;
            if (ddCls != null) {
                jsonObject.add("cls", ddCls.toJson());
            }
            com.datadog.android.rum.model.ViewEvent.Profiling profiling = this.profiling;
            if (profiling != null) {
                jsonObject.add("profiling", profiling.toJson());
            }
            return jsonObject;
        }

        @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/datadog/android/rum/model/ViewEvent$Dd$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/rum/model/ViewEvent$Dd;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/rum/model/ViewEvent$Dd;", "Lcom/google/gson/JsonObject;", "jsonObject", "fromJsonObject", "(Lcom/google/gson/JsonObject;)Lcom/datadog/android/rum/model/ViewEvent$Dd;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @kotlin.jvm.JvmStatic
            public final com.datadog.android.rum.model.ViewEvent.Dd fromJson(java.lang.String jsonString) throws com.google.gson.JsonParseException {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonString, "");
                try {
                    com.google.gson.JsonObject asJsonObject = com.google.gson.JsonParser.parseString(jsonString).getAsJsonObject();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asJsonObject, "");
                    return fromJsonObject(asJsonObject);
                } catch (java.lang.IllegalStateException e) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type Dd", e);
                }
            }

            @kotlin.jvm.JvmStatic
            public final com.datadog.android.rum.model.ViewEvent.Dd fromJsonObject(com.google.gson.JsonObject jsonObject) throws com.google.gson.JsonParseException {
                java.util.ArrayList arrayList;
                com.google.gson.JsonObject asJsonObject;
                com.google.gson.JsonObject asJsonObject2;
                com.google.gson.JsonObject asJsonObject3;
                com.google.gson.JsonArray asJsonArray;
                com.google.gson.JsonObject asJsonObject4;
                com.google.gson.JsonObject asJsonObject5;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonObject, "");
                try {
                    long asLong = jsonObject.get("format_version").getAsLong();
                    com.google.gson.JsonElement jsonElement = jsonObject.get("session");
                    com.datadog.android.rum.model.ViewEvent.Profiling profiling = null;
                    com.datadog.android.rum.model.ViewEvent.DdSession fromJsonObject = (jsonElement == null || (asJsonObject5 = jsonElement.getAsJsonObject()) == null) ? null : com.datadog.android.rum.model.ViewEvent.DdSession.INSTANCE.fromJsonObject(asJsonObject5);
                    com.google.gson.JsonElement jsonElement2 = jsonObject.get(com.miteksystems.misnap.core.serverconnection.MobileVerifyV2Request.CONFIG_KEY);
                    com.datadog.android.rum.model.ViewEvent.Configuration fromJsonObject2 = (jsonElement2 == null || (asJsonObject4 = jsonElement2.getAsJsonObject()) == null) ? null : com.datadog.android.rum.model.ViewEvent.Configuration.INSTANCE.fromJsonObject(asJsonObject4);
                    com.google.gson.JsonElement jsonElement3 = jsonObject.get("browser_sdk_version");
                    java.lang.String asString = jsonElement3 != null ? jsonElement3.getAsString() : null;
                    com.google.gson.JsonElement jsonElement4 = jsonObject.get(com.paypal.oslo.feature.verificationcapture.telemetry.VerificationCaptureTelemetry.Attributes.SDK_NAME);
                    java.lang.String asString2 = jsonElement4 != null ? jsonElement4.getAsString() : null;
                    long asLong2 = jsonObject.get("document_version").getAsLong();
                    com.google.gson.JsonElement jsonElement5 = jsonObject.get("page_states");
                    if (jsonElement5 == null || (asJsonArray = jsonElement5.getAsJsonArray()) == null) {
                        arrayList = null;
                    } else {
                        arrayList = new java.util.ArrayList(asJsonArray.size());
                        for (com.google.gson.JsonElement jsonElement6 : asJsonArray) {
                            com.datadog.android.rum.model.ViewEvent.PageState.Companion companion = com.datadog.android.rum.model.ViewEvent.PageState.INSTANCE;
                            com.google.gson.JsonObject asJsonObject6 = jsonElement6.getAsJsonObject();
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asJsonObject6, "");
                            arrayList.add(companion.fromJsonObject(asJsonObject6));
                        }
                    }
                    com.google.gson.JsonElement jsonElement7 = jsonObject.get("replay_stats");
                    com.datadog.android.rum.model.ViewEvent.ReplayStats fromJsonObject3 = (jsonElement7 == null || (asJsonObject3 = jsonElement7.getAsJsonObject()) == null) ? null : com.datadog.android.rum.model.ViewEvent.ReplayStats.INSTANCE.fromJsonObject(asJsonObject3);
                    com.google.gson.JsonElement jsonElement8 = jsonObject.get("cls");
                    com.datadog.android.rum.model.ViewEvent.DdCls fromJsonObject4 = (jsonElement8 == null || (asJsonObject2 = jsonElement8.getAsJsonObject()) == null) ? null : com.datadog.android.rum.model.ViewEvent.DdCls.INSTANCE.fromJsonObject(asJsonObject2);
                    com.google.gson.JsonElement jsonElement9 = jsonObject.get("profiling");
                    if (jsonElement9 != null && (asJsonObject = jsonElement9.getAsJsonObject()) != null) {
                        profiling = com.datadog.android.rum.model.ViewEvent.Profiling.INSTANCE.fromJsonObject(asJsonObject);
                    }
                    com.datadog.android.rum.model.ViewEvent.Profiling profiling2 = profiling;
                    if (asLong != 2) {
                        throw new java.lang.IllegalStateException("Check failed.".toString());
                    }
                    return new com.datadog.android.rum.model.ViewEvent.Dd(fromJsonObject, fromJsonObject2, asString, asString2, asLong2, arrayList, fromJsonObject3, fromJsonObject4, profiling2);
                } catch (java.lang.IllegalStateException e) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type Dd", e);
                } catch (java.lang.NullPointerException e2) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type Dd", e2);
                } catch (java.lang.NumberFormatException e3) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type Dd", e3);
                }
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public final java.lang.String toString() {
            com.datadog.android.rum.model.ViewEvent.DdSession ddSession = this.session;
            com.datadog.android.rum.model.ViewEvent.Configuration configuration = this.configuration;
            java.lang.String str = this.browserSdkVersion;
            java.lang.String str2 = this.sdkName;
            long j = this.documentVersion;
            java.util.List<com.datadog.android.rum.model.ViewEvent.PageState> list = this.pageStates;
            com.datadog.android.rum.model.ViewEvent.ReplayStats replayStats = this.replayStats;
            com.datadog.android.rum.model.ViewEvent.DdCls ddCls = this.cls;
            com.datadog.android.rum.model.ViewEvent.Profiling profiling = this.profiling;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Dd(session=");
            sb.append(ddSession);
            sb.append(", configuration=");
            sb.append(configuration);
            sb.append(", browserSdkVersion=");
            sb.append(str);
            sb.append(", sdkName=");
            sb.append(str2);
            sb.append(", documentVersion=");
            sb.append(j);
            sb.append(", pageStates=");
            sb.append(list);
            sb.append(", replayStats=");
            sb.append(replayStats);
            sb.append(", cls=");
            sb.append(ddCls);
            sb.append(", profiling=");
            sb.append(profiling);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            com.datadog.android.rum.model.ViewEvent.DdSession ddSession = this.session;
            int hashCode = ddSession == null ? 0 : ddSession.hashCode();
            com.datadog.android.rum.model.ViewEvent.Configuration configuration = this.configuration;
            int hashCode2 = configuration == null ? 0 : configuration.hashCode();
            java.lang.String str = this.browserSdkVersion;
            int hashCode3 = str == null ? 0 : str.hashCode();
            java.lang.String str2 = this.sdkName;
            int hashCode4 = str2 == null ? 0 : str2.hashCode();
            int hashCode5 = java.lang.Long.hashCode(this.documentVersion);
            java.util.List<com.datadog.android.rum.model.ViewEvent.PageState> list = this.pageStates;
            int hashCode6 = list == null ? 0 : list.hashCode();
            com.datadog.android.rum.model.ViewEvent.ReplayStats replayStats = this.replayStats;
            int hashCode7 = replayStats == null ? 0 : replayStats.hashCode();
            com.datadog.android.rum.model.ViewEvent.DdCls ddCls = this.cls;
            int hashCode8 = ddCls == null ? 0 : ddCls.hashCode();
            com.datadog.android.rum.model.ViewEvent.Profiling profiling = this.profiling;
            return (((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + (profiling != null ? profiling.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.datadog.android.rum.model.ViewEvent.Dd)) {
                return false;
            }
            com.datadog.android.rum.model.ViewEvent.Dd dd = (com.datadog.android.rum.model.ViewEvent.Dd) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.session, dd.session) && kotlin.jvm.internal.Intrinsics.areEqual(this.configuration, dd.configuration) && kotlin.jvm.internal.Intrinsics.areEqual(this.browserSdkVersion, dd.browserSdkVersion) && kotlin.jvm.internal.Intrinsics.areEqual(this.sdkName, dd.sdkName) && this.documentVersion == dd.documentVersion && kotlin.jvm.internal.Intrinsics.areEqual(this.pageStates, dd.pageStates) && kotlin.jvm.internal.Intrinsics.areEqual(this.replayStats, dd.replayStats) && kotlin.jvm.internal.Intrinsics.areEqual(this.cls, dd.cls) && kotlin.jvm.internal.Intrinsics.areEqual(this.profiling, dd.profiling);
        }

        public final com.datadog.android.rum.model.ViewEvent.Dd copy(com.datadog.android.rum.model.ViewEvent.DdSession session, com.datadog.android.rum.model.ViewEvent.Configuration configuration, java.lang.String browserSdkVersion, java.lang.String sdkName, long documentVersion, java.util.List<com.datadog.android.rum.model.ViewEvent.PageState> pageStates, com.datadog.android.rum.model.ViewEvent.ReplayStats replayStats, com.datadog.android.rum.model.ViewEvent.DdCls cls, com.datadog.android.rum.model.ViewEvent.Profiling profiling) {
            return new com.datadog.android.rum.model.ViewEvent.Dd(session, configuration, browserSdkVersion, sdkName, documentVersion, pageStates, replayStats, cls, profiling);
        }

        /* renamed from: component9, reason: from getter */
        public final com.datadog.android.rum.model.ViewEvent.Profiling getProfiling() {
            return this.profiling;
        }

        /* renamed from: component8, reason: from getter */
        public final com.datadog.android.rum.model.ViewEvent.DdCls getCls() {
            return this.cls;
        }

        /* renamed from: component7, reason: from getter */
        public final com.datadog.android.rum.model.ViewEvent.ReplayStats getReplayStats() {
            return this.replayStats;
        }

        public final java.util.List<com.datadog.android.rum.model.ViewEvent.PageState> component6() {
            return this.pageStates;
        }

        /* renamed from: component5, reason: from getter */
        public final long getDocumentVersion() {
            return this.documentVersion;
        }

        /* renamed from: component4, reason: from getter */
        public final java.lang.String getSdkName() {
            return this.sdkName;
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String getBrowserSdkVersion() {
            return this.browserSdkVersion;
        }

        /* renamed from: component2, reason: from getter */
        public final com.datadog.android.rum.model.ViewEvent.Configuration getConfiguration() {
            return this.configuration;
        }

        /* renamed from: component1, reason: from getter */
        public final com.datadog.android.rum.model.ViewEvent.DdSession getSession() {
            return this.session;
        }

        @kotlin.jvm.JvmStatic
        public static final com.datadog.android.rum.model.ViewEvent.Dd fromJsonObject(com.google.gson.JsonObject jsonObject) throws com.google.gson.JsonParseException {
            return INSTANCE.fromJsonObject(jsonObject);
        }

        @kotlin.jvm.JvmStatic
        public static final com.datadog.android.rum.model.ViewEvent.Dd fromJson(java.lang.String str) throws com.google.gson.JsonParseException {
            return INSTANCE.fromJson(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\b\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u001f\u0012\u0016\b\u0002\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001e\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ(\u0010\t\u001a\u00020\u00002\u0016\b\u0002\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0002HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016R%\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0018\u0010\b"}, d2 = {"Lcom/datadog/android/rum/model/ViewEvent$Context;", "", "", "", "additionalProperties", "<init>", "(Ljava/util/Map;)V", "component1", "()Ljava/util/Map;", "copy", "(Ljava/util/Map;)Lcom/datadog/android/rum/model/ViewEvent$Context;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lcom/google/gson/JsonElement;", "toJson", "()Lcom/google/gson/JsonElement;", "toString", "()Ljava/lang/String;", "Ljava/util/Map;", "getAdditionalProperties", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class Context {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.datadog.android.rum.model.ViewEvent.Context.Companion INSTANCE = new com.datadog.android.rum.model.ViewEvent.Context.Companion(null);
        private final java.util.Map<java.lang.String, java.lang.Object> additionalProperties;

        public Context(java.util.Map<java.lang.String, java.lang.Object> map) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
            this.additionalProperties = map;
        }

        public /* synthetic */ Context(java.util.LinkedHashMap linkedHashMap, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? new java.util.LinkedHashMap() : linkedHashMap);
        }

        public final java.util.Map<java.lang.String, java.lang.Object> getAdditionalProperties() {
            return this.additionalProperties;
        }

        public final com.google.gson.JsonElement toJson() {
            com.google.gson.JsonObject jsonObject = new com.google.gson.JsonObject();
            for (java.util.Map.Entry<java.lang.String, java.lang.Object> entry : this.additionalProperties.entrySet()) {
                jsonObject.add(entry.getKey(), com.datadog.android.core.internal.utils.JsonSerializer.INSTANCE.toJsonElement(entry.getValue()));
            }
            return jsonObject;
        }

        @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/datadog/android/rum/model/ViewEvent$Context$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/rum/model/ViewEvent$Context;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/rum/model/ViewEvent$Context;", "Lcom/google/gson/JsonObject;", "jsonObject", "fromJsonObject", "(Lcom/google/gson/JsonObject;)Lcom/datadog/android/rum/model/ViewEvent$Context;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @kotlin.jvm.JvmStatic
            public final com.datadog.android.rum.model.ViewEvent.Context fromJson(java.lang.String jsonString) throws com.google.gson.JsonParseException {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonString, "");
                try {
                    com.google.gson.JsonObject asJsonObject = com.google.gson.JsonParser.parseString(jsonString).getAsJsonObject();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asJsonObject, "");
                    return fromJsonObject(asJsonObject);
                } catch (java.lang.IllegalStateException e) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type Context", e);
                }
            }

            @kotlin.jvm.JvmStatic
            public final com.datadog.android.rum.model.ViewEvent.Context fromJsonObject(com.google.gson.JsonObject jsonObject) throws com.google.gson.JsonParseException {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonObject, "");
                try {
                    java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
                    for (java.util.Map.Entry<java.lang.String, com.google.gson.JsonElement> entry : jsonObject.entrySet()) {
                        java.lang.String key = entry.getKey();
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(key, "");
                        linkedHashMap.put(key, entry.getValue());
                    }
                    return new com.datadog.android.rum.model.ViewEvent.Context(linkedHashMap);
                } catch (java.lang.IllegalStateException e) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type Context", e);
                } catch (java.lang.NullPointerException e2) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type Context", e2);
                } catch (java.lang.NumberFormatException e3) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type Context", e3);
                }
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public final java.lang.String toString() {
            java.util.Map<java.lang.String, java.lang.Object> map = this.additionalProperties;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Context(additionalProperties=");
            sb.append(map);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.additionalProperties.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.datadog.android.rum.model.ViewEvent.Context) && kotlin.jvm.internal.Intrinsics.areEqual(this.additionalProperties, ((com.datadog.android.rum.model.ViewEvent.Context) other).additionalProperties);
        }

        public final com.datadog.android.rum.model.ViewEvent.Context copy(java.util.Map<java.lang.String, java.lang.Object> additionalProperties) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(additionalProperties, "");
            return new com.datadog.android.rum.model.ViewEvent.Context(additionalProperties);
        }

        public final java.util.Map<java.lang.String, java.lang.Object> component1() {
            return this.additionalProperties;
        }

        @kotlin.jvm.JvmStatic
        public static final com.datadog.android.rum.model.ViewEvent.Context fromJsonObject(com.google.gson.JsonObject jsonObject) throws com.google.gson.JsonParseException {
            return INSTANCE.fromJsonObject(jsonObject);
        }

        @kotlin.jvm.JvmStatic
        public static final com.datadog.android.rum.model.ViewEvent.Context fromJson(java.lang.String str) throws com.google.gson.JsonParseException {
            return INSTANCE.fromJson(str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.datadog.android.rum.model.ViewEvent.Context copy$default(com.datadog.android.rum.model.ViewEvent.Context context, java.util.Map map, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                map = context.additionalProperties;
            }
            return context.copy(map);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Context() {
            this(null, 1, 0 == true ? 1 : 0);
        }
    }

    @kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\b\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\u000bR\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\t"}, d2 = {"Lcom/datadog/android/rum/model/ViewEvent$Container;", "", "Lcom/datadog/android/rum/model/ViewEvent$ContainerView;", "view", "Lcom/datadog/android/rum/model/ViewEvent$ViewEventSource;", "source", "<init>", "(Lcom/datadog/android/rum/model/ViewEvent$ContainerView;Lcom/datadog/android/rum/model/ViewEvent$ViewEventSource;)V", "component1", "()Lcom/datadog/android/rum/model/ViewEvent$ContainerView;", "component2", "()Lcom/datadog/android/rum/model/ViewEvent$ViewEventSource;", "copy", "(Lcom/datadog/android/rum/model/ViewEvent$ContainerView;Lcom/datadog/android/rum/model/ViewEvent$ViewEventSource;)Lcom/datadog/android/rum/model/ViewEvent$Container;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lcom/google/gson/JsonElement;", "toJson", "()Lcom/google/gson/JsonElement;", "", "toString", "()Ljava/lang/String;", "Lcom/datadog/android/rum/model/ViewEvent$ViewEventSource;", "getSource", "Lcom/datadog/android/rum/model/ViewEvent$ContainerView;", "getView", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class Container {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.datadog.android.rum.model.ViewEvent.Container.Companion INSTANCE = new com.datadog.android.rum.model.ViewEvent.Container.Companion(null);
        private final com.datadog.android.rum.model.ViewEvent.ViewEventSource source;
        private final com.datadog.android.rum.model.ViewEvent.ContainerView view;

        public Container(com.datadog.android.rum.model.ViewEvent.ContainerView containerView, com.datadog.android.rum.model.ViewEvent.ViewEventSource viewEventSource) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(containerView, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(viewEventSource, "");
            this.view = containerView;
            this.source = viewEventSource;
        }

        public final com.datadog.android.rum.model.ViewEvent.ContainerView getView() {
            return this.view;
        }

        public final com.datadog.android.rum.model.ViewEvent.ViewEventSource getSource() {
            return this.source;
        }

        public final com.google.gson.JsonElement toJson() {
            com.google.gson.JsonObject jsonObject = new com.google.gson.JsonObject();
            jsonObject.add("view", this.view.toJson());
            jsonObject.add("source", this.source.toJson());
            return jsonObject;
        }

        @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/datadog/android/rum/model/ViewEvent$Container$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/rum/model/ViewEvent$Container;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/rum/model/ViewEvent$Container;", "Lcom/google/gson/JsonObject;", "jsonObject", "fromJsonObject", "(Lcom/google/gson/JsonObject;)Lcom/datadog/android/rum/model/ViewEvent$Container;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @kotlin.jvm.JvmStatic
            public final com.datadog.android.rum.model.ViewEvent.Container fromJson(java.lang.String jsonString) throws com.google.gson.JsonParseException {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonString, "");
                try {
                    com.google.gson.JsonObject asJsonObject = com.google.gson.JsonParser.parseString(jsonString).getAsJsonObject();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asJsonObject, "");
                    return fromJsonObject(asJsonObject);
                } catch (java.lang.IllegalStateException e) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type Container", e);
                }
            }

            @kotlin.jvm.JvmStatic
            public final com.datadog.android.rum.model.ViewEvent.Container fromJsonObject(com.google.gson.JsonObject jsonObject) throws com.google.gson.JsonParseException {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonObject, "");
                try {
                    com.google.gson.JsonObject asJsonObject = jsonObject.get("view").getAsJsonObject();
                    com.datadog.android.rum.model.ViewEvent.ContainerView.Companion companion = com.datadog.android.rum.model.ViewEvent.ContainerView.INSTANCE;
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asJsonObject, "");
                    com.datadog.android.rum.model.ViewEvent.ContainerView fromJsonObject = companion.fromJsonObject(asJsonObject);
                    com.datadog.android.rum.model.ViewEvent.ViewEventSource.Companion companion2 = com.datadog.android.rum.model.ViewEvent.ViewEventSource.INSTANCE;
                    java.lang.String asString = jsonObject.get("source").getAsString();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asString, "");
                    return new com.datadog.android.rum.model.ViewEvent.Container(fromJsonObject, companion2.fromJson(asString));
                } catch (java.lang.IllegalStateException e) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type Container", e);
                } catch (java.lang.NullPointerException e2) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type Container", e2);
                } catch (java.lang.NumberFormatException e3) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type Container", e3);
                }
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public final java.lang.String toString() {
            com.datadog.android.rum.model.ViewEvent.ContainerView containerView = this.view;
            com.datadog.android.rum.model.ViewEvent.ViewEventSource viewEventSource = this.source;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Container(view=");
            sb.append(containerView);
            sb.append(", source=");
            sb.append(viewEventSource);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.view.hashCode() * 31) + this.source.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.datadog.android.rum.model.ViewEvent.Container)) {
                return false;
            }
            com.datadog.android.rum.model.ViewEvent.Container container = (com.datadog.android.rum.model.ViewEvent.Container) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.view, container.view) && this.source == container.source;
        }

        public final com.datadog.android.rum.model.ViewEvent.Container copy(com.datadog.android.rum.model.ViewEvent.ContainerView view, com.datadog.android.rum.model.ViewEvent.ViewEventSource source) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "");
            return new com.datadog.android.rum.model.ViewEvent.Container(view, source);
        }

        /* renamed from: component2, reason: from getter */
        public final com.datadog.android.rum.model.ViewEvent.ViewEventSource getSource() {
            return this.source;
        }

        /* renamed from: component1, reason: from getter */
        public final com.datadog.android.rum.model.ViewEvent.ContainerView getView() {
            return this.view;
        }

        @kotlin.jvm.JvmStatic
        public static final com.datadog.android.rum.model.ViewEvent.Container fromJsonObject(com.google.gson.JsonObject jsonObject) throws com.google.gson.JsonParseException {
            return INSTANCE.fromJsonObject(jsonObject);
        }

        @kotlin.jvm.JvmStatic
        public static final com.datadog.android.rum.model.ViewEvent.Container fromJson(java.lang.String str) throws com.google.gson.JsonParseException {
            return INSTANCE.fromJson(str);
        }

        public static /* synthetic */ com.datadog.android.rum.model.ViewEvent.Container copy$default(com.datadog.android.rum.model.ViewEvent.Container container, com.datadog.android.rum.model.ViewEvent.ContainerView containerView, com.datadog.android.rum.model.ViewEvent.ViewEventSource viewEventSource, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                containerView = container.view;
            }
            if ((i & 2) != 0) {
                viewEventSource = container.source;
            }
            return container.copy(containerView, viewEventSource);
        }
    }

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\b\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\u0007"}, d2 = {"Lcom/datadog/android/rum/model/ViewEvent$Privacy;", "", "Lcom/datadog/android/rum/model/ViewEvent$ReplayLevel;", "replayLevel", "<init>", "(Lcom/datadog/android/rum/model/ViewEvent$ReplayLevel;)V", "component1", "()Lcom/datadog/android/rum/model/ViewEvent$ReplayLevel;", "copy", "(Lcom/datadog/android/rum/model/ViewEvent$ReplayLevel;)Lcom/datadog/android/rum/model/ViewEvent$Privacy;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lcom/google/gson/JsonElement;", "toJson", "()Lcom/google/gson/JsonElement;", "", "toString", "()Ljava/lang/String;", "Lcom/datadog/android/rum/model/ViewEvent$ReplayLevel;", "getReplayLevel", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class Privacy {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.datadog.android.rum.model.ViewEvent.Privacy.Companion INSTANCE = new com.datadog.android.rum.model.ViewEvent.Privacy.Companion(null);
        private final com.datadog.android.rum.model.ViewEvent.ReplayLevel replayLevel;

        public Privacy(com.datadog.android.rum.model.ViewEvent.ReplayLevel replayLevel) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(replayLevel, "");
            this.replayLevel = replayLevel;
        }

        public final com.datadog.android.rum.model.ViewEvent.ReplayLevel getReplayLevel() {
            return this.replayLevel;
        }

        public final com.google.gson.JsonElement toJson() {
            com.google.gson.JsonObject jsonObject = new com.google.gson.JsonObject();
            jsonObject.add("replay_level", this.replayLevel.toJson());
            return jsonObject;
        }

        @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/datadog/android/rum/model/ViewEvent$Privacy$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/rum/model/ViewEvent$Privacy;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/rum/model/ViewEvent$Privacy;", "Lcom/google/gson/JsonObject;", "jsonObject", "fromJsonObject", "(Lcom/google/gson/JsonObject;)Lcom/datadog/android/rum/model/ViewEvent$Privacy;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @kotlin.jvm.JvmStatic
            public final com.datadog.android.rum.model.ViewEvent.Privacy fromJson(java.lang.String jsonString) throws com.google.gson.JsonParseException {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonString, "");
                try {
                    com.google.gson.JsonObject asJsonObject = com.google.gson.JsonParser.parseString(jsonString).getAsJsonObject();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asJsonObject, "");
                    return fromJsonObject(asJsonObject);
                } catch (java.lang.IllegalStateException e) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type Privacy", e);
                }
            }

            @kotlin.jvm.JvmStatic
            public final com.datadog.android.rum.model.ViewEvent.Privacy fromJsonObject(com.google.gson.JsonObject jsonObject) throws com.google.gson.JsonParseException {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonObject, "");
                try {
                    com.datadog.android.rum.model.ViewEvent.ReplayLevel.Companion companion = com.datadog.android.rum.model.ViewEvent.ReplayLevel.INSTANCE;
                    java.lang.String asString = jsonObject.get("replay_level").getAsString();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asString, "");
                    return new com.datadog.android.rum.model.ViewEvent.Privacy(companion.fromJson(asString));
                } catch (java.lang.IllegalStateException e) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type Privacy", e);
                } catch (java.lang.NullPointerException e2) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type Privacy", e2);
                } catch (java.lang.NumberFormatException e3) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type Privacy", e3);
                }
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public final java.lang.String toString() {
            com.datadog.android.rum.model.ViewEvent.ReplayLevel replayLevel = this.replayLevel;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Privacy(replayLevel=");
            sb.append(replayLevel);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.replayLevel.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.datadog.android.rum.model.ViewEvent.Privacy) && this.replayLevel == ((com.datadog.android.rum.model.ViewEvent.Privacy) other).replayLevel;
        }

        public final com.datadog.android.rum.model.ViewEvent.Privacy copy(com.datadog.android.rum.model.ViewEvent.ReplayLevel replayLevel) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(replayLevel, "");
            return new com.datadog.android.rum.model.ViewEvent.Privacy(replayLevel);
        }

        /* renamed from: component1, reason: from getter */
        public final com.datadog.android.rum.model.ViewEvent.ReplayLevel getReplayLevel() {
            return this.replayLevel;
        }

        @kotlin.jvm.JvmStatic
        public static final com.datadog.android.rum.model.ViewEvent.Privacy fromJsonObject(com.google.gson.JsonObject jsonObject) throws com.google.gson.JsonParseException {
            return INSTANCE.fromJsonObject(jsonObject);
        }

        @kotlin.jvm.JvmStatic
        public static final com.datadog.android.rum.model.ViewEvent.Privacy fromJson(java.lang.String str) throws com.google.gson.JsonParseException {
            return INSTANCE.fromJson(str);
        }

        public static /* synthetic */ com.datadog.android.rum.model.ViewEvent.Privacy copy$default(com.datadog.android.rum.model.ViewEvent.Privacy privacy, com.datadog.android.rum.model.ViewEvent.ReplayLevel replayLevel, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                replayLevel = privacy.replayLevel;
            }
            return privacy.copy(replayLevel);
        }
    }

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\b\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u001d\u0012\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ&\u0010\n\u001a\u00020\u00002\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R#\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\t"}, d2 = {"Lcom/datadog/android/rum/model/ViewEvent$CustomTimings;", "", "", "", "", "additionalProperties", "<init>", "(Ljava/util/Map;)V", "component1", "()Ljava/util/Map;", "copy", "(Ljava/util/Map;)Lcom/datadog/android/rum/model/ViewEvent$CustomTimings;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lcom/google/gson/JsonElement;", "toJson", "()Lcom/google/gson/JsonElement;", "toString", "()Ljava/lang/String;", "Ljava/util/Map;", "getAdditionalProperties", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class CustomTimings {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.datadog.android.rum.model.ViewEvent.CustomTimings.Companion INSTANCE = new com.datadog.android.rum.model.ViewEvent.CustomTimings.Companion(null);
        private final java.util.Map<java.lang.String, java.lang.Long> additionalProperties;

        public CustomTimings(java.util.Map<java.lang.String, java.lang.Long> map) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
            this.additionalProperties = map;
        }

        public /* synthetic */ CustomTimings(java.util.Map map, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? kotlin.collections.MapsKt.emptyMap() : map);
        }

        public final java.util.Map<java.lang.String, java.lang.Long> getAdditionalProperties() {
            return this.additionalProperties;
        }

        public final com.google.gson.JsonElement toJson() {
            com.google.gson.JsonObject jsonObject = new com.google.gson.JsonObject();
            for (java.util.Map.Entry<java.lang.String, java.lang.Long> entry : this.additionalProperties.entrySet()) {
                jsonObject.addProperty(entry.getKey(), java.lang.Long.valueOf(entry.getValue().longValue()));
            }
            return jsonObject;
        }

        @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/datadog/android/rum/model/ViewEvent$CustomTimings$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/rum/model/ViewEvent$CustomTimings;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/rum/model/ViewEvent$CustomTimings;", "Lcom/google/gson/JsonObject;", "jsonObject", "fromJsonObject", "(Lcom/google/gson/JsonObject;)Lcom/datadog/android/rum/model/ViewEvent$CustomTimings;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @kotlin.jvm.JvmStatic
            public final com.datadog.android.rum.model.ViewEvent.CustomTimings fromJson(java.lang.String jsonString) throws com.google.gson.JsonParseException {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonString, "");
                try {
                    com.google.gson.JsonObject asJsonObject = com.google.gson.JsonParser.parseString(jsonString).getAsJsonObject();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asJsonObject, "");
                    return fromJsonObject(asJsonObject);
                } catch (java.lang.IllegalStateException e) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type CustomTimings", e);
                }
            }

            @kotlin.jvm.JvmStatic
            public final com.datadog.android.rum.model.ViewEvent.CustomTimings fromJsonObject(com.google.gson.JsonObject jsonObject) throws com.google.gson.JsonParseException {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonObject, "");
                try {
                    java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
                    for (java.util.Map.Entry<java.lang.String, com.google.gson.JsonElement> entry : jsonObject.entrySet()) {
                        java.lang.String key = entry.getKey();
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(key, "");
                        linkedHashMap.put(key, java.lang.Long.valueOf(entry.getValue().getAsLong()));
                    }
                    return new com.datadog.android.rum.model.ViewEvent.CustomTimings(linkedHashMap);
                } catch (java.lang.IllegalStateException e) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type CustomTimings", e);
                } catch (java.lang.NullPointerException e2) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type CustomTimings", e2);
                } catch (java.lang.NumberFormatException e3) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type CustomTimings", e3);
                }
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public final java.lang.String toString() {
            java.util.Map<java.lang.String, java.lang.Long> map = this.additionalProperties;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("CustomTimings(additionalProperties=");
            sb.append(map);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.additionalProperties.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.datadog.android.rum.model.ViewEvent.CustomTimings) && kotlin.jvm.internal.Intrinsics.areEqual(this.additionalProperties, ((com.datadog.android.rum.model.ViewEvent.CustomTimings) other).additionalProperties);
        }

        public final com.datadog.android.rum.model.ViewEvent.CustomTimings copy(java.util.Map<java.lang.String, java.lang.Long> additionalProperties) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(additionalProperties, "");
            return new com.datadog.android.rum.model.ViewEvent.CustomTimings(additionalProperties);
        }

        public final java.util.Map<java.lang.String, java.lang.Long> component1() {
            return this.additionalProperties;
        }

        @kotlin.jvm.JvmStatic
        public static final com.datadog.android.rum.model.ViewEvent.CustomTimings fromJsonObject(com.google.gson.JsonObject jsonObject) throws com.google.gson.JsonParseException {
            return INSTANCE.fromJsonObject(jsonObject);
        }

        @kotlin.jvm.JvmStatic
        public static final com.datadog.android.rum.model.ViewEvent.CustomTimings fromJson(java.lang.String str) throws com.google.gson.JsonParseException {
            return INSTANCE.fromJson(str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.datadog.android.rum.model.ViewEvent.CustomTimings copy$default(com.datadog.android.rum.model.ViewEvent.CustomTimings customTimings, java.util.Map map, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                map = customTimings.additionalProperties;
            }
            return customTimings.copy(map);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public CustomTimings() {
            this(null, 1, 0 == true ? 1 : 0);
        }
    }

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\b\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\u0007"}, d2 = {"Lcom/datadog/android/rum/model/ViewEvent$Action;", "", "", com.datadog.android.rum.internal.metric.slowframes.DefaultUISlownessMetricDispatcher.KEY_COUNT, "<init>", "(J)V", "component1", "()J", "copy", "(J)Lcom/datadog/android/rum/model/ViewEvent$Action;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lcom/google/gson/JsonElement;", "toJson", "()Lcom/google/gson/JsonElement;", "", "toString", "()Ljava/lang/String;", "J", "getCount", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class Action {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.datadog.android.rum.model.ViewEvent.Action.Companion INSTANCE = new com.datadog.android.rum.model.ViewEvent.Action.Companion(null);
        private final long count;

        public Action(long j) {
            this.count = j;
        }

        public final long getCount() {
            return this.count;
        }

        public final com.google.gson.JsonElement toJson() {
            com.google.gson.JsonObject jsonObject = new com.google.gson.JsonObject();
            jsonObject.addProperty(com.datadog.android.rum.internal.metric.slowframes.DefaultUISlownessMetricDispatcher.KEY_COUNT, java.lang.Long.valueOf(this.count));
            return jsonObject;
        }

        @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/datadog/android/rum/model/ViewEvent$Action$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/rum/model/ViewEvent$Action;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/rum/model/ViewEvent$Action;", "Lcom/google/gson/JsonObject;", "jsonObject", "fromJsonObject", "(Lcom/google/gson/JsonObject;)Lcom/datadog/android/rum/model/ViewEvent$Action;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @kotlin.jvm.JvmStatic
            public final com.datadog.android.rum.model.ViewEvent.Action fromJson(java.lang.String jsonString) throws com.google.gson.JsonParseException {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonString, "");
                try {
                    com.google.gson.JsonObject asJsonObject = com.google.gson.JsonParser.parseString(jsonString).getAsJsonObject();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asJsonObject, "");
                    return fromJsonObject(asJsonObject);
                } catch (java.lang.IllegalStateException e) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type Action", e);
                }
            }

            @kotlin.jvm.JvmStatic
            public final com.datadog.android.rum.model.ViewEvent.Action fromJsonObject(com.google.gson.JsonObject jsonObject) throws com.google.gson.JsonParseException {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonObject, "");
                try {
                    return new com.datadog.android.rum.model.ViewEvent.Action(jsonObject.get(com.datadog.android.rum.internal.metric.slowframes.DefaultUISlownessMetricDispatcher.KEY_COUNT).getAsLong());
                } catch (java.lang.IllegalStateException e) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type Action", e);
                } catch (java.lang.NullPointerException e2) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type Action", e2);
                } catch (java.lang.NumberFormatException e3) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type Action", e3);
                }
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public final java.lang.String toString() {
            long j = this.count;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Action(count=");
            sb.append(j);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return java.lang.Long.hashCode(this.count);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.datadog.android.rum.model.ViewEvent.Action) && this.count == ((com.datadog.android.rum.model.ViewEvent.Action) other).count;
        }

        public final com.datadog.android.rum.model.ViewEvent.Action copy(long count) {
            return new com.datadog.android.rum.model.ViewEvent.Action(count);
        }

        /* renamed from: component1, reason: from getter */
        public final long getCount() {
            return this.count;
        }

        @kotlin.jvm.JvmStatic
        public static final com.datadog.android.rum.model.ViewEvent.Action fromJsonObject(com.google.gson.JsonObject jsonObject) throws com.google.gson.JsonParseException {
            return INSTANCE.fromJsonObject(jsonObject);
        }

        @kotlin.jvm.JvmStatic
        public static final com.datadog.android.rum.model.ViewEvent.Action fromJson(java.lang.String str) throws com.google.gson.JsonParseException {
            return INSTANCE.fromJson(str);
        }

        public static /* synthetic */ com.datadog.android.rum.model.ViewEvent.Action copy$default(com.datadog.android.rum.model.ViewEvent.Action action, long j, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                j = action.count;
            }
            return action.copy(j);
        }
    }

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\b\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\u0007"}, d2 = {"Lcom/datadog/android/rum/model/ViewEvent$Error;", "", "", com.datadog.android.rum.internal.metric.slowframes.DefaultUISlownessMetricDispatcher.KEY_COUNT, "<init>", "(J)V", "component1", "()J", "copy", "(J)Lcom/datadog/android/rum/model/ViewEvent$Error;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lcom/google/gson/JsonElement;", "toJson", "()Lcom/google/gson/JsonElement;", "", "toString", "()Ljava/lang/String;", "J", "getCount", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class Error {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.datadog.android.rum.model.ViewEvent.Error.Companion INSTANCE = new com.datadog.android.rum.model.ViewEvent.Error.Companion(null);
        private final long count;

        public Error(long j) {
            this.count = j;
        }

        public final long getCount() {
            return this.count;
        }

        public final com.google.gson.JsonElement toJson() {
            com.google.gson.JsonObject jsonObject = new com.google.gson.JsonObject();
            jsonObject.addProperty(com.datadog.android.rum.internal.metric.slowframes.DefaultUISlownessMetricDispatcher.KEY_COUNT, java.lang.Long.valueOf(this.count));
            return jsonObject;
        }

        @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/datadog/android/rum/model/ViewEvent$Error$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/rum/model/ViewEvent$Error;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/rum/model/ViewEvent$Error;", "Lcom/google/gson/JsonObject;", "jsonObject", "fromJsonObject", "(Lcom/google/gson/JsonObject;)Lcom/datadog/android/rum/model/ViewEvent$Error;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @kotlin.jvm.JvmStatic
            public final com.datadog.android.rum.model.ViewEvent.Error fromJson(java.lang.String jsonString) throws com.google.gson.JsonParseException {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonString, "");
                try {
                    com.google.gson.JsonObject asJsonObject = com.google.gson.JsonParser.parseString(jsonString).getAsJsonObject();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asJsonObject, "");
                    return fromJsonObject(asJsonObject);
                } catch (java.lang.IllegalStateException e) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type Error", e);
                }
            }

            @kotlin.jvm.JvmStatic
            public final com.datadog.android.rum.model.ViewEvent.Error fromJsonObject(com.google.gson.JsonObject jsonObject) throws com.google.gson.JsonParseException {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonObject, "");
                try {
                    return new com.datadog.android.rum.model.ViewEvent.Error(jsonObject.get(com.datadog.android.rum.internal.metric.slowframes.DefaultUISlownessMetricDispatcher.KEY_COUNT).getAsLong());
                } catch (java.lang.IllegalStateException e) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type Error", e);
                } catch (java.lang.NullPointerException e2) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type Error", e2);
                } catch (java.lang.NumberFormatException e3) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type Error", e3);
                }
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public final java.lang.String toString() {
            long j = this.count;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Error(count=");
            sb.append(j);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return java.lang.Long.hashCode(this.count);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.datadog.android.rum.model.ViewEvent.Error) && this.count == ((com.datadog.android.rum.model.ViewEvent.Error) other).count;
        }

        public final com.datadog.android.rum.model.ViewEvent.Error copy(long count) {
            return new com.datadog.android.rum.model.ViewEvent.Error(count);
        }

        /* renamed from: component1, reason: from getter */
        public final long getCount() {
            return this.count;
        }

        @kotlin.jvm.JvmStatic
        public static final com.datadog.android.rum.model.ViewEvent.Error fromJsonObject(com.google.gson.JsonObject jsonObject) throws com.google.gson.JsonParseException {
            return INSTANCE.fromJsonObject(jsonObject);
        }

        @kotlin.jvm.JvmStatic
        public static final com.datadog.android.rum.model.ViewEvent.Error fromJson(java.lang.String str) throws com.google.gson.JsonParseException {
            return INSTANCE.fromJson(str);
        }

        public static /* synthetic */ com.datadog.android.rum.model.ViewEvent.Error copy$default(com.datadog.android.rum.model.ViewEvent.Error error, long j, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                j = error.count;
            }
            return error.copy(j);
        }
    }

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\b\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\u0007"}, d2 = {"Lcom/datadog/android/rum/model/ViewEvent$Crash;", "", "", com.datadog.android.rum.internal.metric.slowframes.DefaultUISlownessMetricDispatcher.KEY_COUNT, "<init>", "(J)V", "component1", "()J", "copy", "(J)Lcom/datadog/android/rum/model/ViewEvent$Crash;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lcom/google/gson/JsonElement;", "toJson", "()Lcom/google/gson/JsonElement;", "", "toString", "()Ljava/lang/String;", "J", "getCount", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class Crash {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.datadog.android.rum.model.ViewEvent.Crash.Companion INSTANCE = new com.datadog.android.rum.model.ViewEvent.Crash.Companion(null);
        private final long count;

        public Crash(long j) {
            this.count = j;
        }

        public final long getCount() {
            return this.count;
        }

        public final com.google.gson.JsonElement toJson() {
            com.google.gson.JsonObject jsonObject = new com.google.gson.JsonObject();
            jsonObject.addProperty(com.datadog.android.rum.internal.metric.slowframes.DefaultUISlownessMetricDispatcher.KEY_COUNT, java.lang.Long.valueOf(this.count));
            return jsonObject;
        }

        @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/datadog/android/rum/model/ViewEvent$Crash$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/rum/model/ViewEvent$Crash;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/rum/model/ViewEvent$Crash;", "Lcom/google/gson/JsonObject;", "jsonObject", "fromJsonObject", "(Lcom/google/gson/JsonObject;)Lcom/datadog/android/rum/model/ViewEvent$Crash;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @kotlin.jvm.JvmStatic
            public final com.datadog.android.rum.model.ViewEvent.Crash fromJson(java.lang.String jsonString) throws com.google.gson.JsonParseException {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonString, "");
                try {
                    com.google.gson.JsonObject asJsonObject = com.google.gson.JsonParser.parseString(jsonString).getAsJsonObject();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asJsonObject, "");
                    return fromJsonObject(asJsonObject);
                } catch (java.lang.IllegalStateException e) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type Crash", e);
                }
            }

            @kotlin.jvm.JvmStatic
            public final com.datadog.android.rum.model.ViewEvent.Crash fromJsonObject(com.google.gson.JsonObject jsonObject) throws com.google.gson.JsonParseException {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonObject, "");
                try {
                    return new com.datadog.android.rum.model.ViewEvent.Crash(jsonObject.get(com.datadog.android.rum.internal.metric.slowframes.DefaultUISlownessMetricDispatcher.KEY_COUNT).getAsLong());
                } catch (java.lang.IllegalStateException e) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type Crash", e);
                } catch (java.lang.NullPointerException e2) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type Crash", e2);
                } catch (java.lang.NumberFormatException e3) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type Crash", e3);
                }
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public final java.lang.String toString() {
            long j = this.count;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Crash(count=");
            sb.append(j);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return java.lang.Long.hashCode(this.count);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.datadog.android.rum.model.ViewEvent.Crash) && this.count == ((com.datadog.android.rum.model.ViewEvent.Crash) other).count;
        }

        public final com.datadog.android.rum.model.ViewEvent.Crash copy(long count) {
            return new com.datadog.android.rum.model.ViewEvent.Crash(count);
        }

        /* renamed from: component1, reason: from getter */
        public final long getCount() {
            return this.count;
        }

        @kotlin.jvm.JvmStatic
        public static final com.datadog.android.rum.model.ViewEvent.Crash fromJsonObject(com.google.gson.JsonObject jsonObject) throws com.google.gson.JsonParseException {
            return INSTANCE.fromJsonObject(jsonObject);
        }

        @kotlin.jvm.JvmStatic
        public static final com.datadog.android.rum.model.ViewEvent.Crash fromJson(java.lang.String str) throws com.google.gson.JsonParseException {
            return INSTANCE.fromJson(str);
        }

        public static /* synthetic */ com.datadog.android.rum.model.ViewEvent.Crash copy$default(com.datadog.android.rum.model.ViewEvent.Crash crash, long j, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                j = crash.count;
            }
            return crash.copy(j);
        }
    }

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\b\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\u0007"}, d2 = {"Lcom/datadog/android/rum/model/ViewEvent$LongTask;", "", "", com.datadog.android.rum.internal.metric.slowframes.DefaultUISlownessMetricDispatcher.KEY_COUNT, "<init>", "(J)V", "component1", "()J", "copy", "(J)Lcom/datadog/android/rum/model/ViewEvent$LongTask;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lcom/google/gson/JsonElement;", "toJson", "()Lcom/google/gson/JsonElement;", "", "toString", "()Ljava/lang/String;", "J", "getCount", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class LongTask {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.datadog.android.rum.model.ViewEvent.LongTask.Companion INSTANCE = new com.datadog.android.rum.model.ViewEvent.LongTask.Companion(null);
        private final long count;

        public LongTask(long j) {
            this.count = j;
        }

        public final long getCount() {
            return this.count;
        }

        public final com.google.gson.JsonElement toJson() {
            com.google.gson.JsonObject jsonObject = new com.google.gson.JsonObject();
            jsonObject.addProperty(com.datadog.android.rum.internal.metric.slowframes.DefaultUISlownessMetricDispatcher.KEY_COUNT, java.lang.Long.valueOf(this.count));
            return jsonObject;
        }

        @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/datadog/android/rum/model/ViewEvent$LongTask$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/rum/model/ViewEvent$LongTask;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/rum/model/ViewEvent$LongTask;", "Lcom/google/gson/JsonObject;", "jsonObject", "fromJsonObject", "(Lcom/google/gson/JsonObject;)Lcom/datadog/android/rum/model/ViewEvent$LongTask;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @kotlin.jvm.JvmStatic
            public final com.datadog.android.rum.model.ViewEvent.LongTask fromJson(java.lang.String jsonString) throws com.google.gson.JsonParseException {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonString, "");
                try {
                    com.google.gson.JsonObject asJsonObject = com.google.gson.JsonParser.parseString(jsonString).getAsJsonObject();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asJsonObject, "");
                    return fromJsonObject(asJsonObject);
                } catch (java.lang.IllegalStateException e) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type LongTask", e);
                }
            }

            @kotlin.jvm.JvmStatic
            public final com.datadog.android.rum.model.ViewEvent.LongTask fromJsonObject(com.google.gson.JsonObject jsonObject) throws com.google.gson.JsonParseException {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonObject, "");
                try {
                    return new com.datadog.android.rum.model.ViewEvent.LongTask(jsonObject.get(com.datadog.android.rum.internal.metric.slowframes.DefaultUISlownessMetricDispatcher.KEY_COUNT).getAsLong());
                } catch (java.lang.IllegalStateException e) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type LongTask", e);
                } catch (java.lang.NullPointerException e2) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type LongTask", e2);
                } catch (java.lang.NumberFormatException e3) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type LongTask", e3);
                }
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public final java.lang.String toString() {
            long j = this.count;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("LongTask(count=");
            sb.append(j);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return java.lang.Long.hashCode(this.count);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.datadog.android.rum.model.ViewEvent.LongTask) && this.count == ((com.datadog.android.rum.model.ViewEvent.LongTask) other).count;
        }

        public final com.datadog.android.rum.model.ViewEvent.LongTask copy(long count) {
            return new com.datadog.android.rum.model.ViewEvent.LongTask(count);
        }

        /* renamed from: component1, reason: from getter */
        public final long getCount() {
            return this.count;
        }

        @kotlin.jvm.JvmStatic
        public static final com.datadog.android.rum.model.ViewEvent.LongTask fromJsonObject(com.google.gson.JsonObject jsonObject) throws com.google.gson.JsonParseException {
            return INSTANCE.fromJsonObject(jsonObject);
        }

        @kotlin.jvm.JvmStatic
        public static final com.datadog.android.rum.model.ViewEvent.LongTask fromJson(java.lang.String str) throws com.google.gson.JsonParseException {
            return INSTANCE.fromJson(str);
        }

        public static /* synthetic */ com.datadog.android.rum.model.ViewEvent.LongTask copy$default(com.datadog.android.rum.model.ViewEvent.LongTask longTask, long j, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                j = longTask.count;
            }
            return longTask.copy(j);
        }
    }

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\b\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\u0007"}, d2 = {"Lcom/datadog/android/rum/model/ViewEvent$FrozenFrame;", "", "", com.datadog.android.rum.internal.metric.slowframes.DefaultUISlownessMetricDispatcher.KEY_COUNT, "<init>", "(J)V", "component1", "()J", "copy", "(J)Lcom/datadog/android/rum/model/ViewEvent$FrozenFrame;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lcom/google/gson/JsonElement;", "toJson", "()Lcom/google/gson/JsonElement;", "", "toString", "()Ljava/lang/String;", "J", "getCount", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class FrozenFrame {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.datadog.android.rum.model.ViewEvent.FrozenFrame.Companion INSTANCE = new com.datadog.android.rum.model.ViewEvent.FrozenFrame.Companion(null);
        private final long count;

        public FrozenFrame(long j) {
            this.count = j;
        }

        public final long getCount() {
            return this.count;
        }

        public final com.google.gson.JsonElement toJson() {
            com.google.gson.JsonObject jsonObject = new com.google.gson.JsonObject();
            jsonObject.addProperty(com.datadog.android.rum.internal.metric.slowframes.DefaultUISlownessMetricDispatcher.KEY_COUNT, java.lang.Long.valueOf(this.count));
            return jsonObject;
        }

        @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/datadog/android/rum/model/ViewEvent$FrozenFrame$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/rum/model/ViewEvent$FrozenFrame;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/rum/model/ViewEvent$FrozenFrame;", "Lcom/google/gson/JsonObject;", "jsonObject", "fromJsonObject", "(Lcom/google/gson/JsonObject;)Lcom/datadog/android/rum/model/ViewEvent$FrozenFrame;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @kotlin.jvm.JvmStatic
            public final com.datadog.android.rum.model.ViewEvent.FrozenFrame fromJson(java.lang.String jsonString) throws com.google.gson.JsonParseException {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonString, "");
                try {
                    com.google.gson.JsonObject asJsonObject = com.google.gson.JsonParser.parseString(jsonString).getAsJsonObject();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asJsonObject, "");
                    return fromJsonObject(asJsonObject);
                } catch (java.lang.IllegalStateException e) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type FrozenFrame", e);
                }
            }

            @kotlin.jvm.JvmStatic
            public final com.datadog.android.rum.model.ViewEvent.FrozenFrame fromJsonObject(com.google.gson.JsonObject jsonObject) throws com.google.gson.JsonParseException {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonObject, "");
                try {
                    return new com.datadog.android.rum.model.ViewEvent.FrozenFrame(jsonObject.get(com.datadog.android.rum.internal.metric.slowframes.DefaultUISlownessMetricDispatcher.KEY_COUNT).getAsLong());
                } catch (java.lang.IllegalStateException e) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type FrozenFrame", e);
                } catch (java.lang.NullPointerException e2) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type FrozenFrame", e2);
                } catch (java.lang.NumberFormatException e3) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type FrozenFrame", e3);
                }
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public final java.lang.String toString() {
            long j = this.count;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("FrozenFrame(count=");
            sb.append(j);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return java.lang.Long.hashCode(this.count);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.datadog.android.rum.model.ViewEvent.FrozenFrame) && this.count == ((com.datadog.android.rum.model.ViewEvent.FrozenFrame) other).count;
        }

        public final com.datadog.android.rum.model.ViewEvent.FrozenFrame copy(long count) {
            return new com.datadog.android.rum.model.ViewEvent.FrozenFrame(count);
        }

        /* renamed from: component1, reason: from getter */
        public final long getCount() {
            return this.count;
        }

        @kotlin.jvm.JvmStatic
        public static final com.datadog.android.rum.model.ViewEvent.FrozenFrame fromJsonObject(com.google.gson.JsonObject jsonObject) throws com.google.gson.JsonParseException {
            return INSTANCE.fromJsonObject(jsonObject);
        }

        @kotlin.jvm.JvmStatic
        public static final com.datadog.android.rum.model.ViewEvent.FrozenFrame fromJson(java.lang.String str) throws com.google.gson.JsonParseException {
            return INSTANCE.fromJson(str);
        }

        public static /* synthetic */ com.datadog.android.rum.model.ViewEvent.FrozenFrame copy$default(com.datadog.android.rum.model.ViewEvent.FrozenFrame frozenFrame, long j, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                j = frozenFrame.count;
            }
            return frozenFrame.copy(j);
        }
    }

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0004\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001a\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001b\u0010\b"}, d2 = {"Lcom/datadog/android/rum/model/ViewEvent$SlowFrame;", "", "", com.adobe.marketing.mobile.internal.CoreConstants.EventDataKeys.Lifecycle.LIFECYCLE_START, "duration", "<init>", "(JJ)V", "component1", "()J", "component2", "copy", "(JJ)Lcom/datadog/android/rum/model/ViewEvent$SlowFrame;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lcom/google/gson/JsonElement;", "toJson", "()Lcom/google/gson/JsonElement;", "", "toString", "()Ljava/lang/String;", "J", "getDuration", "getStart", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class SlowFrame {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.datadog.android.rum.model.ViewEvent.SlowFrame.Companion INSTANCE = new com.datadog.android.rum.model.ViewEvent.SlowFrame.Companion(null);
        private final long duration;
        private final long start;

        public SlowFrame(long j, long j2) {
            this.start = j;
            this.duration = j2;
        }

        public final long getStart() {
            return this.start;
        }

        public final long getDuration() {
            return this.duration;
        }

        public final com.google.gson.JsonElement toJson() {
            com.google.gson.JsonObject jsonObject = new com.google.gson.JsonObject();
            jsonObject.addProperty(com.adobe.marketing.mobile.internal.CoreConstants.EventDataKeys.Lifecycle.LIFECYCLE_START, java.lang.Long.valueOf(this.start));
            jsonObject.addProperty("duration", java.lang.Long.valueOf(this.duration));
            return jsonObject;
        }

        @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/datadog/android/rum/model/ViewEvent$SlowFrame$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/rum/model/ViewEvent$SlowFrame;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/rum/model/ViewEvent$SlowFrame;", "Lcom/google/gson/JsonObject;", "jsonObject", "fromJsonObject", "(Lcom/google/gson/JsonObject;)Lcom/datadog/android/rum/model/ViewEvent$SlowFrame;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @kotlin.jvm.JvmStatic
            public final com.datadog.android.rum.model.ViewEvent.SlowFrame fromJson(java.lang.String jsonString) throws com.google.gson.JsonParseException {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonString, "");
                try {
                    com.google.gson.JsonObject asJsonObject = com.google.gson.JsonParser.parseString(jsonString).getAsJsonObject();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asJsonObject, "");
                    return fromJsonObject(asJsonObject);
                } catch (java.lang.IllegalStateException e) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type SlowFrame", e);
                }
            }

            @kotlin.jvm.JvmStatic
            public final com.datadog.android.rum.model.ViewEvent.SlowFrame fromJsonObject(com.google.gson.JsonObject jsonObject) throws com.google.gson.JsonParseException {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonObject, "");
                try {
                    return new com.datadog.android.rum.model.ViewEvent.SlowFrame(jsonObject.get(com.adobe.marketing.mobile.internal.CoreConstants.EventDataKeys.Lifecycle.LIFECYCLE_START).getAsLong(), jsonObject.get("duration").getAsLong());
                } catch (java.lang.IllegalStateException e) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type SlowFrame", e);
                } catch (java.lang.NullPointerException e2) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type SlowFrame", e2);
                } catch (java.lang.NumberFormatException e3) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type SlowFrame", e3);
                }
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public final java.lang.String toString() {
            long j = this.start;
            long j2 = this.duration;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("SlowFrame(start=");
            sb.append(j);
            sb.append(", duration=");
            sb.append(j2);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (java.lang.Long.hashCode(this.start) * 31) + java.lang.Long.hashCode(this.duration);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.datadog.android.rum.model.ViewEvent.SlowFrame)) {
                return false;
            }
            com.datadog.android.rum.model.ViewEvent.SlowFrame slowFrame = (com.datadog.android.rum.model.ViewEvent.SlowFrame) other;
            return this.start == slowFrame.start && this.duration == slowFrame.duration;
        }

        public final com.datadog.android.rum.model.ViewEvent.SlowFrame copy(long start, long duration) {
            return new com.datadog.android.rum.model.ViewEvent.SlowFrame(start, duration);
        }

        /* renamed from: component2, reason: from getter */
        public final long getDuration() {
            return this.duration;
        }

        /* renamed from: component1, reason: from getter */
        public final long getStart() {
            return this.start;
        }

        @kotlin.jvm.JvmStatic
        public static final com.datadog.android.rum.model.ViewEvent.SlowFrame fromJsonObject(com.google.gson.JsonObject jsonObject) throws com.google.gson.JsonParseException {
            return INSTANCE.fromJsonObject(jsonObject);
        }

        @kotlin.jvm.JvmStatic
        public static final com.datadog.android.rum.model.ViewEvent.SlowFrame fromJson(java.lang.String str) throws com.google.gson.JsonParseException {
            return INSTANCE.fromJson(str);
        }

        public static /* synthetic */ com.datadog.android.rum.model.ViewEvent.SlowFrame copy$default(com.datadog.android.rum.model.ViewEvent.SlowFrame slowFrame, long j, long j2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                j = slowFrame.start;
            }
            if ((i & 2) != 0) {
                j2 = slowFrame.duration;
            }
            return slowFrame.copy(j, j2);
        }
    }

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\b\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\u0007"}, d2 = {"Lcom/datadog/android/rum/model/ViewEvent$Resource;", "", "", com.datadog.android.rum.internal.metric.slowframes.DefaultUISlownessMetricDispatcher.KEY_COUNT, "<init>", "(J)V", "component1", "()J", "copy", "(J)Lcom/datadog/android/rum/model/ViewEvent$Resource;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lcom/google/gson/JsonElement;", "toJson", "()Lcom/google/gson/JsonElement;", "", "toString", "()Ljava/lang/String;", "J", "getCount", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class Resource {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.datadog.android.rum.model.ViewEvent.Resource.Companion INSTANCE = new com.datadog.android.rum.model.ViewEvent.Resource.Companion(null);
        private final long count;

        public Resource(long j) {
            this.count = j;
        }

        public final long getCount() {
            return this.count;
        }

        public final com.google.gson.JsonElement toJson() {
            com.google.gson.JsonObject jsonObject = new com.google.gson.JsonObject();
            jsonObject.addProperty(com.datadog.android.rum.internal.metric.slowframes.DefaultUISlownessMetricDispatcher.KEY_COUNT, java.lang.Long.valueOf(this.count));
            return jsonObject;
        }

        @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/datadog/android/rum/model/ViewEvent$Resource$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/rum/model/ViewEvent$Resource;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/rum/model/ViewEvent$Resource;", "Lcom/google/gson/JsonObject;", "jsonObject", "fromJsonObject", "(Lcom/google/gson/JsonObject;)Lcom/datadog/android/rum/model/ViewEvent$Resource;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @kotlin.jvm.JvmStatic
            public final com.datadog.android.rum.model.ViewEvent.Resource fromJson(java.lang.String jsonString) throws com.google.gson.JsonParseException {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonString, "");
                try {
                    com.google.gson.JsonObject asJsonObject = com.google.gson.JsonParser.parseString(jsonString).getAsJsonObject();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asJsonObject, "");
                    return fromJsonObject(asJsonObject);
                } catch (java.lang.IllegalStateException e) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type Resource", e);
                }
            }

            @kotlin.jvm.JvmStatic
            public final com.datadog.android.rum.model.ViewEvent.Resource fromJsonObject(com.google.gson.JsonObject jsonObject) throws com.google.gson.JsonParseException {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonObject, "");
                try {
                    return new com.datadog.android.rum.model.ViewEvent.Resource(jsonObject.get(com.datadog.android.rum.internal.metric.slowframes.DefaultUISlownessMetricDispatcher.KEY_COUNT).getAsLong());
                } catch (java.lang.IllegalStateException e) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type Resource", e);
                } catch (java.lang.NullPointerException e2) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type Resource", e2);
                } catch (java.lang.NumberFormatException e3) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type Resource", e3);
                }
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public final java.lang.String toString() {
            long j = this.count;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Resource(count=");
            sb.append(j);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return java.lang.Long.hashCode(this.count);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.datadog.android.rum.model.ViewEvent.Resource) && this.count == ((com.datadog.android.rum.model.ViewEvent.Resource) other).count;
        }

        public final com.datadog.android.rum.model.ViewEvent.Resource copy(long count) {
            return new com.datadog.android.rum.model.ViewEvent.Resource(count);
        }

        /* renamed from: component1, reason: from getter */
        public final long getCount() {
            return this.count;
        }

        @kotlin.jvm.JvmStatic
        public static final com.datadog.android.rum.model.ViewEvent.Resource fromJsonObject(com.google.gson.JsonObject jsonObject) throws com.google.gson.JsonParseException {
            return INSTANCE.fromJsonObject(jsonObject);
        }

        @kotlin.jvm.JvmStatic
        public static final com.datadog.android.rum.model.ViewEvent.Resource fromJson(java.lang.String str) throws com.google.gson.JsonParseException {
            return INSTANCE.fromJson(str);
        }

        public static /* synthetic */ com.datadog.android.rum.model.ViewEvent.Resource copy$default(com.datadog.android.rum.model.ViewEvent.Resource resource, long j, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                j = resource.count;
            }
            return resource.copy(j);
        }
    }

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\b\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\u0007"}, d2 = {"Lcom/datadog/android/rum/model/ViewEvent$Frustration;", "", "", com.datadog.android.rum.internal.metric.slowframes.DefaultUISlownessMetricDispatcher.KEY_COUNT, "<init>", "(J)V", "component1", "()J", "copy", "(J)Lcom/datadog/android/rum/model/ViewEvent$Frustration;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lcom/google/gson/JsonElement;", "toJson", "()Lcom/google/gson/JsonElement;", "", "toString", "()Ljava/lang/String;", "J", "getCount", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class Frustration {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.datadog.android.rum.model.ViewEvent.Frustration.Companion INSTANCE = new com.datadog.android.rum.model.ViewEvent.Frustration.Companion(null);
        private final long count;

        public Frustration(long j) {
            this.count = j;
        }

        public final long getCount() {
            return this.count;
        }

        public final com.google.gson.JsonElement toJson() {
            com.google.gson.JsonObject jsonObject = new com.google.gson.JsonObject();
            jsonObject.addProperty(com.datadog.android.rum.internal.metric.slowframes.DefaultUISlownessMetricDispatcher.KEY_COUNT, java.lang.Long.valueOf(this.count));
            return jsonObject;
        }

        @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/datadog/android/rum/model/ViewEvent$Frustration$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/rum/model/ViewEvent$Frustration;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/rum/model/ViewEvent$Frustration;", "Lcom/google/gson/JsonObject;", "jsonObject", "fromJsonObject", "(Lcom/google/gson/JsonObject;)Lcom/datadog/android/rum/model/ViewEvent$Frustration;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @kotlin.jvm.JvmStatic
            public final com.datadog.android.rum.model.ViewEvent.Frustration fromJson(java.lang.String jsonString) throws com.google.gson.JsonParseException {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonString, "");
                try {
                    com.google.gson.JsonObject asJsonObject = com.google.gson.JsonParser.parseString(jsonString).getAsJsonObject();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asJsonObject, "");
                    return fromJsonObject(asJsonObject);
                } catch (java.lang.IllegalStateException e) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type Frustration", e);
                }
            }

            @kotlin.jvm.JvmStatic
            public final com.datadog.android.rum.model.ViewEvent.Frustration fromJsonObject(com.google.gson.JsonObject jsonObject) throws com.google.gson.JsonParseException {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonObject, "");
                try {
                    return new com.datadog.android.rum.model.ViewEvent.Frustration(jsonObject.get(com.datadog.android.rum.internal.metric.slowframes.DefaultUISlownessMetricDispatcher.KEY_COUNT).getAsLong());
                } catch (java.lang.IllegalStateException e) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type Frustration", e);
                } catch (java.lang.NullPointerException e2) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type Frustration", e2);
                } catch (java.lang.NumberFormatException e3) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type Frustration", e3);
                }
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public final java.lang.String toString() {
            long j = this.count;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Frustration(count=");
            sb.append(j);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return java.lang.Long.hashCode(this.count);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.datadog.android.rum.model.ViewEvent.Frustration) && this.count == ((com.datadog.android.rum.model.ViewEvent.Frustration) other).count;
        }

        public final com.datadog.android.rum.model.ViewEvent.Frustration copy(long count) {
            return new com.datadog.android.rum.model.ViewEvent.Frustration(count);
        }

        /* renamed from: component1, reason: from getter */
        public final long getCount() {
            return this.count;
        }

        @kotlin.jvm.JvmStatic
        public static final com.datadog.android.rum.model.ViewEvent.Frustration fromJsonObject(com.google.gson.JsonObject jsonObject) throws com.google.gson.JsonParseException {
            return INSTANCE.fromJsonObject(jsonObject);
        }

        @kotlin.jvm.JvmStatic
        public static final com.datadog.android.rum.model.ViewEvent.Frustration fromJson(java.lang.String str) throws com.google.gson.JsonParseException {
            return INSTANCE.fromJson(str);
        }

        public static /* synthetic */ com.datadog.android.rum.model.ViewEvent.Frustration copy$default(com.datadog.android.rum.model.ViewEvent.Frustration frustration, long j, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                j = frustration.count;
            }
            return frustration.copy(j);
        }
    }

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0004\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001a\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001b\u0010\b"}, d2 = {"Lcom/datadog/android/rum/model/ViewEvent$InForegroundPeriod;", "", "", com.adobe.marketing.mobile.internal.CoreConstants.EventDataKeys.Lifecycle.LIFECYCLE_START, "duration", "<init>", "(JJ)V", "component1", "()J", "component2", "copy", "(JJ)Lcom/datadog/android/rum/model/ViewEvent$InForegroundPeriod;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lcom/google/gson/JsonElement;", "toJson", "()Lcom/google/gson/JsonElement;", "", "toString", "()Ljava/lang/String;", "J", "getDuration", "getStart", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class InForegroundPeriod {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.datadog.android.rum.model.ViewEvent.InForegroundPeriod.Companion INSTANCE = new com.datadog.android.rum.model.ViewEvent.InForegroundPeriod.Companion(null);
        private final long duration;
        private final long start;

        public InForegroundPeriod(long j, long j2) {
            this.start = j;
            this.duration = j2;
        }

        public final long getStart() {
            return this.start;
        }

        public final long getDuration() {
            return this.duration;
        }

        public final com.google.gson.JsonElement toJson() {
            com.google.gson.JsonObject jsonObject = new com.google.gson.JsonObject();
            jsonObject.addProperty(com.adobe.marketing.mobile.internal.CoreConstants.EventDataKeys.Lifecycle.LIFECYCLE_START, java.lang.Long.valueOf(this.start));
            jsonObject.addProperty("duration", java.lang.Long.valueOf(this.duration));
            return jsonObject;
        }

        @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/datadog/android/rum/model/ViewEvent$InForegroundPeriod$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/rum/model/ViewEvent$InForegroundPeriod;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/rum/model/ViewEvent$InForegroundPeriod;", "Lcom/google/gson/JsonObject;", "jsonObject", "fromJsonObject", "(Lcom/google/gson/JsonObject;)Lcom/datadog/android/rum/model/ViewEvent$InForegroundPeriod;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @kotlin.jvm.JvmStatic
            public final com.datadog.android.rum.model.ViewEvent.InForegroundPeriod fromJson(java.lang.String jsonString) throws com.google.gson.JsonParseException {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonString, "");
                try {
                    com.google.gson.JsonObject asJsonObject = com.google.gson.JsonParser.parseString(jsonString).getAsJsonObject();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asJsonObject, "");
                    return fromJsonObject(asJsonObject);
                } catch (java.lang.IllegalStateException e) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type InForegroundPeriod", e);
                }
            }

            @kotlin.jvm.JvmStatic
            public final com.datadog.android.rum.model.ViewEvent.InForegroundPeriod fromJsonObject(com.google.gson.JsonObject jsonObject) throws com.google.gson.JsonParseException {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonObject, "");
                try {
                    return new com.datadog.android.rum.model.ViewEvent.InForegroundPeriod(jsonObject.get(com.adobe.marketing.mobile.internal.CoreConstants.EventDataKeys.Lifecycle.LIFECYCLE_START).getAsLong(), jsonObject.get("duration").getAsLong());
                } catch (java.lang.IllegalStateException e) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type InForegroundPeriod", e);
                } catch (java.lang.NullPointerException e2) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type InForegroundPeriod", e2);
                } catch (java.lang.NumberFormatException e3) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type InForegroundPeriod", e3);
                }
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public final java.lang.String toString() {
            long j = this.start;
            long j2 = this.duration;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("InForegroundPeriod(start=");
            sb.append(j);
            sb.append(", duration=");
            sb.append(j2);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (java.lang.Long.hashCode(this.start) * 31) + java.lang.Long.hashCode(this.duration);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.datadog.android.rum.model.ViewEvent.InForegroundPeriod)) {
                return false;
            }
            com.datadog.android.rum.model.ViewEvent.InForegroundPeriod inForegroundPeriod = (com.datadog.android.rum.model.ViewEvent.InForegroundPeriod) other;
            return this.start == inForegroundPeriod.start && this.duration == inForegroundPeriod.duration;
        }

        public final com.datadog.android.rum.model.ViewEvent.InForegroundPeriod copy(long start, long duration) {
            return new com.datadog.android.rum.model.ViewEvent.InForegroundPeriod(start, duration);
        }

        /* renamed from: component2, reason: from getter */
        public final long getDuration() {
            return this.duration;
        }

        /* renamed from: component1, reason: from getter */
        public final long getStart() {
            return this.start;
        }

        @kotlin.jvm.JvmStatic
        public static final com.datadog.android.rum.model.ViewEvent.InForegroundPeriod fromJsonObject(com.google.gson.JsonObject jsonObject) throws com.google.gson.JsonParseException {
            return INSTANCE.fromJsonObject(jsonObject);
        }

        @kotlin.jvm.JvmStatic
        public static final com.datadog.android.rum.model.ViewEvent.InForegroundPeriod fromJson(java.lang.String str) throws com.google.gson.JsonParseException {
            return INSTANCE.fromJson(str);
        }

        public static /* synthetic */ com.datadog.android.rum.model.ViewEvent.InForegroundPeriod copy$default(com.datadog.android.rum.model.ViewEvent.InForegroundPeriod inForegroundPeriod, long j, long j2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                j = inForegroundPeriod.start;
            }
            if ((i & 2) != 0) {
                j2 = inForegroundPeriod.duration;
            }
            return inForegroundPeriod.copy(j, j2);
        }
    }

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0004\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\b\u0018\u0000 \"2\u00020\u0001:\u0001\"B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\nJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\nJ:\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0005\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u001d\u001a\u0004\b\u001e\u0010\nR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001d\u001a\u0004\b\u001f\u0010\nR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001d\u001a\u0004\b \u0010\nR\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b!\u0010\n"}, d2 = {"Lcom/datadog/android/rum/model/ViewEvent$FlutterBuildTime;", "", "", com.datadog.android.core.internal.metrics.BatchMetricsDispatcher.UPLOADER_DELAY_MIN_KEY, com.datadog.android.core.internal.metrics.BatchMetricsDispatcher.UPLOADER_DELAY_MAX_KEY, "average", "metricMax", "<init>", "(Ljava/lang/Number;Ljava/lang/Number;Ljava/lang/Number;Ljava/lang/Number;)V", "component1", "()Ljava/lang/Number;", "component2", "component3", "component4", "copy", "(Ljava/lang/Number;Ljava/lang/Number;Ljava/lang/Number;Ljava/lang/Number;)Lcom/datadog/android/rum/model/ViewEvent$FlutterBuildTime;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lcom/google/gson/JsonElement;", "toJson", "()Lcom/google/gson/JsonElement;", "", "toString", "()Ljava/lang/String;", "Ljava/lang/Number;", "getAverage", "getMax", "getMetricMax", "getMin", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class FlutterBuildTime {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.datadog.android.rum.model.ViewEvent.FlutterBuildTime.Companion INSTANCE = new com.datadog.android.rum.model.ViewEvent.FlutterBuildTime.Companion(null);
        private final java.lang.Number average;
        private final java.lang.Number max;
        private final java.lang.Number metricMax;
        private final java.lang.Number min;

        public FlutterBuildTime(java.lang.Number number, java.lang.Number number2, java.lang.Number number3, java.lang.Number number4) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(number, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(number2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(number3, "");
            this.min = number;
            this.max = number2;
            this.average = number3;
            this.metricMax = number4;
        }

        public /* synthetic */ FlutterBuildTime(java.lang.Number number, java.lang.Number number2, java.lang.Number number3, java.lang.Number number4, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(number, number2, number3, (i & 8) != 0 ? null : number4);
        }

        public final java.lang.Number getMin() {
            return this.min;
        }

        public final java.lang.Number getMax() {
            return this.max;
        }

        public final java.lang.Number getAverage() {
            return this.average;
        }

        public final java.lang.Number getMetricMax() {
            return this.metricMax;
        }

        public final com.google.gson.JsonElement toJson() {
            com.google.gson.JsonObject jsonObject = new com.google.gson.JsonObject();
            jsonObject.addProperty(com.datadog.android.core.internal.metrics.BatchMetricsDispatcher.UPLOADER_DELAY_MIN_KEY, this.min);
            jsonObject.addProperty(com.datadog.android.core.internal.metrics.BatchMetricsDispatcher.UPLOADER_DELAY_MAX_KEY, this.max);
            jsonObject.addProperty("average", this.average);
            java.lang.Number number = this.metricMax;
            if (number != null) {
                jsonObject.addProperty("metric_max", number);
            }
            return jsonObject;
        }

        @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/datadog/android/rum/model/ViewEvent$FlutterBuildTime$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/rum/model/ViewEvent$FlutterBuildTime;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/rum/model/ViewEvent$FlutterBuildTime;", "Lcom/google/gson/JsonObject;", "jsonObject", "fromJsonObject", "(Lcom/google/gson/JsonObject;)Lcom/datadog/android/rum/model/ViewEvent$FlutterBuildTime;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @kotlin.jvm.JvmStatic
            public final com.datadog.android.rum.model.ViewEvent.FlutterBuildTime fromJson(java.lang.String jsonString) throws com.google.gson.JsonParseException {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonString, "");
                try {
                    com.google.gson.JsonObject asJsonObject = com.google.gson.JsonParser.parseString(jsonString).getAsJsonObject();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asJsonObject, "");
                    return fromJsonObject(asJsonObject);
                } catch (java.lang.IllegalStateException e) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type FlutterBuildTime", e);
                }
            }

            @kotlin.jvm.JvmStatic
            public final com.datadog.android.rum.model.ViewEvent.FlutterBuildTime fromJsonObject(com.google.gson.JsonObject jsonObject) throws com.google.gson.JsonParseException {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonObject, "");
                try {
                    java.lang.Number asNumber = jsonObject.get(com.datadog.android.core.internal.metrics.BatchMetricsDispatcher.UPLOADER_DELAY_MIN_KEY).getAsNumber();
                    java.lang.Number asNumber2 = jsonObject.get(com.datadog.android.core.internal.metrics.BatchMetricsDispatcher.UPLOADER_DELAY_MAX_KEY).getAsNumber();
                    java.lang.Number asNumber3 = jsonObject.get("average").getAsNumber();
                    com.google.gson.JsonElement jsonElement = jsonObject.get("metric_max");
                    java.lang.Number asNumber4 = jsonElement != null ? jsonElement.getAsNumber() : null;
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asNumber, "");
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asNumber2, "");
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asNumber3, "");
                    return new com.datadog.android.rum.model.ViewEvent.FlutterBuildTime(asNumber, asNumber2, asNumber3, asNumber4);
                } catch (java.lang.IllegalStateException e) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type FlutterBuildTime", e);
                } catch (java.lang.NullPointerException e2) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type FlutterBuildTime", e2);
                } catch (java.lang.NumberFormatException e3) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type FlutterBuildTime", e3);
                }
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public final java.lang.String toString() {
            java.lang.Number number = this.min;
            java.lang.Number number2 = this.max;
            java.lang.Number number3 = this.average;
            java.lang.Number number4 = this.metricMax;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("FlutterBuildTime(min=");
            sb.append(number);
            sb.append(", max=");
            sb.append(number2);
            sb.append(", average=");
            sb.append(number3);
            sb.append(", metricMax=");
            sb.append(number4);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.min.hashCode();
            int hashCode2 = this.max.hashCode();
            int hashCode3 = this.average.hashCode();
            java.lang.Number number = this.metricMax;
            return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (number == null ? 0 : number.hashCode());
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.datadog.android.rum.model.ViewEvent.FlutterBuildTime)) {
                return false;
            }
            com.datadog.android.rum.model.ViewEvent.FlutterBuildTime flutterBuildTime = (com.datadog.android.rum.model.ViewEvent.FlutterBuildTime) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.min, flutterBuildTime.min) && kotlin.jvm.internal.Intrinsics.areEqual(this.max, flutterBuildTime.max) && kotlin.jvm.internal.Intrinsics.areEqual(this.average, flutterBuildTime.average) && kotlin.jvm.internal.Intrinsics.areEqual(this.metricMax, flutterBuildTime.metricMax);
        }

        public final com.datadog.android.rum.model.ViewEvent.FlutterBuildTime copy(java.lang.Number min, java.lang.Number max, java.lang.Number average, java.lang.Number metricMax) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(min, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(max, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(average, "");
            return new com.datadog.android.rum.model.ViewEvent.FlutterBuildTime(min, max, average, metricMax);
        }

        /* renamed from: component4, reason: from getter */
        public final java.lang.Number getMetricMax() {
            return this.metricMax;
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.Number getAverage() {
            return this.average;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.Number getMax() {
            return this.max;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.Number getMin() {
            return this.min;
        }

        @kotlin.jvm.JvmStatic
        public static final com.datadog.android.rum.model.ViewEvent.FlutterBuildTime fromJsonObject(com.google.gson.JsonObject jsonObject) throws com.google.gson.JsonParseException {
            return INSTANCE.fromJsonObject(jsonObject);
        }

        @kotlin.jvm.JvmStatic
        public static final com.datadog.android.rum.model.ViewEvent.FlutterBuildTime fromJson(java.lang.String str) throws com.google.gson.JsonParseException {
            return INSTANCE.fromJson(str);
        }

        public static /* synthetic */ com.datadog.android.rum.model.ViewEvent.FlutterBuildTime copy$default(com.datadog.android.rum.model.ViewEvent.FlutterBuildTime flutterBuildTime, java.lang.Number number, java.lang.Number number2, java.lang.Number number3, java.lang.Number number4, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                number = flutterBuildTime.min;
            }
            if ((i & 2) != 0) {
                number2 = flutterBuildTime.max;
            }
            if ((i & 4) != 0) {
                number3 = flutterBuildTime.average;
            }
            if ((i & 8) != 0) {
                number4 = flutterBuildTime.metricMax;
            }
            return flutterBuildTime.copy(number, number2, number3, number4);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0086\b\u0018\u0000 72\u00020\u0001:\u00017BO\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJX\u0010\u001c\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\fHÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010#\u001a\u00020\"HÖ\u0001¢\u0006\u0004\b#\u0010$J\r\u0010&\u001a\u00020%¢\u0006\u0004\b&\u0010'J\u0010\u0010)\u001a\u00020(HÖ\u0001¢\u0006\u0004\b)\u0010*R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010+\u001a\u0004\b,\u0010\u0011R\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010-\u001a\u0004\b.\u0010\u001bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010/\u001a\u0004\b0\u0010\u0013R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u00101\u001a\u0004\b2\u0010\u0015R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u00103\u001a\u0004\b4\u0010\u0017R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u00105\u001a\u0004\b6\u0010\u0019"}, d2 = {"Lcom/datadog/android/rum/model/ViewEvent$Performance;", "", "Lcom/datadog/android/rum/model/ViewEvent$PerformanceCls;", "cls", "Lcom/datadog/android/rum/model/ViewEvent$Fcp;", "fcp", "Lcom/datadog/android/rum/model/ViewEvent$Fid;", "fid", "Lcom/datadog/android/rum/model/ViewEvent$Inp;", "inp", "Lcom/datadog/android/rum/model/ViewEvent$Lcp;", "lcp", "Lcom/datadog/android/rum/model/ViewEvent$Fbc;", "fbc", "<init>", "(Lcom/datadog/android/rum/model/ViewEvent$PerformanceCls;Lcom/datadog/android/rum/model/ViewEvent$Fcp;Lcom/datadog/android/rum/model/ViewEvent$Fid;Lcom/datadog/android/rum/model/ViewEvent$Inp;Lcom/datadog/android/rum/model/ViewEvent$Lcp;Lcom/datadog/android/rum/model/ViewEvent$Fbc;)V", "component1", "()Lcom/datadog/android/rum/model/ViewEvent$PerformanceCls;", "component2", "()Lcom/datadog/android/rum/model/ViewEvent$Fcp;", "component3", "()Lcom/datadog/android/rum/model/ViewEvent$Fid;", "component4", "()Lcom/datadog/android/rum/model/ViewEvent$Inp;", "component5", "()Lcom/datadog/android/rum/model/ViewEvent$Lcp;", "component6", "()Lcom/datadog/android/rum/model/ViewEvent$Fbc;", "copy", "(Lcom/datadog/android/rum/model/ViewEvent$PerformanceCls;Lcom/datadog/android/rum/model/ViewEvent$Fcp;Lcom/datadog/android/rum/model/ViewEvent$Fid;Lcom/datadog/android/rum/model/ViewEvent$Inp;Lcom/datadog/android/rum/model/ViewEvent$Lcp;Lcom/datadog/android/rum/model/ViewEvent$Fbc;)Lcom/datadog/android/rum/model/ViewEvent$Performance;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lcom/google/gson/JsonElement;", "toJson", "()Lcom/google/gson/JsonElement;", "", "toString", "()Ljava/lang/String;", "Lcom/datadog/android/rum/model/ViewEvent$PerformanceCls;", "getCls", "Lcom/datadog/android/rum/model/ViewEvent$Fbc;", "getFbc", "Lcom/datadog/android/rum/model/ViewEvent$Fcp;", "getFcp", "Lcom/datadog/android/rum/model/ViewEvent$Fid;", "getFid", "Lcom/datadog/android/rum/model/ViewEvent$Inp;", "getInp", "Lcom/datadog/android/rum/model/ViewEvent$Lcp;", "getLcp", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class Performance {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.datadog.android.rum.model.ViewEvent.Performance.Companion INSTANCE = new com.datadog.android.rum.model.ViewEvent.Performance.Companion(null);
        private final com.datadog.android.rum.model.ViewEvent.PerformanceCls cls;
        private final com.datadog.android.rum.model.ViewEvent.Fbc fbc;
        private final com.datadog.android.rum.model.ViewEvent.Fcp fcp;
        private final com.datadog.android.rum.model.ViewEvent.Fid fid;
        private final com.datadog.android.rum.model.ViewEvent.Inp inp;
        private final com.datadog.android.rum.model.ViewEvent.Lcp lcp;

        public Performance(com.datadog.android.rum.model.ViewEvent.PerformanceCls performanceCls, com.datadog.android.rum.model.ViewEvent.Fcp fcp, com.datadog.android.rum.model.ViewEvent.Fid fid, com.datadog.android.rum.model.ViewEvent.Inp inp, com.datadog.android.rum.model.ViewEvent.Lcp lcp, com.datadog.android.rum.model.ViewEvent.Fbc fbc) {
            this.cls = performanceCls;
            this.fcp = fcp;
            this.fid = fid;
            this.inp = inp;
            this.lcp = lcp;
            this.fbc = fbc;
        }

        public /* synthetic */ Performance(com.datadog.android.rum.model.ViewEvent.PerformanceCls performanceCls, com.datadog.android.rum.model.ViewEvent.Fcp fcp, com.datadog.android.rum.model.ViewEvent.Fid fid, com.datadog.android.rum.model.ViewEvent.Inp inp, com.datadog.android.rum.model.ViewEvent.Lcp lcp, com.datadog.android.rum.model.ViewEvent.Fbc fbc, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : performanceCls, (i & 2) != 0 ? null : fcp, (i & 4) != 0 ? null : fid, (i & 8) != 0 ? null : inp, (i & 16) != 0 ? null : lcp, (i & 32) != 0 ? null : fbc);
        }

        public final com.datadog.android.rum.model.ViewEvent.PerformanceCls getCls() {
            return this.cls;
        }

        public final com.datadog.android.rum.model.ViewEvent.Fcp getFcp() {
            return this.fcp;
        }

        public final com.datadog.android.rum.model.ViewEvent.Fid getFid() {
            return this.fid;
        }

        public final com.datadog.android.rum.model.ViewEvent.Inp getInp() {
            return this.inp;
        }

        public final com.datadog.android.rum.model.ViewEvent.Lcp getLcp() {
            return this.lcp;
        }

        public final com.datadog.android.rum.model.ViewEvent.Fbc getFbc() {
            return this.fbc;
        }

        public final com.google.gson.JsonElement toJson() {
            com.google.gson.JsonObject jsonObject = new com.google.gson.JsonObject();
            com.datadog.android.rum.model.ViewEvent.PerformanceCls performanceCls = this.cls;
            if (performanceCls != null) {
                jsonObject.add("cls", performanceCls.toJson());
            }
            com.datadog.android.rum.model.ViewEvent.Fcp fcp = this.fcp;
            if (fcp != null) {
                jsonObject.add("fcp", fcp.toJson());
            }
            com.datadog.android.rum.model.ViewEvent.Fid fid = this.fid;
            if (fid != null) {
                jsonObject.add("fid", fid.toJson());
            }
            com.datadog.android.rum.model.ViewEvent.Inp inp = this.inp;
            if (inp != null) {
                jsonObject.add("inp", inp.toJson());
            }
            com.datadog.android.rum.model.ViewEvent.Lcp lcp = this.lcp;
            if (lcp != null) {
                jsonObject.add("lcp", lcp.toJson());
            }
            com.datadog.android.rum.model.ViewEvent.Fbc fbc = this.fbc;
            if (fbc != null) {
                jsonObject.add("fbc", fbc.toJson());
            }
            return jsonObject;
        }

        @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/datadog/android/rum/model/ViewEvent$Performance$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/rum/model/ViewEvent$Performance;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/rum/model/ViewEvent$Performance;", "Lcom/google/gson/JsonObject;", "jsonObject", "fromJsonObject", "(Lcom/google/gson/JsonObject;)Lcom/datadog/android/rum/model/ViewEvent$Performance;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @kotlin.jvm.JvmStatic
            public final com.datadog.android.rum.model.ViewEvent.Performance fromJson(java.lang.String jsonString) throws com.google.gson.JsonParseException {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonString, "");
                try {
                    com.google.gson.JsonObject asJsonObject = com.google.gson.JsonParser.parseString(jsonString).getAsJsonObject();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asJsonObject, "");
                    return fromJsonObject(asJsonObject);
                } catch (java.lang.IllegalStateException e) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type Performance", e);
                }
            }

            @kotlin.jvm.JvmStatic
            public final com.datadog.android.rum.model.ViewEvent.Performance fromJsonObject(com.google.gson.JsonObject jsonObject) throws com.google.gson.JsonParseException {
                com.google.gson.JsonObject asJsonObject;
                com.google.gson.JsonObject asJsonObject2;
                com.google.gson.JsonObject asJsonObject3;
                com.google.gson.JsonObject asJsonObject4;
                com.google.gson.JsonObject asJsonObject5;
                com.google.gson.JsonObject asJsonObject6;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonObject, "");
                try {
                    com.google.gson.JsonElement jsonElement = jsonObject.get("cls");
                    com.datadog.android.rum.model.ViewEvent.Fbc fbc = null;
                    com.datadog.android.rum.model.ViewEvent.PerformanceCls fromJsonObject = (jsonElement == null || (asJsonObject6 = jsonElement.getAsJsonObject()) == null) ? null : com.datadog.android.rum.model.ViewEvent.PerformanceCls.INSTANCE.fromJsonObject(asJsonObject6);
                    com.google.gson.JsonElement jsonElement2 = jsonObject.get("fcp");
                    com.datadog.android.rum.model.ViewEvent.Fcp fromJsonObject2 = (jsonElement2 == null || (asJsonObject5 = jsonElement2.getAsJsonObject()) == null) ? null : com.datadog.android.rum.model.ViewEvent.Fcp.INSTANCE.fromJsonObject(asJsonObject5);
                    com.google.gson.JsonElement jsonElement3 = jsonObject.get("fid");
                    com.datadog.android.rum.model.ViewEvent.Fid fromJsonObject3 = (jsonElement3 == null || (asJsonObject4 = jsonElement3.getAsJsonObject()) == null) ? null : com.datadog.android.rum.model.ViewEvent.Fid.INSTANCE.fromJsonObject(asJsonObject4);
                    com.google.gson.JsonElement jsonElement4 = jsonObject.get("inp");
                    com.datadog.android.rum.model.ViewEvent.Inp fromJsonObject4 = (jsonElement4 == null || (asJsonObject3 = jsonElement4.getAsJsonObject()) == null) ? null : com.datadog.android.rum.model.ViewEvent.Inp.INSTANCE.fromJsonObject(asJsonObject3);
                    com.google.gson.JsonElement jsonElement5 = jsonObject.get("lcp");
                    com.datadog.android.rum.model.ViewEvent.Lcp fromJsonObject5 = (jsonElement5 == null || (asJsonObject2 = jsonElement5.getAsJsonObject()) == null) ? null : com.datadog.android.rum.model.ViewEvent.Lcp.INSTANCE.fromJsonObject(asJsonObject2);
                    com.google.gson.JsonElement jsonElement6 = jsonObject.get("fbc");
                    if (jsonElement6 != null && (asJsonObject = jsonElement6.getAsJsonObject()) != null) {
                        fbc = com.datadog.android.rum.model.ViewEvent.Fbc.INSTANCE.fromJsonObject(asJsonObject);
                    }
                    return new com.datadog.android.rum.model.ViewEvent.Performance(fromJsonObject, fromJsonObject2, fromJsonObject3, fromJsonObject4, fromJsonObject5, fbc);
                } catch (java.lang.IllegalStateException e) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type Performance", e);
                } catch (java.lang.NullPointerException e2) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type Performance", e2);
                } catch (java.lang.NumberFormatException e3) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type Performance", e3);
                }
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public final java.lang.String toString() {
            com.datadog.android.rum.model.ViewEvent.PerformanceCls performanceCls = this.cls;
            com.datadog.android.rum.model.ViewEvent.Fcp fcp = this.fcp;
            com.datadog.android.rum.model.ViewEvent.Fid fid = this.fid;
            com.datadog.android.rum.model.ViewEvent.Inp inp = this.inp;
            com.datadog.android.rum.model.ViewEvent.Lcp lcp = this.lcp;
            com.datadog.android.rum.model.ViewEvent.Fbc fbc = this.fbc;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Performance(cls=");
            sb.append(performanceCls);
            sb.append(", fcp=");
            sb.append(fcp);
            sb.append(", fid=");
            sb.append(fid);
            sb.append(", inp=");
            sb.append(inp);
            sb.append(", lcp=");
            sb.append(lcp);
            sb.append(", fbc=");
            sb.append(fbc);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            com.datadog.android.rum.model.ViewEvent.PerformanceCls performanceCls = this.cls;
            int hashCode = performanceCls == null ? 0 : performanceCls.hashCode();
            com.datadog.android.rum.model.ViewEvent.Fcp fcp = this.fcp;
            int hashCode2 = fcp == null ? 0 : fcp.hashCode();
            com.datadog.android.rum.model.ViewEvent.Fid fid = this.fid;
            int hashCode3 = fid == null ? 0 : fid.hashCode();
            com.datadog.android.rum.model.ViewEvent.Inp inp = this.inp;
            int hashCode4 = inp == null ? 0 : inp.hashCode();
            com.datadog.android.rum.model.ViewEvent.Lcp lcp = this.lcp;
            int hashCode5 = lcp == null ? 0 : lcp.hashCode();
            com.datadog.android.rum.model.ViewEvent.Fbc fbc = this.fbc;
            return (((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + (fbc != null ? fbc.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.datadog.android.rum.model.ViewEvent.Performance)) {
                return false;
            }
            com.datadog.android.rum.model.ViewEvent.Performance performance = (com.datadog.android.rum.model.ViewEvent.Performance) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.cls, performance.cls) && kotlin.jvm.internal.Intrinsics.areEqual(this.fcp, performance.fcp) && kotlin.jvm.internal.Intrinsics.areEqual(this.fid, performance.fid) && kotlin.jvm.internal.Intrinsics.areEqual(this.inp, performance.inp) && kotlin.jvm.internal.Intrinsics.areEqual(this.lcp, performance.lcp) && kotlin.jvm.internal.Intrinsics.areEqual(this.fbc, performance.fbc);
        }

        public final com.datadog.android.rum.model.ViewEvent.Performance copy(com.datadog.android.rum.model.ViewEvent.PerformanceCls cls, com.datadog.android.rum.model.ViewEvent.Fcp fcp, com.datadog.android.rum.model.ViewEvent.Fid fid, com.datadog.android.rum.model.ViewEvent.Inp inp, com.datadog.android.rum.model.ViewEvent.Lcp lcp, com.datadog.android.rum.model.ViewEvent.Fbc fbc) {
            return new com.datadog.android.rum.model.ViewEvent.Performance(cls, fcp, fid, inp, lcp, fbc);
        }

        /* renamed from: component6, reason: from getter */
        public final com.datadog.android.rum.model.ViewEvent.Fbc getFbc() {
            return this.fbc;
        }

        /* renamed from: component5, reason: from getter */
        public final com.datadog.android.rum.model.ViewEvent.Lcp getLcp() {
            return this.lcp;
        }

        /* renamed from: component4, reason: from getter */
        public final com.datadog.android.rum.model.ViewEvent.Inp getInp() {
            return this.inp;
        }

        /* renamed from: component3, reason: from getter */
        public final com.datadog.android.rum.model.ViewEvent.Fid getFid() {
            return this.fid;
        }

        /* renamed from: component2, reason: from getter */
        public final com.datadog.android.rum.model.ViewEvent.Fcp getFcp() {
            return this.fcp;
        }

        /* renamed from: component1, reason: from getter */
        public final com.datadog.android.rum.model.ViewEvent.PerformanceCls getCls() {
            return this.cls;
        }

        @kotlin.jvm.JvmStatic
        public static final com.datadog.android.rum.model.ViewEvent.Performance fromJsonObject(com.google.gson.JsonObject jsonObject) throws com.google.gson.JsonParseException {
            return INSTANCE.fromJsonObject(jsonObject);
        }

        @kotlin.jvm.JvmStatic
        public static final com.datadog.android.rum.model.ViewEvent.Performance fromJson(java.lang.String str) throws com.google.gson.JsonParseException {
            return INSTANCE.fromJson(str);
        }

        public static /* synthetic */ com.datadog.android.rum.model.ViewEvent.Performance copy$default(com.datadog.android.rum.model.ViewEvent.Performance performance, com.datadog.android.rum.model.ViewEvent.PerformanceCls performanceCls, com.datadog.android.rum.model.ViewEvent.Fcp fcp, com.datadog.android.rum.model.ViewEvent.Fid fid, com.datadog.android.rum.model.ViewEvent.Inp inp, com.datadog.android.rum.model.ViewEvent.Lcp lcp, com.datadog.android.rum.model.ViewEvent.Fbc fbc, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                performanceCls = performance.cls;
            }
            if ((i & 2) != 0) {
                fcp = performance.fcp;
            }
            com.datadog.android.rum.model.ViewEvent.Fcp fcp2 = fcp;
            if ((i & 4) != 0) {
                fid = performance.fid;
            }
            com.datadog.android.rum.model.ViewEvent.Fid fid2 = fid;
            if ((i & 8) != 0) {
                inp = performance.inp;
            }
            com.datadog.android.rum.model.ViewEvent.Inp inp2 = inp;
            if ((i & 16) != 0) {
                lcp = performance.lcp;
            }
            com.datadog.android.rum.model.ViewEvent.Lcp lcp2 = lcp;
            if ((i & 32) != 0) {
                fbc = performance.fbc;
            }
            return performance.copy(performanceCls, fcp2, fid2, inp2, lcp2, fbc);
        }

        public Performance() {
            this(null, null, null, null, null, null, 63, null);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b4\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001c\b\u0086\b\u0018\u0000 X2\u00020\u0001:\u0001XB\u008f\u0002\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b \u0010\u001fJ\u0012\u0010!\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b!\u0010\u001fJ\u0012\u0010\"\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\"\u0010\u001fJ\u0012\u0010#\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b#\u0010\u001fJ\u0012\u0010$\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b$\u0010\u001fJ\u0012\u0010%\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b%\u0010\u001fJ\u0012\u0010&\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b&\u0010\u001fJ\u0012\u0010'\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b'\u0010\u001fJ\u0012\u0010(\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b(\u0010\u001fJ\u0012\u0010)\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b)\u0010\u001fJ\u0012\u0010*\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b*\u0010\u001fJ\u0012\u0010+\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b+\u0010\u001fJ\u0012\u0010,\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b,\u0010\u001fJ\u0012\u0010-\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b-\u0010\u001fJ\u0012\u0010.\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b.\u0010\u001fJ\u0012\u0010/\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b/\u0010\u001fJ\u0012\u00100\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b0\u0010\u001fJ\u0012\u00101\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b1\u0010\u001fJ\u0012\u00102\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b2\u0010\u001fJ\u0012\u00103\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b3\u0010\u001fJ\u0098\u0002\u00104\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b4\u00105J\u001a\u00107\u001a\u00020\u00042\b\u00106\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b7\u00108J\u0010\u0010:\u001a\u000209HÖ\u0001¢\u0006\u0004\b:\u0010;J\r\u0010=\u001a\u00020<¢\u0006\u0004\b=\u0010>J\u0010\u0010?\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b?\u0010\u001dR\u0019\u0010\f\u001a\u0004\u0018\u00010\u00048\u0007¢\u0006\f\n\u0004\b\f\u0010@\u001a\u0004\bA\u0010\u001fR\u001c\u0010\r\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010@\u001a\u0004\bB\u0010\u001fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010@\u001a\u0004\bC\u0010\u001fR\u001c\u0010\t\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010@\u001a\u0004\bD\u0010\u001fR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010@\u001a\u0004\bE\u0010\u001fR\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010@\u001a\u0004\bF\u0010\u001fR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010@\u001a\u0004\bG\u0010\u001fR\u001c\u0010\n\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010@\u001a\u0004\bH\u0010\u001fR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010@\u001a\u0004\bI\u0010\u001fR\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010@\u001a\u0004\bJ\u0010\u001fR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010@\u001a\u0004\bK\u0010\u001fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010@\u001a\u0004\bL\u0010\u001fR\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010@\u001a\u0004\bM\u0010\u001fR\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010@\u001a\u0004\bN\u0010\u001fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010@\u001a\u0004\bO\u0010\u001fR\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010@\u001a\u0004\bP\u0010\u001fR\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010@\u001a\u0004\bQ\u0010\u001fR\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010@\u001a\u0004\bR\u0010\u001fR\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010@\u001a\u0004\bS\u0010\u001fR\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010@\u001a\u0004\bT\u0010\u001fR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010U\u001a\u0004\bV\u0010\u001dR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010@\u001a\u0004\bW\u0010\u001f"}, d2 = {"Lcom/datadog/android/rum/model/ViewEvent$Accessibility;", "", "", "textSize", "", "screenReaderEnabled", "boldTextEnabled", "reduceTransparencyEnabled", "reduceMotionEnabled", "buttonShapesEnabled", "invertColorsEnabled", "increaseContrastEnabled", "assistiveSwitchEnabled", "assistiveTouchEnabled", "videoAutoplayEnabled", "closedCaptioningEnabled", "monoAudioEnabled", "shakeToUndoEnabled", "reducedAnimationsEnabled", "shouldDifferentiateWithoutColor", "grayscaleEnabled", "singleAppModeEnabled", "onOffSwitchLabelsEnabled", "speakScreenEnabled", "speakSelectionEnabled", "rtlEnabled", "<init>", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "component1", "()Ljava/lang/String;", "component10", "()Ljava/lang/Boolean;", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)Lcom/datadog/android/rum/model/ViewEvent$Accessibility;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lcom/google/gson/JsonElement;", "toJson", "()Lcom/google/gson/JsonElement;", "toString", "Ljava/lang/Boolean;", "getAssistiveSwitchEnabled", "getAssistiveTouchEnabled", "getBoldTextEnabled", "getButtonShapesEnabled", "getClosedCaptioningEnabled", "getGrayscaleEnabled", "getIncreaseContrastEnabled", "getInvertColorsEnabled", "getMonoAudioEnabled", "getOnOffSwitchLabelsEnabled", "getReduceMotionEnabled", "getReduceTransparencyEnabled", "getReducedAnimationsEnabled", "getRtlEnabled", "getScreenReaderEnabled", "getShakeToUndoEnabled", "getShouldDifferentiateWithoutColor", "getSingleAppModeEnabled", "getSpeakScreenEnabled", "getSpeakSelectionEnabled", "Ljava/lang/String;", "getTextSize", "getVideoAutoplayEnabled", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class Accessibility {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.datadog.android.rum.model.ViewEvent.Accessibility.Companion INSTANCE = new com.datadog.android.rum.model.ViewEvent.Accessibility.Companion(null);
        private final java.lang.Boolean assistiveSwitchEnabled;
        private final java.lang.Boolean assistiveTouchEnabled;
        private final java.lang.Boolean boldTextEnabled;
        private final java.lang.Boolean buttonShapesEnabled;
        private final java.lang.Boolean closedCaptioningEnabled;
        private final java.lang.Boolean grayscaleEnabled;
        private final java.lang.Boolean increaseContrastEnabled;
        private final java.lang.Boolean invertColorsEnabled;
        private final java.lang.Boolean monoAudioEnabled;
        private final java.lang.Boolean onOffSwitchLabelsEnabled;
        private final java.lang.Boolean reduceMotionEnabled;
        private final java.lang.Boolean reduceTransparencyEnabled;
        private final java.lang.Boolean reducedAnimationsEnabled;
        private final java.lang.Boolean rtlEnabled;
        private final java.lang.Boolean screenReaderEnabled;
        private final java.lang.Boolean shakeToUndoEnabled;
        private final java.lang.Boolean shouldDifferentiateWithoutColor;
        private final java.lang.Boolean singleAppModeEnabled;
        private final java.lang.Boolean speakScreenEnabled;
        private final java.lang.Boolean speakSelectionEnabled;
        private final java.lang.String textSize;
        private final java.lang.Boolean videoAutoplayEnabled;

        public Accessibility(java.lang.String str, java.lang.Boolean bool, java.lang.Boolean bool2, java.lang.Boolean bool3, java.lang.Boolean bool4, java.lang.Boolean bool5, java.lang.Boolean bool6, java.lang.Boolean bool7, java.lang.Boolean bool8, java.lang.Boolean bool9, java.lang.Boolean bool10, java.lang.Boolean bool11, java.lang.Boolean bool12, java.lang.Boolean bool13, java.lang.Boolean bool14, java.lang.Boolean bool15, java.lang.Boolean bool16, java.lang.Boolean bool17, java.lang.Boolean bool18, java.lang.Boolean bool19, java.lang.Boolean bool20, java.lang.Boolean bool21) {
            this.textSize = str;
            this.screenReaderEnabled = bool;
            this.boldTextEnabled = bool2;
            this.reduceTransparencyEnabled = bool3;
            this.reduceMotionEnabled = bool4;
            this.buttonShapesEnabled = bool5;
            this.invertColorsEnabled = bool6;
            this.increaseContrastEnabled = bool7;
            this.assistiveSwitchEnabled = bool8;
            this.assistiveTouchEnabled = bool9;
            this.videoAutoplayEnabled = bool10;
            this.closedCaptioningEnabled = bool11;
            this.monoAudioEnabled = bool12;
            this.shakeToUndoEnabled = bool13;
            this.reducedAnimationsEnabled = bool14;
            this.shouldDifferentiateWithoutColor = bool15;
            this.grayscaleEnabled = bool16;
            this.singleAppModeEnabled = bool17;
            this.onOffSwitchLabelsEnabled = bool18;
            this.speakScreenEnabled = bool19;
            this.speakSelectionEnabled = bool20;
            this.rtlEnabled = bool21;
        }

        public /* synthetic */ Accessibility(java.lang.String str, java.lang.Boolean bool, java.lang.Boolean bool2, java.lang.Boolean bool3, java.lang.Boolean bool4, java.lang.Boolean bool5, java.lang.Boolean bool6, java.lang.Boolean bool7, java.lang.Boolean bool8, java.lang.Boolean bool9, java.lang.Boolean bool10, java.lang.Boolean bool11, java.lang.Boolean bool12, java.lang.Boolean bool13, java.lang.Boolean bool14, java.lang.Boolean bool15, java.lang.Boolean bool16, java.lang.Boolean bool17, java.lang.Boolean bool18, java.lang.Boolean bool19, java.lang.Boolean bool20, java.lang.Boolean bool21, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : bool, (i & 4) != 0 ? null : bool2, (i & 8) != 0 ? null : bool3, (i & 16) != 0 ? null : bool4, (i & 32) != 0 ? null : bool5, (i & 64) != 0 ? null : bool6, (i & 128) != 0 ? null : bool7, (i & 256) != 0 ? null : bool8, (i & 512) != 0 ? null : bool9, (i & 1024) != 0 ? null : bool10, (i & 2048) != 0 ? null : bool11, (i & 4096) != 0 ? null : bool12, (i & 8192) != 0 ? null : bool13, (i & 16384) != 0 ? null : bool14, (i & 32768) != 0 ? null : bool15, (i & 65536) != 0 ? null : bool16, (i & 131072) != 0 ? null : bool17, (i & 262144) != 0 ? null : bool18, (i & 524288) != 0 ? null : bool19, (i & 1048576) != 0 ? null : bool20, (i & 2097152) != 0 ? null : bool21);
        }

        public final java.lang.String getTextSize() {
            return this.textSize;
        }

        public final java.lang.Boolean getScreenReaderEnabled() {
            return this.screenReaderEnabled;
        }

        public final java.lang.Boolean getBoldTextEnabled() {
            return this.boldTextEnabled;
        }

        public final java.lang.Boolean getReduceTransparencyEnabled() {
            return this.reduceTransparencyEnabled;
        }

        public final java.lang.Boolean getReduceMotionEnabled() {
            return this.reduceMotionEnabled;
        }

        public final java.lang.Boolean getButtonShapesEnabled() {
            return this.buttonShapesEnabled;
        }

        public final java.lang.Boolean getInvertColorsEnabled() {
            return this.invertColorsEnabled;
        }

        public final java.lang.Boolean getIncreaseContrastEnabled() {
            return this.increaseContrastEnabled;
        }

        public final java.lang.Boolean getAssistiveSwitchEnabled() {
            return this.assistiveSwitchEnabled;
        }

        public final java.lang.Boolean getAssistiveTouchEnabled() {
            return this.assistiveTouchEnabled;
        }

        public final java.lang.Boolean getVideoAutoplayEnabled() {
            return this.videoAutoplayEnabled;
        }

        public final java.lang.Boolean getClosedCaptioningEnabled() {
            return this.closedCaptioningEnabled;
        }

        public final java.lang.Boolean getMonoAudioEnabled() {
            return this.monoAudioEnabled;
        }

        public final java.lang.Boolean getShakeToUndoEnabled() {
            return this.shakeToUndoEnabled;
        }

        public final java.lang.Boolean getReducedAnimationsEnabled() {
            return this.reducedAnimationsEnabled;
        }

        public final java.lang.Boolean getShouldDifferentiateWithoutColor() {
            return this.shouldDifferentiateWithoutColor;
        }

        public final java.lang.Boolean getGrayscaleEnabled() {
            return this.grayscaleEnabled;
        }

        public final java.lang.Boolean getSingleAppModeEnabled() {
            return this.singleAppModeEnabled;
        }

        public final java.lang.Boolean getOnOffSwitchLabelsEnabled() {
            return this.onOffSwitchLabelsEnabled;
        }

        public final java.lang.Boolean getSpeakScreenEnabled() {
            return this.speakScreenEnabled;
        }

        public final java.lang.Boolean getSpeakSelectionEnabled() {
            return this.speakSelectionEnabled;
        }

        public final java.lang.Boolean getRtlEnabled() {
            return this.rtlEnabled;
        }

        public final com.google.gson.JsonElement toJson() {
            com.google.gson.JsonObject jsonObject = new com.google.gson.JsonObject();
            java.lang.String str = this.textSize;
            if (str != null) {
                jsonObject.addProperty("text_size", str);
            }
            java.lang.Boolean bool = this.screenReaderEnabled;
            if (bool != null) {
                jsonObject.addProperty("screen_reader_enabled", java.lang.Boolean.valueOf(bool.booleanValue()));
            }
            java.lang.Boolean bool2 = this.boldTextEnabled;
            if (bool2 != null) {
                jsonObject.addProperty("bold_text_enabled", java.lang.Boolean.valueOf(bool2.booleanValue()));
            }
            java.lang.Boolean bool3 = this.reduceTransparencyEnabled;
            if (bool3 != null) {
                jsonObject.addProperty("reduce_transparency_enabled", java.lang.Boolean.valueOf(bool3.booleanValue()));
            }
            java.lang.Boolean bool4 = this.reduceMotionEnabled;
            if (bool4 != null) {
                jsonObject.addProperty("reduce_motion_enabled", java.lang.Boolean.valueOf(bool4.booleanValue()));
            }
            java.lang.Boolean bool5 = this.buttonShapesEnabled;
            if (bool5 != null) {
                jsonObject.addProperty("button_shapes_enabled", java.lang.Boolean.valueOf(bool5.booleanValue()));
            }
            java.lang.Boolean bool6 = this.invertColorsEnabled;
            if (bool6 != null) {
                jsonObject.addProperty("invert_colors_enabled", java.lang.Boolean.valueOf(bool6.booleanValue()));
            }
            java.lang.Boolean bool7 = this.increaseContrastEnabled;
            if (bool7 != null) {
                jsonObject.addProperty("increase_contrast_enabled", java.lang.Boolean.valueOf(bool7.booleanValue()));
            }
            java.lang.Boolean bool8 = this.assistiveSwitchEnabled;
            if (bool8 != null) {
                jsonObject.addProperty("assistive_switch_enabled", java.lang.Boolean.valueOf(bool8.booleanValue()));
            }
            java.lang.Boolean bool9 = this.assistiveTouchEnabled;
            if (bool9 != null) {
                jsonObject.addProperty("assistive_touch_enabled", java.lang.Boolean.valueOf(bool9.booleanValue()));
            }
            java.lang.Boolean bool10 = this.videoAutoplayEnabled;
            if (bool10 != null) {
                jsonObject.addProperty("video_autoplay_enabled", java.lang.Boolean.valueOf(bool10.booleanValue()));
            }
            java.lang.Boolean bool11 = this.closedCaptioningEnabled;
            if (bool11 != null) {
                jsonObject.addProperty("closed_captioning_enabled", java.lang.Boolean.valueOf(bool11.booleanValue()));
            }
            java.lang.Boolean bool12 = this.monoAudioEnabled;
            if (bool12 != null) {
                jsonObject.addProperty("mono_audio_enabled", java.lang.Boolean.valueOf(bool12.booleanValue()));
            }
            java.lang.Boolean bool13 = this.shakeToUndoEnabled;
            if (bool13 != null) {
                jsonObject.addProperty("shake_to_undo_enabled", java.lang.Boolean.valueOf(bool13.booleanValue()));
            }
            java.lang.Boolean bool14 = this.reducedAnimationsEnabled;
            if (bool14 != null) {
                jsonObject.addProperty("reduced_animations_enabled", java.lang.Boolean.valueOf(bool14.booleanValue()));
            }
            java.lang.Boolean bool15 = this.shouldDifferentiateWithoutColor;
            if (bool15 != null) {
                jsonObject.addProperty("should_differentiate_without_color", java.lang.Boolean.valueOf(bool15.booleanValue()));
            }
            java.lang.Boolean bool16 = this.grayscaleEnabled;
            if (bool16 != null) {
                jsonObject.addProperty("grayscale_enabled", java.lang.Boolean.valueOf(bool16.booleanValue()));
            }
            java.lang.Boolean bool17 = this.singleAppModeEnabled;
            if (bool17 != null) {
                jsonObject.addProperty("single_app_mode_enabled", java.lang.Boolean.valueOf(bool17.booleanValue()));
            }
            java.lang.Boolean bool18 = this.onOffSwitchLabelsEnabled;
            if (bool18 != null) {
                jsonObject.addProperty("on_off_switch_labels_enabled", java.lang.Boolean.valueOf(bool18.booleanValue()));
            }
            java.lang.Boolean bool19 = this.speakScreenEnabled;
            if (bool19 != null) {
                jsonObject.addProperty("speak_screen_enabled", java.lang.Boolean.valueOf(bool19.booleanValue()));
            }
            java.lang.Boolean bool20 = this.speakSelectionEnabled;
            if (bool20 != null) {
                jsonObject.addProperty("speak_selection_enabled", java.lang.Boolean.valueOf(bool20.booleanValue()));
            }
            java.lang.Boolean bool21 = this.rtlEnabled;
            if (bool21 != null) {
                jsonObject.addProperty("rtl_enabled", java.lang.Boolean.valueOf(bool21.booleanValue()));
            }
            return jsonObject;
        }

        @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/datadog/android/rum/model/ViewEvent$Accessibility$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/rum/model/ViewEvent$Accessibility;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/rum/model/ViewEvent$Accessibility;", "Lcom/google/gson/JsonObject;", "jsonObject", "fromJsonObject", "(Lcom/google/gson/JsonObject;)Lcom/datadog/android/rum/model/ViewEvent$Accessibility;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @kotlin.jvm.JvmStatic
            public final com.datadog.android.rum.model.ViewEvent.Accessibility fromJson(java.lang.String jsonString) throws com.google.gson.JsonParseException {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonString, "");
                try {
                    com.google.gson.JsonObject asJsonObject = com.google.gson.JsonParser.parseString(jsonString).getAsJsonObject();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asJsonObject, "");
                    return fromJsonObject(asJsonObject);
                } catch (java.lang.IllegalStateException e) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type Accessibility", e);
                }
            }

            @kotlin.jvm.JvmStatic
            public final com.datadog.android.rum.model.ViewEvent.Accessibility fromJsonObject(com.google.gson.JsonObject jsonObject) throws com.google.gson.JsonParseException {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonObject, "");
                try {
                    com.google.gson.JsonElement jsonElement = jsonObject.get("text_size");
                    java.lang.String asString = jsonElement != null ? jsonElement.getAsString() : null;
                    com.google.gson.JsonElement jsonElement2 = jsonObject.get("screen_reader_enabled");
                    java.lang.Boolean valueOf = jsonElement2 != null ? java.lang.Boolean.valueOf(jsonElement2.getAsBoolean()) : null;
                    com.google.gson.JsonElement jsonElement3 = jsonObject.get("bold_text_enabled");
                    java.lang.Boolean valueOf2 = jsonElement3 != null ? java.lang.Boolean.valueOf(jsonElement3.getAsBoolean()) : null;
                    com.google.gson.JsonElement jsonElement4 = jsonObject.get("reduce_transparency_enabled");
                    java.lang.Boolean valueOf3 = jsonElement4 != null ? java.lang.Boolean.valueOf(jsonElement4.getAsBoolean()) : null;
                    com.google.gson.JsonElement jsonElement5 = jsonObject.get("reduce_motion_enabled");
                    java.lang.Boolean valueOf4 = jsonElement5 != null ? java.lang.Boolean.valueOf(jsonElement5.getAsBoolean()) : null;
                    com.google.gson.JsonElement jsonElement6 = jsonObject.get("button_shapes_enabled");
                    java.lang.Boolean valueOf5 = jsonElement6 != null ? java.lang.Boolean.valueOf(jsonElement6.getAsBoolean()) : null;
                    com.google.gson.JsonElement jsonElement7 = jsonObject.get("invert_colors_enabled");
                    java.lang.Boolean valueOf6 = jsonElement7 != null ? java.lang.Boolean.valueOf(jsonElement7.getAsBoolean()) : null;
                    com.google.gson.JsonElement jsonElement8 = jsonObject.get("increase_contrast_enabled");
                    java.lang.Boolean valueOf7 = jsonElement8 != null ? java.lang.Boolean.valueOf(jsonElement8.getAsBoolean()) : null;
                    com.google.gson.JsonElement jsonElement9 = jsonObject.get("assistive_switch_enabled");
                    java.lang.Boolean valueOf8 = jsonElement9 != null ? java.lang.Boolean.valueOf(jsonElement9.getAsBoolean()) : null;
                    com.google.gson.JsonElement jsonElement10 = jsonObject.get("assistive_touch_enabled");
                    java.lang.Boolean valueOf9 = jsonElement10 != null ? java.lang.Boolean.valueOf(jsonElement10.getAsBoolean()) : null;
                    com.google.gson.JsonElement jsonElement11 = jsonObject.get("video_autoplay_enabled");
                    java.lang.Boolean valueOf10 = jsonElement11 != null ? java.lang.Boolean.valueOf(jsonElement11.getAsBoolean()) : null;
                    com.google.gson.JsonElement jsonElement12 = jsonObject.get("closed_captioning_enabled");
                    java.lang.Boolean valueOf11 = jsonElement12 != null ? java.lang.Boolean.valueOf(jsonElement12.getAsBoolean()) : null;
                    com.google.gson.JsonElement jsonElement13 = jsonObject.get("mono_audio_enabled");
                    java.lang.Boolean valueOf12 = jsonElement13 != null ? java.lang.Boolean.valueOf(jsonElement13.getAsBoolean()) : null;
                    com.google.gson.JsonElement jsonElement14 = jsonObject.get("shake_to_undo_enabled");
                    java.lang.Boolean valueOf13 = jsonElement14 != null ? java.lang.Boolean.valueOf(jsonElement14.getAsBoolean()) : null;
                    com.google.gson.JsonElement jsonElement15 = jsonObject.get("reduced_animations_enabled");
                    java.lang.Boolean valueOf14 = jsonElement15 != null ? java.lang.Boolean.valueOf(jsonElement15.getAsBoolean()) : null;
                    com.google.gson.JsonElement jsonElement16 = jsonObject.get("should_differentiate_without_color");
                    java.lang.Boolean valueOf15 = jsonElement16 != null ? java.lang.Boolean.valueOf(jsonElement16.getAsBoolean()) : null;
                    com.google.gson.JsonElement jsonElement17 = jsonObject.get("grayscale_enabled");
                    java.lang.Boolean valueOf16 = jsonElement17 != null ? java.lang.Boolean.valueOf(jsonElement17.getAsBoolean()) : null;
                    com.google.gson.JsonElement jsonElement18 = jsonObject.get("single_app_mode_enabled");
                    java.lang.Boolean valueOf17 = jsonElement18 != null ? java.lang.Boolean.valueOf(jsonElement18.getAsBoolean()) : null;
                    com.google.gson.JsonElement jsonElement19 = jsonObject.get("on_off_switch_labels_enabled");
                    java.lang.Boolean valueOf18 = jsonElement19 != null ? java.lang.Boolean.valueOf(jsonElement19.getAsBoolean()) : null;
                    com.google.gson.JsonElement jsonElement20 = jsonObject.get("speak_screen_enabled");
                    java.lang.Boolean valueOf19 = jsonElement20 != null ? java.lang.Boolean.valueOf(jsonElement20.getAsBoolean()) : null;
                    com.google.gson.JsonElement jsonElement21 = jsonObject.get("speak_selection_enabled");
                    java.lang.Boolean valueOf20 = jsonElement21 != null ? java.lang.Boolean.valueOf(jsonElement21.getAsBoolean()) : null;
                    com.google.gson.JsonElement jsonElement22 = jsonObject.get("rtl_enabled");
                    return new com.datadog.android.rum.model.ViewEvent.Accessibility(asString, valueOf, valueOf2, valueOf3, valueOf4, valueOf5, valueOf6, valueOf7, valueOf8, valueOf9, valueOf10, valueOf11, valueOf12, valueOf13, valueOf14, valueOf15, valueOf16, valueOf17, valueOf18, valueOf19, valueOf20, jsonElement22 != null ? java.lang.Boolean.valueOf(jsonElement22.getAsBoolean()) : null);
                } catch (java.lang.IllegalStateException e) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type Accessibility", e);
                } catch (java.lang.NullPointerException e2) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type Accessibility", e2);
                } catch (java.lang.NumberFormatException e3) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type Accessibility", e3);
                }
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public final java.lang.String toString() {
            java.lang.String str = this.textSize;
            java.lang.Boolean bool = this.screenReaderEnabled;
            java.lang.Boolean bool2 = this.boldTextEnabled;
            java.lang.Boolean bool3 = this.reduceTransparencyEnabled;
            java.lang.Boolean bool4 = this.reduceMotionEnabled;
            java.lang.Boolean bool5 = this.buttonShapesEnabled;
            java.lang.Boolean bool6 = this.invertColorsEnabled;
            java.lang.Boolean bool7 = this.increaseContrastEnabled;
            java.lang.Boolean bool8 = this.assistiveSwitchEnabled;
            java.lang.Boolean bool9 = this.assistiveTouchEnabled;
            java.lang.Boolean bool10 = this.videoAutoplayEnabled;
            java.lang.Boolean bool11 = this.closedCaptioningEnabled;
            java.lang.Boolean bool12 = this.monoAudioEnabled;
            java.lang.Boolean bool13 = this.shakeToUndoEnabled;
            java.lang.Boolean bool14 = this.reducedAnimationsEnabled;
            java.lang.Boolean bool15 = this.shouldDifferentiateWithoutColor;
            java.lang.Boolean bool16 = this.grayscaleEnabled;
            java.lang.Boolean bool17 = this.singleAppModeEnabled;
            java.lang.Boolean bool18 = this.onOffSwitchLabelsEnabled;
            java.lang.Boolean bool19 = this.speakScreenEnabled;
            java.lang.Boolean bool20 = this.speakSelectionEnabled;
            java.lang.Boolean bool21 = this.rtlEnabled;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Accessibility(textSize=");
            sb.append(str);
            sb.append(", screenReaderEnabled=");
            sb.append(bool);
            sb.append(", boldTextEnabled=");
            sb.append(bool2);
            sb.append(", reduceTransparencyEnabled=");
            sb.append(bool3);
            sb.append(", reduceMotionEnabled=");
            sb.append(bool4);
            sb.append(", buttonShapesEnabled=");
            sb.append(bool5);
            sb.append(", invertColorsEnabled=");
            sb.append(bool6);
            sb.append(", increaseContrastEnabled=");
            sb.append(bool7);
            sb.append(", assistiveSwitchEnabled=");
            sb.append(bool8);
            sb.append(", assistiveTouchEnabled=");
            sb.append(bool9);
            sb.append(", videoAutoplayEnabled=");
            sb.append(bool10);
            sb.append(", closedCaptioningEnabled=");
            sb.append(bool11);
            sb.append(", monoAudioEnabled=");
            sb.append(bool12);
            sb.append(", shakeToUndoEnabled=");
            sb.append(bool13);
            sb.append(", reducedAnimationsEnabled=");
            sb.append(bool14);
            sb.append(", shouldDifferentiateWithoutColor=");
            sb.append(bool15);
            sb.append(", grayscaleEnabled=");
            sb.append(bool16);
            sb.append(", singleAppModeEnabled=");
            sb.append(bool17);
            sb.append(", onOffSwitchLabelsEnabled=");
            sb.append(bool18);
            sb.append(", speakScreenEnabled=");
            sb.append(bool19);
            sb.append(", speakSelectionEnabled=");
            sb.append(bool20);
            sb.append(", rtlEnabled=");
            sb.append(bool21);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.lang.String str = this.textSize;
            int hashCode = str == null ? 0 : str.hashCode();
            java.lang.Boolean bool = this.screenReaderEnabled;
            int hashCode2 = bool == null ? 0 : bool.hashCode();
            java.lang.Boolean bool2 = this.boldTextEnabled;
            int hashCode3 = bool2 == null ? 0 : bool2.hashCode();
            java.lang.Boolean bool3 = this.reduceTransparencyEnabled;
            int hashCode4 = bool3 == null ? 0 : bool3.hashCode();
            java.lang.Boolean bool4 = this.reduceMotionEnabled;
            int hashCode5 = bool4 == null ? 0 : bool4.hashCode();
            java.lang.Boolean bool5 = this.buttonShapesEnabled;
            int hashCode6 = bool5 == null ? 0 : bool5.hashCode();
            java.lang.Boolean bool6 = this.invertColorsEnabled;
            int hashCode7 = bool6 == null ? 0 : bool6.hashCode();
            java.lang.Boolean bool7 = this.increaseContrastEnabled;
            int hashCode8 = bool7 == null ? 0 : bool7.hashCode();
            java.lang.Boolean bool8 = this.assistiveSwitchEnabled;
            int hashCode9 = bool8 == null ? 0 : bool8.hashCode();
            java.lang.Boolean bool9 = this.assistiveTouchEnabled;
            int hashCode10 = bool9 == null ? 0 : bool9.hashCode();
            java.lang.Boolean bool10 = this.videoAutoplayEnabled;
            int hashCode11 = bool10 == null ? 0 : bool10.hashCode();
            java.lang.Boolean bool11 = this.closedCaptioningEnabled;
            int hashCode12 = bool11 == null ? 0 : bool11.hashCode();
            java.lang.Boolean bool12 = this.monoAudioEnabled;
            int hashCode13 = bool12 == null ? 0 : bool12.hashCode();
            java.lang.Boolean bool13 = this.shakeToUndoEnabled;
            int hashCode14 = bool13 == null ? 0 : bool13.hashCode();
            java.lang.Boolean bool14 = this.reducedAnimationsEnabled;
            int hashCode15 = bool14 == null ? 0 : bool14.hashCode();
            java.lang.Boolean bool15 = this.shouldDifferentiateWithoutColor;
            int hashCode16 = bool15 == null ? 0 : bool15.hashCode();
            java.lang.Boolean bool16 = this.grayscaleEnabled;
            int hashCode17 = bool16 == null ? 0 : bool16.hashCode();
            java.lang.Boolean bool17 = this.singleAppModeEnabled;
            int hashCode18 = bool17 == null ? 0 : bool17.hashCode();
            java.lang.Boolean bool18 = this.onOffSwitchLabelsEnabled;
            int hashCode19 = bool18 == null ? 0 : bool18.hashCode();
            java.lang.Boolean bool19 = this.speakScreenEnabled;
            int hashCode20 = bool19 == null ? 0 : bool19.hashCode();
            java.lang.Boolean bool20 = this.speakSelectionEnabled;
            int hashCode21 = bool20 == null ? 0 : bool20.hashCode();
            java.lang.Boolean bool21 = this.rtlEnabled;
            return (((((((((((((((((((((((((((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + hashCode10) * 31) + hashCode11) * 31) + hashCode12) * 31) + hashCode13) * 31) + hashCode14) * 31) + hashCode15) * 31) + hashCode16) * 31) + hashCode17) * 31) + hashCode18) * 31) + hashCode19) * 31) + hashCode20) * 31) + hashCode21) * 31) + (bool21 != null ? bool21.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.datadog.android.rum.model.ViewEvent.Accessibility)) {
                return false;
            }
            com.datadog.android.rum.model.ViewEvent.Accessibility accessibility = (com.datadog.android.rum.model.ViewEvent.Accessibility) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.textSize, accessibility.textSize) && kotlin.jvm.internal.Intrinsics.areEqual(this.screenReaderEnabled, accessibility.screenReaderEnabled) && kotlin.jvm.internal.Intrinsics.areEqual(this.boldTextEnabled, accessibility.boldTextEnabled) && kotlin.jvm.internal.Intrinsics.areEqual(this.reduceTransparencyEnabled, accessibility.reduceTransparencyEnabled) && kotlin.jvm.internal.Intrinsics.areEqual(this.reduceMotionEnabled, accessibility.reduceMotionEnabled) && kotlin.jvm.internal.Intrinsics.areEqual(this.buttonShapesEnabled, accessibility.buttonShapesEnabled) && kotlin.jvm.internal.Intrinsics.areEqual(this.invertColorsEnabled, accessibility.invertColorsEnabled) && kotlin.jvm.internal.Intrinsics.areEqual(this.increaseContrastEnabled, accessibility.increaseContrastEnabled) && kotlin.jvm.internal.Intrinsics.areEqual(this.assistiveSwitchEnabled, accessibility.assistiveSwitchEnabled) && kotlin.jvm.internal.Intrinsics.areEqual(this.assistiveTouchEnabled, accessibility.assistiveTouchEnabled) && kotlin.jvm.internal.Intrinsics.areEqual(this.videoAutoplayEnabled, accessibility.videoAutoplayEnabled) && kotlin.jvm.internal.Intrinsics.areEqual(this.closedCaptioningEnabled, accessibility.closedCaptioningEnabled) && kotlin.jvm.internal.Intrinsics.areEqual(this.monoAudioEnabled, accessibility.monoAudioEnabled) && kotlin.jvm.internal.Intrinsics.areEqual(this.shakeToUndoEnabled, accessibility.shakeToUndoEnabled) && kotlin.jvm.internal.Intrinsics.areEqual(this.reducedAnimationsEnabled, accessibility.reducedAnimationsEnabled) && kotlin.jvm.internal.Intrinsics.areEqual(this.shouldDifferentiateWithoutColor, accessibility.shouldDifferentiateWithoutColor) && kotlin.jvm.internal.Intrinsics.areEqual(this.grayscaleEnabled, accessibility.grayscaleEnabled) && kotlin.jvm.internal.Intrinsics.areEqual(this.singleAppModeEnabled, accessibility.singleAppModeEnabled) && kotlin.jvm.internal.Intrinsics.areEqual(this.onOffSwitchLabelsEnabled, accessibility.onOffSwitchLabelsEnabled) && kotlin.jvm.internal.Intrinsics.areEqual(this.speakScreenEnabled, accessibility.speakScreenEnabled) && kotlin.jvm.internal.Intrinsics.areEqual(this.speakSelectionEnabled, accessibility.speakSelectionEnabled) && kotlin.jvm.internal.Intrinsics.areEqual(this.rtlEnabled, accessibility.rtlEnabled);
        }

        public final com.datadog.android.rum.model.ViewEvent.Accessibility copy(java.lang.String textSize, java.lang.Boolean screenReaderEnabled, java.lang.Boolean boldTextEnabled, java.lang.Boolean reduceTransparencyEnabled, java.lang.Boolean reduceMotionEnabled, java.lang.Boolean buttonShapesEnabled, java.lang.Boolean invertColorsEnabled, java.lang.Boolean increaseContrastEnabled, java.lang.Boolean assistiveSwitchEnabled, java.lang.Boolean assistiveTouchEnabled, java.lang.Boolean videoAutoplayEnabled, java.lang.Boolean closedCaptioningEnabled, java.lang.Boolean monoAudioEnabled, java.lang.Boolean shakeToUndoEnabled, java.lang.Boolean reducedAnimationsEnabled, java.lang.Boolean shouldDifferentiateWithoutColor, java.lang.Boolean grayscaleEnabled, java.lang.Boolean singleAppModeEnabled, java.lang.Boolean onOffSwitchLabelsEnabled, java.lang.Boolean speakScreenEnabled, java.lang.Boolean speakSelectionEnabled, java.lang.Boolean rtlEnabled) {
            return new com.datadog.android.rum.model.ViewEvent.Accessibility(textSize, screenReaderEnabled, boldTextEnabled, reduceTransparencyEnabled, reduceMotionEnabled, buttonShapesEnabled, invertColorsEnabled, increaseContrastEnabled, assistiveSwitchEnabled, assistiveTouchEnabled, videoAutoplayEnabled, closedCaptioningEnabled, monoAudioEnabled, shakeToUndoEnabled, reducedAnimationsEnabled, shouldDifferentiateWithoutColor, grayscaleEnabled, singleAppModeEnabled, onOffSwitchLabelsEnabled, speakScreenEnabled, speakSelectionEnabled, rtlEnabled);
        }

        /* renamed from: component9, reason: from getter */
        public final java.lang.Boolean getAssistiveSwitchEnabled() {
            return this.assistiveSwitchEnabled;
        }

        /* renamed from: component8, reason: from getter */
        public final java.lang.Boolean getIncreaseContrastEnabled() {
            return this.increaseContrastEnabled;
        }

        /* renamed from: component7, reason: from getter */
        public final java.lang.Boolean getInvertColorsEnabled() {
            return this.invertColorsEnabled;
        }

        /* renamed from: component6, reason: from getter */
        public final java.lang.Boolean getButtonShapesEnabled() {
            return this.buttonShapesEnabled;
        }

        /* renamed from: component5, reason: from getter */
        public final java.lang.Boolean getReduceMotionEnabled() {
            return this.reduceMotionEnabled;
        }

        /* renamed from: component4, reason: from getter */
        public final java.lang.Boolean getReduceTransparencyEnabled() {
            return this.reduceTransparencyEnabled;
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.Boolean getBoldTextEnabled() {
            return this.boldTextEnabled;
        }

        /* renamed from: component22, reason: from getter */
        public final java.lang.Boolean getRtlEnabled() {
            return this.rtlEnabled;
        }

        /* renamed from: component21, reason: from getter */
        public final java.lang.Boolean getSpeakSelectionEnabled() {
            return this.speakSelectionEnabled;
        }

        /* renamed from: component20, reason: from getter */
        public final java.lang.Boolean getSpeakScreenEnabled() {
            return this.speakScreenEnabled;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.Boolean getScreenReaderEnabled() {
            return this.screenReaderEnabled;
        }

        /* renamed from: component19, reason: from getter */
        public final java.lang.Boolean getOnOffSwitchLabelsEnabled() {
            return this.onOffSwitchLabelsEnabled;
        }

        /* renamed from: component18, reason: from getter */
        public final java.lang.Boolean getSingleAppModeEnabled() {
            return this.singleAppModeEnabled;
        }

        /* renamed from: component17, reason: from getter */
        public final java.lang.Boolean getGrayscaleEnabled() {
            return this.grayscaleEnabled;
        }

        /* renamed from: component16, reason: from getter */
        public final java.lang.Boolean getShouldDifferentiateWithoutColor() {
            return this.shouldDifferentiateWithoutColor;
        }

        /* renamed from: component15, reason: from getter */
        public final java.lang.Boolean getReducedAnimationsEnabled() {
            return this.reducedAnimationsEnabled;
        }

        /* renamed from: component14, reason: from getter */
        public final java.lang.Boolean getShakeToUndoEnabled() {
            return this.shakeToUndoEnabled;
        }

        /* renamed from: component13, reason: from getter */
        public final java.lang.Boolean getMonoAudioEnabled() {
            return this.monoAudioEnabled;
        }

        /* renamed from: component12, reason: from getter */
        public final java.lang.Boolean getClosedCaptioningEnabled() {
            return this.closedCaptioningEnabled;
        }

        /* renamed from: component11, reason: from getter */
        public final java.lang.Boolean getVideoAutoplayEnabled() {
            return this.videoAutoplayEnabled;
        }

        /* renamed from: component10, reason: from getter */
        public final java.lang.Boolean getAssistiveTouchEnabled() {
            return this.assistiveTouchEnabled;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getTextSize() {
            return this.textSize;
        }

        @kotlin.jvm.JvmStatic
        public static final com.datadog.android.rum.model.ViewEvent.Accessibility fromJsonObject(com.google.gson.JsonObject jsonObject) throws com.google.gson.JsonParseException {
            return INSTANCE.fromJsonObject(jsonObject);
        }

        @kotlin.jvm.JvmStatic
        public static final com.datadog.android.rum.model.ViewEvent.Accessibility fromJson(java.lang.String str) throws com.google.gson.JsonParseException {
            return INSTANCE.fromJson(str);
        }

        public Accessibility() {
            this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 4194303, null);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\b\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ(\u0010\n\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\bR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0018\u0010\bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0019\u0010\b"}, d2 = {"Lcom/datadog/android/rum/model/ViewEvent$Cellular;", "", "", "technology", "carrierName", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/datadog/android/rum/model/ViewEvent$Cellular;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lcom/google/gson/JsonElement;", "toJson", "()Lcom/google/gson/JsonElement;", "toString", "Ljava/lang/String;", "getCarrierName", "getTechnology", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class Cellular {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.datadog.android.rum.model.ViewEvent.Cellular.Companion INSTANCE = new com.datadog.android.rum.model.ViewEvent.Cellular.Companion(null);
        private final java.lang.String carrierName;
        private final java.lang.String technology;

        public Cellular(java.lang.String str, java.lang.String str2) {
            this.technology = str;
            this.carrierName = str2;
        }

        public /* synthetic */ Cellular(java.lang.String str, java.lang.String str2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
        }

        public final java.lang.String getTechnology() {
            return this.technology;
        }

        public final java.lang.String getCarrierName() {
            return this.carrierName;
        }

        public final com.google.gson.JsonElement toJson() {
            com.google.gson.JsonObject jsonObject = new com.google.gson.JsonObject();
            java.lang.String str = this.technology;
            if (str != null) {
                jsonObject.addProperty("technology", str);
            }
            java.lang.String str2 = this.carrierName;
            if (str2 != null) {
                jsonObject.addProperty("carrier_name", str2);
            }
            return jsonObject;
        }

        @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/datadog/android/rum/model/ViewEvent$Cellular$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/rum/model/ViewEvent$Cellular;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/rum/model/ViewEvent$Cellular;", "Lcom/google/gson/JsonObject;", "jsonObject", "fromJsonObject", "(Lcom/google/gson/JsonObject;)Lcom/datadog/android/rum/model/ViewEvent$Cellular;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @kotlin.jvm.JvmStatic
            public final com.datadog.android.rum.model.ViewEvent.Cellular fromJson(java.lang.String jsonString) throws com.google.gson.JsonParseException {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonString, "");
                try {
                    com.google.gson.JsonObject asJsonObject = com.google.gson.JsonParser.parseString(jsonString).getAsJsonObject();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asJsonObject, "");
                    return fromJsonObject(asJsonObject);
                } catch (java.lang.IllegalStateException e) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type Cellular", e);
                }
            }

            @kotlin.jvm.JvmStatic
            public final com.datadog.android.rum.model.ViewEvent.Cellular fromJsonObject(com.google.gson.JsonObject jsonObject) throws com.google.gson.JsonParseException {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonObject, "");
                try {
                    com.google.gson.JsonElement jsonElement = jsonObject.get("technology");
                    java.lang.String asString = jsonElement != null ? jsonElement.getAsString() : null;
                    com.google.gson.JsonElement jsonElement2 = jsonObject.get("carrier_name");
                    return new com.datadog.android.rum.model.ViewEvent.Cellular(asString, jsonElement2 != null ? jsonElement2.getAsString() : null);
                } catch (java.lang.IllegalStateException e) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type Cellular", e);
                } catch (java.lang.NullPointerException e2) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type Cellular", e2);
                } catch (java.lang.NumberFormatException e3) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type Cellular", e3);
                }
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public final java.lang.String toString() {
            java.lang.String str = this.technology;
            java.lang.String str2 = this.carrierName;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Cellular(technology=");
            sb.append(str);
            sb.append(", carrierName=");
            sb.append(str2);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.lang.String str = this.technology;
            int hashCode = str == null ? 0 : str.hashCode();
            java.lang.String str2 = this.carrierName;
            return (hashCode * 31) + (str2 != null ? str2.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.datadog.android.rum.model.ViewEvent.Cellular)) {
                return false;
            }
            com.datadog.android.rum.model.ViewEvent.Cellular cellular = (com.datadog.android.rum.model.ViewEvent.Cellular) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.technology, cellular.technology) && kotlin.jvm.internal.Intrinsics.areEqual(this.carrierName, cellular.carrierName);
        }

        public final com.datadog.android.rum.model.ViewEvent.Cellular copy(java.lang.String technology, java.lang.String carrierName) {
            return new com.datadog.android.rum.model.ViewEvent.Cellular(technology, carrierName);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getCarrierName() {
            return this.carrierName;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getTechnology() {
            return this.technology;
        }

        @kotlin.jvm.JvmStatic
        public static final com.datadog.android.rum.model.ViewEvent.Cellular fromJsonObject(com.google.gson.JsonObject jsonObject) throws com.google.gson.JsonParseException {
            return INSTANCE.fromJsonObject(jsonObject);
        }

        @kotlin.jvm.JvmStatic
        public static final com.datadog.android.rum.model.ViewEvent.Cellular fromJson(java.lang.String str) throws com.google.gson.JsonParseException {
            return INSTANCE.fromJson(str);
        }

        public static /* synthetic */ com.datadog.android.rum.model.ViewEvent.Cellular copy$default(com.datadog.android.rum.model.ViewEvent.Cellular cellular, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = cellular.technology;
            }
            if ((i & 2) != 0) {
                str2 = cellular.carrierName;
            }
            return cellular.copy(str, str2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Cellular() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }
    }

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0004\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0004\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001a\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001b\u0010\b"}, d2 = {"Lcom/datadog/android/rum/model/ViewEvent$Viewport;", "", "", "width", "height", "<init>", "(Ljava/lang/Number;Ljava/lang/Number;)V", "component1", "()Ljava/lang/Number;", "component2", "copy", "(Ljava/lang/Number;Ljava/lang/Number;)Lcom/datadog/android/rum/model/ViewEvent$Viewport;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lcom/google/gson/JsonElement;", "toJson", "()Lcom/google/gson/JsonElement;", "", "toString", "()Ljava/lang/String;", "Ljava/lang/Number;", "getHeight", "getWidth", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class Viewport {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.datadog.android.rum.model.ViewEvent.Viewport.Companion INSTANCE = new com.datadog.android.rum.model.ViewEvent.Viewport.Companion(null);
        private final java.lang.Number height;
        private final java.lang.Number width;

        public Viewport(java.lang.Number number, java.lang.Number number2) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(number, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(number2, "");
            this.width = number;
            this.height = number2;
        }

        public final java.lang.Number getWidth() {
            return this.width;
        }

        public final java.lang.Number getHeight() {
            return this.height;
        }

        public final com.google.gson.JsonElement toJson() {
            com.google.gson.JsonObject jsonObject = new com.google.gson.JsonObject();
            jsonObject.addProperty("width", this.width);
            jsonObject.addProperty("height", this.height);
            return jsonObject;
        }

        @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/datadog/android/rum/model/ViewEvent$Viewport$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/rum/model/ViewEvent$Viewport;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/rum/model/ViewEvent$Viewport;", "Lcom/google/gson/JsonObject;", "jsonObject", "fromJsonObject", "(Lcom/google/gson/JsonObject;)Lcom/datadog/android/rum/model/ViewEvent$Viewport;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @kotlin.jvm.JvmStatic
            public final com.datadog.android.rum.model.ViewEvent.Viewport fromJson(java.lang.String jsonString) throws com.google.gson.JsonParseException {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonString, "");
                try {
                    com.google.gson.JsonObject asJsonObject = com.google.gson.JsonParser.parseString(jsonString).getAsJsonObject();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asJsonObject, "");
                    return fromJsonObject(asJsonObject);
                } catch (java.lang.IllegalStateException e) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type Viewport", e);
                }
            }

            @kotlin.jvm.JvmStatic
            public final com.datadog.android.rum.model.ViewEvent.Viewport fromJsonObject(com.google.gson.JsonObject jsonObject) throws com.google.gson.JsonParseException {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonObject, "");
                try {
                    java.lang.Number asNumber = jsonObject.get("width").getAsNumber();
                    java.lang.Number asNumber2 = jsonObject.get("height").getAsNumber();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asNumber, "");
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asNumber2, "");
                    return new com.datadog.android.rum.model.ViewEvent.Viewport(asNumber, asNumber2);
                } catch (java.lang.IllegalStateException e) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type Viewport", e);
                } catch (java.lang.NullPointerException e2) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type Viewport", e2);
                } catch (java.lang.NumberFormatException e3) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type Viewport", e3);
                }
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public final java.lang.String toString() {
            java.lang.Number number = this.width;
            java.lang.Number number2 = this.height;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Viewport(width=");
            sb.append(number);
            sb.append(", height=");
            sb.append(number2);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.width.hashCode() * 31) + this.height.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.datadog.android.rum.model.ViewEvent.Viewport)) {
                return false;
            }
            com.datadog.android.rum.model.ViewEvent.Viewport viewport = (com.datadog.android.rum.model.ViewEvent.Viewport) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.width, viewport.width) && kotlin.jvm.internal.Intrinsics.areEqual(this.height, viewport.height);
        }

        public final com.datadog.android.rum.model.ViewEvent.Viewport copy(java.lang.Number width, java.lang.Number height) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(width, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(height, "");
            return new com.datadog.android.rum.model.ViewEvent.Viewport(width, height);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.Number getHeight() {
            return this.height;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.Number getWidth() {
            return this.width;
        }

        @kotlin.jvm.JvmStatic
        public static final com.datadog.android.rum.model.ViewEvent.Viewport fromJsonObject(com.google.gson.JsonObject jsonObject) throws com.google.gson.JsonParseException {
            return INSTANCE.fromJsonObject(jsonObject);
        }

        @kotlin.jvm.JvmStatic
        public static final com.datadog.android.rum.model.ViewEvent.Viewport fromJson(java.lang.String str) throws com.google.gson.JsonParseException {
            return INSTANCE.fromJson(str);
        }

        public static /* synthetic */ com.datadog.android.rum.model.ViewEvent.Viewport copy$default(com.datadog.android.rum.model.ViewEvent.Viewport viewport, java.lang.Number number, java.lang.Number number2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                number = viewport.width;
            }
            if ((i & 2) != 0) {
                number2 = viewport.height;
            }
            return viewport.copy(number, number2);
        }
    }

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0004\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\b\u0018\u0000 \"2\u00020\u0001:\u0001\"B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\nJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\nJ8\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\nR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001d\u001a\u0004\b\u001f\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001d\u001a\u0004\b \u0010\nR\u001a\u0010\u0006\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001d\u001a\u0004\b!\u0010\n"}, d2 = {"Lcom/datadog/android/rum/model/ViewEvent$Scroll;", "", "", "maxDepth", "maxDepthScrollTop", "maxScrollHeight", "maxScrollHeightTime", "<init>", "(Ljava/lang/Number;Ljava/lang/Number;Ljava/lang/Number;Ljava/lang/Number;)V", "component1", "()Ljava/lang/Number;", "component2", "component3", "component4", "copy", "(Ljava/lang/Number;Ljava/lang/Number;Ljava/lang/Number;Ljava/lang/Number;)Lcom/datadog/android/rum/model/ViewEvent$Scroll;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lcom/google/gson/JsonElement;", "toJson", "()Lcom/google/gson/JsonElement;", "", "toString", "()Ljava/lang/String;", "Ljava/lang/Number;", "getMaxDepth", "getMaxDepthScrollTop", "getMaxScrollHeight", "getMaxScrollHeightTime", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class Scroll {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.datadog.android.rum.model.ViewEvent.Scroll.Companion INSTANCE = new com.datadog.android.rum.model.ViewEvent.Scroll.Companion(null);
        private final java.lang.Number maxDepth;
        private final java.lang.Number maxDepthScrollTop;
        private final java.lang.Number maxScrollHeight;
        private final java.lang.Number maxScrollHeightTime;

        public Scroll(java.lang.Number number, java.lang.Number number2, java.lang.Number number3, java.lang.Number number4) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(number, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(number2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(number3, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(number4, "");
            this.maxDepth = number;
            this.maxDepthScrollTop = number2;
            this.maxScrollHeight = number3;
            this.maxScrollHeightTime = number4;
        }

        public final java.lang.Number getMaxDepth() {
            return this.maxDepth;
        }

        public final java.lang.Number getMaxDepthScrollTop() {
            return this.maxDepthScrollTop;
        }

        public final java.lang.Number getMaxScrollHeight() {
            return this.maxScrollHeight;
        }

        public final java.lang.Number getMaxScrollHeightTime() {
            return this.maxScrollHeightTime;
        }

        public final com.google.gson.JsonElement toJson() {
            com.google.gson.JsonObject jsonObject = new com.google.gson.JsonObject();
            jsonObject.addProperty("max_depth", this.maxDepth);
            jsonObject.addProperty("max_depth_scroll_top", this.maxDepthScrollTop);
            jsonObject.addProperty("max_scroll_height", this.maxScrollHeight);
            jsonObject.addProperty("max_scroll_height_time", this.maxScrollHeightTime);
            return jsonObject;
        }

        @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/datadog/android/rum/model/ViewEvent$Scroll$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/rum/model/ViewEvent$Scroll;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/rum/model/ViewEvent$Scroll;", "Lcom/google/gson/JsonObject;", "jsonObject", "fromJsonObject", "(Lcom/google/gson/JsonObject;)Lcom/datadog/android/rum/model/ViewEvent$Scroll;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @kotlin.jvm.JvmStatic
            public final com.datadog.android.rum.model.ViewEvent.Scroll fromJson(java.lang.String jsonString) throws com.google.gson.JsonParseException {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonString, "");
                try {
                    com.google.gson.JsonObject asJsonObject = com.google.gson.JsonParser.parseString(jsonString).getAsJsonObject();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asJsonObject, "");
                    return fromJsonObject(asJsonObject);
                } catch (java.lang.IllegalStateException e) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type Scroll", e);
                }
            }

            @kotlin.jvm.JvmStatic
            public final com.datadog.android.rum.model.ViewEvent.Scroll fromJsonObject(com.google.gson.JsonObject jsonObject) throws com.google.gson.JsonParseException {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonObject, "");
                try {
                    java.lang.Number asNumber = jsonObject.get("max_depth").getAsNumber();
                    java.lang.Number asNumber2 = jsonObject.get("max_depth_scroll_top").getAsNumber();
                    java.lang.Number asNumber3 = jsonObject.get("max_scroll_height").getAsNumber();
                    java.lang.Number asNumber4 = jsonObject.get("max_scroll_height_time").getAsNumber();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asNumber, "");
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asNumber2, "");
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asNumber3, "");
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asNumber4, "");
                    return new com.datadog.android.rum.model.ViewEvent.Scroll(asNumber, asNumber2, asNumber3, asNumber4);
                } catch (java.lang.IllegalStateException e) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type Scroll", e);
                } catch (java.lang.NullPointerException e2) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type Scroll", e2);
                } catch (java.lang.NumberFormatException e3) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type Scroll", e3);
                }
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public final java.lang.String toString() {
            java.lang.Number number = this.maxDepth;
            java.lang.Number number2 = this.maxDepthScrollTop;
            java.lang.Number number3 = this.maxScrollHeight;
            java.lang.Number number4 = this.maxScrollHeightTime;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Scroll(maxDepth=");
            sb.append(number);
            sb.append(", maxDepthScrollTop=");
            sb.append(number2);
            sb.append(", maxScrollHeight=");
            sb.append(number3);
            sb.append(", maxScrollHeightTime=");
            sb.append(number4);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (((((this.maxDepth.hashCode() * 31) + this.maxDepthScrollTop.hashCode()) * 31) + this.maxScrollHeight.hashCode()) * 31) + this.maxScrollHeightTime.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.datadog.android.rum.model.ViewEvent.Scroll)) {
                return false;
            }
            com.datadog.android.rum.model.ViewEvent.Scroll scroll = (com.datadog.android.rum.model.ViewEvent.Scroll) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.maxDepth, scroll.maxDepth) && kotlin.jvm.internal.Intrinsics.areEqual(this.maxDepthScrollTop, scroll.maxDepthScrollTop) && kotlin.jvm.internal.Intrinsics.areEqual(this.maxScrollHeight, scroll.maxScrollHeight) && kotlin.jvm.internal.Intrinsics.areEqual(this.maxScrollHeightTime, scroll.maxScrollHeightTime);
        }

        public final com.datadog.android.rum.model.ViewEvent.Scroll copy(java.lang.Number maxDepth, java.lang.Number maxDepthScrollTop, java.lang.Number maxScrollHeight, java.lang.Number maxScrollHeightTime) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(maxDepth, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(maxDepthScrollTop, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(maxScrollHeight, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(maxScrollHeightTime, "");
            return new com.datadog.android.rum.model.ViewEvent.Scroll(maxDepth, maxDepthScrollTop, maxScrollHeight, maxScrollHeightTime);
        }

        /* renamed from: component4, reason: from getter */
        public final java.lang.Number getMaxScrollHeightTime() {
            return this.maxScrollHeightTime;
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.Number getMaxScrollHeight() {
            return this.maxScrollHeight;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.Number getMaxDepthScrollTop() {
            return this.maxDepthScrollTop;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.Number getMaxDepth() {
            return this.maxDepth;
        }

        @kotlin.jvm.JvmStatic
        public static final com.datadog.android.rum.model.ViewEvent.Scroll fromJsonObject(com.google.gson.JsonObject jsonObject) throws com.google.gson.JsonParseException {
            return INSTANCE.fromJsonObject(jsonObject);
        }

        @kotlin.jvm.JvmStatic
        public static final com.datadog.android.rum.model.ViewEvent.Scroll fromJson(java.lang.String str) throws com.google.gson.JsonParseException {
            return INSTANCE.fromJson(str);
        }

        public static /* synthetic */ com.datadog.android.rum.model.ViewEvent.Scroll copy$default(com.datadog.android.rum.model.ViewEvent.Scroll scroll, java.lang.Number number, java.lang.Number number2, java.lang.Number number3, java.lang.Number number4, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                number = scroll.maxDepth;
            }
            if ((i & 2) != 0) {
                number2 = scroll.maxDepthScrollTop;
            }
            if ((i & 4) != 0) {
                number3 = scroll.maxScrollHeight;
            }
            if ((i & 8) != 0) {
                number4 = scroll.maxScrollHeightTime;
            }
            return scroll.copy(number, number2, number3, number4);
        }
    }

    @kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\b\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ(\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001d\u001a\u0004\b\u001e\u0010\u000b"}, d2 = {"Lcom/datadog/android/rum/model/ViewEvent$DdSession;", "", "Lcom/datadog/android/rum/model/ViewEvent$Plan;", "plan", "Lcom/datadog/android/rum/model/ViewEvent$SessionPrecondition;", "sessionPrecondition", "<init>", "(Lcom/datadog/android/rum/model/ViewEvent$Plan;Lcom/datadog/android/rum/model/ViewEvent$SessionPrecondition;)V", "component1", "()Lcom/datadog/android/rum/model/ViewEvent$Plan;", "component2", "()Lcom/datadog/android/rum/model/ViewEvent$SessionPrecondition;", "copy", "(Lcom/datadog/android/rum/model/ViewEvent$Plan;Lcom/datadog/android/rum/model/ViewEvent$SessionPrecondition;)Lcom/datadog/android/rum/model/ViewEvent$DdSession;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lcom/google/gson/JsonElement;", "toJson", "()Lcom/google/gson/JsonElement;", "", "toString", "()Ljava/lang/String;", "Lcom/datadog/android/rum/model/ViewEvent$Plan;", "getPlan", "Lcom/datadog/android/rum/model/ViewEvent$SessionPrecondition;", "getSessionPrecondition", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class DdSession {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.datadog.android.rum.model.ViewEvent.DdSession.Companion INSTANCE = new com.datadog.android.rum.model.ViewEvent.DdSession.Companion(null);
        private final com.datadog.android.rum.model.ViewEvent.Plan plan;
        private final com.datadog.android.rum.model.ViewEvent.SessionPrecondition sessionPrecondition;

        public DdSession(com.datadog.android.rum.model.ViewEvent.Plan plan, com.datadog.android.rum.model.ViewEvent.SessionPrecondition sessionPrecondition) {
            this.plan = plan;
            this.sessionPrecondition = sessionPrecondition;
        }

        public /* synthetic */ DdSession(com.datadog.android.rum.model.ViewEvent.Plan plan, com.datadog.android.rum.model.ViewEvent.SessionPrecondition sessionPrecondition, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : plan, (i & 2) != 0 ? null : sessionPrecondition);
        }

        public final com.datadog.android.rum.model.ViewEvent.Plan getPlan() {
            return this.plan;
        }

        public final com.datadog.android.rum.model.ViewEvent.SessionPrecondition getSessionPrecondition() {
            return this.sessionPrecondition;
        }

        public final com.google.gson.JsonElement toJson() {
            com.google.gson.JsonObject jsonObject = new com.google.gson.JsonObject();
            com.datadog.android.rum.model.ViewEvent.Plan plan = this.plan;
            if (plan != null) {
                jsonObject.add("plan", plan.toJson());
            }
            com.datadog.android.rum.model.ViewEvent.SessionPrecondition sessionPrecondition = this.sessionPrecondition;
            if (sessionPrecondition != null) {
                jsonObject.add("session_precondition", sessionPrecondition.toJson());
            }
            return jsonObject;
        }

        @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/datadog/android/rum/model/ViewEvent$DdSession$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/rum/model/ViewEvent$DdSession;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/rum/model/ViewEvent$DdSession;", "Lcom/google/gson/JsonObject;", "jsonObject", "fromJsonObject", "(Lcom/google/gson/JsonObject;)Lcom/datadog/android/rum/model/ViewEvent$DdSession;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @kotlin.jvm.JvmStatic
            public final com.datadog.android.rum.model.ViewEvent.DdSession fromJson(java.lang.String jsonString) throws com.google.gson.JsonParseException {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonString, "");
                try {
                    com.google.gson.JsonObject asJsonObject = com.google.gson.JsonParser.parseString(jsonString).getAsJsonObject();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asJsonObject, "");
                    return fromJsonObject(asJsonObject);
                } catch (java.lang.IllegalStateException e) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type DdSession", e);
                }
            }

            @kotlin.jvm.JvmStatic
            public final com.datadog.android.rum.model.ViewEvent.DdSession fromJsonObject(com.google.gson.JsonObject jsonObject) throws com.google.gson.JsonParseException {
                java.lang.String asString;
                java.lang.String asString2;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonObject, "");
                try {
                    com.google.gson.JsonElement jsonElement = jsonObject.get("plan");
                    com.datadog.android.rum.model.ViewEvent.SessionPrecondition sessionPrecondition = null;
                    com.datadog.android.rum.model.ViewEvent.Plan fromJson = (jsonElement == null || (asString2 = jsonElement.getAsString()) == null) ? null : com.datadog.android.rum.model.ViewEvent.Plan.INSTANCE.fromJson(asString2);
                    com.google.gson.JsonElement jsonElement2 = jsonObject.get("session_precondition");
                    if (jsonElement2 != null && (asString = jsonElement2.getAsString()) != null) {
                        sessionPrecondition = com.datadog.android.rum.model.ViewEvent.SessionPrecondition.INSTANCE.fromJson(asString);
                    }
                    return new com.datadog.android.rum.model.ViewEvent.DdSession(fromJson, sessionPrecondition);
                } catch (java.lang.IllegalStateException e) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type DdSession", e);
                } catch (java.lang.NullPointerException e2) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type DdSession", e2);
                } catch (java.lang.NumberFormatException e3) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type DdSession", e3);
                }
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public final java.lang.String toString() {
            com.datadog.android.rum.model.ViewEvent.Plan plan = this.plan;
            com.datadog.android.rum.model.ViewEvent.SessionPrecondition sessionPrecondition = this.sessionPrecondition;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("DdSession(plan=");
            sb.append(plan);
            sb.append(", sessionPrecondition=");
            sb.append(sessionPrecondition);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            com.datadog.android.rum.model.ViewEvent.Plan plan = this.plan;
            int hashCode = plan == null ? 0 : plan.hashCode();
            com.datadog.android.rum.model.ViewEvent.SessionPrecondition sessionPrecondition = this.sessionPrecondition;
            return (hashCode * 31) + (sessionPrecondition != null ? sessionPrecondition.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.datadog.android.rum.model.ViewEvent.DdSession)) {
                return false;
            }
            com.datadog.android.rum.model.ViewEvent.DdSession ddSession = (com.datadog.android.rum.model.ViewEvent.DdSession) other;
            return this.plan == ddSession.plan && this.sessionPrecondition == ddSession.sessionPrecondition;
        }

        public final com.datadog.android.rum.model.ViewEvent.DdSession copy(com.datadog.android.rum.model.ViewEvent.Plan plan, com.datadog.android.rum.model.ViewEvent.SessionPrecondition sessionPrecondition) {
            return new com.datadog.android.rum.model.ViewEvent.DdSession(plan, sessionPrecondition);
        }

        /* renamed from: component2, reason: from getter */
        public final com.datadog.android.rum.model.ViewEvent.SessionPrecondition getSessionPrecondition() {
            return this.sessionPrecondition;
        }

        /* renamed from: component1, reason: from getter */
        public final com.datadog.android.rum.model.ViewEvent.Plan getPlan() {
            return this.plan;
        }

        @kotlin.jvm.JvmStatic
        public static final com.datadog.android.rum.model.ViewEvent.DdSession fromJsonObject(com.google.gson.JsonObject jsonObject) throws com.google.gson.JsonParseException {
            return INSTANCE.fromJsonObject(jsonObject);
        }

        @kotlin.jvm.JvmStatic
        public static final com.datadog.android.rum.model.ViewEvent.DdSession fromJson(java.lang.String str) throws com.google.gson.JsonParseException {
            return INSTANCE.fromJson(str);
        }

        public static /* synthetic */ com.datadog.android.rum.model.ViewEvent.DdSession copy$default(com.datadog.android.rum.model.ViewEvent.DdSession ddSession, com.datadog.android.rum.model.ViewEvent.Plan plan, com.datadog.android.rum.model.ViewEvent.SessionPrecondition sessionPrecondition, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                plan = ddSession.plan;
            }
            if ((i & 2) != 0) {
                sessionPrecondition = ddSession.sessionPrecondition;
            }
            return ddSession.copy(plan, sessionPrecondition);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public DdSession() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }
    }

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0004\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\b\u0018\u0000 '2\u00020\u0001:\u0001'B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\fJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011JJ\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0015\u001a\u00020\u00072\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b!\u0010\fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010 \u001a\u0004\b\"\u0010\fR\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b#\u0010\fR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010$\u001a\u0004\b%\u0010\u0011R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010 \u001a\u0004\b&\u0010\f"}, d2 = {"Lcom/datadog/android/rum/model/ViewEvent$Configuration;", "", "", "sessionSampleRate", "sessionReplaySampleRate", "profilingSampleRate", "traceSampleRate", "", "startSessionReplayRecordingManually", "<init>", "(Ljava/lang/Number;Ljava/lang/Number;Ljava/lang/Number;Ljava/lang/Number;Ljava/lang/Boolean;)V", "component1", "()Ljava/lang/Number;", "component2", "component3", "component4", "component5", "()Ljava/lang/Boolean;", "copy", "(Ljava/lang/Number;Ljava/lang/Number;Ljava/lang/Number;Ljava/lang/Number;Ljava/lang/Boolean;)Lcom/datadog/android/rum/model/ViewEvent$Configuration;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lcom/google/gson/JsonElement;", "toJson", "()Lcom/google/gson/JsonElement;", "", "toString", "()Ljava/lang/String;", "Ljava/lang/Number;", "getProfilingSampleRate", "getSessionReplaySampleRate", "getSessionSampleRate", "Ljava/lang/Boolean;", "getStartSessionReplayRecordingManually", "getTraceSampleRate", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class Configuration {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.datadog.android.rum.model.ViewEvent.Configuration.Companion INSTANCE = new com.datadog.android.rum.model.ViewEvent.Configuration.Companion(null);
        private final java.lang.Number profilingSampleRate;
        private final java.lang.Number sessionReplaySampleRate;
        private final java.lang.Number sessionSampleRate;
        private final java.lang.Boolean startSessionReplayRecordingManually;
        private final java.lang.Number traceSampleRate;

        public Configuration(java.lang.Number number, java.lang.Number number2, java.lang.Number number3, java.lang.Number number4, java.lang.Boolean bool) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(number, "");
            this.sessionSampleRate = number;
            this.sessionReplaySampleRate = number2;
            this.profilingSampleRate = number3;
            this.traceSampleRate = number4;
            this.startSessionReplayRecordingManually = bool;
        }

        public /* synthetic */ Configuration(java.lang.Number number, java.lang.Number number2, java.lang.Number number3, java.lang.Number number4, java.lang.Boolean bool, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(number, (i & 2) != 0 ? null : number2, (i & 4) != 0 ? null : number3, (i & 8) != 0 ? null : number4, (i & 16) != 0 ? null : bool);
        }

        public final java.lang.Number getSessionSampleRate() {
            return this.sessionSampleRate;
        }

        public final java.lang.Number getSessionReplaySampleRate() {
            return this.sessionReplaySampleRate;
        }

        public final java.lang.Number getProfilingSampleRate() {
            return this.profilingSampleRate;
        }

        public final java.lang.Number getTraceSampleRate() {
            return this.traceSampleRate;
        }

        public final java.lang.Boolean getStartSessionReplayRecordingManually() {
            return this.startSessionReplayRecordingManually;
        }

        public final com.google.gson.JsonElement toJson() {
            com.google.gson.JsonObject jsonObject = new com.google.gson.JsonObject();
            jsonObject.addProperty("session_sample_rate", this.sessionSampleRate);
            java.lang.Number number = this.sessionReplaySampleRate;
            if (number != null) {
                jsonObject.addProperty("session_replay_sample_rate", number);
            }
            java.lang.Number number2 = this.profilingSampleRate;
            if (number2 != null) {
                jsonObject.addProperty("profiling_sample_rate", number2);
            }
            java.lang.Number number3 = this.traceSampleRate;
            if (number3 != null) {
                jsonObject.addProperty("trace_sample_rate", number3);
            }
            java.lang.Boolean bool = this.startSessionReplayRecordingManually;
            if (bool != null) {
                jsonObject.addProperty("start_session_replay_recording_manually", java.lang.Boolean.valueOf(bool.booleanValue()));
            }
            return jsonObject;
        }

        @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/datadog/android/rum/model/ViewEvent$Configuration$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/rum/model/ViewEvent$Configuration;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/rum/model/ViewEvent$Configuration;", "Lcom/google/gson/JsonObject;", "jsonObject", "fromJsonObject", "(Lcom/google/gson/JsonObject;)Lcom/datadog/android/rum/model/ViewEvent$Configuration;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @kotlin.jvm.JvmStatic
            public final com.datadog.android.rum.model.ViewEvent.Configuration fromJson(java.lang.String jsonString) throws com.google.gson.JsonParseException {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonString, "");
                try {
                    com.google.gson.JsonObject asJsonObject = com.google.gson.JsonParser.parseString(jsonString).getAsJsonObject();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asJsonObject, "");
                    return fromJsonObject(asJsonObject);
                } catch (java.lang.IllegalStateException e) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type Configuration", e);
                }
            }

            @kotlin.jvm.JvmStatic
            public final com.datadog.android.rum.model.ViewEvent.Configuration fromJsonObject(com.google.gson.JsonObject jsonObject) throws com.google.gson.JsonParseException {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonObject, "");
                try {
                    java.lang.Number asNumber = jsonObject.get("session_sample_rate").getAsNumber();
                    com.google.gson.JsonElement jsonElement = jsonObject.get("session_replay_sample_rate");
                    java.lang.Number asNumber2 = jsonElement != null ? jsonElement.getAsNumber() : null;
                    com.google.gson.JsonElement jsonElement2 = jsonObject.get("profiling_sample_rate");
                    java.lang.Number asNumber3 = jsonElement2 != null ? jsonElement2.getAsNumber() : null;
                    com.google.gson.JsonElement jsonElement3 = jsonObject.get("trace_sample_rate");
                    java.lang.Number asNumber4 = jsonElement3 != null ? jsonElement3.getAsNumber() : null;
                    com.google.gson.JsonElement jsonElement4 = jsonObject.get("start_session_replay_recording_manually");
                    java.lang.Boolean valueOf = jsonElement4 != null ? java.lang.Boolean.valueOf(jsonElement4.getAsBoolean()) : null;
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asNumber, "");
                    return new com.datadog.android.rum.model.ViewEvent.Configuration(asNumber, asNumber2, asNumber3, asNumber4, valueOf);
                } catch (java.lang.IllegalStateException e) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type Configuration", e);
                } catch (java.lang.NullPointerException e2) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type Configuration", e2);
                } catch (java.lang.NumberFormatException e3) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type Configuration", e3);
                }
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public final java.lang.String toString() {
            java.lang.Number number = this.sessionSampleRate;
            java.lang.Number number2 = this.sessionReplaySampleRate;
            java.lang.Number number3 = this.profilingSampleRate;
            java.lang.Number number4 = this.traceSampleRate;
            java.lang.Boolean bool = this.startSessionReplayRecordingManually;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Configuration(sessionSampleRate=");
            sb.append(number);
            sb.append(", sessionReplaySampleRate=");
            sb.append(number2);
            sb.append(", profilingSampleRate=");
            sb.append(number3);
            sb.append(", traceSampleRate=");
            sb.append(number4);
            sb.append(", startSessionReplayRecordingManually=");
            sb.append(bool);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.sessionSampleRate.hashCode();
            java.lang.Number number = this.sessionReplaySampleRate;
            int hashCode2 = number == null ? 0 : number.hashCode();
            java.lang.Number number2 = this.profilingSampleRate;
            int hashCode3 = number2 == null ? 0 : number2.hashCode();
            java.lang.Number number3 = this.traceSampleRate;
            int hashCode4 = number3 == null ? 0 : number3.hashCode();
            java.lang.Boolean bool = this.startSessionReplayRecordingManually;
            return (((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + (bool != null ? bool.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.datadog.android.rum.model.ViewEvent.Configuration)) {
                return false;
            }
            com.datadog.android.rum.model.ViewEvent.Configuration configuration = (com.datadog.android.rum.model.ViewEvent.Configuration) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.sessionSampleRate, configuration.sessionSampleRate) && kotlin.jvm.internal.Intrinsics.areEqual(this.sessionReplaySampleRate, configuration.sessionReplaySampleRate) && kotlin.jvm.internal.Intrinsics.areEqual(this.profilingSampleRate, configuration.profilingSampleRate) && kotlin.jvm.internal.Intrinsics.areEqual(this.traceSampleRate, configuration.traceSampleRate) && kotlin.jvm.internal.Intrinsics.areEqual(this.startSessionReplayRecordingManually, configuration.startSessionReplayRecordingManually);
        }

        public final com.datadog.android.rum.model.ViewEvent.Configuration copy(java.lang.Number sessionSampleRate, java.lang.Number sessionReplaySampleRate, java.lang.Number profilingSampleRate, java.lang.Number traceSampleRate, java.lang.Boolean startSessionReplayRecordingManually) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sessionSampleRate, "");
            return new com.datadog.android.rum.model.ViewEvent.Configuration(sessionSampleRate, sessionReplaySampleRate, profilingSampleRate, traceSampleRate, startSessionReplayRecordingManually);
        }

        /* renamed from: component5, reason: from getter */
        public final java.lang.Boolean getStartSessionReplayRecordingManually() {
            return this.startSessionReplayRecordingManually;
        }

        /* renamed from: component4, reason: from getter */
        public final java.lang.Number getTraceSampleRate() {
            return this.traceSampleRate;
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.Number getProfilingSampleRate() {
            return this.profilingSampleRate;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.Number getSessionReplaySampleRate() {
            return this.sessionReplaySampleRate;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.Number getSessionSampleRate() {
            return this.sessionSampleRate;
        }

        @kotlin.jvm.JvmStatic
        public static final com.datadog.android.rum.model.ViewEvent.Configuration fromJsonObject(com.google.gson.JsonObject jsonObject) throws com.google.gson.JsonParseException {
            return INSTANCE.fromJsonObject(jsonObject);
        }

        @kotlin.jvm.JvmStatic
        public static final com.datadog.android.rum.model.ViewEvent.Configuration fromJson(java.lang.String str) throws com.google.gson.JsonParseException {
            return INSTANCE.fromJson(str);
        }

        public static /* synthetic */ com.datadog.android.rum.model.ViewEvent.Configuration copy$default(com.datadog.android.rum.model.ViewEvent.Configuration configuration, java.lang.Number number, java.lang.Number number2, java.lang.Number number3, java.lang.Number number4, java.lang.Boolean bool, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                number = configuration.sessionSampleRate;
            }
            if ((i & 2) != 0) {
                number2 = configuration.sessionReplaySampleRate;
            }
            java.lang.Number number5 = number2;
            if ((i & 4) != 0) {
                number3 = configuration.profilingSampleRate;
            }
            java.lang.Number number6 = number3;
            if ((i & 8) != 0) {
                number4 = configuration.traceSampleRate;
            }
            java.lang.Number number7 = number4;
            if ((i & 16) != 0) {
                bool = configuration.startSessionReplayRecordingManually;
            }
            return configuration.copy(number, number5, number6, number7, bool);
        }
    }

    @kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\b\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\u000bR\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\t"}, d2 = {"Lcom/datadog/android/rum/model/ViewEvent$PageState;", "", "Lcom/datadog/android/rum/model/ViewEvent$State;", "state", "", com.adobe.marketing.mobile.internal.CoreConstants.EventDataKeys.Lifecycle.LIFECYCLE_START, "<init>", "(Lcom/datadog/android/rum/model/ViewEvent$State;J)V", "component1", "()Lcom/datadog/android/rum/model/ViewEvent$State;", "component2", "()J", "copy", "(Lcom/datadog/android/rum/model/ViewEvent$State;J)Lcom/datadog/android/rum/model/ViewEvent$PageState;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lcom/google/gson/JsonElement;", "toJson", "()Lcom/google/gson/JsonElement;", "", "toString", "()Ljava/lang/String;", "J", "getStart", "Lcom/datadog/android/rum/model/ViewEvent$State;", "getState", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class PageState {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.datadog.android.rum.model.ViewEvent.PageState.Companion INSTANCE = new com.datadog.android.rum.model.ViewEvent.PageState.Companion(null);
        private final long start;
        private final com.datadog.android.rum.model.ViewEvent.State state;

        public PageState(com.datadog.android.rum.model.ViewEvent.State state, long j) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(state, "");
            this.state = state;
            this.start = j;
        }

        public final com.datadog.android.rum.model.ViewEvent.State getState() {
            return this.state;
        }

        public final long getStart() {
            return this.start;
        }

        public final com.google.gson.JsonElement toJson() {
            com.google.gson.JsonObject jsonObject = new com.google.gson.JsonObject();
            jsonObject.add("state", this.state.toJson());
            jsonObject.addProperty(com.adobe.marketing.mobile.internal.CoreConstants.EventDataKeys.Lifecycle.LIFECYCLE_START, java.lang.Long.valueOf(this.start));
            return jsonObject;
        }

        @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/datadog/android/rum/model/ViewEvent$PageState$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/rum/model/ViewEvent$PageState;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/rum/model/ViewEvent$PageState;", "Lcom/google/gson/JsonObject;", "jsonObject", "fromJsonObject", "(Lcom/google/gson/JsonObject;)Lcom/datadog/android/rum/model/ViewEvent$PageState;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @kotlin.jvm.JvmStatic
            public final com.datadog.android.rum.model.ViewEvent.PageState fromJson(java.lang.String jsonString) throws com.google.gson.JsonParseException {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonString, "");
                try {
                    com.google.gson.JsonObject asJsonObject = com.google.gson.JsonParser.parseString(jsonString).getAsJsonObject();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asJsonObject, "");
                    return fromJsonObject(asJsonObject);
                } catch (java.lang.IllegalStateException e) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type PageState", e);
                }
            }

            @kotlin.jvm.JvmStatic
            public final com.datadog.android.rum.model.ViewEvent.PageState fromJsonObject(com.google.gson.JsonObject jsonObject) throws com.google.gson.JsonParseException {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonObject, "");
                try {
                    com.datadog.android.rum.model.ViewEvent.State.Companion companion = com.datadog.android.rum.model.ViewEvent.State.INSTANCE;
                    java.lang.String asString = jsonObject.get("state").getAsString();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asString, "");
                    return new com.datadog.android.rum.model.ViewEvent.PageState(companion.fromJson(asString), jsonObject.get(com.adobe.marketing.mobile.internal.CoreConstants.EventDataKeys.Lifecycle.LIFECYCLE_START).getAsLong());
                } catch (java.lang.IllegalStateException e) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type PageState", e);
                } catch (java.lang.NullPointerException e2) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type PageState", e2);
                } catch (java.lang.NumberFormatException e3) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type PageState", e3);
                }
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public final java.lang.String toString() {
            com.datadog.android.rum.model.ViewEvent.State state = this.state;
            long j = this.start;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("PageState(state=");
            sb.append(state);
            sb.append(", start=");
            sb.append(j);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.state.hashCode() * 31) + java.lang.Long.hashCode(this.start);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.datadog.android.rum.model.ViewEvent.PageState)) {
                return false;
            }
            com.datadog.android.rum.model.ViewEvent.PageState pageState = (com.datadog.android.rum.model.ViewEvent.PageState) other;
            return this.state == pageState.state && this.start == pageState.start;
        }

        public final com.datadog.android.rum.model.ViewEvent.PageState copy(com.datadog.android.rum.model.ViewEvent.State state, long start) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(state, "");
            return new com.datadog.android.rum.model.ViewEvent.PageState(state, start);
        }

        /* renamed from: component2, reason: from getter */
        public final long getStart() {
            return this.start;
        }

        /* renamed from: component1, reason: from getter */
        public final com.datadog.android.rum.model.ViewEvent.State getState() {
            return this.state;
        }

        @kotlin.jvm.JvmStatic
        public static final com.datadog.android.rum.model.ViewEvent.PageState fromJsonObject(com.google.gson.JsonObject jsonObject) throws com.google.gson.JsonParseException {
            return INSTANCE.fromJsonObject(jsonObject);
        }

        @kotlin.jvm.JvmStatic
        public static final com.datadog.android.rum.model.ViewEvent.PageState fromJson(java.lang.String str) throws com.google.gson.JsonParseException {
            return INSTANCE.fromJson(str);
        }

        public static /* synthetic */ com.datadog.android.rum.model.ViewEvent.PageState copy$default(com.datadog.android.rum.model.ViewEvent.PageState pageState, com.datadog.android.rum.model.ViewEvent.State state, long j, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                state = pageState.state;
            }
            if ((i & 2) != 0) {
                j = pageState.start;
            }
            return pageState.copy(state, j);
        }
    }

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\b\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB+\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\tJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\tJ4\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\tR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001b\u001a\u0004\b\u001d\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001e\u0010\t"}, d2 = {"Lcom/datadog/android/rum/model/ViewEvent$ReplayStats;", "", "", "recordsCount", "segmentsCount", "segmentsTotalRawSize", "<init>", "(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;)V", "component1", "()Ljava/lang/Long;", "component2", "component3", "copy", "(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;)Lcom/datadog/android/rum/model/ViewEvent$ReplayStats;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lcom/google/gson/JsonElement;", "toJson", "()Lcom/google/gson/JsonElement;", "", "toString", "()Ljava/lang/String;", "Ljava/lang/Long;", "getRecordsCount", "getSegmentsCount", "getSegmentsTotalRawSize", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class ReplayStats {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.datadog.android.rum.model.ViewEvent.ReplayStats.Companion INSTANCE = new com.datadog.android.rum.model.ViewEvent.ReplayStats.Companion(null);
        private final java.lang.Long recordsCount;
        private final java.lang.Long segmentsCount;
        private final java.lang.Long segmentsTotalRawSize;

        public ReplayStats(java.lang.Long l, java.lang.Long l2, java.lang.Long l3) {
            this.recordsCount = l;
            this.segmentsCount = l2;
            this.segmentsTotalRawSize = l3;
        }

        public /* synthetic */ ReplayStats(java.lang.Long l, java.lang.Long l2, java.lang.Long l3, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? 0L : l, (i & 2) != 0 ? 0L : l2, (i & 4) != 0 ? 0L : l3);
        }

        public final java.lang.Long getRecordsCount() {
            return this.recordsCount;
        }

        public final java.lang.Long getSegmentsCount() {
            return this.segmentsCount;
        }

        public final java.lang.Long getSegmentsTotalRawSize() {
            return this.segmentsTotalRawSize;
        }

        public final com.google.gson.JsonElement toJson() {
            com.google.gson.JsonObject jsonObject = new com.google.gson.JsonObject();
            java.lang.Long l = this.recordsCount;
            if (l != null) {
                jsonObject.addProperty("records_count", java.lang.Long.valueOf(l.longValue()));
            }
            java.lang.Long l2 = this.segmentsCount;
            if (l2 != null) {
                jsonObject.addProperty("segments_count", java.lang.Long.valueOf(l2.longValue()));
            }
            java.lang.Long l3 = this.segmentsTotalRawSize;
            if (l3 != null) {
                jsonObject.addProperty("segments_total_raw_size", java.lang.Long.valueOf(l3.longValue()));
            }
            return jsonObject;
        }

        @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/datadog/android/rum/model/ViewEvent$ReplayStats$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/rum/model/ViewEvent$ReplayStats;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/rum/model/ViewEvent$ReplayStats;", "Lcom/google/gson/JsonObject;", "jsonObject", "fromJsonObject", "(Lcom/google/gson/JsonObject;)Lcom/datadog/android/rum/model/ViewEvent$ReplayStats;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @kotlin.jvm.JvmStatic
            public final com.datadog.android.rum.model.ViewEvent.ReplayStats fromJson(java.lang.String jsonString) throws com.google.gson.JsonParseException {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonString, "");
                try {
                    com.google.gson.JsonObject asJsonObject = com.google.gson.JsonParser.parseString(jsonString).getAsJsonObject();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asJsonObject, "");
                    return fromJsonObject(asJsonObject);
                } catch (java.lang.IllegalStateException e) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type ReplayStats", e);
                }
            }

            @kotlin.jvm.JvmStatic
            public final com.datadog.android.rum.model.ViewEvent.ReplayStats fromJsonObject(com.google.gson.JsonObject jsonObject) throws com.google.gson.JsonParseException {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonObject, "");
                try {
                    com.google.gson.JsonElement jsonElement = jsonObject.get("records_count");
                    java.lang.Long valueOf = jsonElement != null ? java.lang.Long.valueOf(jsonElement.getAsLong()) : null;
                    com.google.gson.JsonElement jsonElement2 = jsonObject.get("segments_count");
                    java.lang.Long valueOf2 = jsonElement2 != null ? java.lang.Long.valueOf(jsonElement2.getAsLong()) : null;
                    com.google.gson.JsonElement jsonElement3 = jsonObject.get("segments_total_raw_size");
                    return new com.datadog.android.rum.model.ViewEvent.ReplayStats(valueOf, valueOf2, jsonElement3 != null ? java.lang.Long.valueOf(jsonElement3.getAsLong()) : null);
                } catch (java.lang.IllegalStateException e) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type ReplayStats", e);
                } catch (java.lang.NullPointerException e2) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type ReplayStats", e2);
                } catch (java.lang.NumberFormatException e3) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type ReplayStats", e3);
                }
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public final java.lang.String toString() {
            java.lang.Long l = this.recordsCount;
            java.lang.Long l2 = this.segmentsCount;
            java.lang.Long l3 = this.segmentsTotalRawSize;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ReplayStats(recordsCount=");
            sb.append(l);
            sb.append(", segmentsCount=");
            sb.append(l2);
            sb.append(", segmentsTotalRawSize=");
            sb.append(l3);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.lang.Long l = this.recordsCount;
            int hashCode = l == null ? 0 : l.hashCode();
            java.lang.Long l2 = this.segmentsCount;
            int hashCode2 = l2 == null ? 0 : l2.hashCode();
            java.lang.Long l3 = this.segmentsTotalRawSize;
            return (((hashCode * 31) + hashCode2) * 31) + (l3 != null ? l3.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.datadog.android.rum.model.ViewEvent.ReplayStats)) {
                return false;
            }
            com.datadog.android.rum.model.ViewEvent.ReplayStats replayStats = (com.datadog.android.rum.model.ViewEvent.ReplayStats) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.recordsCount, replayStats.recordsCount) && kotlin.jvm.internal.Intrinsics.areEqual(this.segmentsCount, replayStats.segmentsCount) && kotlin.jvm.internal.Intrinsics.areEqual(this.segmentsTotalRawSize, replayStats.segmentsTotalRawSize);
        }

        public final com.datadog.android.rum.model.ViewEvent.ReplayStats copy(java.lang.Long recordsCount, java.lang.Long segmentsCount, java.lang.Long segmentsTotalRawSize) {
            return new com.datadog.android.rum.model.ViewEvent.ReplayStats(recordsCount, segmentsCount, segmentsTotalRawSize);
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.Long getSegmentsTotalRawSize() {
            return this.segmentsTotalRawSize;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.Long getSegmentsCount() {
            return this.segmentsCount;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.Long getRecordsCount() {
            return this.recordsCount;
        }

        @kotlin.jvm.JvmStatic
        public static final com.datadog.android.rum.model.ViewEvent.ReplayStats fromJsonObject(com.google.gson.JsonObject jsonObject) throws com.google.gson.JsonParseException {
            return INSTANCE.fromJsonObject(jsonObject);
        }

        @kotlin.jvm.JvmStatic
        public static final com.datadog.android.rum.model.ViewEvent.ReplayStats fromJson(java.lang.String str) throws com.google.gson.JsonParseException {
            return INSTANCE.fromJson(str);
        }

        public static /* synthetic */ com.datadog.android.rum.model.ViewEvent.ReplayStats copy$default(com.datadog.android.rum.model.ViewEvent.ReplayStats replayStats, java.lang.Long l, java.lang.Long l2, java.lang.Long l3, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                l = replayStats.recordsCount;
            }
            if ((i & 2) != 0) {
                l2 = replayStats.segmentsCount;
            }
            if ((i & 4) != 0) {
                l3 = replayStats.segmentsTotalRawSize;
            }
            return replayStats.copy(l, l2, l3);
        }

        public ReplayStats() {
            this(null, null, null, 7, null);
        }
    }

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0004\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\b\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\u0007"}, d2 = {"Lcom/datadog/android/rum/model/ViewEvent$DdCls;", "", "", "devicePixelRatio", "<init>", "(Ljava/lang/Number;)V", "component1", "()Ljava/lang/Number;", "copy", "(Ljava/lang/Number;)Lcom/datadog/android/rum/model/ViewEvent$DdCls;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lcom/google/gson/JsonElement;", "toJson", "()Lcom/google/gson/JsonElement;", "", "toString", "()Ljava/lang/String;", "Ljava/lang/Number;", "getDevicePixelRatio", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class DdCls {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.datadog.android.rum.model.ViewEvent.DdCls.Companion INSTANCE = new com.datadog.android.rum.model.ViewEvent.DdCls.Companion(null);
        private final java.lang.Number devicePixelRatio;

        public DdCls(java.lang.Number number) {
            this.devicePixelRatio = number;
        }

        public /* synthetic */ DdCls(java.lang.Number number, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : number);
        }

        public final java.lang.Number getDevicePixelRatio() {
            return this.devicePixelRatio;
        }

        public final com.google.gson.JsonElement toJson() {
            com.google.gson.JsonObject jsonObject = new com.google.gson.JsonObject();
            java.lang.Number number = this.devicePixelRatio;
            if (number != null) {
                jsonObject.addProperty("device_pixel_ratio", number);
            }
            return jsonObject;
        }

        @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/datadog/android/rum/model/ViewEvent$DdCls$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/rum/model/ViewEvent$DdCls;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/rum/model/ViewEvent$DdCls;", "Lcom/google/gson/JsonObject;", "jsonObject", "fromJsonObject", "(Lcom/google/gson/JsonObject;)Lcom/datadog/android/rum/model/ViewEvent$DdCls;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @kotlin.jvm.JvmStatic
            public final com.datadog.android.rum.model.ViewEvent.DdCls fromJson(java.lang.String jsonString) throws com.google.gson.JsonParseException {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonString, "");
                try {
                    com.google.gson.JsonObject asJsonObject = com.google.gson.JsonParser.parseString(jsonString).getAsJsonObject();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asJsonObject, "");
                    return fromJsonObject(asJsonObject);
                } catch (java.lang.IllegalStateException e) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type DdCls", e);
                }
            }

            @kotlin.jvm.JvmStatic
            public final com.datadog.android.rum.model.ViewEvent.DdCls fromJsonObject(com.google.gson.JsonObject jsonObject) throws com.google.gson.JsonParseException {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonObject, "");
                try {
                    com.google.gson.JsonElement jsonElement = jsonObject.get("device_pixel_ratio");
                    return new com.datadog.android.rum.model.ViewEvent.DdCls(jsonElement != null ? jsonElement.getAsNumber() : null);
                } catch (java.lang.IllegalStateException e) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type DdCls", e);
                } catch (java.lang.NullPointerException e2) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type DdCls", e2);
                } catch (java.lang.NumberFormatException e3) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type DdCls", e3);
                }
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public final java.lang.String toString() {
            java.lang.Number number = this.devicePixelRatio;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("DdCls(devicePixelRatio=");
            sb.append(number);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.lang.Number number = this.devicePixelRatio;
            if (number == null) {
                return 0;
            }
            return number.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.datadog.android.rum.model.ViewEvent.DdCls) && kotlin.jvm.internal.Intrinsics.areEqual(this.devicePixelRatio, ((com.datadog.android.rum.model.ViewEvent.DdCls) other).devicePixelRatio);
        }

        public final com.datadog.android.rum.model.ViewEvent.DdCls copy(java.lang.Number devicePixelRatio) {
            return new com.datadog.android.rum.model.ViewEvent.DdCls(devicePixelRatio);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.Number getDevicePixelRatio() {
            return this.devicePixelRatio;
        }

        @kotlin.jvm.JvmStatic
        public static final com.datadog.android.rum.model.ViewEvent.DdCls fromJsonObject(com.google.gson.JsonObject jsonObject) throws com.google.gson.JsonParseException {
            return INSTANCE.fromJsonObject(jsonObject);
        }

        @kotlin.jvm.JvmStatic
        public static final com.datadog.android.rum.model.ViewEvent.DdCls fromJson(java.lang.String str) throws com.google.gson.JsonParseException {
            return INSTANCE.fromJson(str);
        }

        public static /* synthetic */ com.datadog.android.rum.model.ViewEvent.DdCls copy$default(com.datadog.android.rum.model.ViewEvent.DdCls ddCls, java.lang.Number number, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                number = ddCls.devicePixelRatio;
            }
            return ddCls.copy(number);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public DdCls() {
            this(null, 1, 0 == true ? 1 : 0);
        }
    }

    @kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\b\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ(\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\u000bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\t"}, d2 = {"Lcom/datadog/android/rum/model/ViewEvent$Profiling;", "", "Lcom/datadog/android/rum/model/ViewEvent$ProfilingStatus;", "status", "Lcom/datadog/android/rum/model/ViewEvent$ErrorReason;", "errorReason", "<init>", "(Lcom/datadog/android/rum/model/ViewEvent$ProfilingStatus;Lcom/datadog/android/rum/model/ViewEvent$ErrorReason;)V", "component1", "()Lcom/datadog/android/rum/model/ViewEvent$ProfilingStatus;", "component2", "()Lcom/datadog/android/rum/model/ViewEvent$ErrorReason;", "copy", "(Lcom/datadog/android/rum/model/ViewEvent$ProfilingStatus;Lcom/datadog/android/rum/model/ViewEvent$ErrorReason;)Lcom/datadog/android/rum/model/ViewEvent$Profiling;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lcom/google/gson/JsonElement;", "toJson", "()Lcom/google/gson/JsonElement;", "", "toString", "()Ljava/lang/String;", "Lcom/datadog/android/rum/model/ViewEvent$ErrorReason;", "getErrorReason", "Lcom/datadog/android/rum/model/ViewEvent$ProfilingStatus;", "getStatus", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class Profiling {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.datadog.android.rum.model.ViewEvent.Profiling.Companion INSTANCE = new com.datadog.android.rum.model.ViewEvent.Profiling.Companion(null);
        private final com.datadog.android.rum.model.ViewEvent.ErrorReason errorReason;
        private final com.datadog.android.rum.model.ViewEvent.ProfilingStatus status;

        public Profiling(com.datadog.android.rum.model.ViewEvent.ProfilingStatus profilingStatus, com.datadog.android.rum.model.ViewEvent.ErrorReason errorReason) {
            this.status = profilingStatus;
            this.errorReason = errorReason;
        }

        public /* synthetic */ Profiling(com.datadog.android.rum.model.ViewEvent.ProfilingStatus profilingStatus, com.datadog.android.rum.model.ViewEvent.ErrorReason errorReason, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : profilingStatus, (i & 2) != 0 ? null : errorReason);
        }

        public final com.datadog.android.rum.model.ViewEvent.ProfilingStatus getStatus() {
            return this.status;
        }

        public final com.datadog.android.rum.model.ViewEvent.ErrorReason getErrorReason() {
            return this.errorReason;
        }

        public final com.google.gson.JsonElement toJson() {
            com.google.gson.JsonObject jsonObject = new com.google.gson.JsonObject();
            com.datadog.android.rum.model.ViewEvent.ProfilingStatus profilingStatus = this.status;
            if (profilingStatus != null) {
                jsonObject.add("status", profilingStatus.toJson());
            }
            com.datadog.android.rum.model.ViewEvent.ErrorReason errorReason = this.errorReason;
            if (errorReason != null) {
                jsonObject.add("error_reason", errorReason.toJson());
            }
            return jsonObject;
        }

        @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/datadog/android/rum/model/ViewEvent$Profiling$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/rum/model/ViewEvent$Profiling;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/rum/model/ViewEvent$Profiling;", "Lcom/google/gson/JsonObject;", "jsonObject", "fromJsonObject", "(Lcom/google/gson/JsonObject;)Lcom/datadog/android/rum/model/ViewEvent$Profiling;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @kotlin.jvm.JvmStatic
            public final com.datadog.android.rum.model.ViewEvent.Profiling fromJson(java.lang.String jsonString) throws com.google.gson.JsonParseException {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonString, "");
                try {
                    com.google.gson.JsonObject asJsonObject = com.google.gson.JsonParser.parseString(jsonString).getAsJsonObject();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asJsonObject, "");
                    return fromJsonObject(asJsonObject);
                } catch (java.lang.IllegalStateException e) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type Profiling", e);
                }
            }

            @kotlin.jvm.JvmStatic
            public final com.datadog.android.rum.model.ViewEvent.Profiling fromJsonObject(com.google.gson.JsonObject jsonObject) throws com.google.gson.JsonParseException {
                java.lang.String asString;
                java.lang.String asString2;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonObject, "");
                try {
                    com.google.gson.JsonElement jsonElement = jsonObject.get("status");
                    com.datadog.android.rum.model.ViewEvent.ErrorReason errorReason = null;
                    com.datadog.android.rum.model.ViewEvent.ProfilingStatus fromJson = (jsonElement == null || (asString2 = jsonElement.getAsString()) == null) ? null : com.datadog.android.rum.model.ViewEvent.ProfilingStatus.INSTANCE.fromJson(asString2);
                    com.google.gson.JsonElement jsonElement2 = jsonObject.get("error_reason");
                    if (jsonElement2 != null && (asString = jsonElement2.getAsString()) != null) {
                        errorReason = com.datadog.android.rum.model.ViewEvent.ErrorReason.INSTANCE.fromJson(asString);
                    }
                    return new com.datadog.android.rum.model.ViewEvent.Profiling(fromJson, errorReason);
                } catch (java.lang.IllegalStateException e) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type Profiling", e);
                } catch (java.lang.NullPointerException e2) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type Profiling", e2);
                } catch (java.lang.NumberFormatException e3) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type Profiling", e3);
                }
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public final java.lang.String toString() {
            com.datadog.android.rum.model.ViewEvent.ProfilingStatus profilingStatus = this.status;
            com.datadog.android.rum.model.ViewEvent.ErrorReason errorReason = this.errorReason;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Profiling(status=");
            sb.append(profilingStatus);
            sb.append(", errorReason=");
            sb.append(errorReason);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            com.datadog.android.rum.model.ViewEvent.ProfilingStatus profilingStatus = this.status;
            int hashCode = profilingStatus == null ? 0 : profilingStatus.hashCode();
            com.datadog.android.rum.model.ViewEvent.ErrorReason errorReason = this.errorReason;
            return (hashCode * 31) + (errorReason != null ? errorReason.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.datadog.android.rum.model.ViewEvent.Profiling)) {
                return false;
            }
            com.datadog.android.rum.model.ViewEvent.Profiling profiling = (com.datadog.android.rum.model.ViewEvent.Profiling) other;
            return this.status == profiling.status && this.errorReason == profiling.errorReason;
        }

        public final com.datadog.android.rum.model.ViewEvent.Profiling copy(com.datadog.android.rum.model.ViewEvent.ProfilingStatus status, com.datadog.android.rum.model.ViewEvent.ErrorReason errorReason) {
            return new com.datadog.android.rum.model.ViewEvent.Profiling(status, errorReason);
        }

        /* renamed from: component2, reason: from getter */
        public final com.datadog.android.rum.model.ViewEvent.ErrorReason getErrorReason() {
            return this.errorReason;
        }

        /* renamed from: component1, reason: from getter */
        public final com.datadog.android.rum.model.ViewEvent.ProfilingStatus getStatus() {
            return this.status;
        }

        @kotlin.jvm.JvmStatic
        public static final com.datadog.android.rum.model.ViewEvent.Profiling fromJsonObject(com.google.gson.JsonObject jsonObject) throws com.google.gson.JsonParseException {
            return INSTANCE.fromJsonObject(jsonObject);
        }

        @kotlin.jvm.JvmStatic
        public static final com.datadog.android.rum.model.ViewEvent.Profiling fromJson(java.lang.String str) throws com.google.gson.JsonParseException {
            return INSTANCE.fromJson(str);
        }

        public static /* synthetic */ com.datadog.android.rum.model.ViewEvent.Profiling copy$default(com.datadog.android.rum.model.ViewEvent.Profiling profiling, com.datadog.android.rum.model.ViewEvent.ProfilingStatus profilingStatus, com.datadog.android.rum.model.ViewEvent.ErrorReason errorReason, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                profilingStatus = profiling.status;
            }
            if ((i & 2) != 0) {
                errorReason = profiling.errorReason;
            }
            return profiling.copy(profilingStatus, errorReason);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Profiling() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/datadog/android/rum/model/ViewEvent$ContainerView;", "", "", "id", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/datadog/android/rum/model/ViewEvent$ContainerView;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lcom/google/gson/JsonElement;", "toJson", "()Lcom/google/gson/JsonElement;", "toString", "Ljava/lang/String;", "getId", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class ContainerView {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.datadog.android.rum.model.ViewEvent.ContainerView.Companion INSTANCE = new com.datadog.android.rum.model.ViewEvent.ContainerView.Companion(null);
        private final java.lang.String id;

        public ContainerView(java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.id = str;
        }

        public final java.lang.String getId() {
            return this.id;
        }

        public final com.google.gson.JsonElement toJson() {
            com.google.gson.JsonObject jsonObject = new com.google.gson.JsonObject();
            jsonObject.addProperty("id", this.id);
            return jsonObject;
        }

        @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/datadog/android/rum/model/ViewEvent$ContainerView$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/rum/model/ViewEvent$ContainerView;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/rum/model/ViewEvent$ContainerView;", "Lcom/google/gson/JsonObject;", "jsonObject", "fromJsonObject", "(Lcom/google/gson/JsonObject;)Lcom/datadog/android/rum/model/ViewEvent$ContainerView;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @kotlin.jvm.JvmStatic
            public final com.datadog.android.rum.model.ViewEvent.ContainerView fromJson(java.lang.String jsonString) throws com.google.gson.JsonParseException {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonString, "");
                try {
                    com.google.gson.JsonObject asJsonObject = com.google.gson.JsonParser.parseString(jsonString).getAsJsonObject();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asJsonObject, "");
                    return fromJsonObject(asJsonObject);
                } catch (java.lang.IllegalStateException e) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type ContainerView", e);
                }
            }

            @kotlin.jvm.JvmStatic
            public final com.datadog.android.rum.model.ViewEvent.ContainerView fromJsonObject(com.google.gson.JsonObject jsonObject) throws com.google.gson.JsonParseException {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonObject, "");
                try {
                    java.lang.String asString = jsonObject.get("id").getAsString();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asString, "");
                    return new com.datadog.android.rum.model.ViewEvent.ContainerView(asString);
                } catch (java.lang.IllegalStateException e) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type ContainerView", e);
                } catch (java.lang.NullPointerException e2) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type ContainerView", e2);
                } catch (java.lang.NumberFormatException e3) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type ContainerView", e3);
                }
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public final java.lang.String toString() {
            java.lang.String str = this.id;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ContainerView(id=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.id.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.datadog.android.rum.model.ViewEvent.ContainerView) && kotlin.jvm.internal.Intrinsics.areEqual(this.id, ((com.datadog.android.rum.model.ViewEvent.ContainerView) other).id);
        }

        public final com.datadog.android.rum.model.ViewEvent.ContainerView copy(java.lang.String id) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
            return new com.datadog.android.rum.model.ViewEvent.ContainerView(id);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getId() {
            return this.id;
        }

        @kotlin.jvm.JvmStatic
        public static final com.datadog.android.rum.model.ViewEvent.ContainerView fromJsonObject(com.google.gson.JsonObject jsonObject) throws com.google.gson.JsonParseException {
            return INSTANCE.fromJsonObject(jsonObject);
        }

        @kotlin.jvm.JvmStatic
        public static final com.datadog.android.rum.model.ViewEvent.ContainerView fromJson(java.lang.String str) throws com.google.gson.JsonParseException {
            return INSTANCE.fromJson(str);
        }

        public static /* synthetic */ com.datadog.android.rum.model.ViewEvent.ContainerView copy$default(com.datadog.android.rum.model.ViewEvent.ContainerView containerView, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = containerView.id;
            }
            return containerView.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0004\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0086\b\u0018\u0000 ,2\u00020\u0001:\u0001,B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0014JJ\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\r\u0010 \u001a\u00020\u001f¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\"\u0010\u0012R\u0019\u0010\n\u001a\u0004\u0018\u00010\b8\u0007¢\u0006\f\n\u0004\b\n\u0010#\u001a\u0004\b$\u0010\u0014R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010#\u001a\u0004\b%\u0010\u0014R\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010&\u001a\u0004\b'\u0010\u000eR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010(\u001a\u0004\b)\u0010\u0012R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010*\u001a\u0004\b+\u0010\u0010"}, d2 = {"Lcom/datadog/android/rum/model/ViewEvent$PerformanceCls;", "", "", "score", "", "timestamp", "", "targetSelector", "Lcom/datadog/android/rum/model/ViewEvent$PreviousRect;", "previousRect", "currentRect", "<init>", "(Ljava/lang/Number;Ljava/lang/Long;Ljava/lang/String;Lcom/datadog/android/rum/model/ViewEvent$PreviousRect;Lcom/datadog/android/rum/model/ViewEvent$PreviousRect;)V", "component1", "()Ljava/lang/Number;", "component2", "()Ljava/lang/Long;", "component3", "()Ljava/lang/String;", "component4", "()Lcom/datadog/android/rum/model/ViewEvent$PreviousRect;", "component5", "copy", "(Ljava/lang/Number;Ljava/lang/Long;Ljava/lang/String;Lcom/datadog/android/rum/model/ViewEvent$PreviousRect;Lcom/datadog/android/rum/model/ViewEvent$PreviousRect;)Lcom/datadog/android/rum/model/ViewEvent$PerformanceCls;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lcom/google/gson/JsonElement;", "toJson", "()Lcom/google/gson/JsonElement;", "toString", "Lcom/datadog/android/rum/model/ViewEvent$PreviousRect;", "getCurrentRect", "getPreviousRect", "Ljava/lang/Number;", "getScore", "Ljava/lang/String;", "getTargetSelector", "Ljava/lang/Long;", "getTimestamp", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class PerformanceCls {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.datadog.android.rum.model.ViewEvent.PerformanceCls.Companion INSTANCE = new com.datadog.android.rum.model.ViewEvent.PerformanceCls.Companion(null);
        private final com.datadog.android.rum.model.ViewEvent.PreviousRect currentRect;
        private final com.datadog.android.rum.model.ViewEvent.PreviousRect previousRect;
        private final java.lang.Number score;
        private final java.lang.String targetSelector;
        private final java.lang.Long timestamp;

        public PerformanceCls(java.lang.Number number, java.lang.Long l, java.lang.String str, com.datadog.android.rum.model.ViewEvent.PreviousRect previousRect, com.datadog.android.rum.model.ViewEvent.PreviousRect previousRect2) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(number, "");
            this.score = number;
            this.timestamp = l;
            this.targetSelector = str;
            this.previousRect = previousRect;
            this.currentRect = previousRect2;
        }

        public /* synthetic */ PerformanceCls(java.lang.Number number, java.lang.Long l, java.lang.String str, com.datadog.android.rum.model.ViewEvent.PreviousRect previousRect, com.datadog.android.rum.model.ViewEvent.PreviousRect previousRect2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(number, (i & 2) != 0 ? null : l, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : previousRect, (i & 16) != 0 ? null : previousRect2);
        }

        public final java.lang.Number getScore() {
            return this.score;
        }

        public final java.lang.Long getTimestamp() {
            return this.timestamp;
        }

        public final java.lang.String getTargetSelector() {
            return this.targetSelector;
        }

        public final com.datadog.android.rum.model.ViewEvent.PreviousRect getPreviousRect() {
            return this.previousRect;
        }

        public final com.datadog.android.rum.model.ViewEvent.PreviousRect getCurrentRect() {
            return this.currentRect;
        }

        public final com.google.gson.JsonElement toJson() {
            com.google.gson.JsonObject jsonObject = new com.google.gson.JsonObject();
            jsonObject.addProperty("score", this.score);
            java.lang.Long l = this.timestamp;
            if (l != null) {
                jsonObject.addProperty("timestamp", java.lang.Long.valueOf(l.longValue()));
            }
            java.lang.String str = this.targetSelector;
            if (str != null) {
                jsonObject.addProperty("target_selector", str);
            }
            com.datadog.android.rum.model.ViewEvent.PreviousRect previousRect = this.previousRect;
            if (previousRect != null) {
                jsonObject.add("previous_rect", previousRect.toJson());
            }
            com.datadog.android.rum.model.ViewEvent.PreviousRect previousRect2 = this.currentRect;
            if (previousRect2 != null) {
                jsonObject.add("current_rect", previousRect2.toJson());
            }
            return jsonObject;
        }

        @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/datadog/android/rum/model/ViewEvent$PerformanceCls$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/rum/model/ViewEvent$PerformanceCls;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/rum/model/ViewEvent$PerformanceCls;", "Lcom/google/gson/JsonObject;", "jsonObject", "fromJsonObject", "(Lcom/google/gson/JsonObject;)Lcom/datadog/android/rum/model/ViewEvent$PerformanceCls;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @kotlin.jvm.JvmStatic
            public final com.datadog.android.rum.model.ViewEvent.PerformanceCls fromJson(java.lang.String jsonString) throws com.google.gson.JsonParseException {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonString, "");
                try {
                    com.google.gson.JsonObject asJsonObject = com.google.gson.JsonParser.parseString(jsonString).getAsJsonObject();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asJsonObject, "");
                    return fromJsonObject(asJsonObject);
                } catch (java.lang.IllegalStateException e) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type PerformanceCls", e);
                }
            }

            @kotlin.jvm.JvmStatic
            public final com.datadog.android.rum.model.ViewEvent.PerformanceCls fromJsonObject(com.google.gson.JsonObject jsonObject) throws com.google.gson.JsonParseException {
                com.google.gson.JsonObject asJsonObject;
                com.google.gson.JsonObject asJsonObject2;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonObject, "");
                try {
                    java.lang.Number asNumber = jsonObject.get("score").getAsNumber();
                    com.google.gson.JsonElement jsonElement = jsonObject.get("timestamp");
                    java.lang.Long valueOf = jsonElement != null ? java.lang.Long.valueOf(jsonElement.getAsLong()) : null;
                    com.google.gson.JsonElement jsonElement2 = jsonObject.get("target_selector");
                    java.lang.String asString = jsonElement2 != null ? jsonElement2.getAsString() : null;
                    com.google.gson.JsonElement jsonElement3 = jsonObject.get("previous_rect");
                    com.datadog.android.rum.model.ViewEvent.PreviousRect fromJsonObject = (jsonElement3 == null || (asJsonObject2 = jsonElement3.getAsJsonObject()) == null) ? null : com.datadog.android.rum.model.ViewEvent.PreviousRect.INSTANCE.fromJsonObject(asJsonObject2);
                    com.google.gson.JsonElement jsonElement4 = jsonObject.get("current_rect");
                    com.datadog.android.rum.model.ViewEvent.PreviousRect fromJsonObject2 = (jsonElement4 == null || (asJsonObject = jsonElement4.getAsJsonObject()) == null) ? null : com.datadog.android.rum.model.ViewEvent.PreviousRect.INSTANCE.fromJsonObject(asJsonObject);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asNumber, "");
                    return new com.datadog.android.rum.model.ViewEvent.PerformanceCls(asNumber, valueOf, asString, fromJsonObject, fromJsonObject2);
                } catch (java.lang.IllegalStateException e) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type PerformanceCls", e);
                } catch (java.lang.NullPointerException e2) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type PerformanceCls", e2);
                } catch (java.lang.NumberFormatException e3) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type PerformanceCls", e3);
                }
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public final java.lang.String toString() {
            java.lang.Number number = this.score;
            java.lang.Long l = this.timestamp;
            java.lang.String str = this.targetSelector;
            com.datadog.android.rum.model.ViewEvent.PreviousRect previousRect = this.previousRect;
            com.datadog.android.rum.model.ViewEvent.PreviousRect previousRect2 = this.currentRect;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("PerformanceCls(score=");
            sb.append(number);
            sb.append(", timestamp=");
            sb.append(l);
            sb.append(", targetSelector=");
            sb.append(str);
            sb.append(", previousRect=");
            sb.append(previousRect);
            sb.append(", currentRect=");
            sb.append(previousRect2);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.score.hashCode();
            java.lang.Long l = this.timestamp;
            int hashCode2 = l == null ? 0 : l.hashCode();
            java.lang.String str = this.targetSelector;
            int hashCode3 = str == null ? 0 : str.hashCode();
            com.datadog.android.rum.model.ViewEvent.PreviousRect previousRect = this.previousRect;
            int hashCode4 = previousRect == null ? 0 : previousRect.hashCode();
            com.datadog.android.rum.model.ViewEvent.PreviousRect previousRect2 = this.currentRect;
            return (((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + (previousRect2 != null ? previousRect2.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.datadog.android.rum.model.ViewEvent.PerformanceCls)) {
                return false;
            }
            com.datadog.android.rum.model.ViewEvent.PerformanceCls performanceCls = (com.datadog.android.rum.model.ViewEvent.PerformanceCls) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.score, performanceCls.score) && kotlin.jvm.internal.Intrinsics.areEqual(this.timestamp, performanceCls.timestamp) && kotlin.jvm.internal.Intrinsics.areEqual(this.targetSelector, performanceCls.targetSelector) && kotlin.jvm.internal.Intrinsics.areEqual(this.previousRect, performanceCls.previousRect) && kotlin.jvm.internal.Intrinsics.areEqual(this.currentRect, performanceCls.currentRect);
        }

        public final com.datadog.android.rum.model.ViewEvent.PerformanceCls copy(java.lang.Number score, java.lang.Long timestamp, java.lang.String targetSelector, com.datadog.android.rum.model.ViewEvent.PreviousRect previousRect, com.datadog.android.rum.model.ViewEvent.PreviousRect currentRect) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(score, "");
            return new com.datadog.android.rum.model.ViewEvent.PerformanceCls(score, timestamp, targetSelector, previousRect, currentRect);
        }

        /* renamed from: component5, reason: from getter */
        public final com.datadog.android.rum.model.ViewEvent.PreviousRect getCurrentRect() {
            return this.currentRect;
        }

        /* renamed from: component4, reason: from getter */
        public final com.datadog.android.rum.model.ViewEvent.PreviousRect getPreviousRect() {
            return this.previousRect;
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String getTargetSelector() {
            return this.targetSelector;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.Long getTimestamp() {
            return this.timestamp;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.Number getScore() {
            return this.score;
        }

        @kotlin.jvm.JvmStatic
        public static final com.datadog.android.rum.model.ViewEvent.PerformanceCls fromJsonObject(com.google.gson.JsonObject jsonObject) throws com.google.gson.JsonParseException {
            return INSTANCE.fromJsonObject(jsonObject);
        }

        @kotlin.jvm.JvmStatic
        public static final com.datadog.android.rum.model.ViewEvent.PerformanceCls fromJson(java.lang.String str) throws com.google.gson.JsonParseException {
            return INSTANCE.fromJson(str);
        }

        public static /* synthetic */ com.datadog.android.rum.model.ViewEvent.PerformanceCls copy$default(com.datadog.android.rum.model.ViewEvent.PerformanceCls performanceCls, java.lang.Number number, java.lang.Long l, java.lang.String str, com.datadog.android.rum.model.ViewEvent.PreviousRect previousRect, com.datadog.android.rum.model.ViewEvent.PreviousRect previousRect2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                number = performanceCls.score;
            }
            if ((i & 2) != 0) {
                l = performanceCls.timestamp;
            }
            java.lang.Long l2 = l;
            if ((i & 4) != 0) {
                str = performanceCls.targetSelector;
            }
            java.lang.String str2 = str;
            if ((i & 8) != 0) {
                previousRect = performanceCls.previousRect;
            }
            com.datadog.android.rum.model.ViewEvent.PreviousRect previousRect3 = previousRect;
            if ((i & 16) != 0) {
                previousRect2 = performanceCls.currentRect;
            }
            return performanceCls.copy(number, l2, str2, previousRect3, previousRect2);
        }
    }

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\b\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\u0007"}, d2 = {"Lcom/datadog/android/rum/model/ViewEvent$Fcp;", "", "", "timestamp", "<init>", "(J)V", "component1", "()J", "copy", "(J)Lcom/datadog/android/rum/model/ViewEvent$Fcp;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lcom/google/gson/JsonElement;", "toJson", "()Lcom/google/gson/JsonElement;", "", "toString", "()Ljava/lang/String;", "J", "getTimestamp", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class Fcp {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.datadog.android.rum.model.ViewEvent.Fcp.Companion INSTANCE = new com.datadog.android.rum.model.ViewEvent.Fcp.Companion(null);
        private final long timestamp;

        public Fcp(long j) {
            this.timestamp = j;
        }

        public final long getTimestamp() {
            return this.timestamp;
        }

        public final com.google.gson.JsonElement toJson() {
            com.google.gson.JsonObject jsonObject = new com.google.gson.JsonObject();
            jsonObject.addProperty("timestamp", java.lang.Long.valueOf(this.timestamp));
            return jsonObject;
        }

        @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/datadog/android/rum/model/ViewEvent$Fcp$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/rum/model/ViewEvent$Fcp;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/rum/model/ViewEvent$Fcp;", "Lcom/google/gson/JsonObject;", "jsonObject", "fromJsonObject", "(Lcom/google/gson/JsonObject;)Lcom/datadog/android/rum/model/ViewEvent$Fcp;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @kotlin.jvm.JvmStatic
            public final com.datadog.android.rum.model.ViewEvent.Fcp fromJson(java.lang.String jsonString) throws com.google.gson.JsonParseException {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonString, "");
                try {
                    com.google.gson.JsonObject asJsonObject = com.google.gson.JsonParser.parseString(jsonString).getAsJsonObject();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asJsonObject, "");
                    return fromJsonObject(asJsonObject);
                } catch (java.lang.IllegalStateException e) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type Fcp", e);
                }
            }

            @kotlin.jvm.JvmStatic
            public final com.datadog.android.rum.model.ViewEvent.Fcp fromJsonObject(com.google.gson.JsonObject jsonObject) throws com.google.gson.JsonParseException {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonObject, "");
                try {
                    return new com.datadog.android.rum.model.ViewEvent.Fcp(jsonObject.get("timestamp").getAsLong());
                } catch (java.lang.IllegalStateException e) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type Fcp", e);
                } catch (java.lang.NullPointerException e2) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type Fcp", e2);
                } catch (java.lang.NumberFormatException e3) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type Fcp", e3);
                }
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public final java.lang.String toString() {
            long j = this.timestamp;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Fcp(timestamp=");
            sb.append(j);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return java.lang.Long.hashCode(this.timestamp);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.datadog.android.rum.model.ViewEvent.Fcp) && this.timestamp == ((com.datadog.android.rum.model.ViewEvent.Fcp) other).timestamp;
        }

        public final com.datadog.android.rum.model.ViewEvent.Fcp copy(long timestamp) {
            return new com.datadog.android.rum.model.ViewEvent.Fcp(timestamp);
        }

        /* renamed from: component1, reason: from getter */
        public final long getTimestamp() {
            return this.timestamp;
        }

        @kotlin.jvm.JvmStatic
        public static final com.datadog.android.rum.model.ViewEvent.Fcp fromJsonObject(com.google.gson.JsonObject jsonObject) throws com.google.gson.JsonParseException {
            return INSTANCE.fromJsonObject(jsonObject);
        }

        @kotlin.jvm.JvmStatic
        public static final com.datadog.android.rum.model.ViewEvent.Fcp fromJson(java.lang.String str) throws com.google.gson.JsonParseException {
            return INSTANCE.fromJson(str);
        }

        public static /* synthetic */ com.datadog.android.rum.model.ViewEvent.Fcp copy$default(com.datadog.android.rum.model.ViewEvent.Fcp fcp, long j, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                j = fcp.timestamp;
            }
            return fcp.copy(j);
        }
    }

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\b\u0018\u0000  2\u00020\u0001:\u0001 B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ0\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u001a\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\nR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001d\u001a\u0004\b\u001e\u0010\rR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001b\u001a\u0004\b\u001f\u0010\n"}, d2 = {"Lcom/datadog/android/rum/model/ViewEvent$Fid;", "", "", "duration", "timestamp", "", "targetSelector", "<init>", "(JJLjava/lang/String;)V", "component1", "()J", "component2", "component3", "()Ljava/lang/String;", "copy", "(JJLjava/lang/String;)Lcom/datadog/android/rum/model/ViewEvent$Fid;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lcom/google/gson/JsonElement;", "toJson", "()Lcom/google/gson/JsonElement;", "toString", "J", "getDuration", "Ljava/lang/String;", "getTargetSelector", "getTimestamp", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class Fid {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.datadog.android.rum.model.ViewEvent.Fid.Companion INSTANCE = new com.datadog.android.rum.model.ViewEvent.Fid.Companion(null);
        private final long duration;
        private final java.lang.String targetSelector;
        private final long timestamp;

        public Fid(long j, long j2, java.lang.String str) {
            this.duration = j;
            this.timestamp = j2;
            this.targetSelector = str;
        }

        public /* synthetic */ Fid(long j, long j2, java.lang.String str, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(j, j2, (i & 4) != 0 ? null : str);
        }

        public final long getDuration() {
            return this.duration;
        }

        public final long getTimestamp() {
            return this.timestamp;
        }

        public final java.lang.String getTargetSelector() {
            return this.targetSelector;
        }

        public final com.google.gson.JsonElement toJson() {
            com.google.gson.JsonObject jsonObject = new com.google.gson.JsonObject();
            jsonObject.addProperty("duration", java.lang.Long.valueOf(this.duration));
            jsonObject.addProperty("timestamp", java.lang.Long.valueOf(this.timestamp));
            java.lang.String str = this.targetSelector;
            if (str != null) {
                jsonObject.addProperty("target_selector", str);
            }
            return jsonObject;
        }

        @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/datadog/android/rum/model/ViewEvent$Fid$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/rum/model/ViewEvent$Fid;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/rum/model/ViewEvent$Fid;", "Lcom/google/gson/JsonObject;", "jsonObject", "fromJsonObject", "(Lcom/google/gson/JsonObject;)Lcom/datadog/android/rum/model/ViewEvent$Fid;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @kotlin.jvm.JvmStatic
            public final com.datadog.android.rum.model.ViewEvent.Fid fromJson(java.lang.String jsonString) throws com.google.gson.JsonParseException {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonString, "");
                try {
                    com.google.gson.JsonObject asJsonObject = com.google.gson.JsonParser.parseString(jsonString).getAsJsonObject();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asJsonObject, "");
                    return fromJsonObject(asJsonObject);
                } catch (java.lang.IllegalStateException e) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type Fid", e);
                }
            }

            @kotlin.jvm.JvmStatic
            public final com.datadog.android.rum.model.ViewEvent.Fid fromJsonObject(com.google.gson.JsonObject jsonObject) throws com.google.gson.JsonParseException {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonObject, "");
                try {
                    long asLong = jsonObject.get("duration").getAsLong();
                    long asLong2 = jsonObject.get("timestamp").getAsLong();
                    com.google.gson.JsonElement jsonElement = jsonObject.get("target_selector");
                    return new com.datadog.android.rum.model.ViewEvent.Fid(asLong, asLong2, jsonElement != null ? jsonElement.getAsString() : null);
                } catch (java.lang.IllegalStateException e) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type Fid", e);
                } catch (java.lang.NullPointerException e2) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type Fid", e2);
                } catch (java.lang.NumberFormatException e3) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type Fid", e3);
                }
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public final java.lang.String toString() {
            long j = this.duration;
            long j2 = this.timestamp;
            java.lang.String str = this.targetSelector;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Fid(duration=");
            sb.append(j);
            sb.append(", timestamp=");
            sb.append(j2);
            sb.append(", targetSelector=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = java.lang.Long.hashCode(this.duration);
            int hashCode2 = java.lang.Long.hashCode(this.timestamp);
            java.lang.String str = this.targetSelector;
            return (((hashCode * 31) + hashCode2) * 31) + (str == null ? 0 : str.hashCode());
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.datadog.android.rum.model.ViewEvent.Fid)) {
                return false;
            }
            com.datadog.android.rum.model.ViewEvent.Fid fid = (com.datadog.android.rum.model.ViewEvent.Fid) other;
            return this.duration == fid.duration && this.timestamp == fid.timestamp && kotlin.jvm.internal.Intrinsics.areEqual(this.targetSelector, fid.targetSelector);
        }

        public final com.datadog.android.rum.model.ViewEvent.Fid copy(long duration, long timestamp, java.lang.String targetSelector) {
            return new com.datadog.android.rum.model.ViewEvent.Fid(duration, timestamp, targetSelector);
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String getTargetSelector() {
            return this.targetSelector;
        }

        /* renamed from: component2, reason: from getter */
        public final long getTimestamp() {
            return this.timestamp;
        }

        /* renamed from: component1, reason: from getter */
        public final long getDuration() {
            return this.duration;
        }

        @kotlin.jvm.JvmStatic
        public static final com.datadog.android.rum.model.ViewEvent.Fid fromJsonObject(com.google.gson.JsonObject jsonObject) throws com.google.gson.JsonParseException {
            return INSTANCE.fromJsonObject(jsonObject);
        }

        @kotlin.jvm.JvmStatic
        public static final com.datadog.android.rum.model.ViewEvent.Fid fromJson(java.lang.String str) throws com.google.gson.JsonParseException {
            return INSTANCE.fromJson(str);
        }

        public static /* synthetic */ com.datadog.android.rum.model.ViewEvent.Fid copy$default(com.datadog.android.rum.model.ViewEvent.Fid fid, long j, long j2, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                j = fid.duration;
            }
            long j3 = j;
            if ((i & 2) != 0) {
                j2 = fid.timestamp;
            }
            long j4 = j2;
            if ((i & 4) != 0) {
                str = fid.targetSelector;
            }
            return fid.copy(j3, j4, str);
        }
    }

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\b\u0018\u0000 \"2\u00020\u0001:\u0001\"B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ2\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\nR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001e\u001a\u0004\b\u001f\u0010\u000eR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010 \u001a\u0004\b!\u0010\f"}, d2 = {"Lcom/datadog/android/rum/model/ViewEvent$Inp;", "", "", "duration", "timestamp", "", "targetSelector", "<init>", "(JLjava/lang/Long;Ljava/lang/String;)V", "component1", "()J", "component2", "()Ljava/lang/Long;", "component3", "()Ljava/lang/String;", "copy", "(JLjava/lang/Long;Ljava/lang/String;)Lcom/datadog/android/rum/model/ViewEvent$Inp;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lcom/google/gson/JsonElement;", "toJson", "()Lcom/google/gson/JsonElement;", "toString", "J", "getDuration", "Ljava/lang/String;", "getTargetSelector", "Ljava/lang/Long;", "getTimestamp", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class Inp {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.datadog.android.rum.model.ViewEvent.Inp.Companion INSTANCE = new com.datadog.android.rum.model.ViewEvent.Inp.Companion(null);
        private final long duration;
        private final java.lang.String targetSelector;
        private final java.lang.Long timestamp;

        public Inp(long j, java.lang.Long l, java.lang.String str) {
            this.duration = j;
            this.timestamp = l;
            this.targetSelector = str;
        }

        public /* synthetic */ Inp(long j, java.lang.Long l, java.lang.String str, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(j, (i & 2) != 0 ? null : l, (i & 4) != 0 ? null : str);
        }

        public final long getDuration() {
            return this.duration;
        }

        public final java.lang.Long getTimestamp() {
            return this.timestamp;
        }

        public final java.lang.String getTargetSelector() {
            return this.targetSelector;
        }

        public final com.google.gson.JsonElement toJson() {
            com.google.gson.JsonObject jsonObject = new com.google.gson.JsonObject();
            jsonObject.addProperty("duration", java.lang.Long.valueOf(this.duration));
            java.lang.Long l = this.timestamp;
            if (l != null) {
                jsonObject.addProperty("timestamp", java.lang.Long.valueOf(l.longValue()));
            }
            java.lang.String str = this.targetSelector;
            if (str != null) {
                jsonObject.addProperty("target_selector", str);
            }
            return jsonObject;
        }

        @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/datadog/android/rum/model/ViewEvent$Inp$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/rum/model/ViewEvent$Inp;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/rum/model/ViewEvent$Inp;", "Lcom/google/gson/JsonObject;", "jsonObject", "fromJsonObject", "(Lcom/google/gson/JsonObject;)Lcom/datadog/android/rum/model/ViewEvent$Inp;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @kotlin.jvm.JvmStatic
            public final com.datadog.android.rum.model.ViewEvent.Inp fromJson(java.lang.String jsonString) throws com.google.gson.JsonParseException {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonString, "");
                try {
                    com.google.gson.JsonObject asJsonObject = com.google.gson.JsonParser.parseString(jsonString).getAsJsonObject();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asJsonObject, "");
                    return fromJsonObject(asJsonObject);
                } catch (java.lang.IllegalStateException e) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type Inp", e);
                }
            }

            @kotlin.jvm.JvmStatic
            public final com.datadog.android.rum.model.ViewEvent.Inp fromJsonObject(com.google.gson.JsonObject jsonObject) throws com.google.gson.JsonParseException {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonObject, "");
                try {
                    long asLong = jsonObject.get("duration").getAsLong();
                    com.google.gson.JsonElement jsonElement = jsonObject.get("timestamp");
                    java.lang.Long valueOf = jsonElement != null ? java.lang.Long.valueOf(jsonElement.getAsLong()) : null;
                    com.google.gson.JsonElement jsonElement2 = jsonObject.get("target_selector");
                    return new com.datadog.android.rum.model.ViewEvent.Inp(asLong, valueOf, jsonElement2 != null ? jsonElement2.getAsString() : null);
                } catch (java.lang.IllegalStateException e) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type Inp", e);
                } catch (java.lang.NullPointerException e2) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type Inp", e2);
                } catch (java.lang.NumberFormatException e3) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type Inp", e3);
                }
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public final java.lang.String toString() {
            long j = this.duration;
            java.lang.Long l = this.timestamp;
            java.lang.String str = this.targetSelector;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Inp(duration=");
            sb.append(j);
            sb.append(", timestamp=");
            sb.append(l);
            sb.append(", targetSelector=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = java.lang.Long.hashCode(this.duration);
            java.lang.Long l = this.timestamp;
            int hashCode2 = l == null ? 0 : l.hashCode();
            java.lang.String str = this.targetSelector;
            return (((hashCode * 31) + hashCode2) * 31) + (str != null ? str.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.datadog.android.rum.model.ViewEvent.Inp)) {
                return false;
            }
            com.datadog.android.rum.model.ViewEvent.Inp inp = (com.datadog.android.rum.model.ViewEvent.Inp) other;
            return this.duration == inp.duration && kotlin.jvm.internal.Intrinsics.areEqual(this.timestamp, inp.timestamp) && kotlin.jvm.internal.Intrinsics.areEqual(this.targetSelector, inp.targetSelector);
        }

        public final com.datadog.android.rum.model.ViewEvent.Inp copy(long duration, java.lang.Long timestamp, java.lang.String targetSelector) {
            return new com.datadog.android.rum.model.ViewEvent.Inp(duration, timestamp, targetSelector);
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String getTargetSelector() {
            return this.targetSelector;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.Long getTimestamp() {
            return this.timestamp;
        }

        /* renamed from: component1, reason: from getter */
        public final long getDuration() {
            return this.duration;
        }

        @kotlin.jvm.JvmStatic
        public static final com.datadog.android.rum.model.ViewEvent.Inp fromJsonObject(com.google.gson.JsonObject jsonObject) throws com.google.gson.JsonParseException {
            return INSTANCE.fromJsonObject(jsonObject);
        }

        @kotlin.jvm.JvmStatic
        public static final com.datadog.android.rum.model.ViewEvent.Inp fromJson(java.lang.String str) throws com.google.gson.JsonParseException {
            return INSTANCE.fromJson(str);
        }

        public static /* synthetic */ com.datadog.android.rum.model.ViewEvent.Inp copy$default(com.datadog.android.rum.model.ViewEvent.Inp inp, long j, java.lang.Long l, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                j = inp.duration;
            }
            if ((i & 2) != 0) {
                l = inp.timestamp;
            }
            if ((i & 4) != 0) {
                str = inp.targetSelector;
            }
            return inp.copy(j, l, str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0086\b\u0018\u0000 \"2\u00020\u0001:\u0001\"B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ2\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001a\u0010\fR$\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001c\u0010\f\"\u0004\b\u001d\u0010\u001eR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001f\u0010\fR\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\n"}, d2 = {"Lcom/datadog/android/rum/model/ViewEvent$Lcp;", "", "", "timestamp", "", "targetSelector", "resourceUrl", "<init>", "(JLjava/lang/String;Ljava/lang/String;)V", "component1", "()J", "component2", "()Ljava/lang/String;", "component3", "copy", "(JLjava/lang/String;Ljava/lang/String;)Lcom/datadog/android/rum/model/ViewEvent$Lcp;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lcom/google/gson/JsonElement;", "toJson", "()Lcom/google/gson/JsonElement;", "toString", "Ljava/lang/String;", "getResourceUrl", "setResourceUrl", "(Ljava/lang/String;)V", "getTargetSelector", "J", "getTimestamp", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class Lcp {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.datadog.android.rum.model.ViewEvent.Lcp.Companion INSTANCE = new com.datadog.android.rum.model.ViewEvent.Lcp.Companion(null);
        private java.lang.String resourceUrl;
        private final java.lang.String targetSelector;
        private final long timestamp;

        public Lcp(long j, java.lang.String str, java.lang.String str2) {
            this.timestamp = j;
            this.targetSelector = str;
            this.resourceUrl = str2;
        }

        public /* synthetic */ Lcp(long j, java.lang.String str, java.lang.String str2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(j, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2);
        }

        public final long getTimestamp() {
            return this.timestamp;
        }

        public final java.lang.String getTargetSelector() {
            return this.targetSelector;
        }

        public final java.lang.String getResourceUrl() {
            return this.resourceUrl;
        }

        public final void setResourceUrl(java.lang.String str) {
            this.resourceUrl = str;
        }

        public final com.google.gson.JsonElement toJson() {
            com.google.gson.JsonObject jsonObject = new com.google.gson.JsonObject();
            jsonObject.addProperty("timestamp", java.lang.Long.valueOf(this.timestamp));
            java.lang.String str = this.targetSelector;
            if (str != null) {
                jsonObject.addProperty("target_selector", str);
            }
            java.lang.String str2 = this.resourceUrl;
            if (str2 != null) {
                jsonObject.addProperty("resource_url", str2);
            }
            return jsonObject;
        }

        @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/datadog/android/rum/model/ViewEvent$Lcp$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/rum/model/ViewEvent$Lcp;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/rum/model/ViewEvent$Lcp;", "Lcom/google/gson/JsonObject;", "jsonObject", "fromJsonObject", "(Lcom/google/gson/JsonObject;)Lcom/datadog/android/rum/model/ViewEvent$Lcp;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @kotlin.jvm.JvmStatic
            public final com.datadog.android.rum.model.ViewEvent.Lcp fromJson(java.lang.String jsonString) throws com.google.gson.JsonParseException {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonString, "");
                try {
                    com.google.gson.JsonObject asJsonObject = com.google.gson.JsonParser.parseString(jsonString).getAsJsonObject();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asJsonObject, "");
                    return fromJsonObject(asJsonObject);
                } catch (java.lang.IllegalStateException e) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type Lcp", e);
                }
            }

            @kotlin.jvm.JvmStatic
            public final com.datadog.android.rum.model.ViewEvent.Lcp fromJsonObject(com.google.gson.JsonObject jsonObject) throws com.google.gson.JsonParseException {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonObject, "");
                try {
                    long asLong = jsonObject.get("timestamp").getAsLong();
                    com.google.gson.JsonElement jsonElement = jsonObject.get("target_selector");
                    java.lang.String asString = jsonElement != null ? jsonElement.getAsString() : null;
                    com.google.gson.JsonElement jsonElement2 = jsonObject.get("resource_url");
                    return new com.datadog.android.rum.model.ViewEvent.Lcp(asLong, asString, jsonElement2 != null ? jsonElement2.getAsString() : null);
                } catch (java.lang.IllegalStateException e) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type Lcp", e);
                } catch (java.lang.NullPointerException e2) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type Lcp", e2);
                } catch (java.lang.NumberFormatException e3) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type Lcp", e3);
                }
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public final java.lang.String toString() {
            long j = this.timestamp;
            java.lang.String str = this.targetSelector;
            java.lang.String str2 = this.resourceUrl;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Lcp(timestamp=");
            sb.append(j);
            sb.append(", targetSelector=");
            sb.append(str);
            sb.append(", resourceUrl=");
            sb.append(str2);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = java.lang.Long.hashCode(this.timestamp);
            java.lang.String str = this.targetSelector;
            int hashCode2 = str == null ? 0 : str.hashCode();
            java.lang.String str2 = this.resourceUrl;
            return (((hashCode * 31) + hashCode2) * 31) + (str2 != null ? str2.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.datadog.android.rum.model.ViewEvent.Lcp)) {
                return false;
            }
            com.datadog.android.rum.model.ViewEvent.Lcp lcp = (com.datadog.android.rum.model.ViewEvent.Lcp) other;
            return this.timestamp == lcp.timestamp && kotlin.jvm.internal.Intrinsics.areEqual(this.targetSelector, lcp.targetSelector) && kotlin.jvm.internal.Intrinsics.areEqual(this.resourceUrl, lcp.resourceUrl);
        }

        public final com.datadog.android.rum.model.ViewEvent.Lcp copy(long timestamp, java.lang.String targetSelector, java.lang.String resourceUrl) {
            return new com.datadog.android.rum.model.ViewEvent.Lcp(timestamp, targetSelector, resourceUrl);
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String getResourceUrl() {
            return this.resourceUrl;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getTargetSelector() {
            return this.targetSelector;
        }

        /* renamed from: component1, reason: from getter */
        public final long getTimestamp() {
            return this.timestamp;
        }

        @kotlin.jvm.JvmStatic
        public static final com.datadog.android.rum.model.ViewEvent.Lcp fromJsonObject(com.google.gson.JsonObject jsonObject) throws com.google.gson.JsonParseException {
            return INSTANCE.fromJsonObject(jsonObject);
        }

        @kotlin.jvm.JvmStatic
        public static final com.datadog.android.rum.model.ViewEvent.Lcp fromJson(java.lang.String str) throws com.google.gson.JsonParseException {
            return INSTANCE.fromJson(str);
        }

        public static /* synthetic */ com.datadog.android.rum.model.ViewEvent.Lcp copy$default(com.datadog.android.rum.model.ViewEvent.Lcp lcp, long j, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                j = lcp.timestamp;
            }
            if ((i & 2) != 0) {
                str = lcp.targetSelector;
            }
            if ((i & 4) != 0) {
                str2 = lcp.resourceUrl;
            }
            return lcp.copy(j, str, str2);
        }
    }

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\b\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\u0007"}, d2 = {"Lcom/datadog/android/rum/model/ViewEvent$Fbc;", "", "", "timestamp", "<init>", "(J)V", "component1", "()J", "copy", "(J)Lcom/datadog/android/rum/model/ViewEvent$Fbc;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lcom/google/gson/JsonElement;", "toJson", "()Lcom/google/gson/JsonElement;", "", "toString", "()Ljava/lang/String;", "J", "getTimestamp", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class Fbc {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.datadog.android.rum.model.ViewEvent.Fbc.Companion INSTANCE = new com.datadog.android.rum.model.ViewEvent.Fbc.Companion(null);
        private final long timestamp;

        public Fbc(long j) {
            this.timestamp = j;
        }

        public final long getTimestamp() {
            return this.timestamp;
        }

        public final com.google.gson.JsonElement toJson() {
            com.google.gson.JsonObject jsonObject = new com.google.gson.JsonObject();
            jsonObject.addProperty("timestamp", java.lang.Long.valueOf(this.timestamp));
            return jsonObject;
        }

        @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/datadog/android/rum/model/ViewEvent$Fbc$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/rum/model/ViewEvent$Fbc;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/rum/model/ViewEvent$Fbc;", "Lcom/google/gson/JsonObject;", "jsonObject", "fromJsonObject", "(Lcom/google/gson/JsonObject;)Lcom/datadog/android/rum/model/ViewEvent$Fbc;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @kotlin.jvm.JvmStatic
            public final com.datadog.android.rum.model.ViewEvent.Fbc fromJson(java.lang.String jsonString) throws com.google.gson.JsonParseException {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonString, "");
                try {
                    com.google.gson.JsonObject asJsonObject = com.google.gson.JsonParser.parseString(jsonString).getAsJsonObject();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asJsonObject, "");
                    return fromJsonObject(asJsonObject);
                } catch (java.lang.IllegalStateException e) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type Fbc", e);
                }
            }

            @kotlin.jvm.JvmStatic
            public final com.datadog.android.rum.model.ViewEvent.Fbc fromJsonObject(com.google.gson.JsonObject jsonObject) throws com.google.gson.JsonParseException {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonObject, "");
                try {
                    return new com.datadog.android.rum.model.ViewEvent.Fbc(jsonObject.get("timestamp").getAsLong());
                } catch (java.lang.IllegalStateException e) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type Fbc", e);
                } catch (java.lang.NullPointerException e2) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type Fbc", e2);
                } catch (java.lang.NumberFormatException e3) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type Fbc", e3);
                }
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public final java.lang.String toString() {
            long j = this.timestamp;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Fbc(timestamp=");
            sb.append(j);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return java.lang.Long.hashCode(this.timestamp);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.datadog.android.rum.model.ViewEvent.Fbc) && this.timestamp == ((com.datadog.android.rum.model.ViewEvent.Fbc) other).timestamp;
        }

        public final com.datadog.android.rum.model.ViewEvent.Fbc copy(long timestamp) {
            return new com.datadog.android.rum.model.ViewEvent.Fbc(timestamp);
        }

        /* renamed from: component1, reason: from getter */
        public final long getTimestamp() {
            return this.timestamp;
        }

        @kotlin.jvm.JvmStatic
        public static final com.datadog.android.rum.model.ViewEvent.Fbc fromJsonObject(com.google.gson.JsonObject jsonObject) throws com.google.gson.JsonParseException {
            return INSTANCE.fromJsonObject(jsonObject);
        }

        @kotlin.jvm.JvmStatic
        public static final com.datadog.android.rum.model.ViewEvent.Fbc fromJson(java.lang.String str) throws com.google.gson.JsonParseException {
            return INSTANCE.fromJson(str);
        }

        public static /* synthetic */ com.datadog.android.rum.model.ViewEvent.Fbc copy$default(com.datadog.android.rum.model.ViewEvent.Fbc fbc, long j, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                j = fbc.timestamp;
            }
            return fbc.copy(j);
        }
    }

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0004\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\b\u0018\u0000 \"2\u00020\u0001:\u0001\"B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\nJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\nJ8\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0006\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u001d\u001a\u0004\b\u001e\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001d\u001a\u0004\b\u001f\u0010\nR\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b \u0010\nR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001d\u001a\u0004\b!\u0010\n"}, d2 = {"Lcom/datadog/android/rum/model/ViewEvent$PreviousRect;", "", "", "x", "y", "width", "height", "<init>", "(Ljava/lang/Number;Ljava/lang/Number;Ljava/lang/Number;Ljava/lang/Number;)V", "component1", "()Ljava/lang/Number;", "component2", "component3", "component4", "copy", "(Ljava/lang/Number;Ljava/lang/Number;Ljava/lang/Number;Ljava/lang/Number;)Lcom/datadog/android/rum/model/ViewEvent$PreviousRect;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lcom/google/gson/JsonElement;", "toJson", "()Lcom/google/gson/JsonElement;", "", "toString", "()Ljava/lang/String;", "Ljava/lang/Number;", "getHeight", "getWidth", "getX", "getY", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class PreviousRect {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.datadog.android.rum.model.ViewEvent.PreviousRect.Companion INSTANCE = new com.datadog.android.rum.model.ViewEvent.PreviousRect.Companion(null);
        private final java.lang.Number height;
        private final java.lang.Number width;
        private final java.lang.Number x;
        private final java.lang.Number y;

        public PreviousRect(java.lang.Number number, java.lang.Number number2, java.lang.Number number3, java.lang.Number number4) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(number, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(number2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(number3, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(number4, "");
            this.x = number;
            this.y = number2;
            this.width = number3;
            this.height = number4;
        }

        public final java.lang.Number getX() {
            return this.x;
        }

        public final java.lang.Number getY() {
            return this.y;
        }

        public final java.lang.Number getWidth() {
            return this.width;
        }

        public final java.lang.Number getHeight() {
            return this.height;
        }

        public final com.google.gson.JsonElement toJson() {
            com.google.gson.JsonObject jsonObject = new com.google.gson.JsonObject();
            jsonObject.addProperty("x", this.x);
            jsonObject.addProperty("y", this.y);
            jsonObject.addProperty("width", this.width);
            jsonObject.addProperty("height", this.height);
            return jsonObject;
        }

        @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/datadog/android/rum/model/ViewEvent$PreviousRect$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/rum/model/ViewEvent$PreviousRect;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/rum/model/ViewEvent$PreviousRect;", "Lcom/google/gson/JsonObject;", "jsonObject", "fromJsonObject", "(Lcom/google/gson/JsonObject;)Lcom/datadog/android/rum/model/ViewEvent$PreviousRect;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @kotlin.jvm.JvmStatic
            public final com.datadog.android.rum.model.ViewEvent.PreviousRect fromJson(java.lang.String jsonString) throws com.google.gson.JsonParseException {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonString, "");
                try {
                    com.google.gson.JsonObject asJsonObject = com.google.gson.JsonParser.parseString(jsonString).getAsJsonObject();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asJsonObject, "");
                    return fromJsonObject(asJsonObject);
                } catch (java.lang.IllegalStateException e) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type PreviousRect", e);
                }
            }

            @kotlin.jvm.JvmStatic
            public final com.datadog.android.rum.model.ViewEvent.PreviousRect fromJsonObject(com.google.gson.JsonObject jsonObject) throws com.google.gson.JsonParseException {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonObject, "");
                try {
                    java.lang.Number asNumber = jsonObject.get("x").getAsNumber();
                    java.lang.Number asNumber2 = jsonObject.get("y").getAsNumber();
                    java.lang.Number asNumber3 = jsonObject.get("width").getAsNumber();
                    java.lang.Number asNumber4 = jsonObject.get("height").getAsNumber();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asNumber, "");
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asNumber2, "");
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asNumber3, "");
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asNumber4, "");
                    return new com.datadog.android.rum.model.ViewEvent.PreviousRect(asNumber, asNumber2, asNumber3, asNumber4);
                } catch (java.lang.IllegalStateException e) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type PreviousRect", e);
                } catch (java.lang.NullPointerException e2) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type PreviousRect", e2);
                } catch (java.lang.NumberFormatException e3) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type PreviousRect", e3);
                }
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public final java.lang.String toString() {
            java.lang.Number number = this.x;
            java.lang.Number number2 = this.y;
            java.lang.Number number3 = this.width;
            java.lang.Number number4 = this.height;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("PreviousRect(x=");
            sb.append(number);
            sb.append(", y=");
            sb.append(number2);
            sb.append(", width=");
            sb.append(number3);
            sb.append(", height=");
            sb.append(number4);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (((((this.x.hashCode() * 31) + this.y.hashCode()) * 31) + this.width.hashCode()) * 31) + this.height.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.datadog.android.rum.model.ViewEvent.PreviousRect)) {
                return false;
            }
            com.datadog.android.rum.model.ViewEvent.PreviousRect previousRect = (com.datadog.android.rum.model.ViewEvent.PreviousRect) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.x, previousRect.x) && kotlin.jvm.internal.Intrinsics.areEqual(this.y, previousRect.y) && kotlin.jvm.internal.Intrinsics.areEqual(this.width, previousRect.width) && kotlin.jvm.internal.Intrinsics.areEqual(this.height, previousRect.height);
        }

        public final com.datadog.android.rum.model.ViewEvent.PreviousRect copy(java.lang.Number x, java.lang.Number y, java.lang.Number width, java.lang.Number height) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(x, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(y, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(width, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(height, "");
            return new com.datadog.android.rum.model.ViewEvent.PreviousRect(x, y, width, height);
        }

        /* renamed from: component4, reason: from getter */
        public final java.lang.Number getHeight() {
            return this.height;
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.Number getWidth() {
            return this.width;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.Number getY() {
            return this.y;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.Number getX() {
            return this.x;
        }

        @kotlin.jvm.JvmStatic
        public static final com.datadog.android.rum.model.ViewEvent.PreviousRect fromJsonObject(com.google.gson.JsonObject jsonObject) throws com.google.gson.JsonParseException {
            return INSTANCE.fromJsonObject(jsonObject);
        }

        @kotlin.jvm.JvmStatic
        public static final com.datadog.android.rum.model.ViewEvent.PreviousRect fromJson(java.lang.String str) throws com.google.gson.JsonParseException {
            return INSTANCE.fromJson(str);
        }

        public static /* synthetic */ com.datadog.android.rum.model.ViewEvent.PreviousRect copy$default(com.datadog.android.rum.model.ViewEvent.PreviousRect previousRect, java.lang.Number number, java.lang.Number number2, java.lang.Number number3, java.lang.Number number4, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                number = previousRect.x;
            }
            if ((i & 2) != 0) {
                number2 = previousRect.y;
            }
            if ((i & 4) != 0) {
                number3 = previousRect.width;
            }
            if ((i & 8) != 0) {
                number4 = previousRect.height;
            }
            return previousRect.copy(number, number2, number3, number4);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0086\u0001\u0018\u0000 \f2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u000b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014"}, d2 = {"Lcom/datadog/android/rum/model/ViewEvent$ViewEventSource;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Lcom/google/gson/JsonElement;", "toJson", "()Lcom/google/gson/JsonElement;", "getHighSpeedVideoFpsRangesFor", "Ljava/lang/String;", "Camera2StreamConfigurationMap", "Companion", "ANDROID", "IOS", "BROWSER", "FLUTTER", "REACT_NATIVE", "ROKU", "UNITY", "KOTLIN_MULTIPLATFORM"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public enum ViewEventSource {
        ANDROID(com.datadog.android.core.internal.CoreFeature.DEFAULT_SOURCE_NAME),
        IOS("ios"),
        BROWSER("browser"),
        FLUTTER("flutter"),
        REACT_NATIVE("react-native"),
        ROKU("roku"),
        UNITY("unity"),
        KOTLIN_MULTIPLATFORM("kotlin-multiplatform");


        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.datadog.android.rum.model.ViewEvent.ViewEventSource.Companion INSTANCE = new com.datadog.android.rum.model.ViewEvent.ViewEventSource.Companion(null);

        /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
        private final java.lang.String Camera2StreamConfigurationMap;

        ViewEventSource(java.lang.String str) {
            this.Camera2StreamConfigurationMap = str;
        }

        public final com.google.gson.JsonElement toJson() {
            return new com.google.gson.JsonPrimitive(this.Camera2StreamConfigurationMap);
        }

        @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/datadog/android/rum/model/ViewEvent$ViewEventSource$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/rum/model/ViewEvent$ViewEventSource;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/rum/model/ViewEvent$ViewEventSource;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @kotlin.jvm.JvmStatic
            public final com.datadog.android.rum.model.ViewEvent.ViewEventSource fromJson(java.lang.String jsonString) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonString, "");
                for (com.datadog.android.rum.model.ViewEvent.ViewEventSource viewEventSource : com.datadog.android.rum.model.ViewEvent.ViewEventSource.values()) {
                    if (kotlin.jvm.internal.Intrinsics.areEqual(viewEventSource.Camera2StreamConfigurationMap, jsonString)) {
                        return viewEventSource;
                    }
                }
                throw new java.util.NoSuchElementException("Array contains no element matching the predicate.");
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        @kotlin.jvm.JvmStatic
        public static final com.datadog.android.rum.model.ViewEvent.ViewEventSource fromJson(java.lang.String str) {
            return INSTANCE.fromJson(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0001\u0018\u0000 \f2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u000b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f"}, d2 = {"Lcom/datadog/android/rum/model/ViewEvent$ViewEventSessionType;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Lcom/google/gson/JsonElement;", "toJson", "()Lcom/google/gson/JsonElement;", "getHighSpeedVideoFpsRanges", "Ljava/lang/String;", "Camera2StreamConfigurationMap", "Companion", "USER", "SYNTHETICS", "CI_TEST"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public enum ViewEventSessionType {
        USER("user"),
        SYNTHETICS("synthetics"),
        CI_TEST("ci_test");


        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.datadog.android.rum.model.ViewEvent.ViewEventSessionType.Companion INSTANCE = new com.datadog.android.rum.model.ViewEvent.ViewEventSessionType.Companion(null);

        /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
        private final java.lang.String Camera2StreamConfigurationMap;

        ViewEventSessionType(java.lang.String str) {
            this.Camera2StreamConfigurationMap = str;
        }

        public final com.google.gson.JsonElement toJson() {
            return new com.google.gson.JsonPrimitive(this.Camera2StreamConfigurationMap);
        }

        @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/datadog/android/rum/model/ViewEvent$ViewEventSessionType$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/rum/model/ViewEvent$ViewEventSessionType;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/rum/model/ViewEvent$ViewEventSessionType;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @kotlin.jvm.JvmStatic
            public final com.datadog.android.rum.model.ViewEvent.ViewEventSessionType fromJson(java.lang.String jsonString) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonString, "");
                for (com.datadog.android.rum.model.ViewEvent.ViewEventSessionType viewEventSessionType : com.datadog.android.rum.model.ViewEvent.ViewEventSessionType.values()) {
                    if (kotlin.jvm.internal.Intrinsics.areEqual(viewEventSessionType.Camera2StreamConfigurationMap, jsonString)) {
                        return viewEventSessionType;
                    }
                }
                throw new java.util.NoSuchElementException("Array contains no element matching the predicate.");
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        @kotlin.jvm.JvmStatic
        public static final com.datadog.android.rum.model.ViewEvent.ViewEventSessionType fromJson(java.lang.String str) {
            return INSTANCE.fromJson(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0086\u0001\u0018\u0000 \f2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u000b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014"}, d2 = {"Lcom/datadog/android/rum/model/ViewEvent$LoadingType;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Lcom/google/gson/JsonElement;", "toJson", "()Lcom/google/gson/JsonElement;", "getHighSpeedVideoSizes", "Ljava/lang/String;", "getHighResolutionOutputSizeshNQ4ISI", "Companion", "INITIAL_LOAD", "ROUTE_CHANGE", "ACTIVITY_DISPLAY", "ACTIVITY_REDISPLAY", "FRAGMENT_DISPLAY", "FRAGMENT_REDISPLAY", "VIEW_CONTROLLER_DISPLAY", "VIEW_CONTROLLER_REDISPLAY"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public enum LoadingType {
        INITIAL_LOAD("initial_load"),
        ROUTE_CHANGE("route_change"),
        ACTIVITY_DISPLAY("activity_display"),
        ACTIVITY_REDISPLAY("activity_redisplay"),
        FRAGMENT_DISPLAY("fragment_display"),
        FRAGMENT_REDISPLAY("fragment_redisplay"),
        VIEW_CONTROLLER_DISPLAY("view_controller_display"),
        VIEW_CONTROLLER_REDISPLAY("view_controller_redisplay");


        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.datadog.android.rum.model.ViewEvent.LoadingType.Companion INSTANCE = new com.datadog.android.rum.model.ViewEvent.LoadingType.Companion(null);

        /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
        private final java.lang.String getHighResolutionOutputSizeshNQ4ISI;

        LoadingType(java.lang.String str) {
            this.getHighResolutionOutputSizeshNQ4ISI = str;
        }

        public final com.google.gson.JsonElement toJson() {
            return new com.google.gson.JsonPrimitive(this.getHighResolutionOutputSizeshNQ4ISI);
        }

        @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/datadog/android/rum/model/ViewEvent$LoadingType$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/rum/model/ViewEvent$LoadingType;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/rum/model/ViewEvent$LoadingType;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @kotlin.jvm.JvmStatic
            public final com.datadog.android.rum.model.ViewEvent.LoadingType fromJson(java.lang.String jsonString) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonString, "");
                for (com.datadog.android.rum.model.ViewEvent.LoadingType loadingType : com.datadog.android.rum.model.ViewEvent.LoadingType.values()) {
                    if (kotlin.jvm.internal.Intrinsics.areEqual(loadingType.getHighResolutionOutputSizeshNQ4ISI, jsonString)) {
                        return loadingType;
                    }
                }
                throw new java.util.NoSuchElementException("Array contains no element matching the predicate.");
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        @kotlin.jvm.JvmStatic
        public static final com.datadog.android.rum.model.ViewEvent.LoadingType fromJson(java.lang.String str) {
            return INSTANCE.fromJson(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0001\u0018\u0000 \f2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u000b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f"}, d2 = {"Lcom/datadog/android/rum/model/ViewEvent$ConnectivityStatus;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Lcom/google/gson/JsonElement;", "toJson", "()Lcom/google/gson/JsonElement;", "Camera2StreamConfigurationMap", "Ljava/lang/String;", "getHighSpeedVideoFpsRangesFor", "Companion", "CONNECTED", "NOT_CONNECTED", "MAYBE"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public enum ConnectivityStatus {
        CONNECTED("connected"),
        NOT_CONNECTED("not_connected"),
        MAYBE("maybe");


        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.datadog.android.rum.model.ViewEvent.ConnectivityStatus.Companion INSTANCE = new com.datadog.android.rum.model.ViewEvent.ConnectivityStatus.Companion(null);

        /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
        private final java.lang.String getHighSpeedVideoFpsRangesFor;

        ConnectivityStatus(java.lang.String str) {
            this.getHighSpeedVideoFpsRangesFor = str;
        }

        public final com.google.gson.JsonElement toJson() {
            return new com.google.gson.JsonPrimitive(this.getHighSpeedVideoFpsRangesFor);
        }

        @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/datadog/android/rum/model/ViewEvent$ConnectivityStatus$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/rum/model/ViewEvent$ConnectivityStatus;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/rum/model/ViewEvent$ConnectivityStatus;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @kotlin.jvm.JvmStatic
            public final com.datadog.android.rum.model.ViewEvent.ConnectivityStatus fromJson(java.lang.String jsonString) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonString, "");
                for (com.datadog.android.rum.model.ViewEvent.ConnectivityStatus connectivityStatus : com.datadog.android.rum.model.ViewEvent.ConnectivityStatus.values()) {
                    if (kotlin.jvm.internal.Intrinsics.areEqual(connectivityStatus.getHighSpeedVideoFpsRangesFor, jsonString)) {
                        return connectivityStatus;
                    }
                }
                throw new java.util.NoSuchElementException("Array contains no element matching the predicate.");
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        @kotlin.jvm.JvmStatic
        public static final com.datadog.android.rum.model.ViewEvent.ConnectivityStatus fromJson(java.lang.String str) {
            return INSTANCE.fromJson(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0086\u0001\u0018\u0000 \f2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u000b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015"}, d2 = {"Lcom/datadog/android/rum/model/ViewEvent$Interface;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Lcom/google/gson/JsonElement;", "toJson", "()Lcom/google/gson/JsonElement;", "getHighSpeedVideoFpsRanges", "Ljava/lang/String;", "getHighResolutionOutputSizeshNQ4ISI", "Companion", "BLUETOOTH", "CELLULAR", "ETHERNET", "WIFI", "WIMAX", "MIXED", "OTHER", "UNKNOWN", "NONE"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public enum Interface {
        BLUETOOTH("bluetooth"),
        CELLULAR("cellular"),
        ETHERNET("ethernet"),
        WIFI("wifi"),
        WIMAX("wimax"),
        MIXED("mixed"),
        OTHER("other"),
        UNKNOWN("unknown"),
        NONE("none");


        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.datadog.android.rum.model.ViewEvent.Interface.Companion INSTANCE = new com.datadog.android.rum.model.ViewEvent.Interface.Companion(null);

        /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
        private final java.lang.String getHighResolutionOutputSizeshNQ4ISI;

        Interface(java.lang.String str) {
            this.getHighResolutionOutputSizeshNQ4ISI = str;
        }

        public final com.google.gson.JsonElement toJson() {
            return new com.google.gson.JsonPrimitive(this.getHighResolutionOutputSizeshNQ4ISI);
        }

        @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/datadog/android/rum/model/ViewEvent$Interface$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/rum/model/ViewEvent$Interface;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/rum/model/ViewEvent$Interface;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @kotlin.jvm.JvmStatic
            public final com.datadog.android.rum.model.ViewEvent.Interface fromJson(java.lang.String jsonString) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonString, "");
                for (com.datadog.android.rum.model.ViewEvent.Interface r3 : com.datadog.android.rum.model.ViewEvent.Interface.values()) {
                    if (kotlin.jvm.internal.Intrinsics.areEqual(r3.getHighResolutionOutputSizeshNQ4ISI, jsonString)) {
                        return r3;
                    }
                }
                throw new java.util.NoSuchElementException("Array contains no element matching the predicate.");
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        @kotlin.jvm.JvmStatic
        public static final com.datadog.android.rum.model.ViewEvent.Interface fromJson(java.lang.String str) {
            return INSTANCE.fromJson(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\u0001\u0018\u0000 \f2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u000b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010"}, d2 = {"Lcom/datadog/android/rum/model/ViewEvent$EffectiveType;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Lcom/google/gson/JsonElement;", "toJson", "()Lcom/google/gson/JsonElement;", "Camera2StreamConfigurationMap", "Ljava/lang/String;", "getHighSpeedVideoFpsRangesFor", "Companion", "SLOW_2G", "2G", "3G", "4G"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public enum EffectiveType {
        SLOW_2G("slow-2g"),
        f182G("2g"),
        f193G("3g"),
        f204G("4g");


        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.datadog.android.rum.model.ViewEvent.EffectiveType.Companion INSTANCE = new com.datadog.android.rum.model.ViewEvent.EffectiveType.Companion(null);

        /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
        private final java.lang.String getHighSpeedVideoFpsRangesFor;

        EffectiveType(java.lang.String str) {
            this.getHighSpeedVideoFpsRangesFor = str;
        }

        public final com.google.gson.JsonElement toJson() {
            return new com.google.gson.JsonPrimitive(this.getHighSpeedVideoFpsRangesFor);
        }

        @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/datadog/android/rum/model/ViewEvent$EffectiveType$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/rum/model/ViewEvent$EffectiveType;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/rum/model/ViewEvent$EffectiveType;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @kotlin.jvm.JvmStatic
            public final com.datadog.android.rum.model.ViewEvent.EffectiveType fromJson(java.lang.String jsonString) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonString, "");
                for (com.datadog.android.rum.model.ViewEvent.EffectiveType effectiveType : com.datadog.android.rum.model.ViewEvent.EffectiveType.values()) {
                    if (kotlin.jvm.internal.Intrinsics.areEqual(effectiveType.getHighSpeedVideoFpsRangesFor, jsonString)) {
                        return effectiveType;
                    }
                }
                throw new java.util.NoSuchElementException("Array contains no element matching the predicate.");
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        @kotlin.jvm.JvmStatic
        public static final com.datadog.android.rum.model.ViewEvent.EffectiveType fromJson(java.lang.String str) {
            return INSTANCE.fromJson(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\b\u0086\u0001\u0018\u0000 \f2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u000b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013"}, d2 = {"Lcom/datadog/android/rum/model/ViewEvent$DeviceType;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Lcom/google/gson/JsonElement;", "toJson", "()Lcom/google/gson/JsonElement;", "getHighSpeedVideoFpsRanges", "Ljava/lang/String;", "getHighSpeedVideoSizes", "Companion", "MOBILE", "DESKTOP", "TABLET", "TV", "GAMING_CONSOLE", "BOT", "OTHER"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public enum DeviceType {
        MOBILE("mobile"),
        DESKTOP("desktop"),
        TABLET("tablet"),
        TV("tv"),
        GAMING_CONSOLE("gaming_console"),
        BOT("bot"),
        OTHER("other");


        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.datadog.android.rum.model.ViewEvent.DeviceType.Companion INSTANCE = new com.datadog.android.rum.model.ViewEvent.DeviceType.Companion(null);

        /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
        private final java.lang.String getHighSpeedVideoSizes;

        DeviceType(java.lang.String str) {
            this.getHighSpeedVideoSizes = str;
        }

        public final com.google.gson.JsonElement toJson() {
            return new com.google.gson.JsonPrimitive(this.getHighSpeedVideoSizes);
        }

        @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/datadog/android/rum/model/ViewEvent$DeviceType$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/rum/model/ViewEvent$DeviceType;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/rum/model/ViewEvent$DeviceType;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @kotlin.jvm.JvmStatic
            public final com.datadog.android.rum.model.ViewEvent.DeviceType fromJson(java.lang.String jsonString) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonString, "");
                for (com.datadog.android.rum.model.ViewEvent.DeviceType deviceType : com.datadog.android.rum.model.ViewEvent.DeviceType.values()) {
                    if (kotlin.jvm.internal.Intrinsics.areEqual(deviceType.getHighSpeedVideoSizes, jsonString)) {
                        return deviceType;
                    }
                }
                throw new java.util.NoSuchElementException("Array contains no element matching the predicate.");
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        @kotlin.jvm.JvmStatic
        public static final com.datadog.android.rum.model.ViewEvent.DeviceType fromJson(java.lang.String str) {
            return INSTANCE.fromJson(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0001\u0018\u0000 \f2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u000b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f"}, d2 = {"Lcom/datadog/android/rum/model/ViewEvent$ReplayLevel;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Lcom/google/gson/JsonElement;", "toJson", "()Lcom/google/gson/JsonElement;", "getHighSpeedVideoSizes", "Ljava/lang/String;", "Camera2StreamConfigurationMap", "Companion", "ALLOW", "MASK", "MASK_USER_INPUT"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public enum ReplayLevel {
        ALLOW("allow"),
        MASK(com.daon.sdk.face.license.License.FEATURE_MASK),
        MASK_USER_INPUT("mask-user-input");


        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.datadog.android.rum.model.ViewEvent.ReplayLevel.Companion INSTANCE = new com.datadog.android.rum.model.ViewEvent.ReplayLevel.Companion(null);

        /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
        private final java.lang.String Camera2StreamConfigurationMap;

        ReplayLevel(java.lang.String str) {
            this.Camera2StreamConfigurationMap = str;
        }

        public final com.google.gson.JsonElement toJson() {
            return new com.google.gson.JsonPrimitive(this.Camera2StreamConfigurationMap);
        }

        @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/datadog/android/rum/model/ViewEvent$ReplayLevel$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/rum/model/ViewEvent$ReplayLevel;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/rum/model/ViewEvent$ReplayLevel;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @kotlin.jvm.JvmStatic
            public final com.datadog.android.rum.model.ViewEvent.ReplayLevel fromJson(java.lang.String jsonString) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonString, "");
                for (com.datadog.android.rum.model.ViewEvent.ReplayLevel replayLevel : com.datadog.android.rum.model.ViewEvent.ReplayLevel.values()) {
                    if (kotlin.jvm.internal.Intrinsics.areEqual(replayLevel.Camera2StreamConfigurationMap, jsonString)) {
                        return replayLevel;
                    }
                }
                throw new java.util.NoSuchElementException("Array contains no element matching the predicate.");
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        @kotlin.jvm.JvmStatic
        public static final com.datadog.android.rum.model.ViewEvent.ReplayLevel fromJson(java.lang.String str) {
            return INSTANCE.fromJson(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u0004\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0001\u0018\u0000 \f2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u000b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nj\u0002\b\rj\u0002\b\u000e"}, d2 = {"Lcom/datadog/android/rum/model/ViewEvent$Plan;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/Number;)V", "Lcom/google/gson/JsonElement;", "toJson", "()Lcom/google/gson/JsonElement;", "getHighSpeedVideoFpsRanges", "Ljava/lang/Number;", "getHighResolutionOutputSizeshNQ4ISI", "Companion", "PLAN_1", "PLAN_2"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public enum Plan {
        PLAN_1((java.lang.Number) 1),
        PLAN_2((java.lang.Number) 2);


        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.datadog.android.rum.model.ViewEvent.Plan.Companion INSTANCE = new com.datadog.android.rum.model.ViewEvent.Plan.Companion(null);

        /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
        private final java.lang.Number getHighResolutionOutputSizeshNQ4ISI;

        Plan(java.lang.Number number) {
            this.getHighResolutionOutputSizeshNQ4ISI = number;
        }

        public final com.google.gson.JsonElement toJson() {
            return new com.google.gson.JsonPrimitive(this.getHighResolutionOutputSizeshNQ4ISI);
        }

        @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/datadog/android/rum/model/ViewEvent$Plan$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/rum/model/ViewEvent$Plan;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/rum/model/ViewEvent$Plan;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @kotlin.jvm.JvmStatic
            public final com.datadog.android.rum.model.ViewEvent.Plan fromJson(java.lang.String jsonString) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonString, "");
                for (com.datadog.android.rum.model.ViewEvent.Plan plan : com.datadog.android.rum.model.ViewEvent.Plan.values()) {
                    if (kotlin.jvm.internal.Intrinsics.areEqual(plan.getHighResolutionOutputSizeshNQ4ISI.toString(), jsonString)) {
                        return plan;
                    }
                }
                throw new java.util.NoSuchElementException("Array contains no element matching the predicate.");
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        @kotlin.jvm.JvmStatic
        public static final com.datadog.android.rum.model.ViewEvent.Plan fromJson(java.lang.String str) {
            return INSTANCE.fromJson(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\b\u0086\u0001\u0018\u0000 \f2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u000b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013"}, d2 = {"Lcom/datadog/android/rum/model/ViewEvent$SessionPrecondition;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Lcom/google/gson/JsonElement;", "toJson", "()Lcom/google/gson/JsonElement;", "getHighResolutionOutputSizeshNQ4ISI", "Ljava/lang/String;", "Camera2StreamConfigurationMap", "Companion", "USER_APP_LAUNCH", "INACTIVITY_TIMEOUT", "MAX_DURATION", "BACKGROUND_LAUNCH", "PREWARM", "FROM_NON_INTERACTIVE_SESSION", "EXPLICIT_STOP"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public enum SessionPrecondition {
        USER_APP_LAUNCH("user_app_launch"),
        INACTIVITY_TIMEOUT("inactivity_timeout"),
        MAX_DURATION(com.datadog.android.rum.internal.metric.slowframes.DefaultUISlownessMetricDispatcher.KEY_MAX_DURATION),
        BACKGROUND_LAUNCH("background_launch"),
        PREWARM("prewarm"),
        FROM_NON_INTERACTIVE_SESSION("from_non_interactive_session"),
        EXPLICIT_STOP("explicit_stop");


        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.datadog.android.rum.model.ViewEvent.SessionPrecondition.Companion INSTANCE = new com.datadog.android.rum.model.ViewEvent.SessionPrecondition.Companion(null);

        /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
        private final java.lang.String Camera2StreamConfigurationMap;

        SessionPrecondition(java.lang.String str) {
            this.Camera2StreamConfigurationMap = str;
        }

        public final com.google.gson.JsonElement toJson() {
            return new com.google.gson.JsonPrimitive(this.Camera2StreamConfigurationMap);
        }

        @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/datadog/android/rum/model/ViewEvent$SessionPrecondition$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/rum/model/ViewEvent$SessionPrecondition;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/rum/model/ViewEvent$SessionPrecondition;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @kotlin.jvm.JvmStatic
            public final com.datadog.android.rum.model.ViewEvent.SessionPrecondition fromJson(java.lang.String jsonString) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonString, "");
                for (com.datadog.android.rum.model.ViewEvent.SessionPrecondition sessionPrecondition : com.datadog.android.rum.model.ViewEvent.SessionPrecondition.values()) {
                    if (kotlin.jvm.internal.Intrinsics.areEqual(sessionPrecondition.Camera2StreamConfigurationMap, jsonString)) {
                        return sessionPrecondition;
                    }
                }
                throw new java.util.NoSuchElementException("Array contains no element matching the predicate.");
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        @kotlin.jvm.JvmStatic
        public static final com.datadog.android.rum.model.ViewEvent.SessionPrecondition fromJson(java.lang.String str) {
            return INSTANCE.fromJson(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\u0001\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010"}, d2 = {"Lcom/datadog/android/rum/model/ViewEvent$State;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Lcom/google/gson/JsonElement;", "toJson", "()Lcom/google/gson/JsonElement;", "getHighSpeedVideoFpsRangesFor", "Ljava/lang/String;", "Companion", com.payair.model.TokenStatusKt.TOKEN_ACTIVE, "PASSIVE", "HIDDEN", "FROZEN", "TERMINATED"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public enum State {
        ACTIVE(com.paypal.oslo.feature.shoppingrewards.rewards.common.analytics.RewardsAnalyticsConstants.Action.ACTIVE),
        PASSIVE("passive"),
        HIDDEN("hidden"),
        FROZEN("frozen"),
        TERMINATED("terminated");


        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.datadog.android.rum.model.ViewEvent.State.Companion INSTANCE = new com.datadog.android.rum.model.ViewEvent.State.Companion(null);
        private final java.lang.String getHighSpeedVideoFpsRangesFor;

        State(java.lang.String str) {
            this.getHighSpeedVideoFpsRangesFor = str;
        }

        public final com.google.gson.JsonElement toJson() {
            return new com.google.gson.JsonPrimitive(this.getHighSpeedVideoFpsRangesFor);
        }

        @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/datadog/android/rum/model/ViewEvent$State$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/rum/model/ViewEvent$State;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/rum/model/ViewEvent$State;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @kotlin.jvm.JvmStatic
            public final com.datadog.android.rum.model.ViewEvent.State fromJson(java.lang.String jsonString) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonString, "");
                for (com.datadog.android.rum.model.ViewEvent.State state : com.datadog.android.rum.model.ViewEvent.State.values()) {
                    if (kotlin.jvm.internal.Intrinsics.areEqual(state.getHighSpeedVideoFpsRangesFor, jsonString)) {
                        return state;
                    }
                }
                throw new java.util.NoSuchElementException("Array contains no element matching the predicate.");
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        @kotlin.jvm.JvmStatic
        public static final com.datadog.android.rum.model.ViewEvent.State fromJson(java.lang.String str) {
            return INSTANCE.fromJson(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\u0001\u0018\u0000 \f2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u000b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010"}, d2 = {"Lcom/datadog/android/rum/model/ViewEvent$ProfilingStatus;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Lcom/google/gson/JsonElement;", "toJson", "()Lcom/google/gson/JsonElement;", "getHighSpeedVideoFpsRangesFor", "Ljava/lang/String;", "getHighSpeedVideoSizes", "Companion", "STARTING", kotlinx.coroutines.debug.internal.DebugCoroutineInfoImplKt.RUNNING, "STOPPED", "ERROR"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public enum ProfilingStatus {
        STARTING("starting"),
        RUNNING("running"),
        STOPPED("stopped"),
        ERROR("error");


        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.datadog.android.rum.model.ViewEvent.ProfilingStatus.Companion INSTANCE = new com.datadog.android.rum.model.ViewEvent.ProfilingStatus.Companion(null);

        /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
        private final java.lang.String getHighSpeedVideoSizes;

        ProfilingStatus(java.lang.String str) {
            this.getHighSpeedVideoSizes = str;
        }

        public final com.google.gson.JsonElement toJson() {
            return new com.google.gson.JsonPrimitive(this.getHighSpeedVideoSizes);
        }

        @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/datadog/android/rum/model/ViewEvent$ProfilingStatus$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/rum/model/ViewEvent$ProfilingStatus;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/rum/model/ViewEvent$ProfilingStatus;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @kotlin.jvm.JvmStatic
            public final com.datadog.android.rum.model.ViewEvent.ProfilingStatus fromJson(java.lang.String jsonString) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonString, "");
                for (com.datadog.android.rum.model.ViewEvent.ProfilingStatus profilingStatus : com.datadog.android.rum.model.ViewEvent.ProfilingStatus.values()) {
                    if (kotlin.jvm.internal.Intrinsics.areEqual(profilingStatus.getHighSpeedVideoSizes, jsonString)) {
                        return profilingStatus;
                    }
                }
                throw new java.util.NoSuchElementException("Array contains no element matching the predicate.");
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        @kotlin.jvm.JvmStatic
        public static final com.datadog.android.rum.model.ViewEvent.ProfilingStatus fromJson(java.lang.String str) {
            return INSTANCE.fromJson(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\u0001\u0018\u0000 \f2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u000b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010"}, d2 = {"Lcom/datadog/android/rum/model/ViewEvent$ErrorReason;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Lcom/google/gson/JsonElement;", "toJson", "()Lcom/google/gson/JsonElement;", "getHighSpeedVideoFpsRangesFor", "Ljava/lang/String;", "getHighResolutionOutputSizeshNQ4ISI", "Companion", "NOT_SUPPORTED_BY_BROWSER", "FAILED_TO_LAZY_LOAD", "MISSING_DOCUMENT_POLICY_HEADER", "UNEXPECTED_EXCEPTION"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public enum ErrorReason {
        NOT_SUPPORTED_BY_BROWSER("not-supported-by-browser"),
        FAILED_TO_LAZY_LOAD("failed-to-lazy-load"),
        MISSING_DOCUMENT_POLICY_HEADER("missing-document-policy-header"),
        UNEXPECTED_EXCEPTION("unexpected-exception");


        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.datadog.android.rum.model.ViewEvent.ErrorReason.Companion INSTANCE = new com.datadog.android.rum.model.ViewEvent.ErrorReason.Companion(null);

        /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
        private final java.lang.String getHighResolutionOutputSizeshNQ4ISI;

        ErrorReason(java.lang.String str) {
            this.getHighResolutionOutputSizeshNQ4ISI = str;
        }

        public final com.google.gson.JsonElement toJson() {
            return new com.google.gson.JsonPrimitive(this.getHighResolutionOutputSizeshNQ4ISI);
        }

        @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/datadog/android/rum/model/ViewEvent$ErrorReason$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/rum/model/ViewEvent$ErrorReason;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/rum/model/ViewEvent$ErrorReason;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @kotlin.jvm.JvmStatic
            public final com.datadog.android.rum.model.ViewEvent.ErrorReason fromJson(java.lang.String jsonString) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonString, "");
                for (com.datadog.android.rum.model.ViewEvent.ErrorReason errorReason : com.datadog.android.rum.model.ViewEvent.ErrorReason.values()) {
                    if (kotlin.jvm.internal.Intrinsics.areEqual(errorReason.getHighResolutionOutputSizeshNQ4ISI, jsonString)) {
                        return errorReason;
                    }
                }
                throw new java.util.NoSuchElementException("Array contains no element matching the predicate.");
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        @kotlin.jvm.JvmStatic
        public static final com.datadog.android.rum.model.ViewEvent.ErrorReason fromJson(java.lang.String str) {
            return INSTANCE.fromJson(str);
        }
    }

    public final java.lang.String toString() {
        long j = this.date;
        com.datadog.android.rum.model.ViewEvent.Application application = this.application;
        java.lang.String str = this.service;
        java.lang.String str2 = this.version;
        java.lang.String str3 = this.buildVersion;
        java.lang.String str4 = this.buildId;
        java.lang.String str5 = this.ddtags;
        com.datadog.android.rum.model.ViewEvent.ViewEventSession viewEventSession = this.session;
        com.datadog.android.rum.model.ViewEvent.ViewEventSource viewEventSource = this.source;
        com.datadog.android.rum.model.ViewEvent.ViewEventView viewEventView = this.view;
        com.datadog.android.rum.model.ViewEvent.Usr usr = this.usr;
        com.datadog.android.rum.model.ViewEvent.Account account = this.account;
        com.datadog.android.rum.model.ViewEvent.Connectivity connectivity = this.connectivity;
        com.datadog.android.rum.model.ViewEvent.Display display = this.display;
        com.datadog.android.rum.model.ViewEvent.Synthetics synthetics = this.synthetics;
        com.datadog.android.rum.model.ViewEvent.CiTest ciTest = this.ciTest;
        com.datadog.android.rum.model.ViewEvent.Os os = this.os;
        com.datadog.android.rum.model.ViewEvent.Device device = this.device;
        com.datadog.android.rum.model.ViewEvent.Dd dd = this.dd;
        com.datadog.android.rum.model.ViewEvent.Context context = this.context;
        com.datadog.android.rum.model.ViewEvent.Container container = this.container;
        com.datadog.android.rum.model.ViewEvent.Context context2 = this.featureFlags;
        com.datadog.android.rum.model.ViewEvent.Privacy privacy = this.privacy;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ViewEvent(date=");
        sb.append(j);
        sb.append(", application=");
        sb.append(application);
        sb.append(", service=");
        sb.append(str);
        sb.append(", version=");
        sb.append(str2);
        sb.append(", buildVersion=");
        sb.append(str3);
        sb.append(", buildId=");
        sb.append(str4);
        sb.append(", ddtags=");
        sb.append(str5);
        sb.append(", session=");
        sb.append(viewEventSession);
        sb.append(", source=");
        sb.append(viewEventSource);
        sb.append(", view=");
        sb.append(viewEventView);
        sb.append(", usr=");
        sb.append(usr);
        sb.append(", account=");
        sb.append(account);
        sb.append(", connectivity=");
        sb.append(connectivity);
        sb.append(", display=");
        sb.append(display);
        sb.append(", synthetics=");
        sb.append(synthetics);
        sb.append(", ciTest=");
        sb.append(ciTest);
        sb.append(", os=");
        sb.append(os);
        sb.append(", device=");
        sb.append(device);
        sb.append(", dd=");
        sb.append(dd);
        sb.append(", context=");
        sb.append(context);
        sb.append(", container=");
        sb.append(container);
        sb.append(", featureFlags=");
        sb.append(context2);
        sb.append(", privacy=");
        sb.append(privacy);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = java.lang.Long.hashCode(this.date);
        int hashCode2 = this.application.hashCode();
        java.lang.String str = this.service;
        int hashCode3 = str == null ? 0 : str.hashCode();
        java.lang.String str2 = this.version;
        int hashCode4 = str2 == null ? 0 : str2.hashCode();
        java.lang.String str3 = this.buildVersion;
        int hashCode5 = str3 == null ? 0 : str3.hashCode();
        java.lang.String str4 = this.buildId;
        int hashCode6 = str4 == null ? 0 : str4.hashCode();
        java.lang.String str5 = this.ddtags;
        int hashCode7 = str5 == null ? 0 : str5.hashCode();
        int hashCode8 = this.session.hashCode();
        com.datadog.android.rum.model.ViewEvent.ViewEventSource viewEventSource = this.source;
        int hashCode9 = viewEventSource == null ? 0 : viewEventSource.hashCode();
        int hashCode10 = this.view.hashCode();
        com.datadog.android.rum.model.ViewEvent.Usr usr = this.usr;
        int hashCode11 = usr == null ? 0 : usr.hashCode();
        com.datadog.android.rum.model.ViewEvent.Account account = this.account;
        int hashCode12 = account == null ? 0 : account.hashCode();
        com.datadog.android.rum.model.ViewEvent.Connectivity connectivity = this.connectivity;
        int hashCode13 = connectivity == null ? 0 : connectivity.hashCode();
        com.datadog.android.rum.model.ViewEvent.Display display = this.display;
        int hashCode14 = display == null ? 0 : display.hashCode();
        com.datadog.android.rum.model.ViewEvent.Synthetics synthetics = this.synthetics;
        int hashCode15 = synthetics == null ? 0 : synthetics.hashCode();
        com.datadog.android.rum.model.ViewEvent.CiTest ciTest = this.ciTest;
        int hashCode16 = ciTest == null ? 0 : ciTest.hashCode();
        com.datadog.android.rum.model.ViewEvent.Os os = this.os;
        int hashCode17 = os == null ? 0 : os.hashCode();
        com.datadog.android.rum.model.ViewEvent.Device device = this.device;
        int hashCode18 = device == null ? 0 : device.hashCode();
        int hashCode19 = this.dd.hashCode();
        com.datadog.android.rum.model.ViewEvent.Context context = this.context;
        int hashCode20 = context == null ? 0 : context.hashCode();
        com.datadog.android.rum.model.ViewEvent.Container container = this.container;
        int hashCode21 = container == null ? 0 : container.hashCode();
        com.datadog.android.rum.model.ViewEvent.Context context2 = this.featureFlags;
        int hashCode22 = context2 == null ? 0 : context2.hashCode();
        com.datadog.android.rum.model.ViewEvent.Privacy privacy = this.privacy;
        return (((((((((((((((((((((((((((((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + hashCode10) * 31) + hashCode11) * 31) + hashCode12) * 31) + hashCode13) * 31) + hashCode14) * 31) + hashCode15) * 31) + hashCode16) * 31) + hashCode17) * 31) + hashCode18) * 31) + hashCode19) * 31) + hashCode20) * 31) + hashCode21) * 31) + hashCode22) * 31) + (privacy != null ? privacy.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.datadog.android.rum.model.ViewEvent)) {
            return false;
        }
        com.datadog.android.rum.model.ViewEvent viewEvent = (com.datadog.android.rum.model.ViewEvent) other;
        return this.date == viewEvent.date && kotlin.jvm.internal.Intrinsics.areEqual(this.application, viewEvent.application) && kotlin.jvm.internal.Intrinsics.areEqual(this.service, viewEvent.service) && kotlin.jvm.internal.Intrinsics.areEqual(this.version, viewEvent.version) && kotlin.jvm.internal.Intrinsics.areEqual(this.buildVersion, viewEvent.buildVersion) && kotlin.jvm.internal.Intrinsics.areEqual(this.buildId, viewEvent.buildId) && kotlin.jvm.internal.Intrinsics.areEqual(this.ddtags, viewEvent.ddtags) && kotlin.jvm.internal.Intrinsics.areEqual(this.session, viewEvent.session) && this.source == viewEvent.source && kotlin.jvm.internal.Intrinsics.areEqual(this.view, viewEvent.view) && kotlin.jvm.internal.Intrinsics.areEqual(this.usr, viewEvent.usr) && kotlin.jvm.internal.Intrinsics.areEqual(this.account, viewEvent.account) && kotlin.jvm.internal.Intrinsics.areEqual(this.connectivity, viewEvent.connectivity) && kotlin.jvm.internal.Intrinsics.areEqual(this.display, viewEvent.display) && kotlin.jvm.internal.Intrinsics.areEqual(this.synthetics, viewEvent.synthetics) && kotlin.jvm.internal.Intrinsics.areEqual(this.ciTest, viewEvent.ciTest) && kotlin.jvm.internal.Intrinsics.areEqual(this.os, viewEvent.os) && kotlin.jvm.internal.Intrinsics.areEqual(this.device, viewEvent.device) && kotlin.jvm.internal.Intrinsics.areEqual(this.dd, viewEvent.dd) && kotlin.jvm.internal.Intrinsics.areEqual(this.context, viewEvent.context) && kotlin.jvm.internal.Intrinsics.areEqual(this.container, viewEvent.container) && kotlin.jvm.internal.Intrinsics.areEqual(this.featureFlags, viewEvent.featureFlags) && kotlin.jvm.internal.Intrinsics.areEqual(this.privacy, viewEvent.privacy);
    }

    public final com.datadog.android.rum.model.ViewEvent copy(long date, com.datadog.android.rum.model.ViewEvent.Application application, java.lang.String service, java.lang.String version, java.lang.String buildVersion, java.lang.String buildId, java.lang.String ddtags, com.datadog.android.rum.model.ViewEvent.ViewEventSession session, com.datadog.android.rum.model.ViewEvent.ViewEventSource source, com.datadog.android.rum.model.ViewEvent.ViewEventView view, com.datadog.android.rum.model.ViewEvent.Usr usr, com.datadog.android.rum.model.ViewEvent.Account account, com.datadog.android.rum.model.ViewEvent.Connectivity connectivity, com.datadog.android.rum.model.ViewEvent.Display display, com.datadog.android.rum.model.ViewEvent.Synthetics synthetics, com.datadog.android.rum.model.ViewEvent.CiTest ciTest, com.datadog.android.rum.model.ViewEvent.Os os, com.datadog.android.rum.model.ViewEvent.Device device, com.datadog.android.rum.model.ViewEvent.Dd dd, com.datadog.android.rum.model.ViewEvent.Context context, com.datadog.android.rum.model.ViewEvent.Container container, com.datadog.android.rum.model.ViewEvent.Context featureFlags, com.datadog.android.rum.model.ViewEvent.Privacy privacy) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(application, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(session, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dd, "");
        return new com.datadog.android.rum.model.ViewEvent(date, application, service, version, buildVersion, buildId, ddtags, session, source, view, usr, account, connectivity, display, synthetics, ciTest, os, device, dd, context, container, featureFlags, privacy);
    }

    /* renamed from: component9, reason: from getter */
    public final com.datadog.android.rum.model.ViewEvent.ViewEventSource getSource() {
        return this.source;
    }

    /* renamed from: component8, reason: from getter */
    public final com.datadog.android.rum.model.ViewEvent.ViewEventSession getSession() {
        return this.session;
    }

    /* renamed from: component7, reason: from getter */
    public final java.lang.String getDdtags() {
        return this.ddtags;
    }

    /* renamed from: component6, reason: from getter */
    public final java.lang.String getBuildId() {
        return this.buildId;
    }

    /* renamed from: component5, reason: from getter */
    public final java.lang.String getBuildVersion() {
        return this.buildVersion;
    }

    /* renamed from: component4, reason: from getter */
    public final java.lang.String getVersion() {
        return this.version;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getService() {
        return this.service;
    }

    /* renamed from: component23, reason: from getter */
    public final com.datadog.android.rum.model.ViewEvent.Privacy getPrivacy() {
        return this.privacy;
    }

    /* renamed from: component22, reason: from getter */
    public final com.datadog.android.rum.model.ViewEvent.Context getFeatureFlags() {
        return this.featureFlags;
    }

    /* renamed from: component21, reason: from getter */
    public final com.datadog.android.rum.model.ViewEvent.Container getContainer() {
        return this.container;
    }

    /* renamed from: component20, reason: from getter */
    public final com.datadog.android.rum.model.ViewEvent.Context getContext() {
        return this.context;
    }

    /* renamed from: component2, reason: from getter */
    public final com.datadog.android.rum.model.ViewEvent.Application getApplication() {
        return this.application;
    }

    /* renamed from: component19, reason: from getter */
    public final com.datadog.android.rum.model.ViewEvent.Dd getDd() {
        return this.dd;
    }

    /* renamed from: component18, reason: from getter */
    public final com.datadog.android.rum.model.ViewEvent.Device getDevice() {
        return this.device;
    }

    /* renamed from: component17, reason: from getter */
    public final com.datadog.android.rum.model.ViewEvent.Os getOs() {
        return this.os;
    }

    /* renamed from: component16, reason: from getter */
    public final com.datadog.android.rum.model.ViewEvent.CiTest getCiTest() {
        return this.ciTest;
    }

    /* renamed from: component15, reason: from getter */
    public final com.datadog.android.rum.model.ViewEvent.Synthetics getSynthetics() {
        return this.synthetics;
    }

    /* renamed from: component14, reason: from getter */
    public final com.datadog.android.rum.model.ViewEvent.Display getDisplay() {
        return this.display;
    }

    /* renamed from: component13, reason: from getter */
    public final com.datadog.android.rum.model.ViewEvent.Connectivity getConnectivity() {
        return this.connectivity;
    }

    /* renamed from: component12, reason: from getter */
    public final com.datadog.android.rum.model.ViewEvent.Account getAccount() {
        return this.account;
    }

    /* renamed from: component11, reason: from getter */
    public final com.datadog.android.rum.model.ViewEvent.Usr getUsr() {
        return this.usr;
    }

    /* renamed from: component10, reason: from getter */
    public final com.datadog.android.rum.model.ViewEvent.ViewEventView getView() {
        return this.view;
    }

    /* renamed from: component1, reason: from getter */
    public final long getDate() {
        return this.date;
    }

    @kotlin.jvm.JvmStatic
    public static final com.datadog.android.rum.model.ViewEvent fromJsonObject(com.google.gson.JsonObject jsonObject) throws com.google.gson.JsonParseException {
        return INSTANCE.fromJsonObject(jsonObject);
    }

    @kotlin.jvm.JvmStatic
    public static final com.datadog.android.rum.model.ViewEvent fromJson(java.lang.String str) throws com.google.gson.JsonParseException {
        return INSTANCE.fromJson(str);
    }
}
