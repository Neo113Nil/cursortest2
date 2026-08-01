package com.ironsource.mediationsdk.logger;

import com.ironsource.C4373db;
import com.ironsource.mediationsdk.logger.IronSourceLogger;

/* loaded from: classes6.dex */
public enum IronLog {
    API(IronSourceLogger.IronSourceTag.API),
    CALLBACK(IronSourceLogger.IronSourceTag.CALLBACK),
    ADAPTER_API(IronSourceLogger.IronSourceTag.ADAPTER_API),
    ADAPTER_CALLBACK(IronSourceLogger.IronSourceTag.ADAPTER_CALLBACK),
    NETWORK(IronSourceLogger.IronSourceTag.NETWORK),
    INTERNAL(IronSourceLogger.IronSourceTag.INTERNAL),
    NATIVE(IronSourceLogger.IronSourceTag.NATIVE),
    EVENT(IronSourceLogger.IronSourceTag.EVENT);


    /* renamed from: a, reason: collision with root package name */
    IronSourceLogger.IronSourceTag f8415a;

    IronLog(IronSourceLogger.IronSourceTag ironSourceTag) {
        this.f8415a = ironSourceTag;
    }

    public void error(String str, Throwable th) {
        IronSourceLoggerManager.getLogger().a(this.f8415a, new C4373db(str, 3), th);
    }

    public void general(String str) {
        IronSourceLoggerManager.getLogger().a(this.f8415a, new C4373db(str, 4));
    }

    public void info(String str) {
        IronSourceLoggerManager.getLogger().a(this.f8415a, new C4373db(str, 1));
    }

    public void verbose(String str) {
        IronSourceLoggerManager.getLogger().a(this.f8415a, new C4373db(str, 0));
    }

    public void warning(String str) {
        IronSourceLoggerManager.getLogger().a(this.f8415a, new C4373db(str, 2));
    }

    public void error(String str) {
        IronSourceLoggerManager.getLogger().a(this.f8415a, new C4373db(str, 3));
    }

    public void general() {
        IronSourceLoggerManager.getLogger().a(this.f8415a, new C4373db("", 4));
    }

    public void info() {
        IronSourceLoggerManager.getLogger().a(this.f8415a, new C4373db("", 1));
    }

    public void verbose() {
        IronSourceLoggerManager.getLogger().a(this.f8415a, new C4373db("", 0));
    }

    public void warning() {
        IronSourceLoggerManager.getLogger().a(this.f8415a, new C4373db("", 2));
    }

    public void error() {
        IronSourceLoggerManager.getLogger().a(this.f8415a, new C4373db("", 3));
    }
}
