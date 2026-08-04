package com.pichillilorenzo.flutter_inappwebview_android.types;

import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import p150v0.a;

/* JADX INFO: loaded from: classes2.dex */
public class UserScript {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private Set<String> allowedOriginRules;
    private ContentWorld contentWorld;
    private boolean forMainFrameOnly;
    private String groupName;
    private UserScriptInjectionTime injectionTime;
    private String source;

    public UserScript(String str, String str2, UserScriptInjectionTime userScriptInjectionTime, ContentWorld contentWorld, Set<String> set, boolean z4) {
        this.allowedOriginRules = new HashSet();
        this.forMainFrameOnly = true;
        this.groupName = str;
        this.source = str2;
        this.injectionTime = userScriptInjectionTime;
        this.contentWorld = contentWorld == null ? ContentWorld.PAGE : contentWorld;
        this.allowedOriginRules = set == null ? new HashSet<String>() { // from class: com.pichillilorenzo.flutter_inappwebview_android.types.UserScript.1
            {
                add("*");
            }
        } : set;
        this.forMainFrameOnly = z4;
    }

    public static UserScript fromMap(Map<String, Object> map) {
        if (map == null) {
            return null;
        }
        return new UserScript((String) map.get("groupName"), (String) map.get("source"), UserScriptInjectionTime.fromValue(((Integer) map.get("injectionTime")).intValue()), ContentWorld.fromMap((Map) map.get("contentWorld")), new HashSet((List) map.get("allowedOriginRules")), ((Boolean) map.get("forMainFrameOnly")).booleanValue());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UserScript userScript = (UserScript) obj;
        return this.forMainFrameOnly == userScript.forMainFrameOnly && Objects.equals(this.groupName, userScript.groupName) && this.source.equals(userScript.source) && this.injectionTime == userScript.injectionTime && this.contentWorld.equals(userScript.contentWorld) && this.allowedOriginRules.equals(userScript.allowedOriginRules);
    }

    public Set<String> getAllowedOriginRules() {
        return this.allowedOriginRules;
    }

    public ContentWorld getContentWorld() {
        return this.contentWorld;
    }

    public String getGroupName() {
        return this.groupName;
    }

    public UserScriptInjectionTime getInjectionTime() {
        return this.injectionTime;
    }

    public String getSource() {
        return this.source;
    }

    public int hashCode() {
        return Boolean.hashCode(this.forMainFrameOnly) + ((this.allowedOriginRules.hashCode() + ((this.contentWorld.hashCode() + ((this.injectionTime.hashCode() + a.d(Objects.hashCode(this.groupName) * 31, 31, this.source)) * 31)) * 31)) * 31);
    }

    public boolean isForMainFrameOnly() {
        return this.forMainFrameOnly;
    }

    public void setAllowedOriginRules(Set<String> set) {
        this.allowedOriginRules = set;
    }

    public void setContentWorld(ContentWorld contentWorld) {
        if (contentWorld == null) {
            contentWorld = ContentWorld.PAGE;
        }
        this.contentWorld = contentWorld;
    }

    public void setForMainFrameOnly(boolean z4) {
        this.forMainFrameOnly = z4;
    }

    public void setGroupName(String str) {
        this.groupName = str;
    }

    public void setInjectionTime(UserScriptInjectionTime userScriptInjectionTime) {
        this.injectionTime = userScriptInjectionTime;
    }

    public void setSource(String str) {
        this.source = str;
    }

    public String toString() {
        return "UserScript{groupName='" + this.groupName + "', source='" + this.source + "', injectionTime=" + this.injectionTime + ", contentWorld=" + this.contentWorld + ", allowedOriginRules=" + this.allowedOriginRules + ", forMainFrameOnly=" + this.forMainFrameOnly + '}';
    }
}
