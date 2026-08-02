package com.paypal.oslo.feature.merchantbanking.data.repository;

@kotlin.Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J!\u0010\n\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00070\u0006H\u0016¢\u0006\u0004\b\n\u0010\u000bJ!\u0010\r\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\f0\u00070\u0006H\u0016¢\u0006\u0004\b\r\u0010\u000bJ!\u0010\u000e\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00070\u0006H\u0016¢\u0006\u0004\b\u000e\u0010\u000bJ3\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00072\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f2\u0006\u0010\u0013\u001a\u00020\u0012H\u0000¢\u0006\u0004\b\u0014\u0010\u0015J+\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00072\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000fH\u0000¢\u0006\u0004\b\u0016\u0010\u0017J3\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\f0\u00072\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u000f2\u0006\u0010\u0013\u001a\u00020\u0012H\u0000¢\u0006\u0004\b\u0019\u0010\u0015J+\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\f0\u00072\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u000fH\u0000¢\u0006\u0004\b\u001a\u0010\u0017J3\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00072\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u000f2\u0006\u0010\u0013\u001a\u00020\u0012H\u0000¢\u0006\u0004\b\u001c\u0010\u0015J+\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00072\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u000fH\u0000¢\u0006\u0004\b\u001d\u0010\u0017R\u0014\u0010 \u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f"}, d2 = {"Lcom/paypal/oslo/feature/merchantbanking/data/repository/MerchantAccountRoutingNumberRepositoryImpl;", "Lcom/paypal/oslo/feature/merchantbanking/domain/repository/MerchantAccountRoutingNumberRepository;", "Lcom/apollographql/apollo/ApolloClient;", "apolloClient", "<init>", "(Lcom/apollographql/apollo/ApolloClient;)V", "Lkotlinx/coroutines/flow/Flow;", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/merchantbanking/domain/errors/ArnRepositoryError;", "Lcom/paypal/oslo/feature/merchantbanking/domain/model/AccountRoutingInfoData;", "getAccountRoutingNumbers", "()Lkotlinx/coroutines/flow/Flow;", "", "checkEligibility", "enrollForAccountRoutingNumbers", "Lcom/paypal/oslo/core/network/graphql/GraphQLData;", "Lcom/paypal/oslo/feature/merchantbanking/graphql/ProvisionVirtualBankAccountMutation$Data;", "graphQLData", "Lcom/paypal/oslo/core/network/graphql/error/CallError;", "callError", "provisionErrorWithData$merchant_banking_prodRelease", "(Lcom/paypal/oslo/core/network/graphql/GraphQLData;Lcom/paypal/oslo/core/network/graphql/error/CallError;)Larrow/core/Either;", "provisionDataResponse$merchant_banking_prodRelease", "(Lcom/paypal/oslo/core/network/graphql/GraphQLData;)Larrow/core/Either;", "Lcom/paypal/oslo/feature/merchantbanking/graphql/VirtualBankAccountEligibilityQuery$Data;", "eligibilityErrorWithData$merchant_banking_prodRelease", "eligibilityDataResponse$merchant_banking_prodRelease", "Lcom/paypal/oslo/feature/merchantbanking/graphql/VirtualBankAccountsQuery$Data;", "errorWithData$merchant_banking_prodRelease", "dataResponse$merchant_banking_prodRelease", "getHighSpeedVideoSizes", "Lcom/apollographql/apollo/ApolloClient;", "Camera2StreamConfigurationMap"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class MerchantAccountRoutingNumberRepositoryImpl implements com.paypal.oslo.feature.merchantbanking.domain.repository.MerchantAccountRoutingNumberRepository {
    public static final int $stable = 8;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.apollographql.apollo.ApolloClient Camera2StreamConfigurationMap;

    @javax.inject.Inject
    public MerchantAccountRoutingNumberRepositoryImpl(com.apollographql.apollo.ApolloClient apolloClient) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(apolloClient, "");
        this.Camera2StreamConfigurationMap = apolloClient;
    }

    @Override // com.paypal.oslo.feature.merchantbanking.domain.repository.MerchantAccountRoutingNumberRepository
    public final kotlinx.coroutines.flow.Flow<arrow.core.Either<com.paypal.oslo.feature.merchantbanking.domain.errors.ArnRepositoryError, com.paypal.oslo.feature.merchantbanking.domain.model.AccountRoutingInfoData>> getAccountRoutingNumbers() {
        return kotlinx.coroutines.flow.FlowKt.flow(new com.paypal.oslo.feature.merchantbanking.data.repository.MerchantAccountRoutingNumberRepositoryImpl$getAccountRoutingNumbers$1(this, null));
    }

    @Override // com.paypal.oslo.feature.merchantbanking.domain.repository.MerchantAccountRoutingNumberRepository
    public final kotlinx.coroutines.flow.Flow<arrow.core.Either<com.paypal.oslo.feature.merchantbanking.domain.errors.ArnRepositoryError, java.lang.Boolean>> checkEligibility() {
        return kotlinx.coroutines.flow.FlowKt.flow(new com.paypal.oslo.feature.merchantbanking.data.repository.MerchantAccountRoutingNumberRepositoryImpl$checkEligibility$1(this, null));
    }

    @Override // com.paypal.oslo.feature.merchantbanking.domain.repository.MerchantAccountRoutingNumberRepository
    public final kotlinx.coroutines.flow.Flow<arrow.core.Either<com.paypal.oslo.feature.merchantbanking.domain.errors.ArnRepositoryError, com.paypal.oslo.feature.merchantbanking.domain.model.AccountRoutingInfoData>> enrollForAccountRoutingNumbers() {
        return kotlinx.coroutines.flow.FlowKt.flow(new com.paypal.oslo.feature.merchantbanking.data.repository.MerchantAccountRoutingNumberRepositoryImpl$enrollForAccountRoutingNumbers$1(this, null));
    }

    public final arrow.core.Either<com.paypal.oslo.feature.merchantbanking.domain.errors.ArnRepositoryError, com.paypal.oslo.feature.merchantbanking.domain.model.AccountRoutingInfoData> provisionErrorWithData$merchant_banking_prodRelease(com.paypal.oslo.core.network.graphql.GraphQLData<com.paypal.oslo.feature.merchantbanking.graphql.ProvisionVirtualBankAccountMutation.Data> graphQLData, com.paypal.oslo.core.network.graphql.error.CallError callError) {
        com.paypal.oslo.feature.merchantbanking.domain.errors.ArnRepositoryError network;
        com.paypal.oslo.feature.merchantbanking.graphql.ProvisionVirtualBankAccountMutation.Data data;
        com.paypal.oslo.feature.merchantbanking.graphql.ProvisionVirtualBankAccountMutation.ProvisionVirtualBankAccount provisionVirtualBankAccount;
        com.paypal.oslo.feature.merchantbanking.domain.model.AccountRoutingInfoData accountRoutingInfoData;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callError, "");
        arrow.core.raise.DefaultRaise defaultRaise = new arrow.core.raise.DefaultRaise(false);
        try {
            arrow.core.raise.DefaultRaise defaultRaise2 = defaultRaise;
            if (graphQLData == null || (data = graphQLData.getData()) == null || (provisionVirtualBankAccount = data.getProvisionVirtualBankAccount()) == null || (accountRoutingInfoData = com.paypal.oslo.feature.merchantbanking.data.repository.VirtualBankAccountExtensionsKt.toAccountRoutingInfoData(provisionVirtualBankAccount)) == null) {
                if (callError instanceof com.paypal.oslo.core.network.graphql.error.CallError.Network) {
                    network = new com.paypal.oslo.feature.merchantbanking.domain.errors.ArnRepositoryError.Network((com.paypal.oslo.core.network.graphql.error.CallError.Network) callError);
                } else {
                    if (!(callError instanceof com.paypal.oslo.core.network.graphql.error.CallError.GraphQL)) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    network = new com.paypal.oslo.feature.merchantbanking.domain.errors.ArnRepositoryError.GraphQLError((com.paypal.oslo.core.network.graphql.error.CallError.GraphQL) callError);
                }
                defaultRaise2.raise(network);
                throw new kotlin.KotlinNothingValueException();
            }
            defaultRaise.complete();
            return new arrow.core.Either.Right(accountRoutingInfoData);
        } catch (arrow.core.raise.RaiseCancellationException e) {
            defaultRaise.complete();
            return new arrow.core.Either.Left(arrow.core.raise.RaiseKt.raisedOrRethrow(e, defaultRaise));
        } catch (java.lang.Throwable th) {
            defaultRaise.complete();
            throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th);
        }
    }

    public final arrow.core.Either<com.paypal.oslo.feature.merchantbanking.domain.errors.ArnRepositoryError, com.paypal.oslo.feature.merchantbanking.domain.model.AccountRoutingInfoData> provisionDataResponse$merchant_banking_prodRelease(com.paypal.oslo.core.network.graphql.GraphQLData<com.paypal.oslo.feature.merchantbanking.graphql.ProvisionVirtualBankAccountMutation.Data> graphQLData) {
        com.paypal.oslo.feature.merchantbanking.graphql.ProvisionVirtualBankAccountMutation.Data data;
        com.paypal.oslo.feature.merchantbanking.graphql.ProvisionVirtualBankAccountMutation.ProvisionVirtualBankAccount provisionVirtualBankAccount;
        com.paypal.oslo.feature.merchantbanking.domain.errors.ArnRepositoryError arnRepositoryError;
        arrow.core.raise.DefaultRaise defaultRaise = new arrow.core.raise.DefaultRaise(false);
        try {
            arrow.core.raise.DefaultRaise defaultRaise2 = defaultRaise;
            if (graphQLData == null || (data = graphQLData.getData()) == null || (provisionVirtualBankAccount = data.getProvisionVirtualBankAccount()) == null) {
                defaultRaise2.raise(new com.paypal.oslo.feature.merchantbanking.domain.errors.ArnRepositoryError.Network(new com.paypal.oslo.core.network.graphql.error.CallError.Network(new com.paypal.oslo.core.network.http.error.NetworkError.UnknownError(new java.lang.IllegalStateException("No provisioning data returned")))));
                throw new kotlin.KotlinNothingValueException();
            }
            com.paypal.oslo.feature.merchantbanking.domain.model.AccountRoutingInfoData accountRoutingInfoData = com.paypal.oslo.feature.merchantbanking.data.repository.VirtualBankAccountExtensionsKt.toAccountRoutingInfoData(provisionVirtualBankAccount);
            if (accountRoutingInfoData != null) {
                defaultRaise.complete();
                return new arrow.core.Either.Right(accountRoutingInfoData);
            }
            if (com.paypal.oslo.feature.merchantbanking.data.repository.VirtualBankAccountExtensionsKt.isRiskDenied(provisionVirtualBankAccount)) {
                arnRepositoryError = com.paypal.oslo.feature.merchantbanking.domain.errors.ArnRepositoryError.RiskDenied.INSTANCE;
            } else if (com.paypal.oslo.feature.merchantbanking.data.repository.VirtualBankAccountExtensionsKt.isIneligible(provisionVirtualBankAccount)) {
                arnRepositoryError = com.paypal.oslo.feature.merchantbanking.domain.errors.ArnRepositoryError.Ineligible.INSTANCE;
            } else {
                com.paypal.oslo.api.graphql.schema.type.VirtualBankAccountProvisioningStatus status = provisionVirtualBankAccount.getStatus();
                com.paypal.oslo.api.graphql.schema.type.VirtualBankAccountProvisioningOutcomeReason reason = provisionVirtualBankAccount.getReason();
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Provisioning failed with status: ");
                sb.append(status);
                sb.append(", reason: ");
                sb.append(reason);
                arnRepositoryError = new com.paypal.oslo.feature.merchantbanking.domain.errors.ArnRepositoryError.Network(new com.paypal.oslo.core.network.graphql.error.CallError.Network(new com.paypal.oslo.core.network.http.error.NetworkError.UnknownError(new java.lang.IllegalStateException(sb.toString()))));
            }
            defaultRaise2.raise(arnRepositoryError);
            throw new kotlin.KotlinNothingValueException();
        } catch (arrow.core.raise.RaiseCancellationException e) {
            defaultRaise.complete();
            return new arrow.core.Either.Left(arrow.core.raise.RaiseKt.raisedOrRethrow(e, defaultRaise));
        } catch (java.lang.Throwable th) {
            defaultRaise.complete();
            throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th);
        }
    }

    public final arrow.core.Either<com.paypal.oslo.feature.merchantbanking.domain.errors.ArnRepositoryError, java.lang.Boolean> eligibilityErrorWithData$merchant_banking_prodRelease(com.paypal.oslo.core.network.graphql.GraphQLData<com.paypal.oslo.feature.merchantbanking.graphql.VirtualBankAccountEligibilityQuery.Data> graphQLData, com.paypal.oslo.core.network.graphql.error.CallError callError) {
        com.paypal.oslo.feature.merchantbanking.domain.errors.ArnRepositoryError network;
        com.paypal.oslo.feature.merchantbanking.graphql.VirtualBankAccountEligibilityQuery.Data data;
        com.paypal.oslo.feature.merchantbanking.graphql.VirtualBankAccountEligibilityQuery.VirtualBankAccountEligibility virtualBankAccountEligibility;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callError, "");
        arrow.core.raise.DefaultRaise defaultRaise = new arrow.core.raise.DefaultRaise(false);
        try {
            arrow.core.raise.DefaultRaise defaultRaise2 = defaultRaise;
            if (graphQLData == null || (data = graphQLData.getData()) == null || (virtualBankAccountEligibility = data.getVirtualBankAccountEligibility()) == null) {
                if (callError instanceof com.paypal.oslo.core.network.graphql.error.CallError.Network) {
                    network = new com.paypal.oslo.feature.merchantbanking.domain.errors.ArnRepositoryError.Network((com.paypal.oslo.core.network.graphql.error.CallError.Network) callError);
                } else {
                    if (!(callError instanceof com.paypal.oslo.core.network.graphql.error.CallError.GraphQL)) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    network = new com.paypal.oslo.feature.merchantbanking.domain.errors.ArnRepositoryError.GraphQLError((com.paypal.oslo.core.network.graphql.error.CallError.GraphQL) callError);
                }
                defaultRaise2.raise(network);
                throw new kotlin.KotlinNothingValueException();
            }
            boolean isEligible = com.paypal.oslo.feature.merchantbanking.data.repository.VirtualBankAccountExtensionsKt.isEligible(virtualBankAccountEligibility);
            defaultRaise.complete();
            return new arrow.core.Either.Right(java.lang.Boolean.valueOf(isEligible));
        } catch (arrow.core.raise.RaiseCancellationException e) {
            defaultRaise.complete();
            return new arrow.core.Either.Left(arrow.core.raise.RaiseKt.raisedOrRethrow(e, defaultRaise));
        } catch (java.lang.Throwable th) {
            defaultRaise.complete();
            throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th);
        }
    }

    public final arrow.core.Either<com.paypal.oslo.feature.merchantbanking.domain.errors.ArnRepositoryError, java.lang.Boolean> eligibilityDataResponse$merchant_banking_prodRelease(com.paypal.oslo.core.network.graphql.GraphQLData<com.paypal.oslo.feature.merchantbanking.graphql.VirtualBankAccountEligibilityQuery.Data> graphQLData) {
        com.paypal.oslo.feature.merchantbanking.graphql.VirtualBankAccountEligibilityQuery.Data data;
        com.paypal.oslo.feature.merchantbanking.graphql.VirtualBankAccountEligibilityQuery.VirtualBankAccountEligibility virtualBankAccountEligibility;
        arrow.core.raise.DefaultRaise defaultRaise = new arrow.core.raise.DefaultRaise(false);
        try {
            arrow.core.raise.DefaultRaise defaultRaise2 = defaultRaise;
            if (graphQLData == null || (data = graphQLData.getData()) == null || (virtualBankAccountEligibility = data.getVirtualBankAccountEligibility()) == null) {
                defaultRaise2.raise(new com.paypal.oslo.feature.merchantbanking.domain.errors.ArnRepositoryError.Network(new com.paypal.oslo.core.network.graphql.error.CallError.Network(new com.paypal.oslo.core.network.http.error.NetworkError.UnknownError(new java.lang.IllegalStateException("No eligibility data returned")))));
                throw new kotlin.KotlinNothingValueException();
            }
            boolean isEligible = com.paypal.oslo.feature.merchantbanking.data.repository.VirtualBankAccountExtensionsKt.isEligible(virtualBankAccountEligibility);
            defaultRaise.complete();
            return new arrow.core.Either.Right(java.lang.Boolean.valueOf(isEligible));
        } catch (arrow.core.raise.RaiseCancellationException e) {
            defaultRaise.complete();
            return new arrow.core.Either.Left(arrow.core.raise.RaiseKt.raisedOrRethrow(e, defaultRaise));
        } catch (java.lang.Throwable th) {
            defaultRaise.complete();
            throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th);
        }
    }

    public final arrow.core.Either<com.paypal.oslo.feature.merchantbanking.domain.errors.ArnRepositoryError, com.paypal.oslo.feature.merchantbanking.domain.model.AccountRoutingInfoData> errorWithData$merchant_banking_prodRelease(com.paypal.oslo.core.network.graphql.GraphQLData<com.paypal.oslo.feature.merchantbanking.graphql.VirtualBankAccountsQuery.Data> graphQLData, com.paypal.oslo.core.network.graphql.error.CallError callError) {
        com.paypal.oslo.feature.merchantbanking.domain.errors.ArnRepositoryError network;
        com.paypal.oslo.feature.merchantbanking.graphql.VirtualBankAccountsQuery.Data data;
        com.paypal.oslo.feature.merchantbanking.graphql.VirtualBankAccountsQuery.VirtualBankAccounts virtualBankAccounts;
        com.paypal.oslo.feature.merchantbanking.domain.model.AccountRoutingInfoData accountRoutingInfoData;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callError, "");
        arrow.core.raise.DefaultRaise defaultRaise = new arrow.core.raise.DefaultRaise(false);
        try {
            arrow.core.raise.DefaultRaise defaultRaise2 = defaultRaise;
            if (graphQLData == null || (data = graphQLData.getData()) == null || (virtualBankAccounts = data.getVirtualBankAccounts()) == null || (accountRoutingInfoData = com.paypal.oslo.feature.merchantbanking.data.repository.VirtualBankAccountExtensionsKt.toAccountRoutingInfoData(virtualBankAccounts)) == null) {
                if (callError instanceof com.paypal.oslo.core.network.graphql.error.CallError.Network) {
                    network = new com.paypal.oslo.feature.merchantbanking.domain.errors.ArnRepositoryError.Network((com.paypal.oslo.core.network.graphql.error.CallError.Network) callError);
                } else {
                    if (!(callError instanceof com.paypal.oslo.core.network.graphql.error.CallError.GraphQL)) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    if (com.paypal.oslo.feature.merchantbanking.data.repository.VirtualBankAccountExtensionsKt.isRiskDeniedError((com.paypal.oslo.core.network.graphql.error.GraphQLError) arrow.core.NonEmptyList.m9583getHeadimpl(((com.paypal.oslo.core.network.graphql.error.CallError.GraphQL) callError).m11659getErrors1X0FAY()))) {
                        network = com.paypal.oslo.feature.merchantbanking.domain.errors.ArnRepositoryError.RiskDenied.INSTANCE;
                    } else {
                        network = new com.paypal.oslo.feature.merchantbanking.domain.errors.ArnRepositoryError.GraphQLError((com.paypal.oslo.core.network.graphql.error.CallError.GraphQL) callError);
                    }
                }
                defaultRaise2.raise(network);
                throw new kotlin.KotlinNothingValueException();
            }
            defaultRaise.complete();
            return new arrow.core.Either.Right(accountRoutingInfoData);
        } catch (arrow.core.raise.RaiseCancellationException e) {
            defaultRaise.complete();
            return new arrow.core.Either.Left(arrow.core.raise.RaiseKt.raisedOrRethrow(e, defaultRaise));
        } catch (java.lang.Throwable th) {
            defaultRaise.complete();
            throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th);
        }
    }

    public final arrow.core.Either<com.paypal.oslo.feature.merchantbanking.domain.errors.ArnRepositoryError, com.paypal.oslo.feature.merchantbanking.domain.model.AccountRoutingInfoData> dataResponse$merchant_banking_prodRelease(com.paypal.oslo.core.network.graphql.GraphQLData<com.paypal.oslo.feature.merchantbanking.graphql.VirtualBankAccountsQuery.Data> graphQLData) {
        com.paypal.oslo.feature.merchantbanking.graphql.VirtualBankAccountsQuery.Data data;
        com.paypal.oslo.feature.merchantbanking.graphql.VirtualBankAccountsQuery.VirtualBankAccounts virtualBankAccounts;
        arrow.core.raise.DefaultRaise defaultRaise = new arrow.core.raise.DefaultRaise(false);
        try {
            arrow.core.raise.DefaultRaise defaultRaise2 = defaultRaise;
            if (graphQLData == null || (data = graphQLData.getData()) == null || (virtualBankAccounts = data.getVirtualBankAccounts()) == null) {
                defaultRaise2.raise(new com.paypal.oslo.feature.merchantbanking.domain.errors.ArnRepositoryError.Network(new com.paypal.oslo.core.network.graphql.error.CallError.Network(new com.paypal.oslo.core.network.http.error.NetworkError.UnknownError(new java.lang.IllegalStateException("No virtual bank accounts data returned")))));
                throw new kotlin.KotlinNothingValueException();
            }
            com.paypal.oslo.feature.merchantbanking.domain.model.AccountRoutingInfoData accountRoutingInfoData = com.paypal.oslo.feature.merchantbanking.data.repository.VirtualBankAccountExtensionsKt.toAccountRoutingInfoData(virtualBankAccounts);
            if (accountRoutingInfoData == null) {
                defaultRaise2.raise(com.paypal.oslo.feature.merchantbanking.domain.errors.ArnRepositoryError.EnrollmentRequired.INSTANCE);
                throw new kotlin.KotlinNothingValueException();
            }
            defaultRaise.complete();
            return new arrow.core.Either.Right(accountRoutingInfoData);
        } catch (arrow.core.raise.RaiseCancellationException e) {
            defaultRaise.complete();
            return new arrow.core.Either.Left(arrow.core.raise.RaiseKt.raisedOrRethrow(e, defaultRaise));
        } catch (java.lang.Throwable th) {
            defaultRaise.complete();
            throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th);
        }
    }
}
