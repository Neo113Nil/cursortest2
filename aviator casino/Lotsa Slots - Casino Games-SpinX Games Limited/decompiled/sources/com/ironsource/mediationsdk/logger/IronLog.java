package com.ironsource.mediationsdk.logger;

/* loaded from: classes5.dex */
public enum IronLog {
    API(com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API),
    CALLBACK(com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.CALLBACK),
    ADAPTER_API(com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.ADAPTER_API),
    ADAPTER_CALLBACK(com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.ADAPTER_CALLBACK),
    NETWORK(com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.NETWORK),
    INTERNAL(com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.INTERNAL),
    NATIVE(com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.NATIVE),
    EVENT(com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.EVENT);


    /* renamed from: a, reason: collision with root package name */
    com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag f6443a;

    IronLog(com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag ironSourceTag) {
        this.f6443a = ironSourceTag;
    }

    public void error(java.lang.String str, java.lang.Throwable th) {
        com.ironsource.mediationsdk.logger.IronSourceLoggerManager.getLogger().a(this.f6443a, new com.ironsource.C3044fb(str, 3), th);
    }

    public void general(java.lang.String str) {
        com.ironsource.mediationsdk.logger.IronSourceLoggerManager.getLogger().a(this.f6443a, new com.ironsource.C3044fb(str, 4));
    }

    public void info(java.lang.String str) {
        com.ironsource.mediationsdk.logger.IronSourceLoggerManager.getLogger().a(this.f6443a, new com.ironsource.C3044fb(str, 1));
    }

    public void verbose(java.lang.String str) {
        com.ironsource.mediationsdk.logger.IronSourceLoggerManager.getLogger().a(this.f6443a, new com.ironsource.C3044fb(str, 0));
    }

    public void warning(java.lang.String str) {
        com.ironsource.mediationsdk.logger.IronSourceLoggerManager.getLogger().a(this.f6443a, new com.ironsource.C3044fb(str, 2));
    }

    public void error(java.lang.String str) {
        com.ironsource.mediationsdk.logger.IronSourceLoggerManager.getLogger().a(this.f6443a, new com.ironsource.C3044fb(str, 3));
    }

    public void general() {
        com.ironsource.mediationsdk.logger.IronSourceLoggerManager.getLogger().a(this.f6443a, new com.ironsource.C3044fb("", 4));
    }

    public void info() {
        com.ironsource.mediationsdk.logger.IronSourceLoggerManager.getLogger().a(this.f6443a, new com.ironsource.C3044fb("", 1));
    }

    public void verbose() {
        com.ironsource.mediationsdk.logger.IronSourceLoggerManager.getLogger().a(this.f6443a, new com.ironsource.C3044fb("", 0));
    }

    public void warning() {
        com.ironsource.mediationsdk.logger.IronSourceLoggerManager.getLogger().a(this.f6443a, new com.ironsource.C3044fb("", 2));
    }

    public void error() {
        com.ironsource.mediationsdk.logger.IronSourceLoggerManager.getLogger().a(this.f6443a, new com.ironsource.C3044fb("", 3));
    }
}
