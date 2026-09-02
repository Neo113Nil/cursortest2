package com.goldenboot.saga.zone;

import kotlin.jvm.internal.FunctionBase;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
/* loaded from: classes2.dex */
public abstract class EmbeddedEdge extends PrimaryArbitrator implements FunctionBase {
    private final int reduceScope;

    public EmbeddedEdge(int i, ServiceRegulator serviceRegulator) {
        super(serviceRegulator);
        this.reduceScope = i;
    }

    @Override // kotlin.jvm.internal.FunctionBase
    public int getArity() {
        return this.reduceScope;
    }

    @Override // com.goldenboot.saga.zone.ConfigValidator
    public String toString() {
        if (getCompletion() != null) {
            return super.toString();
        }
        String renderLambdaToString = Reflection.renderLambdaToString(this);
        Intrinsics.checkNotNullExpressionValue(renderLambdaToString, "renderLambdaToString(...)");
        return renderLambdaToString;
    }
}
