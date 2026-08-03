package com.helpshift.proactive;

/* loaded from: classes5.dex */
public class ProactiveActionEntity {
    public final com.helpshift.proactive.ProactiveActions action;
    public final java.lang.String actionConfigJSON;
    public final java.lang.String actionValue;
    public final int priority;

    public ProactiveActionEntity(com.helpshift.proactive.ProactiveActions proactiveActions, java.lang.String str, java.lang.String str2, int i) {
        this.action = proactiveActions;
        this.actionConfigJSON = str;
        this.actionValue = str2;
        this.priority = i;
    }
}
