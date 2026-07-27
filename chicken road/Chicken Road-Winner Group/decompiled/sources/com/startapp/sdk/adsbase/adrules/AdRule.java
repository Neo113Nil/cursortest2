package com.startapp.sdk.adsbase.adrules;

import com.startapp.json.TypeClassInfo;
import java.io.Serializable;
import java.util.List;

@TypeClassInfo(decider = "type", inheritClasses = {FreqCapRule.class, ProbabilityRule.class}, packageName = "com.startapp.sdk.adsbase.adrules")
/* loaded from: classes.dex */
public abstract class AdRule implements Serializable {
    private static final long serialVersionUID = 7934302502238649788L;
    private transient boolean shouldProcessEntireHierarchy;

    public AdRule(boolean z3) {
        this.shouldProcessEntireHierarchy = z3;
    }

    public final boolean a() {
        return this.shouldProcessEntireHierarchy;
    }

    public abstract boolean a(List list);
}
