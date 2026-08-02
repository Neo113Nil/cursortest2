package com.datadog.android.rum.model;

@kotlin.Metadata(d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b.\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\bO\b\u0086\b\u0018\u0000 \u008b\u00012\u00020\u0001:D\u008c\u0001\u008d\u0001\u008e\u0001\u008f\u0001\u0090\u0001\u008b\u0001\u0091\u0001\u0092\u0001\u0093\u0001\u0094\u0001\u0095\u0001\u0096\u0001\u0097\u0001\u0098\u0001\u0099\u0001\u009a\u0001\u009b\u0001\u009c\u0001\u009d\u0001\u009e\u0001\u009f\u0001 \u0001¡\u0001¢\u0001£\u0001¤\u0001¥\u0001¦\u0001§\u0001¨\u0001©\u0001ª\u0001«\u0001¬\u0001B÷\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\r\u001a\u00020\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001e\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010 \u0012\u0006\u0010#\u001a\u00020\"\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010$\u0012\n\b\u0002\u0010'\u001a\u0004\u0018\u00010&\u0012\u0006\u0010)\u001a\u00020(¢\u0006\u0004\b*\u0010+J\u0010\u0010,\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b,\u0010-J\u0010\u0010.\u001a\u00020\u0010HÆ\u0003¢\u0006\u0004\b.\u0010/J\u0012\u00100\u001a\u0004\u0018\u00010\u0012HÆ\u0003¢\u0006\u0004\b0\u00101J\u0012\u00102\u001a\u0004\u0018\u00010\u0014HÆ\u0003¢\u0006\u0004\b2\u00103J\u0012\u00104\u001a\u0004\u0018\u00010\u0016HÆ\u0003¢\u0006\u0004\b4\u00105J\u0012\u00106\u001a\u0004\u0018\u00010\u0018HÆ\u0003¢\u0006\u0004\b6\u00107J\u0012\u00108\u001a\u0004\u0018\u00010\u001aHÆ\u0003¢\u0006\u0004\b8\u00109J\u0012\u0010:\u001a\u0004\u0018\u00010\u001cHÆ\u0003¢\u0006\u0004\b:\u0010;J\u0012\u0010<\u001a\u0004\u0018\u00010\u001eHÆ\u0003¢\u0006\u0004\b<\u0010=J\u0012\u0010>\u001a\u0004\u0018\u00010 HÆ\u0003¢\u0006\u0004\b>\u0010?J\u0010\u0010@\u001a\u00020\"HÆ\u0003¢\u0006\u0004\b@\u0010AJ\u0010\u0010B\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\bB\u0010CJ\u0012\u0010D\u001a\u0004\u0018\u00010$HÆ\u0003¢\u0006\u0004\bD\u0010EJ\u0012\u0010F\u001a\u0004\u0018\u00010&HÆ\u0003¢\u0006\u0004\bF\u0010GJ\u0010\u0010H\u001a\u00020(HÆ\u0003¢\u0006\u0004\bH\u0010IJ\u0012\u0010J\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\bJ\u0010KJ\u0012\u0010L\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\bL\u0010KJ\u0012\u0010M\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\bM\u0010KJ\u0012\u0010N\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\bN\u0010KJ\u0012\u0010O\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\bO\u0010KJ\u0010\u0010P\u001a\u00020\fHÆ\u0003¢\u0006\u0004\bP\u0010QJ\u0012\u0010R\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\bR\u0010SJ\u008c\u0002\u0010T\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\r\u001a\u00020\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010 2\b\b\u0002\u0010#\u001a\u00020\"2\n\b\u0002\u0010%\u001a\u0004\u0018\u00010$2\n\b\u0002\u0010'\u001a\u0004\u0018\u00010&2\b\b\u0002\u0010)\u001a\u00020(HÆ\u0001¢\u0006\u0004\bT\u0010UJ\u001a\u0010X\u001a\u00020W2\b\u0010V\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\bX\u0010YJ\u0010\u0010[\u001a\u00020ZHÖ\u0001¢\u0006\u0004\b[\u0010\\J\r\u0010^\u001a\u00020]¢\u0006\u0004\b^\u0010_J\u0010\u0010`\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b`\u0010KR\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0007¢\u0006\f\n\u0004\b\u0015\u0010a\u001a\u0004\bb\u00103R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010c\u001a\u0004\bd\u0010CR\u001c\u0010\n\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010e\u001a\u0004\bf\u0010KR\u001c\u0010\t\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010e\u001a\u0004\bg\u0010KR\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010h\u001a\u0004\bi\u0010;R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010j\u001a\u0004\bk\u00105R\u001c\u0010'\u001a\u0004\u0018\u00010&8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b'\u0010l\u001a\u0004\bm\u0010GR\u001c\u0010%\u001a\u0004\u0018\u00010$8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010n\u001a\u0004\bo\u0010ER\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010p\u001a\u0004\bq\u0010-R\u001a\u0010#\u001a\u00020\"8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010r\u001a\u0004\bs\u0010AR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010e\u001a\u0004\bt\u0010KR\u001c\u0010!\u001a\u0004\u0018\u00010 8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010u\u001a\u0004\bv\u0010?R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010w\u001a\u0004\bx\u00107R\u001c\u0010\u001f\u001a\u0004\u0018\u00010\u001e8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010y\u001a\u0004\bz\u0010=R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010e\u001a\u0004\b{\u0010KR\u001a\u0010\r\u001a\u00020\f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010|\u001a\u0004\b}\u0010QR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010~\u001a\u0004\b\u007f\u0010SR\u001e\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b\u001b\u0010\u0080\u0001\u001a\u0005\b\u0081\u0001\u00109R\u001d\u0010\u0082\u0001\u001a\u00020\u00068\u0007X\u0087D¢\u0006\u000e\n\u0005\b\u0082\u0001\u0010e\u001a\u0005\b\u0083\u0001\u0010KR\u001e\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b\u0013\u0010\u0084\u0001\u001a\u0005\b\u0085\u0001\u00101R\u001d\u0010\b\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\r\n\u0004\b\b\u0010e\u001a\u0005\b\u0086\u0001\u0010KR\u001c\u0010\u0011\u001a\u00020\u00108\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b\u0011\u0010\u0087\u0001\u001a\u0005\b\u0088\u0001\u0010/R\u001c\u0010)\u001a\u00020(8\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b)\u0010\u0089\u0001\u001a\u0005\b\u008a\u0001\u0010I"}, d2 = {"Lcom/datadog/android/rum/model/VitalAppLaunchEvent;", "", "", "date", "Lcom/datadog/android/rum/model/VitalAppLaunchEvent$Application;", "application", "", "service", "version", "buildVersion", "buildId", "ddtags", "Lcom/datadog/android/rum/model/VitalAppLaunchEvent$VitalAppLaunchEventSession;", "session", "Lcom/datadog/android/rum/model/VitalAppLaunchEvent$VitalAppLaunchEventSource;", "source", "Lcom/datadog/android/rum/model/VitalAppLaunchEvent$VitalAppLaunchEventView;", "view", "Lcom/datadog/android/rum/model/VitalAppLaunchEvent$Usr;", "usr", "Lcom/datadog/android/rum/model/VitalAppLaunchEvent$Account;", "account", "Lcom/datadog/android/rum/model/VitalAppLaunchEvent$Connectivity;", "connectivity", "Lcom/datadog/android/rum/model/VitalAppLaunchEvent$Display;", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DISPLAY_NOTIFICATION, "Lcom/datadog/android/rum/model/VitalAppLaunchEvent$Synthetics;", "synthetics", "Lcom/datadog/android/rum/model/VitalAppLaunchEvent$CiTest;", "ciTest", "Lcom/datadog/android/rum/model/VitalAppLaunchEvent$Os;", "os", "Lcom/datadog/android/rum/model/VitalAppLaunchEvent$Device;", "device", "Lcom/datadog/android/rum/model/VitalAppLaunchEvent$Dd;", "dd", "Lcom/datadog/android/rum/model/VitalAppLaunchEvent$Context;", "context", "Lcom/datadog/android/rum/model/VitalAppLaunchEvent$Container;", "container", "Lcom/datadog/android/rum/model/VitalAppLaunchEvent$Vital;", "vital", "<init>", "(JLcom/datadog/android/rum/model/VitalAppLaunchEvent$Application;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/datadog/android/rum/model/VitalAppLaunchEvent$VitalAppLaunchEventSession;Lcom/datadog/android/rum/model/VitalAppLaunchEvent$VitalAppLaunchEventSource;Lcom/datadog/android/rum/model/VitalAppLaunchEvent$VitalAppLaunchEventView;Lcom/datadog/android/rum/model/VitalAppLaunchEvent$Usr;Lcom/datadog/android/rum/model/VitalAppLaunchEvent$Account;Lcom/datadog/android/rum/model/VitalAppLaunchEvent$Connectivity;Lcom/datadog/android/rum/model/VitalAppLaunchEvent$Display;Lcom/datadog/android/rum/model/VitalAppLaunchEvent$Synthetics;Lcom/datadog/android/rum/model/VitalAppLaunchEvent$CiTest;Lcom/datadog/android/rum/model/VitalAppLaunchEvent$Os;Lcom/datadog/android/rum/model/VitalAppLaunchEvent$Device;Lcom/datadog/android/rum/model/VitalAppLaunchEvent$Dd;Lcom/datadog/android/rum/model/VitalAppLaunchEvent$Context;Lcom/datadog/android/rum/model/VitalAppLaunchEvent$Container;Lcom/datadog/android/rum/model/VitalAppLaunchEvent$Vital;)V", "component1", "()J", "component10", "()Lcom/datadog/android/rum/model/VitalAppLaunchEvent$VitalAppLaunchEventView;", "component11", "()Lcom/datadog/android/rum/model/VitalAppLaunchEvent$Usr;", "component12", "()Lcom/datadog/android/rum/model/VitalAppLaunchEvent$Account;", "component13", "()Lcom/datadog/android/rum/model/VitalAppLaunchEvent$Connectivity;", "component14", "()Lcom/datadog/android/rum/model/VitalAppLaunchEvent$Display;", "component15", "()Lcom/datadog/android/rum/model/VitalAppLaunchEvent$Synthetics;", "component16", "()Lcom/datadog/android/rum/model/VitalAppLaunchEvent$CiTest;", "component17", "()Lcom/datadog/android/rum/model/VitalAppLaunchEvent$Os;", "component18", "()Lcom/datadog/android/rum/model/VitalAppLaunchEvent$Device;", "component19", "()Lcom/datadog/android/rum/model/VitalAppLaunchEvent$Dd;", "component2", "()Lcom/datadog/android/rum/model/VitalAppLaunchEvent$Application;", "component20", "()Lcom/datadog/android/rum/model/VitalAppLaunchEvent$Context;", "component21", "()Lcom/datadog/android/rum/model/VitalAppLaunchEvent$Container;", "component22", "()Lcom/datadog/android/rum/model/VitalAppLaunchEvent$Vital;", "component3", "()Ljava/lang/String;", "component4", "component5", "component6", "component7", "component8", "()Lcom/datadog/android/rum/model/VitalAppLaunchEvent$VitalAppLaunchEventSession;", "component9", "()Lcom/datadog/android/rum/model/VitalAppLaunchEvent$VitalAppLaunchEventSource;", "copy", "(JLcom/datadog/android/rum/model/VitalAppLaunchEvent$Application;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/datadog/android/rum/model/VitalAppLaunchEvent$VitalAppLaunchEventSession;Lcom/datadog/android/rum/model/VitalAppLaunchEvent$VitalAppLaunchEventSource;Lcom/datadog/android/rum/model/VitalAppLaunchEvent$VitalAppLaunchEventView;Lcom/datadog/android/rum/model/VitalAppLaunchEvent$Usr;Lcom/datadog/android/rum/model/VitalAppLaunchEvent$Account;Lcom/datadog/android/rum/model/VitalAppLaunchEvent$Connectivity;Lcom/datadog/android/rum/model/VitalAppLaunchEvent$Display;Lcom/datadog/android/rum/model/VitalAppLaunchEvent$Synthetics;Lcom/datadog/android/rum/model/VitalAppLaunchEvent$CiTest;Lcom/datadog/android/rum/model/VitalAppLaunchEvent$Os;Lcom/datadog/android/rum/model/VitalAppLaunchEvent$Device;Lcom/datadog/android/rum/model/VitalAppLaunchEvent$Dd;Lcom/datadog/android/rum/model/VitalAppLaunchEvent$Context;Lcom/datadog/android/rum/model/VitalAppLaunchEvent$Container;Lcom/datadog/android/rum/model/VitalAppLaunchEvent$Vital;)Lcom/datadog/android/rum/model/VitalAppLaunchEvent;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lcom/google/gson/JsonElement;", "toJson", "()Lcom/google/gson/JsonElement;", "toString", "Lcom/datadog/android/rum/model/VitalAppLaunchEvent$Account;", "getAccount", "Lcom/datadog/android/rum/model/VitalAppLaunchEvent$Application;", "getApplication", "Ljava/lang/String;", "getBuildId", "getBuildVersion", "Lcom/datadog/android/rum/model/VitalAppLaunchEvent$CiTest;", "getCiTest", "Lcom/datadog/android/rum/model/VitalAppLaunchEvent$Connectivity;", "getConnectivity", "Lcom/datadog/android/rum/model/VitalAppLaunchEvent$Container;", "getContainer", "Lcom/datadog/android/rum/model/VitalAppLaunchEvent$Context;", "getContext", "J", "getDate", "Lcom/datadog/android/rum/model/VitalAppLaunchEvent$Dd;", "getDd", "getDdtags", "Lcom/datadog/android/rum/model/VitalAppLaunchEvent$Device;", "getDevice", "Lcom/datadog/android/rum/model/VitalAppLaunchEvent$Display;", "getDisplay", "Lcom/datadog/android/rum/model/VitalAppLaunchEvent$Os;", "getOs", "getService", "Lcom/datadog/android/rum/model/VitalAppLaunchEvent$VitalAppLaunchEventSession;", "getSession", "Lcom/datadog/android/rum/model/VitalAppLaunchEvent$VitalAppLaunchEventSource;", "getSource", "Lcom/datadog/android/rum/model/VitalAppLaunchEvent$Synthetics;", "getSynthetics", "type", "getType", "Lcom/datadog/android/rum/model/VitalAppLaunchEvent$Usr;", "getUsr", "getVersion", "Lcom/datadog/android/rum/model/VitalAppLaunchEvent$VitalAppLaunchEventView;", "getView", "Lcom/datadog/android/rum/model/VitalAppLaunchEvent$Vital;", "getVital", "Companion", "Account", "AppLaunchMetric", "Application", "Cellular", "CiTest", com.adobe.marketing.mobile.internal.configuration.ConfigurationExtension.TAG, "Connectivity", "ConnectivityStatus", androidx.compose.material3.internal.TextFieldImplKt.ContainerId, "ContainerView", "Context", "Dd", "DdSession", "Device", "DeviceType", "Display", "EffectiveType", "ErrorReason", "Interface", "Os", "Plan", "Profiling", "ProfilingStatus", "SessionPrecondition", "StartupType", "Synthetics", "Usr", "Viewport", "Vital", "VitalAppLaunchEventSession", "VitalAppLaunchEventSessionType", "VitalAppLaunchEventSource", "VitalAppLaunchEventView"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class VitalAppLaunchEvent {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.datadog.android.rum.model.VitalAppLaunchEvent.Companion INSTANCE = new com.datadog.android.rum.model.VitalAppLaunchEvent.Companion(null);
    private final com.datadog.android.rum.model.VitalAppLaunchEvent.Account account;
    private final com.datadog.android.rum.model.VitalAppLaunchEvent.Application application;
    private final java.lang.String buildId;
    private final java.lang.String buildVersion;
    private final com.datadog.android.rum.model.VitalAppLaunchEvent.CiTest ciTest;
    private final com.datadog.android.rum.model.VitalAppLaunchEvent.Connectivity connectivity;
    private final com.datadog.android.rum.model.VitalAppLaunchEvent.Container container;
    private final com.datadog.android.rum.model.VitalAppLaunchEvent.Context context;
    private final long date;
    private final com.datadog.android.rum.model.VitalAppLaunchEvent.Dd dd;
    private final java.lang.String ddtags;
    private final com.datadog.android.rum.model.VitalAppLaunchEvent.Device device;
    private final com.datadog.android.rum.model.VitalAppLaunchEvent.Display display;
    private final com.datadog.android.rum.model.VitalAppLaunchEvent.Os os;
    private final java.lang.String service;
    private final com.datadog.android.rum.model.VitalAppLaunchEvent.VitalAppLaunchEventSession session;
    private final com.datadog.android.rum.model.VitalAppLaunchEvent.VitalAppLaunchEventSource source;
    private final com.datadog.android.rum.model.VitalAppLaunchEvent.Synthetics synthetics;
    private final java.lang.String type;
    private final com.datadog.android.rum.model.VitalAppLaunchEvent.Usr usr;
    private final java.lang.String version;
    private final com.datadog.android.rum.model.VitalAppLaunchEvent.VitalAppLaunchEventView view;
    private final com.datadog.android.rum.model.VitalAppLaunchEvent.Vital vital;

    public VitalAppLaunchEvent(long j, com.datadog.android.rum.model.VitalAppLaunchEvent.Application application, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, com.datadog.android.rum.model.VitalAppLaunchEvent.VitalAppLaunchEventSession vitalAppLaunchEventSession, com.datadog.android.rum.model.VitalAppLaunchEvent.VitalAppLaunchEventSource vitalAppLaunchEventSource, com.datadog.android.rum.model.VitalAppLaunchEvent.VitalAppLaunchEventView vitalAppLaunchEventView, com.datadog.android.rum.model.VitalAppLaunchEvent.Usr usr, com.datadog.android.rum.model.VitalAppLaunchEvent.Account account, com.datadog.android.rum.model.VitalAppLaunchEvent.Connectivity connectivity, com.datadog.android.rum.model.VitalAppLaunchEvent.Display display, com.datadog.android.rum.model.VitalAppLaunchEvent.Synthetics synthetics, com.datadog.android.rum.model.VitalAppLaunchEvent.CiTest ciTest, com.datadog.android.rum.model.VitalAppLaunchEvent.Os os, com.datadog.android.rum.model.VitalAppLaunchEvent.Device device, com.datadog.android.rum.model.VitalAppLaunchEvent.Dd dd, com.datadog.android.rum.model.VitalAppLaunchEvent.Context context, com.datadog.android.rum.model.VitalAppLaunchEvent.Container container, com.datadog.android.rum.model.VitalAppLaunchEvent.Vital vital) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(application, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(vitalAppLaunchEventSession, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(vitalAppLaunchEventView, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dd, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(vital, "");
        this.date = j;
        this.application = application;
        this.service = str;
        this.version = str2;
        this.buildVersion = str3;
        this.buildId = str4;
        this.ddtags = str5;
        this.session = vitalAppLaunchEventSession;
        this.source = vitalAppLaunchEventSource;
        this.view = vitalAppLaunchEventView;
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
        this.vital = vital;
        this.type = "vital";
    }

    public /* synthetic */ VitalAppLaunchEvent(long j, com.datadog.android.rum.model.VitalAppLaunchEvent.Application application, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, com.datadog.android.rum.model.VitalAppLaunchEvent.VitalAppLaunchEventSession vitalAppLaunchEventSession, com.datadog.android.rum.model.VitalAppLaunchEvent.VitalAppLaunchEventSource vitalAppLaunchEventSource, com.datadog.android.rum.model.VitalAppLaunchEvent.VitalAppLaunchEventView vitalAppLaunchEventView, com.datadog.android.rum.model.VitalAppLaunchEvent.Usr usr, com.datadog.android.rum.model.VitalAppLaunchEvent.Account account, com.datadog.android.rum.model.VitalAppLaunchEvent.Connectivity connectivity, com.datadog.android.rum.model.VitalAppLaunchEvent.Display display, com.datadog.android.rum.model.VitalAppLaunchEvent.Synthetics synthetics, com.datadog.android.rum.model.VitalAppLaunchEvent.CiTest ciTest, com.datadog.android.rum.model.VitalAppLaunchEvent.Os os, com.datadog.android.rum.model.VitalAppLaunchEvent.Device device, com.datadog.android.rum.model.VitalAppLaunchEvent.Dd dd, com.datadog.android.rum.model.VitalAppLaunchEvent.Context context, com.datadog.android.rum.model.VitalAppLaunchEvent.Container container, com.datadog.android.rum.model.VitalAppLaunchEvent.Vital vital, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(j, application, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? null : str4, (i & 64) != 0 ? null : str5, vitalAppLaunchEventSession, (i & 256) != 0 ? null : vitalAppLaunchEventSource, vitalAppLaunchEventView, (i & 1024) != 0 ? null : usr, (i & 2048) != 0 ? null : account, (i & 4096) != 0 ? null : connectivity, (i & 8192) != 0 ? null : display, (i & 16384) != 0 ? null : synthetics, (32768 & i) != 0 ? null : ciTest, (65536 & i) != 0 ? null : os, (131072 & i) != 0 ? null : device, dd, (524288 & i) != 0 ? null : context, (i & 1048576) != 0 ? null : container, vital);
    }

    public final long getDate() {
        return this.date;
    }

    public final com.datadog.android.rum.model.VitalAppLaunchEvent.Application getApplication() {
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

    public final com.datadog.android.rum.model.VitalAppLaunchEvent.VitalAppLaunchEventSession getSession() {
        return this.session;
    }

    public final com.datadog.android.rum.model.VitalAppLaunchEvent.VitalAppLaunchEventSource getSource() {
        return this.source;
    }

    public final com.datadog.android.rum.model.VitalAppLaunchEvent.VitalAppLaunchEventView getView() {
        return this.view;
    }

    public final com.datadog.android.rum.model.VitalAppLaunchEvent.Usr getUsr() {
        return this.usr;
    }

    public final com.datadog.android.rum.model.VitalAppLaunchEvent.Account getAccount() {
        return this.account;
    }

    public final com.datadog.android.rum.model.VitalAppLaunchEvent.Connectivity getConnectivity() {
        return this.connectivity;
    }

    public final com.datadog.android.rum.model.VitalAppLaunchEvent.Display getDisplay() {
        return this.display;
    }

    public final com.datadog.android.rum.model.VitalAppLaunchEvent.Synthetics getSynthetics() {
        return this.synthetics;
    }

    public final com.datadog.android.rum.model.VitalAppLaunchEvent.CiTest getCiTest() {
        return this.ciTest;
    }

    public final com.datadog.android.rum.model.VitalAppLaunchEvent.Os getOs() {
        return this.os;
    }

    public final com.datadog.android.rum.model.VitalAppLaunchEvent.Device getDevice() {
        return this.device;
    }

    public final com.datadog.android.rum.model.VitalAppLaunchEvent.Dd getDd() {
        return this.dd;
    }

    public final com.datadog.android.rum.model.VitalAppLaunchEvent.Context getContext() {
        return this.context;
    }

    public final com.datadog.android.rum.model.VitalAppLaunchEvent.Container getContainer() {
        return this.container;
    }

    public final com.datadog.android.rum.model.VitalAppLaunchEvent.Vital getVital() {
        return this.vital;
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
        com.datadog.android.rum.model.VitalAppLaunchEvent.VitalAppLaunchEventSource vitalAppLaunchEventSource = this.source;
        if (vitalAppLaunchEventSource != null) {
            jsonObject.add("source", vitalAppLaunchEventSource.toJson());
        }
        jsonObject.add("view", this.view.toJson());
        com.datadog.android.rum.model.VitalAppLaunchEvent.Usr usr = this.usr;
        if (usr != null) {
            jsonObject.add("usr", usr.toJson());
        }
        com.datadog.android.rum.model.VitalAppLaunchEvent.Account account = this.account;
        if (account != null) {
            jsonObject.add("account", account.toJson());
        }
        com.datadog.android.rum.model.VitalAppLaunchEvent.Connectivity connectivity = this.connectivity;
        if (connectivity != null) {
            jsonObject.add("connectivity", connectivity.toJson());
        }
        com.datadog.android.rum.model.VitalAppLaunchEvent.Display display = this.display;
        if (display != null) {
            jsonObject.add(com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DISPLAY_NOTIFICATION, display.toJson());
        }
        com.datadog.android.rum.model.VitalAppLaunchEvent.Synthetics synthetics = this.synthetics;
        if (synthetics != null) {
            jsonObject.add("synthetics", synthetics.toJson());
        }
        com.datadog.android.rum.model.VitalAppLaunchEvent.CiTest ciTest = this.ciTest;
        if (ciTest != null) {
            jsonObject.add("ci_test", ciTest.toJson());
        }
        com.datadog.android.rum.model.VitalAppLaunchEvent.Os os = this.os;
        if (os != null) {
            jsonObject.add("os", os.toJson());
        }
        com.datadog.android.rum.model.VitalAppLaunchEvent.Device device = this.device;
        if (device != null) {
            jsonObject.add("device", device.toJson());
        }
        jsonObject.add("_dd", this.dd.toJson());
        com.datadog.android.rum.model.VitalAppLaunchEvent.Context context = this.context;
        if (context != null) {
            jsonObject.add("context", context.toJson());
        }
        com.datadog.android.rum.model.VitalAppLaunchEvent.Container container = this.container;
        if (container != null) {
            jsonObject.add("container", container.toJson());
        }
        jsonObject.addProperty("type", this.type);
        jsonObject.add("vital", this.vital.toJson());
        return jsonObject;
    }

    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/datadog/android/rum/model/VitalAppLaunchEvent$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/rum/model/VitalAppLaunchEvent;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/rum/model/VitalAppLaunchEvent;", "Lcom/google/gson/JsonObject;", "jsonObject", "fromJsonObject", "(Lcom/google/gson/JsonObject;)Lcom/datadog/android/rum/model/VitalAppLaunchEvent;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final class Companion {
        private Companion() {
        }

        @kotlin.jvm.JvmStatic
        public final com.datadog.android.rum.model.VitalAppLaunchEvent fromJson(java.lang.String jsonString) throws com.google.gson.JsonParseException {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonString, "");
            try {
                com.google.gson.JsonObject asJsonObject = com.google.gson.JsonParser.parseString(jsonString).getAsJsonObject();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asJsonObject, "");
                return fromJsonObject(asJsonObject);
            } catch (java.lang.IllegalStateException e) {
                throw new com.google.gson.JsonParseException("Unable to parse json into type VitalAppLaunchEvent", e);
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:83:0x01e2 A[Catch: NullPointerException -> 0x01f7, NumberFormatException -> 0x01f9, IllegalStateException -> 0x01fd, TryCatch #5 {IllegalStateException -> 0x01fd, NullPointerException -> 0x01f7, NumberFormatException -> 0x01f9, blocks: (B:35:0x00c0, B:36:0x00cd, B:38:0x00d5, B:40:0x00db, B:41:0x00e6, B:43:0x00ee, B:45:0x00f4, B:46:0x00ff, B:48:0x0107, B:50:0x010d, B:51:0x0118, B:53:0x0120, B:55:0x0126, B:56:0x0131, B:58:0x0139, B:60:0x013f, B:61:0x014a, B:63:0x0152, B:65:0x0158, B:66:0x0163, B:68:0x016b, B:70:0x0171, B:71:0x017c, B:73:0x0197, B:75:0x019d, B:76:0x01a8, B:78:0x01b0, B:80:0x01b6, B:81:0x01c1, B:83:0x01e2, B:86:0x01eb, B:87:0x01f6), top: B:34:0x00c0 }] */
        /* JADX WARN: Removed duplicated region for block: B:86:0x01eb A[Catch: NullPointerException -> 0x01f7, NumberFormatException -> 0x01f9, IllegalStateException -> 0x01fd, TryCatch #5 {IllegalStateException -> 0x01fd, NullPointerException -> 0x01f7, NumberFormatException -> 0x01f9, blocks: (B:35:0x00c0, B:36:0x00cd, B:38:0x00d5, B:40:0x00db, B:41:0x00e6, B:43:0x00ee, B:45:0x00f4, B:46:0x00ff, B:48:0x0107, B:50:0x010d, B:51:0x0118, B:53:0x0120, B:55:0x0126, B:56:0x0131, B:58:0x0139, B:60:0x013f, B:61:0x014a, B:63:0x0152, B:65:0x0158, B:66:0x0163, B:68:0x016b, B:70:0x0171, B:71:0x017c, B:73:0x0197, B:75:0x019d, B:76:0x01a8, B:78:0x01b0, B:80:0x01b6, B:81:0x01c1, B:83:0x01e2, B:86:0x01eb, B:87:0x01f6), top: B:34:0x00c0 }] */
        @kotlin.jvm.JvmStatic
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final com.datadog.android.rum.model.VitalAppLaunchEvent fromJsonObject(com.google.gson.JsonObject jsonObject) throws com.google.gson.JsonParseException {
            java.lang.String str;
            java.lang.String asString;
            com.datadog.android.rum.model.VitalAppLaunchEvent.Usr usr;
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
            java.lang.String asString3;
            java.lang.String str2 = "Unable to parse json into type VitalAppLaunchEvent";
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonObject, "");
            try {
                try {
                    long asLong = jsonObject.get("date").getAsLong();
                    com.google.gson.JsonObject asJsonObject10 = jsonObject.get("application").getAsJsonObject();
                    com.datadog.android.rum.model.VitalAppLaunchEvent.Application.Companion companion = com.datadog.android.rum.model.VitalAppLaunchEvent.Application.INSTANCE;
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asJsonObject10, "");
                    com.datadog.android.rum.model.VitalAppLaunchEvent.Application fromJsonObject = companion.fromJsonObject(asJsonObject10);
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
                    com.google.gson.JsonObject asJsonObject11 = jsonObject.get("session").getAsJsonObject();
                    com.datadog.android.rum.model.VitalAppLaunchEvent.VitalAppLaunchEventSession.Companion companion2 = com.datadog.android.rum.model.VitalAppLaunchEvent.VitalAppLaunchEventSession.INSTANCE;
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asJsonObject11, "");
                    com.datadog.android.rum.model.VitalAppLaunchEvent.VitalAppLaunchEventSession fromJsonObject2 = companion2.fromJsonObject(asJsonObject11);
                    com.google.gson.JsonElement jsonElement6 = jsonObject.get("source");
                    com.datadog.android.rum.model.VitalAppLaunchEvent.VitalAppLaunchEventSource fromJson = (jsonElement6 == null || (asString3 = jsonElement6.getAsString()) == null) ? null : com.datadog.android.rum.model.VitalAppLaunchEvent.VitalAppLaunchEventSource.INSTANCE.fromJson(asString3);
                    com.google.gson.JsonObject asJsonObject12 = jsonObject.get("view").getAsJsonObject();
                    com.datadog.android.rum.model.VitalAppLaunchEvent.VitalAppLaunchEventView.Companion companion3 = com.datadog.android.rum.model.VitalAppLaunchEvent.VitalAppLaunchEventView.INSTANCE;
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asJsonObject12, "");
                    com.datadog.android.rum.model.VitalAppLaunchEvent.VitalAppLaunchEventView fromJsonObject3 = companion3.fromJsonObject(asJsonObject12);
                    com.google.gson.JsonElement jsonElement7 = jsonObject.get("usr");
                    if (jsonElement7 != null) {
                        com.google.gson.JsonObject asJsonObject13 = jsonElement7.getAsJsonObject();
                        if (asJsonObject13 != null) {
                            str = "Unable to parse json into type VitalAppLaunchEvent";
                            try {
                                usr = com.datadog.android.rum.model.VitalAppLaunchEvent.Usr.INSTANCE.fromJsonObject(asJsonObject13);
                                com.google.gson.JsonElement jsonElement8 = jsonObject.get("account");
                                com.datadog.android.rum.model.VitalAppLaunchEvent.Account fromJsonObject4 = (jsonElement8 != null || (asJsonObject9 = jsonElement8.getAsJsonObject()) == null) ? null : com.datadog.android.rum.model.VitalAppLaunchEvent.Account.INSTANCE.fromJsonObject(asJsonObject9);
                                com.google.gson.JsonElement jsonElement9 = jsonObject.get("connectivity");
                                com.datadog.android.rum.model.VitalAppLaunchEvent.Connectivity fromJsonObject5 = (jsonElement9 != null || (asJsonObject8 = jsonElement9.getAsJsonObject()) == null) ? null : com.datadog.android.rum.model.VitalAppLaunchEvent.Connectivity.INSTANCE.fromJsonObject(asJsonObject8);
                                com.google.gson.JsonElement jsonElement10 = jsonObject.get(com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DISPLAY_NOTIFICATION);
                                com.datadog.android.rum.model.VitalAppLaunchEvent.Display fromJsonObject6 = (jsonElement10 != null || (asJsonObject7 = jsonElement10.getAsJsonObject()) == null) ? null : com.datadog.android.rum.model.VitalAppLaunchEvent.Display.INSTANCE.fromJsonObject(asJsonObject7);
                                com.google.gson.JsonElement jsonElement11 = jsonObject.get("synthetics");
                                com.datadog.android.rum.model.VitalAppLaunchEvent.Synthetics fromJsonObject7 = (jsonElement11 != null || (asJsonObject6 = jsonElement11.getAsJsonObject()) == null) ? null : com.datadog.android.rum.model.VitalAppLaunchEvent.Synthetics.INSTANCE.fromJsonObject(asJsonObject6);
                                com.google.gson.JsonElement jsonElement12 = jsonObject.get("ci_test");
                                com.datadog.android.rum.model.VitalAppLaunchEvent.CiTest fromJsonObject8 = (jsonElement12 != null || (asJsonObject5 = jsonElement12.getAsJsonObject()) == null) ? null : com.datadog.android.rum.model.VitalAppLaunchEvent.CiTest.INSTANCE.fromJsonObject(asJsonObject5);
                                com.google.gson.JsonElement jsonElement13 = jsonObject.get("os");
                                com.datadog.android.rum.model.VitalAppLaunchEvent.Os fromJsonObject9 = (jsonElement13 != null || (asJsonObject4 = jsonElement13.getAsJsonObject()) == null) ? null : com.datadog.android.rum.model.VitalAppLaunchEvent.Os.INSTANCE.fromJsonObject(asJsonObject4);
                                com.google.gson.JsonElement jsonElement14 = jsonObject.get("device");
                                com.datadog.android.rum.model.VitalAppLaunchEvent.Device fromJsonObject10 = (jsonElement14 != null || (asJsonObject3 = jsonElement14.getAsJsonObject()) == null) ? null : com.datadog.android.rum.model.VitalAppLaunchEvent.Device.INSTANCE.fromJsonObject(asJsonObject3);
                                com.google.gson.JsonObject asJsonObject14 = jsonObject.get("_dd").getAsJsonObject();
                                com.datadog.android.rum.model.VitalAppLaunchEvent.Dd.Companion companion4 = com.datadog.android.rum.model.VitalAppLaunchEvent.Dd.INSTANCE;
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asJsonObject14, "");
                                com.datadog.android.rum.model.VitalAppLaunchEvent.Dd fromJsonObject11 = companion4.fromJsonObject(asJsonObject14);
                                com.google.gson.JsonElement jsonElement15 = jsonObject.get("context");
                                com.datadog.android.rum.model.VitalAppLaunchEvent.Context fromJsonObject12 = (jsonElement15 != null || (asJsonObject2 = jsonElement15.getAsJsonObject()) == null) ? null : com.datadog.android.rum.model.VitalAppLaunchEvent.Context.INSTANCE.fromJsonObject(asJsonObject2);
                                com.google.gson.JsonElement jsonElement16 = jsonObject.get("container");
                                com.datadog.android.rum.model.VitalAppLaunchEvent.Container fromJsonObject13 = (jsonElement16 != null || (asJsonObject = jsonElement16.getAsJsonObject()) == null) ? null : com.datadog.android.rum.model.VitalAppLaunchEvent.Container.INSTANCE.fromJsonObject(asJsonObject);
                                asString2 = jsonObject.get("type").getAsString();
                                com.google.gson.JsonObject asJsonObject15 = jsonObject.get("vital").getAsJsonObject();
                                com.datadog.android.rum.model.VitalAppLaunchEvent.Vital.Companion companion5 = com.datadog.android.rum.model.VitalAppLaunchEvent.Vital.INSTANCE;
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asJsonObject15, "");
                                com.datadog.android.rum.model.VitalAppLaunchEvent.Vital fromJsonObject14 = companion5.fromJsonObject(asJsonObject15);
                                if (kotlin.jvm.internal.Intrinsics.areEqual(asString2, "vital")) {
                                    throw new java.lang.IllegalStateException("Check failed.".toString());
                                }
                                return new com.datadog.android.rum.model.VitalAppLaunchEvent(asLong, fromJsonObject, asString, asString4, asString5, asString6, asString7, fromJsonObject2, fromJson, fromJsonObject3, usr, fromJsonObject4, fromJsonObject5, fromJsonObject6, fromJsonObject7, fromJsonObject8, fromJsonObject9, fromJsonObject10, fromJsonObject11, fromJsonObject12, fromJsonObject13, fromJsonObject14);
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
                    com.google.gson.JsonObject asJsonObject142 = jsonObject.get("_dd").getAsJsonObject();
                    com.datadog.android.rum.model.VitalAppLaunchEvent.Dd.Companion companion42 = com.datadog.android.rum.model.VitalAppLaunchEvent.Dd.INSTANCE;
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asJsonObject142, "");
                    com.datadog.android.rum.model.VitalAppLaunchEvent.Dd fromJsonObject112 = companion42.fromJsonObject(asJsonObject142);
                    com.google.gson.JsonElement jsonElement152 = jsonObject.get("context");
                    if (jsonElement152 != null) {
                    }
                    com.google.gson.JsonElement jsonElement162 = jsonObject.get("container");
                    if (jsonElement162 != null) {
                    }
                    asString2 = jsonObject.get("type").getAsString();
                    com.google.gson.JsonObject asJsonObject152 = jsonObject.get("vital").getAsJsonObject();
                    com.datadog.android.rum.model.VitalAppLaunchEvent.Vital.Companion companion52 = com.datadog.android.rum.model.VitalAppLaunchEvent.Vital.INSTANCE;
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asJsonObject152, "");
                    com.datadog.android.rum.model.VitalAppLaunchEvent.Vital fromJsonObject142 = companion52.fromJsonObject(asJsonObject152);
                    if (kotlin.jvm.internal.Intrinsics.areEqual(asString2, "vital")) {
                    }
                } catch (java.lang.NullPointerException e6) {
                    e = e6;
                    str = "Unable to parse json into type VitalAppLaunchEvent";
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

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\b\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ&\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\bR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0018\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0019\u0010\b"}, d2 = {"Lcom/datadog/android/rum/model/VitalAppLaunchEvent$Application;", "", "", "id", "currentLocale", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/datadog/android/rum/model/VitalAppLaunchEvent$Application;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lcom/google/gson/JsonElement;", "toJson", "()Lcom/google/gson/JsonElement;", "toString", "Ljava/lang/String;", "getCurrentLocale", "getId", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final /* data */ class Application {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.datadog.android.rum.model.VitalAppLaunchEvent.Application.Companion INSTANCE = new com.datadog.android.rum.model.VitalAppLaunchEvent.Application.Companion(null);
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

        @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/datadog/android/rum/model/VitalAppLaunchEvent$Application$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/rum/model/VitalAppLaunchEvent$Application;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/rum/model/VitalAppLaunchEvent$Application;", "Lcom/google/gson/JsonObject;", "jsonObject", "fromJsonObject", "(Lcom/google/gson/JsonObject;)Lcom/datadog/android/rum/model/VitalAppLaunchEvent$Application;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @kotlin.jvm.JvmStatic
            public final com.datadog.android.rum.model.VitalAppLaunchEvent.Application fromJson(java.lang.String jsonString) throws com.google.gson.JsonParseException {
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
            public final com.datadog.android.rum.model.VitalAppLaunchEvent.Application fromJsonObject(com.google.gson.JsonObject jsonObject) throws com.google.gson.JsonParseException {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonObject, "");
                try {
                    java.lang.String asString = jsonObject.get("id").getAsString();
                    com.google.gson.JsonElement jsonElement = jsonObject.get("current_locale");
                    java.lang.String asString2 = jsonElement != null ? jsonElement.getAsString() : null;
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asString, "");
                    return new com.datadog.android.rum.model.VitalAppLaunchEvent.Application(asString, asString2);
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
            if (!(other instanceof com.datadog.android.rum.model.VitalAppLaunchEvent.Application)) {
                return false;
            }
            com.datadog.android.rum.model.VitalAppLaunchEvent.Application application = (com.datadog.android.rum.model.VitalAppLaunchEvent.Application) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.id, application.id) && kotlin.jvm.internal.Intrinsics.areEqual(this.currentLocale, application.currentLocale);
        }

        public final com.datadog.android.rum.model.VitalAppLaunchEvent.Application copy(java.lang.String id, java.lang.String currentLocale) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
            return new com.datadog.android.rum.model.VitalAppLaunchEvent.Application(id, currentLocale);
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
        public static final com.datadog.android.rum.model.VitalAppLaunchEvent.Application fromJsonObject(com.google.gson.JsonObject jsonObject) throws com.google.gson.JsonParseException {
            return INSTANCE.fromJsonObject(jsonObject);
        }

        @kotlin.jvm.JvmStatic
        public static final com.datadog.android.rum.model.VitalAppLaunchEvent.Application fromJson(java.lang.String str) throws com.google.gson.JsonParseException {
            return INSTANCE.fromJson(str);
        }

        public static /* synthetic */ com.datadog.android.rum.model.VitalAppLaunchEvent.Application copy$default(com.datadog.android.rum.model.VitalAppLaunchEvent.Application application, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = application.id;
            }
            if ((i & 2) != 0) {
                str2 = application.currentLocale;
            }
            return application.copy(str, str2);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\b\u0018\u0000 \"2\u00020\u0001:\u0001\"B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ0\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u000bR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0007¢\u0006\f\n\u0004\b\u0007\u0010\u001c\u001a\u0004\b\u001d\u0010\u000fR\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b!\u0010\r"}, d2 = {"Lcom/datadog/android/rum/model/VitalAppLaunchEvent$VitalAppLaunchEventSession;", "", "", "id", "Lcom/datadog/android/rum/model/VitalAppLaunchEvent$VitalAppLaunchEventSessionType;", "type", "", "hasReplay", "<init>", "(Ljava/lang/String;Lcom/datadog/android/rum/model/VitalAppLaunchEvent$VitalAppLaunchEventSessionType;Ljava/lang/Boolean;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/datadog/android/rum/model/VitalAppLaunchEvent$VitalAppLaunchEventSessionType;", "component3", "()Ljava/lang/Boolean;", "copy", "(Ljava/lang/String;Lcom/datadog/android/rum/model/VitalAppLaunchEvent$VitalAppLaunchEventSessionType;Ljava/lang/Boolean;)Lcom/datadog/android/rum/model/VitalAppLaunchEvent$VitalAppLaunchEventSession;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lcom/google/gson/JsonElement;", "toJson", "()Lcom/google/gson/JsonElement;", "toString", "Ljava/lang/Boolean;", "getHasReplay", "Ljava/lang/String;", "getId", "Lcom/datadog/android/rum/model/VitalAppLaunchEvent$VitalAppLaunchEventSessionType;", "getType", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final /* data */ class VitalAppLaunchEventSession {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.datadog.android.rum.model.VitalAppLaunchEvent.VitalAppLaunchEventSession.Companion INSTANCE = new com.datadog.android.rum.model.VitalAppLaunchEvent.VitalAppLaunchEventSession.Companion(null);
        private final java.lang.Boolean hasReplay;
        private final java.lang.String id;
        private final com.datadog.android.rum.model.VitalAppLaunchEvent.VitalAppLaunchEventSessionType type;

        public VitalAppLaunchEventSession(java.lang.String str, com.datadog.android.rum.model.VitalAppLaunchEvent.VitalAppLaunchEventSessionType vitalAppLaunchEventSessionType, java.lang.Boolean bool) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(vitalAppLaunchEventSessionType, "");
            this.id = str;
            this.type = vitalAppLaunchEventSessionType;
            this.hasReplay = bool;
        }

        public /* synthetic */ VitalAppLaunchEventSession(java.lang.String str, com.datadog.android.rum.model.VitalAppLaunchEvent.VitalAppLaunchEventSessionType vitalAppLaunchEventSessionType, java.lang.Boolean bool, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(str, vitalAppLaunchEventSessionType, (i & 4) != 0 ? null : bool);
        }

        public final java.lang.String getId() {
            return this.id;
        }

        public final com.datadog.android.rum.model.VitalAppLaunchEvent.VitalAppLaunchEventSessionType getType() {
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

        @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/datadog/android/rum/model/VitalAppLaunchEvent$VitalAppLaunchEventSession$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/rum/model/VitalAppLaunchEvent$VitalAppLaunchEventSession;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/rum/model/VitalAppLaunchEvent$VitalAppLaunchEventSession;", "Lcom/google/gson/JsonObject;", "jsonObject", "fromJsonObject", "(Lcom/google/gson/JsonObject;)Lcom/datadog/android/rum/model/VitalAppLaunchEvent$VitalAppLaunchEventSession;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @kotlin.jvm.JvmStatic
            public final com.datadog.android.rum.model.VitalAppLaunchEvent.VitalAppLaunchEventSession fromJson(java.lang.String jsonString) throws com.google.gson.JsonParseException {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonString, "");
                try {
                    com.google.gson.JsonObject asJsonObject = com.google.gson.JsonParser.parseString(jsonString).getAsJsonObject();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asJsonObject, "");
                    return fromJsonObject(asJsonObject);
                } catch (java.lang.IllegalStateException e) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type VitalAppLaunchEventSession", e);
                }
            }

            @kotlin.jvm.JvmStatic
            public final com.datadog.android.rum.model.VitalAppLaunchEvent.VitalAppLaunchEventSession fromJsonObject(com.google.gson.JsonObject jsonObject) throws com.google.gson.JsonParseException {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonObject, "");
                try {
                    java.lang.String asString = jsonObject.get("id").getAsString();
                    com.datadog.android.rum.model.VitalAppLaunchEvent.VitalAppLaunchEventSessionType.Companion companion = com.datadog.android.rum.model.VitalAppLaunchEvent.VitalAppLaunchEventSessionType.INSTANCE;
                    java.lang.String asString2 = jsonObject.get("type").getAsString();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asString2, "");
                    com.datadog.android.rum.model.VitalAppLaunchEvent.VitalAppLaunchEventSessionType fromJson = companion.fromJson(asString2);
                    com.google.gson.JsonElement jsonElement = jsonObject.get("has_replay");
                    java.lang.Boolean valueOf = jsonElement != null ? java.lang.Boolean.valueOf(jsonElement.getAsBoolean()) : null;
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asString, "");
                    return new com.datadog.android.rum.model.VitalAppLaunchEvent.VitalAppLaunchEventSession(asString, fromJson, valueOf);
                } catch (java.lang.IllegalStateException e) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type VitalAppLaunchEventSession", e);
                } catch (java.lang.NullPointerException e2) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type VitalAppLaunchEventSession", e2);
                } catch (java.lang.NumberFormatException e3) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type VitalAppLaunchEventSession", e3);
                }
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public final java.lang.String toString() {
            java.lang.String str = this.id;
            com.datadog.android.rum.model.VitalAppLaunchEvent.VitalAppLaunchEventSessionType vitalAppLaunchEventSessionType = this.type;
            java.lang.Boolean bool = this.hasReplay;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("VitalAppLaunchEventSession(id=");
            sb.append(str);
            sb.append(", type=");
            sb.append(vitalAppLaunchEventSessionType);
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
            if (!(other instanceof com.datadog.android.rum.model.VitalAppLaunchEvent.VitalAppLaunchEventSession)) {
                return false;
            }
            com.datadog.android.rum.model.VitalAppLaunchEvent.VitalAppLaunchEventSession vitalAppLaunchEventSession = (com.datadog.android.rum.model.VitalAppLaunchEvent.VitalAppLaunchEventSession) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.id, vitalAppLaunchEventSession.id) && this.type == vitalAppLaunchEventSession.type && kotlin.jvm.internal.Intrinsics.areEqual(this.hasReplay, vitalAppLaunchEventSession.hasReplay);
        }

        public final com.datadog.android.rum.model.VitalAppLaunchEvent.VitalAppLaunchEventSession copy(java.lang.String id, com.datadog.android.rum.model.VitalAppLaunchEvent.VitalAppLaunchEventSessionType type, java.lang.Boolean hasReplay) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
            return new com.datadog.android.rum.model.VitalAppLaunchEvent.VitalAppLaunchEventSession(id, type, hasReplay);
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.Boolean getHasReplay() {
            return this.hasReplay;
        }

        /* renamed from: component2, reason: from getter */
        public final com.datadog.android.rum.model.VitalAppLaunchEvent.VitalAppLaunchEventSessionType getType() {
            return this.type;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getId() {
            return this.id;
        }

        @kotlin.jvm.JvmStatic
        public static final com.datadog.android.rum.model.VitalAppLaunchEvent.VitalAppLaunchEventSession fromJsonObject(com.google.gson.JsonObject jsonObject) throws com.google.gson.JsonParseException {
            return INSTANCE.fromJsonObject(jsonObject);
        }

        @kotlin.jvm.JvmStatic
        public static final com.datadog.android.rum.model.VitalAppLaunchEvent.VitalAppLaunchEventSession fromJson(java.lang.String str) throws com.google.gson.JsonParseException {
            return INSTANCE.fromJson(str);
        }

        public static /* synthetic */ com.datadog.android.rum.model.VitalAppLaunchEvent.VitalAppLaunchEventSession copy$default(com.datadog.android.rum.model.VitalAppLaunchEvent.VitalAppLaunchEventSession vitalAppLaunchEventSession, java.lang.String str, com.datadog.android.rum.model.VitalAppLaunchEvent.VitalAppLaunchEventSessionType vitalAppLaunchEventSessionType, java.lang.Boolean bool, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = vitalAppLaunchEventSession.id;
            }
            if ((i & 2) != 0) {
                vitalAppLaunchEventSessionType = vitalAppLaunchEventSession.type;
            }
            if ((i & 4) != 0) {
                bool = vitalAppLaunchEventSession.hasReplay;
            }
            return vitalAppLaunchEventSession.copy(str, vitalAppLaunchEventSessionType, bool);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0086\b\u0018\u0000 $2\u00020\u0001:\u0001$B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\nJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\nJ<\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\nR$\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001d\u0010\n\"\u0004\b\u001e\u0010\u001fR$\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u001b\u001a\u0004\b \u0010\n\"\u0004\b!\u0010\u001fR\"\u0010\u0005\u001a\u00020\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\"\u0010\n\"\u0004\b#\u0010\u001f"}, d2 = {"Lcom/datadog/android/rum/model/VitalAppLaunchEvent$VitalAppLaunchEventView;", "", "", "id", com.adjust.sdk.Constants.REFERRER, "url", "name", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/datadog/android/rum/model/VitalAppLaunchEvent$VitalAppLaunchEventView;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lcom/google/gson/JsonElement;", "toJson", "()Lcom/google/gson/JsonElement;", "toString", "Ljava/lang/String;", "getId", "getName", "setName", "(Ljava/lang/String;)V", "getReferrer", "setReferrer", "getUrl", "setUrl", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final /* data */ class VitalAppLaunchEventView {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.datadog.android.rum.model.VitalAppLaunchEvent.VitalAppLaunchEventView.Companion INSTANCE = new com.datadog.android.rum.model.VitalAppLaunchEvent.VitalAppLaunchEventView.Companion(null);
        private final java.lang.String id;
        private java.lang.String name;
        private java.lang.String referrer;
        private java.lang.String url;

        public VitalAppLaunchEventView(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
            this.id = str;
            this.referrer = str2;
            this.url = str3;
            this.name = str4;
        }

        public /* synthetic */ VitalAppLaunchEventView(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
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

        @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/datadog/android/rum/model/VitalAppLaunchEvent$VitalAppLaunchEventView$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/rum/model/VitalAppLaunchEvent$VitalAppLaunchEventView;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/rum/model/VitalAppLaunchEvent$VitalAppLaunchEventView;", "Lcom/google/gson/JsonObject;", "jsonObject", "fromJsonObject", "(Lcom/google/gson/JsonObject;)Lcom/datadog/android/rum/model/VitalAppLaunchEvent$VitalAppLaunchEventView;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @kotlin.jvm.JvmStatic
            public final com.datadog.android.rum.model.VitalAppLaunchEvent.VitalAppLaunchEventView fromJson(java.lang.String jsonString) throws com.google.gson.JsonParseException {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonString, "");
                try {
                    com.google.gson.JsonObject asJsonObject = com.google.gson.JsonParser.parseString(jsonString).getAsJsonObject();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asJsonObject, "");
                    return fromJsonObject(asJsonObject);
                } catch (java.lang.IllegalStateException e) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type VitalAppLaunchEventView", e);
                }
            }

            @kotlin.jvm.JvmStatic
            public final com.datadog.android.rum.model.VitalAppLaunchEvent.VitalAppLaunchEventView fromJsonObject(com.google.gson.JsonObject jsonObject) throws com.google.gson.JsonParseException {
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
                    return new com.datadog.android.rum.model.VitalAppLaunchEvent.VitalAppLaunchEventView(asString, asString2, asString3, asString4);
                } catch (java.lang.IllegalStateException e) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type VitalAppLaunchEventView", e);
                } catch (java.lang.NullPointerException e2) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type VitalAppLaunchEventView", e2);
                } catch (java.lang.NumberFormatException e3) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type VitalAppLaunchEventView", e3);
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
            java.lang.StringBuilder sb = new java.lang.StringBuilder("VitalAppLaunchEventView(id=");
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
            if (!(other instanceof com.datadog.android.rum.model.VitalAppLaunchEvent.VitalAppLaunchEventView)) {
                return false;
            }
            com.datadog.android.rum.model.VitalAppLaunchEvent.VitalAppLaunchEventView vitalAppLaunchEventView = (com.datadog.android.rum.model.VitalAppLaunchEvent.VitalAppLaunchEventView) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.id, vitalAppLaunchEventView.id) && kotlin.jvm.internal.Intrinsics.areEqual(this.referrer, vitalAppLaunchEventView.referrer) && kotlin.jvm.internal.Intrinsics.areEqual(this.url, vitalAppLaunchEventView.url) && kotlin.jvm.internal.Intrinsics.areEqual(this.name, vitalAppLaunchEventView.name);
        }

        public final com.datadog.android.rum.model.VitalAppLaunchEvent.VitalAppLaunchEventView copy(java.lang.String id, java.lang.String referrer, java.lang.String url, java.lang.String name2) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "");
            return new com.datadog.android.rum.model.VitalAppLaunchEvent.VitalAppLaunchEventView(id, referrer, url, name2);
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
        public static final com.datadog.android.rum.model.VitalAppLaunchEvent.VitalAppLaunchEventView fromJsonObject(com.google.gson.JsonObject jsonObject) throws com.google.gson.JsonParseException {
            return INSTANCE.fromJsonObject(jsonObject);
        }

        @kotlin.jvm.JvmStatic
        public static final com.datadog.android.rum.model.VitalAppLaunchEvent.VitalAppLaunchEventView fromJson(java.lang.String str) throws com.google.gson.JsonParseException {
            return INSTANCE.fromJson(str);
        }

        public static /* synthetic */ com.datadog.android.rum.model.VitalAppLaunchEvent.VitalAppLaunchEventView copy$default(com.datadog.android.rum.model.VitalAppLaunchEvent.VitalAppLaunchEventView vitalAppLaunchEventView, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = vitalAppLaunchEventView.id;
            }
            if ((i & 2) != 0) {
                str2 = vitalAppLaunchEventView.referrer;
            }
            if ((i & 4) != 0) {
                str3 = vitalAppLaunchEventView.url;
            }
            if ((i & 8) != 0) {
                str4 = vitalAppLaunchEventView.name;
            }
            return vitalAppLaunchEventView.copy(str, str2, str3, str4);
        }
    }

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0086\b\u0018\u0000 &2\u00020\u0001:\u0001&BO\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\fJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\fJ\u001e\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011JX\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0007HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\r\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001e\u0010\fR%\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00078\u0007¢\u0006\f\n\u0004\b\b\u0010\u001f\u001a\u0004\b \u0010\u0011R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010!\u001a\u0004\b\"\u0010\fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010!\u001a\u0004\b#\u0010\fR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b$\u0010\fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010!\u001a\u0004\b%\u0010\f"}, d2 = {"Lcom/datadog/android/rum/model/VitalAppLaunchEvent$Usr;", "", "", "id", "name", "email", "anonymousId", "", "additionalProperties", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "()Ljava/util/Map;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)Lcom/datadog/android/rum/model/VitalAppLaunchEvent$Usr;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lcom/google/gson/JsonElement;", "toJson", "()Lcom/google/gson/JsonElement;", "toString", "Ljava/util/Map;", "getAdditionalProperties", "Ljava/lang/String;", "getAnonymousId", "getEmail", "getId", "getName", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final /* data */ class Usr {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.datadog.android.rum.model.VitalAppLaunchEvent.Usr.Companion INSTANCE = new com.datadog.android.rum.model.VitalAppLaunchEvent.Usr.Companion(null);
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

        @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\fR \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\r8\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011"}, d2 = {"Lcom/datadog/android/rum/model/VitalAppLaunchEvent$Usr$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/rum/model/VitalAppLaunchEvent$Usr;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/rum/model/VitalAppLaunchEvent$Usr;", "Lcom/google/gson/JsonObject;", "jsonObject", "fromJsonObject", "(Lcom/google/gson/JsonObject;)Lcom/datadog/android/rum/model/VitalAppLaunchEvent$Usr;", "", "RESERVED_PROPERTIES", "[Ljava/lang/String;", "getRESERVED_PROPERTIES$dd_sdk_android_rum_release", "()[Ljava/lang/String;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public final java.lang.String[] getRESERVED_PROPERTIES$dd_sdk_android_rum_release() {
                return com.datadog.android.rum.model.VitalAppLaunchEvent.Usr.RESERVED_PROPERTIES;
            }

            @kotlin.jvm.JvmStatic
            public final com.datadog.android.rum.model.VitalAppLaunchEvent.Usr fromJson(java.lang.String jsonString) throws com.google.gson.JsonParseException {
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
            public final com.datadog.android.rum.model.VitalAppLaunchEvent.Usr fromJsonObject(com.google.gson.JsonObject jsonObject) throws com.google.gson.JsonParseException {
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
                    return new com.datadog.android.rum.model.VitalAppLaunchEvent.Usr(asString, asString2, asString3, asString4, linkedHashMap);
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
            if (!(other instanceof com.datadog.android.rum.model.VitalAppLaunchEvent.Usr)) {
                return false;
            }
            com.datadog.android.rum.model.VitalAppLaunchEvent.Usr usr = (com.datadog.android.rum.model.VitalAppLaunchEvent.Usr) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.id, usr.id) && kotlin.jvm.internal.Intrinsics.areEqual(this.name, usr.name) && kotlin.jvm.internal.Intrinsics.areEqual(this.email, usr.email) && kotlin.jvm.internal.Intrinsics.areEqual(this.anonymousId, usr.anonymousId) && kotlin.jvm.internal.Intrinsics.areEqual(this.additionalProperties, usr.additionalProperties);
        }

        public final com.datadog.android.rum.model.VitalAppLaunchEvent.Usr copy(java.lang.String id, java.lang.String name2, java.lang.String email, java.lang.String anonymousId, java.util.Map<java.lang.String, java.lang.Object> additionalProperties) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(additionalProperties, "");
            return new com.datadog.android.rum.model.VitalAppLaunchEvent.Usr(id, name2, email, anonymousId, additionalProperties);
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
        public static final com.datadog.android.rum.model.VitalAppLaunchEvent.Usr fromJsonObject(com.google.gson.JsonObject jsonObject) throws com.google.gson.JsonParseException {
            return INSTANCE.fromJsonObject(jsonObject);
        }

        @kotlin.jvm.JvmStatic
        public static final com.datadog.android.rum.model.VitalAppLaunchEvent.Usr fromJson(java.lang.String str) throws com.google.gson.JsonParseException {
            return INSTANCE.fromJson(str);
        }

        public static /* synthetic */ com.datadog.android.rum.model.VitalAppLaunchEvent.Usr copy$default(com.datadog.android.rum.model.VitalAppLaunchEvent.Usr usr, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.util.Map map, int i, java.lang.Object obj) {
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

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\b\u0018\u0000  2\u00020\u0001:\u0001 B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u001e\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0005HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ>\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0005HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\nR%\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00058\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001c\u0010\rR\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\nR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001d\u001a\u0004\b\u001f\u0010\n"}, d2 = {"Lcom/datadog/android/rum/model/VitalAppLaunchEvent$Account;", "", "", "id", "name", "", "additionalProperties", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Ljava/util/Map;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)Lcom/datadog/android/rum/model/VitalAppLaunchEvent$Account;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lcom/google/gson/JsonElement;", "toJson", "()Lcom/google/gson/JsonElement;", "toString", "Ljava/util/Map;", "getAdditionalProperties", "Ljava/lang/String;", "getId", "getName", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final /* data */ class Account {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.datadog.android.rum.model.VitalAppLaunchEvent.Account.Companion INSTANCE = new com.datadog.android.rum.model.VitalAppLaunchEvent.Account.Companion(null);
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

        @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\fR \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\r8\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011"}, d2 = {"Lcom/datadog/android/rum/model/VitalAppLaunchEvent$Account$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/rum/model/VitalAppLaunchEvent$Account;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/rum/model/VitalAppLaunchEvent$Account;", "Lcom/google/gson/JsonObject;", "jsonObject", "fromJsonObject", "(Lcom/google/gson/JsonObject;)Lcom/datadog/android/rum/model/VitalAppLaunchEvent$Account;", "", "RESERVED_PROPERTIES", "[Ljava/lang/String;", "getRESERVED_PROPERTIES$dd_sdk_android_rum_release", "()[Ljava/lang/String;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public final java.lang.String[] getRESERVED_PROPERTIES$dd_sdk_android_rum_release() {
                return com.datadog.android.rum.model.VitalAppLaunchEvent.Account.RESERVED_PROPERTIES;
            }

            @kotlin.jvm.JvmStatic
            public final com.datadog.android.rum.model.VitalAppLaunchEvent.Account fromJson(java.lang.String jsonString) throws com.google.gson.JsonParseException {
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
            public final com.datadog.android.rum.model.VitalAppLaunchEvent.Account fromJsonObject(com.google.gson.JsonObject jsonObject) throws com.google.gson.JsonParseException {
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
                    return new com.datadog.android.rum.model.VitalAppLaunchEvent.Account(asString, asString2, linkedHashMap);
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
            if (!(other instanceof com.datadog.android.rum.model.VitalAppLaunchEvent.Account)) {
                return false;
            }
            com.datadog.android.rum.model.VitalAppLaunchEvent.Account account = (com.datadog.android.rum.model.VitalAppLaunchEvent.Account) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.id, account.id) && kotlin.jvm.internal.Intrinsics.areEqual(this.name, account.name) && kotlin.jvm.internal.Intrinsics.areEqual(this.additionalProperties, account.additionalProperties);
        }

        public final com.datadog.android.rum.model.VitalAppLaunchEvent.Account copy(java.lang.String id, java.lang.String name2, java.util.Map<java.lang.String, java.lang.Object> additionalProperties) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(additionalProperties, "");
            return new com.datadog.android.rum.model.VitalAppLaunchEvent.Account(id, name2, additionalProperties);
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
        public static final com.datadog.android.rum.model.VitalAppLaunchEvent.Account fromJsonObject(com.google.gson.JsonObject jsonObject) throws com.google.gson.JsonParseException {
            return INSTANCE.fromJsonObject(jsonObject);
        }

        @kotlin.jvm.JvmStatic
        public static final com.datadog.android.rum.model.VitalAppLaunchEvent.Account fromJson(java.lang.String str) throws com.google.gson.JsonParseException {
            return INSTANCE.fromJson(str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.datadog.android.rum.model.VitalAppLaunchEvent.Account copy$default(com.datadog.android.rum.model.VitalAppLaunchEvent.Account account, java.lang.String str, java.lang.String str2, java.util.Map map, int i, java.lang.Object obj) {
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

    @kotlin.Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\b\u0018\u0000 ,2\u00020\u0001:\u0001,B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014JD\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\r\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010\"\u001a\u00020!HÖ\u0001¢\u0006\u0004\b\"\u0010#R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0007¢\u0006\f\n\u0004\b\n\u0010$\u001a\u0004\b%\u0010\u0014R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010&\u001a\u0004\b'\u0010\u0012R\"\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010(\u001a\u0004\b)\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010*\u001a\u0004\b+\u0010\u000e"}, d2 = {"Lcom/datadog/android/rum/model/VitalAppLaunchEvent$Connectivity;", "", "Lcom/datadog/android/rum/model/VitalAppLaunchEvent$ConnectivityStatus;", "status", "", "Lcom/datadog/android/rum/model/VitalAppLaunchEvent$Interface;", "interfaces", "Lcom/datadog/android/rum/model/VitalAppLaunchEvent$EffectiveType;", "effectiveType", "Lcom/datadog/android/rum/model/VitalAppLaunchEvent$Cellular;", "cellular", "<init>", "(Lcom/datadog/android/rum/model/VitalAppLaunchEvent$ConnectivityStatus;Ljava/util/List;Lcom/datadog/android/rum/model/VitalAppLaunchEvent$EffectiveType;Lcom/datadog/android/rum/model/VitalAppLaunchEvent$Cellular;)V", "component1", "()Lcom/datadog/android/rum/model/VitalAppLaunchEvent$ConnectivityStatus;", "component2", "()Ljava/util/List;", "component3", "()Lcom/datadog/android/rum/model/VitalAppLaunchEvent$EffectiveType;", "component4", "()Lcom/datadog/android/rum/model/VitalAppLaunchEvent$Cellular;", "copy", "(Lcom/datadog/android/rum/model/VitalAppLaunchEvent$ConnectivityStatus;Ljava/util/List;Lcom/datadog/android/rum/model/VitalAppLaunchEvent$EffectiveType;Lcom/datadog/android/rum/model/VitalAppLaunchEvent$Cellular;)Lcom/datadog/android/rum/model/VitalAppLaunchEvent$Connectivity;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lcom/google/gson/JsonElement;", "toJson", "()Lcom/google/gson/JsonElement;", "", "toString", "()Ljava/lang/String;", "Lcom/datadog/android/rum/model/VitalAppLaunchEvent$Cellular;", "getCellular", "Lcom/datadog/android/rum/model/VitalAppLaunchEvent$EffectiveType;", "getEffectiveType", "Ljava/util/List;", "getInterfaces", "Lcom/datadog/android/rum/model/VitalAppLaunchEvent$ConnectivityStatus;", "getStatus", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final /* data */ class Connectivity {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.datadog.android.rum.model.VitalAppLaunchEvent.Connectivity.Companion INSTANCE = new com.datadog.android.rum.model.VitalAppLaunchEvent.Connectivity.Companion(null);
        private final com.datadog.android.rum.model.VitalAppLaunchEvent.Cellular cellular;
        private final com.datadog.android.rum.model.VitalAppLaunchEvent.EffectiveType effectiveType;
        private final java.util.List<com.datadog.android.rum.model.VitalAppLaunchEvent.Interface> interfaces;
        private final com.datadog.android.rum.model.VitalAppLaunchEvent.ConnectivityStatus status;

        /* JADX WARN: Multi-variable type inference failed */
        public Connectivity(com.datadog.android.rum.model.VitalAppLaunchEvent.ConnectivityStatus connectivityStatus, java.util.List<? extends com.datadog.android.rum.model.VitalAppLaunchEvent.Interface> list, com.datadog.android.rum.model.VitalAppLaunchEvent.EffectiveType effectiveType, com.datadog.android.rum.model.VitalAppLaunchEvent.Cellular cellular) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(connectivityStatus, "");
            this.status = connectivityStatus;
            this.interfaces = list;
            this.effectiveType = effectiveType;
            this.cellular = cellular;
        }

        public /* synthetic */ Connectivity(com.datadog.android.rum.model.VitalAppLaunchEvent.ConnectivityStatus connectivityStatus, java.util.List list, com.datadog.android.rum.model.VitalAppLaunchEvent.EffectiveType effectiveType, com.datadog.android.rum.model.VitalAppLaunchEvent.Cellular cellular, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(connectivityStatus, (i & 2) != 0 ? null : list, (i & 4) != 0 ? null : effectiveType, (i & 8) != 0 ? null : cellular);
        }

        public final com.datadog.android.rum.model.VitalAppLaunchEvent.ConnectivityStatus getStatus() {
            return this.status;
        }

        public final java.util.List<com.datadog.android.rum.model.VitalAppLaunchEvent.Interface> getInterfaces() {
            return this.interfaces;
        }

        public final com.datadog.android.rum.model.VitalAppLaunchEvent.EffectiveType getEffectiveType() {
            return this.effectiveType;
        }

        public final com.datadog.android.rum.model.VitalAppLaunchEvent.Cellular getCellular() {
            return this.cellular;
        }

        public final com.google.gson.JsonElement toJson() {
            com.google.gson.JsonObject jsonObject = new com.google.gson.JsonObject();
            jsonObject.add("status", this.status.toJson());
            java.util.List<com.datadog.android.rum.model.VitalAppLaunchEvent.Interface> list = this.interfaces;
            if (list != null) {
                com.google.gson.JsonArray jsonArray = new com.google.gson.JsonArray(list.size());
                java.util.Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    jsonArray.add(((com.datadog.android.rum.model.VitalAppLaunchEvent.Interface) it.next()).toJson());
                }
                jsonObject.add("interfaces", jsonArray);
            }
            com.datadog.android.rum.model.VitalAppLaunchEvent.EffectiveType effectiveType = this.effectiveType;
            if (effectiveType != null) {
                jsonObject.add("effective_type", effectiveType.toJson());
            }
            com.datadog.android.rum.model.VitalAppLaunchEvent.Cellular cellular = this.cellular;
            if (cellular != null) {
                jsonObject.add("cellular", cellular.toJson());
            }
            return jsonObject;
        }

        @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/datadog/android/rum/model/VitalAppLaunchEvent$Connectivity$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/rum/model/VitalAppLaunchEvent$Connectivity;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/rum/model/VitalAppLaunchEvent$Connectivity;", "Lcom/google/gson/JsonObject;", "jsonObject", "fromJsonObject", "(Lcom/google/gson/JsonObject;)Lcom/datadog/android/rum/model/VitalAppLaunchEvent$Connectivity;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @kotlin.jvm.JvmStatic
            public final com.datadog.android.rum.model.VitalAppLaunchEvent.Connectivity fromJson(java.lang.String jsonString) throws com.google.gson.JsonParseException {
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
            public final com.datadog.android.rum.model.VitalAppLaunchEvent.Connectivity fromJsonObject(com.google.gson.JsonObject jsonObject) throws com.google.gson.JsonParseException {
                java.util.ArrayList arrayList;
                com.google.gson.JsonObject asJsonObject;
                java.lang.String asString;
                com.google.gson.JsonArray asJsonArray;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonObject, "");
                try {
                    com.datadog.android.rum.model.VitalAppLaunchEvent.ConnectivityStatus.Companion companion = com.datadog.android.rum.model.VitalAppLaunchEvent.ConnectivityStatus.INSTANCE;
                    java.lang.String asString2 = jsonObject.get("status").getAsString();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asString2, "");
                    com.datadog.android.rum.model.VitalAppLaunchEvent.ConnectivityStatus fromJson = companion.fromJson(asString2);
                    com.google.gson.JsonElement jsonElement = jsonObject.get("interfaces");
                    com.datadog.android.rum.model.VitalAppLaunchEvent.Cellular cellular = null;
                    if (jsonElement == null || (asJsonArray = jsonElement.getAsJsonArray()) == null) {
                        arrayList = null;
                    } else {
                        arrayList = new java.util.ArrayList(asJsonArray.size());
                        for (com.google.gson.JsonElement jsonElement2 : asJsonArray) {
                            com.datadog.android.rum.model.VitalAppLaunchEvent.Interface.Companion companion2 = com.datadog.android.rum.model.VitalAppLaunchEvent.Interface.INSTANCE;
                            java.lang.String asString3 = jsonElement2.getAsString();
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asString3, "");
                            arrayList.add(companion2.fromJson(asString3));
                        }
                    }
                    com.google.gson.JsonElement jsonElement3 = jsonObject.get("effective_type");
                    com.datadog.android.rum.model.VitalAppLaunchEvent.EffectiveType fromJson2 = (jsonElement3 == null || (asString = jsonElement3.getAsString()) == null) ? null : com.datadog.android.rum.model.VitalAppLaunchEvent.EffectiveType.INSTANCE.fromJson(asString);
                    com.google.gson.JsonElement jsonElement4 = jsonObject.get("cellular");
                    if (jsonElement4 != null && (asJsonObject = jsonElement4.getAsJsonObject()) != null) {
                        cellular = com.datadog.android.rum.model.VitalAppLaunchEvent.Cellular.INSTANCE.fromJsonObject(asJsonObject);
                    }
                    return new com.datadog.android.rum.model.VitalAppLaunchEvent.Connectivity(fromJson, arrayList, fromJson2, cellular);
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
            com.datadog.android.rum.model.VitalAppLaunchEvent.ConnectivityStatus connectivityStatus = this.status;
            java.util.List<com.datadog.android.rum.model.VitalAppLaunchEvent.Interface> list = this.interfaces;
            com.datadog.android.rum.model.VitalAppLaunchEvent.EffectiveType effectiveType = this.effectiveType;
            com.datadog.android.rum.model.VitalAppLaunchEvent.Cellular cellular = this.cellular;
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
            java.util.List<com.datadog.android.rum.model.VitalAppLaunchEvent.Interface> list = this.interfaces;
            int hashCode2 = list == null ? 0 : list.hashCode();
            com.datadog.android.rum.model.VitalAppLaunchEvent.EffectiveType effectiveType = this.effectiveType;
            int hashCode3 = effectiveType == null ? 0 : effectiveType.hashCode();
            com.datadog.android.rum.model.VitalAppLaunchEvent.Cellular cellular = this.cellular;
            return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (cellular != null ? cellular.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.datadog.android.rum.model.VitalAppLaunchEvent.Connectivity)) {
                return false;
            }
            com.datadog.android.rum.model.VitalAppLaunchEvent.Connectivity connectivity = (com.datadog.android.rum.model.VitalAppLaunchEvent.Connectivity) other;
            return this.status == connectivity.status && kotlin.jvm.internal.Intrinsics.areEqual(this.interfaces, connectivity.interfaces) && this.effectiveType == connectivity.effectiveType && kotlin.jvm.internal.Intrinsics.areEqual(this.cellular, connectivity.cellular);
        }

        public final com.datadog.android.rum.model.VitalAppLaunchEvent.Connectivity copy(com.datadog.android.rum.model.VitalAppLaunchEvent.ConnectivityStatus status, java.util.List<? extends com.datadog.android.rum.model.VitalAppLaunchEvent.Interface> interfaces, com.datadog.android.rum.model.VitalAppLaunchEvent.EffectiveType effectiveType, com.datadog.android.rum.model.VitalAppLaunchEvent.Cellular cellular) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(status, "");
            return new com.datadog.android.rum.model.VitalAppLaunchEvent.Connectivity(status, interfaces, effectiveType, cellular);
        }

        /* renamed from: component4, reason: from getter */
        public final com.datadog.android.rum.model.VitalAppLaunchEvent.Cellular getCellular() {
            return this.cellular;
        }

        /* renamed from: component3, reason: from getter */
        public final com.datadog.android.rum.model.VitalAppLaunchEvent.EffectiveType getEffectiveType() {
            return this.effectiveType;
        }

        public final java.util.List<com.datadog.android.rum.model.VitalAppLaunchEvent.Interface> component2() {
            return this.interfaces;
        }

        /* renamed from: component1, reason: from getter */
        public final com.datadog.android.rum.model.VitalAppLaunchEvent.ConnectivityStatus getStatus() {
            return this.status;
        }

        @kotlin.jvm.JvmStatic
        public static final com.datadog.android.rum.model.VitalAppLaunchEvent.Connectivity fromJsonObject(com.google.gson.JsonObject jsonObject) throws com.google.gson.JsonParseException {
            return INSTANCE.fromJsonObject(jsonObject);
        }

        @kotlin.jvm.JvmStatic
        public static final com.datadog.android.rum.model.VitalAppLaunchEvent.Connectivity fromJson(java.lang.String str) throws com.google.gson.JsonParseException {
            return INSTANCE.fromJson(str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.datadog.android.rum.model.VitalAppLaunchEvent.Connectivity copy$default(com.datadog.android.rum.model.VitalAppLaunchEvent.Connectivity connectivity, com.datadog.android.rum.model.VitalAppLaunchEvent.ConnectivityStatus connectivityStatus, java.util.List list, com.datadog.android.rum.model.VitalAppLaunchEvent.EffectiveType effectiveType, com.datadog.android.rum.model.VitalAppLaunchEvent.Cellular cellular, int i, java.lang.Object obj) {
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

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\b\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\u0007"}, d2 = {"Lcom/datadog/android/rum/model/VitalAppLaunchEvent$Display;", "", "Lcom/datadog/android/rum/model/VitalAppLaunchEvent$Viewport;", "viewport", "<init>", "(Lcom/datadog/android/rum/model/VitalAppLaunchEvent$Viewport;)V", "component1", "()Lcom/datadog/android/rum/model/VitalAppLaunchEvent$Viewport;", "copy", "(Lcom/datadog/android/rum/model/VitalAppLaunchEvent$Viewport;)Lcom/datadog/android/rum/model/VitalAppLaunchEvent$Display;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lcom/google/gson/JsonElement;", "toJson", "()Lcom/google/gson/JsonElement;", "", "toString", "()Ljava/lang/String;", "Lcom/datadog/android/rum/model/VitalAppLaunchEvent$Viewport;", "getViewport", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final /* data */ class Display {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.datadog.android.rum.model.VitalAppLaunchEvent.Display.Companion INSTANCE = new com.datadog.android.rum.model.VitalAppLaunchEvent.Display.Companion(null);
        private final com.datadog.android.rum.model.VitalAppLaunchEvent.Viewport viewport;

        public Display(com.datadog.android.rum.model.VitalAppLaunchEvent.Viewport viewport) {
            this.viewport = viewport;
        }

        public /* synthetic */ Display(com.datadog.android.rum.model.VitalAppLaunchEvent.Viewport viewport, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : viewport);
        }

        public final com.datadog.android.rum.model.VitalAppLaunchEvent.Viewport getViewport() {
            return this.viewport;
        }

        public final com.google.gson.JsonElement toJson() {
            com.google.gson.JsonObject jsonObject = new com.google.gson.JsonObject();
            com.datadog.android.rum.model.VitalAppLaunchEvent.Viewport viewport = this.viewport;
            if (viewport != null) {
                jsonObject.add("viewport", viewport.toJson());
            }
            return jsonObject;
        }

        @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/datadog/android/rum/model/VitalAppLaunchEvent$Display$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/rum/model/VitalAppLaunchEvent$Display;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/rum/model/VitalAppLaunchEvent$Display;", "Lcom/google/gson/JsonObject;", "jsonObject", "fromJsonObject", "(Lcom/google/gson/JsonObject;)Lcom/datadog/android/rum/model/VitalAppLaunchEvent$Display;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @kotlin.jvm.JvmStatic
            public final com.datadog.android.rum.model.VitalAppLaunchEvent.Display fromJson(java.lang.String jsonString) throws com.google.gson.JsonParseException {
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
            public final com.datadog.android.rum.model.VitalAppLaunchEvent.Display fromJsonObject(com.google.gson.JsonObject jsonObject) throws com.google.gson.JsonParseException {
                com.google.gson.JsonObject asJsonObject;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonObject, "");
                try {
                    com.google.gson.JsonElement jsonElement = jsonObject.get("viewport");
                    return new com.datadog.android.rum.model.VitalAppLaunchEvent.Display((jsonElement == null || (asJsonObject = jsonElement.getAsJsonObject()) == null) ? null : com.datadog.android.rum.model.VitalAppLaunchEvent.Viewport.INSTANCE.fromJsonObject(asJsonObject));
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
            com.datadog.android.rum.model.VitalAppLaunchEvent.Viewport viewport = this.viewport;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Display(viewport=");
            sb.append(viewport);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            com.datadog.android.rum.model.VitalAppLaunchEvent.Viewport viewport = this.viewport;
            if (viewport == null) {
                return 0;
            }
            return viewport.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.datadog.android.rum.model.VitalAppLaunchEvent.Display) && kotlin.jvm.internal.Intrinsics.areEqual(this.viewport, ((com.datadog.android.rum.model.VitalAppLaunchEvent.Display) other).viewport);
        }

        public final com.datadog.android.rum.model.VitalAppLaunchEvent.Display copy(com.datadog.android.rum.model.VitalAppLaunchEvent.Viewport viewport) {
            return new com.datadog.android.rum.model.VitalAppLaunchEvent.Display(viewport);
        }

        /* renamed from: component1, reason: from getter */
        public final com.datadog.android.rum.model.VitalAppLaunchEvent.Viewport getViewport() {
            return this.viewport;
        }

        @kotlin.jvm.JvmStatic
        public static final com.datadog.android.rum.model.VitalAppLaunchEvent.Display fromJsonObject(com.google.gson.JsonObject jsonObject) throws com.google.gson.JsonParseException {
            return INSTANCE.fromJsonObject(jsonObject);
        }

        @kotlin.jvm.JvmStatic
        public static final com.datadog.android.rum.model.VitalAppLaunchEvent.Display fromJson(java.lang.String str) throws com.google.gson.JsonParseException {
            return INSTANCE.fromJson(str);
        }

        public static /* synthetic */ com.datadog.android.rum.model.VitalAppLaunchEvent.Display copy$default(com.datadog.android.rum.model.VitalAppLaunchEvent.Display display, com.datadog.android.rum.model.VitalAppLaunchEvent.Viewport viewport, int i, java.lang.Object obj) {
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

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\b\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ0\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0011\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\nR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001b\u0010\rR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001c\u001a\u0004\b\u001d\u0010\nR\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001e\u0010\n"}, d2 = {"Lcom/datadog/android/rum/model/VitalAppLaunchEvent$Synthetics;", "", "", "testId", "resultId", "", "injected", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Ljava/lang/Boolean;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)Lcom/datadog/android/rum/model/VitalAppLaunchEvent$Synthetics;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lcom/google/gson/JsonElement;", "toJson", "()Lcom/google/gson/JsonElement;", "toString", "Ljava/lang/Boolean;", "getInjected", "Ljava/lang/String;", "getResultId", "getTestId", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final /* data */ class Synthetics {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.datadog.android.rum.model.VitalAppLaunchEvent.Synthetics.Companion INSTANCE = new com.datadog.android.rum.model.VitalAppLaunchEvent.Synthetics.Companion(null);
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

        @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/datadog/android/rum/model/VitalAppLaunchEvent$Synthetics$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/rum/model/VitalAppLaunchEvent$Synthetics;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/rum/model/VitalAppLaunchEvent$Synthetics;", "Lcom/google/gson/JsonObject;", "jsonObject", "fromJsonObject", "(Lcom/google/gson/JsonObject;)Lcom/datadog/android/rum/model/VitalAppLaunchEvent$Synthetics;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @kotlin.jvm.JvmStatic
            public final com.datadog.android.rum.model.VitalAppLaunchEvent.Synthetics fromJson(java.lang.String jsonString) throws com.google.gson.JsonParseException {
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
            public final com.datadog.android.rum.model.VitalAppLaunchEvent.Synthetics fromJsonObject(com.google.gson.JsonObject jsonObject) throws com.google.gson.JsonParseException {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonObject, "");
                try {
                    java.lang.String asString = jsonObject.get("test_id").getAsString();
                    java.lang.String asString2 = jsonObject.get("result_id").getAsString();
                    com.google.gson.JsonElement jsonElement = jsonObject.get("injected");
                    java.lang.Boolean valueOf = jsonElement != null ? java.lang.Boolean.valueOf(jsonElement.getAsBoolean()) : null;
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asString, "");
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asString2, "");
                    return new com.datadog.android.rum.model.VitalAppLaunchEvent.Synthetics(asString, asString2, valueOf);
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
            if (!(other instanceof com.datadog.android.rum.model.VitalAppLaunchEvent.Synthetics)) {
                return false;
            }
            com.datadog.android.rum.model.VitalAppLaunchEvent.Synthetics synthetics = (com.datadog.android.rum.model.VitalAppLaunchEvent.Synthetics) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.testId, synthetics.testId) && kotlin.jvm.internal.Intrinsics.areEqual(this.resultId, synthetics.resultId) && kotlin.jvm.internal.Intrinsics.areEqual(this.injected, synthetics.injected);
        }

        public final com.datadog.android.rum.model.VitalAppLaunchEvent.Synthetics copy(java.lang.String testId, java.lang.String resultId, java.lang.Boolean injected) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(testId, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(resultId, "");
            return new com.datadog.android.rum.model.VitalAppLaunchEvent.Synthetics(testId, resultId, injected);
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
        public static final com.datadog.android.rum.model.VitalAppLaunchEvent.Synthetics fromJsonObject(com.google.gson.JsonObject jsonObject) throws com.google.gson.JsonParseException {
            return INSTANCE.fromJsonObject(jsonObject);
        }

        @kotlin.jvm.JvmStatic
        public static final com.datadog.android.rum.model.VitalAppLaunchEvent.Synthetics fromJson(java.lang.String str) throws com.google.gson.JsonParseException {
            return INSTANCE.fromJson(str);
        }

        public static /* synthetic */ com.datadog.android.rum.model.VitalAppLaunchEvent.Synthetics copy$default(com.datadog.android.rum.model.VitalAppLaunchEvent.Synthetics synthetics, java.lang.String str, java.lang.String str2, java.lang.Boolean bool, int i, java.lang.Object obj) {
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

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/datadog/android/rum/model/VitalAppLaunchEvent$CiTest;", "", "", "testExecutionId", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/datadog/android/rum/model/VitalAppLaunchEvent$CiTest;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lcom/google/gson/JsonElement;", "toJson", "()Lcom/google/gson/JsonElement;", "toString", "Ljava/lang/String;", "getTestExecutionId", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final /* data */ class CiTest {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.datadog.android.rum.model.VitalAppLaunchEvent.CiTest.Companion INSTANCE = new com.datadog.android.rum.model.VitalAppLaunchEvent.CiTest.Companion(null);
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

        @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/datadog/android/rum/model/VitalAppLaunchEvent$CiTest$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/rum/model/VitalAppLaunchEvent$CiTest;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/rum/model/VitalAppLaunchEvent$CiTest;", "Lcom/google/gson/JsonObject;", "jsonObject", "fromJsonObject", "(Lcom/google/gson/JsonObject;)Lcom/datadog/android/rum/model/VitalAppLaunchEvent$CiTest;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @kotlin.jvm.JvmStatic
            public final com.datadog.android.rum.model.VitalAppLaunchEvent.CiTest fromJson(java.lang.String jsonString) throws com.google.gson.JsonParseException {
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
            public final com.datadog.android.rum.model.VitalAppLaunchEvent.CiTest fromJsonObject(com.google.gson.JsonObject jsonObject) throws com.google.gson.JsonParseException {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonObject, "");
                try {
                    java.lang.String asString = jsonObject.get("test_execution_id").getAsString();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asString, "");
                    return new com.datadog.android.rum.model.VitalAppLaunchEvent.CiTest(asString);
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
            return (other instanceof com.datadog.android.rum.model.VitalAppLaunchEvent.CiTest) && kotlin.jvm.internal.Intrinsics.areEqual(this.testExecutionId, ((com.datadog.android.rum.model.VitalAppLaunchEvent.CiTest) other).testExecutionId);
        }

        public final com.datadog.android.rum.model.VitalAppLaunchEvent.CiTest copy(java.lang.String testExecutionId) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(testExecutionId, "");
            return new com.datadog.android.rum.model.VitalAppLaunchEvent.CiTest(testExecutionId);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getTestExecutionId() {
            return this.testExecutionId;
        }

        @kotlin.jvm.JvmStatic
        public static final com.datadog.android.rum.model.VitalAppLaunchEvent.CiTest fromJsonObject(com.google.gson.JsonObject jsonObject) throws com.google.gson.JsonParseException {
            return INSTANCE.fromJsonObject(jsonObject);
        }

        @kotlin.jvm.JvmStatic
        public static final com.datadog.android.rum.model.VitalAppLaunchEvent.CiTest fromJson(java.lang.String str) throws com.google.gson.JsonParseException {
            return INSTANCE.fromJson(str);
        }

        public static /* synthetic */ com.datadog.android.rum.model.VitalAppLaunchEvent.CiTest copy$default(com.datadog.android.rum.model.VitalAppLaunchEvent.CiTest ciTest, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = ciTest.testExecutionId;
            }
            return ciTest.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\b\u0018\u0000  2\u00020\u0001:\u0001 B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\nJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\nJ:\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\nR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\nR\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001d\u0010\nR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001b\u001a\u0004\b\u001e\u0010\nR\u001a\u0010\u0006\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001f\u0010\n"}, d2 = {"Lcom/datadog/android/rum/model/VitalAppLaunchEvent$Os;", "", "", "name", "version", "build", "versionMajor", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/datadog/android/rum/model/VitalAppLaunchEvent$Os;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lcom/google/gson/JsonElement;", "toJson", "()Lcom/google/gson/JsonElement;", "toString", "Ljava/lang/String;", "getBuild", "getName", "getVersion", "getVersionMajor", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final /* data */ class Os {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.datadog.android.rum.model.VitalAppLaunchEvent.Os.Companion INSTANCE = new com.datadog.android.rum.model.VitalAppLaunchEvent.Os.Companion(null);
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

        @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/datadog/android/rum/model/VitalAppLaunchEvent$Os$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/rum/model/VitalAppLaunchEvent$Os;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/rum/model/VitalAppLaunchEvent$Os;", "Lcom/google/gson/JsonObject;", "jsonObject", "fromJsonObject", "(Lcom/google/gson/JsonObject;)Lcom/datadog/android/rum/model/VitalAppLaunchEvent$Os;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @kotlin.jvm.JvmStatic
            public final com.datadog.android.rum.model.VitalAppLaunchEvent.Os fromJson(java.lang.String jsonString) throws com.google.gson.JsonParseException {
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
            public final com.datadog.android.rum.model.VitalAppLaunchEvent.Os fromJsonObject(com.google.gson.JsonObject jsonObject) throws com.google.gson.JsonParseException {
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
                    return new com.datadog.android.rum.model.VitalAppLaunchEvent.Os(asString, asString2, asString3, asString4);
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
            if (!(other instanceof com.datadog.android.rum.model.VitalAppLaunchEvent.Os)) {
                return false;
            }
            com.datadog.android.rum.model.VitalAppLaunchEvent.Os os = (com.datadog.android.rum.model.VitalAppLaunchEvent.Os) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.name, os.name) && kotlin.jvm.internal.Intrinsics.areEqual(this.version, os.version) && kotlin.jvm.internal.Intrinsics.areEqual(this.build, os.build) && kotlin.jvm.internal.Intrinsics.areEqual(this.versionMajor, os.versionMajor);
        }

        public final com.datadog.android.rum.model.VitalAppLaunchEvent.Os copy(java.lang.String name2, java.lang.String version, java.lang.String build, java.lang.String versionMajor) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(version, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(versionMajor, "");
            return new com.datadog.android.rum.model.VitalAppLaunchEvent.Os(name2, version, build, versionMajor);
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
        public static final com.datadog.android.rum.model.VitalAppLaunchEvent.Os fromJsonObject(com.google.gson.JsonObject jsonObject) throws com.google.gson.JsonParseException {
            return INSTANCE.fromJsonObject(jsonObject);
        }

        @kotlin.jvm.JvmStatic
        public static final com.datadog.android.rum.model.VitalAppLaunchEvent.Os fromJson(java.lang.String str) throws com.google.gson.JsonParseException {
            return INSTANCE.fromJson(str);
        }

        public static /* synthetic */ com.datadog.android.rum.model.VitalAppLaunchEvent.Os copy$default(com.datadog.android.rum.model.VitalAppLaunchEvent.Os os, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i, java.lang.Object obj) {
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

    @kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u0004\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\b\u0086\b\u0018\u0000 H2\u00020\u0001:\u0001HBµ\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001cJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001cJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001aJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\"\u0010!J\u0012\u0010#\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b#\u0010!J\u0012\u0010$\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b$\u0010!J\u0012\u0010%\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b%\u0010!J\u0018\u0010&\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b&\u0010'J\u0012\u0010(\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b(\u0010!J\u0012\u0010)\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b)\u0010\u001cJ¾\u0001\u0010*\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00042\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u000fHÆ\u0001¢\u0006\u0004\b*\u0010+J\u001a\u0010-\u001a\u00020\u000f2\b\u0010,\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b-\u0010.J\u0010\u00100\u001a\u00020/HÖ\u0001¢\u0006\u0004\b0\u00101J\r\u00103\u001a\u000202¢\u0006\u0004\b3\u00104J\u0010\u00105\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b5\u0010!R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00048\u0007¢\u0006\f\n\u0004\b\b\u00106\u001a\u0004\b7\u0010!R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u00108\u001a\u0004\b9\u0010\u001cR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u00106\u001a\u0004\b:\u0010!R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\r8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u00108\u001a\u0004\b;\u0010\u001cR\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u000f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010<\u001a\u0004\b\u0014\u0010\u001aR\u001c\u0010\t\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u00106\u001a\u0004\b=\u0010!R\"\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010>\u001a\u0004\b?\u0010'R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\r8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u00108\u001a\u0004\b@\u0010\u001cR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u00106\u001a\u0004\bA\u0010!R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u00106\u001a\u0004\bB\u0010!R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010<\u001a\u0004\bC\u0010\u001aR\u001c\u0010\f\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u00106\u001a\u0004\bD\u0010!R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\r8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u00108\u001a\u0004\bE\u0010\u001cR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010F\u001a\u0004\bG\u0010\u0018"}, d2 = {"Lcom/datadog/android/rum/model/VitalAppLaunchEvent$Device;", "", "Lcom/datadog/android/rum/model/VitalAppLaunchEvent$DeviceType;", "type", "", "name", "model", "brand", "architecture", "locale", "", "locales", "timeZone", "", "batteryLevel", "", "powerSavingMode", "brightnessLevel", "logicalCpuCount", "totalRam", "isLowRam", "<init>", "(Lcom/datadog/android/rum/model/VitalAppLaunchEvent$DeviceType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/Number;Ljava/lang/Boolean;Ljava/lang/Number;Ljava/lang/Number;Ljava/lang/Number;Ljava/lang/Boolean;)V", "component1", "()Lcom/datadog/android/rum/model/VitalAppLaunchEvent$DeviceType;", "component10", "()Ljava/lang/Boolean;", "component11", "()Ljava/lang/Number;", "component12", "component13", "component14", "component2", "()Ljava/lang/String;", "component3", "component4", "component5", "component6", "component7", "()Ljava/util/List;", "component8", "component9", "copy", "(Lcom/datadog/android/rum/model/VitalAppLaunchEvent$DeviceType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/Number;Ljava/lang/Boolean;Ljava/lang/Number;Ljava/lang/Number;Ljava/lang/Number;Ljava/lang/Boolean;)Lcom/datadog/android/rum/model/VitalAppLaunchEvent$Device;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lcom/google/gson/JsonElement;", "toJson", "()Lcom/google/gson/JsonElement;", "toString", "Ljava/lang/String;", "getArchitecture", "Ljava/lang/Number;", "getBatteryLevel", "getBrand", "getBrightnessLevel", "Ljava/lang/Boolean;", "getLocale", "Ljava/util/List;", "getLocales", "getLogicalCpuCount", "getModel", "getName", "getPowerSavingMode", "getTimeZone", "getTotalRam", "Lcom/datadog/android/rum/model/VitalAppLaunchEvent$DeviceType;", "getType", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final /* data */ class Device {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.datadog.android.rum.model.VitalAppLaunchEvent.Device.Companion INSTANCE = new com.datadog.android.rum.model.VitalAppLaunchEvent.Device.Companion(null);
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
        private final com.datadog.android.rum.model.VitalAppLaunchEvent.DeviceType type;

        public Device(com.datadog.android.rum.model.VitalAppLaunchEvent.DeviceType deviceType, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.util.List<java.lang.String> list, java.lang.String str6, java.lang.Number number, java.lang.Boolean bool, java.lang.Number number2, java.lang.Number number3, java.lang.Number number4, java.lang.Boolean bool2) {
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

        public /* synthetic */ Device(com.datadog.android.rum.model.VitalAppLaunchEvent.DeviceType deviceType, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.util.List list, java.lang.String str6, java.lang.Number number, java.lang.Boolean bool, java.lang.Number number2, java.lang.Number number3, java.lang.Number number4, java.lang.Boolean bool2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : deviceType, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : str5, (i & 64) != 0 ? null : list, (i & 128) != 0 ? null : str6, (i & 256) != 0 ? null : number, (i & 512) != 0 ? null : bool, (i & 1024) != 0 ? null : number2, (i & 2048) != 0 ? null : number3, (i & 4096) != 0 ? null : number4, (i & 8192) == 0 ? bool2 : null);
        }

        public final com.datadog.android.rum.model.VitalAppLaunchEvent.DeviceType getType() {
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
            com.datadog.android.rum.model.VitalAppLaunchEvent.DeviceType deviceType = this.type;
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

        @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/datadog/android/rum/model/VitalAppLaunchEvent$Device$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/rum/model/VitalAppLaunchEvent$Device;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/rum/model/VitalAppLaunchEvent$Device;", "Lcom/google/gson/JsonObject;", "jsonObject", "fromJsonObject", "(Lcom/google/gson/JsonObject;)Lcom/datadog/android/rum/model/VitalAppLaunchEvent$Device;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @kotlin.jvm.JvmStatic
            public final com.datadog.android.rum.model.VitalAppLaunchEvent.Device fromJson(java.lang.String jsonString) throws com.google.gson.JsonParseException {
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
            public final com.datadog.android.rum.model.VitalAppLaunchEvent.Device fromJsonObject(com.google.gson.JsonObject jsonObject) throws com.google.gson.JsonParseException {
                java.util.ArrayList arrayList;
                com.google.gson.JsonArray asJsonArray;
                java.lang.String asString;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonObject, "");
                try {
                    com.google.gson.JsonElement jsonElement = jsonObject.get("type");
                    com.datadog.android.rum.model.VitalAppLaunchEvent.DeviceType fromJson = (jsonElement == null || (asString = jsonElement.getAsString()) == null) ? null : com.datadog.android.rum.model.VitalAppLaunchEvent.DeviceType.INSTANCE.fromJson(asString);
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
                    return new com.datadog.android.rum.model.VitalAppLaunchEvent.Device(fromJson, asString2, asString3, asString4, asString5, asString6, arrayList, asString7, asNumber, valueOf, asNumber2, asNumber3, asNumber4, jsonElement14 != null ? java.lang.Boolean.valueOf(jsonElement14.getAsBoolean()) : null);
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
            com.datadog.android.rum.model.VitalAppLaunchEvent.DeviceType deviceType = this.type;
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
            com.datadog.android.rum.model.VitalAppLaunchEvent.DeviceType deviceType = this.type;
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
            if (!(other instanceof com.datadog.android.rum.model.VitalAppLaunchEvent.Device)) {
                return false;
            }
            com.datadog.android.rum.model.VitalAppLaunchEvent.Device device = (com.datadog.android.rum.model.VitalAppLaunchEvent.Device) other;
            return this.type == device.type && kotlin.jvm.internal.Intrinsics.areEqual(this.name, device.name) && kotlin.jvm.internal.Intrinsics.areEqual(this.model, device.model) && kotlin.jvm.internal.Intrinsics.areEqual(this.brand, device.brand) && kotlin.jvm.internal.Intrinsics.areEqual(this.architecture, device.architecture) && kotlin.jvm.internal.Intrinsics.areEqual(this.locale, device.locale) && kotlin.jvm.internal.Intrinsics.areEqual(this.locales, device.locales) && kotlin.jvm.internal.Intrinsics.areEqual(this.timeZone, device.timeZone) && kotlin.jvm.internal.Intrinsics.areEqual(this.batteryLevel, device.batteryLevel) && kotlin.jvm.internal.Intrinsics.areEqual(this.powerSavingMode, device.powerSavingMode) && kotlin.jvm.internal.Intrinsics.areEqual(this.brightnessLevel, device.brightnessLevel) && kotlin.jvm.internal.Intrinsics.areEqual(this.logicalCpuCount, device.logicalCpuCount) && kotlin.jvm.internal.Intrinsics.areEqual(this.totalRam, device.totalRam) && kotlin.jvm.internal.Intrinsics.areEqual(this.isLowRam, device.isLowRam);
        }

        public final com.datadog.android.rum.model.VitalAppLaunchEvent.Device copy(com.datadog.android.rum.model.VitalAppLaunchEvent.DeviceType type, java.lang.String name2, java.lang.String model, java.lang.String brand, java.lang.String architecture, java.lang.String locale, java.util.List<java.lang.String> locales, java.lang.String timeZone, java.lang.Number batteryLevel, java.lang.Boolean powerSavingMode, java.lang.Number brightnessLevel, java.lang.Number logicalCpuCount, java.lang.Number totalRam, java.lang.Boolean isLowRam) {
            return new com.datadog.android.rum.model.VitalAppLaunchEvent.Device(type, name2, model, brand, architecture, locale, locales, timeZone, batteryLevel, powerSavingMode, brightnessLevel, logicalCpuCount, totalRam, isLowRam);
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
        public final com.datadog.android.rum.model.VitalAppLaunchEvent.DeviceType getType() {
            return this.type;
        }

        @kotlin.jvm.JvmStatic
        public static final com.datadog.android.rum.model.VitalAppLaunchEvent.Device fromJsonObject(com.google.gson.JsonObject jsonObject) throws com.google.gson.JsonParseException {
            return INSTANCE.fromJsonObject(jsonObject);
        }

        @kotlin.jvm.JvmStatic
        public static final com.datadog.android.rum.model.VitalAppLaunchEvent.Device fromJson(java.lang.String str) throws com.google.gson.JsonParseException {
            return INSTANCE.fromJson(str);
        }

        public Device() {
            this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, my.com.softspace.reader.TransactionCodes.SupportedScheme.ALL, null);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\n\b\u0086\b\u0018\u0000 12\u00020\u0001:\u00011BC\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0012J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015JL\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\r\u0010 \u001a\u00020\u001f¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\"\u0010\u0012R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0007¢\u0006\f\n\u0004\b\u0007\u0010#\u001a\u0004\b$\u0010\u0012R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010%\u001a\u0004\b&\u0010\u0010R\u001a\u0010(\u001a\u00020'8\u0007X\u0087D¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010,\u001a\u0004\b-\u0010\u0015R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010#\u001a\u0004\b.\u0010\u0012R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010/\u001a\u0004\b0\u0010\u000e"}, d2 = {"Lcom/datadog/android/rum/model/VitalAppLaunchEvent$Dd;", "", "Lcom/datadog/android/rum/model/VitalAppLaunchEvent$DdSession;", "session", "Lcom/datadog/android/rum/model/VitalAppLaunchEvent$Configuration;", com.miteksystems.misnap.core.serverconnection.MobileVerifyV2Request.CONFIG_KEY, "", "browserSdkVersion", "sdkName", "Lcom/datadog/android/rum/model/VitalAppLaunchEvent$Profiling;", "profiling", "<init>", "(Lcom/datadog/android/rum/model/VitalAppLaunchEvent$DdSession;Lcom/datadog/android/rum/model/VitalAppLaunchEvent$Configuration;Ljava/lang/String;Ljava/lang/String;Lcom/datadog/android/rum/model/VitalAppLaunchEvent$Profiling;)V", "component1", "()Lcom/datadog/android/rum/model/VitalAppLaunchEvent$DdSession;", "component2", "()Lcom/datadog/android/rum/model/VitalAppLaunchEvent$Configuration;", "component3", "()Ljava/lang/String;", "component4", "component5", "()Lcom/datadog/android/rum/model/VitalAppLaunchEvent$Profiling;", "copy", "(Lcom/datadog/android/rum/model/VitalAppLaunchEvent$DdSession;Lcom/datadog/android/rum/model/VitalAppLaunchEvent$Configuration;Ljava/lang/String;Ljava/lang/String;Lcom/datadog/android/rum/model/VitalAppLaunchEvent$Profiling;)Lcom/datadog/android/rum/model/VitalAppLaunchEvent$Dd;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lcom/google/gson/JsonElement;", "toJson", "()Lcom/google/gson/JsonElement;", "toString", "Ljava/lang/String;", "getBrowserSdkVersion", "Lcom/datadog/android/rum/model/VitalAppLaunchEvent$Configuration;", "getConfiguration", "", "formatVersion", "J", "getFormatVersion", "()J", "Lcom/datadog/android/rum/model/VitalAppLaunchEvent$Profiling;", "getProfiling", "getSdkName", "Lcom/datadog/android/rum/model/VitalAppLaunchEvent$DdSession;", "getSession", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final /* data */ class Dd {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.datadog.android.rum.model.VitalAppLaunchEvent.Dd.Companion INSTANCE = new com.datadog.android.rum.model.VitalAppLaunchEvent.Dd.Companion(null);
        private final java.lang.String browserSdkVersion;
        private final com.datadog.android.rum.model.VitalAppLaunchEvent.Configuration configuration;
        private final long formatVersion;
        private final com.datadog.android.rum.model.VitalAppLaunchEvent.Profiling profiling;
        private final java.lang.String sdkName;
        private final com.datadog.android.rum.model.VitalAppLaunchEvent.DdSession session;

        public Dd(com.datadog.android.rum.model.VitalAppLaunchEvent.DdSession ddSession, com.datadog.android.rum.model.VitalAppLaunchEvent.Configuration configuration, java.lang.String str, java.lang.String str2, com.datadog.android.rum.model.VitalAppLaunchEvent.Profiling profiling) {
            this.session = ddSession;
            this.configuration = configuration;
            this.browserSdkVersion = str;
            this.sdkName = str2;
            this.profiling = profiling;
            this.formatVersion = 2L;
        }

        public /* synthetic */ Dd(com.datadog.android.rum.model.VitalAppLaunchEvent.DdSession ddSession, com.datadog.android.rum.model.VitalAppLaunchEvent.Configuration configuration, java.lang.String str, java.lang.String str2, com.datadog.android.rum.model.VitalAppLaunchEvent.Profiling profiling, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : ddSession, (i & 2) != 0 ? null : configuration, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : profiling);
        }

        public final com.datadog.android.rum.model.VitalAppLaunchEvent.DdSession getSession() {
            return this.session;
        }

        public final com.datadog.android.rum.model.VitalAppLaunchEvent.Configuration getConfiguration() {
            return this.configuration;
        }

        public final java.lang.String getBrowserSdkVersion() {
            return this.browserSdkVersion;
        }

        public final java.lang.String getSdkName() {
            return this.sdkName;
        }

        public final com.datadog.android.rum.model.VitalAppLaunchEvent.Profiling getProfiling() {
            return this.profiling;
        }

        public final long getFormatVersion() {
            return this.formatVersion;
        }

        public final com.google.gson.JsonElement toJson() {
            com.google.gson.JsonObject jsonObject = new com.google.gson.JsonObject();
            jsonObject.addProperty("format_version", java.lang.Long.valueOf(this.formatVersion));
            com.datadog.android.rum.model.VitalAppLaunchEvent.DdSession ddSession = this.session;
            if (ddSession != null) {
                jsonObject.add("session", ddSession.toJson());
            }
            com.datadog.android.rum.model.VitalAppLaunchEvent.Configuration configuration = this.configuration;
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
            com.datadog.android.rum.model.VitalAppLaunchEvent.Profiling profiling = this.profiling;
            if (profiling != null) {
                jsonObject.add("profiling", profiling.toJson());
            }
            return jsonObject;
        }

        @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/datadog/android/rum/model/VitalAppLaunchEvent$Dd$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/rum/model/VitalAppLaunchEvent$Dd;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/rum/model/VitalAppLaunchEvent$Dd;", "Lcom/google/gson/JsonObject;", "jsonObject", "fromJsonObject", "(Lcom/google/gson/JsonObject;)Lcom/datadog/android/rum/model/VitalAppLaunchEvent$Dd;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @kotlin.jvm.JvmStatic
            public final com.datadog.android.rum.model.VitalAppLaunchEvent.Dd fromJson(java.lang.String jsonString) throws com.google.gson.JsonParseException {
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
            public final com.datadog.android.rum.model.VitalAppLaunchEvent.Dd fromJsonObject(com.google.gson.JsonObject jsonObject) throws com.google.gson.JsonParseException {
                com.google.gson.JsonObject asJsonObject;
                com.google.gson.JsonObject asJsonObject2;
                com.google.gson.JsonObject asJsonObject3;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonObject, "");
                try {
                    long asLong = jsonObject.get("format_version").getAsLong();
                    com.google.gson.JsonElement jsonElement = jsonObject.get("session");
                    com.datadog.android.rum.model.VitalAppLaunchEvent.Profiling profiling = null;
                    com.datadog.android.rum.model.VitalAppLaunchEvent.DdSession fromJsonObject = (jsonElement == null || (asJsonObject3 = jsonElement.getAsJsonObject()) == null) ? null : com.datadog.android.rum.model.VitalAppLaunchEvent.DdSession.INSTANCE.fromJsonObject(asJsonObject3);
                    com.google.gson.JsonElement jsonElement2 = jsonObject.get(com.miteksystems.misnap.core.serverconnection.MobileVerifyV2Request.CONFIG_KEY);
                    com.datadog.android.rum.model.VitalAppLaunchEvent.Configuration fromJsonObject2 = (jsonElement2 == null || (asJsonObject2 = jsonElement2.getAsJsonObject()) == null) ? null : com.datadog.android.rum.model.VitalAppLaunchEvent.Configuration.INSTANCE.fromJsonObject(asJsonObject2);
                    com.google.gson.JsonElement jsonElement3 = jsonObject.get("browser_sdk_version");
                    java.lang.String asString = jsonElement3 != null ? jsonElement3.getAsString() : null;
                    com.google.gson.JsonElement jsonElement4 = jsonObject.get(com.paypal.oslo.feature.verificationcapture.telemetry.VerificationCaptureTelemetry.Attributes.SDK_NAME);
                    java.lang.String asString2 = jsonElement4 != null ? jsonElement4.getAsString() : null;
                    com.google.gson.JsonElement jsonElement5 = jsonObject.get("profiling");
                    if (jsonElement5 != null && (asJsonObject = jsonElement5.getAsJsonObject()) != null) {
                        profiling = com.datadog.android.rum.model.VitalAppLaunchEvent.Profiling.INSTANCE.fromJsonObject(asJsonObject);
                    }
                    com.datadog.android.rum.model.VitalAppLaunchEvent.Profiling profiling2 = profiling;
                    if (asLong != 2) {
                        throw new java.lang.IllegalStateException("Check failed.".toString());
                    }
                    return new com.datadog.android.rum.model.VitalAppLaunchEvent.Dd(fromJsonObject, fromJsonObject2, asString, asString2, profiling2);
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
            com.datadog.android.rum.model.VitalAppLaunchEvent.DdSession ddSession = this.session;
            com.datadog.android.rum.model.VitalAppLaunchEvent.Configuration configuration = this.configuration;
            java.lang.String str = this.browserSdkVersion;
            java.lang.String str2 = this.sdkName;
            com.datadog.android.rum.model.VitalAppLaunchEvent.Profiling profiling = this.profiling;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Dd(session=");
            sb.append(ddSession);
            sb.append(", configuration=");
            sb.append(configuration);
            sb.append(", browserSdkVersion=");
            sb.append(str);
            sb.append(", sdkName=");
            sb.append(str2);
            sb.append(", profiling=");
            sb.append(profiling);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            com.datadog.android.rum.model.VitalAppLaunchEvent.DdSession ddSession = this.session;
            int hashCode = ddSession == null ? 0 : ddSession.hashCode();
            com.datadog.android.rum.model.VitalAppLaunchEvent.Configuration configuration = this.configuration;
            int hashCode2 = configuration == null ? 0 : configuration.hashCode();
            java.lang.String str = this.browserSdkVersion;
            int hashCode3 = str == null ? 0 : str.hashCode();
            java.lang.String str2 = this.sdkName;
            int hashCode4 = str2 == null ? 0 : str2.hashCode();
            com.datadog.android.rum.model.VitalAppLaunchEvent.Profiling profiling = this.profiling;
            return (((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + (profiling != null ? profiling.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.datadog.android.rum.model.VitalAppLaunchEvent.Dd)) {
                return false;
            }
            com.datadog.android.rum.model.VitalAppLaunchEvent.Dd dd = (com.datadog.android.rum.model.VitalAppLaunchEvent.Dd) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.session, dd.session) && kotlin.jvm.internal.Intrinsics.areEqual(this.configuration, dd.configuration) && kotlin.jvm.internal.Intrinsics.areEqual(this.browserSdkVersion, dd.browserSdkVersion) && kotlin.jvm.internal.Intrinsics.areEqual(this.sdkName, dd.sdkName) && kotlin.jvm.internal.Intrinsics.areEqual(this.profiling, dd.profiling);
        }

        public final com.datadog.android.rum.model.VitalAppLaunchEvent.Dd copy(com.datadog.android.rum.model.VitalAppLaunchEvent.DdSession session, com.datadog.android.rum.model.VitalAppLaunchEvent.Configuration configuration, java.lang.String browserSdkVersion, java.lang.String sdkName, com.datadog.android.rum.model.VitalAppLaunchEvent.Profiling profiling) {
            return new com.datadog.android.rum.model.VitalAppLaunchEvent.Dd(session, configuration, browserSdkVersion, sdkName, profiling);
        }

        /* renamed from: component5, reason: from getter */
        public final com.datadog.android.rum.model.VitalAppLaunchEvent.Profiling getProfiling() {
            return this.profiling;
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
        public final com.datadog.android.rum.model.VitalAppLaunchEvent.Configuration getConfiguration() {
            return this.configuration;
        }

        /* renamed from: component1, reason: from getter */
        public final com.datadog.android.rum.model.VitalAppLaunchEvent.DdSession getSession() {
            return this.session;
        }

        @kotlin.jvm.JvmStatic
        public static final com.datadog.android.rum.model.VitalAppLaunchEvent.Dd fromJsonObject(com.google.gson.JsonObject jsonObject) throws com.google.gson.JsonParseException {
            return INSTANCE.fromJsonObject(jsonObject);
        }

        @kotlin.jvm.JvmStatic
        public static final com.datadog.android.rum.model.VitalAppLaunchEvent.Dd fromJson(java.lang.String str) throws com.google.gson.JsonParseException {
            return INSTANCE.fromJson(str);
        }

        public static /* synthetic */ com.datadog.android.rum.model.VitalAppLaunchEvent.Dd copy$default(com.datadog.android.rum.model.VitalAppLaunchEvent.Dd dd, com.datadog.android.rum.model.VitalAppLaunchEvent.DdSession ddSession, com.datadog.android.rum.model.VitalAppLaunchEvent.Configuration configuration, java.lang.String str, java.lang.String str2, com.datadog.android.rum.model.VitalAppLaunchEvent.Profiling profiling, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                ddSession = dd.session;
            }
            if ((i & 2) != 0) {
                configuration = dd.configuration;
            }
            com.datadog.android.rum.model.VitalAppLaunchEvent.Configuration configuration2 = configuration;
            if ((i & 4) != 0) {
                str = dd.browserSdkVersion;
            }
            java.lang.String str3 = str;
            if ((i & 8) != 0) {
                str2 = dd.sdkName;
            }
            java.lang.String str4 = str2;
            if ((i & 16) != 0) {
                profiling = dd.profiling;
            }
            return dd.copy(ddSession, configuration2, str3, str4, profiling);
        }

        public Dd() {
            this(null, null, null, null, null, 31, null);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\b\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u001f\u0012\u0016\b\u0002\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001e\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ(\u0010\t\u001a\u00020\u00002\u0016\b\u0002\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0002HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016R%\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0018\u0010\b"}, d2 = {"Lcom/datadog/android/rum/model/VitalAppLaunchEvent$Context;", "", "", "", "additionalProperties", "<init>", "(Ljava/util/Map;)V", "component1", "()Ljava/util/Map;", "copy", "(Ljava/util/Map;)Lcom/datadog/android/rum/model/VitalAppLaunchEvent$Context;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lcom/google/gson/JsonElement;", "toJson", "()Lcom/google/gson/JsonElement;", "toString", "()Ljava/lang/String;", "Ljava/util/Map;", "getAdditionalProperties", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final /* data */ class Context {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.datadog.android.rum.model.VitalAppLaunchEvent.Context.Companion INSTANCE = new com.datadog.android.rum.model.VitalAppLaunchEvent.Context.Companion(null);
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

        @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/datadog/android/rum/model/VitalAppLaunchEvent$Context$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/rum/model/VitalAppLaunchEvent$Context;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/rum/model/VitalAppLaunchEvent$Context;", "Lcom/google/gson/JsonObject;", "jsonObject", "fromJsonObject", "(Lcom/google/gson/JsonObject;)Lcom/datadog/android/rum/model/VitalAppLaunchEvent$Context;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @kotlin.jvm.JvmStatic
            public final com.datadog.android.rum.model.VitalAppLaunchEvent.Context fromJson(java.lang.String jsonString) throws com.google.gson.JsonParseException {
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
            public final com.datadog.android.rum.model.VitalAppLaunchEvent.Context fromJsonObject(com.google.gson.JsonObject jsonObject) throws com.google.gson.JsonParseException {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonObject, "");
                try {
                    java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
                    for (java.util.Map.Entry<java.lang.String, com.google.gson.JsonElement> entry : jsonObject.entrySet()) {
                        java.lang.String key = entry.getKey();
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(key, "");
                        linkedHashMap.put(key, entry.getValue());
                    }
                    return new com.datadog.android.rum.model.VitalAppLaunchEvent.Context(linkedHashMap);
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
            return (other instanceof com.datadog.android.rum.model.VitalAppLaunchEvent.Context) && kotlin.jvm.internal.Intrinsics.areEqual(this.additionalProperties, ((com.datadog.android.rum.model.VitalAppLaunchEvent.Context) other).additionalProperties);
        }

        public final com.datadog.android.rum.model.VitalAppLaunchEvent.Context copy(java.util.Map<java.lang.String, java.lang.Object> additionalProperties) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(additionalProperties, "");
            return new com.datadog.android.rum.model.VitalAppLaunchEvent.Context(additionalProperties);
        }

        public final java.util.Map<java.lang.String, java.lang.Object> component1() {
            return this.additionalProperties;
        }

        @kotlin.jvm.JvmStatic
        public static final com.datadog.android.rum.model.VitalAppLaunchEvent.Context fromJsonObject(com.google.gson.JsonObject jsonObject) throws com.google.gson.JsonParseException {
            return INSTANCE.fromJsonObject(jsonObject);
        }

        @kotlin.jvm.JvmStatic
        public static final com.datadog.android.rum.model.VitalAppLaunchEvent.Context fromJson(java.lang.String str) throws com.google.gson.JsonParseException {
            return INSTANCE.fromJson(str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.datadog.android.rum.model.VitalAppLaunchEvent.Context copy$default(com.datadog.android.rum.model.VitalAppLaunchEvent.Context context, java.util.Map map, int i, java.lang.Object obj) {
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

    @kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\b\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\u000bR\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\t"}, d2 = {"Lcom/datadog/android/rum/model/VitalAppLaunchEvent$Container;", "", "Lcom/datadog/android/rum/model/VitalAppLaunchEvent$ContainerView;", "view", "Lcom/datadog/android/rum/model/VitalAppLaunchEvent$VitalAppLaunchEventSource;", "source", "<init>", "(Lcom/datadog/android/rum/model/VitalAppLaunchEvent$ContainerView;Lcom/datadog/android/rum/model/VitalAppLaunchEvent$VitalAppLaunchEventSource;)V", "component1", "()Lcom/datadog/android/rum/model/VitalAppLaunchEvent$ContainerView;", "component2", "()Lcom/datadog/android/rum/model/VitalAppLaunchEvent$VitalAppLaunchEventSource;", "copy", "(Lcom/datadog/android/rum/model/VitalAppLaunchEvent$ContainerView;Lcom/datadog/android/rum/model/VitalAppLaunchEvent$VitalAppLaunchEventSource;)Lcom/datadog/android/rum/model/VitalAppLaunchEvent$Container;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lcom/google/gson/JsonElement;", "toJson", "()Lcom/google/gson/JsonElement;", "", "toString", "()Ljava/lang/String;", "Lcom/datadog/android/rum/model/VitalAppLaunchEvent$VitalAppLaunchEventSource;", "getSource", "Lcom/datadog/android/rum/model/VitalAppLaunchEvent$ContainerView;", "getView", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final /* data */ class Container {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.datadog.android.rum.model.VitalAppLaunchEvent.Container.Companion INSTANCE = new com.datadog.android.rum.model.VitalAppLaunchEvent.Container.Companion(null);
        private final com.datadog.android.rum.model.VitalAppLaunchEvent.VitalAppLaunchEventSource source;
        private final com.datadog.android.rum.model.VitalAppLaunchEvent.ContainerView view;

        public Container(com.datadog.android.rum.model.VitalAppLaunchEvent.ContainerView containerView, com.datadog.android.rum.model.VitalAppLaunchEvent.VitalAppLaunchEventSource vitalAppLaunchEventSource) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(containerView, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(vitalAppLaunchEventSource, "");
            this.view = containerView;
            this.source = vitalAppLaunchEventSource;
        }

        public final com.datadog.android.rum.model.VitalAppLaunchEvent.ContainerView getView() {
            return this.view;
        }

        public final com.datadog.android.rum.model.VitalAppLaunchEvent.VitalAppLaunchEventSource getSource() {
            return this.source;
        }

        public final com.google.gson.JsonElement toJson() {
            com.google.gson.JsonObject jsonObject = new com.google.gson.JsonObject();
            jsonObject.add("view", this.view.toJson());
            jsonObject.add("source", this.source.toJson());
            return jsonObject;
        }

        @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/datadog/android/rum/model/VitalAppLaunchEvent$Container$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/rum/model/VitalAppLaunchEvent$Container;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/rum/model/VitalAppLaunchEvent$Container;", "Lcom/google/gson/JsonObject;", "jsonObject", "fromJsonObject", "(Lcom/google/gson/JsonObject;)Lcom/datadog/android/rum/model/VitalAppLaunchEvent$Container;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @kotlin.jvm.JvmStatic
            public final com.datadog.android.rum.model.VitalAppLaunchEvent.Container fromJson(java.lang.String jsonString) throws com.google.gson.JsonParseException {
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
            public final com.datadog.android.rum.model.VitalAppLaunchEvent.Container fromJsonObject(com.google.gson.JsonObject jsonObject) throws com.google.gson.JsonParseException {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonObject, "");
                try {
                    com.google.gson.JsonObject asJsonObject = jsonObject.get("view").getAsJsonObject();
                    com.datadog.android.rum.model.VitalAppLaunchEvent.ContainerView.Companion companion = com.datadog.android.rum.model.VitalAppLaunchEvent.ContainerView.INSTANCE;
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asJsonObject, "");
                    com.datadog.android.rum.model.VitalAppLaunchEvent.ContainerView fromJsonObject = companion.fromJsonObject(asJsonObject);
                    com.datadog.android.rum.model.VitalAppLaunchEvent.VitalAppLaunchEventSource.Companion companion2 = com.datadog.android.rum.model.VitalAppLaunchEvent.VitalAppLaunchEventSource.INSTANCE;
                    java.lang.String asString = jsonObject.get("source").getAsString();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asString, "");
                    return new com.datadog.android.rum.model.VitalAppLaunchEvent.Container(fromJsonObject, companion2.fromJson(asString));
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
            com.datadog.android.rum.model.VitalAppLaunchEvent.ContainerView containerView = this.view;
            com.datadog.android.rum.model.VitalAppLaunchEvent.VitalAppLaunchEventSource vitalAppLaunchEventSource = this.source;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Container(view=");
            sb.append(containerView);
            sb.append(", source=");
            sb.append(vitalAppLaunchEventSource);
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
            if (!(other instanceof com.datadog.android.rum.model.VitalAppLaunchEvent.Container)) {
                return false;
            }
            com.datadog.android.rum.model.VitalAppLaunchEvent.Container container = (com.datadog.android.rum.model.VitalAppLaunchEvent.Container) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.view, container.view) && this.source == container.source;
        }

        public final com.datadog.android.rum.model.VitalAppLaunchEvent.Container copy(com.datadog.android.rum.model.VitalAppLaunchEvent.ContainerView view, com.datadog.android.rum.model.VitalAppLaunchEvent.VitalAppLaunchEventSource source) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "");
            return new com.datadog.android.rum.model.VitalAppLaunchEvent.Container(view, source);
        }

        /* renamed from: component2, reason: from getter */
        public final com.datadog.android.rum.model.VitalAppLaunchEvent.VitalAppLaunchEventSource getSource() {
            return this.source;
        }

        /* renamed from: component1, reason: from getter */
        public final com.datadog.android.rum.model.VitalAppLaunchEvent.ContainerView getView() {
            return this.view;
        }

        @kotlin.jvm.JvmStatic
        public static final com.datadog.android.rum.model.VitalAppLaunchEvent.Container fromJsonObject(com.google.gson.JsonObject jsonObject) throws com.google.gson.JsonParseException {
            return INSTANCE.fromJsonObject(jsonObject);
        }

        @kotlin.jvm.JvmStatic
        public static final com.datadog.android.rum.model.VitalAppLaunchEvent.Container fromJson(java.lang.String str) throws com.google.gson.JsonParseException {
            return INSTANCE.fromJson(str);
        }

        public static /* synthetic */ com.datadog.android.rum.model.VitalAppLaunchEvent.Container copy$default(com.datadog.android.rum.model.VitalAppLaunchEvent.Container container, com.datadog.android.rum.model.VitalAppLaunchEvent.ContainerView containerView, com.datadog.android.rum.model.VitalAppLaunchEvent.VitalAppLaunchEventSource vitalAppLaunchEventSource, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                containerView = container.view;
            }
            if ((i & 2) != 0) {
                vitalAppLaunchEventSource = container.source;
            }
            return container.copy(containerView, vitalAppLaunchEventSource);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0004\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0016\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0086\b\u0018\u0000 82\u00020\u0001:\u00018B[\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0012J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0012J\u0010\u0010\u0015\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001cJj\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\fHÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010!\u001a\u00020\f2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010$\u001a\u00020#HÖ\u0001¢\u0006\u0004\b$\u0010%J\r\u0010'\u001a\u00020&¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b)\u0010\u0012R\u0017\u0010\u0007\u001a\u00020\u00068\u0007¢\u0006\f\n\u0004\b\u0007\u0010*\u001a\u0004\b+\u0010\u0016R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010,\u001a\u0004\b-\u0010\u0012R\u001a\u0010\t\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010.\u001a\u0004\b/\u0010\u0018R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u00100\u001a\u0004\b1\u0010\u001cR\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010,\u001a\u0004\b2\u0010\u0012R\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u00100\u001a\u0004\b\r\u0010\u001cR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010,\u001a\u0004\b3\u0010\u0012R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u00104\u001a\u0004\b5\u0010\u001aR\u001a\u00106\u001a\u00020\u00028\u0007X\u0087D¢\u0006\f\n\u0004\b6\u0010,\u001a\u0004\b7\u0010\u0012"}, d2 = {"Lcom/datadog/android/rum/model/VitalAppLaunchEvent$Vital;", "", "", "id", "name", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.DESCRIPTION, "Lcom/datadog/android/rum/model/VitalAppLaunchEvent$AppLaunchMetric;", "appLaunchMetric", "", "duration", "Lcom/datadog/android/rum/model/VitalAppLaunchEvent$StartupType;", "startupType", "", "isPrewarmed", "hasSavedInstanceStateBundle", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/datadog/android/rum/model/VitalAppLaunchEvent$AppLaunchMetric;Ljava/lang/Number;Lcom/datadog/android/rum/model/VitalAppLaunchEvent$StartupType;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Lcom/datadog/android/rum/model/VitalAppLaunchEvent$AppLaunchMetric;", "component5", "()Ljava/lang/Number;", "component6", "()Lcom/datadog/android/rum/model/VitalAppLaunchEvent$StartupType;", "component7", "()Ljava/lang/Boolean;", "component8", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/datadog/android/rum/model/VitalAppLaunchEvent$AppLaunchMetric;Ljava/lang/Number;Lcom/datadog/android/rum/model/VitalAppLaunchEvent$StartupType;Ljava/lang/Boolean;Ljava/lang/Boolean;)Lcom/datadog/android/rum/model/VitalAppLaunchEvent$Vital;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lcom/google/gson/JsonElement;", "toJson", "()Lcom/google/gson/JsonElement;", "toString", "Lcom/datadog/android/rum/model/VitalAppLaunchEvent$AppLaunchMetric;", "getAppLaunchMetric", "Ljava/lang/String;", "getDescription", "Ljava/lang/Number;", "getDuration", "Ljava/lang/Boolean;", "getHasSavedInstanceStateBundle", "getId", "getName", "Lcom/datadog/android/rum/model/VitalAppLaunchEvent$StartupType;", "getStartupType", "type", "getType", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final /* data */ class Vital {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.datadog.android.rum.model.VitalAppLaunchEvent.Vital.Companion INSTANCE = new com.datadog.android.rum.model.VitalAppLaunchEvent.Vital.Companion(null);
        private final com.datadog.android.rum.model.VitalAppLaunchEvent.AppLaunchMetric appLaunchMetric;
        private final java.lang.String description;
        private final java.lang.Number duration;
        private final java.lang.Boolean hasSavedInstanceStateBundle;
        private final java.lang.String id;
        private final java.lang.Boolean isPrewarmed;
        private final java.lang.String name;
        private final com.datadog.android.rum.model.VitalAppLaunchEvent.StartupType startupType;
        private final java.lang.String type;

        public Vital(java.lang.String str, java.lang.String str2, java.lang.String str3, com.datadog.android.rum.model.VitalAppLaunchEvent.AppLaunchMetric appLaunchMetric, java.lang.Number number, com.datadog.android.rum.model.VitalAppLaunchEvent.StartupType startupType, java.lang.Boolean bool, java.lang.Boolean bool2) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appLaunchMetric, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(number, "");
            this.id = str;
            this.name = str2;
            this.description = str3;
            this.appLaunchMetric = appLaunchMetric;
            this.duration = number;
            this.startupType = startupType;
            this.isPrewarmed = bool;
            this.hasSavedInstanceStateBundle = bool2;
            this.type = com.datadog.android.rum.internal.metric.SessionEndedMetric.VIEW_COUNTS_APP_LAUNCH_KEY;
        }

        public /* synthetic */ Vital(java.lang.String str, java.lang.String str2, java.lang.String str3, com.datadog.android.rum.model.VitalAppLaunchEvent.AppLaunchMetric appLaunchMetric, java.lang.Number number, com.datadog.android.rum.model.VitalAppLaunchEvent.StartupType startupType, java.lang.Boolean bool, java.lang.Boolean bool2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, appLaunchMetric, number, (i & 32) != 0 ? null : startupType, (i & 64) != 0 ? null : bool, (i & 128) != 0 ? null : bool2);
        }

        public final java.lang.String getId() {
            return this.id;
        }

        public final java.lang.String getName() {
            return this.name;
        }

        public final java.lang.String getDescription() {
            return this.description;
        }

        public final com.datadog.android.rum.model.VitalAppLaunchEvent.AppLaunchMetric getAppLaunchMetric() {
            return this.appLaunchMetric;
        }

        public final java.lang.Number getDuration() {
            return this.duration;
        }

        public final com.datadog.android.rum.model.VitalAppLaunchEvent.StartupType getStartupType() {
            return this.startupType;
        }

        public final java.lang.Boolean isPrewarmed() {
            return this.isPrewarmed;
        }

        public final java.lang.Boolean getHasSavedInstanceStateBundle() {
            return this.hasSavedInstanceStateBundle;
        }

        public final java.lang.String getType() {
            return this.type;
        }

        public final com.google.gson.JsonElement toJson() {
            com.google.gson.JsonObject jsonObject = new com.google.gson.JsonObject();
            jsonObject.addProperty("id", this.id);
            java.lang.String str = this.name;
            if (str != null) {
                jsonObject.addProperty("name", str);
            }
            java.lang.String str2 = this.description;
            if (str2 != null) {
                jsonObject.addProperty(com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.DESCRIPTION, str2);
            }
            jsonObject.addProperty("type", this.type);
            jsonObject.add("app_launch_metric", this.appLaunchMetric.toJson());
            jsonObject.addProperty("duration", this.duration);
            com.datadog.android.rum.model.VitalAppLaunchEvent.StartupType startupType = this.startupType;
            if (startupType != null) {
                jsonObject.add("startup_type", startupType.toJson());
            }
            java.lang.Boolean bool = this.isPrewarmed;
            if (bool != null) {
                jsonObject.addProperty("is_prewarmed", java.lang.Boolean.valueOf(bool.booleanValue()));
            }
            java.lang.Boolean bool2 = this.hasSavedInstanceStateBundle;
            if (bool2 != null) {
                jsonObject.addProperty("has_saved_instance_state_bundle", java.lang.Boolean.valueOf(bool2.booleanValue()));
            }
            return jsonObject;
        }

        @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/datadog/android/rum/model/VitalAppLaunchEvent$Vital$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/rum/model/VitalAppLaunchEvent$Vital;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/rum/model/VitalAppLaunchEvent$Vital;", "Lcom/google/gson/JsonObject;", "jsonObject", "fromJsonObject", "(Lcom/google/gson/JsonObject;)Lcom/datadog/android/rum/model/VitalAppLaunchEvent$Vital;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @kotlin.jvm.JvmStatic
            public final com.datadog.android.rum.model.VitalAppLaunchEvent.Vital fromJson(java.lang.String jsonString) throws com.google.gson.JsonParseException {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonString, "");
                try {
                    com.google.gson.JsonObject asJsonObject = com.google.gson.JsonParser.parseString(jsonString).getAsJsonObject();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asJsonObject, "");
                    return fromJsonObject(asJsonObject);
                } catch (java.lang.IllegalStateException e) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type Vital", e);
                }
            }

            @kotlin.jvm.JvmStatic
            public final com.datadog.android.rum.model.VitalAppLaunchEvent.Vital fromJsonObject(com.google.gson.JsonObject jsonObject) throws com.google.gson.JsonParseException {
                java.lang.String asString;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonObject, "");
                try {
                    java.lang.String asString2 = jsonObject.get("id").getAsString();
                    com.google.gson.JsonElement jsonElement = jsonObject.get("name");
                    java.lang.String asString3 = jsonElement != null ? jsonElement.getAsString() : null;
                    com.google.gson.JsonElement jsonElement2 = jsonObject.get(com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.DESCRIPTION);
                    java.lang.String asString4 = jsonElement2 != null ? jsonElement2.getAsString() : null;
                    java.lang.String asString5 = jsonObject.get("type").getAsString();
                    com.datadog.android.rum.model.VitalAppLaunchEvent.AppLaunchMetric.Companion companion = com.datadog.android.rum.model.VitalAppLaunchEvent.AppLaunchMetric.INSTANCE;
                    java.lang.String asString6 = jsonObject.get("app_launch_metric").getAsString();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asString6, "");
                    com.datadog.android.rum.model.VitalAppLaunchEvent.AppLaunchMetric fromJson = companion.fromJson(asString6);
                    java.lang.Number asNumber = jsonObject.get("duration").getAsNumber();
                    com.google.gson.JsonElement jsonElement3 = jsonObject.get("startup_type");
                    com.datadog.android.rum.model.VitalAppLaunchEvent.StartupType fromJson2 = (jsonElement3 == null || (asString = jsonElement3.getAsString()) == null) ? null : com.datadog.android.rum.model.VitalAppLaunchEvent.StartupType.INSTANCE.fromJson(asString);
                    com.google.gson.JsonElement jsonElement4 = jsonObject.get("is_prewarmed");
                    java.lang.Boolean valueOf = jsonElement4 != null ? java.lang.Boolean.valueOf(jsonElement4.getAsBoolean()) : null;
                    com.google.gson.JsonElement jsonElement5 = jsonObject.get("has_saved_instance_state_bundle");
                    java.lang.Boolean valueOf2 = jsonElement5 != null ? java.lang.Boolean.valueOf(jsonElement5.getAsBoolean()) : null;
                    if (!kotlin.jvm.internal.Intrinsics.areEqual(asString5, com.datadog.android.rum.internal.metric.SessionEndedMetric.VIEW_COUNTS_APP_LAUNCH_KEY)) {
                        throw new java.lang.IllegalStateException("Check failed.".toString());
                    }
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asString2, "");
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asNumber, "");
                    return new com.datadog.android.rum.model.VitalAppLaunchEvent.Vital(asString2, asString3, asString4, fromJson, asNumber, fromJson2, valueOf, valueOf2);
                } catch (java.lang.IllegalStateException e) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type Vital", e);
                } catch (java.lang.NullPointerException e2) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type Vital", e2);
                } catch (java.lang.NumberFormatException e3) {
                    throw new com.google.gson.JsonParseException("Unable to parse json into type Vital", e3);
                }
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public final java.lang.String toString() {
            java.lang.String str = this.id;
            java.lang.String str2 = this.name;
            java.lang.String str3 = this.description;
            com.datadog.android.rum.model.VitalAppLaunchEvent.AppLaunchMetric appLaunchMetric = this.appLaunchMetric;
            java.lang.Number number = this.duration;
            com.datadog.android.rum.model.VitalAppLaunchEvent.StartupType startupType = this.startupType;
            java.lang.Boolean bool = this.isPrewarmed;
            java.lang.Boolean bool2 = this.hasSavedInstanceStateBundle;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Vital(id=");
            sb.append(str);
            sb.append(", name=");
            sb.append(str2);
            sb.append(", description=");
            sb.append(str3);
            sb.append(", appLaunchMetric=");
            sb.append(appLaunchMetric);
            sb.append(", duration=");
            sb.append(number);
            sb.append(", startupType=");
            sb.append(startupType);
            sb.append(", isPrewarmed=");
            sb.append(bool);
            sb.append(", hasSavedInstanceStateBundle=");
            sb.append(bool2);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.id.hashCode();
            java.lang.String str = this.name;
            int hashCode2 = str == null ? 0 : str.hashCode();
            java.lang.String str2 = this.description;
            int hashCode3 = str2 == null ? 0 : str2.hashCode();
            int hashCode4 = this.appLaunchMetric.hashCode();
            int hashCode5 = this.duration.hashCode();
            com.datadog.android.rum.model.VitalAppLaunchEvent.StartupType startupType = this.startupType;
            int hashCode6 = startupType == null ? 0 : startupType.hashCode();
            java.lang.Boolean bool = this.isPrewarmed;
            int hashCode7 = bool == null ? 0 : bool.hashCode();
            java.lang.Boolean bool2 = this.hasSavedInstanceStateBundle;
            return (((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + (bool2 != null ? bool2.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.datadog.android.rum.model.VitalAppLaunchEvent.Vital)) {
                return false;
            }
            com.datadog.android.rum.model.VitalAppLaunchEvent.Vital vital = (com.datadog.android.rum.model.VitalAppLaunchEvent.Vital) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.id, vital.id) && kotlin.jvm.internal.Intrinsics.areEqual(this.name, vital.name) && kotlin.jvm.internal.Intrinsics.areEqual(this.description, vital.description) && this.appLaunchMetric == vital.appLaunchMetric && kotlin.jvm.internal.Intrinsics.areEqual(this.duration, vital.duration) && this.startupType == vital.startupType && kotlin.jvm.internal.Intrinsics.areEqual(this.isPrewarmed, vital.isPrewarmed) && kotlin.jvm.internal.Intrinsics.areEqual(this.hasSavedInstanceStateBundle, vital.hasSavedInstanceStateBundle);
        }

        public final com.datadog.android.rum.model.VitalAppLaunchEvent.Vital copy(java.lang.String id, java.lang.String name2, java.lang.String description, com.datadog.android.rum.model.VitalAppLaunchEvent.AppLaunchMetric appLaunchMetric, java.lang.Number duration, com.datadog.android.rum.model.VitalAppLaunchEvent.StartupType startupType, java.lang.Boolean isPrewarmed, java.lang.Boolean hasSavedInstanceStateBundle) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appLaunchMetric, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(duration, "");
            return new com.datadog.android.rum.model.VitalAppLaunchEvent.Vital(id, name2, description, appLaunchMetric, duration, startupType, isPrewarmed, hasSavedInstanceStateBundle);
        }

        /* renamed from: component8, reason: from getter */
        public final java.lang.Boolean getHasSavedInstanceStateBundle() {
            return this.hasSavedInstanceStateBundle;
        }

        /* renamed from: component7, reason: from getter */
        public final java.lang.Boolean getIsPrewarmed() {
            return this.isPrewarmed;
        }

        /* renamed from: component6, reason: from getter */
        public final com.datadog.android.rum.model.VitalAppLaunchEvent.StartupType getStartupType() {
            return this.startupType;
        }

        /* renamed from: component5, reason: from getter */
        public final java.lang.Number getDuration() {
            return this.duration;
        }

        /* renamed from: component4, reason: from getter */
        public final com.datadog.android.rum.model.VitalAppLaunchEvent.AppLaunchMetric getAppLaunchMetric() {
            return this.appLaunchMetric;
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String getDescription() {
            return this.description;
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
        public static final com.datadog.android.rum.model.VitalAppLaunchEvent.Vital fromJsonObject(com.google.gson.JsonObject jsonObject) throws com.google.gson.JsonParseException {
            return INSTANCE.fromJsonObject(jsonObject);
        }

        @kotlin.jvm.JvmStatic
        public static final com.datadog.android.rum.model.VitalAppLaunchEvent.Vital fromJson(java.lang.String str) throws com.google.gson.JsonParseException {
            return INSTANCE.fromJson(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\b\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ(\u0010\n\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\bR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0018\u0010\bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0019\u0010\b"}, d2 = {"Lcom/datadog/android/rum/model/VitalAppLaunchEvent$Cellular;", "", "", "technology", "carrierName", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/datadog/android/rum/model/VitalAppLaunchEvent$Cellular;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lcom/google/gson/JsonElement;", "toJson", "()Lcom/google/gson/JsonElement;", "toString", "Ljava/lang/String;", "getCarrierName", "getTechnology", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final /* data */ class Cellular {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.datadog.android.rum.model.VitalAppLaunchEvent.Cellular.Companion INSTANCE = new com.datadog.android.rum.model.VitalAppLaunchEvent.Cellular.Companion(null);
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

        @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/datadog/android/rum/model/VitalAppLaunchEvent$Cellular$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/rum/model/VitalAppLaunchEvent$Cellular;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/rum/model/VitalAppLaunchEvent$Cellular;", "Lcom/google/gson/JsonObject;", "jsonObject", "fromJsonObject", "(Lcom/google/gson/JsonObject;)Lcom/datadog/android/rum/model/VitalAppLaunchEvent$Cellular;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @kotlin.jvm.JvmStatic
            public final com.datadog.android.rum.model.VitalAppLaunchEvent.Cellular fromJson(java.lang.String jsonString) throws com.google.gson.JsonParseException {
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
            public final com.datadog.android.rum.model.VitalAppLaunchEvent.Cellular fromJsonObject(com.google.gson.JsonObject jsonObject) throws com.google.gson.JsonParseException {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonObject, "");
                try {
                    com.google.gson.JsonElement jsonElement = jsonObject.get("technology");
                    java.lang.String asString = jsonElement != null ? jsonElement.getAsString() : null;
                    com.google.gson.JsonElement jsonElement2 = jsonObject.get("carrier_name");
                    return new com.datadog.android.rum.model.VitalAppLaunchEvent.Cellular(asString, jsonElement2 != null ? jsonElement2.getAsString() : null);
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
            if (!(other instanceof com.datadog.android.rum.model.VitalAppLaunchEvent.Cellular)) {
                return false;
            }
            com.datadog.android.rum.model.VitalAppLaunchEvent.Cellular cellular = (com.datadog.android.rum.model.VitalAppLaunchEvent.Cellular) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.technology, cellular.technology) && kotlin.jvm.internal.Intrinsics.areEqual(this.carrierName, cellular.carrierName);
        }

        public final com.datadog.android.rum.model.VitalAppLaunchEvent.Cellular copy(java.lang.String technology, java.lang.String carrierName) {
            return new com.datadog.android.rum.model.VitalAppLaunchEvent.Cellular(technology, carrierName);
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
        public static final com.datadog.android.rum.model.VitalAppLaunchEvent.Cellular fromJsonObject(com.google.gson.JsonObject jsonObject) throws com.google.gson.JsonParseException {
            return INSTANCE.fromJsonObject(jsonObject);
        }

        @kotlin.jvm.JvmStatic
        public static final com.datadog.android.rum.model.VitalAppLaunchEvent.Cellular fromJson(java.lang.String str) throws com.google.gson.JsonParseException {
            return INSTANCE.fromJson(str);
        }

        public static /* synthetic */ com.datadog.android.rum.model.VitalAppLaunchEvent.Cellular copy$default(com.datadog.android.rum.model.VitalAppLaunchEvent.Cellular cellular, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
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

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0004\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0004\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001a\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001b\u0010\b"}, d2 = {"Lcom/datadog/android/rum/model/VitalAppLaunchEvent$Viewport;", "", "", "width", "height", "<init>", "(Ljava/lang/Number;Ljava/lang/Number;)V", "component1", "()Ljava/lang/Number;", "component2", "copy", "(Ljava/lang/Number;Ljava/lang/Number;)Lcom/datadog/android/rum/model/VitalAppLaunchEvent$Viewport;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lcom/google/gson/JsonElement;", "toJson", "()Lcom/google/gson/JsonElement;", "", "toString", "()Ljava/lang/String;", "Ljava/lang/Number;", "getHeight", "getWidth", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final /* data */ class Viewport {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.datadog.android.rum.model.VitalAppLaunchEvent.Viewport.Companion INSTANCE = new com.datadog.android.rum.model.VitalAppLaunchEvent.Viewport.Companion(null);
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

        @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/datadog/android/rum/model/VitalAppLaunchEvent$Viewport$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/rum/model/VitalAppLaunchEvent$Viewport;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/rum/model/VitalAppLaunchEvent$Viewport;", "Lcom/google/gson/JsonObject;", "jsonObject", "fromJsonObject", "(Lcom/google/gson/JsonObject;)Lcom/datadog/android/rum/model/VitalAppLaunchEvent$Viewport;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @kotlin.jvm.JvmStatic
            public final com.datadog.android.rum.model.VitalAppLaunchEvent.Viewport fromJson(java.lang.String jsonString) throws com.google.gson.JsonParseException {
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
            public final com.datadog.android.rum.model.VitalAppLaunchEvent.Viewport fromJsonObject(com.google.gson.JsonObject jsonObject) throws com.google.gson.JsonParseException {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonObject, "");
                try {
                    java.lang.Number asNumber = jsonObject.get("width").getAsNumber();
                    java.lang.Number asNumber2 = jsonObject.get("height").getAsNumber();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asNumber, "");
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asNumber2, "");
                    return new com.datadog.android.rum.model.VitalAppLaunchEvent.Viewport(asNumber, asNumber2);
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
            if (!(other instanceof com.datadog.android.rum.model.VitalAppLaunchEvent.Viewport)) {
                return false;
            }
            com.datadog.android.rum.model.VitalAppLaunchEvent.Viewport viewport = (com.datadog.android.rum.model.VitalAppLaunchEvent.Viewport) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.width, viewport.width) && kotlin.jvm.internal.Intrinsics.areEqual(this.height, viewport.height);
        }

        public final com.datadog.android.rum.model.VitalAppLaunchEvent.Viewport copy(java.lang.Number width, java.lang.Number height) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(width, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(height, "");
            return new com.datadog.android.rum.model.VitalAppLaunchEvent.Viewport(width, height);
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
        public static final com.datadog.android.rum.model.VitalAppLaunchEvent.Viewport fromJsonObject(com.google.gson.JsonObject jsonObject) throws com.google.gson.JsonParseException {
            return INSTANCE.fromJsonObject(jsonObject);
        }

        @kotlin.jvm.JvmStatic
        public static final com.datadog.android.rum.model.VitalAppLaunchEvent.Viewport fromJson(java.lang.String str) throws com.google.gson.JsonParseException {
            return INSTANCE.fromJson(str);
        }

        public static /* synthetic */ com.datadog.android.rum.model.VitalAppLaunchEvent.Viewport copy$default(com.datadog.android.rum.model.VitalAppLaunchEvent.Viewport viewport, java.lang.Number number, java.lang.Number number2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                number = viewport.width;
            }
            if ((i & 2) != 0) {
                number2 = viewport.height;
            }
            return viewport.copy(number, number2);
        }
    }

    @kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\b\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ(\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001d\u001a\u0004\b\u001e\u0010\u000b"}, d2 = {"Lcom/datadog/android/rum/model/VitalAppLaunchEvent$DdSession;", "", "Lcom/datadog/android/rum/model/VitalAppLaunchEvent$Plan;", "plan", "Lcom/datadog/android/rum/model/VitalAppLaunchEvent$SessionPrecondition;", "sessionPrecondition", "<init>", "(Lcom/datadog/android/rum/model/VitalAppLaunchEvent$Plan;Lcom/datadog/android/rum/model/VitalAppLaunchEvent$SessionPrecondition;)V", "component1", "()Lcom/datadog/android/rum/model/VitalAppLaunchEvent$Plan;", "component2", "()Lcom/datadog/android/rum/model/VitalAppLaunchEvent$SessionPrecondition;", "copy", "(Lcom/datadog/android/rum/model/VitalAppLaunchEvent$Plan;Lcom/datadog/android/rum/model/VitalAppLaunchEvent$SessionPrecondition;)Lcom/datadog/android/rum/model/VitalAppLaunchEvent$DdSession;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lcom/google/gson/JsonElement;", "toJson", "()Lcom/google/gson/JsonElement;", "", "toString", "()Ljava/lang/String;", "Lcom/datadog/android/rum/model/VitalAppLaunchEvent$Plan;", "getPlan", "Lcom/datadog/android/rum/model/VitalAppLaunchEvent$SessionPrecondition;", "getSessionPrecondition", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final /* data */ class DdSession {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.datadog.android.rum.model.VitalAppLaunchEvent.DdSession.Companion INSTANCE = new com.datadog.android.rum.model.VitalAppLaunchEvent.DdSession.Companion(null);
        private final com.datadog.android.rum.model.VitalAppLaunchEvent.Plan plan;
        private final com.datadog.android.rum.model.VitalAppLaunchEvent.SessionPrecondition sessionPrecondition;

        public DdSession(com.datadog.android.rum.model.VitalAppLaunchEvent.Plan plan, com.datadog.android.rum.model.VitalAppLaunchEvent.SessionPrecondition sessionPrecondition) {
            this.plan = plan;
            this.sessionPrecondition = sessionPrecondition;
        }

        public /* synthetic */ DdSession(com.datadog.android.rum.model.VitalAppLaunchEvent.Plan plan, com.datadog.android.rum.model.VitalAppLaunchEvent.SessionPrecondition sessionPrecondition, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : plan, (i & 2) != 0 ? null : sessionPrecondition);
        }

        public final com.datadog.android.rum.model.VitalAppLaunchEvent.Plan getPlan() {
            return this.plan;
        }

        public final com.datadog.android.rum.model.VitalAppLaunchEvent.SessionPrecondition getSessionPrecondition() {
            return this.sessionPrecondition;
        }

        public final com.google.gson.JsonElement toJson() {
            com.google.gson.JsonObject jsonObject = new com.google.gson.JsonObject();
            com.datadog.android.rum.model.VitalAppLaunchEvent.Plan plan = this.plan;
            if (plan != null) {
                jsonObject.add("plan", plan.toJson());
            }
            com.datadog.android.rum.model.VitalAppLaunchEvent.SessionPrecondition sessionPrecondition = this.sessionPrecondition;
            if (sessionPrecondition != null) {
                jsonObject.add("session_precondition", sessionPrecondition.toJson());
            }
            return jsonObject;
        }

        @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/datadog/android/rum/model/VitalAppLaunchEvent$DdSession$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/rum/model/VitalAppLaunchEvent$DdSession;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/rum/model/VitalAppLaunchEvent$DdSession;", "Lcom/google/gson/JsonObject;", "jsonObject", "fromJsonObject", "(Lcom/google/gson/JsonObject;)Lcom/datadog/android/rum/model/VitalAppLaunchEvent$DdSession;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @kotlin.jvm.JvmStatic
            public final com.datadog.android.rum.model.VitalAppLaunchEvent.DdSession fromJson(java.lang.String jsonString) throws com.google.gson.JsonParseException {
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
            public final com.datadog.android.rum.model.VitalAppLaunchEvent.DdSession fromJsonObject(com.google.gson.JsonObject jsonObject) throws com.google.gson.JsonParseException {
                java.lang.String asString;
                java.lang.String asString2;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonObject, "");
                try {
                    com.google.gson.JsonElement jsonElement = jsonObject.get("plan");
                    com.datadog.android.rum.model.VitalAppLaunchEvent.SessionPrecondition sessionPrecondition = null;
                    com.datadog.android.rum.model.VitalAppLaunchEvent.Plan fromJson = (jsonElement == null || (asString2 = jsonElement.getAsString()) == null) ? null : com.datadog.android.rum.model.VitalAppLaunchEvent.Plan.INSTANCE.fromJson(asString2);
                    com.google.gson.JsonElement jsonElement2 = jsonObject.get("session_precondition");
                    if (jsonElement2 != null && (asString = jsonElement2.getAsString()) != null) {
                        sessionPrecondition = com.datadog.android.rum.model.VitalAppLaunchEvent.SessionPrecondition.INSTANCE.fromJson(asString);
                    }
                    return new com.datadog.android.rum.model.VitalAppLaunchEvent.DdSession(fromJson, sessionPrecondition);
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
            com.datadog.android.rum.model.VitalAppLaunchEvent.Plan plan = this.plan;
            com.datadog.android.rum.model.VitalAppLaunchEvent.SessionPrecondition sessionPrecondition = this.sessionPrecondition;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("DdSession(plan=");
            sb.append(plan);
            sb.append(", sessionPrecondition=");
            sb.append(sessionPrecondition);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            com.datadog.android.rum.model.VitalAppLaunchEvent.Plan plan = this.plan;
            int hashCode = plan == null ? 0 : plan.hashCode();
            com.datadog.android.rum.model.VitalAppLaunchEvent.SessionPrecondition sessionPrecondition = this.sessionPrecondition;
            return (hashCode * 31) + (sessionPrecondition != null ? sessionPrecondition.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.datadog.android.rum.model.VitalAppLaunchEvent.DdSession)) {
                return false;
            }
            com.datadog.android.rum.model.VitalAppLaunchEvent.DdSession ddSession = (com.datadog.android.rum.model.VitalAppLaunchEvent.DdSession) other;
            return this.plan == ddSession.plan && this.sessionPrecondition == ddSession.sessionPrecondition;
        }

        public final com.datadog.android.rum.model.VitalAppLaunchEvent.DdSession copy(com.datadog.android.rum.model.VitalAppLaunchEvent.Plan plan, com.datadog.android.rum.model.VitalAppLaunchEvent.SessionPrecondition sessionPrecondition) {
            return new com.datadog.android.rum.model.VitalAppLaunchEvent.DdSession(plan, sessionPrecondition);
        }

        /* renamed from: component2, reason: from getter */
        public final com.datadog.android.rum.model.VitalAppLaunchEvent.SessionPrecondition getSessionPrecondition() {
            return this.sessionPrecondition;
        }

        /* renamed from: component1, reason: from getter */
        public final com.datadog.android.rum.model.VitalAppLaunchEvent.Plan getPlan() {
            return this.plan;
        }

        @kotlin.jvm.JvmStatic
        public static final com.datadog.android.rum.model.VitalAppLaunchEvent.DdSession fromJsonObject(com.google.gson.JsonObject jsonObject) throws com.google.gson.JsonParseException {
            return INSTANCE.fromJsonObject(jsonObject);
        }

        @kotlin.jvm.JvmStatic
        public static final com.datadog.android.rum.model.VitalAppLaunchEvent.DdSession fromJson(java.lang.String str) throws com.google.gson.JsonParseException {
            return INSTANCE.fromJson(str);
        }

        public static /* synthetic */ com.datadog.android.rum.model.VitalAppLaunchEvent.DdSession copy$default(com.datadog.android.rum.model.VitalAppLaunchEvent.DdSession ddSession, com.datadog.android.rum.model.VitalAppLaunchEvent.Plan plan, com.datadog.android.rum.model.VitalAppLaunchEvent.SessionPrecondition sessionPrecondition, int i, java.lang.Object obj) {
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

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0004\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\b\u0018\u0000 \"2\u00020\u0001:\u0001\"B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\nJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\nJ>\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u001d\u001a\u0004\b\u001e\u0010\nR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001d\u001a\u0004\b\u001f\u0010\nR\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b \u0010\nR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001d\u001a\u0004\b!\u0010\n"}, d2 = {"Lcom/datadog/android/rum/model/VitalAppLaunchEvent$Configuration;", "", "", "sessionSampleRate", "sessionReplaySampleRate", "profilingSampleRate", "traceSampleRate", "<init>", "(Ljava/lang/Number;Ljava/lang/Number;Ljava/lang/Number;Ljava/lang/Number;)V", "component1", "()Ljava/lang/Number;", "component2", "component3", "component4", "copy", "(Ljava/lang/Number;Ljava/lang/Number;Ljava/lang/Number;Ljava/lang/Number;)Lcom/datadog/android/rum/model/VitalAppLaunchEvent$Configuration;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lcom/google/gson/JsonElement;", "toJson", "()Lcom/google/gson/JsonElement;", "", "toString", "()Ljava/lang/String;", "Ljava/lang/Number;", "getProfilingSampleRate", "getSessionReplaySampleRate", "getSessionSampleRate", "getTraceSampleRate", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final /* data */ class Configuration {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.datadog.android.rum.model.VitalAppLaunchEvent.Configuration.Companion INSTANCE = new com.datadog.android.rum.model.VitalAppLaunchEvent.Configuration.Companion(null);
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

        @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/datadog/android/rum/model/VitalAppLaunchEvent$Configuration$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/rum/model/VitalAppLaunchEvent$Configuration;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/rum/model/VitalAppLaunchEvent$Configuration;", "Lcom/google/gson/JsonObject;", "jsonObject", "fromJsonObject", "(Lcom/google/gson/JsonObject;)Lcom/datadog/android/rum/model/VitalAppLaunchEvent$Configuration;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @kotlin.jvm.JvmStatic
            public final com.datadog.android.rum.model.VitalAppLaunchEvent.Configuration fromJson(java.lang.String jsonString) throws com.google.gson.JsonParseException {
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
            public final com.datadog.android.rum.model.VitalAppLaunchEvent.Configuration fromJsonObject(com.google.gson.JsonObject jsonObject) throws com.google.gson.JsonParseException {
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
                    return new com.datadog.android.rum.model.VitalAppLaunchEvent.Configuration(asNumber, asNumber2, asNumber3, asNumber4);
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
            if (!(other instanceof com.datadog.android.rum.model.VitalAppLaunchEvent.Configuration)) {
                return false;
            }
            com.datadog.android.rum.model.VitalAppLaunchEvent.Configuration configuration = (com.datadog.android.rum.model.VitalAppLaunchEvent.Configuration) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.sessionSampleRate, configuration.sessionSampleRate) && kotlin.jvm.internal.Intrinsics.areEqual(this.sessionReplaySampleRate, configuration.sessionReplaySampleRate) && kotlin.jvm.internal.Intrinsics.areEqual(this.profilingSampleRate, configuration.profilingSampleRate) && kotlin.jvm.internal.Intrinsics.areEqual(this.traceSampleRate, configuration.traceSampleRate);
        }

        public final com.datadog.android.rum.model.VitalAppLaunchEvent.Configuration copy(java.lang.Number sessionSampleRate, java.lang.Number sessionReplaySampleRate, java.lang.Number profilingSampleRate, java.lang.Number traceSampleRate) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sessionSampleRate, "");
            return new com.datadog.android.rum.model.VitalAppLaunchEvent.Configuration(sessionSampleRate, sessionReplaySampleRate, profilingSampleRate, traceSampleRate);
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
        public static final com.datadog.android.rum.model.VitalAppLaunchEvent.Configuration fromJsonObject(com.google.gson.JsonObject jsonObject) throws com.google.gson.JsonParseException {
            return INSTANCE.fromJsonObject(jsonObject);
        }

        @kotlin.jvm.JvmStatic
        public static final com.datadog.android.rum.model.VitalAppLaunchEvent.Configuration fromJson(java.lang.String str) throws com.google.gson.JsonParseException {
            return INSTANCE.fromJson(str);
        }

        public static /* synthetic */ com.datadog.android.rum.model.VitalAppLaunchEvent.Configuration copy$default(com.datadog.android.rum.model.VitalAppLaunchEvent.Configuration configuration, java.lang.Number number, java.lang.Number number2, java.lang.Number number3, java.lang.Number number4, int i, java.lang.Object obj) {
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

    @kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\b\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ(\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\u000bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\t"}, d2 = {"Lcom/datadog/android/rum/model/VitalAppLaunchEvent$Profiling;", "", "Lcom/datadog/android/rum/model/VitalAppLaunchEvent$ProfilingStatus;", "status", "Lcom/datadog/android/rum/model/VitalAppLaunchEvent$ErrorReason;", "errorReason", "<init>", "(Lcom/datadog/android/rum/model/VitalAppLaunchEvent$ProfilingStatus;Lcom/datadog/android/rum/model/VitalAppLaunchEvent$ErrorReason;)V", "component1", "()Lcom/datadog/android/rum/model/VitalAppLaunchEvent$ProfilingStatus;", "component2", "()Lcom/datadog/android/rum/model/VitalAppLaunchEvent$ErrorReason;", "copy", "(Lcom/datadog/android/rum/model/VitalAppLaunchEvent$ProfilingStatus;Lcom/datadog/android/rum/model/VitalAppLaunchEvent$ErrorReason;)Lcom/datadog/android/rum/model/VitalAppLaunchEvent$Profiling;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lcom/google/gson/JsonElement;", "toJson", "()Lcom/google/gson/JsonElement;", "", "toString", "()Ljava/lang/String;", "Lcom/datadog/android/rum/model/VitalAppLaunchEvent$ErrorReason;", "getErrorReason", "Lcom/datadog/android/rum/model/VitalAppLaunchEvent$ProfilingStatus;", "getStatus", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final /* data */ class Profiling {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.datadog.android.rum.model.VitalAppLaunchEvent.Profiling.Companion INSTANCE = new com.datadog.android.rum.model.VitalAppLaunchEvent.Profiling.Companion(null);
        private final com.datadog.android.rum.model.VitalAppLaunchEvent.ErrorReason errorReason;
        private final com.datadog.android.rum.model.VitalAppLaunchEvent.ProfilingStatus status;

        public Profiling(com.datadog.android.rum.model.VitalAppLaunchEvent.ProfilingStatus profilingStatus, com.datadog.android.rum.model.VitalAppLaunchEvent.ErrorReason errorReason) {
            this.status = profilingStatus;
            this.errorReason = errorReason;
        }

        public /* synthetic */ Profiling(com.datadog.android.rum.model.VitalAppLaunchEvent.ProfilingStatus profilingStatus, com.datadog.android.rum.model.VitalAppLaunchEvent.ErrorReason errorReason, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : profilingStatus, (i & 2) != 0 ? null : errorReason);
        }

        public final com.datadog.android.rum.model.VitalAppLaunchEvent.ProfilingStatus getStatus() {
            return this.status;
        }

        public final com.datadog.android.rum.model.VitalAppLaunchEvent.ErrorReason getErrorReason() {
            return this.errorReason;
        }

        public final com.google.gson.JsonElement toJson() {
            com.google.gson.JsonObject jsonObject = new com.google.gson.JsonObject();
            com.datadog.android.rum.model.VitalAppLaunchEvent.ProfilingStatus profilingStatus = this.status;
            if (profilingStatus != null) {
                jsonObject.add("status", profilingStatus.toJson());
            }
            com.datadog.android.rum.model.VitalAppLaunchEvent.ErrorReason errorReason = this.errorReason;
            if (errorReason != null) {
                jsonObject.add("error_reason", errorReason.toJson());
            }
            return jsonObject;
        }

        @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/datadog/android/rum/model/VitalAppLaunchEvent$Profiling$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/rum/model/VitalAppLaunchEvent$Profiling;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/rum/model/VitalAppLaunchEvent$Profiling;", "Lcom/google/gson/JsonObject;", "jsonObject", "fromJsonObject", "(Lcom/google/gson/JsonObject;)Lcom/datadog/android/rum/model/VitalAppLaunchEvent$Profiling;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @kotlin.jvm.JvmStatic
            public final com.datadog.android.rum.model.VitalAppLaunchEvent.Profiling fromJson(java.lang.String jsonString) throws com.google.gson.JsonParseException {
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
            public final com.datadog.android.rum.model.VitalAppLaunchEvent.Profiling fromJsonObject(com.google.gson.JsonObject jsonObject) throws com.google.gson.JsonParseException {
                java.lang.String asString;
                java.lang.String asString2;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonObject, "");
                try {
                    com.google.gson.JsonElement jsonElement = jsonObject.get("status");
                    com.datadog.android.rum.model.VitalAppLaunchEvent.ErrorReason errorReason = null;
                    com.datadog.android.rum.model.VitalAppLaunchEvent.ProfilingStatus fromJson = (jsonElement == null || (asString2 = jsonElement.getAsString()) == null) ? null : com.datadog.android.rum.model.VitalAppLaunchEvent.ProfilingStatus.INSTANCE.fromJson(asString2);
                    com.google.gson.JsonElement jsonElement2 = jsonObject.get("error_reason");
                    if (jsonElement2 != null && (asString = jsonElement2.getAsString()) != null) {
                        errorReason = com.datadog.android.rum.model.VitalAppLaunchEvent.ErrorReason.INSTANCE.fromJson(asString);
                    }
                    return new com.datadog.android.rum.model.VitalAppLaunchEvent.Profiling(fromJson, errorReason);
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
            com.datadog.android.rum.model.VitalAppLaunchEvent.ProfilingStatus profilingStatus = this.status;
            com.datadog.android.rum.model.VitalAppLaunchEvent.ErrorReason errorReason = this.errorReason;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Profiling(status=");
            sb.append(profilingStatus);
            sb.append(", errorReason=");
            sb.append(errorReason);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            com.datadog.android.rum.model.VitalAppLaunchEvent.ProfilingStatus profilingStatus = this.status;
            int hashCode = profilingStatus == null ? 0 : profilingStatus.hashCode();
            com.datadog.android.rum.model.VitalAppLaunchEvent.ErrorReason errorReason = this.errorReason;
            return (hashCode * 31) + (errorReason != null ? errorReason.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.datadog.android.rum.model.VitalAppLaunchEvent.Profiling)) {
                return false;
            }
            com.datadog.android.rum.model.VitalAppLaunchEvent.Profiling profiling = (com.datadog.android.rum.model.VitalAppLaunchEvent.Profiling) other;
            return this.status == profiling.status && this.errorReason == profiling.errorReason;
        }

        public final com.datadog.android.rum.model.VitalAppLaunchEvent.Profiling copy(com.datadog.android.rum.model.VitalAppLaunchEvent.ProfilingStatus status, com.datadog.android.rum.model.VitalAppLaunchEvent.ErrorReason errorReason) {
            return new com.datadog.android.rum.model.VitalAppLaunchEvent.Profiling(status, errorReason);
        }

        /* renamed from: component2, reason: from getter */
        public final com.datadog.android.rum.model.VitalAppLaunchEvent.ErrorReason getErrorReason() {
            return this.errorReason;
        }

        /* renamed from: component1, reason: from getter */
        public final com.datadog.android.rum.model.VitalAppLaunchEvent.ProfilingStatus getStatus() {
            return this.status;
        }

        @kotlin.jvm.JvmStatic
        public static final com.datadog.android.rum.model.VitalAppLaunchEvent.Profiling fromJsonObject(com.google.gson.JsonObject jsonObject) throws com.google.gson.JsonParseException {
            return INSTANCE.fromJsonObject(jsonObject);
        }

        @kotlin.jvm.JvmStatic
        public static final com.datadog.android.rum.model.VitalAppLaunchEvent.Profiling fromJson(java.lang.String str) throws com.google.gson.JsonParseException {
            return INSTANCE.fromJson(str);
        }

        public static /* synthetic */ com.datadog.android.rum.model.VitalAppLaunchEvent.Profiling copy$default(com.datadog.android.rum.model.VitalAppLaunchEvent.Profiling profiling, com.datadog.android.rum.model.VitalAppLaunchEvent.ProfilingStatus profilingStatus, com.datadog.android.rum.model.VitalAppLaunchEvent.ErrorReason errorReason, int i, java.lang.Object obj) {
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

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/datadog/android/rum/model/VitalAppLaunchEvent$ContainerView;", "", "", "id", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/datadog/android/rum/model/VitalAppLaunchEvent$ContainerView;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lcom/google/gson/JsonElement;", "toJson", "()Lcom/google/gson/JsonElement;", "toString", "Ljava/lang/String;", "getId", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final /* data */ class ContainerView {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.datadog.android.rum.model.VitalAppLaunchEvent.ContainerView.Companion INSTANCE = new com.datadog.android.rum.model.VitalAppLaunchEvent.ContainerView.Companion(null);
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

        @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/datadog/android/rum/model/VitalAppLaunchEvent$ContainerView$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/rum/model/VitalAppLaunchEvent$ContainerView;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/rum/model/VitalAppLaunchEvent$ContainerView;", "Lcom/google/gson/JsonObject;", "jsonObject", "fromJsonObject", "(Lcom/google/gson/JsonObject;)Lcom/datadog/android/rum/model/VitalAppLaunchEvent$ContainerView;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @kotlin.jvm.JvmStatic
            public final com.datadog.android.rum.model.VitalAppLaunchEvent.ContainerView fromJson(java.lang.String jsonString) throws com.google.gson.JsonParseException {
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
            public final com.datadog.android.rum.model.VitalAppLaunchEvent.ContainerView fromJsonObject(com.google.gson.JsonObject jsonObject) throws com.google.gson.JsonParseException {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonObject, "");
                try {
                    java.lang.String asString = jsonObject.get("id").getAsString();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asString, "");
                    return new com.datadog.android.rum.model.VitalAppLaunchEvent.ContainerView(asString);
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
            return (other instanceof com.datadog.android.rum.model.VitalAppLaunchEvent.ContainerView) && kotlin.jvm.internal.Intrinsics.areEqual(this.id, ((com.datadog.android.rum.model.VitalAppLaunchEvent.ContainerView) other).id);
        }

        public final com.datadog.android.rum.model.VitalAppLaunchEvent.ContainerView copy(java.lang.String id) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
            return new com.datadog.android.rum.model.VitalAppLaunchEvent.ContainerView(id);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getId() {
            return this.id;
        }

        @kotlin.jvm.JvmStatic
        public static final com.datadog.android.rum.model.VitalAppLaunchEvent.ContainerView fromJsonObject(com.google.gson.JsonObject jsonObject) throws com.google.gson.JsonParseException {
            return INSTANCE.fromJsonObject(jsonObject);
        }

        @kotlin.jvm.JvmStatic
        public static final com.datadog.android.rum.model.VitalAppLaunchEvent.ContainerView fromJson(java.lang.String str) throws com.google.gson.JsonParseException {
            return INSTANCE.fromJson(str);
        }

        public static /* synthetic */ com.datadog.android.rum.model.VitalAppLaunchEvent.ContainerView copy$default(com.datadog.android.rum.model.VitalAppLaunchEvent.ContainerView containerView, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = containerView.id;
            }
            return containerView.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0086\u0001\u0018\u0000 \f2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u000b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014"}, d2 = {"Lcom/datadog/android/rum/model/VitalAppLaunchEvent$VitalAppLaunchEventSource;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Lcom/google/gson/JsonElement;", "toJson", "()Lcom/google/gson/JsonElement;", "getHighSpeedVideoSizes", "Ljava/lang/String;", "Camera2StreamConfigurationMap", "Companion", "ANDROID", "IOS", "BROWSER", "FLUTTER", "REACT_NATIVE", "ROKU", "UNITY", "KOTLIN_MULTIPLATFORM"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public enum VitalAppLaunchEventSource {
        ANDROID(com.datadog.android.core.internal.CoreFeature.DEFAULT_SOURCE_NAME),
        IOS("ios"),
        BROWSER("browser"),
        FLUTTER("flutter"),
        REACT_NATIVE("react-native"),
        ROKU("roku"),
        UNITY("unity"),
        KOTLIN_MULTIPLATFORM("kotlin-multiplatform");


        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.datadog.android.rum.model.VitalAppLaunchEvent.VitalAppLaunchEventSource.Companion INSTANCE = new com.datadog.android.rum.model.VitalAppLaunchEvent.VitalAppLaunchEventSource.Companion(null);

        /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
        private final java.lang.String Camera2StreamConfigurationMap;

        VitalAppLaunchEventSource(java.lang.String str) {
            this.Camera2StreamConfigurationMap = str;
        }

        public final com.google.gson.JsonElement toJson() {
            return new com.google.gson.JsonPrimitive(this.Camera2StreamConfigurationMap);
        }

        @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/datadog/android/rum/model/VitalAppLaunchEvent$VitalAppLaunchEventSource$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/rum/model/VitalAppLaunchEvent$VitalAppLaunchEventSource;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/rum/model/VitalAppLaunchEvent$VitalAppLaunchEventSource;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @kotlin.jvm.JvmStatic
            public final com.datadog.android.rum.model.VitalAppLaunchEvent.VitalAppLaunchEventSource fromJson(java.lang.String jsonString) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonString, "");
                for (com.datadog.android.rum.model.VitalAppLaunchEvent.VitalAppLaunchEventSource vitalAppLaunchEventSource : com.datadog.android.rum.model.VitalAppLaunchEvent.VitalAppLaunchEventSource.values()) {
                    if (kotlin.jvm.internal.Intrinsics.areEqual(vitalAppLaunchEventSource.Camera2StreamConfigurationMap, jsonString)) {
                        return vitalAppLaunchEventSource;
                    }
                }
                throw new java.util.NoSuchElementException("Array contains no element matching the predicate.");
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        @kotlin.jvm.JvmStatic
        public static final com.datadog.android.rum.model.VitalAppLaunchEvent.VitalAppLaunchEventSource fromJson(java.lang.String str) {
            return INSTANCE.fromJson(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0001\u0018\u0000 \f2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u000b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f"}, d2 = {"Lcom/datadog/android/rum/model/VitalAppLaunchEvent$VitalAppLaunchEventSessionType;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Lcom/google/gson/JsonElement;", "toJson", "()Lcom/google/gson/JsonElement;", "getHighSpeedVideoSizes", "Ljava/lang/String;", "getHighSpeedVideoFpsRangesFor", "Companion", "USER", "SYNTHETICS", "CI_TEST"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public enum VitalAppLaunchEventSessionType {
        USER("user"),
        SYNTHETICS("synthetics"),
        CI_TEST("ci_test");


        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.datadog.android.rum.model.VitalAppLaunchEvent.VitalAppLaunchEventSessionType.Companion INSTANCE = new com.datadog.android.rum.model.VitalAppLaunchEvent.VitalAppLaunchEventSessionType.Companion(null);

        /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
        private final java.lang.String getHighSpeedVideoFpsRangesFor;

        VitalAppLaunchEventSessionType(java.lang.String str) {
            this.getHighSpeedVideoFpsRangesFor = str;
        }

        public final com.google.gson.JsonElement toJson() {
            return new com.google.gson.JsonPrimitive(this.getHighSpeedVideoFpsRangesFor);
        }

        @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/datadog/android/rum/model/VitalAppLaunchEvent$VitalAppLaunchEventSessionType$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/rum/model/VitalAppLaunchEvent$VitalAppLaunchEventSessionType;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/rum/model/VitalAppLaunchEvent$VitalAppLaunchEventSessionType;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @kotlin.jvm.JvmStatic
            public final com.datadog.android.rum.model.VitalAppLaunchEvent.VitalAppLaunchEventSessionType fromJson(java.lang.String jsonString) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonString, "");
                for (com.datadog.android.rum.model.VitalAppLaunchEvent.VitalAppLaunchEventSessionType vitalAppLaunchEventSessionType : com.datadog.android.rum.model.VitalAppLaunchEvent.VitalAppLaunchEventSessionType.values()) {
                    if (kotlin.jvm.internal.Intrinsics.areEqual(vitalAppLaunchEventSessionType.getHighSpeedVideoFpsRangesFor, jsonString)) {
                        return vitalAppLaunchEventSessionType;
                    }
                }
                throw new java.util.NoSuchElementException("Array contains no element matching the predicate.");
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        @kotlin.jvm.JvmStatic
        public static final com.datadog.android.rum.model.VitalAppLaunchEvent.VitalAppLaunchEventSessionType fromJson(java.lang.String str) {
            return INSTANCE.fromJson(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0001\u0018\u0000 \f2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u000b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f"}, d2 = {"Lcom/datadog/android/rum/model/VitalAppLaunchEvent$ConnectivityStatus;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Lcom/google/gson/JsonElement;", "toJson", "()Lcom/google/gson/JsonElement;", "getHighSpeedVideoFpsRangesFor", "Ljava/lang/String;", "Camera2StreamConfigurationMap", "Companion", "CONNECTED", "NOT_CONNECTED", "MAYBE"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public enum ConnectivityStatus {
        CONNECTED("connected"),
        NOT_CONNECTED("not_connected"),
        MAYBE("maybe");


        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.datadog.android.rum.model.VitalAppLaunchEvent.ConnectivityStatus.Companion INSTANCE = new com.datadog.android.rum.model.VitalAppLaunchEvent.ConnectivityStatus.Companion(null);

        /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
        private final java.lang.String Camera2StreamConfigurationMap;

        ConnectivityStatus(java.lang.String str) {
            this.Camera2StreamConfigurationMap = str;
        }

        public final com.google.gson.JsonElement toJson() {
            return new com.google.gson.JsonPrimitive(this.Camera2StreamConfigurationMap);
        }

        @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/datadog/android/rum/model/VitalAppLaunchEvent$ConnectivityStatus$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/rum/model/VitalAppLaunchEvent$ConnectivityStatus;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/rum/model/VitalAppLaunchEvent$ConnectivityStatus;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @kotlin.jvm.JvmStatic
            public final com.datadog.android.rum.model.VitalAppLaunchEvent.ConnectivityStatus fromJson(java.lang.String jsonString) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonString, "");
                for (com.datadog.android.rum.model.VitalAppLaunchEvent.ConnectivityStatus connectivityStatus : com.datadog.android.rum.model.VitalAppLaunchEvent.ConnectivityStatus.values()) {
                    if (kotlin.jvm.internal.Intrinsics.areEqual(connectivityStatus.Camera2StreamConfigurationMap, jsonString)) {
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
        public static final com.datadog.android.rum.model.VitalAppLaunchEvent.ConnectivityStatus fromJson(java.lang.String str) {
            return INSTANCE.fromJson(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0086\u0001\u0018\u0000 \f2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u000b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015"}, d2 = {"Lcom/datadog/android/rum/model/VitalAppLaunchEvent$Interface;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Lcom/google/gson/JsonElement;", "toJson", "()Lcom/google/gson/JsonElement;", "getHighSpeedVideoFpsRangesFor", "Ljava/lang/String;", "getHighResolutionOutputSizeshNQ4ISI", "Companion", "BLUETOOTH", "CELLULAR", "ETHERNET", "WIFI", "WIMAX", "MIXED", "OTHER", "UNKNOWN", "NONE"}, k = 1, mv = {1, 8, 0}, xi = 48)
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
        public static final com.datadog.android.rum.model.VitalAppLaunchEvent.Interface.Companion INSTANCE = new com.datadog.android.rum.model.VitalAppLaunchEvent.Interface.Companion(null);

        /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
        private final java.lang.String getHighResolutionOutputSizeshNQ4ISI;

        Interface(java.lang.String str) {
            this.getHighResolutionOutputSizeshNQ4ISI = str;
        }

        public final com.google.gson.JsonElement toJson() {
            return new com.google.gson.JsonPrimitive(this.getHighResolutionOutputSizeshNQ4ISI);
        }

        @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/datadog/android/rum/model/VitalAppLaunchEvent$Interface$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/rum/model/VitalAppLaunchEvent$Interface;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/rum/model/VitalAppLaunchEvent$Interface;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @kotlin.jvm.JvmStatic
            public final com.datadog.android.rum.model.VitalAppLaunchEvent.Interface fromJson(java.lang.String jsonString) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonString, "");
                for (com.datadog.android.rum.model.VitalAppLaunchEvent.Interface r3 : com.datadog.android.rum.model.VitalAppLaunchEvent.Interface.values()) {
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
        public static final com.datadog.android.rum.model.VitalAppLaunchEvent.Interface fromJson(java.lang.String str) {
            return INSTANCE.fromJson(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0001\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f"}, d2 = {"Lcom/datadog/android/rum/model/VitalAppLaunchEvent$EffectiveType;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Lcom/google/gson/JsonElement;", "toJson", "()Lcom/google/gson/JsonElement;", "Camera2StreamConfigurationMap", "Ljava/lang/String;", "Companion", "SLOW_2G", "2G", "3G", "4G"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public enum EffectiveType {
        SLOW_2G("slow-2g"),
        f212G("2g"),
        f223G("3g"),
        f234G("4g");


        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.datadog.android.rum.model.VitalAppLaunchEvent.EffectiveType.Companion INSTANCE = new com.datadog.android.rum.model.VitalAppLaunchEvent.EffectiveType.Companion(null);
        private final java.lang.String Camera2StreamConfigurationMap;

        EffectiveType(java.lang.String str) {
            this.Camera2StreamConfigurationMap = str;
        }

        public final com.google.gson.JsonElement toJson() {
            return new com.google.gson.JsonPrimitive(this.Camera2StreamConfigurationMap);
        }

        @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/datadog/android/rum/model/VitalAppLaunchEvent$EffectiveType$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/rum/model/VitalAppLaunchEvent$EffectiveType;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/rum/model/VitalAppLaunchEvent$EffectiveType;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @kotlin.jvm.JvmStatic
            public final com.datadog.android.rum.model.VitalAppLaunchEvent.EffectiveType fromJson(java.lang.String jsonString) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonString, "");
                for (com.datadog.android.rum.model.VitalAppLaunchEvent.EffectiveType effectiveType : com.datadog.android.rum.model.VitalAppLaunchEvent.EffectiveType.values()) {
                    if (kotlin.jvm.internal.Intrinsics.areEqual(effectiveType.Camera2StreamConfigurationMap, jsonString)) {
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
        public static final com.datadog.android.rum.model.VitalAppLaunchEvent.EffectiveType fromJson(java.lang.String str) {
            return INSTANCE.fromJson(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\b\u0086\u0001\u0018\u0000 \f2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u000b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013"}, d2 = {"Lcom/datadog/android/rum/model/VitalAppLaunchEvent$DeviceType;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Lcom/google/gson/JsonElement;", "toJson", "()Lcom/google/gson/JsonElement;", "getHighResolutionOutputSizeshNQ4ISI", "Ljava/lang/String;", "getHighSpeedVideoFpsRangesFor", "Companion", "MOBILE", "DESKTOP", "TABLET", "TV", "GAMING_CONSOLE", "BOT", "OTHER"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public enum DeviceType {
        MOBILE("mobile"),
        DESKTOP("desktop"),
        TABLET("tablet"),
        TV("tv"),
        GAMING_CONSOLE("gaming_console"),
        BOT("bot"),
        OTHER("other");


        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.datadog.android.rum.model.VitalAppLaunchEvent.DeviceType.Companion INSTANCE = new com.datadog.android.rum.model.VitalAppLaunchEvent.DeviceType.Companion(null);

        /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
        private final java.lang.String getHighSpeedVideoFpsRangesFor;

        DeviceType(java.lang.String str) {
            this.getHighSpeedVideoFpsRangesFor = str;
        }

        public final com.google.gson.JsonElement toJson() {
            return new com.google.gson.JsonPrimitive(this.getHighSpeedVideoFpsRangesFor);
        }

        @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/datadog/android/rum/model/VitalAppLaunchEvent$DeviceType$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/rum/model/VitalAppLaunchEvent$DeviceType;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/rum/model/VitalAppLaunchEvent$DeviceType;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @kotlin.jvm.JvmStatic
            public final com.datadog.android.rum.model.VitalAppLaunchEvent.DeviceType fromJson(java.lang.String jsonString) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonString, "");
                for (com.datadog.android.rum.model.VitalAppLaunchEvent.DeviceType deviceType : com.datadog.android.rum.model.VitalAppLaunchEvent.DeviceType.values()) {
                    if (kotlin.jvm.internal.Intrinsics.areEqual(deviceType.getHighSpeedVideoFpsRangesFor, jsonString)) {
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
        public static final com.datadog.android.rum.model.VitalAppLaunchEvent.DeviceType fromJson(java.lang.String str) {
            return INSTANCE.fromJson(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0001\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nj\u0002\b\fj\u0002\b\r"}, d2 = {"Lcom/datadog/android/rum/model/VitalAppLaunchEvent$AppLaunchMetric;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Lcom/google/gson/JsonElement;", "toJson", "()Lcom/google/gson/JsonElement;", "getHighResolutionOutputSizeshNQ4ISI", "Ljava/lang/String;", "Companion", "TTID", "TTFD"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public enum AppLaunchMetric {
        TTID("ttid"),
        TTFD("ttfd");


        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.datadog.android.rum.model.VitalAppLaunchEvent.AppLaunchMetric.Companion INSTANCE = new com.datadog.android.rum.model.VitalAppLaunchEvent.AppLaunchMetric.Companion(null);
        private final java.lang.String getHighResolutionOutputSizeshNQ4ISI;

        AppLaunchMetric(java.lang.String str) {
            this.getHighResolutionOutputSizeshNQ4ISI = str;
        }

        public final com.google.gson.JsonElement toJson() {
            return new com.google.gson.JsonPrimitive(this.getHighResolutionOutputSizeshNQ4ISI);
        }

        @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/datadog/android/rum/model/VitalAppLaunchEvent$AppLaunchMetric$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/rum/model/VitalAppLaunchEvent$AppLaunchMetric;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/rum/model/VitalAppLaunchEvent$AppLaunchMetric;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @kotlin.jvm.JvmStatic
            public final com.datadog.android.rum.model.VitalAppLaunchEvent.AppLaunchMetric fromJson(java.lang.String jsonString) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonString, "");
                for (com.datadog.android.rum.model.VitalAppLaunchEvent.AppLaunchMetric appLaunchMetric : com.datadog.android.rum.model.VitalAppLaunchEvent.AppLaunchMetric.values()) {
                    if (kotlin.jvm.internal.Intrinsics.areEqual(appLaunchMetric.getHighResolutionOutputSizeshNQ4ISI, jsonString)) {
                        return appLaunchMetric;
                    }
                }
                throw new java.util.NoSuchElementException("Array contains no element matching the predicate.");
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        @kotlin.jvm.JvmStatic
        public static final com.datadog.android.rum.model.VitalAppLaunchEvent.AppLaunchMetric fromJson(java.lang.String str) {
            return INSTANCE.fromJson(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0001\u0018\u0000 \f2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u000b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nj\u0002\b\rj\u0002\b\u000e"}, d2 = {"Lcom/datadog/android/rum/model/VitalAppLaunchEvent$StartupType;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Lcom/google/gson/JsonElement;", "toJson", "()Lcom/google/gson/JsonElement;", "getHighSpeedVideoFpsRangesFor", "Ljava/lang/String;", "Camera2StreamConfigurationMap", "Companion", "COLD_START", "WARM_START"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public enum StartupType {
        COLD_START("cold_start"),
        WARM_START("warm_start");


        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.datadog.android.rum.model.VitalAppLaunchEvent.StartupType.Companion INSTANCE = new com.datadog.android.rum.model.VitalAppLaunchEvent.StartupType.Companion(null);

        /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
        private final java.lang.String Camera2StreamConfigurationMap;

        StartupType(java.lang.String str) {
            this.Camera2StreamConfigurationMap = str;
        }

        public final com.google.gson.JsonElement toJson() {
            return new com.google.gson.JsonPrimitive(this.Camera2StreamConfigurationMap);
        }

        @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/datadog/android/rum/model/VitalAppLaunchEvent$StartupType$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/rum/model/VitalAppLaunchEvent$StartupType;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/rum/model/VitalAppLaunchEvent$StartupType;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @kotlin.jvm.JvmStatic
            public final com.datadog.android.rum.model.VitalAppLaunchEvent.StartupType fromJson(java.lang.String jsonString) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonString, "");
                for (com.datadog.android.rum.model.VitalAppLaunchEvent.StartupType startupType : com.datadog.android.rum.model.VitalAppLaunchEvent.StartupType.values()) {
                    if (kotlin.jvm.internal.Intrinsics.areEqual(startupType.Camera2StreamConfigurationMap, jsonString)) {
                        return startupType;
                    }
                }
                throw new java.util.NoSuchElementException("Array contains no element matching the predicate.");
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        @kotlin.jvm.JvmStatic
        public static final com.datadog.android.rum.model.VitalAppLaunchEvent.StartupType fromJson(java.lang.String str) {
            return INSTANCE.fromJson(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u0004\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0001\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nj\u0002\b\fj\u0002\b\r"}, d2 = {"Lcom/datadog/android/rum/model/VitalAppLaunchEvent$Plan;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/Number;)V", "Lcom/google/gson/JsonElement;", "toJson", "()Lcom/google/gson/JsonElement;", "getHighSpeedVideoSizes", "Ljava/lang/Number;", "Companion", "PLAN_1", "PLAN_2"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public enum Plan {
        PLAN_1((java.lang.Number) 1),
        PLAN_2((java.lang.Number) 2);


        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.datadog.android.rum.model.VitalAppLaunchEvent.Plan.Companion INSTANCE = new com.datadog.android.rum.model.VitalAppLaunchEvent.Plan.Companion(null);
        private final java.lang.Number getHighSpeedVideoSizes;

        Plan(java.lang.Number number) {
            this.getHighSpeedVideoSizes = number;
        }

        public final com.google.gson.JsonElement toJson() {
            return new com.google.gson.JsonPrimitive(this.getHighSpeedVideoSizes);
        }

        @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/datadog/android/rum/model/VitalAppLaunchEvent$Plan$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/rum/model/VitalAppLaunchEvent$Plan;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/rum/model/VitalAppLaunchEvent$Plan;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @kotlin.jvm.JvmStatic
            public final com.datadog.android.rum.model.VitalAppLaunchEvent.Plan fromJson(java.lang.String jsonString) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonString, "");
                for (com.datadog.android.rum.model.VitalAppLaunchEvent.Plan plan : com.datadog.android.rum.model.VitalAppLaunchEvent.Plan.values()) {
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
        public static final com.datadog.android.rum.model.VitalAppLaunchEvent.Plan fromJson(java.lang.String str) {
            return INSTANCE.fromJson(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\b\u0086\u0001\u0018\u0000 \f2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u000b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013"}, d2 = {"Lcom/datadog/android/rum/model/VitalAppLaunchEvent$SessionPrecondition;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Lcom/google/gson/JsonElement;", "toJson", "()Lcom/google/gson/JsonElement;", "getHighSpeedVideoFpsRangesFor", "Ljava/lang/String;", "getHighSpeedVideoSizes", "Companion", "USER_APP_LAUNCH", "INACTIVITY_TIMEOUT", "MAX_DURATION", "BACKGROUND_LAUNCH", "PREWARM", "FROM_NON_INTERACTIVE_SESSION", "EXPLICIT_STOP"}, k = 1, mv = {1, 8, 0}, xi = 48)
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
        public static final com.datadog.android.rum.model.VitalAppLaunchEvent.SessionPrecondition.Companion INSTANCE = new com.datadog.android.rum.model.VitalAppLaunchEvent.SessionPrecondition.Companion(null);

        /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
        private final java.lang.String getHighSpeedVideoSizes;

        SessionPrecondition(java.lang.String str) {
            this.getHighSpeedVideoSizes = str;
        }

        public final com.google.gson.JsonElement toJson() {
            return new com.google.gson.JsonPrimitive(this.getHighSpeedVideoSizes);
        }

        @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/datadog/android/rum/model/VitalAppLaunchEvent$SessionPrecondition$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/rum/model/VitalAppLaunchEvent$SessionPrecondition;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/rum/model/VitalAppLaunchEvent$SessionPrecondition;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @kotlin.jvm.JvmStatic
            public final com.datadog.android.rum.model.VitalAppLaunchEvent.SessionPrecondition fromJson(java.lang.String jsonString) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonString, "");
                for (com.datadog.android.rum.model.VitalAppLaunchEvent.SessionPrecondition sessionPrecondition : com.datadog.android.rum.model.VitalAppLaunchEvent.SessionPrecondition.values()) {
                    if (kotlin.jvm.internal.Intrinsics.areEqual(sessionPrecondition.getHighSpeedVideoSizes, jsonString)) {
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
        public static final com.datadog.android.rum.model.VitalAppLaunchEvent.SessionPrecondition fromJson(java.lang.String str) {
            return INSTANCE.fromJson(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\u0001\u0018\u0000 \f2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u000b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010"}, d2 = {"Lcom/datadog/android/rum/model/VitalAppLaunchEvent$ProfilingStatus;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Lcom/google/gson/JsonElement;", "toJson", "()Lcom/google/gson/JsonElement;", "getHighSpeedVideoFpsRangesFor", "Ljava/lang/String;", "getHighResolutionOutputSizeshNQ4ISI", "Companion", "STARTING", kotlinx.coroutines.debug.internal.DebugCoroutineInfoImplKt.RUNNING, "STOPPED", "ERROR"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public enum ProfilingStatus {
        STARTING("starting"),
        RUNNING("running"),
        STOPPED("stopped"),
        ERROR("error");


        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.datadog.android.rum.model.VitalAppLaunchEvent.ProfilingStatus.Companion INSTANCE = new com.datadog.android.rum.model.VitalAppLaunchEvent.ProfilingStatus.Companion(null);

        /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
        private final java.lang.String getHighResolutionOutputSizeshNQ4ISI;

        ProfilingStatus(java.lang.String str) {
            this.getHighResolutionOutputSizeshNQ4ISI = str;
        }

        public final com.google.gson.JsonElement toJson() {
            return new com.google.gson.JsonPrimitive(this.getHighResolutionOutputSizeshNQ4ISI);
        }

        @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/datadog/android/rum/model/VitalAppLaunchEvent$ProfilingStatus$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/rum/model/VitalAppLaunchEvent$ProfilingStatus;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/rum/model/VitalAppLaunchEvent$ProfilingStatus;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @kotlin.jvm.JvmStatic
            public final com.datadog.android.rum.model.VitalAppLaunchEvent.ProfilingStatus fromJson(java.lang.String jsonString) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonString, "");
                for (com.datadog.android.rum.model.VitalAppLaunchEvent.ProfilingStatus profilingStatus : com.datadog.android.rum.model.VitalAppLaunchEvent.ProfilingStatus.values()) {
                    if (kotlin.jvm.internal.Intrinsics.areEqual(profilingStatus.getHighResolutionOutputSizeshNQ4ISI, jsonString)) {
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
        public static final com.datadog.android.rum.model.VitalAppLaunchEvent.ProfilingStatus fromJson(java.lang.String str) {
            return INSTANCE.fromJson(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\u0001\u0018\u0000 \f2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u000b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010"}, d2 = {"Lcom/datadog/android/rum/model/VitalAppLaunchEvent$ErrorReason;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Lcom/google/gson/JsonElement;", "toJson", "()Lcom/google/gson/JsonElement;", "Camera2StreamConfigurationMap", "Ljava/lang/String;", "getHighSpeedVideoFpsRangesFor", "Companion", "NOT_SUPPORTED_BY_BROWSER", "FAILED_TO_LAZY_LOAD", "MISSING_DOCUMENT_POLICY_HEADER", "UNEXPECTED_EXCEPTION"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public enum ErrorReason {
        NOT_SUPPORTED_BY_BROWSER("not-supported-by-browser"),
        FAILED_TO_LAZY_LOAD("failed-to-lazy-load"),
        MISSING_DOCUMENT_POLICY_HEADER("missing-document-policy-header"),
        UNEXPECTED_EXCEPTION("unexpected-exception");


        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.datadog.android.rum.model.VitalAppLaunchEvent.ErrorReason.Companion INSTANCE = new com.datadog.android.rum.model.VitalAppLaunchEvent.ErrorReason.Companion(null);

        /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
        private final java.lang.String getHighSpeedVideoFpsRangesFor;

        ErrorReason(java.lang.String str) {
            this.getHighSpeedVideoFpsRangesFor = str;
        }

        public final com.google.gson.JsonElement toJson() {
            return new com.google.gson.JsonPrimitive(this.getHighSpeedVideoFpsRangesFor);
        }

        @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/datadog/android/rum/model/VitalAppLaunchEvent$ErrorReason$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/rum/model/VitalAppLaunchEvent$ErrorReason;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/rum/model/VitalAppLaunchEvent$ErrorReason;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @kotlin.jvm.JvmStatic
            public final com.datadog.android.rum.model.VitalAppLaunchEvent.ErrorReason fromJson(java.lang.String jsonString) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonString, "");
                for (com.datadog.android.rum.model.VitalAppLaunchEvent.ErrorReason errorReason : com.datadog.android.rum.model.VitalAppLaunchEvent.ErrorReason.values()) {
                    if (kotlin.jvm.internal.Intrinsics.areEqual(errorReason.getHighSpeedVideoFpsRangesFor, jsonString)) {
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
        public static final com.datadog.android.rum.model.VitalAppLaunchEvent.ErrorReason fromJson(java.lang.String str) {
            return INSTANCE.fromJson(str);
        }
    }

    public final java.lang.String toString() {
        long j = this.date;
        com.datadog.android.rum.model.VitalAppLaunchEvent.Application application = this.application;
        java.lang.String str = this.service;
        java.lang.String str2 = this.version;
        java.lang.String str3 = this.buildVersion;
        java.lang.String str4 = this.buildId;
        java.lang.String str5 = this.ddtags;
        com.datadog.android.rum.model.VitalAppLaunchEvent.VitalAppLaunchEventSession vitalAppLaunchEventSession = this.session;
        com.datadog.android.rum.model.VitalAppLaunchEvent.VitalAppLaunchEventSource vitalAppLaunchEventSource = this.source;
        com.datadog.android.rum.model.VitalAppLaunchEvent.VitalAppLaunchEventView vitalAppLaunchEventView = this.view;
        com.datadog.android.rum.model.VitalAppLaunchEvent.Usr usr = this.usr;
        com.datadog.android.rum.model.VitalAppLaunchEvent.Account account = this.account;
        com.datadog.android.rum.model.VitalAppLaunchEvent.Connectivity connectivity = this.connectivity;
        com.datadog.android.rum.model.VitalAppLaunchEvent.Display display = this.display;
        com.datadog.android.rum.model.VitalAppLaunchEvent.Synthetics synthetics = this.synthetics;
        com.datadog.android.rum.model.VitalAppLaunchEvent.CiTest ciTest = this.ciTest;
        com.datadog.android.rum.model.VitalAppLaunchEvent.Os os = this.os;
        com.datadog.android.rum.model.VitalAppLaunchEvent.Device device = this.device;
        com.datadog.android.rum.model.VitalAppLaunchEvent.Dd dd = this.dd;
        com.datadog.android.rum.model.VitalAppLaunchEvent.Context context = this.context;
        com.datadog.android.rum.model.VitalAppLaunchEvent.Container container = this.container;
        com.datadog.android.rum.model.VitalAppLaunchEvent.Vital vital = this.vital;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("VitalAppLaunchEvent(date=");
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
        sb.append(vitalAppLaunchEventSession);
        sb.append(", source=");
        sb.append(vitalAppLaunchEventSource);
        sb.append(", view=");
        sb.append(vitalAppLaunchEventView);
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
        sb.append(", vital=");
        sb.append(vital);
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
        com.datadog.android.rum.model.VitalAppLaunchEvent.VitalAppLaunchEventSource vitalAppLaunchEventSource = this.source;
        int hashCode9 = vitalAppLaunchEventSource == null ? 0 : vitalAppLaunchEventSource.hashCode();
        int hashCode10 = this.view.hashCode();
        com.datadog.android.rum.model.VitalAppLaunchEvent.Usr usr = this.usr;
        int hashCode11 = usr == null ? 0 : usr.hashCode();
        com.datadog.android.rum.model.VitalAppLaunchEvent.Account account = this.account;
        int hashCode12 = account == null ? 0 : account.hashCode();
        com.datadog.android.rum.model.VitalAppLaunchEvent.Connectivity connectivity = this.connectivity;
        int hashCode13 = connectivity == null ? 0 : connectivity.hashCode();
        com.datadog.android.rum.model.VitalAppLaunchEvent.Display display = this.display;
        int hashCode14 = display == null ? 0 : display.hashCode();
        com.datadog.android.rum.model.VitalAppLaunchEvent.Synthetics synthetics = this.synthetics;
        int hashCode15 = synthetics == null ? 0 : synthetics.hashCode();
        com.datadog.android.rum.model.VitalAppLaunchEvent.CiTest ciTest = this.ciTest;
        int hashCode16 = ciTest == null ? 0 : ciTest.hashCode();
        com.datadog.android.rum.model.VitalAppLaunchEvent.Os os = this.os;
        int hashCode17 = os == null ? 0 : os.hashCode();
        com.datadog.android.rum.model.VitalAppLaunchEvent.Device device = this.device;
        int hashCode18 = device == null ? 0 : device.hashCode();
        int hashCode19 = this.dd.hashCode();
        com.datadog.android.rum.model.VitalAppLaunchEvent.Context context = this.context;
        int hashCode20 = context == null ? 0 : context.hashCode();
        com.datadog.android.rum.model.VitalAppLaunchEvent.Container container = this.container;
        return (((((((((((((((((((((((((((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + hashCode10) * 31) + hashCode11) * 31) + hashCode12) * 31) + hashCode13) * 31) + hashCode14) * 31) + hashCode15) * 31) + hashCode16) * 31) + hashCode17) * 31) + hashCode18) * 31) + hashCode19) * 31) + hashCode20) * 31) + (container != null ? container.hashCode() : 0)) * 31) + this.vital.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.datadog.android.rum.model.VitalAppLaunchEvent)) {
            return false;
        }
        com.datadog.android.rum.model.VitalAppLaunchEvent vitalAppLaunchEvent = (com.datadog.android.rum.model.VitalAppLaunchEvent) other;
        return this.date == vitalAppLaunchEvent.date && kotlin.jvm.internal.Intrinsics.areEqual(this.application, vitalAppLaunchEvent.application) && kotlin.jvm.internal.Intrinsics.areEqual(this.service, vitalAppLaunchEvent.service) && kotlin.jvm.internal.Intrinsics.areEqual(this.version, vitalAppLaunchEvent.version) && kotlin.jvm.internal.Intrinsics.areEqual(this.buildVersion, vitalAppLaunchEvent.buildVersion) && kotlin.jvm.internal.Intrinsics.areEqual(this.buildId, vitalAppLaunchEvent.buildId) && kotlin.jvm.internal.Intrinsics.areEqual(this.ddtags, vitalAppLaunchEvent.ddtags) && kotlin.jvm.internal.Intrinsics.areEqual(this.session, vitalAppLaunchEvent.session) && this.source == vitalAppLaunchEvent.source && kotlin.jvm.internal.Intrinsics.areEqual(this.view, vitalAppLaunchEvent.view) && kotlin.jvm.internal.Intrinsics.areEqual(this.usr, vitalAppLaunchEvent.usr) && kotlin.jvm.internal.Intrinsics.areEqual(this.account, vitalAppLaunchEvent.account) && kotlin.jvm.internal.Intrinsics.areEqual(this.connectivity, vitalAppLaunchEvent.connectivity) && kotlin.jvm.internal.Intrinsics.areEqual(this.display, vitalAppLaunchEvent.display) && kotlin.jvm.internal.Intrinsics.areEqual(this.synthetics, vitalAppLaunchEvent.synthetics) && kotlin.jvm.internal.Intrinsics.areEqual(this.ciTest, vitalAppLaunchEvent.ciTest) && kotlin.jvm.internal.Intrinsics.areEqual(this.os, vitalAppLaunchEvent.os) && kotlin.jvm.internal.Intrinsics.areEqual(this.device, vitalAppLaunchEvent.device) && kotlin.jvm.internal.Intrinsics.areEqual(this.dd, vitalAppLaunchEvent.dd) && kotlin.jvm.internal.Intrinsics.areEqual(this.context, vitalAppLaunchEvent.context) && kotlin.jvm.internal.Intrinsics.areEqual(this.container, vitalAppLaunchEvent.container) && kotlin.jvm.internal.Intrinsics.areEqual(this.vital, vitalAppLaunchEvent.vital);
    }

    public final com.datadog.android.rum.model.VitalAppLaunchEvent copy(long date, com.datadog.android.rum.model.VitalAppLaunchEvent.Application application, java.lang.String service, java.lang.String version, java.lang.String buildVersion, java.lang.String buildId, java.lang.String ddtags, com.datadog.android.rum.model.VitalAppLaunchEvent.VitalAppLaunchEventSession session, com.datadog.android.rum.model.VitalAppLaunchEvent.VitalAppLaunchEventSource source, com.datadog.android.rum.model.VitalAppLaunchEvent.VitalAppLaunchEventView view, com.datadog.android.rum.model.VitalAppLaunchEvent.Usr usr, com.datadog.android.rum.model.VitalAppLaunchEvent.Account account, com.datadog.android.rum.model.VitalAppLaunchEvent.Connectivity connectivity, com.datadog.android.rum.model.VitalAppLaunchEvent.Display display, com.datadog.android.rum.model.VitalAppLaunchEvent.Synthetics synthetics, com.datadog.android.rum.model.VitalAppLaunchEvent.CiTest ciTest, com.datadog.android.rum.model.VitalAppLaunchEvent.Os os, com.datadog.android.rum.model.VitalAppLaunchEvent.Device device, com.datadog.android.rum.model.VitalAppLaunchEvent.Dd dd, com.datadog.android.rum.model.VitalAppLaunchEvent.Context context, com.datadog.android.rum.model.VitalAppLaunchEvent.Container container, com.datadog.android.rum.model.VitalAppLaunchEvent.Vital vital) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(application, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(session, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dd, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(vital, "");
        return new com.datadog.android.rum.model.VitalAppLaunchEvent(date, application, service, version, buildVersion, buildId, ddtags, session, source, view, usr, account, connectivity, display, synthetics, ciTest, os, device, dd, context, container, vital);
    }

    /* renamed from: component9, reason: from getter */
    public final com.datadog.android.rum.model.VitalAppLaunchEvent.VitalAppLaunchEventSource getSource() {
        return this.source;
    }

    /* renamed from: component8, reason: from getter */
    public final com.datadog.android.rum.model.VitalAppLaunchEvent.VitalAppLaunchEventSession getSession() {
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

    /* renamed from: component22, reason: from getter */
    public final com.datadog.android.rum.model.VitalAppLaunchEvent.Vital getVital() {
        return this.vital;
    }

    /* renamed from: component21, reason: from getter */
    public final com.datadog.android.rum.model.VitalAppLaunchEvent.Container getContainer() {
        return this.container;
    }

    /* renamed from: component20, reason: from getter */
    public final com.datadog.android.rum.model.VitalAppLaunchEvent.Context getContext() {
        return this.context;
    }

    /* renamed from: component2, reason: from getter */
    public final com.datadog.android.rum.model.VitalAppLaunchEvent.Application getApplication() {
        return this.application;
    }

    /* renamed from: component19, reason: from getter */
    public final com.datadog.android.rum.model.VitalAppLaunchEvent.Dd getDd() {
        return this.dd;
    }

    /* renamed from: component18, reason: from getter */
    public final com.datadog.android.rum.model.VitalAppLaunchEvent.Device getDevice() {
        return this.device;
    }

    /* renamed from: component17, reason: from getter */
    public final com.datadog.android.rum.model.VitalAppLaunchEvent.Os getOs() {
        return this.os;
    }

    /* renamed from: component16, reason: from getter */
    public final com.datadog.android.rum.model.VitalAppLaunchEvent.CiTest getCiTest() {
        return this.ciTest;
    }

    /* renamed from: component15, reason: from getter */
    public final com.datadog.android.rum.model.VitalAppLaunchEvent.Synthetics getSynthetics() {
        return this.synthetics;
    }

    /* renamed from: component14, reason: from getter */
    public final com.datadog.android.rum.model.VitalAppLaunchEvent.Display getDisplay() {
        return this.display;
    }

    /* renamed from: component13, reason: from getter */
    public final com.datadog.android.rum.model.VitalAppLaunchEvent.Connectivity getConnectivity() {
        return this.connectivity;
    }

    /* renamed from: component12, reason: from getter */
    public final com.datadog.android.rum.model.VitalAppLaunchEvent.Account getAccount() {
        return this.account;
    }

    /* renamed from: component11, reason: from getter */
    public final com.datadog.android.rum.model.VitalAppLaunchEvent.Usr getUsr() {
        return this.usr;
    }

    /* renamed from: component10, reason: from getter */
    public final com.datadog.android.rum.model.VitalAppLaunchEvent.VitalAppLaunchEventView getView() {
        return this.view;
    }

    /* renamed from: component1, reason: from getter */
    public final long getDate() {
        return this.date;
    }

    @kotlin.jvm.JvmStatic
    public static final com.datadog.android.rum.model.VitalAppLaunchEvent fromJsonObject(com.google.gson.JsonObject jsonObject) throws com.google.gson.JsonParseException {
        return INSTANCE.fromJsonObject(jsonObject);
    }

    @kotlin.jvm.JvmStatic
    public static final com.datadog.android.rum.model.VitalAppLaunchEvent fromJson(java.lang.String str) throws com.google.gson.JsonParseException {
        return INSTANCE.fromJson(str);
    }
}
