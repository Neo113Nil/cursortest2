package org.slf4j.helpers;

/* loaded from: classes18.dex */
public class NOPLoggerFactory implements org.slf4j.ILoggerFactory {
    @Override // org.slf4j.ILoggerFactory
    public org.slf4j.Logger getLogger(java.lang.String str) {
        return org.slf4j.helpers.NOPLogger.NOP_LOGGER;
    }
}
