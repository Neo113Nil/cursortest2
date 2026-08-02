package com.plaid.internal.core.protos.link.workflow.nodes.panes;

/* loaded from: classes16.dex */
public final class ChallengePaneOuterClass$ChallengePane extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass$ChallengePane, com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass$ChallengePane.a> implements com.google.protobuf.MessageLiteOrBuilder {
    private static final com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass$ChallengePane DEFAULT_INSTANCE;
    private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass$ChallengePane> PARSER;

    public static final class Actions extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass$ChallengePane.Actions, com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass.ChallengePane.Actions.b> implements com.google.protobuf.MessageLiteOrBuilder {
        private static final com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass$ChallengePane.Actions DEFAULT_INSTANCE;
        public static final int EXIT_FIELD_NUMBER = 2;
        private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass$ChallengePane.Actions> PARSER = null;
        public static final int SUBMIT_FIELD_NUMBER = 1;
        private int actionCase_ = 0;
        private java.lang.Object action_;

        public static final class ExitAction extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass.ChallengePane.Actions.ExitAction, com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass.ChallengePane.Actions.ExitAction.a> implements com.google.protobuf.MessageLiteOrBuilder {
            private static final com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass.ChallengePane.Actions.ExitAction DEFAULT_INSTANCE;
            private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass.ChallengePane.Actions.ExitAction> PARSER;

            public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass.ChallengePane.Actions.ExitAction, com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass.ChallengePane.Actions.ExitAction.a> implements com.google.protobuf.MessageLiteOrBuilder {
                public a() {
                    super(com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass.ChallengePane.Actions.ExitAction.DEFAULT_INSTANCE);
                }
            }

            static {
                com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass.ChallengePane.Actions.ExitAction exitAction = new com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass.ChallengePane.Actions.ExitAction();
                DEFAULT_INSTANCE = exitAction;
                com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass.ChallengePane.Actions.ExitAction.class, exitAction);
            }

