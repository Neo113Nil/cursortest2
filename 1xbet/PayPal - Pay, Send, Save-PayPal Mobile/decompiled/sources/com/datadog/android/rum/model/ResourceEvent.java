package com.datadog.android.rum.model;

@kotlin.Metadata(d1 = {"\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b0\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\bb\b\u0086\b\u0018\u0000 \u0091\u00012\u00020\u0001:f\u0092\u0001\u0093\u0001\u0094\u0001\u0095\u0001\u0096\u0001\u0091\u0001\u0097\u0001\u0098\u0001\u0099\u0001\u009a\u0001\u009b\u0001\u009c\u0001\u009d\u0001\u009e\u0001\u009f\u0001 \u0001¡\u0001¢\u0001£\u0001¤\u0001¥\u0001¦\u0001§\u0001¨\u0001©\u0001ª\u0001«\u0001¬\u0001\u00ad\u0001®\u0001¯\u0001°\u0001±\u0001²\u0001³\u0001´\u0001µ\u0001¶\u0001·\u0001¸\u0001¹\u0001º\u0001»\u0001¼\u0001½\u0001¾\u0001¿\u0001À\u0001Á\u0001Â\u0001Ã\u0001B\u0083\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\r\u001a\u00020\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001e\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010 \u0012\u0006\u0010#\u001a\u00020\"\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010$\u0012\n\b\u0002\u0010'\u001a\u0004\u0018\u00010&\u0012\n\b\u0002\u0010)\u001a\u0004\u0018\u00010(\u0012\u0006\u0010+\u001a\u00020*¢\u0006\u0004\b,\u0010-J\u0010\u0010.\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b.\u0010/J\u0010\u00100\u001a\u00020\u0010HÆ\u0003¢\u0006\u0004\b0\u00101J\u0012\u00102\u001a\u0004\u0018\u00010\u0012HÆ\u0003¢\u0006\u0004\b2\u00103J\u0012\u00104\u001a\u0004\u0018\u00010\u0014HÆ\u0003¢\u0006\u0004\b4\u00105J\u0012\u00106\u001a\u0004\u0018\u00010\u0016HÆ\u0003¢\u0006\u0004\b6\u00107J\u0012\u00108\u001a\u0004\u0018\u00010\u0018HÆ\u0003¢\u0006\u0004\b8\u00109J\u0012\u0010:\u001a\u0004\u0018\u00010\u001aHÆ\u0003¢\u0006\u0004\b:\u0010;J\u0012\u0010<\u001a\u0004\u0018\u00010\u001cHÆ\u0003¢\u0006\u0004\b<\u0010=J\u0012\u0010>\u001a\u0004\u0018\u00010\u001eHÆ\u0003¢\u0006\u0004\b>\u0010?J\u0012\u0010@\u001a\u0004\u0018\u00010 HÆ\u0003¢\u0006\u0004\b@\u0010AJ\u0010\u0010B\u001a\u00020\"HÆ\u0003¢\u0006\u0004\bB\u0010CJ\u0010\u0010D\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\bD\u0010EJ\u0012\u0010F\u001a\u0004\u0018\u00010$HÆ\u0003¢\u0006\u0004\bF\u0010GJ\u0012\u0010H\u001a\u0004\u0018\u00010&HÆ\u0003¢\u0006\u0004\bH\u0010IJ\u0012\u0010J\u001a\u0004\u0018\u00010(HÆ\u0003¢\u0006\u0004\bJ\u0010KJ\u0010\u0010L\u001a\u00020*HÆ\u0003¢\u0006\u0004\bL\u0010MJ\u0012\u0010N\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\bN\u0010OJ\u0012\u0010P\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\bP\u0010OJ\u0012\u0010Q\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\bQ\u0010OJ\u0012\u0010R\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\bR\u0010OJ\u0012\u0010S\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\bS\u0010OJ\u0010\u0010T\u001a\u00020\fHÆ\u0003¢\u0006\u0004\bT\u0010UJ\u0012\u0010V\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\bV\u0010WJ\u0098\u0002\u0010X\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\r\u001a\u00020\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010 2\b\b\u0002\u0010#\u001a\u00020\"2\n\b\u0002\u0010%\u001a\u0004\u0018\u00010$2\n\b\u0002\u0010'\u001a\u0004\u0018\u00010&2\n\b\u0002\u0010)\u001a\u0004\u0018\u00010(2\b\b\u0002\u0010+\u001a\u00020*HÆ\u0001¢\u0006\u0004\bX\u0010YJ\u001a\u0010\\\u001a\u00020[2\b\u0010Z\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\\\u0010]J\u0010\u0010_\u001a\u00020^HÖ\u0001¢\u0006\u0004\b_\u0010`J\r\u0010b\u001a\u00020a¢\u0006\u0004\bb\u0010cJ\u0010\u0010d\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\bd\u0010OR\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0007¢\u0006\f\n\u0004\b\u0015\u0010e\u001a\u0004\bf\u00105R\u001c\u0010'\u001a\u0004\u0018\u00010&8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b'\u0010g\u001a\u0004\bh\u0010IR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010i\u001a\u0004\bj\u0010ER\u001c\u0010\n\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010k\u001a\u0004\bl\u0010OR\u001c\u0010\t\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010k\u001a\u0004\bm\u0010OR\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010n\u001a\u0004\bo\u0010=R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010p\u001a\u0004\bq\u00107R\u001c\u0010)\u001a\u0004\u0018\u00010(8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b)\u0010r\u001a\u0004\bs\u0010KR\u001c\u0010%\u001a\u0004\u0018\u00010$8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010t\u001a\u0004\bu\u0010GR\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010v\u001a\u0004\bw\u0010/R\u001a\u0010#\u001a\u00020\"8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010x\u001a\u0004\by\u0010CR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010k\u001a\u0004\bz\u0010OR\u001c\u0010!\u001a\u0004\u0018\u00010 8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010{\u001a\u0004\b|\u0010AR\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010}\u001a\u0004\b~\u00109R\u001d\u0010\u001f\u001a\u0004\u0018\u00010\u001e8\u0007X\u0087\u0004¢\u0006\r\n\u0004\b\u001f\u0010\u007f\u001a\u0005\b\u0080\u0001\u0010?R\u001c\u0010+\u001a\u00020*8\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b+\u0010\u0081\u0001\u001a\u0005\b\u0082\u0001\u0010MR\u001d\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\r\n\u0004\b\u0007\u0010k\u001a\u0005\b\u0083\u0001\u0010OR\u001c\u0010\r\u001a\u00020\f8\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b\r\u0010\u0084\u0001\u001a\u0005\b\u0085\u0001\u0010UR\u001e\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b\u000f\u0010\u0086\u0001\u001a\u0005\b\u0087\u0001\u0010WR\u001e\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b\u001b\u0010\u0088\u0001\u001a\u0005\b\u0089\u0001\u0010;R\u001d\u0010\u008a\u0001\u001a\u00020\u00068\u0007X\u0087D¢\u0006\u000e\n\u0005\b\u008a\u0001\u0010k\u001a\u0005\b\u008b\u0001\u0010OR\u001e\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b\u0013\u0010\u008c\u0001\u001a\u0005\b\u008d\u0001\u00103R\u001d\u0010\b\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\r\n\u0004\b\b\u0010k\u001a\u0005\b\u008e\u0001\u0010OR\u001c\u0010\u0011\u001a\u00020\u00108\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b\u0011\u0010\u008f\u0001\u001a\u0005\b\u0090\u0001\u00101"}, d2 = {"Lcom/datadog/android/rum/model/ResourceEvent;", "", "", "date", "Lcom/datadog/android/rum/model/ResourceEvent$Application;", "application", "", "service", "version", "buildVersion", "buildId", "ddtags", "Lcom/datadog/android/rum/model/ResourceEvent$ResourceEventSession;", "session", "Lcom/datadog/android/rum/model/ResourceEvent$ResourceEventSource;", "source", "Lcom/datadog/android/rum/model/ResourceEvent$ResourceEventView;", "view", "Lcom/datadog/android/rum/model/ResourceEvent$Usr;", "usr", "Lcom/datadog/android/rum/model/ResourceEvent$Account;", "account", "Lcom/datadog/android/rum/model/ResourceEvent$Connectivity;", "connectivity", "Lcom/datadog/android/rum/model/ResourceEvent$Display;", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DISPLAY_NOTIFICATION, "Lcom/datadog/android/rum/model/ResourceEvent$Synthetics;", "synthetics", "Lcom/datadog/android/rum/model/ResourceEvent$CiTest;", "ciTest", "Lcom/datadog/android/rum/model/ResourceEvent$Os;", "os", "Lcom/datadog/android/rum/model/ResourceEvent$Device;", "device", "Lcom/datadog/android/rum/model/ResourceEvent$Dd;", "dd", "Lcom/datadog/android/rum/model/ResourceEvent$Context;", "context", "Lcom/datadog/android/rum/model/ResourceEvent$Action;", "action", "Lcom/datadog/android/rum/model/ResourceEvent$Container;", "container", "Lcom/datadog/android/rum/model/ResourceEvent$Resource;", "resource", "<init>", "(JLcom/datadog/android/rum/model/ResourceEvent$Application;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/datadog/android/rum/model/ResourceEvent$ResourceEventSession;Lcom/datadog/android/rum/model/ResourceEvent$ResourceEventSource;Lcom/datadog/android/rum/model/ResourceEvent$ResourceEventView;Lcom/datadog/android/rum/model/ResourceEvent$Usr;Lcom/datadog/android/rum/model/ResourceEvent$Account;Lcom/datadog/android/rum/model/ResourceEvent$Connectivity;Lcom/datadog/android/rum/model/ResourceEvent$Display;Lcom/datadog/android/rum/model/ResourceEvent$Synthetics;Lcom/datadog/android/rum/model/ResourceEvent$CiTest;Lcom/datadog/android/rum/model/ResourceEvent$Os;Lcom/datadog/android/rum/model/ResourceEvent$Device;Lcom/datadog/android/rum/model/ResourceEvent$Dd;Lcom/datadog/android/rum/model/ResourceEvent$Context;Lcom/datadog/android/rum/model/ResourceEvent$Action;Lcom/datadog/android/rum/model/ResourceEvent$Container;Lcom/datadog/android/rum/model/ResourceEvent$Resource;)V", "component1", "()J", "component10", "()Lcom/datadog/android/rum/model/ResourceEvent$ResourceEventView;", "component11", "()Lcom/datadog/android/rum/model/ResourceEvent$Usr;", "component12", "()Lcom/datadog/android/rum/model/ResourceEvent$Account;", "component13", "()Lcom/datadog/android/rum/model/ResourceEvent$Connectivity;", "component14", "()Lcom/datadog/android/rum/model/ResourceEvent$Display;", "component15", "()Lcom/datadog/android/rum/model/ResourceEvent$Synthetics;", "component16", "()Lcom/datadog/android/rum/model/ResourceEvent$CiTest;", "component17", "()Lcom/datadog/android/rum/model/ResourceEvent$Os;", "component18", "()Lcom/datadog/android/rum/model/ResourceEvent$Device;", "component19", "()Lcom/datadog/android/rum/model/ResourceEvent$Dd;", "component2", "()Lcom/datadog/android/rum/model/ResourceEvent$Application;", "component20", "()Lcom/datadog/android/rum/model/ResourceEvent$Context;", "component21", "()Lcom/datadog/android/rum/model/ResourceEvent$Action;", "component22", "()Lcom/datadog/android/rum/model/ResourceEvent$Container;", "component23", "()Lcom/datadog/android/rum/model/ResourceEvent$Resource;", "component3", "()Ljava/lang/String;", "component4", "component5", "component6", "component7", "component8", "()Lcom/datadog/android/rum/model/ResourceEvent$ResourceEventSession;", "component9", "()Lcom/datadog/android/rum/model/ResourceEvent$ResourceEventSource;", "copy", "(JLcom/datadog/android/rum/model/ResourceEvent$Application;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/datadog/android/rum/model/ResourceEvent$ResourceEventSession;Lcom/datadog/android/rum/model/ResourceEvent$ResourceEventSource;Lcom/datadog/android/rum/model/ResourceEvent$ResourceEventView;Lcom/datadog/android/rum/model/ResourceEvent$Usr;Lcom/datadog/android/rum/model/ResourceEvent$Account;Lcom/datadog/android/rum/model/ResourceEvent$Connectivity;Lcom/datadog/android/rum/model/ResourceEvent$Display;Lcom/datadog/android/rum/model/ResourceEvent$Synthetics;Lcom/datadog/android/rum/model/ResourceEvent$CiTest;Lcom/datadog/android/rum/model/ResourceEvent$Os;Lcom/datadog/android/rum/model/ResourceEvent$Device;Lcom/datadog/android/rum/model/ResourceEvent$Dd;Lcom/datadog/android/rum/model/ResourceEvent$Context;Lcom/datadog/android/rum/model/ResourceEvent$Action;Lcom/datadog/android/rum/model/ResourceEvent$Container;Lcom/datadog/android/rum/model/ResourceEvent$Resource;)Lcom/datadog/android/rum/model/ResourceEvent;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lcom/google/gson/JsonElement;", "toJson", "()Lcom/google/gson/JsonElement;", "toString", "Lcom/datadog/android/rum/model/ResourceEvent$Account;", "getAccount", "Lcom/datadog/android/rum/model/ResourceEvent$Action;", "getAction", "Lcom/datadog/android/rum/model/ResourceEvent$Application;", "getApplication", "Ljava/lang/String;", "getBuildId", "getBuildVersion", "Lcom/datadog/android/rum/model/ResourceEvent$CiTest;", "getCiTest", "Lcom/datadog/android/rum/model/ResourceEvent$Connectivity;", "getConnectivity", "Lcom/datadog/android/rum/model/ResourceEvent$Container;", "getContainer", "Lcom/datadog/android/rum/model/ResourceEvent$Context;", "getContext", "J", "getDate", "Lcom/datadog/android/rum/model/ResourceEvent$Dd;", "getDd", "getDdtags", "Lcom/datadog/android/rum/model/ResourceEvent$Device;", "getDevice", "Lcom/datadog/android/rum/model/ResourceEvent$Display;", "getDisplay", "Lcom/datadog/android/rum/model/ResourceEvent$Os;", "getOs", "Lcom/datadog/android/rum/model/ResourceEvent$Resource;", "getResource", "getService", "Lcom/datadog/android/rum/model/ResourceEvent$ResourceEventSession;", "getSession", "Lcom/datadog/android/rum/model/ResourceEvent$ResourceEventSource;", "getSource", "Lcom/datadog/android/rum/model/ResourceEvent$Synthetics;", "getSynthetics", "type", "getType", "Lcom/datadog/android/rum/model/ResourceEvent$Usr;", "getUsr", "getVersion", "Lcom/datadog/android/rum/model/ResourceEvent$ResourceEventView;", "getView", "Companion", "Account", "Action", "Application", "Cellular", "CiTest", com.adobe.marketing.mobile.internal.configuration.ConfigurationExtension.TAG, "Connect", "Connectivity", androidx.compose.material3.internal.TextFieldImplKt.ContainerId, "ContainerView", "Context", "Dd", "DdSession", "DeliveryType", "Device", "DeviceType", "Display", "Dns", "Download", "EffectiveType", "Error", "FirstByte", "Graphql", "Interface", "Location", "Method", "OperationType", "Os", "Path", "Plan", "Provider", "ProviderType", "Redirect", "RenderBlockingStatus", "Request", "RequestHeaders", "Resource", "ResourceEventSession", "ResourceEventSessionType", "ResourceEventSource", "ResourceEventView", "ResourceType", "Response", "SessionPrecondition", "Ssl", "Status", "Synthetics", "Usr", "Viewport", "Worker"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class ResourceEvent {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.datadog.android.rum.model.ResourceEvent.Companion INSTANCE = new com.datadog.android.rum.model.ResourceEvent.Companion(null);
    private final com.datadog.android.rum.model.ResourceEvent.Account account;
    private final com.datadog.android.rum.model.ResourceEvent.Action action;
    private final com.datadog.android.rum.model.ResourceEvent.Application application;
    private final java.lang.String buildId;
    private final java.lang.String buildVersion;
    private final com.datadog.android.rum.model.ResourceEvent.CiTest ciTest;
    private final com.datadog.android.rum.model.ResourceEvent.Connectivity connectivity;
    private final com.datadog.android.rum.model.ResourceEvent.Container container;
    private final com.datadog.android.rum.model.ResourceEvent.Context context;
    private final long date;
    private final com.datadog.android.rum.model.ResourceEvent.Dd dd;
    private final java.lang.String ddtags;
    private final com.datadog.android.rum.model.ResourceEvent.Device device;
    private final com.datadog.android.rum.model.ResourceEvent.Display display;
    private final com.datadog.android.rum.model.ResourceEvent.Os os;
    private final com.datadog.android.rum.model.ResourceEvent.Resource resource;
    private final java.lang.String service;
    private final com.datadog.android.rum.model.ResourceEvent.ResourceEventSession session;
    private final com.datadog.android.rum.model.ResourceEvent.ResourceEventSource source;
    private final com.datadog.android.rum.model.ResourceEvent.Synthetics synthetics;
    private final java.lang.String type;
    private final com.datadog.android.rum.model.ResourceEvent.Usr usr;
    private final java.lang.String version;
    private final com.datadog.android.rum.model.ResourceEvent.ResourceEventView view;

    public ResourceEvent(long j, com.datadog.android.rum.model.ResourceEvent.Application application, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, com.datadog.android.rum.model.ResourceEvent.ResourceEventSession resourceEventSession, com.datadog.android.rum.model.ResourceEvent.ResourceEventSource resourceEventSource, com.datadog.android.rum.model.ResourceEvent.ResourceEventView resourceEventView, com.datadog.android.rum.model.ResourceEvent.Usr usr, com.datadog.android.rum.model.ResourceEvent.Account account, com.datadog.android.rum.model.ResourceEvent.Connectivity connectivity, com.datadog.android.rum.model.ResourceEvent.Display display, com.datadog.android.rum.model.ResourceEvent.Synthetics synthetics, com.datadog.android.rum.model.ResourceEvent.CiTest ciTest, com.datadog.android.rum.model.ResourceEvent.Os os, com.datadog.android.rum.model.ResourceEvent.Device device, com.datadog.android.rum.model.ResourceEvent.Dd dd, com.datadog.android.rum.model.ResourceEvent.Context context, com.datadog.android.rum.model.ResourceEvent.Action action, com.datadog.android.rum.model.ResourceEvent.Container container, com.datadog.android.rum.model.ResourceEvent.Resource resource) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(application, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(resourceEventSession, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(resourceEventView, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dd, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(resource, "");
        this.date = j;
        this.application = application;
        this.service = str;
        this.version = str2;
        this.buildVersion = str3;
        this.buildId = str4;
        this.ddtags = str5;
        this.session = resourceEventSession;
        this.source = resourceEventSource;
        this.view = resourceEventView;
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
        this.action = action;
        this.container = container;
        this.resource = resource;
        this.type = "resource";
    }

    public /* synthetic */ ResourceEvent(long j, com.datadog.android.rum.model.ResourceEvent.Application application, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, com.datadog.android.rum.model.ResourceEvent.ResourceEventSession resourceEventSession, com.datadog.android.rum.model.ResourceEvent.ResourceEventSource resourceEventSource, com.datadog.android.rum.model.ResourceEvent.ResourceEventView resourceEventView, com.datadog.android.rum.model.ResourceEvent.Usr usr, com.datadog.android.rum.model.ResourceEvent.Account account, com.datadog.android.rum.model.ResourceEvent.Connectivity connectivity, com.datadog.android.rum.model.ResourceEvent.Display display, com.datadog.android.rum.model.ResourceEvent.Synthetics synthetics, com.datadog.android.rum.model.ResourceEvent.CiTest ciTest, com.datadog.android.rum.model.ResourceEvent.Os os, com.datadog.android.rum.model.ResourceEvent.Device device, com.datadog.android.rum.model.ResourceEvent.Dd dd, com.datadog.android.rum.model.ResourceEvent.Context context, com.datadog.android.rum.model.ResourceEvent.Action action, com.datadog.android.rum.model.ResourceEvent.Container container, com.datadog.android.rum.model.ResourceEvent.Resource resource, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(j, application, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? null : str4, (i & 64) != 0 ? null : str5, resourceEventSession, (i & 256) != 0 ? null : resourceEventSource, resourceEventView, (i & 1024) != 0 ? null : usr, (i & 2048) != 0 ? null : account, (i & 4096) != 0 ? null : connectivity, (i & 8192) != 0 ? null : display, (i & 16384) != 0 ? null : synthetics, (32768 & i) != 0 ? null : ciTest, (65536 & i) != 0 ? null : os, (131072 & i) != 0 ? null : device, dd, (524288 & i) != 0 ? null : context, (1048576 & i) != 0 ? null : action, (i & 2097152) != 0 ? null : container, resource);
    }

    public final long getDate() {
        return this.date;
    }

    public final com.datadog.android.rum.model.ResourceEvent.Application getApplication() {
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

    public final com.datadog.android.rum.model.ResourceEvent.ResourceEventSession getSession() {
        return this.session;
    }

    public final com.datadog.android.rum.model.ResourceEvent.ResourceEventSource getSource() {
        return this.source;
    }

    public final com.datadog.android.rum.model.ResourceEvent.ResourceEventView getView() {
        return this.view;
    }

    public final com.datadog.android.rum.model.ResourceEvent.Usr getUsr() {
        return this.usr;
    }

    public final com.datadog.android.rum.model.ResourceEvent.Account getAccount() {
        return this.account;
    }

    public final com.datadog.android.rum.model.ResourceEvent.Connectivity getConnectivity() {
        return this.connectivity;
    }

    public final com.datadog.android.rum.model.ResourceEvent.Display getDisplay() {
        return this.display;
    }

    public final com.datadog.android.rum.model.ResourceEvent.Synthetics getSynthetics() {
        return this.synthetics;
    }

    public final com.datadog.android.rum.model.ResourceEvent.CiTest getCiTest() {
        return this.ciTest;
    }

    public final com.datadog.android.rum.model.ResourceEvent.Os getOs() {
        return this.os;
    }

    public final com.datadog.android.rum.model.ResourceEvent.Device getDevice() {
        return this.device;
    }

    public final com.datadog.android.rum.model.ResourceEvent.Dd getDd() {
        return this.dd;
    }

    public final com.datadog.android.rum.model.ResourceEvent.Context getContext() {
        return this.context;
    }

    public final com.datadog.android.rum.model.ResourceEvent.Action getAction() {
        return this.action;
    }

    public final com.datadog.android.rum.model.ResourceEvent.Container getContainer() {
        return this.container;
    }

    public final com.datadog.android.rum.model.ResourceEvent.Resource getResource() {
        return this.resource;
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
        com.datadog.android.rum.model.ResourceEvent.ResourceEventSource resourceEventSource = this.source;
        if (resourceEventSource != null) {
            jsonObject.add("source", resourceEventSource.toJson());
        }
        jsonObject.add("view", this.view.toJson());
        com.datadog.android.rum.model.ResourceEvent.Usr usr = this.usr;
        if (usr != null) {
            jsonObject.add("usr", usr.toJson());
        }
        com.datadog.android.rum.model.ResourceEvent.Account account = this.account;
        if (account != null) {
            jsonObject.add("account", account.toJson());
        }
        com.datadog.android.rum.model.ResourceEvent.Connectivity connectivity = this.connectivity;
        if (connectivity != null) {
            jsonObject.add("connectivity", connectivity.toJson());
        }
        com.datadog.android.rum.model.ResourceEvent.Display display = this.display;
        if (display != null) {
            jsonObject.add(com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DISPLAY_NOTIFICATION, display.toJson());
        }
        com.datadog.android.rum.model.ResourceEvent.Synthetics synthetics = this.synthetics;
        if (synthetics != null) {
            jsonObject.add("synthetics", synthetics.toJson());
        }
        com.datadog.android.rum.model.ResourceEvent.CiTest ciTest = this.ciTest;
        if (ciTest != null) {
            jsonObject.add("ci_test", ciTest.toJson());
        }
        com.datadog.android.rum.model.ResourceEvent.Os os = this.os;
        if (os != null) {
            jsonObject.add("os", os.toJson());
        }
        com.datadog.android.rum.model.ResourceEvent.Device device = this.device;
        if (device != null) {
            jsonObject.add("device", device.toJson());
        }
        jsonObject.add("_dd", this.dd.toJson());
        com.datadog.android.rum.model.ResourceEvent.Context context = this.context;
        if (context != null) {
            jsonObject.add("context", context.toJson());
        }
        com.datadog.android.rum.model.ResourceEvent.Action action = this.action;
        if (action != null) {
            jsonObject.add("action", action.toJson());
        }
        com.datadog.android.rum.model.ResourceEvent.Container container = this.container;
        if (container != null) {
            jsonObject.add("container", container.toJson());
        }
        jsonObject.addProperty("type", this.type);
        jsonObject.add("resource", this.resource.toJson());
        return jsonObject;
    }

    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/datadog/android/rum/model/ResourceEvent$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/rum/model/ResourceEvent;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/rum/model/ResourceEvent;", "Lcom/google/gson/JsonObject;", "jsonObject", "fromJsonObject", "(Lcom/google/gson/JsonObject;)Lcom/datadog/android/rum/model/ResourceEvent;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes7.dex */
    public static final class Companion {
        private Companion() {
        }

        @kotlin.jvm.JvmStatic
        public final com.datadog.android.rum.model.ResourceEvent fromJson(java.lang.String jsonString) throws com.google.gson.JsonParseException {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonString, "");
            try {
                com.google.gson.JsonObject asJsonObject = com.google.gson.JsonParser.parseString(jsonString).getAsJsonObject();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asJsonObject, "");
                return fromJsonObject(asJsonObject);
            } catch (java.lang.IllegalStateException e) {
                throw new com.google.gson.JsonParseException("Unable to parse json into type ResourceEvent", e);
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:88:0x01fb A[Catch: NullPointerException -> 0x0210, NumberFormatException -> 0x0212, IllegalStateException -> 0x0216, TryCatch #6 {IllegalStateException -> 0x0216, NullPointerException -> 0x0210, NumberFormatException -> 0x0212, blocks: (B:35:0x00c0, B:36:0x00cd, B:38:0x00d5, B:40:0x00db, B:41:0x00e6, B:43:0x00ee, B:45:0x00f4, B:46:0x00ff, B:48:0x0107, B:50:0x010d, B:51:0x0118, B:53:0x0120, B:55:0x0126, B:56:0x0131, B:58:0x0139, B:60:0x013f, B:61:0x014a, B:63:0x0152, B:65:0x0158, B:66:0x0163, B:68:0x016b, B:70:0x0171, B:71:0x017c, B:73:0x0197, B:75:0x019d, B:76:0x01a8, B:78:0x01b0, B:80:0x01b6, B:81:0x01c1, B:83:0x01c9, B:85:0x01cf, B:86:0x01da, B:88:0x01fb, B:91:0x0204, B:92:0x020f), top: B:34:0x00c0 }] */
        /* JADX WARN: Removed duplicated region for block: B:91:0x0204 A[Catch: NullPointerException -> 0x0210, NumberFormatException -> 0x0212, IllegalStateException -> 0x0216, TryCatch #6 {IllegalStateException -> 0x0216, NullPointerException -> 0x0210, NumberFormatException -> 0x0212, blocks: (B:35:0x00c0, B:36:0x00cd, B:38:0x00d5, B:40:0x00db, B:41:0x00e6, B:43:0x00ee, B:45:0x00f4, B:46:0x00ff, B:48:0x0107, B:50:0x010d, B:51:0x0118, B:53:0x0120, B:55:0x0126, B:56:0x0131, B:58:0x0139, B:60:0x013f, B:61:0x014a, B:63:0x0152, B:65:0x0158, B:66:0x0163, B:68:0x016b, B:70:0x0171, B:71:0x017c, B:73:0x0197, B:75:0x019d, B:76:0x01a8, B:78:0x01b0, B:80:0x01b6, B:81:0x01c1, B:83:0x01c9, B:85:0x01cf, B:86:0x01da, B:88:0x01fb, B:91:0x0204, B:92:0x020f), top: B:34:0x00c0 }] */
        @kotlin.jvm.JvmStatic
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final com.datadog.android.rum.model.ResourceEvent fromJsonObject(com.google.gson.JsonObject jsonObject) throws com.google.gson.JsonParseException {
            java.lang.String str;
            java.lang.String asString;
            com.datadog.android.rum.model.ResourceEvent.Usr usr;
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
            java.lang.String asString3;
            java.lang.String str2 = "Unable to parse json into type ResourceEvent";
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonObject, "");
            try {
                try {
                    long asLong = jsonObject.get("date").getAsLong();
                    com.google.gson.JsonObject asJsonObject11 = jsonObject.get("application").getAsJsonObject();
                    com.datadog.android.rum.model.ResourceEvent.Application.Companion companion = com.datadog.android.rum.model.ResourceEvent.Application.INSTANCE;
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asJsonObject11, "");
                    com.datadog.android.rum.model.ResourceEvent.Application fromJsonObject = companion.fromJsonObject(asJsonObject11);
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
                    com.google.gson.JsonObject asJsonObject12 = jsonObject.get("session").getAsJsonObject();
                    com.datadog.android.rum.model.ResourceEvent.ResourceEventSession.Companion companion2 = com.datadog.android.rum.model.ResourceEvent.ResourceEventSession.INSTANCE;
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asJsonObject12, "");
                    com.datadog.android.rum.model.ResourceEvent.ResourceEventSession fromJsonObject2 = companion2.fromJsonObject(asJsonObject12);
                    com.google.gson.JsonElement jsonElement6 = jsonObject.get("source");
                    com.datadog.android.rum.model.ResourceEvent.ResourceEventSource fromJson = (jsonElement6 == null || (asString3 = jsonElement6.getAsString()) == null) ? null : com.datadog.android.rum.model.ResourceEvent.ResourceEventSource.INSTANCE.fromJson(asString3);
                    com.google.gson.JsonObject asJsonObject13 = jsonObject.get("view").getAsJsonObject();
                    com.datadog.android.rum.model.ResourceEvent.ResourceEventView.Companion companion3 = com.datadog.android.rum.model.ResourceEvent.ResourceEventView.INSTANCE;
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asJsonObject13, "");
                    com.datadog.android.rum.model.ResourceEvent.ResourceEventView fromJsonObject3 = companion3.fromJsonObject(asJsonObject13);
                    com.google.gson.JsonElement jsonElement7 = jsonObject.get("usr");
                    if (jsonElement7 != null) {
                        com.google.gson.JsonObject asJsonObject14 = jsonElement7.getAsJsonObject();
                        if (asJsonObject14 != null) {
                            str = "Unable to parse json into type ResourceEvent";
                            try {
                                usr = com.datadog.android.rum.model.ResourceEvent.Usr.INSTANCE.fromJsonObject(asJsonObject14);
                                com.google.gson.JsonElement jsonElement8 = jsonObject.get("account");
                                com.datadog.android.rum.model.ResourceEvent.Account fromJsonObject4 = (jsonElement8 != null || (asJsonObject10 = jsonElement8.getAsJsonObject()) == null) ? null : com.datadog.android.rum.model.ResourceEvent.Account.INSTANCE.fromJsonObject(asJsonObject10);
                                com.google.gson.JsonElement jsonElement9 = jsonObject.get("connectivity");
                                com.datadog.android.rum.model.ResourceEvent.Connectivity fromJsonObject5 = (jsonElement9 != null || (asJsonObject9 = jsonElement9.getAsJsonObject()) == null) ? null : com.datadog.android.rum.model.ResourceEvent.Connectivity.INSTANCE.fromJsonObject(asJsonObject9);
                                com.google.gson.JsonElement jsonElement10 = jsonObject.get(com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DISPLAY_NOTIFICATION);
                                com.datadog.android.rum.model.ResourceEvent.Display fromJsonObject6 = (jsonElement10 != null || (asJsonObject8 = jsonElement10.getAsJsonObject()) == null) ? null : com.datadog.android.rum.model.ResourceEvent.Display.INSTANCE.fromJsonObject(asJsonObject8);
                                com.google.gson.JsonElement jsonElement11 = jsonObject.get("synthetics");
                                com.datadog.android.rum.model.ResourceEvent.Synthetics fromJsonObject7 = (jsonElement11 != null || (asJsonObject7 = jsonElement11.getAsJsonObject()) == null) ? null : com.datadog.android.rum.model.ResourceEvent.Synthetics.INSTANCE.fromJsonObject(asJsonObject7);
                                com.google.gson.JsonElement jsonElement12 = jsonObject.get("ci_test");
                                com.datadog.android.rum.model.ResourceEvent.CiTest fromJsonObject8 = (jsonElement12 != null || (asJsonObject6 = jsonElement12.getAsJsonObject()) == null) ? null : com.datadog.android.rum.model.ResourceEvent.CiTest.INSTANCE.fromJsonObject(asJsonObject6);
                                com.google.gson.JsonElement jsonElement13 = jsonObject.get("os");
                                com.datadog.android.rum.model.ResourceEvent.Os fromJsonObject9 = (jsonElement13 != null || (asJsonObject5 = jsonElement13.getAsJsonObject()) == null) ? null : com.datadog.android.rum.model.ResourceEvent.Os.INSTANCE.fromJsonObject(asJsonObject5);
                                com.google.gson.JsonElement jsonElement14 = jsonObject.get("device");
                                com.datadog.android.rum.model.ResourceEvent.Device fromJsonObject10 = (jsonElement14 != null || (asJsonObject4 = jsonElement14.getAsJsonObject()) == null) ? null : com.datadog.android.rum.model.ResourceEvent.Device.INSTANCE.fromJsonObject(asJsonObject4);
                                com.google.gson.JsonObject asJsonObject15 = jsonObject.get("_dd").getAsJsonObject();
                                com.datadog.android.rum.model.ResourceEvent.Dd.Companion companion4 = com.datadog.android.rum.model.ResourceEvent.Dd.INSTANCE;
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asJsonObject15, "");
                                com.datadog.android.rum.model.ResourceEvent.Dd fromJsonObject11 = companion4.fromJsonObject(asJsonObject15);
                                com.google.gson.JsonElement jsonElement15 = jsonObject.get("context");
                                com.datadog.android.rum.model.ResourceEvent.Context fromJsonObject12 = (jsonElement15 != null || (asJsonObject3 = jsonElement15.getAsJsonObject()) == null) ? null : com.datadog.android.rum.model.ResourceEvent.Context.INSTANCE.fromJsonObject(asJsonObject3);
                                com.google.gson.JsonElement jsonElement16 = jsonObject.get("action");
                                com.datadog.android.rum.model.ResourceEvent.Action fromJsonObject13 = (jsonElement16 != null || (asJsonObject2 = jsonElement16.getAsJsonObject()) == null) ? null : com.datadog.android.rum.model.ResourceEvent.Action.INSTANCE.fromJsonObject(asJsonObject2);
                                com.google.gson.JsonElement jsonElement17 = jsonObject.get("container");
                                com.datadog.android.rum.model.ResourceEvent.Container fromJsonObject14 = (jsonElement17 != null || (asJsonObject = jsonElement17.getAsJsonObject()) == null) ? null : com.datadog.android.rum.model.ResourceEvent.Container.INSTANCE.fromJsonObject(asJsonObject);
                                asString2 = jsonObject.get("type").getAsString();
                                com.google.gson.JsonObject asJsonObject16 = jsonObject.get("resource").getAsJsonObject();
                                com.datadog.android.rum.model.ResourceEvent.Resource.Companion companion5 = com.datadog.android.rum.model.ResourceEvent.Resource.INSTANCE;
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asJsonObject16, "");
                                com.datadog.android.rum.model.ResourceEvent.Resource fromJsonObject15 = companion5.fromJsonObject(asJsonObject16);
                                if (kotlin.jvm.internal.Intrinsics.areEqual(asString2, "resource")) {
                                    throw new java.lang.IllegalStateException("Check failed.".toString());
                                }
                                return new com.datadog.android.rum.model.ResourceEvent(asLong, fromJsonObject, asString, asString4, asString5, asString6, asString7, fromJsonObject2, fromJson, fromJsonObject3, usr, fromJsonObject4, fromJsonObject5, fromJsonObject6, fromJsonObject7, fromJsonObject8, fromJsonObject9, fromJsonObject10, fromJsonObject11, fromJsonObject12, fromJsonObject13, fromJsonObject14, fromJsonObject15);
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
                    com.google.gson.JsonObject asJsonObject152 = jsonObject.get("_dd").getAsJsonObject();
                    com.datadog.android.rum.model.ResourceEvent.Dd.Companion companion42 = com.datadog.android.rum.model.ResourceEvent.Dd.INSTANCE;
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asJsonObject152, "");
                    com.datadog.android.rum.model.ResourceEvent.Dd fromJsonObject112 = companion42.fromJsonObject(asJsonObject152);
                    com.google.gson.JsonElement jsonElement152 = jsonObject.get("context");
                    if (jsonElement152 != null) {
                    }
                    com.google.gson.JsonElement jsonElement162 = jsonObject.get("action");
                    if (jsonElement162 != null) {
                    }
                    com.google.gson.JsonElement jsonElement172 = jsonObject.get("container");
                    if (jsonElement172 != null) {
                    }
                    asString2 = jsonObject.get("type").getAsString();
                    com.google.gson.JsonObject asJsonObject162 = jsonObject.get("resource").getAsJsonObject();
                    com.datadog.android.rum.model.ResourceEvent.Resource.Companion companion52 = com.datadog.android.rum.model.ResourceEvent.Resource.INSTANCE;
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asJsonObject162, "");
                    com.datadog.android.rum.model.ResourceEvent.Resource fromJsonObject152 = companion52.fromJsonObject(asJsonObject162);
                    if (kotlin.jvm.internal.Intrinsics.areEqual(asString2, "resource")) {
                    }
                } catch (java.lang.NullPointerException e6) {
                    e = e6;
                    str = "Unable to parse json into type ResourceEvent";
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

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\b\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ&\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\bR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0018\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0019\u0010\b"}, d2 = {"Lcom/datadog/android/rum/model/ResourceEvent$Application;", "", "", "id", "currentLocale", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/datadog/android/rum/model/ResourceEvent$Application;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lcom/google/gson/JsonElement;", "toJson", "()Lcom/google/gson/JsonElement;", "toString", "Ljava/lang/String;", "getCurrentLocale", "getId", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes7.dex */
    public static final /* data */ class Application {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.datadog.android.rum.model.ResourceEvent.Application.Companion INSTANCE = new com.datadog.android.rum.model.ResourceEvent.Application.Companion(null);
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

        @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/datadog/android/rum/model/ResourceEvent$Application$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/rum/model/ResourceEvent$Application;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/rum/model/ResourceEvent$Application;", "Lcom/google/gson/JsonObject;", "jsonObject", "fromJsonObject", "(Lcom/google/gson/JsonObject;)Lcom/datadog/android/rum/model/ResourceEvent$Application;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @kotlin.jvm.JvmStatic
            public final com.datadog.android.rum.model.ResourceEvent.Application fromJson(java.lang.String jsonString) throws com.google.gson.JsonParseException {
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
            public final com.datadog.android.rum.model.ResourceEvent.Application fromJsonObject(com.google.gson.JsonObject jsonObject) throws com.google.gson.JsonParseException {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonObject, "");
                try {
                    java.lang.String asString = jsonObject.get("id").getAsString();
                    com.google.gson.JsonElement jsonElement = jsonObject.get("current_locale");
                    java.lang.String asString2 = jsonElement != null ? jsonElement.getAsString() : null;
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asString, "");
                    return new com.datadog.android.rum.model.ResourceEvent.Application(asString, asString2);
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
            if (!(other instanceof com.datadog.android.rum.model.ResourceEvent.Application)) {
                return false;
            }
            com.datadog.android.rum.model.ResourceEvent.Application application = (com.datadog.android.rum.model.ResourceEvent.Application) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.id, application.id) && kotlin.jvm.internal.Intrinsics.areEqual(this.currentLocale, application.currentLocale);
        }

        public final com.datadog.android.rum.model.ResourceEvent.Application copy(java.lang.String id, java.lang.String currentLocale) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
            return new com.datadog.android.rum.model.ResourceEvent.Application(id, currentLocale);
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
        public static final com.datadog.android.rum.model.ResourceEvent.Application fromJsonObject(com.google.gson.JsonObject jsonObject) throws com.google.gson.JsonParseException {
            return INSTANCE.fromJsonObject(jsonObject);
        }

        @kotlin.jvm.JvmStatic
        public static final com.datadog.android.rum.model.ResourceEvent.Application fromJson(java.lang.String str) throws com.google.gson.JsonParseException {
            return INSTANCE.fromJson(str);
        }

        public static /* synthetic */ com.datadog.android.rum.model.ResourceEvent.Application copy$default(com.datadog.android.rum.model.ResourceEvent.Application application, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = application.id;
            }
            if ((i & 2) != 0) {
                str2 = application.currentLocale;
            }
            return application.copy(str, str2);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\b\u0018\u0000 \"2\u00020\u0001:\u0001\"B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ0\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u000bR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0007¢\u0006\f\n\u0004\b\u0007\u0010\u001c\u001a\u0004\b\u001d\u0010\u000fR\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b!\u0010\r"}, d2 = {"Lcom/datadog/android/rum/model/ResourceEvent$ResourceEventSession;", "", "", "id", "Lcom/datadog/android/rum/model/ResourceEvent$ResourceEventSessionType;", "type", "", "hasReplay", "<init>", "(Ljava/lang/String;Lcom/datadog/android/rum/model/ResourceEvent$ResourceEventSessionType;Ljava/lang/Boolean;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/datadog/android/rum/model/ResourceEvent$ResourceEventSessionType;", "component3", "()Ljava/lang/Boolean;", "copy", "(Ljava/lang/String;Lcom/datadog/android/rum/model/ResourceEvent$ResourceEventSessionType;Ljava/lang/Boolean;)Lcom/datadog/android/rum/model/ResourceEvent$ResourceEventSession;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lcom/google/gson/JsonElement;", "toJson", "()Lcom/google/gson/JsonElement;", "toString", "Ljava/lang/Boolean;", "getHasReplay", "Ljava/lang/String;", "getId", "Lcom/datadog/android/rum/model/ResourceEvent$ResourceEventSessionType;", "getType", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final /* data */ class ResourceEventSession {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.datadog.android.rum.model.ResourceEvent.ResourceEventSession.Companion INSTANCE = new com.datadog.android.rum.model.ResourceEvent.ResourceEventSession.Companion(null);
        private final java.lang.Boolean hasReplay;
        private final java.lang.String id;
        private final com.datadog.android.rum.model.ResourceEvent.ResourceEventSessionType type;

        public ResourceEventSession(java.lang.String str, com.datadog.android.rum.model.ResourceEvent.ResourceEventSessionType resourceEventSessionType, java.lang.Boolean bool) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(resourceEventSessionType, "");
            this.id = str;
            this.type = resourceEventSessionType;
            this.hasReplay = bool;
        }

        public /* synthetic */ ResourceEventSession(java.lang.String str, com.datadog.android.rum.model.ResourceEvent.ResourceEventSessionType resourceEventSessionType, java.lang.Boolean bool, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(str, resourceEventSessionType, (i & 4) != 0 ? null : bool);
        }

        public final java.lang.String getId() {
            return this.id;
        }

        public final com.datadog.android.rum.model.ResourceEvent.ResourceEventSessionType getType() {
            return this.type;
        }

        public final java.lang.Boolean getHasReplay() {
            return this.hasReplay;
        }

        public final com.google.gson.JsonElement toJson() {
            com.google.gson.JsonObject jsonObject = new com.google.gson.JsonObject();
            jsonObject.addProperty("id", this.id);
            jsonObject.add("type", this.type.toJson());
            java.lang.Boolean bool = this.hasReplay;
            if (bool != null) {
                jsonObject.addProperty("has_replay", java.lang.Boolean.valueOf(bool.booleanValue()));
            }
            return jsonObject;
        }

        @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/datadog/android/rum/model/ResourceEvent$ResourceEventSession$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/rum/model/ResourceEvent$ResourceEventSession;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/rum/model/ResourceEvent$ResourceEventSession;", "Lcom/google/gson/JsonObject;", "jsonObject", "fromJsonObject", "(Lcom/google/gson/JsonObject;)Lcom/datadog/android/rum/model/ResourceEvent$ResourceEventSession;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @kotlin.jvm.JvmStatic
            public final com.datadog.android.rum.model.ResourceEvent.ResourceEventSession fromJson(java.lang.String jsonString) throws com.google.gson.JsonParseException {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonString, "");
                try {
                    com.google.gson.JsonObject asJsonObject = com.google.gson.JsonParser.parseString(jsonString).getAsJsonObject();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asJsonObject, "");
                    return fromJsonObject(asJsonObject);
                } catch (java.lang.IllegalStateException e) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type ResourceEventSession", e);
                }
            }

            @kotlin.jvm.JvmStatic
            public final com.datadog.android.rum.model.ResourceEvent.ResourceEventSession fromJsonObject(com.google.gson.JsonObject jsonObject) throws com.google.gson.JsonParseException {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonObject, "");
                try {
                    java.lang.String asString = jsonObject.get("id").getAsString();
                    com.datadog.android.rum.model.ResourceEvent.ResourceEventSessionType.Companion companion = com.datadog.android.rum.model.ResourceEvent.ResourceEventSessionType.INSTANCE;
                    java.lang.String asString2 = jsonObject.get("type").getAsString();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asString2, "");
                    com.datadog.android.rum.model.ResourceEvent.ResourceEventSessionType fromJson = companion.fromJson(asString2);
                    com.google.gson.JsonElement jsonElement = jsonObject.get("has_replay");
                    java.lang.Boolean valueOf = jsonElement != null ? java.lang.Boolean.valueOf(jsonElement.getAsBoolean()) : null;
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asString, "");
                    return new com.datadog.android.rum.model.ResourceEvent.ResourceEventSession(asString, fromJson, valueOf);
                } catch (java.lang.IllegalStateException e) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type ResourceEventSession", e);
                } catch (java.lang.NullPointerException e2) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type ResourceEventSession", e2);
                } catch (java.lang.NumberFormatException e3) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type ResourceEventSession", e3);
                }
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public final java.lang.String toString() {
            java.lang.String str = this.id;
            com.datadog.android.rum.model.ResourceEvent.ResourceEventSessionType resourceEventSessionType = this.type;
            java.lang.Boolean bool = this.hasReplay;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ResourceEventSession(id=");
            sb.append(str);
            sb.append(", type=");
            sb.append(resourceEventSessionType);
            sb.append(", hasReplay=");
            sb.append(bool);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.id.hashCode();
            int hashCode2 = this.type.hashCode();
            java.lang.Boolean bool = this.hasReplay;
            return (((hashCode * 31) + hashCode2) * 31) + (bool == null ? 0 : bool.hashCode());
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.datadog.android.rum.model.ResourceEvent.ResourceEventSession)) {
                return false;
            }
            com.datadog.android.rum.model.ResourceEvent.ResourceEventSession resourceEventSession = (com.datadog.android.rum.model.ResourceEvent.ResourceEventSession) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.id, resourceEventSession.id) && this.type == resourceEventSession.type && kotlin.jvm.internal.Intrinsics.areEqual(this.hasReplay, resourceEventSession.hasReplay);
        }

        public final com.datadog.android.rum.model.ResourceEvent.ResourceEventSession copy(java.lang.String id, com.datadog.android.rum.model.ResourceEvent.ResourceEventSessionType type, java.lang.Boolean hasReplay) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
            return new com.datadog.android.rum.model.ResourceEvent.ResourceEventSession(id, type, hasReplay);
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.Boolean getHasReplay() {
            return this.hasReplay;
        }

        /* renamed from: component2, reason: from getter */
        public final com.datadog.android.rum.model.ResourceEvent.ResourceEventSessionType getType() {
            return this.type;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getId() {
            return this.id;
        }

        @kotlin.jvm.JvmStatic
        public static final com.datadog.android.rum.model.ResourceEvent.ResourceEventSession fromJsonObject(com.google.gson.JsonObject jsonObject) throws com.google.gson.JsonParseException {
            return INSTANCE.fromJsonObject(jsonObject);
        }

        @kotlin.jvm.JvmStatic
        public static final com.datadog.android.rum.model.ResourceEvent.ResourceEventSession fromJson(java.lang.String str) throws com.google.gson.JsonParseException {
            return INSTANCE.fromJson(str);
        }

        public static /* synthetic */ com.datadog.android.rum.model.ResourceEvent.ResourceEventSession copy$default(com.datadog.android.rum.model.ResourceEvent.ResourceEventSession resourceEventSession, java.lang.String str, com.datadog.android.rum.model.ResourceEvent.ResourceEventSessionType resourceEventSessionType, java.lang.Boolean bool, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = resourceEventSession.id;
            }
            if ((i & 2) != 0) {
                resourceEventSessionType = resourceEventSession.type;
            }
            if ((i & 4) != 0) {
                bool = resourceEventSession.hasReplay;
            }
            return resourceEventSession.copy(str, resourceEventSessionType, bool);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0086\b\u0018\u0000 $2\u00020\u0001:\u0001$B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\nJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\nJ<\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\nR$\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001d\u0010\n\"\u0004\b\u001e\u0010\u001fR$\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u001b\u001a\u0004\b \u0010\n\"\u0004\b!\u0010\u001fR\"\u0010\u0005\u001a\u00020\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\"\u0010\n\"\u0004\b#\u0010\u001f"}, d2 = {"Lcom/datadog/android/rum/model/ResourceEvent$ResourceEventView;", "", "", "id", com.adjust.sdk.Constants.REFERRER, "url", "name", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/datadog/android/rum/model/ResourceEvent$ResourceEventView;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lcom/google/gson/JsonElement;", "toJson", "()Lcom/google/gson/JsonElement;", "toString", "Ljava/lang/String;", "getId", "getName", "setName", "(Ljava/lang/String;)V", "getReferrer", "setReferrer", "getUrl", "setUrl", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final /* data */ class ResourceEventView {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.datadog.android.rum.model.ResourceEvent.ResourceEventView.Companion INSTANCE = new com.datadog.android.rum.model.ResourceEvent.ResourceEventView.Companion(null);
        private final java.lang.String id;
        private java.lang.String name;
        private java.lang.String referrer;
        private java.lang.String url;

        public ResourceEventView(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
            this.id = str;
            this.referrer = str2;
            this.url = str3;
            this.name = str4;
        }

        public /* synthetic */ ResourceEventView(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? null : str2, str3, (i & 8) != 0 ? null : str4);
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
            return jsonObject;
        }

        @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/datadog/android/rum/model/ResourceEvent$ResourceEventView$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/rum/model/ResourceEvent$ResourceEventView;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/rum/model/ResourceEvent$ResourceEventView;", "Lcom/google/gson/JsonObject;", "jsonObject", "fromJsonObject", "(Lcom/google/gson/JsonObject;)Lcom/datadog/android/rum/model/ResourceEvent$ResourceEventView;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @kotlin.jvm.JvmStatic
            public final com.datadog.android.rum.model.ResourceEvent.ResourceEventView fromJson(java.lang.String jsonString) throws com.google.gson.JsonParseException {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonString, "");
                try {
                    com.google.gson.JsonObject asJsonObject = com.google.gson.JsonParser.parseString(jsonString).getAsJsonObject();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asJsonObject, "");
                    return fromJsonObject(asJsonObject);
                } catch (java.lang.IllegalStateException e) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type ResourceEventView", e);
                }
            }

            @kotlin.jvm.JvmStatic
            public final com.datadog.android.rum.model.ResourceEvent.ResourceEventView fromJsonObject(com.google.gson.JsonObject jsonObject) throws com.google.gson.JsonParseException {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonObject, "");
                try {
                    java.lang.String asString = jsonObject.get("id").getAsString();
                    com.google.gson.JsonElement jsonElement = jsonObject.get(com.adjust.sdk.Constants.REFERRER);
                    java.lang.String asString2 = jsonElement != null ? jsonElement.getAsString() : null;
                    java.lang.String asString3 = jsonObject.get("url").getAsString();
                    com.google.gson.JsonElement jsonElement2 = jsonObject.get("name");
                    java.lang.String asString4 = jsonElement2 != null ? jsonElement2.getAsString() : null;
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asString, "");
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asString3, "");
                    return new com.datadog.android.rum.model.ResourceEvent.ResourceEventView(asString, asString2, asString3, asString4);
                } catch (java.lang.IllegalStateException e) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type ResourceEventView", e);
                } catch (java.lang.NullPointerException e2) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type ResourceEventView", e2);
                } catch (java.lang.NumberFormatException e3) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type ResourceEventView", e3);
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
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ResourceEventView(id=");
            sb.append(str);
            sb.append(", referrer=");
            sb.append(str2);
            sb.append(", url=");
            sb.append(str3);
            sb.append(", name=");
            sb.append(str4);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.id.hashCode();
            java.lang.String str = this.referrer;
            int hashCode2 = str == null ? 0 : str.hashCode();
            int hashCode3 = this.url.hashCode();
            java.lang.String str2 = this.name;
            return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (str2 != null ? str2.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.datadog.android.rum.model.ResourceEvent.ResourceEventView)) {
                return false;
            }
            com.datadog.android.rum.model.ResourceEvent.ResourceEventView resourceEventView = (com.datadog.android.rum.model.ResourceEvent.ResourceEventView) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.id, resourceEventView.id) && kotlin.jvm.internal.Intrinsics.areEqual(this.referrer, resourceEventView.referrer) && kotlin.jvm.internal.Intrinsics.areEqual(this.url, resourceEventView.url) && kotlin.jvm.internal.Intrinsics.areEqual(this.name, resourceEventView.name);
        }

        public final com.datadog.android.rum.model.ResourceEvent.ResourceEventView copy(java.lang.String id, java.lang.String referrer, java.lang.String url, java.lang.String name2) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "");
            return new com.datadog.android.rum.model.ResourceEvent.ResourceEventView(id, referrer, url, name2);
        }

        /* renamed from: component4, reason: from getter */
        public final java.lang.String getName() {
            return this.name;
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String getUrl() {
            return this.url;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getReferrer() {
            return this.referrer;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getId() {
            return this.id;
        }

        @kotlin.jvm.JvmStatic
        public static final com.datadog.android.rum.model.ResourceEvent.ResourceEventView fromJsonObject(com.google.gson.JsonObject jsonObject) throws com.google.gson.JsonParseException {
            return INSTANCE.fromJsonObject(jsonObject);
        }

        @kotlin.jvm.JvmStatic
        public static final com.datadog.android.rum.model.ResourceEvent.ResourceEventView fromJson(java.lang.String str) throws com.google.gson.JsonParseException {
            return INSTANCE.fromJson(str);
        }

        public static /* synthetic */ com.datadog.android.rum.model.ResourceEvent.ResourceEventView copy$default(com.datadog.android.rum.model.ResourceEvent.ResourceEventView resourceEventView, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = resourceEventView.id;
            }
            if ((i & 2) != 0) {
                str2 = resourceEventView.referrer;
            }
            if ((i & 4) != 0) {
                str3 = resourceEventView.url;
            }
            if ((i & 8) != 0) {
                str4 = resourceEventView.name;
            }
            return resourceEventView.copy(str, str2, str3, str4);
        }
    }

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0086\b\u0018\u0000 &2\u00020\u0001:\u0001&BO\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\fJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\fJ\u001e\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011JX\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0007HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\r\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001e\u0010\fR%\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00078\u0007¢\u0006\f\n\u0004\b\b\u0010\u001f\u001a\u0004\b \u0010\u0011R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010!\u001a\u0004\b\"\u0010\fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010!\u001a\u0004\b#\u0010\fR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b$\u0010\fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010!\u001a\u0004\b%\u0010\f"}, d2 = {"Lcom/datadog/android/rum/model/ResourceEvent$Usr;", "", "", "id", "name", "email", "anonymousId", "", "additionalProperties", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "()Ljava/util/Map;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)Lcom/datadog/android/rum/model/ResourceEvent$Usr;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lcom/google/gson/JsonElement;", "toJson", "()Lcom/google/gson/JsonElement;", "toString", "Ljava/util/Map;", "getAdditionalProperties", "Ljava/lang/String;", "getAnonymousId", "getEmail", "getId", "getName", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final /* data */ class Usr {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.datadog.android.rum.model.ResourceEvent.Usr.Companion INSTANCE = new com.datadog.android.rum.model.ResourceEvent.Usr.Companion(null);
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

        @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\fR \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\r8\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011"}, d2 = {"Lcom/datadog/android/rum/model/ResourceEvent$Usr$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/rum/model/ResourceEvent$Usr;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/rum/model/ResourceEvent$Usr;", "Lcom/google/gson/JsonObject;", "jsonObject", "fromJsonObject", "(Lcom/google/gson/JsonObject;)Lcom/datadog/android/rum/model/ResourceEvent$Usr;", "", "RESERVED_PROPERTIES", "[Ljava/lang/String;", "getRESERVED_PROPERTIES$dd_sdk_android_rum_release", "()[Ljava/lang/String;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public final java.lang.String[] getRESERVED_PROPERTIES$dd_sdk_android_rum_release() {
                return com.datadog.android.rum.model.ResourceEvent.Usr.RESERVED_PROPERTIES;
            }

            @kotlin.jvm.JvmStatic
            public final com.datadog.android.rum.model.ResourceEvent.Usr fromJson(java.lang.String jsonString) throws com.google.gson.JsonParseException {
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
            public final com.datadog.android.rum.model.ResourceEvent.Usr fromJsonObject(com.google.gson.JsonObject jsonObject) throws com.google.gson.JsonParseException {
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
                    return new com.datadog.android.rum.model.ResourceEvent.Usr(asString, asString2, asString3, asString4, linkedHashMap);
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
            if (!(other instanceof com.datadog.android.rum.model.ResourceEvent.Usr)) {
                return false;
            }
            com.datadog.android.rum.model.ResourceEvent.Usr usr = (com.datadog.android.rum.model.ResourceEvent.Usr) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.id, usr.id) && kotlin.jvm.internal.Intrinsics.areEqual(this.name, usr.name) && kotlin.jvm.internal.Intrinsics.areEqual(this.email, usr.email) && kotlin.jvm.internal.Intrinsics.areEqual(this.anonymousId, usr.anonymousId) && kotlin.jvm.internal.Intrinsics.areEqual(this.additionalProperties, usr.additionalProperties);
        }

        public final com.datadog.android.rum.model.ResourceEvent.Usr copy(java.lang.String id, java.lang.String name2, java.lang.String email, java.lang.String anonymousId, java.util.Map<java.lang.String, java.lang.Object> additionalProperties) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(additionalProperties, "");
            return new com.datadog.android.rum.model.ResourceEvent.Usr(id, name2, email, anonymousId, additionalProperties);
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
        public static final com.datadog.android.rum.model.ResourceEvent.Usr fromJsonObject(com.google.gson.JsonObject jsonObject) throws com.google.gson.JsonParseException {
            return INSTANCE.fromJsonObject(jsonObject);
        }

        @kotlin.jvm.JvmStatic
        public static final com.datadog.android.rum.model.ResourceEvent.Usr fromJson(java.lang.String str) throws com.google.gson.JsonParseException {
            return INSTANCE.fromJson(str);
        }

        public static /* synthetic */ com.datadog.android.rum.model.ResourceEvent.Usr copy$default(com.datadog.android.rum.model.ResourceEvent.Usr usr, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.util.Map map, int i, java.lang.Object obj) {
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

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\b\u0018\u0000  2\u00020\u0001:\u0001 B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u001e\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0005HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ>\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0005HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\nR%\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00058\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001c\u0010\rR\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\nR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001d\u001a\u0004\b\u001f\u0010\n"}, d2 = {"Lcom/datadog/android/rum/model/ResourceEvent$Account;", "", "", "id", "name", "", "additionalProperties", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Ljava/util/Map;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)Lcom/datadog/android/rum/model/ResourceEvent$Account;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lcom/google/gson/JsonElement;", "toJson", "()Lcom/google/gson/JsonElement;", "toString", "Ljava/util/Map;", "getAdditionalProperties", "Ljava/lang/String;", "getId", "getName", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes7.dex */
    public static final /* data */ class Account {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.datadog.android.rum.model.ResourceEvent.Account.Companion INSTANCE = new com.datadog.android.rum.model.ResourceEvent.Account.Companion(null);
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

        @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\fR \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\r8\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011"}, d2 = {"Lcom/datadog/android/rum/model/ResourceEvent$Account$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/rum/model/ResourceEvent$Account;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/rum/model/ResourceEvent$Account;", "Lcom/google/gson/JsonObject;", "jsonObject", "fromJsonObject", "(Lcom/google/gson/JsonObject;)Lcom/datadog/android/rum/model/ResourceEvent$Account;", "", "RESERVED_PROPERTIES", "[Ljava/lang/String;", "getRESERVED_PROPERTIES$dd_sdk_android_rum_release", "()[Ljava/lang/String;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public final java.lang.String[] getRESERVED_PROPERTIES$dd_sdk_android_rum_release() {
                return com.datadog.android.rum.model.ResourceEvent.Account.RESERVED_PROPERTIES;
            }

            @kotlin.jvm.JvmStatic
            public final com.datadog.android.rum.model.ResourceEvent.Account fromJson(java.lang.String jsonString) throws com.google.gson.JsonParseException {
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
            public final com.datadog.android.rum.model.ResourceEvent.Account fromJsonObject(com.google.gson.JsonObject jsonObject) throws com.google.gson.JsonParseException {
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
                    return new com.datadog.android.rum.model.ResourceEvent.Account(asString, asString2, linkedHashMap);
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
            if (!(other instanceof com.datadog.android.rum.model.ResourceEvent.Account)) {
                return false;
            }
            com.datadog.android.rum.model.ResourceEvent.Account account = (com.datadog.android.rum.model.ResourceEvent.Account) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.id, account.id) && kotlin.jvm.internal.Intrinsics.areEqual(this.name, account.name) && kotlin.jvm.internal.Intrinsics.areEqual(this.additionalProperties, account.additionalProperties);
        }

        public final com.datadog.android.rum.model.ResourceEvent.Account copy(java.lang.String id, java.lang.String name2, java.util.Map<java.lang.String, java.lang.Object> additionalProperties) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(additionalProperties, "");
            return new com.datadog.android.rum.model.ResourceEvent.Account(id, name2, additionalProperties);
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
        public static final com.datadog.android.rum.model.ResourceEvent.Account fromJsonObject(com.google.gson.JsonObject jsonObject) throws com.google.gson.JsonParseException {
            return INSTANCE.fromJsonObject(jsonObject);
        }

        @kotlin.jvm.JvmStatic
        public static final com.datadog.android.rum.model.ResourceEvent.Account fromJson(java.lang.String str) throws com.google.gson.JsonParseException {
            return INSTANCE.fromJson(str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.datadog.android.rum.model.ResourceEvent.Account copy$default(com.datadog.android.rum.model.ResourceEvent.Account account, java.lang.String str, java.lang.String str2, java.util.Map map, int i, java.lang.Object obj) {
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

    @kotlin.Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\b\u0018\u0000 ,2\u00020\u0001:\u0001,B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014JD\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\r\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010\"\u001a\u00020!HÖ\u0001¢\u0006\u0004\b\"\u0010#R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0007¢\u0006\f\n\u0004\b\n\u0010$\u001a\u0004\b%\u0010\u0014R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010&\u001a\u0004\b'\u0010\u0012R\"\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010(\u001a\u0004\b)\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010*\u001a\u0004\b+\u0010\u000e"}, d2 = {"Lcom/datadog/android/rum/model/ResourceEvent$Connectivity;", "", "Lcom/datadog/android/rum/model/ResourceEvent$Status;", "status", "", "Lcom/datadog/android/rum/model/ResourceEvent$Interface;", "interfaces", "Lcom/datadog/android/rum/model/ResourceEvent$EffectiveType;", "effectiveType", "Lcom/datadog/android/rum/model/ResourceEvent$Cellular;", "cellular", "<init>", "(Lcom/datadog/android/rum/model/ResourceEvent$Status;Ljava/util/List;Lcom/datadog/android/rum/model/ResourceEvent$EffectiveType;Lcom/datadog/android/rum/model/ResourceEvent$Cellular;)V", "component1", "()Lcom/datadog/android/rum/model/ResourceEvent$Status;", "component2", "()Ljava/util/List;", "component3", "()Lcom/datadog/android/rum/model/ResourceEvent$EffectiveType;", "component4", "()Lcom/datadog/android/rum/model/ResourceEvent$Cellular;", "copy", "(Lcom/datadog/android/rum/model/ResourceEvent$Status;Ljava/util/List;Lcom/datadog/android/rum/model/ResourceEvent$EffectiveType;Lcom/datadog/android/rum/model/ResourceEvent$Cellular;)Lcom/datadog/android/rum/model/ResourceEvent$Connectivity;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lcom/google/gson/JsonElement;", "toJson", "()Lcom/google/gson/JsonElement;", "", "toString", "()Ljava/lang/String;", "Lcom/datadog/android/rum/model/ResourceEvent$Cellular;", "getCellular", "Lcom/datadog/android/rum/model/ResourceEvent$EffectiveType;", "getEffectiveType", "Ljava/util/List;", "getInterfaces", "Lcom/datadog/android/rum/model/ResourceEvent$Status;", "getStatus", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes7.dex */
    public static final /* data */ class Connectivity {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.datadog.android.rum.model.ResourceEvent.Connectivity.Companion INSTANCE = new com.datadog.android.rum.model.ResourceEvent.Connectivity.Companion(null);
        private final com.datadog.android.rum.model.ResourceEvent.Cellular cellular;
        private final com.datadog.android.rum.model.ResourceEvent.EffectiveType effectiveType;
        private final java.util.List<com.datadog.android.rum.model.ResourceEvent.Interface> interfaces;
        private final com.datadog.android.rum.model.ResourceEvent.Status status;

        /* JADX WARN: Multi-variable type inference failed */
        public Connectivity(com.datadog.android.rum.model.ResourceEvent.Status status, java.util.List<? extends com.datadog.android.rum.model.ResourceEvent.Interface> list, com.datadog.android.rum.model.ResourceEvent.EffectiveType effectiveType, com.datadog.android.rum.model.ResourceEvent.Cellular cellular) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(status, "");
            this.status = status;
            this.interfaces = list;
            this.effectiveType = effectiveType;
            this.cellular = cellular;
        }

        public /* synthetic */ Connectivity(com.datadog.android.rum.model.ResourceEvent.Status status, java.util.List list, com.datadog.android.rum.model.ResourceEvent.EffectiveType effectiveType, com.datadog.android.rum.model.ResourceEvent.Cellular cellular, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(status, (i & 2) != 0 ? null : list, (i & 4) != 0 ? null : effectiveType, (i & 8) != 0 ? null : cellular);
        }

        public final com.datadog.android.rum.model.ResourceEvent.Status getStatus() {
            return this.status;
        }

        public final java.util.List<com.datadog.android.rum.model.ResourceEvent.Interface> getInterfaces() {
            return this.interfaces;
        }

        public final com.datadog.android.rum.model.ResourceEvent.EffectiveType getEffectiveType() {
            return this.effectiveType;
        }

        public final com.datadog.android.rum.model.ResourceEvent.Cellular getCellular() {
            return this.cellular;
        }

        public final com.google.gson.JsonElement toJson() {
            com.google.gson.JsonObject jsonObject = new com.google.gson.JsonObject();
            jsonObject.add("status", this.status.toJson());
            java.util.List<com.datadog.android.rum.model.ResourceEvent.Interface> list = this.interfaces;
            if (list != null) {
                com.google.gson.JsonArray jsonArray = new com.google.gson.JsonArray(list.size());
                java.util.Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    jsonArray.add(((com.datadog.android.rum.model.ResourceEvent.Interface) it.next()).toJson());
                }
                jsonObject.add("interfaces", jsonArray);
            }
            com.datadog.android.rum.model.ResourceEvent.EffectiveType effectiveType = this.effectiveType;
            if (effectiveType != null) {
                jsonObject.add("effective_type", effectiveType.toJson());
            }
            com.datadog.android.rum.model.ResourceEvent.Cellular cellular = this.cellular;
            if (cellular != null) {
                jsonObject.add("cellular", cellular.toJson());
            }
            return jsonObject;
        }

        @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/datadog/android/rum/model/ResourceEvent$Connectivity$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/rum/model/ResourceEvent$Connectivity;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/rum/model/ResourceEvent$Connectivity;", "Lcom/google/gson/JsonObject;", "jsonObject", "fromJsonObject", "(Lcom/google/gson/JsonObject;)Lcom/datadog/android/rum/model/ResourceEvent$Connectivity;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @kotlin.jvm.JvmStatic
            public final com.datadog.android.rum.model.ResourceEvent.Connectivity fromJson(java.lang.String jsonString) throws com.google.gson.JsonParseException {
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
            public final com.datadog.android.rum.model.ResourceEvent.Connectivity fromJsonObject(com.google.gson.JsonObject jsonObject) throws com.google.gson.JsonParseException {
                java.util.ArrayList arrayList;
                com.google.gson.JsonObject asJsonObject;
                java.lang.String asString;
                com.google.gson.JsonArray asJsonArray;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonObject, "");
                try {
                    com.datadog.android.rum.model.ResourceEvent.Status.Companion companion = com.datadog.android.rum.model.ResourceEvent.Status.INSTANCE;
                    java.lang.String asString2 = jsonObject.get("status").getAsString();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asString2, "");
                    com.datadog.android.rum.model.ResourceEvent.Status fromJson = companion.fromJson(asString2);
                    com.google.gson.JsonElement jsonElement = jsonObject.get("interfaces");
                    com.datadog.android.rum.model.ResourceEvent.Cellular cellular = null;
                    if (jsonElement == null || (asJsonArray = jsonElement.getAsJsonArray()) == null) {
                        arrayList = null;
                    } else {
                        arrayList = new java.util.ArrayList(asJsonArray.size());
                        for (com.google.gson.JsonElement jsonElement2 : asJsonArray) {
                            com.datadog.android.rum.model.ResourceEvent.Interface.Companion companion2 = com.datadog.android.rum.model.ResourceEvent.Interface.INSTANCE;
                            java.lang.String asString3 = jsonElement2.getAsString();
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asString3, "");
                            arrayList.add(companion2.fromJson(asString3));
                        }
                    }
                    com.google.gson.JsonElement jsonElement3 = jsonObject.get("effective_type");
                    com.datadog.android.rum.model.ResourceEvent.EffectiveType fromJson2 = (jsonElement3 == null || (asString = jsonElement3.getAsString()) == null) ? null : com.datadog.android.rum.model.ResourceEvent.EffectiveType.INSTANCE.fromJson(asString);
                    com.google.gson.JsonElement jsonElement4 = jsonObject.get("cellular");
                    if (jsonElement4 != null && (asJsonObject = jsonElement4.getAsJsonObject()) != null) {
                        cellular = com.datadog.android.rum.model.ResourceEvent.Cellular.INSTANCE.fromJsonObject(asJsonObject);
                    }
                    return new com.datadog.android.rum.model.ResourceEvent.Connectivity(fromJson, arrayList, fromJson2, cellular);
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
            com.datadog.android.rum.model.ResourceEvent.Status status = this.status;
            java.util.List<com.datadog.android.rum.model.ResourceEvent.Interface> list = this.interfaces;
            com.datadog.android.rum.model.ResourceEvent.EffectiveType effectiveType = this.effectiveType;
            com.datadog.android.rum.model.ResourceEvent.Cellular cellular = this.cellular;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Connectivity(status=");
            sb.append(status);
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
            java.util.List<com.datadog.android.rum.model.ResourceEvent.Interface> list = this.interfaces;
            int hashCode2 = list == null ? 0 : list.hashCode();
            com.datadog.android.rum.model.ResourceEvent.EffectiveType effectiveType = this.effectiveType;
            int hashCode3 = effectiveType == null ? 0 : effectiveType.hashCode();
            com.datadog.android.rum.model.ResourceEvent.Cellular cellular = this.cellular;
            return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (cellular != null ? cellular.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.datadog.android.rum.model.ResourceEvent.Connectivity)) {
                return false;
            }
            com.datadog.android.rum.model.ResourceEvent.Connectivity connectivity = (com.datadog.android.rum.model.ResourceEvent.Connectivity) other;
            return this.status == connectivity.status && kotlin.jvm.internal.Intrinsics.areEqual(this.interfaces, connectivity.interfaces) && this.effectiveType == connectivity.effectiveType && kotlin.jvm.internal.Intrinsics.areEqual(this.cellular, connectivity.cellular);
        }

        public final com.datadog.android.rum.model.ResourceEvent.Connectivity copy(com.datadog.android.rum.model.ResourceEvent.Status status, java.util.List<? extends com.datadog.android.rum.model.ResourceEvent.Interface> interfaces, com.datadog.android.rum.model.ResourceEvent.EffectiveType effectiveType, com.datadog.android.rum.model.ResourceEvent.Cellular cellular) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(status, "");
            return new com.datadog.android.rum.model.ResourceEvent.Connectivity(status, interfaces, effectiveType, cellular);
        }

        /* renamed from: component4, reason: from getter */
        public final com.datadog.android.rum.model.ResourceEvent.Cellular getCellular() {
            return this.cellular;
        }

        /* renamed from: component3, reason: from getter */
        public final com.datadog.android.rum.model.ResourceEvent.EffectiveType getEffectiveType() {
            return this.effectiveType;
        }

        public final java.util.List<com.datadog.android.rum.model.ResourceEvent.Interface> component2() {
            return this.interfaces;
        }

        /* renamed from: component1, reason: from getter */
        public final com.datadog.android.rum.model.ResourceEvent.Status getStatus() {
            return this.status;
        }

        @kotlin.jvm.JvmStatic
        public static final com.datadog.android.rum.model.ResourceEvent.Connectivity fromJsonObject(com.google.gson.JsonObject jsonObject) throws com.google.gson.JsonParseException {
            return INSTANCE.fromJsonObject(jsonObject);
        }

        @kotlin.jvm.JvmStatic
        public static final com.datadog.android.rum.model.ResourceEvent.Connectivity fromJson(java.lang.String str) throws com.google.gson.JsonParseException {
            return INSTANCE.fromJson(str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.datadog.android.rum.model.ResourceEvent.Connectivity copy$default(com.datadog.android.rum.model.ResourceEvent.Connectivity connectivity, com.datadog.android.rum.model.ResourceEvent.Status status, java.util.List list, com.datadog.android.rum.model.ResourceEvent.EffectiveType effectiveType, com.datadog.android.rum.model.ResourceEvent.Cellular cellular, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                status = connectivity.status;
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
            return connectivity.copy(status, list, effectiveType, cellular);
        }
    }

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\b\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\u0007"}, d2 = {"Lcom/datadog/android/rum/model/ResourceEvent$Display;", "", "Lcom/datadog/android/rum/model/ResourceEvent$Viewport;", "viewport", "<init>", "(Lcom/datadog/android/rum/model/ResourceEvent$Viewport;)V", "component1", "()Lcom/datadog/android/rum/model/ResourceEvent$Viewport;", "copy", "(Lcom/datadog/android/rum/model/ResourceEvent$Viewport;)Lcom/datadog/android/rum/model/ResourceEvent$Display;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lcom/google/gson/JsonElement;", "toJson", "()Lcom/google/gson/JsonElement;", "", "toString", "()Ljava/lang/String;", "Lcom/datadog/android/rum/model/ResourceEvent$Viewport;", "getViewport", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes7.dex */
    public static final /* data */ class Display {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.datadog.android.rum.model.ResourceEvent.Display.Companion INSTANCE = new com.datadog.android.rum.model.ResourceEvent.Display.Companion(null);
        private final com.datadog.android.rum.model.ResourceEvent.Viewport viewport;

        public Display(com.datadog.android.rum.model.ResourceEvent.Viewport viewport) {
            this.viewport = viewport;
        }

        public /* synthetic */ Display(com.datadog.android.rum.model.ResourceEvent.Viewport viewport, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : viewport);
        }

        public final com.datadog.android.rum.model.ResourceEvent.Viewport getViewport() {
            return this.viewport;
        }

        public final com.google.gson.JsonElement toJson() {
            com.google.gson.JsonObject jsonObject = new com.google.gson.JsonObject();
            com.datadog.android.rum.model.ResourceEvent.Viewport viewport = this.viewport;
            if (viewport != null) {
                jsonObject.add("viewport", viewport.toJson());
            }
            return jsonObject;
        }

        @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/datadog/android/rum/model/ResourceEvent$Display$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/rum/model/ResourceEvent$Display;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/rum/model/ResourceEvent$Display;", "Lcom/google/gson/JsonObject;", "jsonObject", "fromJsonObject", "(Lcom/google/gson/JsonObject;)Lcom/datadog/android/rum/model/ResourceEvent$Display;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @kotlin.jvm.JvmStatic
            public final com.datadog.android.rum.model.ResourceEvent.Display fromJson(java.lang.String jsonString) throws com.google.gson.JsonParseException {
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
            public final com.datadog.android.rum.model.ResourceEvent.Display fromJsonObject(com.google.gson.JsonObject jsonObject) throws com.google.gson.JsonParseException {
                com.google.gson.JsonObject asJsonObject;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonObject, "");
                try {
                    com.google.gson.JsonElement jsonElement = jsonObject.get("viewport");
                    return new com.datadog.android.rum.model.ResourceEvent.Display((jsonElement == null || (asJsonObject = jsonElement.getAsJsonObject()) == null) ? null : com.datadog.android.rum.model.ResourceEvent.Viewport.INSTANCE.fromJsonObject(asJsonObject));
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
            com.datadog.android.rum.model.ResourceEvent.Viewport viewport = this.viewport;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Display(viewport=");
            sb.append(viewport);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            com.datadog.android.rum.model.ResourceEvent.Viewport viewport = this.viewport;
            if (viewport == null) {
                return 0;
            }
            return viewport.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.datadog.android.rum.model.ResourceEvent.Display) && kotlin.jvm.internal.Intrinsics.areEqual(this.viewport, ((com.datadog.android.rum.model.ResourceEvent.Display) other).viewport);
        }

        public final com.datadog.android.rum.model.ResourceEvent.Display copy(com.datadog.android.rum.model.ResourceEvent.Viewport viewport) {
            return new com.datadog.android.rum.model.ResourceEvent.Display(viewport);
        }

        /* renamed from: component1, reason: from getter */
        public final com.datadog.android.rum.model.ResourceEvent.Viewport getViewport() {
            return this.viewport;
        }

        @kotlin.jvm.JvmStatic
        public static final com.datadog.android.rum.model.ResourceEvent.Display fromJsonObject(com.google.gson.JsonObject jsonObject) throws com.google.gson.JsonParseException {
            return INSTANCE.fromJsonObject(jsonObject);
        }

        @kotlin.jvm.JvmStatic
        public static final com.datadog.android.rum.model.ResourceEvent.Display fromJson(java.lang.String str) throws com.google.gson.JsonParseException {
            return INSTANCE.fromJson(str);
        }

        public static /* synthetic */ com.datadog.android.rum.model.ResourceEvent.Display copy$default(com.datadog.android.rum.model.ResourceEvent.Display display, com.datadog.android.rum.model.ResourceEvent.Viewport viewport, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                viewport = display.viewport;
            }
            return display.copy(viewport);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Display() {
            this(null, 1, 0 == true ? 1 : 0);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\b\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ0\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0011\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\nR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001b\u0010\rR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001c\u001a\u0004\b\u001d\u0010\nR\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001e\u0010\n"}, d2 = {"Lcom/datadog/android/rum/model/ResourceEvent$Synthetics;", "", "", "testId", "resultId", "", "injected", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Ljava/lang/Boolean;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)Lcom/datadog/android/rum/model/ResourceEvent$Synthetics;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lcom/google/gson/JsonElement;", "toJson", "()Lcom/google/gson/JsonElement;", "toString", "Ljava/lang/Boolean;", "getInjected", "Ljava/lang/String;", "getResultId", "getTestId", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final /* data */ class Synthetics {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.datadog.android.rum.model.ResourceEvent.Synthetics.Companion INSTANCE = new com.datadog.android.rum.model.ResourceEvent.Synthetics.Companion(null);
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

        @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/datadog/android/rum/model/ResourceEvent$Synthetics$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/rum/model/ResourceEvent$Synthetics;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/rum/model/ResourceEvent$Synthetics;", "Lcom/google/gson/JsonObject;", "jsonObject", "fromJsonObject", "(Lcom/google/gson/JsonObject;)Lcom/datadog/android/rum/model/ResourceEvent$Synthetics;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @kotlin.jvm.JvmStatic
            public final com.datadog.android.rum.model.ResourceEvent.Synthetics fromJson(java.lang.String jsonString) throws com.google.gson.JsonParseException {
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
            public final com.datadog.android.rum.model.ResourceEvent.Synthetics fromJsonObject(com.google.gson.JsonObject jsonObject) throws com.google.gson.JsonParseException {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonObject, "");
                try {
                    java.lang.String asString = jsonObject.get("test_id").getAsString();
                    java.lang.String asString2 = jsonObject.get("result_id").getAsString();
                    com.google.gson.JsonElement jsonElement = jsonObject.get("injected");
                    java.lang.Boolean valueOf = jsonElement != null ? java.lang.Boolean.valueOf(jsonElement.getAsBoolean()) : null;
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asString, "");
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asString2, "");
                    return new com.datadog.android.rum.model.ResourceEvent.Synthetics(asString, asString2, valueOf);
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
            if (!(other instanceof com.datadog.android.rum.model.ResourceEvent.Synthetics)) {
                return false;
            }
            com.datadog.android.rum.model.ResourceEvent.Synthetics synthetics = (com.datadog.android.rum.model.ResourceEvent.Synthetics) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.testId, synthetics.testId) && kotlin.jvm.internal.Intrinsics.areEqual(this.resultId, synthetics.resultId) && kotlin.jvm.internal.Intrinsics.areEqual(this.injected, synthetics.injected);
        }

        public final com.datadog.android.rum.model.ResourceEvent.Synthetics copy(java.lang.String testId, java.lang.String resultId, java.lang.Boolean injected) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(testId, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(resultId, "");
            return new com.datadog.android.rum.model.ResourceEvent.Synthetics(testId, resultId, injected);
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
        public static final com.datadog.android.rum.model.ResourceEvent.Synthetics fromJsonObject(com.google.gson.JsonObject jsonObject) throws com.google.gson.JsonParseException {
            return INSTANCE.fromJsonObject(jsonObject);
        }

        @kotlin.jvm.JvmStatic
        public static final com.datadog.android.rum.model.ResourceEvent.Synthetics fromJson(java.lang.String str) throws com.google.gson.JsonParseException {
            return INSTANCE.fromJson(str);
        }

        public static /* synthetic */ com.datadog.android.rum.model.ResourceEvent.Synthetics copy$default(com.datadog.android.rum.model.ResourceEvent.Synthetics synthetics, java.lang.String str, java.lang.String str2, java.lang.Boolean bool, int i, java.lang.Object obj) {
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

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/datadog/android/rum/model/ResourceEvent$CiTest;", "", "", "testExecutionId", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/datadog/android/rum/model/ResourceEvent$CiTest;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lcom/google/gson/JsonElement;", "toJson", "()Lcom/google/gson/JsonElement;", "toString", "Ljava/lang/String;", "getTestExecutionId", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes7.dex */
    public static final /* data */ class CiTest {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.datadog.android.rum.model.ResourceEvent.CiTest.Companion INSTANCE = new com.datadog.android.rum.model.ResourceEvent.CiTest.Companion(null);
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

        @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/datadog/android/rum/model/ResourceEvent$CiTest$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/rum/model/ResourceEvent$CiTest;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/rum/model/ResourceEvent$CiTest;", "Lcom/google/gson/JsonObject;", "jsonObject", "fromJsonObject", "(Lcom/google/gson/JsonObject;)Lcom/datadog/android/rum/model/ResourceEvent$CiTest;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @kotlin.jvm.JvmStatic
            public final com.datadog.android.rum.model.ResourceEvent.CiTest fromJson(java.lang.String jsonString) throws com.google.gson.JsonParseException {
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
            public final com.datadog.android.rum.model.ResourceEvent.CiTest fromJsonObject(com.google.gson.JsonObject jsonObject) throws com.google.gson.JsonParseException {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonObject, "");
                try {
                    java.lang.String asString = jsonObject.get("test_execution_id").getAsString();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asString, "");
                    return new com.datadog.android.rum.model.ResourceEvent.CiTest(asString);
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
            return (other instanceof com.datadog.android.rum.model.ResourceEvent.CiTest) && kotlin.jvm.internal.Intrinsics.areEqual(this.testExecutionId, ((com.datadog.android.rum.model.ResourceEvent.CiTest) other).testExecutionId);
        }

        public final com.datadog.android.rum.model.ResourceEvent.CiTest copy(java.lang.String testExecutionId) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(testExecutionId, "");
            return new com.datadog.android.rum.model.ResourceEvent.CiTest(testExecutionId);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getTestExecutionId() {
            return this.testExecutionId;
        }

        @kotlin.jvm.JvmStatic
        public static final com.datadog.android.rum.model.ResourceEvent.CiTest fromJsonObject(com.google.gson.JsonObject jsonObject) throws com.google.gson.JsonParseException {
            return INSTANCE.fromJsonObject(jsonObject);
        }

        @kotlin.jvm.JvmStatic
        public static final com.datadog.android.rum.model.ResourceEvent.CiTest fromJson(java.lang.String str) throws com.google.gson.JsonParseException {
            return INSTANCE.fromJson(str);
        }

        public static /* synthetic */ com.datadog.android.rum.model.ResourceEvent.CiTest copy$default(com.datadog.android.rum.model.ResourceEvent.CiTest ciTest, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = ciTest.testExecutionId;
            }
            return ciTest.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\b\u0018\u0000  2\u00020\u0001:\u0001 B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\nJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\nJ:\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\nR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\nR\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001d\u0010\nR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001b\u001a\u0004\b\u001e\u0010\nR\u001a\u0010\u0006\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001f\u0010\n"}, d2 = {"Lcom/datadog/android/rum/model/ResourceEvent$Os;", "", "", "name", "version", "build", "versionMajor", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/datadog/android/rum/model/ResourceEvent$Os;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lcom/google/gson/JsonElement;", "toJson", "()Lcom/google/gson/JsonElement;", "toString", "Ljava/lang/String;", "getBuild", "getName", "getVersion", "getVersionMajor", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final /* data */ class Os {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.datadog.android.rum.model.ResourceEvent.Os.Companion INSTANCE = new com.datadog.android.rum.model.ResourceEvent.Os.Companion(null);
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

        @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/datadog/android/rum/model/ResourceEvent$Os$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/rum/model/ResourceEvent$Os;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/rum/model/ResourceEvent$Os;", "Lcom/google/gson/JsonObject;", "jsonObject", "fromJsonObject", "(Lcom/google/gson/JsonObject;)Lcom/datadog/android/rum/model/ResourceEvent$Os;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @kotlin.jvm.JvmStatic
            public final com.datadog.android.rum.model.ResourceEvent.Os fromJson(java.lang.String jsonString) throws com.google.gson.JsonParseException {
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
            public final com.datadog.android.rum.model.ResourceEvent.Os fromJsonObject(com.google.gson.JsonObject jsonObject) throws com.google.gson.JsonParseException {
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
                    return new com.datadog.android.rum.model.ResourceEvent.Os(asString, asString2, asString3, asString4);
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
            if (!(other instanceof com.datadog.android.rum.model.ResourceEvent.Os)) {
                return false;
            }
            com.datadog.android.rum.model.ResourceEvent.Os os = (com.datadog.android.rum.model.ResourceEvent.Os) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.name, os.name) && kotlin.jvm.internal.Intrinsics.areEqual(this.version, os.version) && kotlin.jvm.internal.Intrinsics.areEqual(this.build, os.build) && kotlin.jvm.internal.Intrinsics.areEqual(this.versionMajor, os.versionMajor);
        }

        public final com.datadog.android.rum.model.ResourceEvent.Os copy(java.lang.String name2, java.lang.String version, java.lang.String build, java.lang.String versionMajor) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(version, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(versionMajor, "");
            return new com.datadog.android.rum.model.ResourceEvent.Os(name2, version, build, versionMajor);
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
        public static final com.datadog.android.rum.model.ResourceEvent.Os fromJsonObject(com.google.gson.JsonObject jsonObject) throws com.google.gson.JsonParseException {
            return INSTANCE.fromJsonObject(jsonObject);
        }

        @kotlin.jvm.JvmStatic
        public static final com.datadog.android.rum.model.ResourceEvent.Os fromJson(java.lang.String str) throws com.google.gson.JsonParseException {
            return INSTANCE.fromJson(str);
        }

        public static /* synthetic */ com.datadog.android.rum.model.ResourceEvent.Os copy$default(com.datadog.android.rum.model.ResourceEvent.Os os, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i, java.lang.Object obj) {
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

    @kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u0004\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\b\u0086\b\u0018\u0000 H2\u00020\u0001:\u0001HBµ\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001cJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001cJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001aJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\"\u0010!J\u0012\u0010#\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b#\u0010!J\u0012\u0010$\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b$\u0010!J\u0012\u0010%\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b%\u0010!J\u0018\u0010&\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b&\u0010'J\u0012\u0010(\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b(\u0010!J\u0012\u0010)\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b)\u0010\u001cJ¾\u0001\u0010*\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00042\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u000fHÆ\u0001¢\u0006\u0004\b*\u0010+J\u001a\u0010-\u001a\u00020\u000f2\b\u0010,\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b-\u0010.J\u0010\u00100\u001a\u00020/HÖ\u0001¢\u0006\u0004\b0\u00101J\r\u00103\u001a\u000202¢\u0006\u0004\b3\u00104J\u0010\u00105\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b5\u0010!R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00048\u0007¢\u0006\f\n\u0004\b\b\u00106\u001a\u0004\b7\u0010!R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u00108\u001a\u0004\b9\u0010\u001cR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u00106\u001a\u0004\b:\u0010!R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\r8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u00108\u001a\u0004\b;\u0010\u001cR\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u000f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010<\u001a\u0004\b\u0014\u0010\u001aR\u001c\u0010\t\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u00106\u001a\u0004\b=\u0010!R\"\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010>\u001a\u0004\b?\u0010'R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\r8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u00108\u001a\u0004\b@\u0010\u001cR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u00106\u001a\u0004\bA\u0010!R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u00106\u001a\u0004\bB\u0010!R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010<\u001a\u0004\bC\u0010\u001aR\u001c\u0010\f\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u00106\u001a\u0004\bD\u0010!R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\r8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u00108\u001a\u0004\bE\u0010\u001cR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010F\u001a\u0004\bG\u0010\u0018"}, d2 = {"Lcom/datadog/android/rum/model/ResourceEvent$Device;", "", "Lcom/datadog/android/rum/model/ResourceEvent$DeviceType;", "type", "", "name", "model", "brand", "architecture", "locale", "", "locales", "timeZone", "", "batteryLevel", "", "powerSavingMode", "brightnessLevel", "logicalCpuCount", "totalRam", "isLowRam", "<init>", "(Lcom/datadog/android/rum/model/ResourceEvent$DeviceType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/Number;Ljava/lang/Boolean;Ljava/lang/Number;Ljava/lang/Number;Ljava/lang/Number;Ljava/lang/Boolean;)V", "component1", "()Lcom/datadog/android/rum/model/ResourceEvent$DeviceType;", "component10", "()Ljava/lang/Boolean;", "component11", "()Ljava/lang/Number;", "component12", "component13", "component14", "component2", "()Ljava/lang/String;", "component3", "component4", "component5", "component6", "component7", "()Ljava/util/List;", "component8", "component9", "copy", "(Lcom/datadog/android/rum/model/ResourceEvent$DeviceType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/Number;Ljava/lang/Boolean;Ljava/lang/Number;Ljava/lang/Number;Ljava/lang/Number;Ljava/lang/Boolean;)Lcom/datadog/android/rum/model/ResourceEvent$Device;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lcom/google/gson/JsonElement;", "toJson", "()Lcom/google/gson/JsonElement;", "toString", "Ljava/lang/String;", "getArchitecture", "Ljava/lang/Number;", "getBatteryLevel", "getBrand", "getBrightnessLevel", "Ljava/lang/Boolean;", "getLocale", "Ljava/util/List;", "getLocales", "getLogicalCpuCount", "getModel", "getName", "getPowerSavingMode", "getTimeZone", "getTotalRam", "Lcom/datadog/android/rum/model/ResourceEvent$DeviceType;", "getType", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes7.dex */
    public static final /* data */ class Device {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.datadog.android.rum.model.ResourceEvent.Device.Companion INSTANCE = new com.datadog.android.rum.model.ResourceEvent.Device.Companion(null);
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
        private final com.datadog.android.rum.model.ResourceEvent.DeviceType type;

        public Device(com.datadog.android.rum.model.ResourceEvent.DeviceType deviceType, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.util.List<java.lang.String> list, java.lang.String str6, java.lang.Number number, java.lang.Boolean bool, java.lang.Number number2, java.lang.Number number3, java.lang.Number number4, java.lang.Boolean bool2) {
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

        public /* synthetic */ Device(com.datadog.android.rum.model.ResourceEvent.DeviceType deviceType, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.util.List list, java.lang.String str6, java.lang.Number number, java.lang.Boolean bool, java.lang.Number number2, java.lang.Number number3, java.lang.Number number4, java.lang.Boolean bool2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : deviceType, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : str5, (i & 64) != 0 ? null : list, (i & 128) != 0 ? null : str6, (i & 256) != 0 ? null : number, (i & 512) != 0 ? null : bool, (i & 1024) != 0 ? null : number2, (i & 2048) != 0 ? null : number3, (i & 4096) != 0 ? null : number4, (i & 8192) == 0 ? bool2 : null);
        }

        public final com.datadog.android.rum.model.ResourceEvent.DeviceType getType() {
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
            com.datadog.android.rum.model.ResourceEvent.DeviceType deviceType = this.type;
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

        @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/datadog/android/rum/model/ResourceEvent$Device$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/rum/model/ResourceEvent$Device;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/rum/model/ResourceEvent$Device;", "Lcom/google/gson/JsonObject;", "jsonObject", "fromJsonObject", "(Lcom/google/gson/JsonObject;)Lcom/datadog/android/rum/model/ResourceEvent$Device;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @kotlin.jvm.JvmStatic
            public final com.datadog.android.rum.model.ResourceEvent.Device fromJson(java.lang.String jsonString) throws com.google.gson.JsonParseException {
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
            public final com.datadog.android.rum.model.ResourceEvent.Device fromJsonObject(com.google.gson.JsonObject jsonObject) throws com.google.gson.JsonParseException {
                java.util.ArrayList arrayList;
                com.google.gson.JsonArray asJsonArray;
                java.lang.String asString;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonObject, "");
                try {
                    com.google.gson.JsonElement jsonElement = jsonObject.get("type");
                    com.datadog.android.rum.model.ResourceEvent.DeviceType fromJson = (jsonElement == null || (asString = jsonElement.getAsString()) == null) ? null : com.datadog.android.rum.model.ResourceEvent.DeviceType.INSTANCE.fromJson(asString);
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
                    return new com.datadog.android.rum.model.ResourceEvent.Device(fromJson, asString2, asString3, asString4, asString5, asString6, arrayList, asString7, asNumber, valueOf, asNumber2, asNumber3, asNumber4, jsonElement14 != null ? java.lang.Boolean.valueOf(jsonElement14.getAsBoolean()) : null);
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
            com.datadog.android.rum.model.ResourceEvent.DeviceType deviceType = this.type;
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
            com.datadog.android.rum.model.ResourceEvent.DeviceType deviceType = this.type;
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
            if (!(other instanceof com.datadog.android.rum.model.ResourceEvent.Device)) {
                return false;
            }
            com.datadog.android.rum.model.ResourceEvent.Device device = (com.datadog.android.rum.model.ResourceEvent.Device) other;
            return this.type == device.type && kotlin.jvm.internal.Intrinsics.areEqual(this.name, device.name) && kotlin.jvm.internal.Intrinsics.areEqual(this.model, device.model) && kotlin.jvm.internal.Intrinsics.areEqual(this.brand, device.brand) && kotlin.jvm.internal.Intrinsics.areEqual(this.architecture, device.architecture) && kotlin.jvm.internal.Intrinsics.areEqual(this.locale, device.locale) && kotlin.jvm.internal.Intrinsics.areEqual(this.locales, device.locales) && kotlin.jvm.internal.Intrinsics.areEqual(this.timeZone, device.timeZone) && kotlin.jvm.internal.Intrinsics.areEqual(this.batteryLevel, device.batteryLevel) && kotlin.jvm.internal.Intrinsics.areEqual(this.powerSavingMode, device.powerSavingMode) && kotlin.jvm.internal.Intrinsics.areEqual(this.brightnessLevel, device.brightnessLevel) && kotlin.jvm.internal.Intrinsics.areEqual(this.logicalCpuCount, device.logicalCpuCount) && kotlin.jvm.internal.Intrinsics.areEqual(this.totalRam, device.totalRam) && kotlin.jvm.internal.Intrinsics.areEqual(this.isLowRam, device.isLowRam);
        }

        public final com.datadog.android.rum.model.ResourceEvent.Device copy(com.datadog.android.rum.model.ResourceEvent.DeviceType type, java.lang.String name2, java.lang.String model, java.lang.String brand, java.lang.String architecture, java.lang.String locale, java.util.List<java.lang.String> locales, java.lang.String timeZone, java.lang.Number batteryLevel, java.lang.Boolean powerSavingMode, java.lang.Number brightnessLevel, java.lang.Number logicalCpuCount, java.lang.Number totalRam, java.lang.Boolean isLowRam) {
            return new com.datadog.android.rum.model.ResourceEvent.Device(type, name2, model, brand, architecture, locale, locales, timeZone, batteryLevel, powerSavingMode, brightnessLevel, logicalCpuCount, totalRam, isLowRam);
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
        public final com.datadog.android.rum.model.ResourceEvent.DeviceType getType() {
            return this.type;
        }

        @kotlin.jvm.JvmStatic
        public static final com.datadog.android.rum.model.ResourceEvent.Device fromJsonObject(com.google.gson.JsonObject jsonObject) throws com.google.gson.JsonParseException {
            return INSTANCE.fromJsonObject(jsonObject);
        }

        @kotlin.jvm.JvmStatic
        public static final com.datadog.android.rum.model.ResourceEvent.Device fromJson(java.lang.String str) throws com.google.gson.JsonParseException {
            return INSTANCE.fromJson(str);
        }

        public Device() {
            this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, my.com.softspace.reader.TransactionCodes.SupportedScheme.ALL, null);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0004\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0016\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\r\b\u0086\b\u0018\u0000 ?2\u00020\u0001:\u0001?Bs\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0017J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0017J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0017J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0017J\u0012\u0010\u001c\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ|\u0010 \u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÆ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010#\u001a\u00020\u000e2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b#\u0010$J\u0010\u0010&\u001a\u00020%HÖ\u0001¢\u0006\u0004\b&\u0010'J\r\u0010)\u001a\u00020(¢\u0006\u0004\b)\u0010*J\u0010\u0010+\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b+\u0010\u0017R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0007¢\u0006\f\n\u0004\b\u0007\u0010,\u001a\u0004\b-\u0010\u0017R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010.\u001a\u0004\b/\u0010\u0015R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u00100\u001a\u0004\b1\u0010\u001fR\u001a\u00103\u001a\u0002028\u0007X\u0087D¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010,\u001a\u0004\b7\u0010\u0017R\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u00108\u001a\u0004\b9\u0010\u001dR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010,\u001a\u0004\b:\u0010\u0017R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010;\u001a\u0004\b<\u0010\u0013R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010,\u001a\u0004\b=\u0010\u0017R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010,\u001a\u0004\b>\u0010\u0017"}, d2 = {"Lcom/datadog/android/rum/model/ResourceEvent$Dd;", "", "Lcom/datadog/android/rum/model/ResourceEvent$DdSession;", "session", "Lcom/datadog/android/rum/model/ResourceEvent$Configuration;", com.miteksystems.misnap.core.serverconnection.MobileVerifyV2Request.CONFIG_KEY, "", "browserSdkVersion", "sdkName", "spanId", "parentSpanId", "traceId", "", "rulePsr", "", "discarded", "<init>", "(Lcom/datadog/android/rum/model/ResourceEvent$DdSession;Lcom/datadog/android/rum/model/ResourceEvent$Configuration;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Number;Ljava/lang/Boolean;)V", "component1", "()Lcom/datadog/android/rum/model/ResourceEvent$DdSession;", "component2", "()Lcom/datadog/android/rum/model/ResourceEvent$Configuration;", "component3", "()Ljava/lang/String;", "component4", "component5", "component6", "component7", "component8", "()Ljava/lang/Number;", "component9", "()Ljava/lang/Boolean;", "copy", "(Lcom/datadog/android/rum/model/ResourceEvent$DdSession;Lcom/datadog/android/rum/model/ResourceEvent$Configuration;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Number;Ljava/lang/Boolean;)Lcom/datadog/android/rum/model/ResourceEvent$Dd;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lcom/google/gson/JsonElement;", "toJson", "()Lcom/google/gson/JsonElement;", "toString", "Ljava/lang/String;", "getBrowserSdkVersion", "Lcom/datadog/android/rum/model/ResourceEvent$Configuration;", "getConfiguration", "Ljava/lang/Boolean;", "getDiscarded", "", "formatVersion", "J", "getFormatVersion", "()J", "getParentSpanId", "Ljava/lang/Number;", "getRulePsr", "getSdkName", "Lcom/datadog/android/rum/model/ResourceEvent$DdSession;", "getSession", "getSpanId", "getTraceId", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes7.dex */
    public static final /* data */ class Dd {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.datadog.android.rum.model.ResourceEvent.Dd.Companion INSTANCE = new com.datadog.android.rum.model.ResourceEvent.Dd.Companion(null);
        private final java.lang.String browserSdkVersion;
        private final com.datadog.android.rum.model.ResourceEvent.Configuration configuration;
        private final java.lang.Boolean discarded;
        private final long formatVersion;
        private final java.lang.String parentSpanId;
        private final java.lang.Number rulePsr;
        private final java.lang.String sdkName;
        private final com.datadog.android.rum.model.ResourceEvent.DdSession session;
        private final java.lang.String spanId;
        private final java.lang.String traceId;

        public Dd(com.datadog.android.rum.model.ResourceEvent.DdSession ddSession, com.datadog.android.rum.model.ResourceEvent.Configuration configuration, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.Number number, java.lang.Boolean bool) {
            this.session = ddSession;
            this.configuration = configuration;
            this.browserSdkVersion = str;
            this.sdkName = str2;
            this.spanId = str3;
            this.parentSpanId = str4;
            this.traceId = str5;
            this.rulePsr = number;
            this.discarded = bool;
            this.formatVersion = 2L;
        }

        public /* synthetic */ Dd(com.datadog.android.rum.model.ResourceEvent.DdSession ddSession, com.datadog.android.rum.model.ResourceEvent.Configuration configuration, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.Number number, java.lang.Boolean bool, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : ddSession, (i & 2) != 0 ? null : configuration, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? null : str4, (i & 64) != 0 ? null : str5, (i & 128) != 0 ? null : number, (i & 256) == 0 ? bool : null);
        }

        public final com.datadog.android.rum.model.ResourceEvent.DdSession getSession() {
            return this.session;
        }

        public final com.datadog.android.rum.model.ResourceEvent.Configuration getConfiguration() {
            return this.configuration;
        }

        public final java.lang.String getBrowserSdkVersion() {
            return this.browserSdkVersion;
        }

        public final java.lang.String getSdkName() {
            return this.sdkName;
        }

        public final java.lang.String getSpanId() {
            return this.spanId;
        }

        public final java.lang.String getParentSpanId() {
            return this.parentSpanId;
        }

        public final java.lang.String getTraceId() {
            return this.traceId;
        }

        public final java.lang.Number getRulePsr() {
            return this.rulePsr;
        }

        public final java.lang.Boolean getDiscarded() {
            return this.discarded;
        }

        public final long getFormatVersion() {
            return this.formatVersion;
        }

        public final com.google.gson.JsonElement toJson() {
            com.google.gson.JsonObject jsonObject = new com.google.gson.JsonObject();
            jsonObject.addProperty("format_version", java.lang.Long.valueOf(this.formatVersion));
            com.datadog.android.rum.model.ResourceEvent.DdSession ddSession = this.session;
            if (ddSession != null) {
                jsonObject.add("session", ddSession.toJson());
            }
            com.datadog.android.rum.model.ResourceEvent.Configuration configuration = this.configuration;
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
            java.lang.String str3 = this.spanId;
            if (str3 != null) {
                jsonObject.addProperty("span_id", str3);
            }
            java.lang.String str4 = this.parentSpanId;
            if (str4 != null) {
                jsonObject.addProperty("parent_span_id", str4);
            }
            java.lang.String str5 = this.traceId;
            if (str5 != null) {
                jsonObject.addProperty("trace_id", str5);
            }
            java.lang.Number number = this.rulePsr;
            if (number != null) {
                jsonObject.addProperty("rule_psr", number);
            }
            java.lang.Boolean bool = this.discarded;
            if (bool != null) {
                jsonObject.addProperty("discarded", java.lang.Boolean.valueOf(bool.booleanValue()));
            }
            return jsonObject;
        }

        @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/datadog/android/rum/model/ResourceEvent$Dd$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/rum/model/ResourceEvent$Dd;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/rum/model/ResourceEvent$Dd;", "Lcom/google/gson/JsonObject;", "jsonObject", "fromJsonObject", "(Lcom/google/gson/JsonObject;)Lcom/datadog/android/rum/model/ResourceEvent$Dd;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @kotlin.jvm.JvmStatic
            public final com.datadog.android.rum.model.ResourceEvent.Dd fromJson(java.lang.String jsonString) throws com.google.gson.JsonParseException {
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
            public final com.datadog.android.rum.model.ResourceEvent.Dd fromJsonObject(com.google.gson.JsonObject jsonObject) throws com.google.gson.JsonParseException {
                com.google.gson.JsonObject asJsonObject;
                com.google.gson.JsonObject asJsonObject2;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonObject, "");
                try {
                    long asLong = jsonObject.get("format_version").getAsLong();
                    com.google.gson.JsonElement jsonElement = jsonObject.get("session");
                    com.datadog.android.rum.model.ResourceEvent.DdSession fromJsonObject = (jsonElement == null || (asJsonObject2 = jsonElement.getAsJsonObject()) == null) ? null : com.datadog.android.rum.model.ResourceEvent.DdSession.INSTANCE.fromJsonObject(asJsonObject2);
                    com.google.gson.JsonElement jsonElement2 = jsonObject.get(com.miteksystems.misnap.core.serverconnection.MobileVerifyV2Request.CONFIG_KEY);
                    com.datadog.android.rum.model.ResourceEvent.Configuration fromJsonObject2 = (jsonElement2 == null || (asJsonObject = jsonElement2.getAsJsonObject()) == null) ? null : com.datadog.android.rum.model.ResourceEvent.Configuration.INSTANCE.fromJsonObject(asJsonObject);
                    com.google.gson.JsonElement jsonElement3 = jsonObject.get("browser_sdk_version");
                    java.lang.String asString = jsonElement3 != null ? jsonElement3.getAsString() : null;
                    com.google.gson.JsonElement jsonElement4 = jsonObject.get(com.paypal.oslo.feature.verificationcapture.telemetry.VerificationCaptureTelemetry.Attributes.SDK_NAME);
                    java.lang.String asString2 = jsonElement4 != null ? jsonElement4.getAsString() : null;
                    com.google.gson.JsonElement jsonElement5 = jsonObject.get("span_id");
                    java.lang.String asString3 = jsonElement5 != null ? jsonElement5.getAsString() : null;
                    com.google.gson.JsonElement jsonElement6 = jsonObject.get("parent_span_id");
                    java.lang.String asString4 = jsonElement6 != null ? jsonElement6.getAsString() : null;
                    com.google.gson.JsonElement jsonElement7 = jsonObject.get("trace_id");
                    java.lang.String asString5 = jsonElement7 != null ? jsonElement7.getAsString() : null;
                    com.google.gson.JsonElement jsonElement8 = jsonObject.get("rule_psr");
                    java.lang.Number asNumber = jsonElement8 != null ? jsonElement8.getAsNumber() : null;
                    com.google.gson.JsonElement jsonElement9 = jsonObject.get("discarded");
                    java.lang.Boolean valueOf = jsonElement9 != null ? java.lang.Boolean.valueOf(jsonElement9.getAsBoolean()) : null;
                    if (asLong != 2) {
                        throw new java.lang.IllegalStateException("Check failed.".toString());
                    }
                    return new com.datadog.android.rum.model.ResourceEvent.Dd(fromJsonObject, fromJsonObject2, asString, asString2, asString3, asString4, asString5, asNumber, valueOf);
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
            com.datadog.android.rum.model.ResourceEvent.DdSession ddSession = this.session;
            com.datadog.android.rum.model.ResourceEvent.Configuration configuration = this.configuration;
            java.lang.String str = this.browserSdkVersion;
            java.lang.String str2 = this.sdkName;
            java.lang.String str3 = this.spanId;
            java.lang.String str4 = this.parentSpanId;
            java.lang.String str5 = this.traceId;
            java.lang.Number number = this.rulePsr;
            java.lang.Boolean bool = this.discarded;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Dd(session=");
            sb.append(ddSession);
            sb.append(", configuration=");
            sb.append(configuration);
            sb.append(", browserSdkVersion=");
            sb.append(str);
            sb.append(", sdkName=");
            sb.append(str2);
            sb.append(", spanId=");
            sb.append(str3);
            sb.append(", parentSpanId=");
            sb.append(str4);
            sb.append(", traceId=");
            sb.append(str5);
            sb.append(", rulePsr=");
            sb.append(number);
            sb.append(", discarded=");
            sb.append(bool);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            com.datadog.android.rum.model.ResourceEvent.DdSession ddSession = this.session;
            int hashCode = ddSession == null ? 0 : ddSession.hashCode();
            com.datadog.android.rum.model.ResourceEvent.Configuration configuration = this.configuration;
            int hashCode2 = configuration == null ? 0 : configuration.hashCode();
            java.lang.String str = this.browserSdkVersion;
            int hashCode3 = str == null ? 0 : str.hashCode();
            java.lang.String str2 = this.sdkName;
            int hashCode4 = str2 == null ? 0 : str2.hashCode();
            java.lang.String str3 = this.spanId;
            int hashCode5 = str3 == null ? 0 : str3.hashCode();
            java.lang.String str4 = this.parentSpanId;
            int hashCode6 = str4 == null ? 0 : str4.hashCode();
            java.lang.String str5 = this.traceId;
            int hashCode7 = str5 == null ? 0 : str5.hashCode();
            java.lang.Number number = this.rulePsr;
            int hashCode8 = number == null ? 0 : number.hashCode();
            java.lang.Boolean bool = this.discarded;
            return (((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + (bool != null ? bool.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.datadog.android.rum.model.ResourceEvent.Dd)) {
                return false;
            }
            com.datadog.android.rum.model.ResourceEvent.Dd dd = (com.datadog.android.rum.model.ResourceEvent.Dd) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.session, dd.session) && kotlin.jvm.internal.Intrinsics.areEqual(this.configuration, dd.configuration) && kotlin.jvm.internal.Intrinsics.areEqual(this.browserSdkVersion, dd.browserSdkVersion) && kotlin.jvm.internal.Intrinsics.areEqual(this.sdkName, dd.sdkName) && kotlin.jvm.internal.Intrinsics.areEqual(this.spanId, dd.spanId) && kotlin.jvm.internal.Intrinsics.areEqual(this.parentSpanId, dd.parentSpanId) && kotlin.jvm.internal.Intrinsics.areEqual(this.traceId, dd.traceId) && kotlin.jvm.internal.Intrinsics.areEqual(this.rulePsr, dd.rulePsr) && kotlin.jvm.internal.Intrinsics.areEqual(this.discarded, dd.discarded);
        }

        public final com.datadog.android.rum.model.ResourceEvent.Dd copy(com.datadog.android.rum.model.ResourceEvent.DdSession session, com.datadog.android.rum.model.ResourceEvent.Configuration configuration, java.lang.String browserSdkVersion, java.lang.String sdkName, java.lang.String spanId, java.lang.String parentSpanId, java.lang.String traceId, java.lang.Number rulePsr, java.lang.Boolean discarded) {
            return new com.datadog.android.rum.model.ResourceEvent.Dd(session, configuration, browserSdkVersion, sdkName, spanId, parentSpanId, traceId, rulePsr, discarded);
        }

        /* renamed from: component9, reason: from getter */
        public final java.lang.Boolean getDiscarded() {
            return this.discarded;
        }

        /* renamed from: component8, reason: from getter */
        public final java.lang.Number getRulePsr() {
            return this.rulePsr;
        }

        /* renamed from: component7, reason: from getter */
        public final java.lang.String getTraceId() {
            return this.traceId;
        }

        /* renamed from: component6, reason: from getter */
        public final java.lang.String getParentSpanId() {
            return this.parentSpanId;
        }

        /* renamed from: component5, reason: from getter */
        public final java.lang.String getSpanId() {
            return this.spanId;
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
        public final com.datadog.android.rum.model.ResourceEvent.Configuration getConfiguration() {
            return this.configuration;
        }

        /* renamed from: component1, reason: from getter */
        public final com.datadog.android.rum.model.ResourceEvent.DdSession getSession() {
            return this.session;
        }

        @kotlin.jvm.JvmStatic
        public static final com.datadog.android.rum.model.ResourceEvent.Dd fromJsonObject(com.google.gson.JsonObject jsonObject) throws com.google.gson.JsonParseException {
            return INSTANCE.fromJsonObject(jsonObject);
        }

        @kotlin.jvm.JvmStatic
        public static final com.datadog.android.rum.model.ResourceEvent.Dd fromJson(java.lang.String str) throws com.google.gson.JsonParseException {
            return INSTANCE.fromJson(str);
        }

        public Dd() {
            this(null, null, null, null, null, null, null, null, null, 511, null);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\b\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u001f\u0012\u0016\b\u0002\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001e\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ(\u0010\t\u001a\u00020\u00002\u0016\b\u0002\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0002HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016R%\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0018\u0010\b"}, d2 = {"Lcom/datadog/android/rum/model/ResourceEvent$Context;", "", "", "", "additionalProperties", "<init>", "(Ljava/util/Map;)V", "component1", "()Ljava/util/Map;", "copy", "(Ljava/util/Map;)Lcom/datadog/android/rum/model/ResourceEvent$Context;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lcom/google/gson/JsonElement;", "toJson", "()Lcom/google/gson/JsonElement;", "toString", "()Ljava/lang/String;", "Ljava/util/Map;", "getAdditionalProperties", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes7.dex */
    public static final /* data */ class Context {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.datadog.android.rum.model.ResourceEvent.Context.Companion INSTANCE = new com.datadog.android.rum.model.ResourceEvent.Context.Companion(null);
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

        @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/datadog/android/rum/model/ResourceEvent$Context$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/rum/model/ResourceEvent$Context;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/rum/model/ResourceEvent$Context;", "Lcom/google/gson/JsonObject;", "jsonObject", "fromJsonObject", "(Lcom/google/gson/JsonObject;)Lcom/datadog/android/rum/model/ResourceEvent$Context;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @kotlin.jvm.JvmStatic
            public final com.datadog.android.rum.model.ResourceEvent.Context fromJson(java.lang.String jsonString) throws com.google.gson.JsonParseException {
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
            public final com.datadog.android.rum.model.ResourceEvent.Context fromJsonObject(com.google.gson.JsonObject jsonObject) throws com.google.gson.JsonParseException {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonObject, "");
                try {
                    java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
                    for (java.util.Map.Entry<java.lang.String, com.google.gson.JsonElement> entry : jsonObject.entrySet()) {
                        java.lang.String key = entry.getKey();
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(key, "");
                        linkedHashMap.put(key, entry.getValue());
                    }
                    return new com.datadog.android.rum.model.ResourceEvent.Context(linkedHashMap);
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
            return (other instanceof com.datadog.android.rum.model.ResourceEvent.Context) && kotlin.jvm.internal.Intrinsics.areEqual(this.additionalProperties, ((com.datadog.android.rum.model.ResourceEvent.Context) other).additionalProperties);
        }

        public final com.datadog.android.rum.model.ResourceEvent.Context copy(java.util.Map<java.lang.String, java.lang.Object> additionalProperties) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(additionalProperties, "");
            return new com.datadog.android.rum.model.ResourceEvent.Context(additionalProperties);
        }

        public final java.util.Map<java.lang.String, java.lang.Object> component1() {
            return this.additionalProperties;
        }

        @kotlin.jvm.JvmStatic
        public static final com.datadog.android.rum.model.ResourceEvent.Context fromJsonObject(com.google.gson.JsonObject jsonObject) throws com.google.gson.JsonParseException {
            return INSTANCE.fromJsonObject(jsonObject);
        }

        @kotlin.jvm.JvmStatic
        public static final com.datadog.android.rum.model.ResourceEvent.Context fromJson(java.lang.String str) throws com.google.gson.JsonParseException {
            return INSTANCE.fromJson(str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.datadog.android.rum.model.ResourceEvent.Context copy$default(com.datadog.android.rum.model.ResourceEvent.Context context, java.util.Map map, int i, java.lang.Object obj) {
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

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\b\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ \u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0018\u0010\b"}, d2 = {"Lcom/datadog/android/rum/model/ResourceEvent$Action;", "", "", "", "id", "<init>", "(Ljava/util/List;)V", "component1", "()Ljava/util/List;", "copy", "(Ljava/util/List;)Lcom/datadog/android/rum/model/ResourceEvent$Action;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lcom/google/gson/JsonElement;", "toJson", "()Lcom/google/gson/JsonElement;", "toString", "()Ljava/lang/String;", "Ljava/util/List;", "getId", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes7.dex */
    public static final /* data */ class Action {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.datadog.android.rum.model.ResourceEvent.Action.Companion INSTANCE = new com.datadog.android.rum.model.ResourceEvent.Action.Companion(null);
        private final java.util.List<java.lang.String> id;

        public Action(java.util.List<java.lang.String> list) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            this.id = list;
        }

        public final java.util.List<java.lang.String> getId() {
            return this.id;
        }

        public final com.google.gson.JsonElement toJson() {
            com.google.gson.JsonObject jsonObject = new com.google.gson.JsonObject();
            com.google.gson.JsonArray jsonArray = new com.google.gson.JsonArray(this.id.size());
            java.util.Iterator<T> it = this.id.iterator();
            while (it.hasNext()) {
                jsonArray.add((java.lang.String) it.next());
            }
            jsonObject.add("id", jsonArray);
            return jsonObject;
        }

        @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/datadog/android/rum/model/ResourceEvent$Action$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/rum/model/ResourceEvent$Action;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/rum/model/ResourceEvent$Action;", "Lcom/google/gson/JsonObject;", "jsonObject", "fromJsonObject", "(Lcom/google/gson/JsonObject;)Lcom/datadog/android/rum/model/ResourceEvent$Action;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @kotlin.jvm.JvmStatic
            public final com.datadog.android.rum.model.ResourceEvent.Action fromJson(java.lang.String jsonString) throws com.google.gson.JsonParseException {
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
            public final com.datadog.android.rum.model.ResourceEvent.Action fromJsonObject(com.google.gson.JsonObject jsonObject) throws com.google.gson.JsonParseException {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonObject, "");
                try {
                    com.google.gson.JsonArray asJsonArray = jsonObject.get("id").getAsJsonArray();
                    java.util.ArrayList arrayList = new java.util.ArrayList(asJsonArray.size());
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asJsonArray, "");
                    java.util.Iterator<com.google.gson.JsonElement> it = asJsonArray.iterator();
                    while (it.hasNext()) {
                        arrayList.add(it.next().getAsString());
                    }
                    return new com.datadog.android.rum.model.ResourceEvent.Action(arrayList);
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
            java.util.List<java.lang.String> list = this.id;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Action(id=");
            sb.append(list);
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
            return (other instanceof com.datadog.android.rum.model.ResourceEvent.Action) && kotlin.jvm.internal.Intrinsics.areEqual(this.id, ((com.datadog.android.rum.model.ResourceEvent.Action) other).id);
        }

        public final com.datadog.android.rum.model.ResourceEvent.Action copy(java.util.List<java.lang.String> id) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
            return new com.datadog.android.rum.model.ResourceEvent.Action(id);
        }

        public final java.util.List<java.lang.String> component1() {
            return this.id;
        }

        @kotlin.jvm.JvmStatic
        public static final com.datadog.android.rum.model.ResourceEvent.Action fromJsonObject(com.google.gson.JsonObject jsonObject) throws com.google.gson.JsonParseException {
            return INSTANCE.fromJsonObject(jsonObject);
        }

        @kotlin.jvm.JvmStatic
        public static final com.datadog.android.rum.model.ResourceEvent.Action fromJson(java.lang.String str) throws com.google.gson.JsonParseException {
            return INSTANCE.fromJson(str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.datadog.android.rum.model.ResourceEvent.Action copy$default(com.datadog.android.rum.model.ResourceEvent.Action action, java.util.List list, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                list = action.id;
            }
            return action.copy(list);
        }
    }

    @kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\b\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\u000bR\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\t"}, d2 = {"Lcom/datadog/android/rum/model/ResourceEvent$Container;", "", "Lcom/datadog/android/rum/model/ResourceEvent$ContainerView;", "view", "Lcom/datadog/android/rum/model/ResourceEvent$ResourceEventSource;", "source", "<init>", "(Lcom/datadog/android/rum/model/ResourceEvent$ContainerView;Lcom/datadog/android/rum/model/ResourceEvent$ResourceEventSource;)V", "component1", "()Lcom/datadog/android/rum/model/ResourceEvent$ContainerView;", "component2", "()Lcom/datadog/android/rum/model/ResourceEvent$ResourceEventSource;", "copy", "(Lcom/datadog/android/rum/model/ResourceEvent$ContainerView;Lcom/datadog/android/rum/model/ResourceEvent$ResourceEventSource;)Lcom/datadog/android/rum/model/ResourceEvent$Container;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lcom/google/gson/JsonElement;", "toJson", "()Lcom/google/gson/JsonElement;", "", "toString", "()Ljava/lang/String;", "Lcom/datadog/android/rum/model/ResourceEvent$ResourceEventSource;", "getSource", "Lcom/datadog/android/rum/model/ResourceEvent$ContainerView;", "getView", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes7.dex */
    public static final /* data */ class Container {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.datadog.android.rum.model.ResourceEvent.Container.Companion INSTANCE = new com.datadog.android.rum.model.ResourceEvent.Container.Companion(null);
        private final com.datadog.android.rum.model.ResourceEvent.ResourceEventSource source;
        private final com.datadog.android.rum.model.ResourceEvent.ContainerView view;

        public Container(com.datadog.android.rum.model.ResourceEvent.ContainerView containerView, com.datadog.android.rum.model.ResourceEvent.ResourceEventSource resourceEventSource) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(containerView, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(resourceEventSource, "");
            this.view = containerView;
            this.source = resourceEventSource;
        }

        public final com.datadog.android.rum.model.ResourceEvent.ContainerView getView() {
            return this.view;
        }

        public final com.datadog.android.rum.model.ResourceEvent.ResourceEventSource getSource() {
            return this.source;
        }

        public final com.google.gson.JsonElement toJson() {
            com.google.gson.JsonObject jsonObject = new com.google.gson.JsonObject();
            jsonObject.add("view", this.view.toJson());
            jsonObject.add("source", this.source.toJson());
            return jsonObject;
        }

        @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/datadog/android/rum/model/ResourceEvent$Container$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/rum/model/ResourceEvent$Container;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/rum/model/ResourceEvent$Container;", "Lcom/google/gson/JsonObject;", "jsonObject", "fromJsonObject", "(Lcom/google/gson/JsonObject;)Lcom/datadog/android/rum/model/ResourceEvent$Container;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @kotlin.jvm.JvmStatic
            public final com.datadog.android.rum.model.ResourceEvent.Container fromJson(java.lang.String jsonString) throws com.google.gson.JsonParseException {
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
            public final com.datadog.android.rum.model.ResourceEvent.Container fromJsonObject(com.google.gson.JsonObject jsonObject) throws com.google.gson.JsonParseException {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonObject, "");
                try {
                    com.google.gson.JsonObject asJsonObject = jsonObject.get("view").getAsJsonObject();
                    com.datadog.android.rum.model.ResourceEvent.ContainerView.Companion companion = com.datadog.android.rum.model.ResourceEvent.ContainerView.INSTANCE;
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asJsonObject, "");
                    com.datadog.android.rum.model.ResourceEvent.ContainerView fromJsonObject = companion.fromJsonObject(asJsonObject);
                    com.datadog.android.rum.model.ResourceEvent.ResourceEventSource.Companion companion2 = com.datadog.android.rum.model.ResourceEvent.ResourceEventSource.INSTANCE;
                    java.lang.String asString = jsonObject.get("source").getAsString();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asString, "");
                    return new com.datadog.android.rum.model.ResourceEvent.Container(fromJsonObject, companion2.fromJson(asString));
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
            com.datadog.android.rum.model.ResourceEvent.ContainerView containerView = this.view;
            com.datadog.android.rum.model.ResourceEvent.ResourceEventSource resourceEventSource = this.source;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Container(view=");
            sb.append(containerView);
            sb.append(", source=");
            sb.append(resourceEventSource);
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
            if (!(other instanceof com.datadog.android.rum.model.ResourceEvent.Container)) {
                return false;
            }
            com.datadog.android.rum.model.ResourceEvent.Container container = (com.datadog.android.rum.model.ResourceEvent.Container) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.view, container.view) && this.source == container.source;
        }

        public final com.datadog.android.rum.model.ResourceEvent.Container copy(com.datadog.android.rum.model.ResourceEvent.ContainerView view, com.datadog.android.rum.model.ResourceEvent.ResourceEventSource source) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "");
            return new com.datadog.android.rum.model.ResourceEvent.Container(view, source);
        }

        /* renamed from: component2, reason: from getter */
        public final com.datadog.android.rum.model.ResourceEvent.ResourceEventSource getSource() {
            return this.source;
        }

        /* renamed from: component1, reason: from getter */
        public final com.datadog.android.rum.model.ResourceEvent.ContainerView getView() {
            return this.view;
        }

        @kotlin.jvm.JvmStatic
        public static final com.datadog.android.rum.model.ResourceEvent.Container fromJsonObject(com.google.gson.JsonObject jsonObject) throws com.google.gson.JsonParseException {
            return INSTANCE.fromJsonObject(jsonObject);
        }

        @kotlin.jvm.JvmStatic
        public static final com.datadog.android.rum.model.ResourceEvent.Container fromJson(java.lang.String str) throws com.google.gson.JsonParseException {
            return INSTANCE.fromJson(str);
        }

        public static /* synthetic */ com.datadog.android.rum.model.ResourceEvent.Container copy$default(com.datadog.android.rum.model.ResourceEvent.Container container, com.datadog.android.rum.model.ResourceEvent.ContainerView containerView, com.datadog.android.rum.model.ResourceEvent.ResourceEventSource resourceEventSource, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                containerView = container.view;
            }
            if ((i & 2) != 0) {
                resourceEventSource = container.source;
            }
            return container.copy(containerView, resourceEventSource);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b/\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b/\b\u0086\b\u0018\u0000 \u008e\u00012\u00020\u0001:\u0002\u008e\u0001B\u009f\u0002\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001e\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010!\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010#\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010%\u0012\n\b\u0002\u0010(\u001a\u0004\u0018\u00010'\u0012\n\b\u0002\u0010*\u001a\u0004\u0018\u00010)¢\u0006\u0004\b+\u0010,J\u0012\u0010-\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b-\u0010.J\u0012\u0010/\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b/\u00100J\u0012\u00101\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0004\b1\u00102J\u0012\u00103\u001a\u0004\u0018\u00010\u0012HÆ\u0003¢\u0006\u0004\b3\u00104J\u0012\u00105\u001a\u0004\u0018\u00010\u0014HÆ\u0003¢\u0006\u0004\b5\u00106J\u0012\u00107\u001a\u0004\u0018\u00010\u0016HÆ\u0003¢\u0006\u0004\b7\u00108J\u0012\u00109\u001a\u0004\u0018\u00010\u0018HÆ\u0003¢\u0006\u0004\b9\u0010:J\u0012\u0010;\u001a\u0004\u0018\u00010\u001aHÆ\u0003¢\u0006\u0004\b;\u0010<J\u0012\u0010=\u001a\u0004\u0018\u00010\u001cHÆ\u0003¢\u0006\u0004\b=\u0010>J\u0012\u0010?\u001a\u0004\u0018\u00010\u001eHÆ\u0003¢\u0006\u0004\b?\u0010@J\u0012\u0010A\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bA\u0010.J\u0010\u0010B\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\bB\u0010CJ\u0012\u0010D\u001a\u0004\u0018\u00010!HÆ\u0003¢\u0006\u0004\bD\u0010EJ\u0012\u0010F\u001a\u0004\u0018\u00010#HÆ\u0003¢\u0006\u0004\bF\u0010GJ\u0012\u0010H\u001a\u0004\u0018\u00010%HÆ\u0003¢\u0006\u0004\bH\u0010IJ\u0012\u0010J\u001a\u0004\u0018\u00010'HÆ\u0003¢\u0006\u0004\bJ\u0010KJ\u0012\u0010L\u001a\u0004\u0018\u00010)HÆ\u0003¢\u0006\u0004\bL\u0010MJ\u0012\u0010N\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\bN\u0010OJ\u0010\u0010P\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\bP\u0010.J\u0012\u0010Q\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\bQ\u00100J\u0012\u0010R\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\bR\u00100J\u0012\u0010S\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\bS\u00100J\u0012\u0010T\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\bT\u00100J\u0012\u0010U\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\bU\u00100J¬\u0002\u0010V\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\b\u001a\u00020\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010!2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010#2\n\b\u0002\u0010&\u001a\u0004\u0018\u00010%2\n\b\u0002\u0010(\u001a\u0004\u0018\u00010'2\n\b\u0002\u0010*\u001a\u0004\u0018\u00010)HÆ\u0001¢\u0006\u0004\bV\u0010WJ\u001a\u0010Z\u001a\u00020Y2\b\u0010X\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\bZ\u0010[J\u0010\u0010]\u001a\u00020\\HÖ\u0001¢\u0006\u0004\b]\u0010^J\r\u0010`\u001a\u00020_¢\u0006\u0004\b`\u0010aJ\u0010\u0010b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\bb\u0010.R\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0007¢\u0006\f\n\u0004\b\u0019\u0010c\u001a\u0004\bd\u0010:R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010e\u001a\u0004\bf\u00100R\u001c\u0010\"\u001a\u0004\u0018\u00010!8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010g\u001a\u0004\bh\u0010ER\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010i\u001a\u0004\bj\u00108R\u001c\u0010\u001f\u001a\u0004\u0018\u00010\u001e8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010k\u001a\u0004\bl\u0010@R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010e\u001a\u0004\bm\u00100R\u001c\u0010\r\u001a\u0004\u0018\u00010\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010e\u001a\u0004\bn\u00100R\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010o\u001a\u0004\bp\u0010>R\u001c\u0010*\u001a\u0004\u0018\u00010)8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b*\u0010q\u001a\u0004\br\u0010MR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010s\u001a\u0004\bt\u0010.R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010u\u001a\u0004\bv\u0010OR\u001c\u0010 \u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b \u0010s\u001a\u0004\bw\u0010.R\u001c\u0010$\u001a\u0004\u0018\u00010#8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010x\u001a\u0004\by\u0010GR\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010z\u001a\u0004\b{\u00106R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010|\u001a\u0004\b}\u00102R\u001c\u0010&\u001a\u0004\u0018\u00010%8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b&\u0010~\u001a\u0004\b\u007f\u0010IR\u001e\u0010(\u001a\u0004\u0018\u00010'8\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b(\u0010\u0080\u0001\u001a\u0005\b\u0081\u0001\u0010KR\u001d\u0010\f\u001a\u0004\u0018\u00010\t8\u0007X\u0087\u0004¢\u0006\r\n\u0004\b\f\u0010e\u001a\u0005\b\u0082\u0001\u00100R\u001e\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b\u001b\u0010\u0083\u0001\u001a\u0005\b\u0084\u0001\u0010<R\u001d\u0010\n\u001a\u0004\u0018\u00010\t8\u0007X\u0087\u0004¢\u0006\r\n\u0004\b\n\u0010e\u001a\u0005\b\u0085\u0001\u00100R\u001d\u0010\u000f\u001a\u0004\u0018\u00010\t8\u0007X\u0087\u0004¢\u0006\r\n\u0004\b\u000f\u0010e\u001a\u0005\b\u0086\u0001\u00100R\u001c\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b\u0005\u0010\u0087\u0001\u001a\u0005\b\u0088\u0001\u0010CR%\u0010\b\u001a\u00020\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0015\n\u0004\b\b\u0010s\u001a\u0005\b\u0089\u0001\u0010.\"\u0006\b\u008a\u0001\u0010\u008b\u0001R\u001e\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b\u0013\u0010\u008c\u0001\u001a\u0005\b\u008d\u0001\u00104"}, d2 = {"Lcom/datadog/android/rum/model/ResourceEvent$Resource;", "", "", "id", "Lcom/datadog/android/rum/model/ResourceEvent$ResourceType;", "type", "Lcom/datadog/android/rum/model/ResourceEvent$Method;", "method", "url", "", "statusCode", "duration", io.ktor.http.ContentDisposition.Parameters.Size, "encodedBodySize", "decodedBodySize", "transferSize", "Lcom/datadog/android/rum/model/ResourceEvent$RenderBlockingStatus;", "renderBlockingStatus", "Lcom/datadog/android/rum/model/ResourceEvent$Worker;", "worker", "Lcom/datadog/android/rum/model/ResourceEvent$Redirect;", "redirect", "Lcom/datadog/android/rum/model/ResourceEvent$Dns;", "dns", "Lcom/datadog/android/rum/model/ResourceEvent$Connect;", "connect", "Lcom/datadog/android/rum/model/ResourceEvent$Ssl;", "ssl", "Lcom/datadog/android/rum/model/ResourceEvent$FirstByte;", "firstByte", "Lcom/datadog/android/rum/model/ResourceEvent$Download;", "download", "protocol", "Lcom/datadog/android/rum/model/ResourceEvent$DeliveryType;", "deliveryType", "Lcom/datadog/android/rum/model/ResourceEvent$Provider;", "provider", "Lcom/datadog/android/rum/model/ResourceEvent$Request;", "request", "Lcom/datadog/android/rum/model/ResourceEvent$Response;", "response", "Lcom/datadog/android/rum/model/ResourceEvent$Graphql;", "graphql", "<init>", "(Ljava/lang/String;Lcom/datadog/android/rum/model/ResourceEvent$ResourceType;Lcom/datadog/android/rum/model/ResourceEvent$Method;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Lcom/datadog/android/rum/model/ResourceEvent$RenderBlockingStatus;Lcom/datadog/android/rum/model/ResourceEvent$Worker;Lcom/datadog/android/rum/model/ResourceEvent$Redirect;Lcom/datadog/android/rum/model/ResourceEvent$Dns;Lcom/datadog/android/rum/model/ResourceEvent$Connect;Lcom/datadog/android/rum/model/ResourceEvent$Ssl;Lcom/datadog/android/rum/model/ResourceEvent$FirstByte;Lcom/datadog/android/rum/model/ResourceEvent$Download;Ljava/lang/String;Lcom/datadog/android/rum/model/ResourceEvent$DeliveryType;Lcom/datadog/android/rum/model/ResourceEvent$Provider;Lcom/datadog/android/rum/model/ResourceEvent$Request;Lcom/datadog/android/rum/model/ResourceEvent$Response;Lcom/datadog/android/rum/model/ResourceEvent$Graphql;)V", "component1", "()Ljava/lang/String;", "component10", "()Ljava/lang/Long;", "component11", "()Lcom/datadog/android/rum/model/ResourceEvent$RenderBlockingStatus;", "component12", "()Lcom/datadog/android/rum/model/ResourceEvent$Worker;", "component13", "()Lcom/datadog/android/rum/model/ResourceEvent$Redirect;", "component14", "()Lcom/datadog/android/rum/model/ResourceEvent$Dns;", "component15", "()Lcom/datadog/android/rum/model/ResourceEvent$Connect;", "component16", "()Lcom/datadog/android/rum/model/ResourceEvent$Ssl;", "component17", "()Lcom/datadog/android/rum/model/ResourceEvent$FirstByte;", "component18", "()Lcom/datadog/android/rum/model/ResourceEvent$Download;", "component19", "component2", "()Lcom/datadog/android/rum/model/ResourceEvent$ResourceType;", "component20", "()Lcom/datadog/android/rum/model/ResourceEvent$DeliveryType;", "component21", "()Lcom/datadog/android/rum/model/ResourceEvent$Provider;", "component22", "()Lcom/datadog/android/rum/model/ResourceEvent$Request;", "component23", "()Lcom/datadog/android/rum/model/ResourceEvent$Response;", "component24", "()Lcom/datadog/android/rum/model/ResourceEvent$Graphql;", "component3", "()Lcom/datadog/android/rum/model/ResourceEvent$Method;", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Lcom/datadog/android/rum/model/ResourceEvent$ResourceType;Lcom/datadog/android/rum/model/ResourceEvent$Method;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Lcom/datadog/android/rum/model/ResourceEvent$RenderBlockingStatus;Lcom/datadog/android/rum/model/ResourceEvent$Worker;Lcom/datadog/android/rum/model/ResourceEvent$Redirect;Lcom/datadog/android/rum/model/ResourceEvent$Dns;Lcom/datadog/android/rum/model/ResourceEvent$Connect;Lcom/datadog/android/rum/model/ResourceEvent$Ssl;Lcom/datadog/android/rum/model/ResourceEvent$FirstByte;Lcom/datadog/android/rum/model/ResourceEvent$Download;Ljava/lang/String;Lcom/datadog/android/rum/model/ResourceEvent$DeliveryType;Lcom/datadog/android/rum/model/ResourceEvent$Provider;Lcom/datadog/android/rum/model/ResourceEvent$Request;Lcom/datadog/android/rum/model/ResourceEvent$Response;Lcom/datadog/android/rum/model/ResourceEvent$Graphql;)Lcom/datadog/android/rum/model/ResourceEvent$Resource;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lcom/google/gson/JsonElement;", "toJson", "()Lcom/google/gson/JsonElement;", "toString", "Lcom/datadog/android/rum/model/ResourceEvent$Connect;", "getConnect", "Ljava/lang/Long;", "getDecodedBodySize", "Lcom/datadog/android/rum/model/ResourceEvent$DeliveryType;", "getDeliveryType", "Lcom/datadog/android/rum/model/ResourceEvent$Dns;", "getDns", "Lcom/datadog/android/rum/model/ResourceEvent$Download;", "getDownload", "getDuration", "getEncodedBodySize", "Lcom/datadog/android/rum/model/ResourceEvent$FirstByte;", "getFirstByte", "Lcom/datadog/android/rum/model/ResourceEvent$Graphql;", "getGraphql", "Ljava/lang/String;", "getId", "Lcom/datadog/android/rum/model/ResourceEvent$Method;", "getMethod", "getProtocol", "Lcom/datadog/android/rum/model/ResourceEvent$Provider;", "getProvider", "Lcom/datadog/android/rum/model/ResourceEvent$Redirect;", "getRedirect", "Lcom/datadog/android/rum/model/ResourceEvent$RenderBlockingStatus;", "getRenderBlockingStatus", "Lcom/datadog/android/rum/model/ResourceEvent$Request;", "getRequest", "Lcom/datadog/android/rum/model/ResourceEvent$Response;", "getResponse", "getSize", "Lcom/datadog/android/rum/model/ResourceEvent$Ssl;", "getSsl", "getStatusCode", "getTransferSize", "Lcom/datadog/android/rum/model/ResourceEvent$ResourceType;", "getType", "getUrl", "setUrl", "(Ljava/lang/String;)V", "Lcom/datadog/android/rum/model/ResourceEvent$Worker;", "getWorker", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final /* data */ class Resource {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.datadog.android.rum.model.ResourceEvent.Resource.Companion INSTANCE = new com.datadog.android.rum.model.ResourceEvent.Resource.Companion(null);
        private final com.datadog.android.rum.model.ResourceEvent.Connect connect;
        private final java.lang.Long decodedBodySize;
        private final com.datadog.android.rum.model.ResourceEvent.DeliveryType deliveryType;
        private final com.datadog.android.rum.model.ResourceEvent.Dns dns;
        private final com.datadog.android.rum.model.ResourceEvent.Download download;
        private final java.lang.Long duration;
        private final java.lang.Long encodedBodySize;
        private final com.datadog.android.rum.model.ResourceEvent.FirstByte firstByte;
        private final com.datadog.android.rum.model.ResourceEvent.Graphql graphql;
        private final java.lang.String id;
        private final com.datadog.android.rum.model.ResourceEvent.Method method;
        private final java.lang.String protocol;
        private final com.datadog.android.rum.model.ResourceEvent.Provider provider;
        private final com.datadog.android.rum.model.ResourceEvent.Redirect redirect;
        private final com.datadog.android.rum.model.ResourceEvent.RenderBlockingStatus renderBlockingStatus;
        private final com.datadog.android.rum.model.ResourceEvent.Request request;
        private final com.datadog.android.rum.model.ResourceEvent.Response response;
        private final java.lang.Long size;
        private final com.datadog.android.rum.model.ResourceEvent.Ssl ssl;
        private final java.lang.Long statusCode;
        private final java.lang.Long transferSize;
        private final com.datadog.android.rum.model.ResourceEvent.ResourceType type;
        private java.lang.String url;
        private final com.datadog.android.rum.model.ResourceEvent.Worker worker;

        public Resource(java.lang.String str, com.datadog.android.rum.model.ResourceEvent.ResourceType resourceType, com.datadog.android.rum.model.ResourceEvent.Method method, java.lang.String str2, java.lang.Long l, java.lang.Long l2, java.lang.Long l3, java.lang.Long l4, java.lang.Long l5, java.lang.Long l6, com.datadog.android.rum.model.ResourceEvent.RenderBlockingStatus renderBlockingStatus, com.datadog.android.rum.model.ResourceEvent.Worker worker, com.datadog.android.rum.model.ResourceEvent.Redirect redirect, com.datadog.android.rum.model.ResourceEvent.Dns dns, com.datadog.android.rum.model.ResourceEvent.Connect connect, com.datadog.android.rum.model.ResourceEvent.Ssl ssl, com.datadog.android.rum.model.ResourceEvent.FirstByte firstByte, com.datadog.android.rum.model.ResourceEvent.Download download, java.lang.String str3, com.datadog.android.rum.model.ResourceEvent.DeliveryType deliveryType, com.datadog.android.rum.model.ResourceEvent.Provider provider, com.datadog.android.rum.model.ResourceEvent.Request request, com.datadog.android.rum.model.ResourceEvent.Response response, com.datadog.android.rum.model.ResourceEvent.Graphql graphql) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(resourceType, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            this.id = str;
            this.type = resourceType;
            this.method = method;
            this.url = str2;
            this.statusCode = l;
            this.duration = l2;
            this.size = l3;
            this.encodedBodySize = l4;
            this.decodedBodySize = l5;
            this.transferSize = l6;
            this.renderBlockingStatus = renderBlockingStatus;
            this.worker = worker;
            this.redirect = redirect;
            this.dns = dns;
            this.connect = connect;
            this.ssl = ssl;
            this.firstByte = firstByte;
            this.download = download;
            this.protocol = str3;
            this.deliveryType = deliveryType;
            this.provider = provider;
            this.request = request;
            this.response = response;
            this.graphql = graphql;
        }

        public /* synthetic */ Resource(java.lang.String str, com.datadog.android.rum.model.ResourceEvent.ResourceType resourceType, com.datadog.android.rum.model.ResourceEvent.Method method, java.lang.String str2, java.lang.Long l, java.lang.Long l2, java.lang.Long l3, java.lang.Long l4, java.lang.Long l5, java.lang.Long l6, com.datadog.android.rum.model.ResourceEvent.RenderBlockingStatus renderBlockingStatus, com.datadog.android.rum.model.ResourceEvent.Worker worker, com.datadog.android.rum.model.ResourceEvent.Redirect redirect, com.datadog.android.rum.model.ResourceEvent.Dns dns, com.datadog.android.rum.model.ResourceEvent.Connect connect, com.datadog.android.rum.model.ResourceEvent.Ssl ssl, com.datadog.android.rum.model.ResourceEvent.FirstByte firstByte, com.datadog.android.rum.model.ResourceEvent.Download download, java.lang.String str3, com.datadog.android.rum.model.ResourceEvent.DeliveryType deliveryType, com.datadog.android.rum.model.ResourceEvent.Provider provider, com.datadog.android.rum.model.ResourceEvent.Request request, com.datadog.android.rum.model.ResourceEvent.Response response, com.datadog.android.rum.model.ResourceEvent.Graphql graphql, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, resourceType, (i & 4) != 0 ? null : method, str2, (i & 16) != 0 ? null : l, (i & 32) != 0 ? null : l2, (i & 64) != 0 ? null : l3, (i & 128) != 0 ? null : l4, (i & 256) != 0 ? null : l5, (i & 512) != 0 ? null : l6, (i & 1024) != 0 ? null : renderBlockingStatus, (i & 2048) != 0 ? null : worker, (i & 4096) != 0 ? null : redirect, (i & 8192) != 0 ? null : dns, (i & 16384) != 0 ? null : connect, (32768 & i) != 0 ? null : ssl, (65536 & i) != 0 ? null : firstByte, (131072 & i) != 0 ? null : download, (262144 & i) != 0 ? null : str3, (524288 & i) != 0 ? null : deliveryType, (1048576 & i) != 0 ? null : provider, (2097152 & i) != 0 ? null : request, (4194304 & i) != 0 ? null : response, (i & 8388608) != 0 ? null : graphql);
        }

        public final java.lang.String getId() {
            return this.id;
        }

        public final com.datadog.android.rum.model.ResourceEvent.ResourceType getType() {
            return this.type;
        }

        public final com.datadog.android.rum.model.ResourceEvent.Method getMethod() {
            return this.method;
        }

        public final java.lang.String getUrl() {
            return this.url;
        }

        public final void setUrl(java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.url = str;
        }

        public final java.lang.Long getStatusCode() {
            return this.statusCode;
        }

        public final java.lang.Long getDuration() {
            return this.duration;
        }

        public final java.lang.Long getSize() {
            return this.size;
        }

        public final java.lang.Long getEncodedBodySize() {
            return this.encodedBodySize;
        }

        public final java.lang.Long getDecodedBodySize() {
            return this.decodedBodySize;
        }

        public final java.lang.Long getTransferSize() {
            return this.transferSize;
        }

        public final com.datadog.android.rum.model.ResourceEvent.RenderBlockingStatus getRenderBlockingStatus() {
            return this.renderBlockingStatus;
        }

        public final com.datadog.android.rum.model.ResourceEvent.Worker getWorker() {
            return this.worker;
        }

        public final com.datadog.android.rum.model.ResourceEvent.Redirect getRedirect() {
            return this.redirect;
        }

        public final com.datadog.android.rum.model.ResourceEvent.Dns getDns() {
            return this.dns;
        }

        public final com.datadog.android.rum.model.ResourceEvent.Connect getConnect() {
            return this.connect;
        }

        public final com.datadog.android.rum.model.ResourceEvent.Ssl getSsl() {
            return this.ssl;
        }

        public final com.datadog.android.rum.model.ResourceEvent.FirstByte getFirstByte() {
            return this.firstByte;
        }

        public final com.datadog.android.rum.model.ResourceEvent.Download getDownload() {
            return this.download;
        }

        public final java.lang.String getProtocol() {
            return this.protocol;
        }

        public final com.datadog.android.rum.model.ResourceEvent.DeliveryType getDeliveryType() {
            return this.deliveryType;
        }

        public final com.datadog.android.rum.model.ResourceEvent.Provider getProvider() {
            return this.provider;
        }

        public final com.datadog.android.rum.model.ResourceEvent.Request getRequest() {
            return this.request;
        }

        public final com.datadog.android.rum.model.ResourceEvent.Response getResponse() {
            return this.response;
        }

        public final com.datadog.android.rum.model.ResourceEvent.Graphql getGraphql() {
            return this.graphql;
        }

        public final com.google.gson.JsonElement toJson() {
            com.google.gson.JsonObject jsonObject = new com.google.gson.JsonObject();
            java.lang.String str = this.id;
            if (str != null) {
                jsonObject.addProperty("id", str);
            }
            jsonObject.add("type", this.type.toJson());
            com.datadog.android.rum.model.ResourceEvent.Method method = this.method;
            if (method != null) {
                jsonObject.add("method", method.toJson());
            }
            jsonObject.addProperty("url", this.url);
            java.lang.Long l = this.statusCode;
            if (l != null) {
                jsonObject.addProperty("status_code", java.lang.Long.valueOf(l.longValue()));
            }
            java.lang.Long l2 = this.duration;
            if (l2 != null) {
                jsonObject.addProperty("duration", java.lang.Long.valueOf(l2.longValue()));
            }
            java.lang.Long l3 = this.size;
            if (l3 != null) {
                jsonObject.addProperty(io.ktor.http.ContentDisposition.Parameters.Size, java.lang.Long.valueOf(l3.longValue()));
            }
            java.lang.Long l4 = this.encodedBodySize;
            if (l4 != null) {
                jsonObject.addProperty("encoded_body_size", java.lang.Long.valueOf(l4.longValue()));
            }
            java.lang.Long l5 = this.decodedBodySize;
            if (l5 != null) {
                jsonObject.addProperty("decoded_body_size", java.lang.Long.valueOf(l5.longValue()));
            }
            java.lang.Long l6 = this.transferSize;
            if (l6 != null) {
                jsonObject.addProperty("transfer_size", java.lang.Long.valueOf(l6.longValue()));
            }
            com.datadog.android.rum.model.ResourceEvent.RenderBlockingStatus renderBlockingStatus = this.renderBlockingStatus;
            if (renderBlockingStatus != null) {
                jsonObject.add("render_blocking_status", renderBlockingStatus.toJson());
            }
            com.datadog.android.rum.model.ResourceEvent.Worker worker = this.worker;
            if (worker != null) {
                jsonObject.add("worker", worker.toJson());
            }
            com.datadog.android.rum.model.ResourceEvent.Redirect redirect = this.redirect;
            if (redirect != null) {
                jsonObject.add("redirect", redirect.toJson());
            }
            com.datadog.android.rum.model.ResourceEvent.Dns dns = this.dns;
            if (dns != null) {
                jsonObject.add("dns", dns.toJson());
            }
            com.datadog.android.rum.model.ResourceEvent.Connect connect = this.connect;
            if (connect != null) {
                jsonObject.add("connect", connect.toJson());
            }
            com.datadog.android.rum.model.ResourceEvent.Ssl ssl = this.ssl;
            if (ssl != null) {
                jsonObject.add("ssl", ssl.toJson());
            }
            com.datadog.android.rum.model.ResourceEvent.FirstByte firstByte = this.firstByte;
            if (firstByte != null) {
                jsonObject.add("first_byte", firstByte.toJson());
            }
            com.datadog.android.rum.model.ResourceEvent.Download download = this.download;
            if (download != null) {
                jsonObject.add("download", download.toJson());
            }
            java.lang.String str2 = this.protocol;
            if (str2 != null) {
                jsonObject.addProperty("protocol", str2);
            }
            com.datadog.android.rum.model.ResourceEvent.DeliveryType deliveryType = this.deliveryType;
            if (deliveryType != null) {
                jsonObject.add("delivery_type", deliveryType.toJson());
            }
            com.datadog.android.rum.model.ResourceEvent.Provider provider = this.provider;
            if (provider != null) {
                jsonObject.add("provider", provider.toJson());
            }
            com.datadog.android.rum.model.ResourceEvent.Request request = this.request;
            if (request != null) {
                jsonObject.add("request", request.toJson());
            }
            com.datadog.android.rum.model.ResourceEvent.Response response = this.response;
            if (response != null) {
                jsonObject.add("response", response.toJson());
            }
            com.datadog.android.rum.model.ResourceEvent.Graphql graphql = this.graphql;
            if (graphql != null) {
                jsonObject.add("graphql", graphql.toJson());
            }
            return jsonObject;
        }

        @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/datadog/android/rum/model/ResourceEvent$Resource$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/rum/model/ResourceEvent$Resource;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/rum/model/ResourceEvent$Resource;", "Lcom/google/gson/JsonObject;", "jsonObject", "fromJsonObject", "(Lcom/google/gson/JsonObject;)Lcom/datadog/android/rum/model/ResourceEvent$Resource;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @kotlin.jvm.JvmStatic
            public final com.datadog.android.rum.model.ResourceEvent.Resource fromJson(java.lang.String jsonString) throws com.google.gson.JsonParseException {
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
            public final com.datadog.android.rum.model.ResourceEvent.Resource fromJsonObject(com.google.gson.JsonObject jsonObject) throws com.google.gson.JsonParseException {
                com.google.gson.JsonObject asJsonObject;
                com.google.gson.JsonObject asJsonObject2;
                com.google.gson.JsonObject asJsonObject3;
                com.google.gson.JsonObject asJsonObject4;
                java.lang.String asString;
                com.google.gson.JsonObject asJsonObject5;
                com.google.gson.JsonObject asJsonObject6;
                com.google.gson.JsonObject asJsonObject7;
                com.google.gson.JsonObject asJsonObject8;
                com.google.gson.JsonObject asJsonObject9;
                com.google.gson.JsonObject asJsonObject10;
                com.google.gson.JsonObject asJsonObject11;
                java.lang.String asString2;
                java.lang.String asString3;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonObject, "");
                try {
                    com.google.gson.JsonElement jsonElement = jsonObject.get("id");
                    com.datadog.android.rum.model.ResourceEvent.Graphql graphql = null;
                    java.lang.String asString4 = jsonElement != null ? jsonElement.getAsString() : null;
                    com.datadog.android.rum.model.ResourceEvent.ResourceType.Companion companion = com.datadog.android.rum.model.ResourceEvent.ResourceType.INSTANCE;
                    java.lang.String asString5 = jsonObject.get("type").getAsString();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asString5, "");
                    com.datadog.android.rum.model.ResourceEvent.ResourceType fromJson = companion.fromJson(asString5);
                    com.google.gson.JsonElement jsonElement2 = jsonObject.get("method");
                    com.datadog.android.rum.model.ResourceEvent.Method fromJson2 = (jsonElement2 == null || (asString3 = jsonElement2.getAsString()) == null) ? null : com.datadog.android.rum.model.ResourceEvent.Method.INSTANCE.fromJson(asString3);
                    java.lang.String asString6 = jsonObject.get("url").getAsString();
                    com.google.gson.JsonElement jsonElement3 = jsonObject.get("status_code");
                    java.lang.Long valueOf = jsonElement3 != null ? java.lang.Long.valueOf(jsonElement3.getAsLong()) : null;
                    com.google.gson.JsonElement jsonElement4 = jsonObject.get("duration");
                    java.lang.Long valueOf2 = jsonElement4 != null ? java.lang.Long.valueOf(jsonElement4.getAsLong()) : null;
                    com.google.gson.JsonElement jsonElement5 = jsonObject.get(io.ktor.http.ContentDisposition.Parameters.Size);
                    java.lang.Long valueOf3 = jsonElement5 != null ? java.lang.Long.valueOf(jsonElement5.getAsLong()) : null;
                    com.google.gson.JsonElement jsonElement6 = jsonObject.get("encoded_body_size");
                    java.lang.Long valueOf4 = jsonElement6 != null ? java.lang.Long.valueOf(jsonElement6.getAsLong()) : null;
                    com.google.gson.JsonElement jsonElement7 = jsonObject.get("decoded_body_size");
                    java.lang.Long valueOf5 = jsonElement7 != null ? java.lang.Long.valueOf(jsonElement7.getAsLong()) : null;
                    com.google.gson.JsonElement jsonElement8 = jsonObject.get("transfer_size");
                    java.lang.Long valueOf6 = jsonElement8 != null ? java.lang.Long.valueOf(jsonElement8.getAsLong()) : null;
                    com.google.gson.JsonElement jsonElement9 = jsonObject.get("render_blocking_status");
                    com.datadog.android.rum.model.ResourceEvent.RenderBlockingStatus fromJson3 = (jsonElement9 == null || (asString2 = jsonElement9.getAsString()) == null) ? null : com.datadog.android.rum.model.ResourceEvent.RenderBlockingStatus.INSTANCE.fromJson(asString2);
                    com.google.gson.JsonElement jsonElement10 = jsonObject.get("worker");
                    com.datadog.android.rum.model.ResourceEvent.Worker fromJsonObject = (jsonElement10 == null || (asJsonObject11 = jsonElement10.getAsJsonObject()) == null) ? null : com.datadog.android.rum.model.ResourceEvent.Worker.INSTANCE.fromJsonObject(asJsonObject11);
                    com.google.gson.JsonElement jsonElement11 = jsonObject.get("redirect");
                    com.datadog.android.rum.model.ResourceEvent.Redirect fromJsonObject2 = (jsonElement11 == null || (asJsonObject10 = jsonElement11.getAsJsonObject()) == null) ? null : com.datadog.android.rum.model.ResourceEvent.Redirect.INSTANCE.fromJsonObject(asJsonObject10);
                    com.google.gson.JsonElement jsonElement12 = jsonObject.get("dns");
                    com.datadog.android.rum.model.ResourceEvent.Dns fromJsonObject3 = (jsonElement12 == null || (asJsonObject9 = jsonElement12.getAsJsonObject()) == null) ? null : com.datadog.android.rum.model.ResourceEvent.Dns.INSTANCE.fromJsonObject(asJsonObject9);
                    com.google.gson.JsonElement jsonElement13 = jsonObject.get("connect");
                    com.datadog.android.rum.model.ResourceEvent.Connect fromJsonObject4 = (jsonElement13 == null || (asJsonObject8 = jsonElement13.getAsJsonObject()) == null) ? null : com.datadog.android.rum.model.ResourceEvent.Connect.INSTANCE.fromJsonObject(asJsonObject8);
                    com.google.gson.JsonElement jsonElement14 = jsonObject.get("ssl");
                    com.datadog.android.rum.model.ResourceEvent.Ssl fromJsonObject5 = (jsonElement14 == null || (asJsonObject7 = jsonElement14.getAsJsonObject()) == null) ? null : com.datadog.android.rum.model.ResourceEvent.Ssl.INSTANCE.fromJsonObject(asJsonObject7);
                    com.google.gson.JsonElement jsonElement15 = jsonObject.get("first_byte");
                    com.datadog.android.rum.model.ResourceEvent.FirstByte fromJsonObject6 = (jsonElement15 == null || (asJsonObject6 = jsonElement15.getAsJsonObject()) == null) ? null : com.datadog.android.rum.model.ResourceEvent.FirstByte.INSTANCE.fromJsonObject(asJsonObject6);
                    com.google.gson.JsonElement jsonElement16 = jsonObject.get("download");
                    com.datadog.android.rum.model.ResourceEvent.Download fromJsonObject7 = (jsonElement16 == null || (asJsonObject5 = jsonElement16.getAsJsonObject()) == null) ? null : com.datadog.android.rum.model.ResourceEvent.Download.INSTANCE.fromJsonObject(asJsonObject5);
                    com.google.gson.JsonElement jsonElement17 = jsonObject.get("protocol");
                    java.lang.String asString7 = jsonElement17 != null ? jsonElement17.getAsString() : null;
                    com.google.gson.JsonElement jsonElement18 = jsonObject.get("delivery_type");
                    com.datadog.android.rum.model.ResourceEvent.DeliveryType fromJson4 = (jsonElement18 == null || (asString = jsonElement18.getAsString()) == null) ? null : com.datadog.android.rum.model.ResourceEvent.DeliveryType.INSTANCE.fromJson(asString);
                    com.google.gson.JsonElement jsonElement19 = jsonObject.get("provider");
                    com.datadog.android.rum.model.ResourceEvent.Provider fromJsonObject8 = (jsonElement19 == null || (asJsonObject4 = jsonElement19.getAsJsonObject()) == null) ? null : com.datadog.android.rum.model.ResourceEvent.Provider.INSTANCE.fromJsonObject(asJsonObject4);
                    com.google.gson.JsonElement jsonElement20 = jsonObject.get("request");
                    com.datadog.android.rum.model.ResourceEvent.Request fromJsonObject9 = (jsonElement20 == null || (asJsonObject3 = jsonElement20.getAsJsonObject()) == null) ? null : com.datadog.android.rum.model.ResourceEvent.Request.INSTANCE.fromJsonObject(asJsonObject3);
                    com.google.gson.JsonElement jsonElement21 = jsonObject.get("response");
                    com.datadog.android.rum.model.ResourceEvent.Response fromJsonObject10 = (jsonElement21 == null || (asJsonObject2 = jsonElement21.getAsJsonObject()) == null) ? null : com.datadog.android.rum.model.ResourceEvent.Response.INSTANCE.fromJsonObject(asJsonObject2);
                    com.google.gson.JsonElement jsonElement22 = jsonObject.get("graphql");
                    if (jsonElement22 != null && (asJsonObject = jsonElement22.getAsJsonObject()) != null) {
                        graphql = com.datadog.android.rum.model.ResourceEvent.Graphql.INSTANCE.fromJsonObject(asJsonObject);
                    }
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asString6, "");
                    return new com.datadog.android.rum.model.ResourceEvent.Resource(asString4, fromJson, fromJson2, asString6, valueOf, valueOf2, valueOf3, valueOf4, valueOf5, valueOf6, fromJson3, fromJsonObject, fromJsonObject2, fromJsonObject3, fromJsonObject4, fromJsonObject5, fromJsonObject6, fromJsonObject7, asString7, fromJson4, fromJsonObject8, fromJsonObject9, fromJsonObject10, graphql);
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
            java.lang.String str = this.id;
            com.datadog.android.rum.model.ResourceEvent.ResourceType resourceType = this.type;
            com.datadog.android.rum.model.ResourceEvent.Method method = this.method;
            java.lang.String str2 = this.url;
            java.lang.Long l = this.statusCode;
            java.lang.Long l2 = this.duration;
            java.lang.Long l3 = this.size;
            java.lang.Long l4 = this.encodedBodySize;
            java.lang.Long l5 = this.decodedBodySize;
            java.lang.Long l6 = this.transferSize;
            com.datadog.android.rum.model.ResourceEvent.RenderBlockingStatus renderBlockingStatus = this.renderBlockingStatus;
            com.datadog.android.rum.model.ResourceEvent.Worker worker = this.worker;
            com.datadog.android.rum.model.ResourceEvent.Redirect redirect = this.redirect;
            com.datadog.android.rum.model.ResourceEvent.Dns dns = this.dns;
            com.datadog.android.rum.model.ResourceEvent.Connect connect = this.connect;
            com.datadog.android.rum.model.ResourceEvent.Ssl ssl = this.ssl;
            com.datadog.android.rum.model.ResourceEvent.FirstByte firstByte = this.firstByte;
            com.datadog.android.rum.model.ResourceEvent.Download download = this.download;
            java.lang.String str3 = this.protocol;
            com.datadog.android.rum.model.ResourceEvent.DeliveryType deliveryType = this.deliveryType;
            com.datadog.android.rum.model.ResourceEvent.Provider provider = this.provider;
            com.datadog.android.rum.model.ResourceEvent.Request request = this.request;
            com.datadog.android.rum.model.ResourceEvent.Response response = this.response;
            com.datadog.android.rum.model.ResourceEvent.Graphql graphql = this.graphql;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Resource(id=");
            sb.append(str);
            sb.append(", type=");
            sb.append(resourceType);
            sb.append(", method=");
            sb.append(method);
            sb.append(", url=");
            sb.append(str2);
            sb.append(", statusCode=");
            sb.append(l);
            sb.append(", duration=");
            sb.append(l2);
            sb.append(", size=");
            sb.append(l3);
            sb.append(", encodedBodySize=");
            sb.append(l4);
            sb.append(", decodedBodySize=");
            sb.append(l5);
            sb.append(", transferSize=");
            sb.append(l6);
            sb.append(", renderBlockingStatus=");
            sb.append(renderBlockingStatus);
            sb.append(", worker=");
            sb.append(worker);
            sb.append(", redirect=");
            sb.append(redirect);
            sb.append(", dns=");
            sb.append(dns);
            sb.append(", connect=");
            sb.append(connect);
            sb.append(", ssl=");
            sb.append(ssl);
            sb.append(", firstByte=");
            sb.append(firstByte);
            sb.append(", download=");
            sb.append(download);
            sb.append(", protocol=");
            sb.append(str3);
            sb.append(", deliveryType=");
            sb.append(deliveryType);
            sb.append(", provider=");
            sb.append(provider);
            sb.append(", request=");
            sb.append(request);
            sb.append(", response=");
            sb.append(response);
            sb.append(", graphql=");
            sb.append(graphql);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.lang.String str = this.id;
            int hashCode = str == null ? 0 : str.hashCode();
            int hashCode2 = this.type.hashCode();
            com.datadog.android.rum.model.ResourceEvent.Method method = this.method;
            int hashCode3 = method == null ? 0 : method.hashCode();
            int hashCode4 = this.url.hashCode();
            java.lang.Long l = this.statusCode;
            int hashCode5 = l == null ? 0 : l.hashCode();
            java.lang.Long l2 = this.duration;
            int hashCode6 = l2 == null ? 0 : l2.hashCode();
            java.lang.Long l3 = this.size;
            int hashCode7 = l3 == null ? 0 : l3.hashCode();
            java.lang.Long l4 = this.encodedBodySize;
            int hashCode8 = l4 == null ? 0 : l4.hashCode();
            java.lang.Long l5 = this.decodedBodySize;
            int hashCode9 = l5 == null ? 0 : l5.hashCode();
            java.lang.Long l6 = this.transferSize;
            int hashCode10 = l6 == null ? 0 : l6.hashCode();
            com.datadog.android.rum.model.ResourceEvent.RenderBlockingStatus renderBlockingStatus = this.renderBlockingStatus;
            int hashCode11 = renderBlockingStatus == null ? 0 : renderBlockingStatus.hashCode();
            com.datadog.android.rum.model.ResourceEvent.Worker worker = this.worker;
            int hashCode12 = worker == null ? 0 : worker.hashCode();
            com.datadog.android.rum.model.ResourceEvent.Redirect redirect = this.redirect;
            int hashCode13 = redirect == null ? 0 : redirect.hashCode();
            com.datadog.android.rum.model.ResourceEvent.Dns dns = this.dns;
            int hashCode14 = dns == null ? 0 : dns.hashCode();
            com.datadog.android.rum.model.ResourceEvent.Connect connect = this.connect;
            int hashCode15 = connect == null ? 0 : connect.hashCode();
            com.datadog.android.rum.model.ResourceEvent.Ssl ssl = this.ssl;
            int hashCode16 = ssl == null ? 0 : ssl.hashCode();
            com.datadog.android.rum.model.ResourceEvent.FirstByte firstByte = this.firstByte;
            int hashCode17 = firstByte == null ? 0 : firstByte.hashCode();
            com.datadog.android.rum.model.ResourceEvent.Download download = this.download;
            int hashCode18 = download == null ? 0 : download.hashCode();
            java.lang.String str2 = this.protocol;
            int hashCode19 = str2 == null ? 0 : str2.hashCode();
            com.datadog.android.rum.model.ResourceEvent.DeliveryType deliveryType = this.deliveryType;
            int hashCode20 = deliveryType == null ? 0 : deliveryType.hashCode();
            com.datadog.android.rum.model.ResourceEvent.Provider provider = this.provider;
            int hashCode21 = provider == null ? 0 : provider.hashCode();
            com.datadog.android.rum.model.ResourceEvent.Request request = this.request;
            int hashCode22 = request == null ? 0 : request.hashCode();
            com.datadog.android.rum.model.ResourceEvent.Response response = this.response;
            int hashCode23 = response == null ? 0 : response.hashCode();
            com.datadog.android.rum.model.ResourceEvent.Graphql graphql = this.graphql;
            return (((((((((((((((((((((((((((((((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + hashCode10) * 31) + hashCode11) * 31) + hashCode12) * 31) + hashCode13) * 31) + hashCode14) * 31) + hashCode15) * 31) + hashCode16) * 31) + hashCode17) * 31) + hashCode18) * 31) + hashCode19) * 31) + hashCode20) * 31) + hashCode21) * 31) + hashCode22) * 31) + hashCode23) * 31) + (graphql != null ? graphql.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.datadog.android.rum.model.ResourceEvent.Resource)) {
                return false;
            }
            com.datadog.android.rum.model.ResourceEvent.Resource resource = (com.datadog.android.rum.model.ResourceEvent.Resource) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.id, resource.id) && this.type == resource.type && this.method == resource.method && kotlin.jvm.internal.Intrinsics.areEqual(this.url, resource.url) && kotlin.jvm.internal.Intrinsics.areEqual(this.statusCode, resource.statusCode) && kotlin.jvm.internal.Intrinsics.areEqual(this.duration, resource.duration) && kotlin.jvm.internal.Intrinsics.areEqual(this.size, resource.size) && kotlin.jvm.internal.Intrinsics.areEqual(this.encodedBodySize, resource.encodedBodySize) && kotlin.jvm.internal.Intrinsics.areEqual(this.decodedBodySize, resource.decodedBodySize) && kotlin.jvm.internal.Intrinsics.areEqual(this.transferSize, resource.transferSize) && this.renderBlockingStatus == resource.renderBlockingStatus && kotlin.jvm.internal.Intrinsics.areEqual(this.worker, resource.worker) && kotlin.jvm.internal.Intrinsics.areEqual(this.redirect, resource.redirect) && kotlin.jvm.internal.Intrinsics.areEqual(this.dns, resource.dns) && kotlin.jvm.internal.Intrinsics.areEqual(this.connect, resource.connect) && kotlin.jvm.internal.Intrinsics.areEqual(this.ssl, resource.ssl) && kotlin.jvm.internal.Intrinsics.areEqual(this.firstByte, resource.firstByte) && kotlin.jvm.internal.Intrinsics.areEqual(this.download, resource.download) && kotlin.jvm.internal.Intrinsics.areEqual(this.protocol, resource.protocol) && this.deliveryType == resource.deliveryType && kotlin.jvm.internal.Intrinsics.areEqual(this.provider, resource.provider) && kotlin.jvm.internal.Intrinsics.areEqual(this.request, resource.request) && kotlin.jvm.internal.Intrinsics.areEqual(this.response, resource.response) && kotlin.jvm.internal.Intrinsics.areEqual(this.graphql, resource.graphql);
        }

        public final com.datadog.android.rum.model.ResourceEvent.Resource copy(java.lang.String id, com.datadog.android.rum.model.ResourceEvent.ResourceType type, com.datadog.android.rum.model.ResourceEvent.Method method, java.lang.String url, java.lang.Long statusCode, java.lang.Long duration, java.lang.Long size, java.lang.Long encodedBodySize, java.lang.Long decodedBodySize, java.lang.Long transferSize, com.datadog.android.rum.model.ResourceEvent.RenderBlockingStatus renderBlockingStatus, com.datadog.android.rum.model.ResourceEvent.Worker worker, com.datadog.android.rum.model.ResourceEvent.Redirect redirect, com.datadog.android.rum.model.ResourceEvent.Dns dns, com.datadog.android.rum.model.ResourceEvent.Connect connect, com.datadog.android.rum.model.ResourceEvent.Ssl ssl, com.datadog.android.rum.model.ResourceEvent.FirstByte firstByte, com.datadog.android.rum.model.ResourceEvent.Download download, java.lang.String protocol, com.datadog.android.rum.model.ResourceEvent.DeliveryType deliveryType, com.datadog.android.rum.model.ResourceEvent.Provider provider, com.datadog.android.rum.model.ResourceEvent.Request request, com.datadog.android.rum.model.ResourceEvent.Response response, com.datadog.android.rum.model.ResourceEvent.Graphql graphql) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "");
            return new com.datadog.android.rum.model.ResourceEvent.Resource(id, type, method, url, statusCode, duration, size, encodedBodySize, decodedBodySize, transferSize, renderBlockingStatus, worker, redirect, dns, connect, ssl, firstByte, download, protocol, deliveryType, provider, request, response, graphql);
        }

        /* renamed from: component9, reason: from getter */
        public final java.lang.Long getDecodedBodySize() {
            return this.decodedBodySize;
        }

        /* renamed from: component8, reason: from getter */
        public final java.lang.Long getEncodedBodySize() {
            return this.encodedBodySize;
        }

        /* renamed from: component7, reason: from getter */
        public final java.lang.Long getSize() {
            return this.size;
        }

        /* renamed from: component6, reason: from getter */
        public final java.lang.Long getDuration() {
            return this.duration;
        }

        /* renamed from: component5, reason: from getter */
        public final java.lang.Long getStatusCode() {
            return this.statusCode;
        }

        /* renamed from: component4, reason: from getter */
        public final java.lang.String getUrl() {
            return this.url;
        }

        /* renamed from: component3, reason: from getter */
        public final com.datadog.android.rum.model.ResourceEvent.Method getMethod() {
            return this.method;
        }

        /* renamed from: component24, reason: from getter */
        public final com.datadog.android.rum.model.ResourceEvent.Graphql getGraphql() {
            return this.graphql;
        }

        /* renamed from: component23, reason: from getter */
        public final com.datadog.android.rum.model.ResourceEvent.Response getResponse() {
            return this.response;
        }

        /* renamed from: component22, reason: from getter */
        public final com.datadog.android.rum.model.ResourceEvent.Request getRequest() {
            return this.request;
        }

        /* renamed from: component21, reason: from getter */
        public final com.datadog.android.rum.model.ResourceEvent.Provider getProvider() {
            return this.provider;
        }

        /* renamed from: component20, reason: from getter */
        public final com.datadog.android.rum.model.ResourceEvent.DeliveryType getDeliveryType() {
            return this.deliveryType;
        }

        /* renamed from: component2, reason: from getter */
        public final com.datadog.android.rum.model.ResourceEvent.ResourceType getType() {
            return this.type;
        }

        /* renamed from: component19, reason: from getter */
        public final java.lang.String getProtocol() {
            return this.protocol;
        }

        /* renamed from: component18, reason: from getter */
        public final com.datadog.android.rum.model.ResourceEvent.Download getDownload() {
            return this.download;
        }

        /* renamed from: component17, reason: from getter */
        public final com.datadog.android.rum.model.ResourceEvent.FirstByte getFirstByte() {
            return this.firstByte;
        }

        /* renamed from: component16, reason: from getter */
        public final com.datadog.android.rum.model.ResourceEvent.Ssl getSsl() {
            return this.ssl;
        }

        /* renamed from: component15, reason: from getter */
        public final com.datadog.android.rum.model.ResourceEvent.Connect getConnect() {
            return this.connect;
        }

        /* renamed from: component14, reason: from getter */
        public final com.datadog.android.rum.model.ResourceEvent.Dns getDns() {
            return this.dns;
        }

        /* renamed from: component13, reason: from getter */
        public final com.datadog.android.rum.model.ResourceEvent.Redirect getRedirect() {
            return this.redirect;
        }

        /* renamed from: component12, reason: from getter */
        public final com.datadog.android.rum.model.ResourceEvent.Worker getWorker() {
            return this.worker;
        }

        /* renamed from: component11, reason: from getter */
        public final com.datadog.android.rum.model.ResourceEvent.RenderBlockingStatus getRenderBlockingStatus() {
            return this.renderBlockingStatus;
        }

        /* renamed from: component10, reason: from getter */
        public final java.lang.Long getTransferSize() {
            return this.transferSize;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getId() {
            return this.id;
        }

        @kotlin.jvm.JvmStatic
        public static final com.datadog.android.rum.model.ResourceEvent.Resource fromJsonObject(com.google.gson.JsonObject jsonObject) throws com.google.gson.JsonParseException {
            return INSTANCE.fromJsonObject(jsonObject);
        }

        @kotlin.jvm.JvmStatic
        public static final com.datadog.android.rum.model.ResourceEvent.Resource fromJson(java.lang.String str) throws com.google.gson.JsonParseException {
            return INSTANCE.fromJson(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\b\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ(\u0010\n\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\bR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0018\u0010\bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0019\u0010\b"}, d2 = {"Lcom/datadog/android/rum/model/ResourceEvent$Cellular;", "", "", "technology", "carrierName", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/datadog/android/rum/model/ResourceEvent$Cellular;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lcom/google/gson/JsonElement;", "toJson", "()Lcom/google/gson/JsonElement;", "toString", "Ljava/lang/String;", "getCarrierName", "getTechnology", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes7.dex */
    public static final /* data */ class Cellular {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.datadog.android.rum.model.ResourceEvent.Cellular.Companion INSTANCE = new com.datadog.android.rum.model.ResourceEvent.Cellular.Companion(null);
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

        @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/datadog/android/rum/model/ResourceEvent$Cellular$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/rum/model/ResourceEvent$Cellular;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/rum/model/ResourceEvent$Cellular;", "Lcom/google/gson/JsonObject;", "jsonObject", "fromJsonObject", "(Lcom/google/gson/JsonObject;)Lcom/datadog/android/rum/model/ResourceEvent$Cellular;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @kotlin.jvm.JvmStatic
            public final com.datadog.android.rum.model.ResourceEvent.Cellular fromJson(java.lang.String jsonString) throws com.google.gson.JsonParseException {
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
            public final com.datadog.android.rum.model.ResourceEvent.Cellular fromJsonObject(com.google.gson.JsonObject jsonObject) throws com.google.gson.JsonParseException {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonObject, "");
                try {
                    com.google.gson.JsonElement jsonElement = jsonObject.get("technology");
                    java.lang.String asString = jsonElement != null ? jsonElement.getAsString() : null;
                    com.google.gson.JsonElement jsonElement2 = jsonObject.get("carrier_name");
                    return new com.datadog.android.rum.model.ResourceEvent.Cellular(asString, jsonElement2 != null ? jsonElement2.getAsString() : null);
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
            if (!(other instanceof com.datadog.android.rum.model.ResourceEvent.Cellular)) {
                return false;
            }
            com.datadog.android.rum.model.ResourceEvent.Cellular cellular = (com.datadog.android.rum.model.ResourceEvent.Cellular) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.technology, cellular.technology) && kotlin.jvm.internal.Intrinsics.areEqual(this.carrierName, cellular.carrierName);
        }

        public final com.datadog.android.rum.model.ResourceEvent.Cellular copy(java.lang.String technology, java.lang.String carrierName) {
            return new com.datadog.android.rum.model.ResourceEvent.Cellular(technology, carrierName);
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
        public static final com.datadog.android.rum.model.ResourceEvent.Cellular fromJsonObject(com.google.gson.JsonObject jsonObject) throws com.google.gson.JsonParseException {
            return INSTANCE.fromJsonObject(jsonObject);
        }

        @kotlin.jvm.JvmStatic
        public static final com.datadog.android.rum.model.ResourceEvent.Cellular fromJson(java.lang.String str) throws com.google.gson.JsonParseException {
            return INSTANCE.fromJson(str);
        }

        public static /* synthetic */ com.datadog.android.rum.model.ResourceEvent.Cellular copy$default(com.datadog.android.rum.model.ResourceEvent.Cellular cellular, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
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

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0004\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0004\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001a\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001b\u0010\b"}, d2 = {"Lcom/datadog/android/rum/model/ResourceEvent$Viewport;", "", "", "width", "height", "<init>", "(Ljava/lang/Number;Ljava/lang/Number;)V", "component1", "()Ljava/lang/Number;", "component2", "copy", "(Ljava/lang/Number;Ljava/lang/Number;)Lcom/datadog/android/rum/model/ResourceEvent$Viewport;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lcom/google/gson/JsonElement;", "toJson", "()Lcom/google/gson/JsonElement;", "", "toString", "()Ljava/lang/String;", "Ljava/lang/Number;", "getHeight", "getWidth", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final /* data */ class Viewport {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.datadog.android.rum.model.ResourceEvent.Viewport.Companion INSTANCE = new com.datadog.android.rum.model.ResourceEvent.Viewport.Companion(null);
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

        @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/datadog/android/rum/model/ResourceEvent$Viewport$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/rum/model/ResourceEvent$Viewport;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/rum/model/ResourceEvent$Viewport;", "Lcom/google/gson/JsonObject;", "jsonObject", "fromJsonObject", "(Lcom/google/gson/JsonObject;)Lcom/datadog/android/rum/model/ResourceEvent$Viewport;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @kotlin.jvm.JvmStatic
            public final com.datadog.android.rum.model.ResourceEvent.Viewport fromJson(java.lang.String jsonString) throws com.google.gson.JsonParseException {
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
            public final com.datadog.android.rum.model.ResourceEvent.Viewport fromJsonObject(com.google.gson.JsonObject jsonObject) throws com.google.gson.JsonParseException {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonObject, "");
                try {
                    java.lang.Number asNumber = jsonObject.get("width").getAsNumber();
                    java.lang.Number asNumber2 = jsonObject.get("height").getAsNumber();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asNumber, "");
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asNumber2, "");
                    return new com.datadog.android.rum.model.ResourceEvent.Viewport(asNumber, asNumber2);
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
            if (!(other instanceof com.datadog.android.rum.model.ResourceEvent.Viewport)) {
                return false;
            }
            com.datadog.android.rum.model.ResourceEvent.Viewport viewport = (com.datadog.android.rum.model.ResourceEvent.Viewport) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.width, viewport.width) && kotlin.jvm.internal.Intrinsics.areEqual(this.height, viewport.height);
        }

        public final com.datadog.android.rum.model.ResourceEvent.Viewport copy(java.lang.Number width, java.lang.Number height) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(width, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(height, "");
            return new com.datadog.android.rum.model.ResourceEvent.Viewport(width, height);
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
        public static final com.datadog.android.rum.model.ResourceEvent.Viewport fromJsonObject(com.google.gson.JsonObject jsonObject) throws com.google.gson.JsonParseException {
            return INSTANCE.fromJsonObject(jsonObject);
        }

        @kotlin.jvm.JvmStatic
        public static final com.datadog.android.rum.model.ResourceEvent.Viewport fromJson(java.lang.String str) throws com.google.gson.JsonParseException {
            return INSTANCE.fromJson(str);
        }

        public static /* synthetic */ com.datadog.android.rum.model.ResourceEvent.Viewport copy$default(com.datadog.android.rum.model.ResourceEvent.Viewport viewport, java.lang.Number number, java.lang.Number number2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                number = viewport.width;
            }
            if ((i & 2) != 0) {
                number2 = viewport.height;
            }
            return viewport.copy(number, number2);
        }
    }

    @kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\b\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ(\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001d\u001a\u0004\b\u001e\u0010\u000b"}, d2 = {"Lcom/datadog/android/rum/model/ResourceEvent$DdSession;", "", "Lcom/datadog/android/rum/model/ResourceEvent$Plan;", "plan", "Lcom/datadog/android/rum/model/ResourceEvent$SessionPrecondition;", "sessionPrecondition", "<init>", "(Lcom/datadog/android/rum/model/ResourceEvent$Plan;Lcom/datadog/android/rum/model/ResourceEvent$SessionPrecondition;)V", "component1", "()Lcom/datadog/android/rum/model/ResourceEvent$Plan;", "component2", "()Lcom/datadog/android/rum/model/ResourceEvent$SessionPrecondition;", "copy", "(Lcom/datadog/android/rum/model/ResourceEvent$Plan;Lcom/datadog/android/rum/model/ResourceEvent$SessionPrecondition;)Lcom/datadog/android/rum/model/ResourceEvent$DdSession;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lcom/google/gson/JsonElement;", "toJson", "()Lcom/google/gson/JsonElement;", "", "toString", "()Ljava/lang/String;", "Lcom/datadog/android/rum/model/ResourceEvent$Plan;", "getPlan", "Lcom/datadog/android/rum/model/ResourceEvent$SessionPrecondition;", "getSessionPrecondition", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes7.dex */
    public static final /* data */ class DdSession {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.datadog.android.rum.model.ResourceEvent.DdSession.Companion INSTANCE = new com.datadog.android.rum.model.ResourceEvent.DdSession.Companion(null);
        private final com.datadog.android.rum.model.ResourceEvent.Plan plan;
        private final com.datadog.android.rum.model.ResourceEvent.SessionPrecondition sessionPrecondition;

        public DdSession(com.datadog.android.rum.model.ResourceEvent.Plan plan, com.datadog.android.rum.model.ResourceEvent.SessionPrecondition sessionPrecondition) {
            this.plan = plan;
            this.sessionPrecondition = sessionPrecondition;
        }

        public /* synthetic */ DdSession(com.datadog.android.rum.model.ResourceEvent.Plan plan, com.datadog.android.rum.model.ResourceEvent.SessionPrecondition sessionPrecondition, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : plan, (i & 2) != 0 ? null : sessionPrecondition);
        }

        public final com.datadog.android.rum.model.ResourceEvent.Plan getPlan() {
            return this.plan;
        }

        public final com.datadog.android.rum.model.ResourceEvent.SessionPrecondition getSessionPrecondition() {
            return this.sessionPrecondition;
        }

        public final com.google.gson.JsonElement toJson() {
            com.google.gson.JsonObject jsonObject = new com.google.gson.JsonObject();
            com.datadog.android.rum.model.ResourceEvent.Plan plan = this.plan;
            if (plan != null) {
                jsonObject.add("plan", plan.toJson());
            }
            com.datadog.android.rum.model.ResourceEvent.SessionPrecondition sessionPrecondition = this.sessionPrecondition;
            if (sessionPrecondition != null) {
                jsonObject.add("session_precondition", sessionPrecondition.toJson());
            }
            return jsonObject;
        }

        @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/datadog/android/rum/model/ResourceEvent$DdSession$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/rum/model/ResourceEvent$DdSession;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/rum/model/ResourceEvent$DdSession;", "Lcom/google/gson/JsonObject;", "jsonObject", "fromJsonObject", "(Lcom/google/gson/JsonObject;)Lcom/datadog/android/rum/model/ResourceEvent$DdSession;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @kotlin.jvm.JvmStatic
            public final com.datadog.android.rum.model.ResourceEvent.DdSession fromJson(java.lang.String jsonString) throws com.google.gson.JsonParseException {
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
            public final com.datadog.android.rum.model.ResourceEvent.DdSession fromJsonObject(com.google.gson.JsonObject jsonObject) throws com.google.gson.JsonParseException {
                java.lang.String asString;
                java.lang.String asString2;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonObject, "");
                try {
                    com.google.gson.JsonElement jsonElement = jsonObject.get("plan");
                    com.datadog.android.rum.model.ResourceEvent.SessionPrecondition sessionPrecondition = null;
                    com.datadog.android.rum.model.ResourceEvent.Plan fromJson = (jsonElement == null || (asString2 = jsonElement.getAsString()) == null) ? null : com.datadog.android.rum.model.ResourceEvent.Plan.INSTANCE.fromJson(asString2);
                    com.google.gson.JsonElement jsonElement2 = jsonObject.get("session_precondition");
                    if (jsonElement2 != null && (asString = jsonElement2.getAsString()) != null) {
                        sessionPrecondition = com.datadog.android.rum.model.ResourceEvent.SessionPrecondition.INSTANCE.fromJson(asString);
                    }
                    return new com.datadog.android.rum.model.ResourceEvent.DdSession(fromJson, sessionPrecondition);
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
            com.datadog.android.rum.model.ResourceEvent.Plan plan = this.plan;
            com.datadog.android.rum.model.ResourceEvent.SessionPrecondition sessionPrecondition = this.sessionPrecondition;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("DdSession(plan=");
            sb.append(plan);
            sb.append(", sessionPrecondition=");
            sb.append(sessionPrecondition);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            com.datadog.android.rum.model.ResourceEvent.Plan plan = this.plan;
            int hashCode = plan == null ? 0 : plan.hashCode();
            com.datadog.android.rum.model.ResourceEvent.SessionPrecondition sessionPrecondition = this.sessionPrecondition;
            return (hashCode * 31) + (sessionPrecondition != null ? sessionPrecondition.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.datadog.android.rum.model.ResourceEvent.DdSession)) {
                return false;
            }
            com.datadog.android.rum.model.ResourceEvent.DdSession ddSession = (com.datadog.android.rum.model.ResourceEvent.DdSession) other;
            return this.plan == ddSession.plan && this.sessionPrecondition == ddSession.sessionPrecondition;
        }

        public final com.datadog.android.rum.model.ResourceEvent.DdSession copy(com.datadog.android.rum.model.ResourceEvent.Plan plan, com.datadog.android.rum.model.ResourceEvent.SessionPrecondition sessionPrecondition) {
            return new com.datadog.android.rum.model.ResourceEvent.DdSession(plan, sessionPrecondition);
        }

        /* renamed from: component2, reason: from getter */
        public final com.datadog.android.rum.model.ResourceEvent.SessionPrecondition getSessionPrecondition() {
            return this.sessionPrecondition;
        }

        /* renamed from: component1, reason: from getter */
        public final com.datadog.android.rum.model.ResourceEvent.Plan getPlan() {
            return this.plan;
        }

        @kotlin.jvm.JvmStatic
        public static final com.datadog.android.rum.model.ResourceEvent.DdSession fromJsonObject(com.google.gson.JsonObject jsonObject) throws com.google.gson.JsonParseException {
            return INSTANCE.fromJsonObject(jsonObject);
        }

        @kotlin.jvm.JvmStatic
        public static final com.datadog.android.rum.model.ResourceEvent.DdSession fromJson(java.lang.String str) throws com.google.gson.JsonParseException {
            return INSTANCE.fromJson(str);
        }

        public static /* synthetic */ com.datadog.android.rum.model.ResourceEvent.DdSession copy$default(com.datadog.android.rum.model.ResourceEvent.DdSession ddSession, com.datadog.android.rum.model.ResourceEvent.Plan plan, com.datadog.android.rum.model.ResourceEvent.SessionPrecondition sessionPrecondition, int i, java.lang.Object obj) {
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

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0004\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\b\u0018\u0000 \"2\u00020\u0001:\u0001\"B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\nJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\nJ>\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u001d\u001a\u0004\b\u001e\u0010\nR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001d\u001a\u0004\b\u001f\u0010\nR\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b \u0010\nR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001d\u001a\u0004\b!\u0010\n"}, d2 = {"Lcom/datadog/android/rum/model/ResourceEvent$Configuration;", "", "", "sessionSampleRate", "sessionReplaySampleRate", "profilingSampleRate", "traceSampleRate", "<init>", "(Ljava/lang/Number;Ljava/lang/Number;Ljava/lang/Number;Ljava/lang/Number;)V", "component1", "()Ljava/lang/Number;", "component2", "component3", "component4", "copy", "(Ljava/lang/Number;Ljava/lang/Number;Ljava/lang/Number;Ljava/lang/Number;)Lcom/datadog/android/rum/model/ResourceEvent$Configuration;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lcom/google/gson/JsonElement;", "toJson", "()Lcom/google/gson/JsonElement;", "", "toString", "()Ljava/lang/String;", "Ljava/lang/Number;", "getProfilingSampleRate", "getSessionReplaySampleRate", "getSessionSampleRate", "getTraceSampleRate", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes7.dex */
    public static final /* data */ class Configuration {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.datadog.android.rum.model.ResourceEvent.Configuration.Companion INSTANCE = new com.datadog.android.rum.model.ResourceEvent.Configuration.Companion(null);
        private final java.lang.Number profilingSampleRate;
        private final java.lang.Number sessionReplaySampleRate;
        private final java.lang.Number sessionSampleRate;
        private final java.lang.Number traceSampleRate;

        public Configuration(java.lang.Number number, java.lang.Number number2, java.lang.Number number3, java.lang.Number number4) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(number, "");
            this.sessionSampleRate = number;
            this.sessionReplaySampleRate = number2;
            this.profilingSampleRate = number3;
            this.traceSampleRate = number4;
        }

        public /* synthetic */ Configuration(java.lang.Number number, java.lang.Number number2, java.lang.Number number3, java.lang.Number number4, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(number, (i & 2) != 0 ? null : number2, (i & 4) != 0 ? null : number3, (i & 8) != 0 ? null : number4);
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
            return jsonObject;
        }

        @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/datadog/android/rum/model/ResourceEvent$Configuration$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/rum/model/ResourceEvent$Configuration;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/rum/model/ResourceEvent$Configuration;", "Lcom/google/gson/JsonObject;", "jsonObject", "fromJsonObject", "(Lcom/google/gson/JsonObject;)Lcom/datadog/android/rum/model/ResourceEvent$Configuration;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @kotlin.jvm.JvmStatic
            public final com.datadog.android.rum.model.ResourceEvent.Configuration fromJson(java.lang.String jsonString) throws com.google.gson.JsonParseException {
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
            public final com.datadog.android.rum.model.ResourceEvent.Configuration fromJsonObject(com.google.gson.JsonObject jsonObject) throws com.google.gson.JsonParseException {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonObject, "");
                try {
                    java.lang.Number asNumber = jsonObject.get("session_sample_rate").getAsNumber();
                    com.google.gson.JsonElement jsonElement = jsonObject.get("session_replay_sample_rate");
                    java.lang.Number asNumber2 = jsonElement != null ? jsonElement.getAsNumber() : null;
                    com.google.gson.JsonElement jsonElement2 = jsonObject.get("profiling_sample_rate");
                    java.lang.Number asNumber3 = jsonElement2 != null ? jsonElement2.getAsNumber() : null;
                    com.google.gson.JsonElement jsonElement3 = jsonObject.get("trace_sample_rate");
                    java.lang.Number asNumber4 = jsonElement3 != null ? jsonElement3.getAsNumber() : null;
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asNumber, "");
                    return new com.datadog.android.rum.model.ResourceEvent.Configuration(asNumber, asNumber2, asNumber3, asNumber4);
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
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Configuration(sessionSampleRate=");
            sb.append(number);
            sb.append(", sessionReplaySampleRate=");
            sb.append(number2);
            sb.append(", profilingSampleRate=");
            sb.append(number3);
            sb.append(", traceSampleRate=");
            sb.append(number4);
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
            return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (number3 != null ? number3.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.datadog.android.rum.model.ResourceEvent.Configuration)) {
                return false;
            }
            com.datadog.android.rum.model.ResourceEvent.Configuration configuration = (com.datadog.android.rum.model.ResourceEvent.Configuration) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.sessionSampleRate, configuration.sessionSampleRate) && kotlin.jvm.internal.Intrinsics.areEqual(this.sessionReplaySampleRate, configuration.sessionReplaySampleRate) && kotlin.jvm.internal.Intrinsics.areEqual(this.profilingSampleRate, configuration.profilingSampleRate) && kotlin.jvm.internal.Intrinsics.areEqual(this.traceSampleRate, configuration.traceSampleRate);
        }

        public final com.datadog.android.rum.model.ResourceEvent.Configuration copy(java.lang.Number sessionSampleRate, java.lang.Number sessionReplaySampleRate, java.lang.Number profilingSampleRate, java.lang.Number traceSampleRate) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sessionSampleRate, "");
            return new com.datadog.android.rum.model.ResourceEvent.Configuration(sessionSampleRate, sessionReplaySampleRate, profilingSampleRate, traceSampleRate);
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
        public static final com.datadog.android.rum.model.ResourceEvent.Configuration fromJsonObject(com.google.gson.JsonObject jsonObject) throws com.google.gson.JsonParseException {
            return INSTANCE.fromJsonObject(jsonObject);
        }

        @kotlin.jvm.JvmStatic
        public static final com.datadog.android.rum.model.ResourceEvent.Configuration fromJson(java.lang.String str) throws com.google.gson.JsonParseException {
            return INSTANCE.fromJson(str);
        }

        public static /* synthetic */ com.datadog.android.rum.model.ResourceEvent.Configuration copy$default(com.datadog.android.rum.model.ResourceEvent.Configuration configuration, java.lang.Number number, java.lang.Number number2, java.lang.Number number3, java.lang.Number number4, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                number = configuration.sessionSampleRate;
            }
            if ((i & 2) != 0) {
                number2 = configuration.sessionReplaySampleRate;
            }
            if ((i & 4) != 0) {
                number3 = configuration.profilingSampleRate;
            }
            if ((i & 8) != 0) {
                number4 = configuration.traceSampleRate;
            }
            return configuration.copy(number, number2, number3, number4);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/datadog/android/rum/model/ResourceEvent$ContainerView;", "", "", "id", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/datadog/android/rum/model/ResourceEvent$ContainerView;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lcom/google/gson/JsonElement;", "toJson", "()Lcom/google/gson/JsonElement;", "toString", "Ljava/lang/String;", "getId", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes7.dex */
    public static final /* data */ class ContainerView {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.datadog.android.rum.model.ResourceEvent.ContainerView.Companion INSTANCE = new com.datadog.android.rum.model.ResourceEvent.ContainerView.Companion(null);
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

        @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/datadog/android/rum/model/ResourceEvent$ContainerView$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/rum/model/ResourceEvent$ContainerView;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/rum/model/ResourceEvent$ContainerView;", "Lcom/google/gson/JsonObject;", "jsonObject", "fromJsonObject", "(Lcom/google/gson/JsonObject;)Lcom/datadog/android/rum/model/ResourceEvent$ContainerView;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @kotlin.jvm.JvmStatic
            public final com.datadog.android.rum.model.ResourceEvent.ContainerView fromJson(java.lang.String jsonString) throws com.google.gson.JsonParseException {
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
            public final com.datadog.android.rum.model.ResourceEvent.ContainerView fromJsonObject(com.google.gson.JsonObject jsonObject) throws com.google.gson.JsonParseException {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonObject, "");
                try {
                    java.lang.String asString = jsonObject.get("id").getAsString();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asString, "");
                    return new com.datadog.android.rum.model.ResourceEvent.ContainerView(asString);
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
            return (other instanceof com.datadog.android.rum.model.ResourceEvent.ContainerView) && kotlin.jvm.internal.Intrinsics.areEqual(this.id, ((com.datadog.android.rum.model.ResourceEvent.ContainerView) other).id);
        }

        public final com.datadog.android.rum.model.ResourceEvent.ContainerView copy(java.lang.String id) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
            return new com.datadog.android.rum.model.ResourceEvent.ContainerView(id);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getId() {
            return this.id;
        }

        @kotlin.jvm.JvmStatic
        public static final com.datadog.android.rum.model.ResourceEvent.ContainerView fromJsonObject(com.google.gson.JsonObject jsonObject) throws com.google.gson.JsonParseException {
            return INSTANCE.fromJsonObject(jsonObject);
        }

        @kotlin.jvm.JvmStatic
        public static final com.datadog.android.rum.model.ResourceEvent.ContainerView fromJson(java.lang.String str) throws com.google.gson.JsonParseException {
            return INSTANCE.fromJson(str);
        }

        public static /* synthetic */ com.datadog.android.rum.model.ResourceEvent.ContainerView copy$default(com.datadog.android.rum.model.ResourceEvent.ContainerView containerView, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = containerView.id;
            }
            return containerView.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001b\u0010\b"}, d2 = {"Lcom/datadog/android/rum/model/ResourceEvent$Worker;", "", "", "duration", com.adobe.marketing.mobile.internal.CoreConstants.EventDataKeys.Lifecycle.LIFECYCLE_START, "<init>", "(JJ)V", "component1", "()J", "component2", "copy", "(JJ)Lcom/datadog/android/rum/model/ResourceEvent$Worker;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lcom/google/gson/JsonElement;", "toJson", "()Lcom/google/gson/JsonElement;", "", "toString", "()Ljava/lang/String;", "J", "getDuration", "getStart", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final /* data */ class Worker {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.datadog.android.rum.model.ResourceEvent.Worker.Companion INSTANCE = new com.datadog.android.rum.model.ResourceEvent.Worker.Companion(null);
        private final long duration;
        private final long start;

        public Worker(long j, long j2) {
            this.duration = j;
            this.start = j2;
        }

        public final long getDuration() {
            return this.duration;
        }

        public final long getStart() {
            return this.start;
        }

        public final com.google.gson.JsonElement toJson() {
            com.google.gson.JsonObject jsonObject = new com.google.gson.JsonObject();
            jsonObject.addProperty("duration", java.lang.Long.valueOf(this.duration));
            jsonObject.addProperty(com.adobe.marketing.mobile.internal.CoreConstants.EventDataKeys.Lifecycle.LIFECYCLE_START, java.lang.Long.valueOf(this.start));
            return jsonObject;
        }

        @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/datadog/android/rum/model/ResourceEvent$Worker$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/rum/model/ResourceEvent$Worker;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/rum/model/ResourceEvent$Worker;", "Lcom/google/gson/JsonObject;", "jsonObject", "fromJsonObject", "(Lcom/google/gson/JsonObject;)Lcom/datadog/android/rum/model/ResourceEvent$Worker;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @kotlin.jvm.JvmStatic
            public final com.datadog.android.rum.model.ResourceEvent.Worker fromJson(java.lang.String jsonString) throws com.google.gson.JsonParseException {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonString, "");
                try {
                    com.google.gson.JsonObject asJsonObject = com.google.gson.JsonParser.parseString(jsonString).getAsJsonObject();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asJsonObject, "");
                    return fromJsonObject(asJsonObject);
                } catch (java.lang.IllegalStateException e) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type Worker", e);
                }
            }

            @kotlin.jvm.JvmStatic
            public final com.datadog.android.rum.model.ResourceEvent.Worker fromJsonObject(com.google.gson.JsonObject jsonObject) throws com.google.gson.JsonParseException {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonObject, "");
                try {
                    return new com.datadog.android.rum.model.ResourceEvent.Worker(jsonObject.get("duration").getAsLong(), jsonObject.get(com.adobe.marketing.mobile.internal.CoreConstants.EventDataKeys.Lifecycle.LIFECYCLE_START).getAsLong());
                } catch (java.lang.IllegalStateException e) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type Worker", e);
                } catch (java.lang.NullPointerException e2) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type Worker", e2);
                } catch (java.lang.NumberFormatException e3) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type Worker", e3);
                }
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public final java.lang.String toString() {
            long j = this.duration;
            long j2 = this.start;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Worker(duration=");
            sb.append(j);
            sb.append(", start=");
            sb.append(j2);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (java.lang.Long.hashCode(this.duration) * 31) + java.lang.Long.hashCode(this.start);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.datadog.android.rum.model.ResourceEvent.Worker)) {
                return false;
            }
            com.datadog.android.rum.model.ResourceEvent.Worker worker = (com.datadog.android.rum.model.ResourceEvent.Worker) other;
            return this.duration == worker.duration && this.start == worker.start;
        }

        public final com.datadog.android.rum.model.ResourceEvent.Worker copy(long duration, long start) {
            return new com.datadog.android.rum.model.ResourceEvent.Worker(duration, start);
        }

        /* renamed from: component2, reason: from getter */
        public final long getStart() {
            return this.start;
        }

        /* renamed from: component1, reason: from getter */
        public final long getDuration() {
            return this.duration;
        }

        @kotlin.jvm.JvmStatic
        public static final com.datadog.android.rum.model.ResourceEvent.Worker fromJsonObject(com.google.gson.JsonObject jsonObject) throws com.google.gson.JsonParseException {
            return INSTANCE.fromJsonObject(jsonObject);
        }

        @kotlin.jvm.JvmStatic
        public static final com.datadog.android.rum.model.ResourceEvent.Worker fromJson(java.lang.String str) throws com.google.gson.JsonParseException {
            return INSTANCE.fromJson(str);
        }

        public static /* synthetic */ com.datadog.android.rum.model.ResourceEvent.Worker copy$default(com.datadog.android.rum.model.ResourceEvent.Worker worker, long j, long j2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                j = worker.duration;
            }
            if ((i & 2) != 0) {
                j2 = worker.start;
            }
            return worker.copy(j, j2);
        }
    }

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001b\u0010\b"}, d2 = {"Lcom/datadog/android/rum/model/ResourceEvent$Redirect;", "", "", "duration", com.adobe.marketing.mobile.internal.CoreConstants.EventDataKeys.Lifecycle.LIFECYCLE_START, "<init>", "(JJ)V", "component1", "()J", "component2", "copy", "(JJ)Lcom/datadog/android/rum/model/ResourceEvent$Redirect;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lcom/google/gson/JsonElement;", "toJson", "()Lcom/google/gson/JsonElement;", "", "toString", "()Ljava/lang/String;", "J", "getDuration", "getStart", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final /* data */ class Redirect {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.datadog.android.rum.model.ResourceEvent.Redirect.Companion INSTANCE = new com.datadog.android.rum.model.ResourceEvent.Redirect.Companion(null);
        private final long duration;
        private final long start;

        public Redirect(long j, long j2) {
            this.duration = j;
            this.start = j2;
        }

        public final long getDuration() {
            return this.duration;
        }

        public final long getStart() {
            return this.start;
        }

        public final com.google.gson.JsonElement toJson() {
            com.google.gson.JsonObject jsonObject = new com.google.gson.JsonObject();
            jsonObject.addProperty("duration", java.lang.Long.valueOf(this.duration));
            jsonObject.addProperty(com.adobe.marketing.mobile.internal.CoreConstants.EventDataKeys.Lifecycle.LIFECYCLE_START, java.lang.Long.valueOf(this.start));
            return jsonObject;
        }

        @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/datadog/android/rum/model/ResourceEvent$Redirect$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/rum/model/ResourceEvent$Redirect;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/rum/model/ResourceEvent$Redirect;", "Lcom/google/gson/JsonObject;", "jsonObject", "fromJsonObject", "(Lcom/google/gson/JsonObject;)Lcom/datadog/android/rum/model/ResourceEvent$Redirect;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @kotlin.jvm.JvmStatic
            public final com.datadog.android.rum.model.ResourceEvent.Redirect fromJson(java.lang.String jsonString) throws com.google.gson.JsonParseException {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonString, "");
                try {
                    com.google.gson.JsonObject asJsonObject = com.google.gson.JsonParser.parseString(jsonString).getAsJsonObject();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asJsonObject, "");
                    return fromJsonObject(asJsonObject);
                } catch (java.lang.IllegalStateException e) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type Redirect", e);
                }
            }

            @kotlin.jvm.JvmStatic
            public final com.datadog.android.rum.model.ResourceEvent.Redirect fromJsonObject(com.google.gson.JsonObject jsonObject) throws com.google.gson.JsonParseException {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonObject, "");
                try {
                    return new com.datadog.android.rum.model.ResourceEvent.Redirect(jsonObject.get("duration").getAsLong(), jsonObject.get(com.adobe.marketing.mobile.internal.CoreConstants.EventDataKeys.Lifecycle.LIFECYCLE_START).getAsLong());
                } catch (java.lang.IllegalStateException e) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type Redirect", e);
                } catch (java.lang.NullPointerException e2) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type Redirect", e2);
                } catch (java.lang.NumberFormatException e3) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type Redirect", e3);
                }
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public final java.lang.String toString() {
            long j = this.duration;
            long j2 = this.start;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Redirect(duration=");
            sb.append(j);
            sb.append(", start=");
            sb.append(j2);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (java.lang.Long.hashCode(this.duration) * 31) + java.lang.Long.hashCode(this.start);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.datadog.android.rum.model.ResourceEvent.Redirect)) {
                return false;
            }
            com.datadog.android.rum.model.ResourceEvent.Redirect redirect = (com.datadog.android.rum.model.ResourceEvent.Redirect) other;
            return this.duration == redirect.duration && this.start == redirect.start;
        }

        public final com.datadog.android.rum.model.ResourceEvent.Redirect copy(long duration, long start) {
            return new com.datadog.android.rum.model.ResourceEvent.Redirect(duration, start);
        }

        /* renamed from: component2, reason: from getter */
        public final long getStart() {
            return this.start;
        }

        /* renamed from: component1, reason: from getter */
        public final long getDuration() {
            return this.duration;
        }

        @kotlin.jvm.JvmStatic
        public static final com.datadog.android.rum.model.ResourceEvent.Redirect fromJsonObject(com.google.gson.JsonObject jsonObject) throws com.google.gson.JsonParseException {
            return INSTANCE.fromJsonObject(jsonObject);
        }

        @kotlin.jvm.JvmStatic
        public static final com.datadog.android.rum.model.ResourceEvent.Redirect fromJson(java.lang.String str) throws com.google.gson.JsonParseException {
            return INSTANCE.fromJson(str);
        }

        public static /* synthetic */ com.datadog.android.rum.model.ResourceEvent.Redirect copy$default(com.datadog.android.rum.model.ResourceEvent.Redirect redirect, long j, long j2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                j = redirect.duration;
            }
            if ((i & 2) != 0) {
                j2 = redirect.start;
            }
            return redirect.copy(j, j2);
        }
    }

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001b\u0010\b"}, d2 = {"Lcom/datadog/android/rum/model/ResourceEvent$Dns;", "", "", "duration", com.adobe.marketing.mobile.internal.CoreConstants.EventDataKeys.Lifecycle.LIFECYCLE_START, "<init>", "(JJ)V", "component1", "()J", "component2", "copy", "(JJ)Lcom/datadog/android/rum/model/ResourceEvent$Dns;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lcom/google/gson/JsonElement;", "toJson", "()Lcom/google/gson/JsonElement;", "", "toString", "()Ljava/lang/String;", "J", "getDuration", "getStart", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes7.dex */
    public static final /* data */ class Dns {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.datadog.android.rum.model.ResourceEvent.Dns.Companion INSTANCE = new com.datadog.android.rum.model.ResourceEvent.Dns.Companion(null);
        private final long duration;
        private final long start;

        public Dns(long j, long j2) {
            this.duration = j;
            this.start = j2;
        }

        public final long getDuration() {
            return this.duration;
        }

        public final long getStart() {
            return this.start;
        }

        public final com.google.gson.JsonElement toJson() {
            com.google.gson.JsonObject jsonObject = new com.google.gson.JsonObject();
            jsonObject.addProperty("duration", java.lang.Long.valueOf(this.duration));
            jsonObject.addProperty(com.adobe.marketing.mobile.internal.CoreConstants.EventDataKeys.Lifecycle.LIFECYCLE_START, java.lang.Long.valueOf(this.start));
            return jsonObject;
        }

        @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/datadog/android/rum/model/ResourceEvent$Dns$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/rum/model/ResourceEvent$Dns;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/rum/model/ResourceEvent$Dns;", "Lcom/google/gson/JsonObject;", "jsonObject", "fromJsonObject", "(Lcom/google/gson/JsonObject;)Lcom/datadog/android/rum/model/ResourceEvent$Dns;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @kotlin.jvm.JvmStatic
            public final com.datadog.android.rum.model.ResourceEvent.Dns fromJson(java.lang.String jsonString) throws com.google.gson.JsonParseException {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonString, "");
                try {
                    com.google.gson.JsonObject asJsonObject = com.google.gson.JsonParser.parseString(jsonString).getAsJsonObject();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asJsonObject, "");
                    return fromJsonObject(asJsonObject);
                } catch (java.lang.IllegalStateException e) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type Dns", e);
                }
            }

            @kotlin.jvm.JvmStatic
            public final com.datadog.android.rum.model.ResourceEvent.Dns fromJsonObject(com.google.gson.JsonObject jsonObject) throws com.google.gson.JsonParseException {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonObject, "");
                try {
                    return new com.datadog.android.rum.model.ResourceEvent.Dns(jsonObject.get("duration").getAsLong(), jsonObject.get(com.adobe.marketing.mobile.internal.CoreConstants.EventDataKeys.Lifecycle.LIFECYCLE_START).getAsLong());
                } catch (java.lang.IllegalStateException e) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type Dns", e);
                } catch (java.lang.NullPointerException e2) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type Dns", e2);
                } catch (java.lang.NumberFormatException e3) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type Dns", e3);
                }
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public final java.lang.String toString() {
            long j = this.duration;
            long j2 = this.start;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Dns(duration=");
            sb.append(j);
            sb.append(", start=");
            sb.append(j2);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (java.lang.Long.hashCode(this.duration) * 31) + java.lang.Long.hashCode(this.start);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.datadog.android.rum.model.ResourceEvent.Dns)) {
                return false;
            }
            com.datadog.android.rum.model.ResourceEvent.Dns dns = (com.datadog.android.rum.model.ResourceEvent.Dns) other;
            return this.duration == dns.duration && this.start == dns.start;
        }

        public final com.datadog.android.rum.model.ResourceEvent.Dns copy(long duration, long start) {
            return new com.datadog.android.rum.model.ResourceEvent.Dns(duration, start);
        }

        /* renamed from: component2, reason: from getter */
        public final long getStart() {
            return this.start;
        }

        /* renamed from: component1, reason: from getter */
        public final long getDuration() {
            return this.duration;
        }

        @kotlin.jvm.JvmStatic
        public static final com.datadog.android.rum.model.ResourceEvent.Dns fromJsonObject(com.google.gson.JsonObject jsonObject) throws com.google.gson.JsonParseException {
            return INSTANCE.fromJsonObject(jsonObject);
        }

        @kotlin.jvm.JvmStatic
        public static final com.datadog.android.rum.model.ResourceEvent.Dns fromJson(java.lang.String str) throws com.google.gson.JsonParseException {
            return INSTANCE.fromJson(str);
        }

        public static /* synthetic */ com.datadog.android.rum.model.ResourceEvent.Dns copy$default(com.datadog.android.rum.model.ResourceEvent.Dns dns, long j, long j2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                j = dns.duration;
            }
            if ((i & 2) != 0) {
                j2 = dns.start;
            }
            return dns.copy(j, j2);
        }
    }

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001b\u0010\b"}, d2 = {"Lcom/datadog/android/rum/model/ResourceEvent$Connect;", "", "", "duration", com.adobe.marketing.mobile.internal.CoreConstants.EventDataKeys.Lifecycle.LIFECYCLE_START, "<init>", "(JJ)V", "component1", "()J", "component2", "copy", "(JJ)Lcom/datadog/android/rum/model/ResourceEvent$Connect;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lcom/google/gson/JsonElement;", "toJson", "()Lcom/google/gson/JsonElement;", "", "toString", "()Ljava/lang/String;", "J", "getDuration", "getStart", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes7.dex */
    public static final /* data */ class Connect {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.datadog.android.rum.model.ResourceEvent.Connect.Companion INSTANCE = new com.datadog.android.rum.model.ResourceEvent.Connect.Companion(null);
        private final long duration;
        private final long start;

        public Connect(long j, long j2) {
            this.duration = j;
            this.start = j2;
        }

        public final long getDuration() {
            return this.duration;
        }

        public final long getStart() {
            return this.start;
        }

        public final com.google.gson.JsonElement toJson() {
            com.google.gson.JsonObject jsonObject = new com.google.gson.JsonObject();
            jsonObject.addProperty("duration", java.lang.Long.valueOf(this.duration));
            jsonObject.addProperty(com.adobe.marketing.mobile.internal.CoreConstants.EventDataKeys.Lifecycle.LIFECYCLE_START, java.lang.Long.valueOf(this.start));
            return jsonObject;
        }

        @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/datadog/android/rum/model/ResourceEvent$Connect$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/rum/model/ResourceEvent$Connect;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/rum/model/ResourceEvent$Connect;", "Lcom/google/gson/JsonObject;", "jsonObject", "fromJsonObject", "(Lcom/google/gson/JsonObject;)Lcom/datadog/android/rum/model/ResourceEvent$Connect;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @kotlin.jvm.JvmStatic
            public final com.datadog.android.rum.model.ResourceEvent.Connect fromJson(java.lang.String jsonString) throws com.google.gson.JsonParseException {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonString, "");
                try {
                    com.google.gson.JsonObject asJsonObject = com.google.gson.JsonParser.parseString(jsonString).getAsJsonObject();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asJsonObject, "");
                    return fromJsonObject(asJsonObject);
                } catch (java.lang.IllegalStateException e) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type Connect", e);
                }
            }

            @kotlin.jvm.JvmStatic
            public final com.datadog.android.rum.model.ResourceEvent.Connect fromJsonObject(com.google.gson.JsonObject jsonObject) throws com.google.gson.JsonParseException {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonObject, "");
                try {
                    return new com.datadog.android.rum.model.ResourceEvent.Connect(jsonObject.get("duration").getAsLong(), jsonObject.get(com.adobe.marketing.mobile.internal.CoreConstants.EventDataKeys.Lifecycle.LIFECYCLE_START).getAsLong());
                } catch (java.lang.IllegalStateException e) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type Connect", e);
                } catch (java.lang.NullPointerException e2) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type Connect", e2);
                } catch (java.lang.NumberFormatException e3) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type Connect", e3);
                }
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public final java.lang.String toString() {
            long j = this.duration;
            long j2 = this.start;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Connect(duration=");
            sb.append(j);
            sb.append(", start=");
            sb.append(j2);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (java.lang.Long.hashCode(this.duration) * 31) + java.lang.Long.hashCode(this.start);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.datadog.android.rum.model.ResourceEvent.Connect)) {
                return false;
            }
            com.datadog.android.rum.model.ResourceEvent.Connect connect = (com.datadog.android.rum.model.ResourceEvent.Connect) other;
            return this.duration == connect.duration && this.start == connect.start;
        }

        public final com.datadog.android.rum.model.ResourceEvent.Connect copy(long duration, long start) {
            return new com.datadog.android.rum.model.ResourceEvent.Connect(duration, start);
        }

        /* renamed from: component2, reason: from getter */
        public final long getStart() {
            return this.start;
        }

        /* renamed from: component1, reason: from getter */
        public final long getDuration() {
            return this.duration;
        }

        @kotlin.jvm.JvmStatic
        public static final com.datadog.android.rum.model.ResourceEvent.Connect fromJsonObject(com.google.gson.JsonObject jsonObject) throws com.google.gson.JsonParseException {
            return INSTANCE.fromJsonObject(jsonObject);
        }

        @kotlin.jvm.JvmStatic
        public static final com.datadog.android.rum.model.ResourceEvent.Connect fromJson(java.lang.String str) throws com.google.gson.JsonParseException {
            return INSTANCE.fromJson(str);
        }

        public static /* synthetic */ com.datadog.android.rum.model.ResourceEvent.Connect copy$default(com.datadog.android.rum.model.ResourceEvent.Connect connect, long j, long j2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                j = connect.duration;
            }
            if ((i & 2) != 0) {
                j2 = connect.start;
            }
            return connect.copy(j, j2);
        }
    }

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001b\u0010\b"}, d2 = {"Lcom/datadog/android/rum/model/ResourceEvent$Ssl;", "", "", "duration", com.adobe.marketing.mobile.internal.CoreConstants.EventDataKeys.Lifecycle.LIFECYCLE_START, "<init>", "(JJ)V", "component1", "()J", "component2", "copy", "(JJ)Lcom/datadog/android/rum/model/ResourceEvent$Ssl;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lcom/google/gson/JsonElement;", "toJson", "()Lcom/google/gson/JsonElement;", "", "toString", "()Ljava/lang/String;", "J", "getDuration", "getStart", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final /* data */ class Ssl {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.datadog.android.rum.model.ResourceEvent.Ssl.Companion INSTANCE = new com.datadog.android.rum.model.ResourceEvent.Ssl.Companion(null);
        private final long duration;
        private final long start;

        public Ssl(long j, long j2) {
            this.duration = j;
            this.start = j2;
        }

        public final long getDuration() {
            return this.duration;
        }

        public final long getStart() {
            return this.start;
        }

        public final com.google.gson.JsonElement toJson() {
            com.google.gson.JsonObject jsonObject = new com.google.gson.JsonObject();
            jsonObject.addProperty("duration", java.lang.Long.valueOf(this.duration));
            jsonObject.addProperty(com.adobe.marketing.mobile.internal.CoreConstants.EventDataKeys.Lifecycle.LIFECYCLE_START, java.lang.Long.valueOf(this.start));
            return jsonObject;
        }

        @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/datadog/android/rum/model/ResourceEvent$Ssl$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/rum/model/ResourceEvent$Ssl;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/rum/model/ResourceEvent$Ssl;", "Lcom/google/gson/JsonObject;", "jsonObject", "fromJsonObject", "(Lcom/google/gson/JsonObject;)Lcom/datadog/android/rum/model/ResourceEvent$Ssl;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @kotlin.jvm.JvmStatic
            public final com.datadog.android.rum.model.ResourceEvent.Ssl fromJson(java.lang.String jsonString) throws com.google.gson.JsonParseException {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonString, "");
                try {
                    com.google.gson.JsonObject asJsonObject = com.google.gson.JsonParser.parseString(jsonString).getAsJsonObject();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asJsonObject, "");
                    return fromJsonObject(asJsonObject);
                } catch (java.lang.IllegalStateException e) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type Ssl", e);
                }
            }

            @kotlin.jvm.JvmStatic
            public final com.datadog.android.rum.model.ResourceEvent.Ssl fromJsonObject(com.google.gson.JsonObject jsonObject) throws com.google.gson.JsonParseException {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonObject, "");
                try {
                    return new com.datadog.android.rum.model.ResourceEvent.Ssl(jsonObject.get("duration").getAsLong(), jsonObject.get(com.adobe.marketing.mobile.internal.CoreConstants.EventDataKeys.Lifecycle.LIFECYCLE_START).getAsLong());
                } catch (java.lang.IllegalStateException e) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type Ssl", e);
                } catch (java.lang.NullPointerException e2) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type Ssl", e2);
                } catch (java.lang.NumberFormatException e3) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type Ssl", e3);
                }
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public final java.lang.String toString() {
            long j = this.duration;
            long j2 = this.start;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Ssl(duration=");
            sb.append(j);
            sb.append(", start=");
            sb.append(j2);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (java.lang.Long.hashCode(this.duration) * 31) + java.lang.Long.hashCode(this.start);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.datadog.android.rum.model.ResourceEvent.Ssl)) {
                return false;
            }
            com.datadog.android.rum.model.ResourceEvent.Ssl ssl = (com.datadog.android.rum.model.ResourceEvent.Ssl) other;
            return this.duration == ssl.duration && this.start == ssl.start;
        }

        public final com.datadog.android.rum.model.ResourceEvent.Ssl copy(long duration, long start) {
            return new com.datadog.android.rum.model.ResourceEvent.Ssl(duration, start);
        }

        /* renamed from: component2, reason: from getter */
        public final long getStart() {
            return this.start;
        }

        /* renamed from: component1, reason: from getter */
        public final long getDuration() {
            return this.duration;
        }

        @kotlin.jvm.JvmStatic
        public static final com.datadog.android.rum.model.ResourceEvent.Ssl fromJsonObject(com.google.gson.JsonObject jsonObject) throws com.google.gson.JsonParseException {
            return INSTANCE.fromJsonObject(jsonObject);
        }

        @kotlin.jvm.JvmStatic
        public static final com.datadog.android.rum.model.ResourceEvent.Ssl fromJson(java.lang.String str) throws com.google.gson.JsonParseException {
            return INSTANCE.fromJson(str);
        }

        public static /* synthetic */ com.datadog.android.rum.model.ResourceEvent.Ssl copy$default(com.datadog.android.rum.model.ResourceEvent.Ssl ssl, long j, long j2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                j = ssl.duration;
            }
            if ((i & 2) != 0) {
                j2 = ssl.start;
            }
            return ssl.copy(j, j2);
        }
    }

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001b\u0010\b"}, d2 = {"Lcom/datadog/android/rum/model/ResourceEvent$FirstByte;", "", "", "duration", com.adobe.marketing.mobile.internal.CoreConstants.EventDataKeys.Lifecycle.LIFECYCLE_START, "<init>", "(JJ)V", "component1", "()J", "component2", "copy", "(JJ)Lcom/datadog/android/rum/model/ResourceEvent$FirstByte;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lcom/google/gson/JsonElement;", "toJson", "()Lcom/google/gson/JsonElement;", "", "toString", "()Ljava/lang/String;", "J", "getDuration", "getStart", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes7.dex */
    public static final /* data */ class FirstByte {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.datadog.android.rum.model.ResourceEvent.FirstByte.Companion INSTANCE = new com.datadog.android.rum.model.ResourceEvent.FirstByte.Companion(null);
        private final long duration;
        private final long start;

        public FirstByte(long j, long j2) {
            this.duration = j;
            this.start = j2;
        }

        public final long getDuration() {
            return this.duration;
        }

        public final long getStart() {
            return this.start;
        }

        public final com.google.gson.JsonElement toJson() {
            com.google.gson.JsonObject jsonObject = new com.google.gson.JsonObject();
            jsonObject.addProperty("duration", java.lang.Long.valueOf(this.duration));
            jsonObject.addProperty(com.adobe.marketing.mobile.internal.CoreConstants.EventDataKeys.Lifecycle.LIFECYCLE_START, java.lang.Long.valueOf(this.start));
            return jsonObject;
        }

        @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/datadog/android/rum/model/ResourceEvent$FirstByte$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/rum/model/ResourceEvent$FirstByte;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/rum/model/ResourceEvent$FirstByte;", "Lcom/google/gson/JsonObject;", "jsonObject", "fromJsonObject", "(Lcom/google/gson/JsonObject;)Lcom/datadog/android/rum/model/ResourceEvent$FirstByte;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @kotlin.jvm.JvmStatic
            public final com.datadog.android.rum.model.ResourceEvent.FirstByte fromJson(java.lang.String jsonString) throws com.google.gson.JsonParseException {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonString, "");
                try {
                    com.google.gson.JsonObject asJsonObject = com.google.gson.JsonParser.parseString(jsonString).getAsJsonObject();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asJsonObject, "");
                    return fromJsonObject(asJsonObject);
                } catch (java.lang.IllegalStateException e) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type FirstByte", e);
                }
            }

            @kotlin.jvm.JvmStatic
            public final com.datadog.android.rum.model.ResourceEvent.FirstByte fromJsonObject(com.google.gson.JsonObject jsonObject) throws com.google.gson.JsonParseException {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonObject, "");
                try {
                    return new com.datadog.android.rum.model.ResourceEvent.FirstByte(jsonObject.get("duration").getAsLong(), jsonObject.get(com.adobe.marketing.mobile.internal.CoreConstants.EventDataKeys.Lifecycle.LIFECYCLE_START).getAsLong());
                } catch (java.lang.IllegalStateException e) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type FirstByte", e);
                } catch (java.lang.NullPointerException e2) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type FirstByte", e2);
                } catch (java.lang.NumberFormatException e3) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type FirstByte", e3);
                }
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public final java.lang.String toString() {
            long j = this.duration;
            long j2 = this.start;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("FirstByte(duration=");
            sb.append(j);
            sb.append(", start=");
            sb.append(j2);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (java.lang.Long.hashCode(this.duration) * 31) + java.lang.Long.hashCode(this.start);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.datadog.android.rum.model.ResourceEvent.FirstByte)) {
                return false;
            }
            com.datadog.android.rum.model.ResourceEvent.FirstByte firstByte = (com.datadog.android.rum.model.ResourceEvent.FirstByte) other;
            return this.duration == firstByte.duration && this.start == firstByte.start;
        }

        public final com.datadog.android.rum.model.ResourceEvent.FirstByte copy(long duration, long start) {
            return new com.datadog.android.rum.model.ResourceEvent.FirstByte(duration, start);
        }

        /* renamed from: component2, reason: from getter */
        public final long getStart() {
            return this.start;
        }

        /* renamed from: component1, reason: from getter */
        public final long getDuration() {
            return this.duration;
        }

        @kotlin.jvm.JvmStatic
        public static final com.datadog.android.rum.model.ResourceEvent.FirstByte fromJsonObject(com.google.gson.JsonObject jsonObject) throws com.google.gson.JsonParseException {
            return INSTANCE.fromJsonObject(jsonObject);
        }

        @kotlin.jvm.JvmStatic
        public static final com.datadog.android.rum.model.ResourceEvent.FirstByte fromJson(java.lang.String str) throws com.google.gson.JsonParseException {
            return INSTANCE.fromJson(str);
        }

        public static /* synthetic */ com.datadog.android.rum.model.ResourceEvent.FirstByte copy$default(com.datadog.android.rum.model.ResourceEvent.FirstByte firstByte, long j, long j2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                j = firstByte.duration;
            }
            if ((i & 2) != 0) {
                j2 = firstByte.start;
            }
            return firstByte.copy(j, j2);
        }
    }

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001b\u0010\b"}, d2 = {"Lcom/datadog/android/rum/model/ResourceEvent$Download;", "", "", "duration", com.adobe.marketing.mobile.internal.CoreConstants.EventDataKeys.Lifecycle.LIFECYCLE_START, "<init>", "(JJ)V", "component1", "()J", "component2", "copy", "(JJ)Lcom/datadog/android/rum/model/ResourceEvent$Download;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lcom/google/gson/JsonElement;", "toJson", "()Lcom/google/gson/JsonElement;", "", "toString", "()Ljava/lang/String;", "J", "getDuration", "getStart", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes7.dex */
    public static final /* data */ class Download {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.datadog.android.rum.model.ResourceEvent.Download.Companion INSTANCE = new com.datadog.android.rum.model.ResourceEvent.Download.Companion(null);
        private final long duration;
        private final long start;

        public Download(long j, long j2) {
            this.duration = j;
            this.start = j2;
        }

        public final long getDuration() {
            return this.duration;
        }

        public final long getStart() {
            return this.start;
        }

        public final com.google.gson.JsonElement toJson() {
            com.google.gson.JsonObject jsonObject = new com.google.gson.JsonObject();
            jsonObject.addProperty("duration", java.lang.Long.valueOf(this.duration));
            jsonObject.addProperty(com.adobe.marketing.mobile.internal.CoreConstants.EventDataKeys.Lifecycle.LIFECYCLE_START, java.lang.Long.valueOf(this.start));
            return jsonObject;
        }

        @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/datadog/android/rum/model/ResourceEvent$Download$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/rum/model/ResourceEvent$Download;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/rum/model/ResourceEvent$Download;", "Lcom/google/gson/JsonObject;", "jsonObject", "fromJsonObject", "(Lcom/google/gson/JsonObject;)Lcom/datadog/android/rum/model/ResourceEvent$Download;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @kotlin.jvm.JvmStatic
            public final com.datadog.android.rum.model.ResourceEvent.Download fromJson(java.lang.String jsonString) throws com.google.gson.JsonParseException {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonString, "");
                try {
                    com.google.gson.JsonObject asJsonObject = com.google.gson.JsonParser.parseString(jsonString).getAsJsonObject();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asJsonObject, "");
                    return fromJsonObject(asJsonObject);
                } catch (java.lang.IllegalStateException e) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type Download", e);
                }
            }

            @kotlin.jvm.JvmStatic
            public final com.datadog.android.rum.model.ResourceEvent.Download fromJsonObject(com.google.gson.JsonObject jsonObject) throws com.google.gson.JsonParseException {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonObject, "");
                try {
                    return new com.datadog.android.rum.model.ResourceEvent.Download(jsonObject.get("duration").getAsLong(), jsonObject.get(com.adobe.marketing.mobile.internal.CoreConstants.EventDataKeys.Lifecycle.LIFECYCLE_START).getAsLong());
                } catch (java.lang.IllegalStateException e) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type Download", e);
                } catch (java.lang.NullPointerException e2) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type Download", e2);
                } catch (java.lang.NumberFormatException e3) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type Download", e3);
                }
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public final java.lang.String toString() {
            long j = this.duration;
            long j2 = this.start;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Download(duration=");
            sb.append(j);
            sb.append(", start=");
            sb.append(j2);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (java.lang.Long.hashCode(this.duration) * 31) + java.lang.Long.hashCode(this.start);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.datadog.android.rum.model.ResourceEvent.Download)) {
                return false;
            }
            com.datadog.android.rum.model.ResourceEvent.Download download = (com.datadog.android.rum.model.ResourceEvent.Download) other;
            return this.duration == download.duration && this.start == download.start;
        }

        public final com.datadog.android.rum.model.ResourceEvent.Download copy(long duration, long start) {
            return new com.datadog.android.rum.model.ResourceEvent.Download(duration, start);
        }

        /* renamed from: component2, reason: from getter */
        public final long getStart() {
            return this.start;
        }

        /* renamed from: component1, reason: from getter */
        public final long getDuration() {
            return this.duration;
        }

        @kotlin.jvm.JvmStatic
        public static final com.datadog.android.rum.model.ResourceEvent.Download fromJsonObject(com.google.gson.JsonObject jsonObject) throws com.google.gson.JsonParseException {
            return INSTANCE.fromJsonObject(jsonObject);
        }

        @kotlin.jvm.JvmStatic
        public static final com.datadog.android.rum.model.ResourceEvent.Download fromJson(java.lang.String str) throws com.google.gson.JsonParseException {
            return INSTANCE.fromJson(str);
        }

        public static /* synthetic */ com.datadog.android.rum.model.ResourceEvent.Download copy$default(com.datadog.android.rum.model.ResourceEvent.Download download, long j, long j2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                j = download.duration;
            }
            if ((i & 2) != 0) {
                j2 = download.start;
            }
            return download.copy(j, j2);
        }
    }

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\b\u0018\u0000  2\u00020\u0001:\u0001 B+\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ4\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\nR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\nR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001b\u001a\u0004\b\u001d\u0010\nR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001e\u001a\u0004\b\u001f\u0010\r"}, d2 = {"Lcom/datadog/android/rum/model/ResourceEvent$Provider;", "", "", "domain", "name", "Lcom/datadog/android/rum/model/ResourceEvent$ProviderType;", "type", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/datadog/android/rum/model/ResourceEvent$ProviderType;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/datadog/android/rum/model/ResourceEvent$ProviderType;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/datadog/android/rum/model/ResourceEvent$ProviderType;)Lcom/datadog/android/rum/model/ResourceEvent$Provider;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lcom/google/gson/JsonElement;", "toJson", "()Lcom/google/gson/JsonElement;", "toString", "Ljava/lang/String;", "getDomain", "getName", "Lcom/datadog/android/rum/model/ResourceEvent$ProviderType;", "getType", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final /* data */ class Provider {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.datadog.android.rum.model.ResourceEvent.Provider.Companion INSTANCE = new com.datadog.android.rum.model.ResourceEvent.Provider.Companion(null);
        private final java.lang.String domain;
        private final java.lang.String name;
        private final com.datadog.android.rum.model.ResourceEvent.ProviderType type;

        public Provider(java.lang.String str, java.lang.String str2, com.datadog.android.rum.model.ResourceEvent.ProviderType providerType) {
            this.domain = str;
            this.name = str2;
            this.type = providerType;
        }

        public /* synthetic */ Provider(java.lang.String str, java.lang.String str2, com.datadog.android.rum.model.ResourceEvent.ProviderType providerType, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : providerType);
        }

        public final java.lang.String getDomain() {
            return this.domain;
        }

        public final java.lang.String getName() {
            return this.name;
        }

        public final com.datadog.android.rum.model.ResourceEvent.ProviderType getType() {
            return this.type;
        }

        public final com.google.gson.JsonElement toJson() {
            com.google.gson.JsonObject jsonObject = new com.google.gson.JsonObject();
            java.lang.String str = this.domain;
            if (str != null) {
                jsonObject.addProperty("domain", str);
            }
            java.lang.String str2 = this.name;
            if (str2 != null) {
                jsonObject.addProperty("name", str2);
            }
            com.datadog.android.rum.model.ResourceEvent.ProviderType providerType = this.type;
            if (providerType != null) {
                jsonObject.add("type", providerType.toJson());
            }
            return jsonObject;
        }

        @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/datadog/android/rum/model/ResourceEvent$Provider$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/rum/model/ResourceEvent$Provider;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/rum/model/ResourceEvent$Provider;", "Lcom/google/gson/JsonObject;", "jsonObject", "fromJsonObject", "(Lcom/google/gson/JsonObject;)Lcom/datadog/android/rum/model/ResourceEvent$Provider;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @kotlin.jvm.JvmStatic
            public final com.datadog.android.rum.model.ResourceEvent.Provider fromJson(java.lang.String jsonString) throws com.google.gson.JsonParseException {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonString, "");
                try {
                    com.google.gson.JsonObject asJsonObject = com.google.gson.JsonParser.parseString(jsonString).getAsJsonObject();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asJsonObject, "");
                    return fromJsonObject(asJsonObject);
                } catch (java.lang.IllegalStateException e) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type Provider", e);
                }
            }

            @kotlin.jvm.JvmStatic
            public final com.datadog.android.rum.model.ResourceEvent.Provider fromJsonObject(com.google.gson.JsonObject jsonObject) throws com.google.gson.JsonParseException {
                java.lang.String asString;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonObject, "");
                try {
                    com.google.gson.JsonElement jsonElement = jsonObject.get("domain");
                    com.datadog.android.rum.model.ResourceEvent.ProviderType providerType = null;
                    java.lang.String asString2 = jsonElement != null ? jsonElement.getAsString() : null;
                    com.google.gson.JsonElement jsonElement2 = jsonObject.get("name");
                    java.lang.String asString3 = jsonElement2 != null ? jsonElement2.getAsString() : null;
                    com.google.gson.JsonElement jsonElement3 = jsonObject.get("type");
                    if (jsonElement3 != null && (asString = jsonElement3.getAsString()) != null) {
                        providerType = com.datadog.android.rum.model.ResourceEvent.ProviderType.INSTANCE.fromJson(asString);
                    }
                    return new com.datadog.android.rum.model.ResourceEvent.Provider(asString2, asString3, providerType);
                } catch (java.lang.IllegalStateException e) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type Provider", e);
                } catch (java.lang.NullPointerException e2) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type Provider", e2);
                } catch (java.lang.NumberFormatException e3) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type Provider", e3);
                }
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public final java.lang.String toString() {
            java.lang.String str = this.domain;
            java.lang.String str2 = this.name;
            com.datadog.android.rum.model.ResourceEvent.ProviderType providerType = this.type;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Provider(domain=");
            sb.append(str);
            sb.append(", name=");
            sb.append(str2);
            sb.append(", type=");
            sb.append(providerType);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.lang.String str = this.domain;
            int hashCode = str == null ? 0 : str.hashCode();
            java.lang.String str2 = this.name;
            int hashCode2 = str2 == null ? 0 : str2.hashCode();
            com.datadog.android.rum.model.ResourceEvent.ProviderType providerType = this.type;
            return (((hashCode * 31) + hashCode2) * 31) + (providerType != null ? providerType.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.datadog.android.rum.model.ResourceEvent.Provider)) {
                return false;
            }
            com.datadog.android.rum.model.ResourceEvent.Provider provider = (com.datadog.android.rum.model.ResourceEvent.Provider) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.domain, provider.domain) && kotlin.jvm.internal.Intrinsics.areEqual(this.name, provider.name) && this.type == provider.type;
        }

        public final com.datadog.android.rum.model.ResourceEvent.Provider copy(java.lang.String domain, java.lang.String name2, com.datadog.android.rum.model.ResourceEvent.ProviderType type) {
            return new com.datadog.android.rum.model.ResourceEvent.Provider(domain, name2, type);
        }

        /* renamed from: component3, reason: from getter */
        public final com.datadog.android.rum.model.ResourceEvent.ProviderType getType() {
            return this.type;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getName() {
            return this.name;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getDomain() {
            return this.domain;
        }

        @kotlin.jvm.JvmStatic
        public static final com.datadog.android.rum.model.ResourceEvent.Provider fromJsonObject(com.google.gson.JsonObject jsonObject) throws com.google.gson.JsonParseException {
            return INSTANCE.fromJsonObject(jsonObject);
        }

        @kotlin.jvm.JvmStatic
        public static final com.datadog.android.rum.model.ResourceEvent.Provider fromJson(java.lang.String str) throws com.google.gson.JsonParseException {
            return INSTANCE.fromJson(str);
        }

        public static /* synthetic */ com.datadog.android.rum.model.ResourceEvent.Provider copy$default(com.datadog.android.rum.model.ResourceEvent.Provider provider, java.lang.String str, java.lang.String str2, com.datadog.android.rum.model.ResourceEvent.ProviderType providerType, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = provider.domain;
            }
            if ((i & 2) != 0) {
                str2 = provider.name;
            }
            if ((i & 4) != 0) {
                providerType = provider.type;
            }
            return provider.copy(str, str2, providerType);
        }

        public Provider() {
            this(null, null, null, 7, null);
        }
    }

    @kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\b\u0018\u0000 \"2\u00020\u0001:\u0001\"B+\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ4\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u001d\u001a\u0004\b\u001e\u0010\nR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001f\u0010\nR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010 \u001a\u0004\b!\u0010\r"}, d2 = {"Lcom/datadog/android/rum/model/ResourceEvent$Request;", "", "", "encodedBodySize", "decodedBodySize", "Lcom/datadog/android/rum/model/ResourceEvent$RequestHeaders;", "headers", "<init>", "(Ljava/lang/Long;Ljava/lang/Long;Lcom/datadog/android/rum/model/ResourceEvent$RequestHeaders;)V", "component1", "()Ljava/lang/Long;", "component2", "component3", "()Lcom/datadog/android/rum/model/ResourceEvent$RequestHeaders;", "copy", "(Ljava/lang/Long;Ljava/lang/Long;Lcom/datadog/android/rum/model/ResourceEvent$RequestHeaders;)Lcom/datadog/android/rum/model/ResourceEvent$Request;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lcom/google/gson/JsonElement;", "toJson", "()Lcom/google/gson/JsonElement;", "", "toString", "()Ljava/lang/String;", "Ljava/lang/Long;", "getDecodedBodySize", "getEncodedBodySize", "Lcom/datadog/android/rum/model/ResourceEvent$RequestHeaders;", "getHeaders", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final /* data */ class Request {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.datadog.android.rum.model.ResourceEvent.Request.Companion INSTANCE = new com.datadog.android.rum.model.ResourceEvent.Request.Companion(null);
        private final java.lang.Long decodedBodySize;
        private final java.lang.Long encodedBodySize;
        private final com.datadog.android.rum.model.ResourceEvent.RequestHeaders headers;

        public Request(java.lang.Long l, java.lang.Long l2, com.datadog.android.rum.model.ResourceEvent.RequestHeaders requestHeaders) {
            this.encodedBodySize = l;
            this.decodedBodySize = l2;
            this.headers = requestHeaders;
        }

        public /* synthetic */ Request(java.lang.Long l, java.lang.Long l2, com.datadog.android.rum.model.ResourceEvent.RequestHeaders requestHeaders, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : l, (i & 2) != 0 ? null : l2, (i & 4) != 0 ? null : requestHeaders);
        }

        public final java.lang.Long getEncodedBodySize() {
            return this.encodedBodySize;
        }

        public final java.lang.Long getDecodedBodySize() {
            return this.decodedBodySize;
        }

        public final com.datadog.android.rum.model.ResourceEvent.RequestHeaders getHeaders() {
            return this.headers;
        }

        public final com.google.gson.JsonElement toJson() {
            com.google.gson.JsonObject jsonObject = new com.google.gson.JsonObject();
            java.lang.Long l = this.encodedBodySize;
            if (l != null) {
                jsonObject.addProperty("encoded_body_size", java.lang.Long.valueOf(l.longValue()));
            }
            java.lang.Long l2 = this.decodedBodySize;
            if (l2 != null) {
                jsonObject.addProperty("decoded_body_size", java.lang.Long.valueOf(l2.longValue()));
            }
            com.datadog.android.rum.model.ResourceEvent.RequestHeaders requestHeaders = this.headers;
            if (requestHeaders != null) {
                jsonObject.add("headers", requestHeaders.toJson());
            }
            return jsonObject;
        }

        @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/datadog/android/rum/model/ResourceEvent$Request$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/rum/model/ResourceEvent$Request;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/rum/model/ResourceEvent$Request;", "Lcom/google/gson/JsonObject;", "jsonObject", "fromJsonObject", "(Lcom/google/gson/JsonObject;)Lcom/datadog/android/rum/model/ResourceEvent$Request;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @kotlin.jvm.JvmStatic
            public final com.datadog.android.rum.model.ResourceEvent.Request fromJson(java.lang.String jsonString) throws com.google.gson.JsonParseException {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonString, "");
                try {
                    com.google.gson.JsonObject asJsonObject = com.google.gson.JsonParser.parseString(jsonString).getAsJsonObject();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asJsonObject, "");
                    return fromJsonObject(asJsonObject);
                } catch (java.lang.IllegalStateException e) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type Request", e);
                }
            }

            @kotlin.jvm.JvmStatic
            public final com.datadog.android.rum.model.ResourceEvent.Request fromJsonObject(com.google.gson.JsonObject jsonObject) throws com.google.gson.JsonParseException {
                com.google.gson.JsonObject asJsonObject;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonObject, "");
                try {
                    com.google.gson.JsonElement jsonElement = jsonObject.get("encoded_body_size");
                    com.datadog.android.rum.model.ResourceEvent.RequestHeaders requestHeaders = null;
                    java.lang.Long valueOf = jsonElement != null ? java.lang.Long.valueOf(jsonElement.getAsLong()) : null;
                    com.google.gson.JsonElement jsonElement2 = jsonObject.get("decoded_body_size");
                    java.lang.Long valueOf2 = jsonElement2 != null ? java.lang.Long.valueOf(jsonElement2.getAsLong()) : null;
                    com.google.gson.JsonElement jsonElement3 = jsonObject.get("headers");
                    if (jsonElement3 != null && (asJsonObject = jsonElement3.getAsJsonObject()) != null) {
                        requestHeaders = com.datadog.android.rum.model.ResourceEvent.RequestHeaders.INSTANCE.fromJsonObject(asJsonObject);
                    }
                    return new com.datadog.android.rum.model.ResourceEvent.Request(valueOf, valueOf2, requestHeaders);
                } catch (java.lang.IllegalStateException e) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type Request", e);
                } catch (java.lang.NullPointerException e2) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type Request", e2);
                } catch (java.lang.NumberFormatException e3) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type Request", e3);
                }
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public final java.lang.String toString() {
            java.lang.Long l = this.encodedBodySize;
            java.lang.Long l2 = this.decodedBodySize;
            com.datadog.android.rum.model.ResourceEvent.RequestHeaders requestHeaders = this.headers;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Request(encodedBodySize=");
            sb.append(l);
            sb.append(", decodedBodySize=");
            sb.append(l2);
            sb.append(", headers=");
            sb.append(requestHeaders);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.lang.Long l = this.encodedBodySize;
            int hashCode = l == null ? 0 : l.hashCode();
            java.lang.Long l2 = this.decodedBodySize;
            int hashCode2 = l2 == null ? 0 : l2.hashCode();
            com.datadog.android.rum.model.ResourceEvent.RequestHeaders requestHeaders = this.headers;
            return (((hashCode * 31) + hashCode2) * 31) + (requestHeaders != null ? requestHeaders.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.datadog.android.rum.model.ResourceEvent.Request)) {
                return false;
            }
            com.datadog.android.rum.model.ResourceEvent.Request request = (com.datadog.android.rum.model.ResourceEvent.Request) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.encodedBodySize, request.encodedBodySize) && kotlin.jvm.internal.Intrinsics.areEqual(this.decodedBodySize, request.decodedBodySize) && kotlin.jvm.internal.Intrinsics.areEqual(this.headers, request.headers);
        }

        public final com.datadog.android.rum.model.ResourceEvent.Request copy(java.lang.Long encodedBodySize, java.lang.Long decodedBodySize, com.datadog.android.rum.model.ResourceEvent.RequestHeaders headers) {
            return new com.datadog.android.rum.model.ResourceEvent.Request(encodedBodySize, decodedBodySize, headers);
        }

        /* renamed from: component3, reason: from getter */
        public final com.datadog.android.rum.model.ResourceEvent.RequestHeaders getHeaders() {
            return this.headers;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.Long getDecodedBodySize() {
            return this.decodedBodySize;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.Long getEncodedBodySize() {
            return this.encodedBodySize;
        }

        @kotlin.jvm.JvmStatic
        public static final com.datadog.android.rum.model.ResourceEvent.Request fromJsonObject(com.google.gson.JsonObject jsonObject) throws com.google.gson.JsonParseException {
            return INSTANCE.fromJsonObject(jsonObject);
        }

        @kotlin.jvm.JvmStatic
        public static final com.datadog.android.rum.model.ResourceEvent.Request fromJson(java.lang.String str) throws com.google.gson.JsonParseException {
            return INSTANCE.fromJson(str);
        }

        public static /* synthetic */ com.datadog.android.rum.model.ResourceEvent.Request copy$default(com.datadog.android.rum.model.ResourceEvent.Request request, java.lang.Long l, java.lang.Long l2, com.datadog.android.rum.model.ResourceEvent.RequestHeaders requestHeaders, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                l = request.encodedBodySize;
            }
            if ((i & 2) != 0) {
                l2 = request.decodedBodySize;
            }
            if ((i & 4) != 0) {
                requestHeaders = request.headers;
            }
            return request.copy(l, l2, requestHeaders);
        }

        public Request() {
            this(null, null, null, 7, null);
        }
    }

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\b\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\u0007"}, d2 = {"Lcom/datadog/android/rum/model/ResourceEvent$Response;", "", "Lcom/datadog/android/rum/model/ResourceEvent$RequestHeaders;", "headers", "<init>", "(Lcom/datadog/android/rum/model/ResourceEvent$RequestHeaders;)V", "component1", "()Lcom/datadog/android/rum/model/ResourceEvent$RequestHeaders;", "copy", "(Lcom/datadog/android/rum/model/ResourceEvent$RequestHeaders;)Lcom/datadog/android/rum/model/ResourceEvent$Response;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lcom/google/gson/JsonElement;", "toJson", "()Lcom/google/gson/JsonElement;", "", "toString", "()Ljava/lang/String;", "Lcom/datadog/android/rum/model/ResourceEvent$RequestHeaders;", "getHeaders", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final /* data */ class Response {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.datadog.android.rum.model.ResourceEvent.Response.Companion INSTANCE = new com.datadog.android.rum.model.ResourceEvent.Response.Companion(null);
        private final com.datadog.android.rum.model.ResourceEvent.RequestHeaders headers;

        public Response(com.datadog.android.rum.model.ResourceEvent.RequestHeaders requestHeaders) {
            this.headers = requestHeaders;
        }

        public /* synthetic */ Response(com.datadog.android.rum.model.ResourceEvent.RequestHeaders requestHeaders, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : requestHeaders);
        }

        public final com.datadog.android.rum.model.ResourceEvent.RequestHeaders getHeaders() {
            return this.headers;
        }

        public final com.google.gson.JsonElement toJson() {
            com.google.gson.JsonObject jsonObject = new com.google.gson.JsonObject();
            com.datadog.android.rum.model.ResourceEvent.RequestHeaders requestHeaders = this.headers;
            if (requestHeaders != null) {
                jsonObject.add("headers", requestHeaders.toJson());
            }
            return jsonObject;
        }

        @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/datadog/android/rum/model/ResourceEvent$Response$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/rum/model/ResourceEvent$Response;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/rum/model/ResourceEvent$Response;", "Lcom/google/gson/JsonObject;", "jsonObject", "fromJsonObject", "(Lcom/google/gson/JsonObject;)Lcom/datadog/android/rum/model/ResourceEvent$Response;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @kotlin.jvm.JvmStatic
            public final com.datadog.android.rum.model.ResourceEvent.Response fromJson(java.lang.String jsonString) throws com.google.gson.JsonParseException {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonString, "");
                try {
                    com.google.gson.JsonObject asJsonObject = com.google.gson.JsonParser.parseString(jsonString).getAsJsonObject();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asJsonObject, "");
                    return fromJsonObject(asJsonObject);
                } catch (java.lang.IllegalStateException e) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type Response", e);
                }
            }

            @kotlin.jvm.JvmStatic
            public final com.datadog.android.rum.model.ResourceEvent.Response fromJsonObject(com.google.gson.JsonObject jsonObject) throws com.google.gson.JsonParseException {
                com.google.gson.JsonObject asJsonObject;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonObject, "");
                try {
                    com.google.gson.JsonElement jsonElement = jsonObject.get("headers");
                    return new com.datadog.android.rum.model.ResourceEvent.Response((jsonElement == null || (asJsonObject = jsonElement.getAsJsonObject()) == null) ? null : com.datadog.android.rum.model.ResourceEvent.RequestHeaders.INSTANCE.fromJsonObject(asJsonObject));
                } catch (java.lang.IllegalStateException e) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type Response", e);
                } catch (java.lang.NullPointerException e2) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type Response", e2);
                } catch (java.lang.NumberFormatException e3) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type Response", e3);
                }
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public final java.lang.String toString() {
            com.datadog.android.rum.model.ResourceEvent.RequestHeaders requestHeaders = this.headers;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Response(headers=");
            sb.append(requestHeaders);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            com.datadog.android.rum.model.ResourceEvent.RequestHeaders requestHeaders = this.headers;
            if (requestHeaders == null) {
                return 0;
            }
            return requestHeaders.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.datadog.android.rum.model.ResourceEvent.Response) && kotlin.jvm.internal.Intrinsics.areEqual(this.headers, ((com.datadog.android.rum.model.ResourceEvent.Response) other).headers);
        }

        public final com.datadog.android.rum.model.ResourceEvent.Response copy(com.datadog.android.rum.model.ResourceEvent.RequestHeaders headers) {
            return new com.datadog.android.rum.model.ResourceEvent.Response(headers);
        }

        /* renamed from: component1, reason: from getter */
        public final com.datadog.android.rum.model.ResourceEvent.RequestHeaders getHeaders() {
            return this.headers;
        }

        @kotlin.jvm.JvmStatic
        public static final com.datadog.android.rum.model.ResourceEvent.Response fromJsonObject(com.google.gson.JsonObject jsonObject) throws com.google.gson.JsonParseException {
            return INSTANCE.fromJsonObject(jsonObject);
        }

        @kotlin.jvm.JvmStatic
        public static final com.datadog.android.rum.model.ResourceEvent.Response fromJson(java.lang.String str) throws com.google.gson.JsonParseException {
            return INSTANCE.fromJson(str);
        }

        public static /* synthetic */ com.datadog.android.rum.model.ResourceEvent.Response copy$default(com.datadog.android.rum.model.ResourceEvent.Response response, com.datadog.android.rum.model.ResourceEvent.RequestHeaders requestHeaders, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                requestHeaders = response.headers;
            }
            return response.copy(requestHeaders);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Response() {
            this(null, 1, 0 == true ? 1 : 0);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0086\b\u0018\u0000 32\u00020\u0001:\u00013BQ\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0012J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0012J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0018\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\\\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nHÆ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010 \u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\b \u0010!J\r\u0010#\u001a\u00020\"¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b%\u0010\u0012R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0007¢\u0006\f\n\u0004\b\t\u0010&\u001a\u0004\b'\u0010\u0016R\"\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010(\u001a\u0004\b)\u0010\u0018R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010*\u001a\u0004\b+\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010,\u001a\u0004\b-\u0010\u0010R$\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010*\u001a\u0004\b.\u0010\u0012\"\u0004\b/\u00100R$\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010*\u001a\u0004\b1\u0010\u0012\"\u0004\b2\u00100"}, d2 = {"Lcom/datadog/android/rum/model/ResourceEvent$Graphql;", "", "Lcom/datadog/android/rum/model/ResourceEvent$OperationType;", "operationType", "", "operationName", "payload", "variables", "", com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.ERROR_COUNT, "", "Lcom/datadog/android/rum/model/ResourceEvent$Error;", com.datadog.android.rum.internal.metric.SessionEndedMetric.NO_VIEW_EVENTS_COUNT_ERRORS_KEY, "<init>", "(Lcom/datadog/android/rum/model/ResourceEvent$OperationType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/util/List;)V", "component1", "()Lcom/datadog/android/rum/model/ResourceEvent$OperationType;", "component2", "()Ljava/lang/String;", "component3", "component4", "component5", "()Ljava/lang/Long;", "component6", "()Ljava/util/List;", "copy", "(Lcom/datadog/android/rum/model/ResourceEvent$OperationType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/util/List;)Lcom/datadog/android/rum/model/ResourceEvent$Graphql;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lcom/google/gson/JsonElement;", "toJson", "()Lcom/google/gson/JsonElement;", "toString", "Ljava/lang/Long;", "getErrorCount", "Ljava/util/List;", "getErrors", "Ljava/lang/String;", "getOperationName", "Lcom/datadog/android/rum/model/ResourceEvent$OperationType;", "getOperationType", "getPayload", "setPayload", "(Ljava/lang/String;)V", "getVariables", "setVariables", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final /* data */ class Graphql {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.datadog.android.rum.model.ResourceEvent.Graphql.Companion INSTANCE = new com.datadog.android.rum.model.ResourceEvent.Graphql.Companion(null);
        private final java.lang.Long errorCount;
        private final java.util.List<com.datadog.android.rum.model.ResourceEvent.Error> errors;
        private final java.lang.String operationName;
        private final com.datadog.android.rum.model.ResourceEvent.OperationType operationType;
        private java.lang.String payload;
        private java.lang.String variables;

        public Graphql(com.datadog.android.rum.model.ResourceEvent.OperationType operationType, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.Long l, java.util.List<com.datadog.android.rum.model.ResourceEvent.Error> list) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(operationType, "");
            this.operationType = operationType;
            this.operationName = str;
            this.payload = str2;
            this.variables = str3;
            this.errorCount = l;
            this.errors = list;
        }

        public /* synthetic */ Graphql(com.datadog.android.rum.model.ResourceEvent.OperationType operationType, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.Long l, java.util.List list, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(operationType, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : l, (i & 32) == 0 ? list : null);
        }

        public final com.datadog.android.rum.model.ResourceEvent.OperationType getOperationType() {
            return this.operationType;
        }

        public final java.lang.String getOperationName() {
            return this.operationName;
        }

        public final java.lang.String getPayload() {
            return this.payload;
        }

        public final void setPayload(java.lang.String str) {
            this.payload = str;
        }

        public final java.lang.String getVariables() {
            return this.variables;
        }

        public final void setVariables(java.lang.String str) {
            this.variables = str;
        }

        public final java.lang.Long getErrorCount() {
            return this.errorCount;
        }

        public final java.util.List<com.datadog.android.rum.model.ResourceEvent.Error> getErrors() {
            return this.errors;
        }

        public final com.google.gson.JsonElement toJson() {
            com.google.gson.JsonObject jsonObject = new com.google.gson.JsonObject();
            jsonObject.add("operationType", this.operationType.toJson());
            java.lang.String str = this.operationName;
            if (str != null) {
                jsonObject.addProperty("operationName", str);
            }
            java.lang.String str2 = this.payload;
            if (str2 != null) {
                jsonObject.addProperty("payload", str2);
            }
            java.lang.String str3 = this.variables;
            if (str3 != null) {
                jsonObject.addProperty("variables", str3);
            }
            java.lang.Long l = this.errorCount;
            if (l != null) {
                jsonObject.addProperty("error_count", java.lang.Long.valueOf(l.longValue()));
            }
            java.util.List<com.datadog.android.rum.model.ResourceEvent.Error> list = this.errors;
            if (list != null) {
                com.google.gson.JsonArray jsonArray = new com.google.gson.JsonArray(list.size());
                java.util.Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    jsonArray.add(((com.datadog.android.rum.model.ResourceEvent.Error) it.next()).toJson());
                }
                jsonObject.add(com.datadog.android.rum.internal.metric.SessionEndedMetric.NO_VIEW_EVENTS_COUNT_ERRORS_KEY, jsonArray);
            }
            return jsonObject;
        }

        @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/datadog/android/rum/model/ResourceEvent$Graphql$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/rum/model/ResourceEvent$Graphql;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/rum/model/ResourceEvent$Graphql;", "Lcom/google/gson/JsonObject;", "jsonObject", "fromJsonObject", "(Lcom/google/gson/JsonObject;)Lcom/datadog/android/rum/model/ResourceEvent$Graphql;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @kotlin.jvm.JvmStatic
            public final com.datadog.android.rum.model.ResourceEvent.Graphql fromJson(java.lang.String jsonString) throws com.google.gson.JsonParseException {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonString, "");
                try {
                    com.google.gson.JsonObject asJsonObject = com.google.gson.JsonParser.parseString(jsonString).getAsJsonObject();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asJsonObject, "");
                    return fromJsonObject(asJsonObject);
                } catch (java.lang.IllegalStateException e) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type Graphql", e);
                }
            }

            @kotlin.jvm.JvmStatic
            public final com.datadog.android.rum.model.ResourceEvent.Graphql fromJsonObject(com.google.gson.JsonObject jsonObject) throws com.google.gson.JsonParseException {
                com.google.gson.JsonArray asJsonArray;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonObject, "");
                try {
                    com.datadog.android.rum.model.ResourceEvent.OperationType.Companion companion = com.datadog.android.rum.model.ResourceEvent.OperationType.INSTANCE;
                    java.lang.String asString = jsonObject.get("operationType").getAsString();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asString, "");
                    com.datadog.android.rum.model.ResourceEvent.OperationType fromJson = companion.fromJson(asString);
                    com.google.gson.JsonElement jsonElement = jsonObject.get("operationName");
                    java.util.ArrayList arrayList = null;
                    java.lang.String asString2 = jsonElement != null ? jsonElement.getAsString() : null;
                    com.google.gson.JsonElement jsonElement2 = jsonObject.get("payload");
                    java.lang.String asString3 = jsonElement2 != null ? jsonElement2.getAsString() : null;
                    com.google.gson.JsonElement jsonElement3 = jsonObject.get("variables");
                    java.lang.String asString4 = jsonElement3 != null ? jsonElement3.getAsString() : null;
                    com.google.gson.JsonElement jsonElement4 = jsonObject.get("error_count");
                    java.lang.Long valueOf = jsonElement4 != null ? java.lang.Long.valueOf(jsonElement4.getAsLong()) : null;
                    com.google.gson.JsonElement jsonElement5 = jsonObject.get(com.datadog.android.rum.internal.metric.SessionEndedMetric.NO_VIEW_EVENTS_COUNT_ERRORS_KEY);
                    if (jsonElement5 != null && (asJsonArray = jsonElement5.getAsJsonArray()) != null) {
                        arrayList = new java.util.ArrayList(asJsonArray.size());
                        for (com.google.gson.JsonElement jsonElement6 : asJsonArray) {
                            com.datadog.android.rum.model.ResourceEvent.Error.Companion companion2 = com.datadog.android.rum.model.ResourceEvent.Error.INSTANCE;
                            com.google.gson.JsonObject asJsonObject = jsonElement6.getAsJsonObject();
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asJsonObject, "");
                            arrayList.add(companion2.fromJsonObject(asJsonObject));
                        }
                    }
                    return new com.datadog.android.rum.model.ResourceEvent.Graphql(fromJson, asString2, asString3, asString4, valueOf, arrayList);
                } catch (java.lang.IllegalStateException e) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type Graphql", e);
                } catch (java.lang.NullPointerException e2) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type Graphql", e2);
                } catch (java.lang.NumberFormatException e3) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type Graphql", e3);
                }
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public final java.lang.String toString() {
            com.datadog.android.rum.model.ResourceEvent.OperationType operationType = this.operationType;
            java.lang.String str = this.operationName;
            java.lang.String str2 = this.payload;
            java.lang.String str3 = this.variables;
            java.lang.Long l = this.errorCount;
            java.util.List<com.datadog.android.rum.model.ResourceEvent.Error> list = this.errors;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Graphql(operationType=");
            sb.append(operationType);
            sb.append(", operationName=");
            sb.append(str);
            sb.append(", payload=");
            sb.append(str2);
            sb.append(", variables=");
            sb.append(str3);
            sb.append(", errorCount=");
            sb.append(l);
            sb.append(", errors=");
            sb.append(list);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.operationType.hashCode();
            java.lang.String str = this.operationName;
            int hashCode2 = str == null ? 0 : str.hashCode();
            java.lang.String str2 = this.payload;
            int hashCode3 = str2 == null ? 0 : str2.hashCode();
            java.lang.String str3 = this.variables;
            int hashCode4 = str3 == null ? 0 : str3.hashCode();
            java.lang.Long l = this.errorCount;
            int hashCode5 = l == null ? 0 : l.hashCode();
            java.util.List<com.datadog.android.rum.model.ResourceEvent.Error> list = this.errors;
            return (((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + (list != null ? list.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.datadog.android.rum.model.ResourceEvent.Graphql)) {
                return false;
            }
            com.datadog.android.rum.model.ResourceEvent.Graphql graphql = (com.datadog.android.rum.model.ResourceEvent.Graphql) other;
            return this.operationType == graphql.operationType && kotlin.jvm.internal.Intrinsics.areEqual(this.operationName, graphql.operationName) && kotlin.jvm.internal.Intrinsics.areEqual(this.payload, graphql.payload) && kotlin.jvm.internal.Intrinsics.areEqual(this.variables, graphql.variables) && kotlin.jvm.internal.Intrinsics.areEqual(this.errorCount, graphql.errorCount) && kotlin.jvm.internal.Intrinsics.areEqual(this.errors, graphql.errors);
        }

        public final com.datadog.android.rum.model.ResourceEvent.Graphql copy(com.datadog.android.rum.model.ResourceEvent.OperationType operationType, java.lang.String operationName, java.lang.String payload, java.lang.String variables, java.lang.Long errorCount, java.util.List<com.datadog.android.rum.model.ResourceEvent.Error> errors) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(operationType, "");
            return new com.datadog.android.rum.model.ResourceEvent.Graphql(operationType, operationName, payload, variables, errorCount, errors);
        }

        public final java.util.List<com.datadog.android.rum.model.ResourceEvent.Error> component6() {
            return this.errors;
        }

        /* renamed from: component5, reason: from getter */
        public final java.lang.Long getErrorCount() {
            return this.errorCount;
        }

        /* renamed from: component4, reason: from getter */
        public final java.lang.String getVariables() {
            return this.variables;
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String getPayload() {
            return this.payload;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getOperationName() {
            return this.operationName;
        }

        /* renamed from: component1, reason: from getter */
        public final com.datadog.android.rum.model.ResourceEvent.OperationType getOperationType() {
            return this.operationType;
        }

        @kotlin.jvm.JvmStatic
        public static final com.datadog.android.rum.model.ResourceEvent.Graphql fromJsonObject(com.google.gson.JsonObject jsonObject) throws com.google.gson.JsonParseException {
            return INSTANCE.fromJsonObject(jsonObject);
        }

        @kotlin.jvm.JvmStatic
        public static final com.datadog.android.rum.model.ResourceEvent.Graphql fromJson(java.lang.String str) throws com.google.gson.JsonParseException {
            return INSTANCE.fromJson(str);
        }

        public static /* synthetic */ com.datadog.android.rum.model.ResourceEvent.Graphql copy$default(com.datadog.android.rum.model.ResourceEvent.Graphql graphql, com.datadog.android.rum.model.ResourceEvent.OperationType operationType, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.Long l, java.util.List list, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                operationType = graphql.operationType;
            }
            if ((i & 2) != 0) {
                str = graphql.operationName;
            }
            java.lang.String str4 = str;
            if ((i & 4) != 0) {
                str2 = graphql.payload;
            }
            java.lang.String str5 = str2;
            if ((i & 8) != 0) {
                str3 = graphql.variables;
            }
            java.lang.String str6 = str3;
            if ((i & 16) != 0) {
                l = graphql.errorCount;
            }
            java.lang.Long l2 = l;
            if ((i & 32) != 0) {
                list = graphql.errors;
            }
            return graphql.copy(operationType, str4, str5, str6, l2, list);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\b\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u001d\u0012\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001c\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ&\u0010\t\u001a\u00020\u00002\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016R#\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0018\u0010\b"}, d2 = {"Lcom/datadog/android/rum/model/ResourceEvent$RequestHeaders;", "", "", "", "additionalProperties", "<init>", "(Ljava/util/Map;)V", "component1", "()Ljava/util/Map;", "copy", "(Ljava/util/Map;)Lcom/datadog/android/rum/model/ResourceEvent$RequestHeaders;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lcom/google/gson/JsonElement;", "toJson", "()Lcom/google/gson/JsonElement;", "toString", "()Ljava/lang/String;", "Ljava/util/Map;", "getAdditionalProperties", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final /* data */ class RequestHeaders {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.datadog.android.rum.model.ResourceEvent.RequestHeaders.Companion INSTANCE = new com.datadog.android.rum.model.ResourceEvent.RequestHeaders.Companion(null);
        private final java.util.Map<java.lang.String, java.lang.String> additionalProperties;

        public RequestHeaders(java.util.Map<java.lang.String, java.lang.String> map) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
            this.additionalProperties = map;
        }

        public /* synthetic */ RequestHeaders(java.util.LinkedHashMap linkedHashMap, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? new java.util.LinkedHashMap() : linkedHashMap);
        }

        public final java.util.Map<java.lang.String, java.lang.String> getAdditionalProperties() {
            return this.additionalProperties;
        }

        public final com.google.gson.JsonElement toJson() {
            com.google.gson.JsonObject jsonObject = new com.google.gson.JsonObject();
            for (java.util.Map.Entry<java.lang.String, java.lang.String> entry : this.additionalProperties.entrySet()) {
                jsonObject.addProperty(entry.getKey(), entry.getValue());
            }
            return jsonObject;
        }

        @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/datadog/android/rum/model/ResourceEvent$RequestHeaders$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/rum/model/ResourceEvent$RequestHeaders;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/rum/model/ResourceEvent$RequestHeaders;", "Lcom/google/gson/JsonObject;", "jsonObject", "fromJsonObject", "(Lcom/google/gson/JsonObject;)Lcom/datadog/android/rum/model/ResourceEvent$RequestHeaders;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @kotlin.jvm.JvmStatic
            public final com.datadog.android.rum.model.ResourceEvent.RequestHeaders fromJson(java.lang.String jsonString) throws com.google.gson.JsonParseException {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonString, "");
                try {
                    com.google.gson.JsonObject asJsonObject = com.google.gson.JsonParser.parseString(jsonString).getAsJsonObject();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asJsonObject, "");
                    return fromJsonObject(asJsonObject);
                } catch (java.lang.IllegalStateException e) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type RequestHeaders", e);
                }
            }

            @kotlin.jvm.JvmStatic
            public final com.datadog.android.rum.model.ResourceEvent.RequestHeaders fromJsonObject(com.google.gson.JsonObject jsonObject) throws com.google.gson.JsonParseException {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonObject, "");
                try {
                    java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
                    for (java.util.Map.Entry<java.lang.String, com.google.gson.JsonElement> entry : jsonObject.entrySet()) {
                        java.lang.String key = entry.getKey();
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(key, "");
                        java.lang.String asString = entry.getValue().getAsString();
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asString, "");
                        linkedHashMap.put(key, asString);
                    }
                    return new com.datadog.android.rum.model.ResourceEvent.RequestHeaders(linkedHashMap);
                } catch (java.lang.IllegalStateException e) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type RequestHeaders", e);
                } catch (java.lang.NullPointerException e2) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type RequestHeaders", e2);
                } catch (java.lang.NumberFormatException e3) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type RequestHeaders", e3);
                }
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public final java.lang.String toString() {
            java.util.Map<java.lang.String, java.lang.String> map = this.additionalProperties;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("RequestHeaders(additionalProperties=");
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
            return (other instanceof com.datadog.android.rum.model.ResourceEvent.RequestHeaders) && kotlin.jvm.internal.Intrinsics.areEqual(this.additionalProperties, ((com.datadog.android.rum.model.ResourceEvent.RequestHeaders) other).additionalProperties);
        }

        public final com.datadog.android.rum.model.ResourceEvent.RequestHeaders copy(java.util.Map<java.lang.String, java.lang.String> additionalProperties) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(additionalProperties, "");
            return new com.datadog.android.rum.model.ResourceEvent.RequestHeaders(additionalProperties);
        }

        public final java.util.Map<java.lang.String, java.lang.String> component1() {
            return this.additionalProperties;
        }

        @kotlin.jvm.JvmStatic
        public static final com.datadog.android.rum.model.ResourceEvent.RequestHeaders fromJsonObject(com.google.gson.JsonObject jsonObject) throws com.google.gson.JsonParseException {
            return INSTANCE.fromJsonObject(jsonObject);
        }

        @kotlin.jvm.JvmStatic
        public static final com.datadog.android.rum.model.ResourceEvent.RequestHeaders fromJson(java.lang.String str) throws com.google.gson.JsonParseException {
            return INSTANCE.fromJson(str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.datadog.android.rum.model.ResourceEvent.RequestHeaders copy$default(com.datadog.android.rum.model.ResourceEvent.RequestHeaders requestHeaders, java.util.Map map, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                map = requestHeaders.additionalProperties;
            }
            return requestHeaders.copy(map);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public RequestHeaders() {
            this(null, 1, 0 == true ? 1 : 0);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\b\u0018\u0000 %2\u00020\u0001:\u0001%B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0005¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ\u0018\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0010JJ\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\r\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001e\u0010\rR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u001f\u001a\u0004\b \u0010\rR\"\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010!\u001a\u0004\b\"\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b#\u0010\rR\"\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010!\u001a\u0004\b$\u0010\u0010"}, d2 = {"Lcom/datadog/android/rum/model/ResourceEvent$Error;", "", "", "message", "code", "", "Lcom/datadog/android/rum/model/ResourceEvent$Location;", "locations", "Lcom/datadog/android/rum/model/ResourceEvent$Path;", "path", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Ljava/util/List;", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;)Lcom/datadog/android/rum/model/ResourceEvent$Error;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lcom/google/gson/JsonElement;", "toJson", "()Lcom/google/gson/JsonElement;", "toString", "Ljava/lang/String;", "getCode", "Ljava/util/List;", "getLocations", "getMessage", "getPath", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes7.dex */
    public static final /* data */ class Error {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.datadog.android.rum.model.ResourceEvent.Error.Companion INSTANCE = new com.datadog.android.rum.model.ResourceEvent.Error.Companion(null);
        private final java.lang.String code;
        private final java.util.List<com.datadog.android.rum.model.ResourceEvent.Location> locations;
        private final java.lang.String message;
        private final java.util.List<com.datadog.android.rum.model.ResourceEvent.Path> path;

        /* JADX WARN: Multi-variable type inference failed */
        public Error(java.lang.String str, java.lang.String str2, java.util.List<com.datadog.android.rum.model.ResourceEvent.Location> list, java.util.List<? extends com.datadog.android.rum.model.ResourceEvent.Path> list2) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.message = str;
            this.code = str2;
            this.locations = list;
            this.path = list2;
        }

        public /* synthetic */ Error(java.lang.String str, java.lang.String str2, java.util.List list, java.util.List list2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : list, (i & 8) != 0 ? null : list2);
        }

        public final java.lang.String getMessage() {
            return this.message;
        }

        public final java.lang.String getCode() {
            return this.code;
        }

        public final java.util.List<com.datadog.android.rum.model.ResourceEvent.Location> getLocations() {
            return this.locations;
        }

        public final java.util.List<com.datadog.android.rum.model.ResourceEvent.Path> getPath() {
            return this.path;
        }

        public final com.google.gson.JsonElement toJson() {
            com.google.gson.JsonObject jsonObject = new com.google.gson.JsonObject();
            jsonObject.addProperty("message", this.message);
            java.lang.String str = this.code;
            if (str != null) {
                jsonObject.addProperty("code", str);
            }
            java.util.List<com.datadog.android.rum.model.ResourceEvent.Location> list = this.locations;
            if (list != null) {
                com.google.gson.JsonArray jsonArray = new com.google.gson.JsonArray(list.size());
                java.util.Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    jsonArray.add(((com.datadog.android.rum.model.ResourceEvent.Location) it.next()).toJson());
                }
                jsonObject.add("locations", jsonArray);
            }
            java.util.List<com.datadog.android.rum.model.ResourceEvent.Path> list2 = this.path;
            if (list2 != null) {
                com.google.gson.JsonArray jsonArray2 = new com.google.gson.JsonArray(list2.size());
                java.util.Iterator<T> it2 = list2.iterator();
                while (it2.hasNext()) {
                    jsonArray2.add(((com.datadog.android.rum.model.ResourceEvent.Path) it2.next()).toJson());
                }
                jsonObject.add("path", jsonArray2);
            }
            return jsonObject;
        }

        @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/datadog/android/rum/model/ResourceEvent$Error$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/rum/model/ResourceEvent$Error;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/rum/model/ResourceEvent$Error;", "Lcom/google/gson/JsonObject;", "jsonObject", "fromJsonObject", "(Lcom/google/gson/JsonObject;)Lcom/datadog/android/rum/model/ResourceEvent$Error;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @kotlin.jvm.JvmStatic
            public final com.datadog.android.rum.model.ResourceEvent.Error fromJson(java.lang.String jsonString) throws com.google.gson.JsonParseException {
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
            public final com.datadog.android.rum.model.ResourceEvent.Error fromJsonObject(com.google.gson.JsonObject jsonObject) throws com.google.gson.JsonParseException {
                java.util.ArrayList arrayList;
                com.google.gson.JsonArray asJsonArray;
                com.google.gson.JsonArray asJsonArray2;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonObject, "");
                try {
                    java.lang.String asString = jsonObject.get("message").getAsString();
                    com.google.gson.JsonElement jsonElement = jsonObject.get("code");
                    java.util.ArrayList arrayList2 = null;
                    java.lang.String asString2 = jsonElement != null ? jsonElement.getAsString() : null;
                    com.google.gson.JsonElement jsonElement2 = jsonObject.get("locations");
                    if (jsonElement2 == null || (asJsonArray2 = jsonElement2.getAsJsonArray()) == null) {
                        arrayList = null;
                    } else {
                        arrayList = new java.util.ArrayList(asJsonArray2.size());
                        for (com.google.gson.JsonElement jsonElement3 : asJsonArray2) {
                            com.datadog.android.rum.model.ResourceEvent.Location.Companion companion = com.datadog.android.rum.model.ResourceEvent.Location.INSTANCE;
                            com.google.gson.JsonObject asJsonObject = jsonElement3.getAsJsonObject();
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asJsonObject, "");
                            arrayList.add(companion.fromJsonObject(asJsonObject));
                        }
                    }
                    com.google.gson.JsonElement jsonElement4 = jsonObject.get("path");
                    if (jsonElement4 != null && (asJsonArray = jsonElement4.getAsJsonArray()) != null) {
                        arrayList2 = new java.util.ArrayList(asJsonArray.size());
                        for (com.google.gson.JsonElement jsonElement5 : asJsonArray) {
                            com.datadog.android.rum.model.ResourceEvent.Path.Companion companion2 = com.datadog.android.rum.model.ResourceEvent.Path.INSTANCE;
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(jsonElement5, "");
                            arrayList2.add(companion2.fromJsonElement(jsonElement5));
                        }
                    }
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asString, "");
                    return new com.datadog.android.rum.model.ResourceEvent.Error(asString, asString2, arrayList, arrayList2);
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
            java.lang.String str = this.message;
            java.lang.String str2 = this.code;
            java.util.List<com.datadog.android.rum.model.ResourceEvent.Location> list = this.locations;
            java.util.List<com.datadog.android.rum.model.ResourceEvent.Path> list2 = this.path;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Error(message=");
            sb.append(str);
            sb.append(", code=");
            sb.append(str2);
            sb.append(", locations=");
            sb.append(list);
            sb.append(", path=");
            sb.append(list2);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.message.hashCode();
            java.lang.String str = this.code;
            int hashCode2 = str == null ? 0 : str.hashCode();
            java.util.List<com.datadog.android.rum.model.ResourceEvent.Location> list = this.locations;
            int hashCode3 = list == null ? 0 : list.hashCode();
            java.util.List<com.datadog.android.rum.model.ResourceEvent.Path> list2 = this.path;
            return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (list2 != null ? list2.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.datadog.android.rum.model.ResourceEvent.Error)) {
                return false;
            }
            com.datadog.android.rum.model.ResourceEvent.Error error = (com.datadog.android.rum.model.ResourceEvent.Error) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.message, error.message) && kotlin.jvm.internal.Intrinsics.areEqual(this.code, error.code) && kotlin.jvm.internal.Intrinsics.areEqual(this.locations, error.locations) && kotlin.jvm.internal.Intrinsics.areEqual(this.path, error.path);
        }

        public final com.datadog.android.rum.model.ResourceEvent.Error copy(java.lang.String message, java.lang.String code, java.util.List<com.datadog.android.rum.model.ResourceEvent.Location> locations, java.util.List<? extends com.datadog.android.rum.model.ResourceEvent.Path> path) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "");
            return new com.datadog.android.rum.model.ResourceEvent.Error(message, code, locations, path);
        }

        public final java.util.List<com.datadog.android.rum.model.ResourceEvent.Path> component4() {
            return this.path;
        }

        public final java.util.List<com.datadog.android.rum.model.ResourceEvent.Location> component3() {
            return this.locations;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getCode() {
            return this.code;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getMessage() {
            return this.message;
        }

        @kotlin.jvm.JvmStatic
        public static final com.datadog.android.rum.model.ResourceEvent.Error fromJsonObject(com.google.gson.JsonObject jsonObject) throws com.google.gson.JsonParseException {
            return INSTANCE.fromJsonObject(jsonObject);
        }

        @kotlin.jvm.JvmStatic
        public static final com.datadog.android.rum.model.ResourceEvent.Error fromJson(java.lang.String str) throws com.google.gson.JsonParseException {
            return INSTANCE.fromJson(str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.datadog.android.rum.model.ResourceEvent.Error copy$default(com.datadog.android.rum.model.ResourceEvent.Error error, java.lang.String str, java.lang.String str2, java.util.List list, java.util.List list2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = error.message;
            }
            if ((i & 2) != 0) {
                str2 = error.code;
            }
            if ((i & 4) != 0) {
                list = error.locations;
            }
            if ((i & 8) != 0) {
                list2 = error.path;
            }
            return error.copy(str, str2, list, list2);
        }
    }

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0004\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001a\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001b\u0010\b"}, d2 = {"Lcom/datadog/android/rum/model/ResourceEvent$Location;", "", "", "line", "column", "<init>", "(JJ)V", "component1", "()J", "component2", "copy", "(JJ)Lcom/datadog/android/rum/model/ResourceEvent$Location;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lcom/google/gson/JsonElement;", "toJson", "()Lcom/google/gson/JsonElement;", "", "toString", "()Ljava/lang/String;", "J", "getColumn", "getLine", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final /* data */ class Location {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.datadog.android.rum.model.ResourceEvent.Location.Companion INSTANCE = new com.datadog.android.rum.model.ResourceEvent.Location.Companion(null);
        private final long column;
        private final long line;

        public Location(long j, long j2) {
            this.line = j;
            this.column = j2;
        }

        public final long getLine() {
            return this.line;
        }

        public final long getColumn() {
            return this.column;
        }

        public final com.google.gson.JsonElement toJson() {
            com.google.gson.JsonObject jsonObject = new com.google.gson.JsonObject();
            jsonObject.addProperty("line", java.lang.Long.valueOf(this.line));
            jsonObject.addProperty("column", java.lang.Long.valueOf(this.column));
            return jsonObject;
        }

        @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/datadog/android/rum/model/ResourceEvent$Location$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/rum/model/ResourceEvent$Location;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/rum/model/ResourceEvent$Location;", "Lcom/google/gson/JsonObject;", "jsonObject", "fromJsonObject", "(Lcom/google/gson/JsonObject;)Lcom/datadog/android/rum/model/ResourceEvent$Location;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @kotlin.jvm.JvmStatic
            public final com.datadog.android.rum.model.ResourceEvent.Location fromJson(java.lang.String jsonString) throws com.google.gson.JsonParseException {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonString, "");
                try {
                    com.google.gson.JsonObject asJsonObject = com.google.gson.JsonParser.parseString(jsonString).getAsJsonObject();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asJsonObject, "");
                    return fromJsonObject(asJsonObject);
                } catch (java.lang.IllegalStateException e) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type Location", e);
                }
            }

            @kotlin.jvm.JvmStatic
            public final com.datadog.android.rum.model.ResourceEvent.Location fromJsonObject(com.google.gson.JsonObject jsonObject) throws com.google.gson.JsonParseException {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonObject, "");
                try {
                    return new com.datadog.android.rum.model.ResourceEvent.Location(jsonObject.get("line").getAsLong(), jsonObject.get("column").getAsLong());
                } catch (java.lang.IllegalStateException e) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type Location", e);
                } catch (java.lang.NullPointerException e2) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type Location", e2);
                } catch (java.lang.NumberFormatException e3) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type Location", e3);
                }
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public final java.lang.String toString() {
            long j = this.line;
            long j2 = this.column;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Location(line=");
            sb.append(j);
            sb.append(", column=");
            sb.append(j2);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (java.lang.Long.hashCode(this.line) * 31) + java.lang.Long.hashCode(this.column);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.datadog.android.rum.model.ResourceEvent.Location)) {
                return false;
            }
            com.datadog.android.rum.model.ResourceEvent.Location location = (com.datadog.android.rum.model.ResourceEvent.Location) other;
            return this.line == location.line && this.column == location.column;
        }

        public final com.datadog.android.rum.model.ResourceEvent.Location copy(long line, long column) {
            return new com.datadog.android.rum.model.ResourceEvent.Location(line, column);
        }

        /* renamed from: component2, reason: from getter */
        public final long getColumn() {
            return this.column;
        }

        /* renamed from: component1, reason: from getter */
        public final long getLine() {
            return this.line;
        }

        @kotlin.jvm.JvmStatic
        public static final com.datadog.android.rum.model.ResourceEvent.Location fromJsonObject(com.google.gson.JsonObject jsonObject) throws com.google.gson.JsonParseException {
            return INSTANCE.fromJsonObject(jsonObject);
        }

        @kotlin.jvm.JvmStatic
        public static final com.datadog.android.rum.model.ResourceEvent.Location fromJson(java.lang.String str) throws com.google.gson.JsonParseException {
            return INSTANCE.fromJson(str);
        }

        public static /* synthetic */ com.datadog.android.rum.model.ResourceEvent.Location copy$default(com.datadog.android.rum.model.ResourceEvent.Location location, long j, long j2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                j = location.line;
            }
            if ((i & 2) != 0) {
                j2 = location.column;
            }
            return location.copy(j, j2);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u0000 \u00072\u00020\u0001:\u0003\u0007\b\tB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0001\u0002\n\u000b"}, d2 = {"Lcom/datadog/android/rum/model/ResourceEvent$Path;", "", "<init>", "()V", "Lcom/google/gson/JsonElement;", "toJson", "()Lcom/google/gson/JsonElement;", "Companion", "Long", "String", "Lcom/datadog/android/rum/model/ResourceEvent$Path$Long;", "Lcom/datadog/android/rum/model/ResourceEvent$Path$String;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static abstract class Path {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.datadog.android.rum.model.ResourceEvent.Path.Companion INSTANCE = new com.datadog.android.rum.model.ResourceEvent.Path.Companion(null);

        public abstract com.google.gson.JsonElement toJson();

        private Path() {
        }

        @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\u0007"}, d2 = {"Lcom/datadog/android/rum/model/ResourceEvent$Path$String;", "Lcom/datadog/android/rum/model/ResourceEvent$Path;", "", "item", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/datadog/android/rum/model/ResourceEvent$Path$String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lcom/google/gson/JsonElement;", "toJson", "()Lcom/google/gson/JsonElement;", "toString", "Ljava/lang/String;", "getItem", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final /* data */ class String extends com.datadog.android.rum.model.ResourceEvent.Path {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final com.datadog.android.rum.model.ResourceEvent.Path.String.Companion INSTANCE = new com.datadog.android.rum.model.ResourceEvent.Path.String.Companion(null);
            private final java.lang.String item;

            public final java.lang.String getItem() {
                return this.item;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public String(java.lang.String str) {
                super(null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
                this.item = str;
            }

            @Override // com.datadog.android.rum.model.ResourceEvent.Path
            public final com.google.gson.JsonElement toJson() {
                return new com.google.gson.JsonPrimitive(this.item);
            }

            @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/datadog/android/rum/model/ResourceEvent$Path$String$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/rum/model/ResourceEvent$Path$String;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/rum/model/ResourceEvent$Path$String;", "Lcom/google/gson/JsonPrimitive;", "jsonPrimitive", "fromJsonPrimitive", "(Lcom/google/gson/JsonPrimitive;)Lcom/datadog/android/rum/model/ResourceEvent$Path$String;"}, k = 1, mv = {1, 8, 0}, xi = 48)
            public static final class Companion {
                private Companion() {
                }

                @kotlin.jvm.JvmStatic
                public final com.datadog.android.rum.model.ResourceEvent.Path.String fromJson(java.lang.String jsonString) throws com.google.gson.JsonParseException {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonString, "");
                    try {
                        com.google.gson.JsonPrimitive asJsonPrimitive = com.google.gson.JsonParser.parseString(jsonString).getAsJsonPrimitive();
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asJsonPrimitive, "");
                        return fromJsonPrimitive(asJsonPrimitive);
                    } catch (java.lang.IllegalStateException e) {
                        throw new com.google.gson.JsonParseException("Unable to parse json into type String", e);
                    }
                }

                @kotlin.jvm.JvmStatic
                public final com.datadog.android.rum.model.ResourceEvent.Path.String fromJsonPrimitive(com.google.gson.JsonPrimitive jsonPrimitive) throws com.google.gson.JsonParseException {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonPrimitive, "");
                    try {
                        if (jsonPrimitive.isString()) {
                            java.lang.String asString = jsonPrimitive.getAsString();
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asString, "");
                            return new com.datadog.android.rum.model.ResourceEvent.Path.String(asString);
                        }
                        throw new com.google.gson.JsonParseException("Can't convert jsonPrimitive to String");
                    } catch (java.lang.IllegalStateException e) {
                        throw new com.google.gson.JsonParseException("Unable to parse json into type String", e);
                    } catch (java.lang.UnsupportedOperationException e2) {
                        throw new com.google.gson.JsonParseException("Unable to parse json into type String", e2);
                    }
                }

                public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }
            }

            public final java.lang.String toString() {
                java.lang.String str = this.item;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("String(item=");
                sb.append(str);
                sb.append(")");
                return sb.toString();
            }

            public final int hashCode() {
                return this.item.hashCode();
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof com.datadog.android.rum.model.ResourceEvent.Path.String) && kotlin.jvm.internal.Intrinsics.areEqual(this.item, ((com.datadog.android.rum.model.ResourceEvent.Path.String) other).item);
            }

            public final com.datadog.android.rum.model.ResourceEvent.Path.String copy(java.lang.String item) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(item, "");
                return new com.datadog.android.rum.model.ResourceEvent.Path.String(item);
            }

            /* renamed from: component1, reason: from getter */
            public final java.lang.String getItem() {
                return this.item;
            }

            @kotlin.jvm.JvmStatic
            public static final com.datadog.android.rum.model.ResourceEvent.Path.String fromJsonPrimitive(com.google.gson.JsonPrimitive jsonPrimitive) throws com.google.gson.JsonParseException {
                return INSTANCE.fromJsonPrimitive(jsonPrimitive);
            }

            @kotlin.jvm.JvmStatic
            public static final com.datadog.android.rum.model.ResourceEvent.Path.String fromJson(java.lang.String str) throws com.google.gson.JsonParseException {
                return INSTANCE.fromJson(str);
            }

            public static /* synthetic */ com.datadog.android.rum.model.ResourceEvent.Path.String copy$default(com.datadog.android.rum.model.ResourceEvent.Path.String string, java.lang.String str, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    str = string.item;
                }
                return string.copy(str);
            }
        }

        @kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\b\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\u0007"}, d2 = {"Lcom/datadog/android/rum/model/ResourceEvent$Path$Long;", "Lcom/datadog/android/rum/model/ResourceEvent$Path;", "", "item", "<init>", "(J)V", "component1", "()J", "copy", "(J)Lcom/datadog/android/rum/model/ResourceEvent$Path$Long;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lcom/google/gson/JsonElement;", "toJson", "()Lcom/google/gson/JsonElement;", "", "toString", "()Ljava/lang/String;", "J", "getItem", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final /* data */ class Long extends com.datadog.android.rum.model.ResourceEvent.Path {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final com.datadog.android.rum.model.ResourceEvent.Path.Long.Companion INSTANCE = new com.datadog.android.rum.model.ResourceEvent.Path.Long.Companion(null);
            private final long item;

            public final long getItem() {
                return this.item;
            }

            public Long(long j) {
                super(null);
                this.item = j;
            }

            @Override // com.datadog.android.rum.model.ResourceEvent.Path
            public final com.google.gson.JsonElement toJson() {
                return new com.google.gson.JsonPrimitive(java.lang.Long.valueOf(this.item));
            }

            @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/datadog/android/rum/model/ResourceEvent$Path$Long$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/rum/model/ResourceEvent$Path$Long;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/rum/model/ResourceEvent$Path$Long;", "Lcom/google/gson/JsonPrimitive;", "jsonPrimitive", "fromJsonPrimitive", "(Lcom/google/gson/JsonPrimitive;)Lcom/datadog/android/rum/model/ResourceEvent$Path$Long;"}, k = 1, mv = {1, 8, 0}, xi = 48)
            public static final class Companion {
                private Companion() {
                }

                @kotlin.jvm.JvmStatic
                public final com.datadog.android.rum.model.ResourceEvent.Path.Long fromJson(java.lang.String jsonString) throws com.google.gson.JsonParseException {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonString, "");
                    try {
                        com.google.gson.JsonPrimitive asJsonPrimitive = com.google.gson.JsonParser.parseString(jsonString).getAsJsonPrimitive();
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asJsonPrimitive, "");
                        return fromJsonPrimitive(asJsonPrimitive);
                    } catch (java.lang.IllegalStateException e) {
                        throw new com.google.gson.JsonParseException("Unable to parse json into type Long", e);
                    }
                }

                @kotlin.jvm.JvmStatic
                public final com.datadog.android.rum.model.ResourceEvent.Path.Long fromJsonPrimitive(com.google.gson.JsonPrimitive jsonPrimitive) throws com.google.gson.JsonParseException {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonPrimitive, "");
                    try {
                        if (jsonPrimitive.isNumber()) {
                            return new com.datadog.android.rum.model.ResourceEvent.Path.Long(jsonPrimitive.getAsLong());
                        }
                        throw new com.google.gson.JsonParseException("Can't convert jsonPrimitive to Long");
                    } catch (java.lang.IllegalStateException e) {
                        throw new com.google.gson.JsonParseException("Unable to parse json into type Long", e);
                    } catch (java.lang.NumberFormatException e2) {
                        throw new com.google.gson.JsonParseException("Unable to parse json into type Long", e2);
                    } catch (java.lang.UnsupportedOperationException e3) {
                        throw new com.google.gson.JsonParseException("Unable to parse json into type Long", e3);
                    }
                }

                public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }
            }

            public final java.lang.String toString() {
                long j = this.item;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Long(item=");
                sb.append(j);
                sb.append(")");
                return sb.toString();
            }

            public final int hashCode() {
                return java.lang.Long.hashCode(this.item);
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof com.datadog.android.rum.model.ResourceEvent.Path.Long) && this.item == ((com.datadog.android.rum.model.ResourceEvent.Path.Long) other).item;
            }

            public final com.datadog.android.rum.model.ResourceEvent.Path.Long copy(long item) {
                return new com.datadog.android.rum.model.ResourceEvent.Path.Long(item);
            }

            /* renamed from: component1, reason: from getter */
            public final long getItem() {
                return this.item;
            }

            @kotlin.jvm.JvmStatic
            public static final com.datadog.android.rum.model.ResourceEvent.Path.Long fromJsonPrimitive(com.google.gson.JsonPrimitive jsonPrimitive) throws com.google.gson.JsonParseException {
                return INSTANCE.fromJsonPrimitive(jsonPrimitive);
            }

            @kotlin.jvm.JvmStatic
            public static final com.datadog.android.rum.model.ResourceEvent.Path.Long fromJson(java.lang.String str) throws com.google.gson.JsonParseException {
                return INSTANCE.fromJson(str);
            }

            public static /* synthetic */ com.datadog.android.rum.model.ResourceEvent.Path.Long copy$default(com.datadog.android.rum.model.ResourceEvent.Path.Long r0, long j, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    j = r0.item;
                }
                return r0.copy(j);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/datadog/android/rum/model/ResourceEvent$Path$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/rum/model/ResourceEvent$Path;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/rum/model/ResourceEvent$Path;", "Lcom/google/gson/JsonElement;", "jsonElement", "fromJsonElement", "(Lcom/google/gson/JsonElement;)Lcom/datadog/android/rum/model/ResourceEvent$Path;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @kotlin.jvm.JvmStatic
            public final com.datadog.android.rum.model.ResourceEvent.Path fromJson(java.lang.String jsonString) throws com.google.gson.JsonParseException {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonString, "");
                try {
                    com.google.gson.JsonElement parseString = com.google.gson.JsonParser.parseString(jsonString);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(parseString, "");
                    return fromJsonElement(parseString);
                } catch (java.lang.IllegalStateException e) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into one of type Path", e);
                }
            }

            @kotlin.jvm.JvmStatic
            public final com.datadog.android.rum.model.ResourceEvent.Path fromJsonElement(com.google.gson.JsonElement jsonElement) throws com.google.gson.JsonParseException {
                com.datadog.android.rum.model.ResourceEvent.Path.String string;
                com.datadog.android.rum.model.ResourceEvent.Path.Long r13;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonElement, "");
                java.util.ArrayList arrayList = new java.util.ArrayList();
                boolean z = jsonElement instanceof com.google.gson.JsonPrimitive;
                com.datadog.android.rum.model.ResourceEvent.Path path = null;
                try {
                } catch (com.google.gson.JsonParseException e) {
                    arrayList.add(e);
                    string = null;
                }
                if (z) {
                    string = com.datadog.android.rum.model.ResourceEvent.Path.String.INSTANCE.fromJsonPrimitive((com.google.gson.JsonPrimitive) jsonElement);
                    try {
                    } catch (com.google.gson.JsonParseException e2) {
                        arrayList.add(e2);
                        r13 = null;
                    }
                    if (z) {
                        r13 = com.datadog.android.rum.model.ResourceEvent.Path.Long.INSTANCE.fromJsonPrimitive((com.google.gson.JsonPrimitive) jsonElement);
                        int i = 0;
                        com.datadog.android.rum.model.ResourceEvent.Path[] pathArr = {string, r13};
                        while (true) {
                            if (i < 2) {
                                com.datadog.android.rum.model.ResourceEvent.Path path2 = pathArr[i];
                                if (path2 != null) {
                                    path = path2;
                                    break;
                                }
                                i++;
                            } else {
                                break;
                            }
                        }
                        if (path != null) {
                            return path;
                        }
                        throw new com.google.gson.JsonParseException("Unable to parse json into one of type \nPath\n".concat(java.lang.String.valueOf(kotlin.collections.CollectionsKt.joinToString$default(arrayList, com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.NEW_LINE, null, null, 0, null, new kotlin.jvm.functions.Function1<java.lang.Throwable, java.lang.CharSequence>() { // from class: com.datadog.android.rum.model.ResourceEvent$Path$Companion$fromJsonElement$message$1
                            @Override // kotlin.jvm.functions.Function1
                            /* renamed from: getHighSpeedVideoFpsRangesFor, reason: merged with bridge method [inline-methods] */
                            public final java.lang.CharSequence invoke(java.lang.Throwable th) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(th, "");
                                return java.lang.String.valueOf(th.getMessage());
                            }
                        }, 30, null))));
                    }
                    throw new com.google.gson.JsonParseException("Unable to parse json into type kotlin.Long");
                }
                throw new com.google.gson.JsonParseException("Unable to parse json into type kotlin.String");
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        @kotlin.jvm.JvmStatic
        public static final com.datadog.android.rum.model.ResourceEvent.Path fromJsonElement(com.google.gson.JsonElement jsonElement) throws com.google.gson.JsonParseException {
            return INSTANCE.fromJsonElement(jsonElement);
        }

        @kotlin.jvm.JvmStatic
        public static final com.datadog.android.rum.model.ResourceEvent.Path fromJson(java.lang.String str) throws com.google.gson.JsonParseException {
            return INSTANCE.fromJson(str);
        }

        public /* synthetic */ Path(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0086\u0001\u0018\u0000 \f2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u000b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014"}, d2 = {"Lcom/datadog/android/rum/model/ResourceEvent$ResourceEventSource;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Lcom/google/gson/JsonElement;", "toJson", "()Lcom/google/gson/JsonElement;", "getHighSpeedVideoFpsRanges", "Ljava/lang/String;", "getHighResolutionOutputSizeshNQ4ISI", "Companion", "ANDROID", "IOS", "BROWSER", "FLUTTER", "REACT_NATIVE", "ROKU", "UNITY", "KOTLIN_MULTIPLATFORM"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public enum ResourceEventSource {
        ANDROID(com.datadog.android.core.internal.CoreFeature.DEFAULT_SOURCE_NAME),
        IOS("ios"),
        BROWSER("browser"),
        FLUTTER("flutter"),
        REACT_NATIVE("react-native"),
        ROKU("roku"),
        UNITY("unity"),
        KOTLIN_MULTIPLATFORM("kotlin-multiplatform");


        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.datadog.android.rum.model.ResourceEvent.ResourceEventSource.Companion INSTANCE = new com.datadog.android.rum.model.ResourceEvent.ResourceEventSource.Companion(null);

        /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
        private final java.lang.String getHighResolutionOutputSizeshNQ4ISI;

        ResourceEventSource(java.lang.String str) {
            this.getHighResolutionOutputSizeshNQ4ISI = str;
        }

        public final com.google.gson.JsonElement toJson() {
            return new com.google.gson.JsonPrimitive(this.getHighResolutionOutputSizeshNQ4ISI);
        }

        @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/datadog/android/rum/model/ResourceEvent$ResourceEventSource$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/rum/model/ResourceEvent$ResourceEventSource;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/rum/model/ResourceEvent$ResourceEventSource;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @kotlin.jvm.JvmStatic
            public final com.datadog.android.rum.model.ResourceEvent.ResourceEventSource fromJson(java.lang.String jsonString) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonString, "");
                for (com.datadog.android.rum.model.ResourceEvent.ResourceEventSource resourceEventSource : com.datadog.android.rum.model.ResourceEvent.ResourceEventSource.values()) {
                    if (kotlin.jvm.internal.Intrinsics.areEqual(resourceEventSource.getHighResolutionOutputSizeshNQ4ISI, jsonString)) {
                        return resourceEventSource;
                    }
                }
                throw new java.util.NoSuchElementException("Array contains no element matching the predicate.");
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        @kotlin.jvm.JvmStatic
        public static final com.datadog.android.rum.model.ResourceEvent.ResourceEventSource fromJson(java.lang.String str) {
            return INSTANCE.fromJson(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0001\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nj\u0002\b\fj\u0002\b\rj\u0002\b\u000e"}, d2 = {"Lcom/datadog/android/rum/model/ResourceEvent$ResourceEventSessionType;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Lcom/google/gson/JsonElement;", "toJson", "()Lcom/google/gson/JsonElement;", "getHighSpeedVideoFpsRangesFor", "Ljava/lang/String;", "Companion", "USER", "SYNTHETICS", "CI_TEST"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public enum ResourceEventSessionType {
        USER("user"),
        SYNTHETICS("synthetics"),
        CI_TEST("ci_test");


        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.datadog.android.rum.model.ResourceEvent.ResourceEventSessionType.Companion INSTANCE = new com.datadog.android.rum.model.ResourceEvent.ResourceEventSessionType.Companion(null);
        private final java.lang.String getHighSpeedVideoFpsRangesFor;

        ResourceEventSessionType(java.lang.String str) {
            this.getHighSpeedVideoFpsRangesFor = str;
        }

        public final com.google.gson.JsonElement toJson() {
            return new com.google.gson.JsonPrimitive(this.getHighSpeedVideoFpsRangesFor);
        }

        @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/datadog/android/rum/model/ResourceEvent$ResourceEventSessionType$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/rum/model/ResourceEvent$ResourceEventSessionType;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/rum/model/ResourceEvent$ResourceEventSessionType;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @kotlin.jvm.JvmStatic
            public final com.datadog.android.rum.model.ResourceEvent.ResourceEventSessionType fromJson(java.lang.String jsonString) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonString, "");
                for (com.datadog.android.rum.model.ResourceEvent.ResourceEventSessionType resourceEventSessionType : com.datadog.android.rum.model.ResourceEvent.ResourceEventSessionType.values()) {
                    if (kotlin.jvm.internal.Intrinsics.areEqual(resourceEventSessionType.getHighSpeedVideoFpsRangesFor, jsonString)) {
                        return resourceEventSessionType;
                    }
                }
                throw new java.util.NoSuchElementException("Array contains no element matching the predicate.");
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        @kotlin.jvm.JvmStatic
        public static final com.datadog.android.rum.model.ResourceEvent.ResourceEventSessionType fromJson(java.lang.String str) {
            return INSTANCE.fromJson(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0001\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nj\u0002\b\fj\u0002\b\rj\u0002\b\u000e"}, d2 = {"Lcom/datadog/android/rum/model/ResourceEvent$Status;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Lcom/google/gson/JsonElement;", "toJson", "()Lcom/google/gson/JsonElement;", "getHighResolutionOutputSizeshNQ4ISI", "Ljava/lang/String;", "Companion", "CONNECTED", "NOT_CONNECTED", "MAYBE"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public enum Status {
        CONNECTED("connected"),
        NOT_CONNECTED("not_connected"),
        MAYBE("maybe");


        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.datadog.android.rum.model.ResourceEvent.Status.Companion INSTANCE = new com.datadog.android.rum.model.ResourceEvent.Status.Companion(null);
        private final java.lang.String getHighResolutionOutputSizeshNQ4ISI;

        Status(java.lang.String str) {
            this.getHighResolutionOutputSizeshNQ4ISI = str;
        }

        public final com.google.gson.JsonElement toJson() {
            return new com.google.gson.JsonPrimitive(this.getHighResolutionOutputSizeshNQ4ISI);
        }

        @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/datadog/android/rum/model/ResourceEvent$Status$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/rum/model/ResourceEvent$Status;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/rum/model/ResourceEvent$Status;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @kotlin.jvm.JvmStatic
            public final com.datadog.android.rum.model.ResourceEvent.Status fromJson(java.lang.String jsonString) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonString, "");
                for (com.datadog.android.rum.model.ResourceEvent.Status status : com.datadog.android.rum.model.ResourceEvent.Status.values()) {
                    if (kotlin.jvm.internal.Intrinsics.areEqual(status.getHighResolutionOutputSizeshNQ4ISI, jsonString)) {
                        return status;
                    }
                }
                throw new java.util.NoSuchElementException("Array contains no element matching the predicate.");
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        @kotlin.jvm.JvmStatic
        public static final com.datadog.android.rum.model.ResourceEvent.Status fromJson(java.lang.String str) {
            return INSTANCE.fromJson(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0086\u0001\u0018\u0000 \f2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u000b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015"}, d2 = {"Lcom/datadog/android/rum/model/ResourceEvent$Interface;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Lcom/google/gson/JsonElement;", "toJson", "()Lcom/google/gson/JsonElement;", "Camera2StreamConfigurationMap", "Ljava/lang/String;", "getHighSpeedVideoFpsRanges", "Companion", "BLUETOOTH", "CELLULAR", "ETHERNET", "WIFI", "WIMAX", "MIXED", "OTHER", "UNKNOWN", "NONE"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes8.dex */
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
        public static final com.datadog.android.rum.model.ResourceEvent.Interface.Companion INSTANCE = new com.datadog.android.rum.model.ResourceEvent.Interface.Companion(null);

        /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
        private final java.lang.String getHighSpeedVideoFpsRanges;

        Interface(java.lang.String str) {
            this.getHighSpeedVideoFpsRanges = str;
        }

        public final com.google.gson.JsonElement toJson() {
            return new com.google.gson.JsonPrimitive(this.getHighSpeedVideoFpsRanges);
        }

        @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/datadog/android/rum/model/ResourceEvent$Interface$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/rum/model/ResourceEvent$Interface;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/rum/model/ResourceEvent$Interface;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @kotlin.jvm.JvmStatic
            public final com.datadog.android.rum.model.ResourceEvent.Interface fromJson(java.lang.String jsonString) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonString, "");
                for (com.datadog.android.rum.model.ResourceEvent.Interface r3 : com.datadog.android.rum.model.ResourceEvent.Interface.values()) {
                    if (kotlin.jvm.internal.Intrinsics.areEqual(r3.getHighSpeedVideoFpsRanges, jsonString)) {
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
        public static final com.datadog.android.rum.model.ResourceEvent.Interface fromJson(java.lang.String str) {
            return INSTANCE.fromJson(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\u0001\u0018\u0000 \f2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u000b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010"}, d2 = {"Lcom/datadog/android/rum/model/ResourceEvent$EffectiveType;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Lcom/google/gson/JsonElement;", "toJson", "()Lcom/google/gson/JsonElement;", "getHighSpeedVideoFpsRanges", "Ljava/lang/String;", "getHighSpeedVideoSizes", "Companion", "SLOW_2G", "2G", "3G", "4G"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes7.dex */
    public enum EffectiveType {
        SLOW_2G("slow-2g"),
        f152G("2g"),
        f163G("3g"),
        f174G("4g");


        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.datadog.android.rum.model.ResourceEvent.EffectiveType.Companion INSTANCE = new com.datadog.android.rum.model.ResourceEvent.EffectiveType.Companion(null);

        /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
        private final java.lang.String getHighSpeedVideoSizes;

        EffectiveType(java.lang.String str) {
            this.getHighSpeedVideoSizes = str;
        }

        public final com.google.gson.JsonElement toJson() {
            return new com.google.gson.JsonPrimitive(this.getHighSpeedVideoSizes);
        }

        @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/datadog/android/rum/model/ResourceEvent$EffectiveType$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/rum/model/ResourceEvent$EffectiveType;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/rum/model/ResourceEvent$EffectiveType;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @kotlin.jvm.JvmStatic
            public final com.datadog.android.rum.model.ResourceEvent.EffectiveType fromJson(java.lang.String jsonString) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonString, "");
                for (com.datadog.android.rum.model.ResourceEvent.EffectiveType effectiveType : com.datadog.android.rum.model.ResourceEvent.EffectiveType.values()) {
                    if (kotlin.jvm.internal.Intrinsics.areEqual(effectiveType.getHighSpeedVideoSizes, jsonString)) {
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
        public static final com.datadog.android.rum.model.ResourceEvent.EffectiveType fromJson(java.lang.String str) {
            return INSTANCE.fromJson(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\b\u0086\u0001\u0018\u0000 \f2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u000b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013"}, d2 = {"Lcom/datadog/android/rum/model/ResourceEvent$DeviceType;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Lcom/google/gson/JsonElement;", "toJson", "()Lcom/google/gson/JsonElement;", "getHighResolutionOutputSizeshNQ4ISI", "Ljava/lang/String;", "Camera2StreamConfigurationMap", "Companion", "MOBILE", "DESKTOP", "TABLET", "TV", "GAMING_CONSOLE", "BOT", "OTHER"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes7.dex */
    public enum DeviceType {
        MOBILE("mobile"),
        DESKTOP("desktop"),
        TABLET("tablet"),
        TV("tv"),
        GAMING_CONSOLE("gaming_console"),
        BOT("bot"),
        OTHER("other");


        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.datadog.android.rum.model.ResourceEvent.DeviceType.Companion INSTANCE = new com.datadog.android.rum.model.ResourceEvent.DeviceType.Companion(null);

        /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
        private final java.lang.String Camera2StreamConfigurationMap;

        DeviceType(java.lang.String str) {
            this.Camera2StreamConfigurationMap = str;
        }

        public final com.google.gson.JsonElement toJson() {
            return new com.google.gson.JsonPrimitive(this.Camera2StreamConfigurationMap);
        }

        @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/datadog/android/rum/model/ResourceEvent$DeviceType$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/rum/model/ResourceEvent$DeviceType;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/rum/model/ResourceEvent$DeviceType;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @kotlin.jvm.JvmStatic
            public final com.datadog.android.rum.model.ResourceEvent.DeviceType fromJson(java.lang.String jsonString) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonString, "");
                for (com.datadog.android.rum.model.ResourceEvent.DeviceType deviceType : com.datadog.android.rum.model.ResourceEvent.DeviceType.values()) {
                    if (kotlin.jvm.internal.Intrinsics.areEqual(deviceType.Camera2StreamConfigurationMap, jsonString)) {
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
        public static final com.datadog.android.rum.model.ResourceEvent.DeviceType fromJson(java.lang.String str) {
            return INSTANCE.fromJson(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0086\u0001\u0018\u0000 \f2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u000b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017"}, d2 = {"Lcom/datadog/android/rum/model/ResourceEvent$ResourceType;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Lcom/google/gson/JsonElement;", "toJson", "()Lcom/google/gson/JsonElement;", "getHighSpeedVideoFpsRangesFor", "Ljava/lang/String;", "getHighSpeedVideoFpsRanges", "Companion", "DOCUMENT", "XHR", "BEACON", "FETCH", "CSS", "JS", "IMAGE", "FONT", "MEDIA", "OTHER", "NATIVE"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public enum ResourceType {
        DOCUMENT("document"),
        XHR("xhr"),
        BEACON("beacon"),
        FETCH("fetch"),
        CSS("css"),
        JS("js"),
        IMAGE("image"),
        FONT(io.ktor.http.ContentType.Font.TYPE),
        MEDIA(io.ktor.http.LinkHeader.Parameters.Media),
        OTHER("other"),
        NATIVE("native");


        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.datadog.android.rum.model.ResourceEvent.ResourceType.Companion INSTANCE = new com.datadog.android.rum.model.ResourceEvent.ResourceType.Companion(null);

        /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
        private final java.lang.String getHighSpeedVideoFpsRanges;

        ResourceType(java.lang.String str) {
            this.getHighSpeedVideoFpsRanges = str;
        }

        public final com.google.gson.JsonElement toJson() {
            return new com.google.gson.JsonPrimitive(this.getHighSpeedVideoFpsRanges);
        }

        @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/datadog/android/rum/model/ResourceEvent$ResourceType$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/rum/model/ResourceEvent$ResourceType;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/rum/model/ResourceEvent$ResourceType;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @kotlin.jvm.JvmStatic
            public final com.datadog.android.rum.model.ResourceEvent.ResourceType fromJson(java.lang.String jsonString) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonString, "");
                for (com.datadog.android.rum.model.ResourceEvent.ResourceType resourceType : com.datadog.android.rum.model.ResourceEvent.ResourceType.values()) {
                    if (kotlin.jvm.internal.Intrinsics.areEqual(resourceType.getHighSpeedVideoFpsRanges, jsonString)) {
                        return resourceType;
                    }
                }
                throw new java.util.NoSuchElementException("Array contains no element matching the predicate.");
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        @kotlin.jvm.JvmStatic
        public static final com.datadog.android.rum.model.ResourceEvent.ResourceType fromJson(java.lang.String str) {
            return INSTANCE.fromJson(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0086\u0001\u0018\u0000 \f2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u000b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015"}, d2 = {"Lcom/datadog/android/rum/model/ResourceEvent$Method;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Lcom/google/gson/JsonElement;", "toJson", "()Lcom/google/gson/JsonElement;", "getHighResolutionOutputSizeshNQ4ISI", "Ljava/lang/String;", "getHighSpeedVideoSizes", "Companion", "POST", "GET", com.datadog.android.internal.network.HttpSpec.Method.HEAD, com.datadog.android.internal.network.HttpSpec.Method.PUT, com.datadog.android.internal.network.HttpSpec.Method.DELETE, "PATCH", com.datadog.android.internal.network.HttpSpec.Method.TRACE, "OPTIONS", com.datadog.android.internal.network.HttpSpec.Method.CONNECT}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public enum Method {
        POST("POST"),
        GET("GET"),
        HEAD(com.datadog.android.internal.network.HttpSpec.Method.HEAD),
        PUT(com.datadog.android.internal.network.HttpSpec.Method.PUT),
        DELETE(com.datadog.android.internal.network.HttpSpec.Method.DELETE),
        PATCH("PATCH"),
        TRACE(com.datadog.android.internal.network.HttpSpec.Method.TRACE),
        OPTIONS("OPTIONS"),
        CONNECT(com.datadog.android.internal.network.HttpSpec.Method.CONNECT);


        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.datadog.android.rum.model.ResourceEvent.Method.Companion INSTANCE = new com.datadog.android.rum.model.ResourceEvent.Method.Companion(null);

        /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
        private final java.lang.String getHighSpeedVideoSizes;

        Method(java.lang.String str) {
            this.getHighSpeedVideoSizes = str;
        }

        public final com.google.gson.JsonElement toJson() {
            return new com.google.gson.JsonPrimitive(this.getHighSpeedVideoSizes);
        }

        @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/datadog/android/rum/model/ResourceEvent$Method$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/rum/model/ResourceEvent$Method;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/rum/model/ResourceEvent$Method;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @kotlin.jvm.JvmStatic
            public final com.datadog.android.rum.model.ResourceEvent.Method fromJson(java.lang.String jsonString) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonString, "");
                for (com.datadog.android.rum.model.ResourceEvent.Method method : com.datadog.android.rum.model.ResourceEvent.Method.values()) {
                    if (kotlin.jvm.internal.Intrinsics.areEqual(method.getHighSpeedVideoSizes, jsonString)) {
                        return method;
                    }
                }
                throw new java.util.NoSuchElementException("Array contains no element matching the predicate.");
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        @kotlin.jvm.JvmStatic
        public static final com.datadog.android.rum.model.ResourceEvent.Method fromJson(java.lang.String str) {
            return INSTANCE.fromJson(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0001\u0018\u0000 \f2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u000b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nj\u0002\b\rj\u0002\b\u000e"}, d2 = {"Lcom/datadog/android/rum/model/ResourceEvent$RenderBlockingStatus;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Lcom/google/gson/JsonElement;", "toJson", "()Lcom/google/gson/JsonElement;", "getHighSpeedVideoSizes", "Ljava/lang/String;", "Camera2StreamConfigurationMap", "Companion", "BLOCKING", "NON_BLOCKING"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public enum RenderBlockingStatus {
        BLOCKING("blocking"),
        NON_BLOCKING("non-blocking");


        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.datadog.android.rum.model.ResourceEvent.RenderBlockingStatus.Companion INSTANCE = new com.datadog.android.rum.model.ResourceEvent.RenderBlockingStatus.Companion(null);

        /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
        private final java.lang.String Camera2StreamConfigurationMap;

        RenderBlockingStatus(java.lang.String str) {
            this.Camera2StreamConfigurationMap = str;
        }

        public final com.google.gson.JsonElement toJson() {
            return new com.google.gson.JsonPrimitive(this.Camera2StreamConfigurationMap);
        }

        @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/datadog/android/rum/model/ResourceEvent$RenderBlockingStatus$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/rum/model/ResourceEvent$RenderBlockingStatus;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/rum/model/ResourceEvent$RenderBlockingStatus;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @kotlin.jvm.JvmStatic
            public final com.datadog.android.rum.model.ResourceEvent.RenderBlockingStatus fromJson(java.lang.String jsonString) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonString, "");
                for (com.datadog.android.rum.model.ResourceEvent.RenderBlockingStatus renderBlockingStatus : com.datadog.android.rum.model.ResourceEvent.RenderBlockingStatus.values()) {
                    if (kotlin.jvm.internal.Intrinsics.areEqual(renderBlockingStatus.Camera2StreamConfigurationMap, jsonString)) {
                        return renderBlockingStatus;
                    }
                }
                throw new java.util.NoSuchElementException("Array contains no element matching the predicate.");
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        @kotlin.jvm.JvmStatic
        public static final com.datadog.android.rum.model.ResourceEvent.RenderBlockingStatus fromJson(java.lang.String str) {
            return INSTANCE.fromJson(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0001\u0018\u0000 \f2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u000b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f"}, d2 = {"Lcom/datadog/android/rum/model/ResourceEvent$DeliveryType;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Lcom/google/gson/JsonElement;", "toJson", "()Lcom/google/gson/JsonElement;", "getHighSpeedVideoFpsRanges", "Ljava/lang/String;", "getHighSpeedVideoSizes", "Companion", "CACHE", "NAVIGATIONAL_PREFETCH", "OTHER"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes7.dex */
    public enum DeliveryType {
        CACHE(com.datadog.trace.api.DDSpanTypes.CACHE),
        NAVIGATIONAL_PREFETCH("navigational-prefetch"),
        OTHER("other");


        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.datadog.android.rum.model.ResourceEvent.DeliveryType.Companion INSTANCE = new com.datadog.android.rum.model.ResourceEvent.DeliveryType.Companion(null);

        /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
        private final java.lang.String getHighSpeedVideoSizes;

        DeliveryType(java.lang.String str) {
            this.getHighSpeedVideoSizes = str;
        }

        public final com.google.gson.JsonElement toJson() {
            return new com.google.gson.JsonPrimitive(this.getHighSpeedVideoSizes);
        }

        @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/datadog/android/rum/model/ResourceEvent$DeliveryType$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/rum/model/ResourceEvent$DeliveryType;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/rum/model/ResourceEvent$DeliveryType;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @kotlin.jvm.JvmStatic
            public final com.datadog.android.rum.model.ResourceEvent.DeliveryType fromJson(java.lang.String jsonString) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonString, "");
                for (com.datadog.android.rum.model.ResourceEvent.DeliveryType deliveryType : com.datadog.android.rum.model.ResourceEvent.DeliveryType.values()) {
                    if (kotlin.jvm.internal.Intrinsics.areEqual(deliveryType.getHighSpeedVideoSizes, jsonString)) {
                        return deliveryType;
                    }
                }
                throw new java.util.NoSuchElementException("Array contains no element matching the predicate.");
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        @kotlin.jvm.JvmStatic
        public static final com.datadog.android.rum.model.ResourceEvent.DeliveryType fromJson(java.lang.String str) {
            return INSTANCE.fromJson(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u0004\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0001\u0018\u0000 \f2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u000b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nj\u0002\b\rj\u0002\b\u000e"}, d2 = {"Lcom/datadog/android/rum/model/ResourceEvent$Plan;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/Number;)V", "Lcom/google/gson/JsonElement;", "toJson", "()Lcom/google/gson/JsonElement;", "getHighSpeedVideoFpsRangesFor", "Ljava/lang/Number;", "getHighSpeedVideoSizes", "Companion", "PLAN_1", "PLAN_2"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public enum Plan {
        PLAN_1((java.lang.Number) 1),
        PLAN_2((java.lang.Number) 2);


        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.datadog.android.rum.model.ResourceEvent.Plan.Companion INSTANCE = new com.datadog.android.rum.model.ResourceEvent.Plan.Companion(null);

        /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
        private final java.lang.Number getHighSpeedVideoSizes;

        Plan(java.lang.Number number) {
            this.getHighSpeedVideoSizes = number;
        }

        public final com.google.gson.JsonElement toJson() {
            return new com.google.gson.JsonPrimitive(this.getHighSpeedVideoSizes);
        }

        @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/datadog/android/rum/model/ResourceEvent$Plan$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/rum/model/ResourceEvent$Plan;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/rum/model/ResourceEvent$Plan;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @kotlin.jvm.JvmStatic
            public final com.datadog.android.rum.model.ResourceEvent.Plan fromJson(java.lang.String jsonString) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonString, "");
                for (com.datadog.android.rum.model.ResourceEvent.Plan plan : com.datadog.android.rum.model.ResourceEvent.Plan.values()) {
                    if (kotlin.jvm.internal.Intrinsics.areEqual(plan.getHighSpeedVideoSizes.toString(), jsonString)) {
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
        public static final com.datadog.android.rum.model.ResourceEvent.Plan fromJson(java.lang.String str) {
            return INSTANCE.fromJson(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\b\u0086\u0001\u0018\u0000 \f2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u000b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013"}, d2 = {"Lcom/datadog/android/rum/model/ResourceEvent$SessionPrecondition;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Lcom/google/gson/JsonElement;", "toJson", "()Lcom/google/gson/JsonElement;", "getHighResolutionOutputSizeshNQ4ISI", "Ljava/lang/String;", "Camera2StreamConfigurationMap", "Companion", "USER_APP_LAUNCH", "INACTIVITY_TIMEOUT", "MAX_DURATION", "BACKGROUND_LAUNCH", "PREWARM", "FROM_NON_INTERACTIVE_SESSION", "EXPLICIT_STOP"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public enum SessionPrecondition {
        USER_APP_LAUNCH("user_app_launch"),
        INACTIVITY_TIMEOUT("inactivity_timeout"),
        MAX_DURATION(com.datadog.android.rum.internal.metric.slowframes.DefaultUISlownessMetricDispatcher.KEY_MAX_DURATION),
        BACKGROUND_LAUNCH("background_launch"),
        PREWARM("prewarm"),
        FROM_NON_INTERACTIVE_SESSION("from_non_interactive_session"),
        EXPLICIT_STOP("explicit_stop");


        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.datadog.android.rum.model.ResourceEvent.SessionPrecondition.Companion INSTANCE = new com.datadog.android.rum.model.ResourceEvent.SessionPrecondition.Companion(null);

        /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
        private final java.lang.String Camera2StreamConfigurationMap;

        SessionPrecondition(java.lang.String str) {
            this.Camera2StreamConfigurationMap = str;
        }

        public final com.google.gson.JsonElement toJson() {
            return new com.google.gson.JsonPrimitive(this.Camera2StreamConfigurationMap);
        }

        @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/datadog/android/rum/model/ResourceEvent$SessionPrecondition$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/rum/model/ResourceEvent$SessionPrecondition;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/rum/model/ResourceEvent$SessionPrecondition;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @kotlin.jvm.JvmStatic
            public final com.datadog.android.rum.model.ResourceEvent.SessionPrecondition fromJson(java.lang.String jsonString) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonString, "");
                for (com.datadog.android.rum.model.ResourceEvent.SessionPrecondition sessionPrecondition : com.datadog.android.rum.model.ResourceEvent.SessionPrecondition.values()) {
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
        public static final com.datadog.android.rum.model.ResourceEvent.SessionPrecondition fromJson(java.lang.String str) {
            return INSTANCE.fromJson(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0086\u0001\u0018\u0000 \f2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u000b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001a"}, d2 = {"Lcom/datadog/android/rum/model/ResourceEvent$ProviderType;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Lcom/google/gson/JsonElement;", "toJson", "()Lcom/google/gson/JsonElement;", "getHighSpeedVideoFpsRangesFor", "Ljava/lang/String;", "Camera2StreamConfigurationMap", "Companion", "AD", "ADVERTISING", "ANALYTICS", "CDN", "CONTENT", "CUSTOMER_SUCCESS", "FIRST_PARTY", "HOSTING", "MARKETING", "OTHER", "SOCIAL", "TAG_MANAGER", "UTILITY", "VIDEO"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public enum ProviderType {
        AD("ad"),
        ADVERTISING("advertising"),
        ANALYTICS("analytics"),
        CDN("cdn"),
        CONTENT("content"),
        CUSTOMER_SUCCESS("customer-success"),
        FIRST_PARTY("first party"),
        HOSTING("hosting"),
        MARKETING("marketing"),
        OTHER("other"),
        SOCIAL(androidx.core.app.NotificationCompat.CATEGORY_SOCIAL),
        TAG_MANAGER("tag-manager"),
        UTILITY("utility"),
        VIDEO("video");


        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.datadog.android.rum.model.ResourceEvent.ProviderType.Companion INSTANCE = new com.datadog.android.rum.model.ResourceEvent.ProviderType.Companion(null);

        /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
        private final java.lang.String Camera2StreamConfigurationMap;

        ProviderType(java.lang.String str) {
            this.Camera2StreamConfigurationMap = str;
        }

        public final com.google.gson.JsonElement toJson() {
            return new com.google.gson.JsonPrimitive(this.Camera2StreamConfigurationMap);
        }

        @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/datadog/android/rum/model/ResourceEvent$ProviderType$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/rum/model/ResourceEvent$ProviderType;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/rum/model/ResourceEvent$ProviderType;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @kotlin.jvm.JvmStatic
            public final com.datadog.android.rum.model.ResourceEvent.ProviderType fromJson(java.lang.String jsonString) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonString, "");
                for (com.datadog.android.rum.model.ResourceEvent.ProviderType providerType : com.datadog.android.rum.model.ResourceEvent.ProviderType.values()) {
                    if (kotlin.jvm.internal.Intrinsics.areEqual(providerType.Camera2StreamConfigurationMap, jsonString)) {
                        return providerType;
                    }
                }
                throw new java.util.NoSuchElementException("Array contains no element matching the predicate.");
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        @kotlin.jvm.JvmStatic
        public static final com.datadog.android.rum.model.ResourceEvent.ProviderType fromJson(java.lang.String str) {
            return INSTANCE.fromJson(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0001\u0018\u0000 \f2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u000b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f"}, d2 = {"Lcom/datadog/android/rum/model/ResourceEvent$OperationType;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Lcom/google/gson/JsonElement;", "toJson", "()Lcom/google/gson/JsonElement;", "getHighSpeedVideoFpsRangesFor", "Ljava/lang/String;", "Camera2StreamConfigurationMap", "Companion", "QUERY", "MUTATION", "SUBSCRIPTION"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public enum OperationType {
        QUERY("query"),
        MUTATION("mutation"),
        SUBSCRIPTION("subscription");


        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.datadog.android.rum.model.ResourceEvent.OperationType.Companion INSTANCE = new com.datadog.android.rum.model.ResourceEvent.OperationType.Companion(null);

        /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
        private final java.lang.String Camera2StreamConfigurationMap;

        OperationType(java.lang.String str) {
            this.Camera2StreamConfigurationMap = str;
        }

        public final com.google.gson.JsonElement toJson() {
            return new com.google.gson.JsonPrimitive(this.Camera2StreamConfigurationMap);
        }

        @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/datadog/android/rum/model/ResourceEvent$OperationType$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/rum/model/ResourceEvent$OperationType;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/rum/model/ResourceEvent$OperationType;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @kotlin.jvm.JvmStatic
            public final com.datadog.android.rum.model.ResourceEvent.OperationType fromJson(java.lang.String jsonString) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonString, "");
                for (com.datadog.android.rum.model.ResourceEvent.OperationType operationType : com.datadog.android.rum.model.ResourceEvent.OperationType.values()) {
                    if (kotlin.jvm.internal.Intrinsics.areEqual(operationType.Camera2StreamConfigurationMap, jsonString)) {
                        return operationType;
                    }
                }
                throw new java.util.NoSuchElementException("Array contains no element matching the predicate.");
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        @kotlin.jvm.JvmStatic
        public static final com.datadog.android.rum.model.ResourceEvent.OperationType fromJson(java.lang.String str) {
            return INSTANCE.fromJson(str);
        }
    }

    public final java.lang.String toString() {
        long j = this.date;
        com.datadog.android.rum.model.ResourceEvent.Application application = this.application;
        java.lang.String str = this.service;
        java.lang.String str2 = this.version;
        java.lang.String str3 = this.buildVersion;
        java.lang.String str4 = this.buildId;
        java.lang.String str5 = this.ddtags;
        com.datadog.android.rum.model.ResourceEvent.ResourceEventSession resourceEventSession = this.session;
        com.datadog.android.rum.model.ResourceEvent.ResourceEventSource resourceEventSource = this.source;
        com.datadog.android.rum.model.ResourceEvent.ResourceEventView resourceEventView = this.view;
        com.datadog.android.rum.model.ResourceEvent.Usr usr = this.usr;
        com.datadog.android.rum.model.ResourceEvent.Account account = this.account;
        com.datadog.android.rum.model.ResourceEvent.Connectivity connectivity = this.connectivity;
        com.datadog.android.rum.model.ResourceEvent.Display display = this.display;
        com.datadog.android.rum.model.ResourceEvent.Synthetics synthetics = this.synthetics;
        com.datadog.android.rum.model.ResourceEvent.CiTest ciTest = this.ciTest;
        com.datadog.android.rum.model.ResourceEvent.Os os = this.os;
        com.datadog.android.rum.model.ResourceEvent.Device device = this.device;
        com.datadog.android.rum.model.ResourceEvent.Dd dd = this.dd;
        com.datadog.android.rum.model.ResourceEvent.Context context = this.context;
        com.datadog.android.rum.model.ResourceEvent.Action action = this.action;
        com.datadog.android.rum.model.ResourceEvent.Container container = this.container;
        com.datadog.android.rum.model.ResourceEvent.Resource resource = this.resource;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ResourceEvent(date=");
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
        sb.append(resourceEventSession);
        sb.append(", source=");
        sb.append(resourceEventSource);
        sb.append(", view=");
        sb.append(resourceEventView);
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
        sb.append(", action=");
        sb.append(action);
        sb.append(", container=");
        sb.append(container);
        sb.append(", resource=");
        sb.append(resource);
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
        com.datadog.android.rum.model.ResourceEvent.ResourceEventSource resourceEventSource = this.source;
        int hashCode9 = resourceEventSource == null ? 0 : resourceEventSource.hashCode();
        int hashCode10 = this.view.hashCode();
        com.datadog.android.rum.model.ResourceEvent.Usr usr = this.usr;
        int hashCode11 = usr == null ? 0 : usr.hashCode();
        com.datadog.android.rum.model.ResourceEvent.Account account = this.account;
        int hashCode12 = account == null ? 0 : account.hashCode();
        com.datadog.android.rum.model.ResourceEvent.Connectivity connectivity = this.connectivity;
        int hashCode13 = connectivity == null ? 0 : connectivity.hashCode();
        com.datadog.android.rum.model.ResourceEvent.Display display = this.display;
        int hashCode14 = display == null ? 0 : display.hashCode();
        com.datadog.android.rum.model.ResourceEvent.Synthetics synthetics = this.synthetics;
        int hashCode15 = synthetics == null ? 0 : synthetics.hashCode();
        com.datadog.android.rum.model.ResourceEvent.CiTest ciTest = this.ciTest;
        int hashCode16 = ciTest == null ? 0 : ciTest.hashCode();
        com.datadog.android.rum.model.ResourceEvent.Os os = this.os;
        int hashCode17 = os == null ? 0 : os.hashCode();
        com.datadog.android.rum.model.ResourceEvent.Device device = this.device;
        int hashCode18 = device == null ? 0 : device.hashCode();
        int hashCode19 = this.dd.hashCode();
        com.datadog.android.rum.model.ResourceEvent.Context context = this.context;
        int hashCode20 = context == null ? 0 : context.hashCode();
        com.datadog.android.rum.model.ResourceEvent.Action action = this.action;
        int hashCode21 = action == null ? 0 : action.hashCode();
        com.datadog.android.rum.model.ResourceEvent.Container container = this.container;
        return (((((((((((((((((((((((((((((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + hashCode10) * 31) + hashCode11) * 31) + hashCode12) * 31) + hashCode13) * 31) + hashCode14) * 31) + hashCode15) * 31) + hashCode16) * 31) + hashCode17) * 31) + hashCode18) * 31) + hashCode19) * 31) + hashCode20) * 31) + hashCode21) * 31) + (container != null ? container.hashCode() : 0)) * 31) + this.resource.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.datadog.android.rum.model.ResourceEvent)) {
            return false;
        }
        com.datadog.android.rum.model.ResourceEvent resourceEvent = (com.datadog.android.rum.model.ResourceEvent) other;
        return this.date == resourceEvent.date && kotlin.jvm.internal.Intrinsics.areEqual(this.application, resourceEvent.application) && kotlin.jvm.internal.Intrinsics.areEqual(this.service, resourceEvent.service) && kotlin.jvm.internal.Intrinsics.areEqual(this.version, resourceEvent.version) && kotlin.jvm.internal.Intrinsics.areEqual(this.buildVersion, resourceEvent.buildVersion) && kotlin.jvm.internal.Intrinsics.areEqual(this.buildId, resourceEvent.buildId) && kotlin.jvm.internal.Intrinsics.areEqual(this.ddtags, resourceEvent.ddtags) && kotlin.jvm.internal.Intrinsics.areEqual(this.session, resourceEvent.session) && this.source == resourceEvent.source && kotlin.jvm.internal.Intrinsics.areEqual(this.view, resourceEvent.view) && kotlin.jvm.internal.Intrinsics.areEqual(this.usr, resourceEvent.usr) && kotlin.jvm.internal.Intrinsics.areEqual(this.account, resourceEvent.account) && kotlin.jvm.internal.Intrinsics.areEqual(this.connectivity, resourceEvent.connectivity) && kotlin.jvm.internal.Intrinsics.areEqual(this.display, resourceEvent.display) && kotlin.jvm.internal.Intrinsics.areEqual(this.synthetics, resourceEvent.synthetics) && kotlin.jvm.internal.Intrinsics.areEqual(this.ciTest, resourceEvent.ciTest) && kotlin.jvm.internal.Intrinsics.areEqual(this.os, resourceEvent.os) && kotlin.jvm.internal.Intrinsics.areEqual(this.device, resourceEvent.device) && kotlin.jvm.internal.Intrinsics.areEqual(this.dd, resourceEvent.dd) && kotlin.jvm.internal.Intrinsics.areEqual(this.context, resourceEvent.context) && kotlin.jvm.internal.Intrinsics.areEqual(this.action, resourceEvent.action) && kotlin.jvm.internal.Intrinsics.areEqual(this.container, resourceEvent.container) && kotlin.jvm.internal.Intrinsics.areEqual(this.resource, resourceEvent.resource);
    }

    public final com.datadog.android.rum.model.ResourceEvent copy(long date, com.datadog.android.rum.model.ResourceEvent.Application application, java.lang.String service, java.lang.String version, java.lang.String buildVersion, java.lang.String buildId, java.lang.String ddtags, com.datadog.android.rum.model.ResourceEvent.ResourceEventSession session, com.datadog.android.rum.model.ResourceEvent.ResourceEventSource source, com.datadog.android.rum.model.ResourceEvent.ResourceEventView view, com.datadog.android.rum.model.ResourceEvent.Usr usr, com.datadog.android.rum.model.ResourceEvent.Account account, com.datadog.android.rum.model.ResourceEvent.Connectivity connectivity, com.datadog.android.rum.model.ResourceEvent.Display display, com.datadog.android.rum.model.ResourceEvent.Synthetics synthetics, com.datadog.android.rum.model.ResourceEvent.CiTest ciTest, com.datadog.android.rum.model.ResourceEvent.Os os, com.datadog.android.rum.model.ResourceEvent.Device device, com.datadog.android.rum.model.ResourceEvent.Dd dd, com.datadog.android.rum.model.ResourceEvent.Context context, com.datadog.android.rum.model.ResourceEvent.Action action, com.datadog.android.rum.model.ResourceEvent.Container container, com.datadog.android.rum.model.ResourceEvent.Resource resource) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(application, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(session, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dd, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(resource, "");
        return new com.datadog.android.rum.model.ResourceEvent(date, application, service, version, buildVersion, buildId, ddtags, session, source, view, usr, account, connectivity, display, synthetics, ciTest, os, device, dd, context, action, container, resource);
    }

    /* renamed from: component9, reason: from getter */
    public final com.datadog.android.rum.model.ResourceEvent.ResourceEventSource getSource() {
        return this.source;
    }

    /* renamed from: component8, reason: from getter */
    public final com.datadog.android.rum.model.ResourceEvent.ResourceEventSession getSession() {
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
    public final com.datadog.android.rum.model.ResourceEvent.Resource getResource() {
        return this.resource;
    }

    /* renamed from: component22, reason: from getter */
    public final com.datadog.android.rum.model.ResourceEvent.Container getContainer() {
        return this.container;
    }

    /* renamed from: component21, reason: from getter */
    public final com.datadog.android.rum.model.ResourceEvent.Action getAction() {
        return this.action;
    }

    /* renamed from: component20, reason: from getter */
    public final com.datadog.android.rum.model.ResourceEvent.Context getContext() {
        return this.context;
    }

    /* renamed from: component2, reason: from getter */
    public final com.datadog.android.rum.model.ResourceEvent.Application getApplication() {
        return this.application;
    }

    /* renamed from: component19, reason: from getter */
    public final com.datadog.android.rum.model.ResourceEvent.Dd getDd() {
        return this.dd;
    }

    /* renamed from: component18, reason: from getter */
    public final com.datadog.android.rum.model.ResourceEvent.Device getDevice() {
        return this.device;
    }

    /* renamed from: component17, reason: from getter */
    public final com.datadog.android.rum.model.ResourceEvent.Os getOs() {
        return this.os;
    }

    /* renamed from: component16, reason: from getter */
    public final com.datadog.android.rum.model.ResourceEvent.CiTest getCiTest() {
        return this.ciTest;
    }

    /* renamed from: component15, reason: from getter */
    public final com.datadog.android.rum.model.ResourceEvent.Synthetics getSynthetics() {
        return this.synthetics;
    }

    /* renamed from: component14, reason: from getter */
    public final com.datadog.android.rum.model.ResourceEvent.Display getDisplay() {
        return this.display;
    }

    /* renamed from: component13, reason: from getter */
    public final com.datadog.android.rum.model.ResourceEvent.Connectivity getConnectivity() {
        return this.connectivity;
    }

    /* renamed from: component12, reason: from getter */
    public final com.datadog.android.rum.model.ResourceEvent.Account getAccount() {
        return this.account;
    }

    /* renamed from: component11, reason: from getter */
    public final com.datadog.android.rum.model.ResourceEvent.Usr getUsr() {
        return this.usr;
    }

    /* renamed from: component10, reason: from getter */
    public final com.datadog.android.rum.model.ResourceEvent.ResourceEventView getView() {
        return this.view;
    }

    /* renamed from: component1, reason: from getter */
    public final long getDate() {
        return this.date;
    }

    @kotlin.jvm.JvmStatic
    public static final com.datadog.android.rum.model.ResourceEvent fromJsonObject(com.google.gson.JsonObject jsonObject) throws com.google.gson.JsonParseException {
        return INSTANCE.fromJsonObject(jsonObject);
    }

    @kotlin.jvm.JvmStatic
    public static final com.datadog.android.rum.model.ResourceEvent fromJson(java.lang.String str) throws com.google.gson.JsonParseException {
        return INSTANCE.fromJson(str);
    }
}
