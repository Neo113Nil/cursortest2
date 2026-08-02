package com.visa.cbp.external.common;

/* loaded from: classes5.dex */
public class HceData {

    @com.visa.cbp.external.common.NullValueValidate
    private com.visa.cbp.external.common.DynParams dynParams;

    @com.visa.cbp.external.common.NullValueValidate
    private com.visa.cbp.external.common.StaticParams staticParams;

    public com.visa.cbp.external.common.DynParams getDynParams() {
        return this.dynParams;
    }

    public void setDynParams(com.visa.cbp.external.common.DynParams dynParams) {
        this.dynParams = dynParams;
    }

    public com.visa.cbp.external.common.StaticParams getStaticParams() {
        return this.staticParams;
    }

    public void setStaticParams(com.visa.cbp.external.common.StaticParams staticParams) {
        this.staticParams = staticParams;
    }
}