            private ExitAction() {
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass.ChallengePane.Actions.ExitAction getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass.ChallengePane.Actions.ExitAction.a newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass.ChallengePane.Actions.ExitAction parseDelimitedFrom(java.io.InputStream inputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass.ChallengePane.Actions.ExitAction) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass.ChallengePane.Actions.ExitAction parseFrom(java.nio.ByteBuffer byteBuffer) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass.ChallengePane.Actions.ExitAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass.ChallengePane.Actions.ExitAction> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
                com.google.protobuf.Parser parser;
                switch (com.plaid.internal.core.protos.link.workflow.nodes.panes.C0482h.f6301a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass.ChallengePane.Actions.ExitAction();
                    case 2:
                        return new com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass.ChallengePane.Actions.ExitAction.a();
                    case 3:
                        return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", null);
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass.ChallengePane.Actions.ExitAction> parser2 = PARSER;
                        if (parser2 != null) {
                            return parser2;
                        }
                        synchronized (com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass.ChallengePane.Actions.ExitAction.class) {
                            parser = PARSER;
                            if (parser == null) {
                                parser = new com.google.protobuf.GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                                PARSER = parser;
                            }
                        }
                        return parser;
                    case 6:
                        return (byte) 1;
                    case 7:
                        return null;
                    default:
                        throw new java.lang.UnsupportedOperationException();
                }
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass.ChallengePane.Actions.ExitAction.a newBuilder(com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass.ChallengePane.Actions.ExitAction exitAction) {
                return DEFAULT_INSTANCE.createBuilder(exitAction);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass.ChallengePane.Actions.ExitAction parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass.ChallengePane.Actions.ExitAction) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass.ChallengePane.Actions.ExitAction parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass.ChallengePane.Actions.ExitAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass.ChallengePane.Actions.ExitAction parseFrom(com.google.protobuf.ByteString byteString) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass.ChallengePane.Actions.ExitAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass.ChallengePane.Actions.ExitAction parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass.ChallengePane.Actions.ExitAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass.ChallengePane.Actions.ExitAction parseFrom(byte[] bArr) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass.ChallengePane.Actions.ExitAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass.ChallengePane.Actions.ExitAction parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass.ChallengePane.Actions.ExitAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass.ChallengePane.Actions.ExitAction parseFrom(java.io.InputStream inputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass.ChallengePane.Actions.ExitAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass.ChallengePane.Actions.ExitAction parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass.ChallengePane.Actions.ExitAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass.ChallengePane.Actions.ExitAction parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass.ChallengePane.Actions.ExitAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass.ChallengePane.Actions.ExitAction parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass.ChallengePane.Actions.ExitAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        public static final class SubmitAction extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass.ChallengePane.Actions.SubmitAction, com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass.ChallengePane.Actions.SubmitAction.a> implements com.google.protobuf.MessageLiteOrBuilder {
            public static final int CHALLENGE_RESPONSE_FIELD_NUMBER = 1;
            private static final com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass.ChallengePane.Actions.SubmitAction DEFAULT_INSTANCE;
            private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass.ChallengePane.Actions.SubmitAction> PARSER;
            private java.lang.String challengeResponse_ = "";

            public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass.ChallengePane.Actions.SubmitAction, com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass.ChallengePane.Actions.SubmitAction.a> implements com.google.protobuf.MessageLiteOrBuilder {
                public a() {
                    super(com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass.ChallengePane.Actions.SubmitAction.DEFAULT_INSTANCE);
                }
            }

            static {
                com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass.ChallengePane.Actions.SubmitAction submitAction = new com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass.ChallengePane.Actions.SubmitAction();
                DEFAULT_INSTANCE = submitAction;
                com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass.ChallengePane.Actions.SubmitAction.class, submitAction);
            }

            private SubmitAction() {
            }

            private void clearChallengeResponse() {
                this.challengeResponse_ = getDefaultInstance().getChallengeResponse();
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass.ChallengePane.Actions.SubmitAction getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass.ChallengePane.Actions.SubmitAction.a newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass.ChallengePane.Actions.SubmitAction parseDelimitedFrom(java.io.InputStream inputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass.ChallengePane.Actions.SubmitAction) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass.ChallengePane.Actions.SubmitAction parseFrom(java.nio.ByteBuffer byteBuffer) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass.ChallengePane.Actions.SubmitAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass.ChallengePane.Actions.SubmitAction> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            private void setChallengeResponseBytes(com.google.protobuf.ByteString byteString) {
                com.google.protobuf.GeneratedMessageLite.checkByteStringIsUtf8(byteString);
                this.challengeResponse_ = byteString.toStringUtf8();
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
                com.google.protobuf.Parser parser;
                switch (com.plaid.internal.core.protos.link.workflow.nodes.panes.C0482h.f6301a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass.ChallengePane.Actions.SubmitAction();
                    case 2:
                        return new com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass.ChallengePane.Actions.SubmitAction.a();
                    case 3:
                        return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new java.lang.Object[]{"challengeResponse_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass.ChallengePane.Actions.SubmitAction> parser2 = PARSER;
                        if (parser2 != null) {
                            return parser2;
                        }
                        synchronized (com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass.ChallengePane.Actions.SubmitAction.class) {
                            parser = PARSER;
                            if (parser == null) {
                                parser = new com.google.protobuf.GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                                PARSER = parser;
                            }
                        }
                        return parser;
                    case 6:
                        return (byte) 1;
                    case 7:
                        return null;
                    default:
                        throw new java.lang.UnsupportedOperationException();
                }
            }

            public final java.lang.String getChallengeResponse() {
                return this.challengeResponse_;
            }

            public final com.google.protobuf.ByteString getChallengeResponseBytes() {
                return com.google.protobuf.ByteString.copyFromUtf8(this.challengeResponse_);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass.ChallengePane.Actions.SubmitAction.a newBuilder(com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass.ChallengePane.Actions.SubmitAction submitAction) {
                return DEFAULT_INSTANCE.createBuilder(submitAction);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass.ChallengePane.Actions.SubmitAction parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass.ChallengePane.Actions.SubmitAction) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass.ChallengePane.Actions.SubmitAction parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass.ChallengePane.Actions.SubmitAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass.ChallengePane.Actions.SubmitAction parseFrom(com.google.protobuf.ByteString byteString) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass.ChallengePane.Actions.SubmitAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            private void setChallengeResponse(java.lang.String str) {
                this.challengeResponse_ = str;
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass.ChallengePane.Actions.SubmitAction parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass.ChallengePane.Actions.SubmitAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass.ChallengePane.Actions.SubmitAction parseFrom(byte[] bArr) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass.ChallengePane.Actions.SubmitAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass.ChallengePane.Actions.SubmitAction parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass.ChallengePane.Actions.SubmitAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass.ChallengePane.Actions.SubmitAction parseFrom(java.io.InputStream inputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass.ChallengePane.Actions.SubmitAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass.ChallengePane.Actions.SubmitAction parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass.ChallengePane.Actions.SubmitAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass.ChallengePane.Actions.SubmitAction parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass.ChallengePane.Actions.SubmitAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass.ChallengePane.Actions.SubmitAction parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass.ChallengePane.Actions.SubmitAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        public enum a {
            SUBMIT(1),
            EXIT(2),
            ACTION_NOT_SET(0);


            /* renamed from: a, reason: collision with root package name */
            public final int f6105a;

            a(int i) {
                this.f6105a = i;
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass.ChallengePane.Actions.a forNumber(int i) {
                if (i == 0) {
                    return ACTION_NOT_SET;
                }
                if (i == 1) {
                    return SUBMIT;
                }
                if (i != 2) {
                    return null;
                }
                return EXIT;
            }

            public final int getNumber() {
                return this.f6105a;
            }

            @java.lang.Deprecated
            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass.ChallengePane.Actions.a valueOf(int i) {
                return forNumber(i);
            }
        }

        public static final class b extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass$ChallengePane.Actions, com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass.ChallengePane.Actions.b> implements com.google.protobuf.MessageLiteOrBuilder {
            public b() {
                super(com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass$ChallengePane.Actions.DEFAULT_INSTANCE);
            }
        }

        static {
            com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass$ChallengePane.Actions actions = new com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass$ChallengePane.Actions();
            DEFAULT_INSTANCE = actions;
            com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass$ChallengePane.Actions.class, actions);
        }

        private Actions() {
        }

        private void clearAction() {
            this.actionCase_ = 0;
            this.action_ = null;
        }

        private void clearExit() {
            if (this.actionCase_ == 2) {
                this.actionCase_ = 0;
                this.action_ = null;
            }
        }

        private void clearSubmit() {
            if (this.actionCase_ == 1) {
                this.actionCase_ = 0;
                this.action_ = null;
            }
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass$ChallengePane.Actions getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass.ChallengePane.Actions.b newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass$ChallengePane.Actions parseDelimitedFrom(java.io.InputStream inputStream) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass$ChallengePane.Actions) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass$ChallengePane.Actions parseFrom(java.nio.ByteBuffer byteBuffer) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass$ChallengePane.Actions) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass$ChallengePane.Actions> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
            com.google.protobuf.Parser parser;
            switch (com.plaid.internal.core.protos.link.workflow.nodes.panes.C0482h.f6301a[methodToInvoke.ordinal()]) {
                case 1:
                    return new com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass$ChallengePane.Actions();
                case 2:
                    return new com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass.ChallengePane.Actions.b();
                case 3:
                    return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000", new java.lang.Object[]{"action_", "actionCase_", com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass.ChallengePane.Actions.SubmitAction.class, com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass.ChallengePane.Actions.ExitAction.class});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass$ChallengePane.Actions> parser2 = PARSER;
                    if (parser2 != null) {
                        return parser2;
                    }
                    synchronized (com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass$ChallengePane.Actions.class) {
                        parser = PARSER;
                        if (parser == null) {
                            parser = new com.google.protobuf.GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                            PARSER = parser;
                        }
                    }
                    return parser;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new java.lang.UnsupportedOperationException();
            }
        }

        public final com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass.ChallengePane.Actions.a getActionCase() {
            return com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass.ChallengePane.Actions.a.forNumber(this.actionCase_);
        }

        public final com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass.ChallengePane.Actions.ExitAction getExit() {
            return this.actionCase_ == 2 ? (com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass.ChallengePane.Actions.ExitAction) this.action_ : com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass.ChallengePane.Actions.ExitAction.getDefaultInstance();
        }

        public final com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass.ChallengePane.Actions.SubmitAction getSubmit() {
            return this.actionCase_ == 1 ? (com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass.ChallengePane.Actions.SubmitAction) this.action_ : com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass.ChallengePane.Actions.SubmitAction.getDefaultInstance();
        }

        public final boolean hasExit() {
            return this.actionCase_ == 2;
        }

        public final boolean hasSubmit() {
            return this.actionCase_ == 1;
        }

        private void mergeExit(com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass.ChallengePane.Actions.ExitAction exitAction) {
            if (this.actionCase_ != 2 || this.action_ == com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass.ChallengePane.Actions.ExitAction.getDefaultInstance()) {
                this.action_ = exitAction;
            } else {
                this.action_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass.ChallengePane.Actions.ExitAction.newBuilder((com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass.ChallengePane.Actions.ExitAction) this.action_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass.ChallengePane.Actions.ExitAction.a) exitAction).buildPartial();
            }
            this.actionCase_ = 2;
        }

        private void mergeSubmit(com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass.ChallengePane.Actions.SubmitAction submitAction) {
            if (this.actionCase_ != 1 || this.action_ == com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass.ChallengePane.Actions.SubmitAction.getDefaultInstance()) {
                this.action_ = submitAction;
            } else {
                this.action_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass.ChallengePane.Actions.SubmitAction.newBuilder((com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass.ChallengePane.Actions.SubmitAction) this.action_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass.ChallengePane.Actions.SubmitAction.a) submitAction).buildPartial();
            }
            this.actionCase_ = 1;
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass.ChallengePane.Actions.b newBuilder(com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass$ChallengePane.Actions actions) {
            return DEFAULT_INSTANCE.createBuilder(actions);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass$ChallengePane.Actions parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass$ChallengePane.Actions) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass$ChallengePane.Actions parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass$ChallengePane.Actions) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        private void setExit(com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass.ChallengePane.Actions.ExitAction exitAction) {
            this.action_ = exitAction;
            this.actionCase_ = 2;
        }

        private void setSubmit(com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass.ChallengePane.Actions.SubmitAction submitAction) {
            this.action_ = submitAction;
            this.actionCase_ = 1;
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass$ChallengePane.Actions parseFrom(com.google.protobuf.ByteString byteString) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass$ChallengePane.Actions) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass$ChallengePane.Actions parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass$ChallengePane.Actions) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass$ChallengePane.Actions parseFrom(byte[] bArr) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass$ChallengePane.Actions) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass$ChallengePane.Actions parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass$ChallengePane.Actions) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass$ChallengePane.Actions parseFrom(java.io.InputStream inputStream) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass$ChallengePane.Actions) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass$ChallengePane.Actions parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass$ChallengePane.Actions) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass$ChallengePane.Actions parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass$ChallengePane.Actions) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass$ChallengePane.Actions parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass$ChallengePane.Actions) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class Rendering extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass$ChallengePane.Rendering, com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass.ChallengePane.Rendering.a> implements com.google.protobuf.MessageLiteOrBuilder {
        private static final com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass$ChallengePane.Rendering DEFAULT_INSTANCE;
        public static final int EVENTS_FIELD_NUMBER = 5;
        public static final int HEADER_FIELD_NUMBER = 2;
        public static final int INSTITUTION_FIELD_NUMBER = 1;
        public static final int PANE_HEADER_FIELD_NUMBER = 6;
        private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass$ChallengePane.Rendering> PARSER = null;
        public static final int PREVIEW_FIELD_NUMBER = 7;
        public static final int RECAPTCHA_FIELD_NUMBER = 3;
        private int bitField0_;
        private int challengeCase_ = 0;
        private java.lang.Object challenge_;
        private com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass.ChallengePane.Rendering.Events events_;
        private com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString header_;
        private com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedInstitution institution_;
        private com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneHeader paneHeader_;

        public static final class Events extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass.ChallengePane.Rendering.Events, com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass.ChallengePane.Rendering.Events.a> implements com.google.protobuf.MessageLiteOrBuilder {
            private static final com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass.ChallengePane.Rendering.Events DEFAULT_INSTANCE;
            public static final int ON_APPEAR_FIELD_NUMBER = 1;
            private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass.ChallengePane.Rendering.Events> PARSER;
            private com.google.protobuf.Internal.ProtobufList<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent> onAppear_ = com.google.protobuf.GeneratedMessageLite.emptyProtobufList();

            public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass.ChallengePane.Rendering.Events, com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass.ChallengePane.Rendering.Events.a> implements com.google.protobuf.MessageLiteOrBuilder {
                public a() {
                    super(com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass.ChallengePane.Rendering.Events.DEFAULT_INSTANCE);
                }
            }

            static {
                com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass.ChallengePane.Rendering.Events events = new com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass.ChallengePane.Rendering.Events();
                DEFAULT_INSTANCE = events;
                com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass.ChallengePane.Rendering.Events.class, events);
            }

            private Events() {
            }

            private void addAllOnAppear(java.lang.Iterable<? extends com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent> iterable) {
                ensureOnAppearIsMutable();
                com.google.protobuf.AbstractMessageLite.addAll((java.lang.Iterable) iterable, (java.util.List) this.onAppear_);
            }

            private void clearOnAppear() {
                this.onAppear_ = com.google.protobuf.GeneratedMessageLite.emptyProtobufList();
            }

            private void ensureOnAppearIsMutable() {
                com.google.protobuf.Internal.ProtobufList<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent> protobufList = this.onAppear_;
                if (protobufList.isModifiable()) {
                    return;
                }
                this.onAppear_ = com.google.protobuf.GeneratedMessageLite.mutableCopy(protobufList);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass.ChallengePane.Rendering.Events getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass.ChallengePane.Rendering.Events.a newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass.ChallengePane.Rendering.Events parseDelimitedFrom(java.io.InputStream inputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass.ChallengePane.Rendering.Events) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass.ChallengePane.Rendering.Events parseFrom(java.nio.ByteBuffer byteBuffer) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass.ChallengePane.Rendering.Events) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass.ChallengePane.Rendering.Events> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            private void removeOnAppear(int i) {
                ensureOnAppearIsMutable();
                this.onAppear_.remove(i);
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
                com.google.protobuf.Parser parser;
                switch (com.plaid.internal.core.protos.link.workflow.nodes.panes.C0482h.f6301a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass.ChallengePane.Rendering.Events();
                    case 2:
                        return new com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass.ChallengePane.Rendering.Events.a();
                    case 3:
                        return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new java.lang.Object[]{"onAppear_", com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent.class});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass.ChallengePane.Rendering.Events> parser2 = PARSER;
                        if (parser2 != null) {
                            return parser2;
                        }
                        synchronized (com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass.ChallengePane.Rendering.Events.class) {
                            parser = PARSER;
                            if (parser == null) {
                                parser = new com.google.protobuf.GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                                PARSER = parser;
                            }
                        }
                        return parser;
                    case 6:
                        return (byte) 1;
                    case 7:
                        return null;
                    default:
                        throw new java.lang.UnsupportedOperationException();
                }
            }

            public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent getOnAppear(int i) {
                return this.onAppear_.get(i);
            }

            public final int getOnAppearCount() {
                return this.onAppear_.size();
            }

            public final java.util.List<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent> getOnAppearList() {
                return this.onAppear_;
            }

            public final com.plaid.internal.core.protos.link.workflow.nodes.panes.M getOnAppearOrBuilder(int i) {
                return this.onAppear_.get(i);
            }

            public final java.util.List<? extends com.plaid.internal.core.protos.link.workflow.nodes.panes.M> getOnAppearOrBuilderList() {
                return this.onAppear_;
            }

            private void addOnAppear(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent common$SDKEvent) {
                ensureOnAppearIsMutable();
                this.onAppear_.add(common$SDKEvent);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass.ChallengePane.Rendering.Events.a newBuilder(com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass.ChallengePane.Rendering.Events events) {
                return DEFAULT_INSTANCE.createBuilder(events);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass.ChallengePane.Rendering.Events parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass.ChallengePane.Rendering.Events) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass.ChallengePane.Rendering.Events parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass.ChallengePane.Rendering.Events) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            private void setOnAppear(int i, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent common$SDKEvent) {
                ensureOnAppearIsMutable();
                this.onAppear_.set(i, common$SDKEvent);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass.ChallengePane.Rendering.Events parseFrom(com.google.protobuf.ByteString byteString) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass.ChallengePane.Rendering.Events) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass.ChallengePane.Rendering.Events parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass.ChallengePane.Rendering.Events) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            private void addOnAppear(int i, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent common$SDKEvent) {
                ensureOnAppearIsMutable();
                this.onAppear_.add(i, common$SDKEvent);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass.ChallengePane.Rendering.Events parseFrom(byte[] bArr) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass.ChallengePane.Rendering.Events) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass.ChallengePane.Rendering.Events parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass.ChallengePane.Rendering.Events) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass.ChallengePane.Rendering.Events parseFrom(java.io.InputStream inputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass.ChallengePane.Rendering.Events) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass.ChallengePane.Rendering.Events parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass.ChallengePane.Rendering.Events) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass.ChallengePane.Rendering.Events parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass.ChallengePane.Rendering.Events) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass.ChallengePane.Rendering.Events parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass.ChallengePane.Rendering.Events) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        public static final class PreviewChallenge extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass.ChallengePane.Rendering.PreviewChallenge, com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass.ChallengePane.Rendering.PreviewChallenge.a> implements com.google.protobuf.MessageLiteOrBuilder {
            private static final com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass.ChallengePane.Rendering.PreviewChallenge DEFAULT_INSTANCE;
            private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass.ChallengePane.Rendering.PreviewChallenge> PARSER;

            public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass.ChallengePane.Rendering.PreviewChallenge, com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass.ChallengePane.Rendering.PreviewChallenge.a> implements com.google.protobuf.MessageLiteOrBuilder {
                public a() {
                    super(com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass.ChallengePane.Rendering.PreviewChallenge.DEFAULT_INSTANCE);
                }
            }

            static {
                com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass.ChallengePane.Rendering.PreviewChallenge previewChallenge = new com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass.ChallengePane.Rendering.PreviewChallenge();
                DEFAULT_INSTANCE = previewChallenge;
                com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass.ChallengePane.Rendering.PreviewChallenge.class, previewChallenge);
            }

            private PreviewChallenge() {
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass.ChallengePane.Rendering.PreviewChallenge getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass.ChallengePane.Rendering.PreviewChallenge.a newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass.ChallengePane.Rendering.PreviewChallenge parseDelimitedFrom(java.io.InputStream inputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass.ChallengePane.Rendering.PreviewChallenge) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass.ChallengePane.Rendering.PreviewChallenge parseFrom(java.nio.ByteBuffer byteBuffer) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass.ChallengePane.Rendering.PreviewChallenge) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass.ChallengePane.Rendering.PreviewChallenge> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
                com.google.protobuf.Parser parser;
                switch (com.plaid.internal.core.protos.link.workflow.nodes.panes.C0482h.f6301a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass.ChallengePane.Rendering.PreviewChallenge();
                    case 2:
                        return new com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass.ChallengePane.Rendering.PreviewChallenge.a();
                    case 3:
                        return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", null);
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass.ChallengePane.Rendering.PreviewChallenge> parser2 = PARSER;
                        if (parser2 != null) {
                            return parser2;
                        }
                        synchronized (com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass.ChallengePane.Rendering.PreviewChallenge.class) {
                            parser = PARSER;
                            if (parser == null) {
                                parser = new com.google.protobuf.GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                                PARSER = parser;
                            }
                        }
                        return parser;
                    case 6:
                        return (byte) 1;
                    case 7:
                        return null;
                    default:
                        throw new java.lang.UnsupportedOperationException();
                }
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass.ChallengePane.Rendering.PreviewChallenge.a newBuilder(com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass.ChallengePane.Rendering.PreviewChallenge previewChallenge) {
                return DEFAULT_INSTANCE.createBuilder(previewChallenge);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass.ChallengePane.Rendering.PreviewChallenge parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass.ChallengePane.Rendering.PreviewChallenge) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass.ChallengePane.Rendering.PreviewChallenge parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass.ChallengePane.Rendering.PreviewChallenge) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass.ChallengePane.Rendering.PreviewChallenge parseFrom(com.google.protobuf.ByteString byteString) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass.ChallengePane.Rendering.PreviewChallenge) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass.ChallengePane.Rendering.PreviewChallenge parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass.ChallengePane.Rendering.PreviewChallenge) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass.ChallengePane.Rendering.PreviewChallenge parseFrom(byte[] bArr) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass.ChallengePane.Rendering.PreviewChallenge) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass.ChallengePane.Rendering.PreviewChallenge parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass.ChallengePane.Rendering.PreviewChallenge) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass.ChallengePane.Rendering.PreviewChallenge parseFrom(java.io.InputStream inputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass.ChallengePane.Rendering.PreviewChallenge) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass.ChallengePane.Rendering.PreviewChallenge parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass.ChallengePane.Rendering.PreviewChallenge) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass.ChallengePane.Rendering.PreviewChallenge parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass.ChallengePane.Rendering.PreviewChallenge) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass.ChallengePane.Rendering.PreviewChallenge parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass.ChallengePane.Rendering.PreviewChallenge) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        public static final class RecaptchaChallenge extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass.ChallengePane.Rendering.RecaptchaChallenge, com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass.ChallengePane.Rendering.RecaptchaChallenge.a> implements com.google.protobuf.MessageLiteOrBuilder {
            private static final com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass.ChallengePane.Rendering.RecaptchaChallenge DEFAULT_INSTANCE;
            public static final int LANGUAGE_FIELD_NUMBER = 2;
            private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass.ChallengePane.Rendering.RecaptchaChallenge> PARSER = null;
            public static final int SITEKEY_FIELD_NUMBER = 1;
            private java.lang.String sitekey_ = "";
            private java.lang.String language_ = "";

            public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass.ChallengePane.Rendering.RecaptchaChallenge, com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass.ChallengePane.Rendering.RecaptchaChallenge.a> implements com.google.protobuf.MessageLiteOrBuilder {
                public a() {
                    super(com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass.ChallengePane.Rendering.RecaptchaChallenge.DEFAULT_INSTANCE);
                }
            }

            static {
                com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass.ChallengePane.Rendering.RecaptchaChallenge recaptchaChallenge = new com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass.ChallengePane.Rendering.RecaptchaChallenge();
                DEFAULT_INSTANCE = recaptchaChallenge;
                com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass.ChallengePane.Rendering.RecaptchaChallenge.class, recaptchaChallenge);
            }

            private RecaptchaChallenge() {
            }

            private void clearLanguage() {
                this.language_ = getDefaultInstance().getLanguage();
            }

            private void clearSitekey() {
                this.sitekey_ = getDefaultInstance().getSitekey();
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass.ChallengePane.Rendering.RecaptchaChallenge getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass.ChallengePane.Rendering.RecaptchaChallenge.a newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass.ChallengePane.Rendering.RecaptchaChallenge parseDelimitedFrom(java.io.InputStream inputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass.ChallengePane.Rendering.RecaptchaChallenge) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass.ChallengePane.Rendering.RecaptchaChallenge parseFrom(java.nio.ByteBuffer byteBuffer) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass.ChallengePane.Rendering.RecaptchaChallenge) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass.ChallengePane.Rendering.RecaptchaChallenge> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            private void setLanguageBytes(com.google.protobuf.ByteString byteString) {
                com.google.protobuf.GeneratedMessageLite.checkByteStringIsUtf8(byteString);
                this.language_ = byteString.toStringUtf8();
            }

            private void setSitekeyBytes(com.google.protobuf.ByteString byteString) {
                com.google.protobuf.GeneratedMessageLite.checkByteStringIsUtf8(byteString);
                this.sitekey_ = byteString.toStringUtf8();
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
                com.google.protobuf.Parser parser;
                switch (com.plaid.internal.core.protos.link.workflow.nodes.panes.C0482h.f6301a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass.ChallengePane.Rendering.RecaptchaChallenge();
                    case 2:
                        return new com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass.ChallengePane.Rendering.RecaptchaChallenge.a();
                    case 3:
                        return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new java.lang.Object[]{"sitekey_", "language_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass.ChallengePane.Rendering.RecaptchaChallenge> parser2 = PARSER;
                        if (parser2 != null) {
                            return parser2;
                        }
                        synchronized (com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass.ChallengePane.Rendering.RecaptchaChallenge.class) {
                            parser = PARSER;
                            if (parser == null) {
                                parser = new com.google.protobuf.GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                                PARSER = parser;
                            }
                        }
                        return parser;
                    case 6:
                        return (byte) 1;
                    case 7:
                        return null;
                    default:
                        throw new java.lang.UnsupportedOperationException();
                }
            }

            public final java.lang.String getLanguage() {
                return this.language_;
            }

            public final com.google.protobuf.ByteString getLanguageBytes() {
                return com.google.protobuf.ByteString.copyFromUtf8(this.language_);
            }

            public final java.lang.String getSitekey() {
                return this.sitekey_;
            }

            public final com.google.protobuf.ByteString getSitekeyBytes() {
                return com.google.protobuf.ByteString.copyFromUtf8(this.sitekey_);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass.ChallengePane.Rendering.RecaptchaChallenge.a newBuilder(com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass.ChallengePane.Rendering.RecaptchaChallenge recaptchaChallenge) {
                return DEFAULT_INSTANCE.createBuilder(recaptchaChallenge);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass.ChallengePane.Rendering.RecaptchaChallenge parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass.ChallengePane.Rendering.RecaptchaChallenge) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass.ChallengePane.Rendering.RecaptchaChallenge parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass.ChallengePane.Rendering.RecaptchaChallenge) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass.ChallengePane.Rendering.RecaptchaChallenge parseFrom(com.google.protobuf.ByteString byteString) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass.ChallengePane.Rendering.RecaptchaChallenge) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            private void setLanguage(java.lang.String str) {
                this.language_ = str;
            }

            private void setSitekey(java.lang.String str) {
                this.sitekey_ = str;
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass.ChallengePane.Rendering.RecaptchaChallenge parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass.ChallengePane.Rendering.RecaptchaChallenge) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass.ChallengePane.Rendering.RecaptchaChallenge parseFrom(byte[] bArr) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass.ChallengePane.Rendering.RecaptchaChallenge) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass.ChallengePane.Rendering.RecaptchaChallenge parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass.ChallengePane.Rendering.RecaptchaChallenge) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass.ChallengePane.Rendering.RecaptchaChallenge parseFrom(java.io.InputStream inputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass.ChallengePane.Rendering.RecaptchaChallenge) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass.ChallengePane.Rendering.RecaptchaChallenge parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass.ChallengePane.Rendering.RecaptchaChallenge) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass.ChallengePane.Rendering.RecaptchaChallenge parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass.ChallengePane.Rendering.RecaptchaChallenge) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass.ChallengePane.Rendering.RecaptchaChallenge parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass.ChallengePane.Rendering.RecaptchaChallenge) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass$ChallengePane.Rendering, com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass.ChallengePane.Rendering.a> implements com.google.protobuf.MessageLiteOrBuilder {
            public a() {
                super(com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass$ChallengePane.Rendering.DEFAULT_INSTANCE);
            }
        }

        public enum b {
            RECAPTCHA(3),
            PREVIEW(7),
            CHALLENGE_NOT_SET(0);


            /* renamed from: a, reason: collision with root package name */
            public final int f6106a;

            b(int i) {
                this.f6106a = i;
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass.ChallengePane.Rendering.b forNumber(int i) {
                if (i == 0) {
                    return CHALLENGE_NOT_SET;
                }
                if (i == 3) {
                    return RECAPTCHA;
                }
                if (i != 7) {
                    return null;
                }
                return PREVIEW;
            }

            public final int getNumber() {
                return this.f6106a;
            }

            @java.lang.Deprecated
            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass.ChallengePane.Rendering.b valueOf(int i) {
                return forNumber(i);
            }
        }

        static {
            com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass$ChallengePane.Rendering rendering = new com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass$ChallengePane.Rendering();
            DEFAULT_INSTANCE = rendering;
            com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass$ChallengePane.Rendering.class, rendering);
        }

        private Rendering() {
        }

        private void clearChallenge() {
            this.challengeCase_ = 0;
            this.challenge_ = null;
        }

        private void clearEvents() {
            this.events_ = null;
            this.bitField0_ &= -9;
        }

        private void clearHeader() {
            this.header_ = null;
            this.bitField0_ &= -5;
        }

        private void clearInstitution() {
            this.institution_ = null;
            this.bitField0_ &= -2;
        }

        private void clearPaneHeader() {
            this.paneHeader_ = null;
            this.bitField0_ &= -3;
        }

        private void clearPreview() {
            if (this.challengeCase_ == 7) {
                this.challengeCase_ = 0;
                this.challenge_ = null;
            }
        }

        private void clearRecaptcha() {
            if (this.challengeCase_ == 3) {
                this.challengeCase_ = 0;
                this.challenge_ = null;
            }
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass$ChallengePane.Rendering getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass.ChallengePane.Rendering.a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass$ChallengePane.Rendering parseDelimitedFrom(java.io.InputStream inputStream) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass$ChallengePane.Rendering) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass$ChallengePane.Rendering parseFrom(java.nio.ByteBuffer byteBuffer) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass$ChallengePane.Rendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass$ChallengePane.Rendering> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
            com.google.protobuf.Parser parser;
            switch (com.plaid.internal.core.protos.link.workflow.nodes.panes.C0482h.f6301a[methodToInvoke.ordinal()]) {
                case 1:
                    return new com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass$ChallengePane.Rendering();
                case 2:
                    return new com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass.ChallengePane.Rendering.a();
                case 3:
                    return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0001\u0001\u0001\u0007\u0006\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0002\u0003<\u0000\u0005ဉ\u0003\u0006ဉ\u0001\u0007<\u0000", new java.lang.Object[]{"challenge_", "challengeCase_", "bitField0_", "institution_", "header_", com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass.ChallengePane.Rendering.RecaptchaChallenge.class, "events_", "paneHeader_", com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass.ChallengePane.Rendering.PreviewChallenge.class});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass$ChallengePane.Rendering> parser2 = PARSER;
                    if (parser2 != null) {
                        return parser2;
                    }
                    synchronized (com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass$ChallengePane.Rendering.class) {
                        parser = PARSER;
                        if (parser == null) {
                            parser = new com.google.protobuf.GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                            PARSER = parser;
                        }
                    }
                    return parser;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new java.lang.UnsupportedOperationException();
            }
        }

        public final com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass.ChallengePane.Rendering.b getChallengeCase() {
            return com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass.ChallengePane.Rendering.b.forNumber(this.challengeCase_);
        }

        public final com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass.ChallengePane.Rendering.Events getEvents() {
            com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass.ChallengePane.Rendering.Events events = this.events_;
            return events == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass.ChallengePane.Rendering.Events.getDefaultInstance() : events;
        }

        public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString getHeader() {
            com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString common$LocalizedString = this.header_;
            return common$LocalizedString == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString.getDefaultInstance() : common$LocalizedString;
        }

        public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedInstitution getInstitution() {
            com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedInstitution common$RenderedInstitution = this.institution_;
            return common$RenderedInstitution == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedInstitution.getDefaultInstance() : common$RenderedInstitution;
        }

        public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneHeader getPaneHeader() {
            com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneHeader common$PaneHeader = this.paneHeader_;
            return common$PaneHeader == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneHeader.getDefaultInstance() : common$PaneHeader;
        }

        public final com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass.ChallengePane.Rendering.PreviewChallenge getPreview() {
            return this.challengeCase_ == 7 ? (com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass.ChallengePane.Rendering.PreviewChallenge) this.challenge_ : com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass.ChallengePane.Rendering.PreviewChallenge.getDefaultInstance();
        }

        public final com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass.ChallengePane.Rendering.RecaptchaChallenge getRecaptcha() {
            return this.challengeCase_ == 3 ? (com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass.ChallengePane.Rendering.RecaptchaChallenge) this.challenge_ : com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass.ChallengePane.Rendering.RecaptchaChallenge.getDefaultInstance();
        }

        public final boolean hasEvents() {
            return (this.bitField0_ & 8) != 0;
        }

        public final boolean hasHeader() {
            return (this.bitField0_ & 4) != 0;
        }

        public final boolean hasInstitution() {
            return (this.bitField0_ & 1) != 0;
        }

        public final boolean hasPaneHeader() {
            return (this.bitField0_ & 2) != 0;
        }

        public final boolean hasPreview() {
            return this.challengeCase_ == 7;
        }

        public final boolean hasRecaptcha() {
            return this.challengeCase_ == 3;
        }

        private void mergeEvents(com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass.ChallengePane.Rendering.Events events) {
            com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass.ChallengePane.Rendering.Events events2 = this.events_;
            if (events2 == null || events2 == com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass.ChallengePane.Rendering.Events.getDefaultInstance()) {
                this.events_ = events;
            } else {
                this.events_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass.ChallengePane.Rendering.Events.newBuilder(this.events_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass.ChallengePane.Rendering.Events.a) events).buildPartial();
            }
            this.bitField0_ |= 8;
        }

        private void mergeHeader(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString common$LocalizedString) {
            com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString common$LocalizedString2 = this.header_;
            if (common$LocalizedString2 == null || common$LocalizedString2 == com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString.getDefaultInstance()) {
                this.header_ = common$LocalizedString;
            } else {
                this.header_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString.newBuilder(this.header_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString.a) common$LocalizedString).buildPartial();
            }
            this.bitField0_ |= 4;
        }

        private void mergeInstitution(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedInstitution common$RenderedInstitution) {
            com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedInstitution common$RenderedInstitution2 = this.institution_;
            if (common$RenderedInstitution2 == null || common$RenderedInstitution2 == com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedInstitution.getDefaultInstance()) {
                this.institution_ = common$RenderedInstitution;
            } else {
                this.institution_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedInstitution.newBuilder(this.institution_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedInstitution.a) common$RenderedInstitution).buildPartial();
            }
            this.bitField0_ |= 1;
        }

        private void mergePaneHeader(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneHeader common$PaneHeader) {
            com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneHeader common$PaneHeader2 = this.paneHeader_;
            if (common$PaneHeader2 == null || common$PaneHeader2 == com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneHeader.getDefaultInstance()) {
                this.paneHeader_ = common$PaneHeader;
            } else {
                this.paneHeader_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneHeader.newBuilder(this.paneHeader_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneHeader.a) common$PaneHeader).buildPartial();
            }
            this.bitField0_ |= 2;
        }

        private void mergePreview(com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass.ChallengePane.Rendering.PreviewChallenge previewChallenge) {
            if (this.challengeCase_ != 7 || this.challenge_ == com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass.ChallengePane.Rendering.PreviewChallenge.getDefaultInstance()) {
                this.challenge_ = previewChallenge;
            } else {
                this.challenge_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass.ChallengePane.Rendering.PreviewChallenge.newBuilder((com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass.ChallengePane.Rendering.PreviewChallenge) this.challenge_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass.ChallengePane.Rendering.PreviewChallenge.a) previewChallenge).buildPartial();
            }
            this.challengeCase_ = 7;
        }

        private void mergeRecaptcha(com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass.ChallengePane.Rendering.RecaptchaChallenge recaptchaChallenge) {
            if (this.challengeCase_ != 3 || this.challenge_ == com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass.ChallengePane.Rendering.RecaptchaChallenge.getDefaultInstance()) {
                this.challenge_ = recaptchaChallenge;
            } else {
                this.challenge_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass.ChallengePane.Rendering.RecaptchaChallenge.newBuilder((com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass.ChallengePane.Rendering.RecaptchaChallenge) this.challenge_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass.ChallengePane.Rendering.RecaptchaChallenge.a) recaptchaChallenge).buildPartial();
            }
            this.challengeCase_ = 3;
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass.ChallengePane.Rendering.a newBuilder(com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass$ChallengePane.Rendering rendering) {
            return DEFAULT_INSTANCE.createBuilder(rendering);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass$ChallengePane.Rendering parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass$ChallengePane.Rendering) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass$ChallengePane.Rendering parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass$ChallengePane.Rendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        private void setEvents(com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass.ChallengePane.Rendering.Events events) {
            this.events_ = events;
            this.bitField0_ |= 8;
        }

        private void setHeader(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString common$LocalizedString) {
            this.header_ = common$LocalizedString;
            this.bitField0_ |= 4;
        }

        private void setInstitution(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedInstitution common$RenderedInstitution) {
            this.institution_ = common$RenderedInstitution;
            this.bitField0_ |= 1;
        }

        private void setPaneHeader(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneHeader common$PaneHeader) {
            this.paneHeader_ = common$PaneHeader;
            this.bitField0_ |= 2;
        }

        private void setPreview(com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass.ChallengePane.Rendering.PreviewChallenge previewChallenge) {
            this.challenge_ = previewChallenge;
            this.challengeCase_ = 7;
        }

        private void setRecaptcha(com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass.ChallengePane.Rendering.RecaptchaChallenge recaptchaChallenge) {
            this.challenge_ = recaptchaChallenge;
            this.challengeCase_ = 3;
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass$ChallengePane.Rendering parseFrom(com.google.protobuf.ByteString byteString) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass$ChallengePane.Rendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass$ChallengePane.Rendering parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass$ChallengePane.Rendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass$ChallengePane.Rendering parseFrom(byte[] bArr) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass$ChallengePane.Rendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass$ChallengePane.Rendering parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass$ChallengePane.Rendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass$ChallengePane.Rendering parseFrom(java.io.InputStream inputStream) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass$ChallengePane.Rendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass$ChallengePane.Rendering parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass$ChallengePane.Rendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass$ChallengePane.Rendering parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass$ChallengePane.Rendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass$ChallengePane.Rendering parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass$ChallengePane.Rendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass$ChallengePane, com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass$ChallengePane.a> implements com.google.protobuf.MessageLiteOrBuilder {
        public a() {
            super(com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass$ChallengePane.DEFAULT_INSTANCE);
        }
    }

    static {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass$ChallengePane challengePaneOuterClass$ChallengePane = new com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass$ChallengePane();
        DEFAULT_INSTANCE = challengePaneOuterClass$ChallengePane;
        com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass$ChallengePane.class, challengePaneOuterClass$ChallengePane);
    }

    private ChallengePaneOuterClass$ChallengePane() {
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass$ChallengePane getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass$ChallengePane.a newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass$ChallengePane parseDelimitedFrom(java.io.InputStream inputStream) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass$ChallengePane) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass$ChallengePane parseFrom(java.nio.ByteBuffer byteBuffer) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass$ChallengePane) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass$ChallengePane> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
        com.google.protobuf.Parser parser;
        switch (com.plaid.internal.core.protos.link.workflow.nodes.panes.C0482h.f6301a[methodToInvoke.ordinal()]) {
            case 1:
                return new com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass$ChallengePane();
            case 2:
                return new com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass$ChallengePane.a();
            case 3:
                return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", null);
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass$ChallengePane> parser2 = PARSER;
                if (parser2 != null) {
                    return parser2;
                }
                synchronized (com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass$ChallengePane.class) {
                    parser = PARSER;
                    if (parser == null) {
                        parser = new com.google.protobuf.GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                        PARSER = parser;
                    }
                }
                return parser;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new java.lang.UnsupportedOperationException();
        }
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass$ChallengePane.a newBuilder(com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass$ChallengePane challengePaneOuterClass$ChallengePane) {
        return DEFAULT_INSTANCE.createBuilder(challengePaneOuterClass$ChallengePane);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass$ChallengePane parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass$ChallengePane) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass$ChallengePane parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass$ChallengePane) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass$ChallengePane parseFrom(com.google.protobuf.ByteString byteString) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass$ChallengePane) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass$ChallengePane parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass$ChallengePane) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass$ChallengePane parseFrom(byte[] bArr) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass$ChallengePane) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass$ChallengePane parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass$ChallengePane) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass$ChallengePane parseFrom(java.io.InputStream inputStream) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass$ChallengePane) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass$ChallengePane parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass$ChallengePane) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass$ChallengePane parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass$ChallengePane) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass$ChallengePane parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass$ChallengePane) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
